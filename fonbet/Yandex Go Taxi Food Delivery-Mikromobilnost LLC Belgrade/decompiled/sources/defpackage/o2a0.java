package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class o2a0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2a0 b;

    public /* synthetic */ o2a0(r2a0 r2a0Var, int i) {
        this.a = i;
        this.b = r2a0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object failure;
        Object b;
        switch (this.a) {
            case 0:
                PaymentKitConfig paymentKitConfig = (PaymentKitConfig) obj;
                if (paymentKitConfig != null) {
                    r2a0 r2a0Var = this.b;
                    String str = paymentKitConfig.getFlags().get("bottomSheetFullscreenEnabled");
                    if (str == null) {
                        failure = Boolean.FALSE;
                    } else {
                        try {
                            rbx rbxVar = sbx.d;
                            rbxVar.getClass();
                            b = rbxVar.b(z96.a, str);
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (b == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        failure = (Boolean) b;
                        Object obj2 = Boolean.FALSE;
                        if (failure instanceof Result.Failure) {
                            failure = obj2;
                        }
                    }
                    if (((Boolean) failure).booleanValue()) {
                        r2a0Var.e();
                    }
                }
                return zy11.a;
            default:
                r2a0 r2a0Var2 = this.b;
                if (!jl40.l((c0p) obj, c0p.a)) {
                    w511.b();
                    return null;
                }
                ((a) r2a0Var2.d().b).a(new h3a0());
                s2a0 V = ((f5g) r2a0Var2.a()).V();
                q3a0 a = ((f5g) r2a0Var2.a()).V().a();
                V.c = a;
                V.a.g(a);
                return zy11.a;
        }
    }
}
