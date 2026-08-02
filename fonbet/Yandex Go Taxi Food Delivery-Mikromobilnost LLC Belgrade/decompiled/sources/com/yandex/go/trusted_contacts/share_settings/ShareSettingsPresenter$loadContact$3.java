package com.yandex.go.trusted_contacts.share_settings;

import android.content.Context;
import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import defpackage.avj0;
import defpackage.ej1;
import defpackage.elr0;
import defpackage.glr0;
import defpackage.hst;
import defpackage.jst;
import defpackage.kcz0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.olr0;
import defpackage.pgk0;
import defpackage.tbg;
import defpackage.w030;
import defpackage.wg11;
import defpackage.xby;
import defpackage.xvf0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lxlr0;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.share_settings.ShareSettingsPresenter$loadContact$3", f = "ShareSettingsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ShareSettingsPresenter$loadContact$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSettingsPresenter$loadContact$3(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ShareSettingsPresenter$loadContact$3 shareSettingsPresenter$loadContact$3 = new ShareSettingsPresenter$loadContact$3(this.this$0, (Continuation) obj3);
        shareSettingsPresenter$loadContact$3.L$0 = (Throwable) obj2;
        zy11 zy11Var = zy11.a;
        shareSettingsPresenter$loadContact$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String str = null;
        hst hstVar = jst.e;
        if (th != null) {
            str = th.getMessage();
        }
        if (str == null) {
            str = "";
        }
        xby.l(hstVar, "TRUSTED_CONTACTS_ERROR:SHARED_CONTACT_LOADING_ERROR", null, th, str, 2);
        a aVar = this.this$0;
        pgk0 pgk0Var = aVar.D;
        avj0 avj0Var = (avj0) aVar.E;
        wg11 wg11Var = new wg11(avj0Var.h(kyh0.error_occurred), avj0Var.h(kyh0.unknown_error_description), avj0Var.h(kyh0.try_again), ErrorScreenAction.TRY_AGAIN);
        olr0 olr0Var = new olr0(this.this$0, 1);
        glr0 glr0Var = (glr0) pgk0Var.b;
        kcz0 kcz0Var = glr0Var.F.a;
        glr0Var.z(new ej1((Context) ((tbg) kcz0Var.a).get(), (w030) ((xvf0) kcz0Var.b).get(), wg11Var, 21), new elr0(0, olr0Var));
        return zy11.a;
    }
}
