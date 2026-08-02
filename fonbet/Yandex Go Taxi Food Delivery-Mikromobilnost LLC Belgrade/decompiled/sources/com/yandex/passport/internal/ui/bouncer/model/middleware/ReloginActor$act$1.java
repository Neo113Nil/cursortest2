package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/w;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "currentState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/w;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.ReloginActor$act$1", f = "ReloginActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReloginActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReloginActor$act$1(k0 k0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = k0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReloginActor$act$1 reloginActor$act$1 = new ReloginActor$act$1(this.this$0, (Continuation) obj3);
        reloginActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.w) obj;
        reloginActor$act$1.L$1 = (s1) obj2;
        return reloginActor$act$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String loginHint;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.ui.bouncer.model.w wVar = (com.yandex.passport.internal.ui.bouncer.model.w) this.L$0;
        s1 s1Var = (s1) this.L$1;
        ModernAccount e = this.this$0.a.a().e(wVar.a);
        k0 k0Var = this.this$0;
        PassportAccountType accountType = e != null ? e.getAccountType() : null;
        k0Var.getClass();
        if (accountType == PassportAccountType.PHONISH || accountType == PassportAccountType.SOCIAL || accountType == PassportAccountType.MAILISH) {
            this.this$0.getClass();
            LoginProperties loginProperties = s1Var.c;
            return loginProperties != null ? new com.yandex.passport.internal.ui.bouncer.model.p(new w1(loginProperties, true, null, e, true, null, 100)) : new com.yandex.passport.internal.ui.bouncer.model.o("ReloginActor", "No loginProperties in current state", null);
        }
        k0 k0Var2 = this.this$0;
        k0Var2.getClass();
        com.yandex.passport.internal.ui.bouncer.model.g1 g1Var = s1Var.d;
        if (g1Var == null) {
            return new com.yandex.passport.internal.ui.bouncer.model.o("ReloginActor", "No bouncer parameters in current state", null);
        }
        LoginProperties loginProperties2 = g1Var.a;
        if (e == null || (loginHint = e.getNativeDefaultEmail()) == null) {
            String displayLogin = e != null ? e.getDisplayLogin() : null;
            loginHint = displayLogin == null ? loginProperties2.getLoginHint() : displayLogin;
        }
        return new com.yandex.passport.internal.ui.bouncer.model.j0(new SlothParams(new com.yandex.passport.sloth.data.x(loginHint, wVar.a, loginProperties2.getVisualProperties().isReloginEditable(), com.yandex.passport.internal.properties.u.i(loginProperties2)), com.yandex.passport.internal.util.p.u(loginProperties2.getFilter().getPrimaryEnvironment()), null, com.yandex.passport.internal.properties.u.J(loginProperties2.getWebAmProperties(), ((Boolean) k0Var2.b.b(com.yandex.passport.internal.flags.q.z)).booleanValue()), 4, null));
    }
}
