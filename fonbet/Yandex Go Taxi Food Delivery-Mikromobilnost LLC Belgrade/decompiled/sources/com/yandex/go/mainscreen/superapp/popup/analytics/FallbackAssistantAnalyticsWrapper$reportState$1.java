package com.yandex.go.mainscreen.superapp.popup.analytics;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.e3w0;
import defpackage.evu0;
import defpackage.f3w0;
import defpackage.g3w0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.rx2;
import defpackage.tig0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4e;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.popup.analytics.FallbackAssistantAnalyticsWrapper$reportState$1", f = "FallbackAssistantAnalyticsWrapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class FallbackAssistantAnalyticsWrapper$reportState$1 extends SuspendLambda implements wls {
    final /* synthetic */ g3w0 $state;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackAssistantAnalyticsWrapper$reportState$1(a aVar, g3w0 g3w0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$state = g3w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FallbackAssistantAnalyticsWrapper$reportState$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FallbackAssistantAnalyticsWrapper$reportState$1 fallbackAssistantAnalyticsWrapper$reportState$1 = (FallbackAssistantAnalyticsWrapper$reportState$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        fallbackAssistantAnalyticsWrapper$reportState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e3w0 e3w0Var;
        e3w0 e3w0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        g3w0 g3w0Var = aVar.d;
        g3w0 g3w0Var2 = this.$state;
        aVar.d = g3w0Var2;
        boolean z = g3w0Var instanceof f3w0;
        f3w0 f3w0Var = g3w0Var2 instanceof f3w0 ? (f3w0) g3w0Var2 : null;
        boolean z2 = false;
        boolean z3 = f3w0Var != null;
        boolean z4 = f3w0Var != null ? f3w0Var.d : false;
        boolean b = (f3w0Var == null || (e3w0Var2 = f3w0Var.e) == null) ? false : e3w0Var2.b();
        if (f3w0Var != null && (e3w0Var = f3w0Var.f) != null) {
            z2 = e3w0Var.b();
        }
        String str = BackendConfig.Restrictions.ENABLED;
        if (z3 && !z) {
            tig0 tig0Var = this.this$0.a;
            String reason = ((f3w0) this.$state).g.getReason();
            rx2 rx2Var = (rx2) tig0Var.b;
            if (z4) {
                str = "shimmering";
            }
            String str2 = evu0.J(reason) ? null : reason;
            HashMap p = x4e.p("reload_button_state", str);
            oo31.q(b, p, "is_taxi_button_available", z2, "is_taxi_call_button_available");
            if (str2 != null) {
                p.put(CRLReasonCodeExtension.REASON, str2);
            }
            rx2Var.a.a("SuperApp.FallbackAssistant.Shown", p, 1, new HashMap());
        } else if (z3 && z) {
            rx2 rx2Var2 = (rx2) this.this$0.a.b;
            if (z4) {
                str = "shimmering";
            }
            HashMap p2 = x4e.p("reload_button_state", str);
            p2.put("is_taxi_button_available", Boolean.valueOf(b));
            p2.put("is_taxi_call_button_available", Boolean.valueOf(z2));
            rx2Var2.a.a("SuperApp.FallbackAssistant.ChangeState", p2, 1, new HashMap());
        } else if (!z3 && z) {
            f3w0 f3w0Var2 = (f3w0) g3w0Var;
            boolean z5 = f3w0Var2.d;
            boolean b2 = f3w0Var2.e.b();
            boolean b3 = f3w0Var2.f.b();
            rx2 rx2Var3 = (rx2) this.this$0.a.b;
            if (z5) {
                str = "shimmering";
            }
            HashMap p3 = x4e.p("reload_button_state", str);
            p3.put("is_taxi_button_available", Boolean.valueOf(b2));
            p3.put("is_taxi_call_button_available", Boolean.valueOf(b3));
            rx2Var3.a.a("SuperApp.FallbackAssistant.Dismiss", p3, 1, new HashMap());
        }
        return zy11.a;
    }
}
