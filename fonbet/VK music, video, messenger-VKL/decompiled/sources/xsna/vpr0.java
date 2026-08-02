package xsna;

import com.vungle.ads.internal.protos.Sdk;
import xsna.qpr0;

/* compiled from: VerticalizationModeReducer.kt */
/* loaded from: classes16.dex */
public final class vpr0 extends dm50<ypr0, qpr0, xpr0> {
    @Override // xsna.dm50
    public final xpr0 c(xpr0 xpr0Var, qpr0 qpr0Var) {
        xpr0 xpr0Var2 = xpr0Var;
        qpr0 qpr0Var2 = qpr0Var;
        return qpr0Var2 instanceof qpr0.a ? xpr0.a(xpr0Var2, ((qpr0.a) qpr0Var2).b, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE) : qpr0Var2 instanceof qpr0.c ? xpr0.a(xpr0Var2, null, ((qpr0.c) qpr0Var2).b, 127) : xpr0Var2;
    }

    @Override // xsna.dm50
    public final ypr0 d() {
        return new ypr0(e(new awm0(5)), e(new b3m0(this, 10)));
    }

    @Override // xsna.dm50
    public final void h(xpr0 xpr0Var, ypr0 ypr0Var) {
        xpr0 xpr0Var2 = xpr0Var;
        ypr0 ypr0Var2 = ypr0Var;
        if (xpr0Var2.b) {
            f(ypr0Var2.a, xpr0Var2);
        } else {
            f(ypr0Var2.b, xpr0Var2);
        }
    }
}
