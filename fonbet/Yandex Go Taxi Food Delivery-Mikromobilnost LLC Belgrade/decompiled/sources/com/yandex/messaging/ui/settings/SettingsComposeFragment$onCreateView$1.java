package com.yandex.messaging.ui.settings;

import android.app.Activity;
import android.content.Context;
import defpackage.fcg;
import defpackage.lt11;
import defpackage.mt11;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.settings.SettingsComposeFragment$onCreateView$1", f = "SettingsComposeFragment.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class SettingsComposeFragment$onCreateView$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ SettingsComposeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsComposeFragment$onCreateView$1(SettingsComposeFragment settingsComposeFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = settingsComposeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsComposeFragment$onCreateView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsComposeFragment$onCreateView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        noh activityComponentAsync;
        lt11 lt11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Context context = mt11.a;
            activity = this.this$0.getActivity();
            lt11 a = mt11.a(activity);
            activityComponentAsync = this.this$0.getActivityComponentAsync();
            this.L$0 = a;
            this.label = 1;
            Object k = activityComponentAsync.k(this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = k;
            lt11Var = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lt11Var = (lt11) this.L$0;
            kotlin.b.b(obj);
        }
        if (obj != null) {
            ny61.u();
            return null;
        }
        fcg fcgVar = (fcg) lt11Var;
        fcgVar.a();
        fcgVar.a();
        throw null;
    }
}
