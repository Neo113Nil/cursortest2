package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ish0;

/* compiled from: SearchFeatureQueryViewDelegateBinding.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class yrh0 extends FunctionReferenceImpl implements izs<ish0.l, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ish0.l lVar) {
        ish0.l lVar2 = lVar;
        vrh0 vrh0Var = ((zrh0) this.receiver).b;
        if (epx.f(lVar2, ish0.h.a)) {
            vrh0Var.d0();
        } else if (epx.f(lVar2, ish0.p.a)) {
            vrh0Var.k();
        } else {
            if (!(lVar2 instanceof ish0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ish0.d) lVar2).getClass();
            vrh0Var.P1(null);
        }
        return s3q0.a;
    }
}
