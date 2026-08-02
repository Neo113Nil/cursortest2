package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.m5m0;

/* compiled from: StoryLinkDelegate.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class o5m0 extends FunctionReferenceImpl implements izs<m5m0.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(m5m0.a aVar) {
        m5m0.a aVar2 = aVar;
        p5m0 p5m0Var = (p5m0) this.receiver;
        dw20 dw20Var = p5m0Var.e;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        p5m0Var.e = null;
        r5m0 b = p5m0Var.d.b(aVar2.a, aVar2.b, null, p5m0Var.b.t0(), aVar2.c);
        if (b != null) {
            p5m0Var.c.f(new q5m0(b));
        }
        return s3q0.a;
    }
}
