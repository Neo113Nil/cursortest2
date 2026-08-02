package com.yandex.go.inapp_calls.ui.fullscreenintent;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import defpackage.a60;
import defpackage.f9j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pd51;
import defpackage.qu;
import defpackage.sue0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.ui.fullscreenintent.RequestUseFullScreenIntentPresenter$goToSettingsClicked$1", f = "RequestUseFullScreenIntentPresenter.kt", l = {46, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RequestUseFullScreenIntentPresenter$goToSettingsClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestUseFullScreenIntentPresenter$goToSettingsClicked$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequestUseFullScreenIntentPresenter$goToSettingsClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestUseFullScreenIntentPresenter$goToSettingsClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b9, code lost:
    
        if (com.yandex.go.inapp_calls.ui.fullscreenintent.a.Kg(r8, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0029, code lost:
    
        if (r8.a(r7) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Intent intent = null;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.inapp_calls.interactor.permissions.a aVar = this.this$0.D;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a aVar2 = this.this$0;
        sue0 sue0Var = aVar2.x;
        Context context = (Context) aVar2.C.a;
        if (((Boolean) pd51.a.getValue()).booleanValue()) {
            intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.putExtra("extra_package_uid", Process.myUid());
            intent.putExtra("extra_pkgname", context.getPackageName());
        } else if (Build.VERSION.SDK_INT >= 34) {
            Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
            intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
            intent = intent2;
        }
        if (intent == null) {
            ((f9j0) sue0Var.b).r(new qu(9));
        } else if (intent.resolveActivity(aVar2.z.getPackageManager()) != null) {
            a60 a60Var = (a60) aVar2.A;
            a60Var.getClass();
            try {
                a60Var.e(HProv.PP_DELETE_SAVED_PASSWD, intent);
            } catch (ActivityNotFoundException unused) {
            }
        } else {
            ((f9j0) sue0Var.b).r(new qu(9));
        }
        a aVar3 = this.this$0;
        this.label = 2;
    }
}
