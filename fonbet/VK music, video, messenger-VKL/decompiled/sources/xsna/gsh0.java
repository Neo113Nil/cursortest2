package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ish0;
import xsna.wqh0;

/* compiled from: SearchFeatureResultCatalogDelegateBinding.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class gsh0 extends FunctionReferenceImpl implements izs<ish0.c, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ish0.c cVar) {
        ish0.c cVar2 = cVar;
        hsh0 hsh0Var = (hsh0) this.receiver;
        esh0 esh0Var = hsh0Var.b;
        if (cVar2 instanceof ish0.r) {
            esh0Var.e(((ish0.r) cVar2).a);
        } else if (cVar2 instanceof ish0.q) {
            esh0Var.d(((ish0.q) cVar2).a);
        } else if (cVar2 instanceof ish0.o) {
            esh0Var.f(((ish0.o) cVar2).a);
        } else if (epx.f(cVar2, ish0.m.a)) {
            esh0Var.a();
        } else if (epx.f(cVar2, ish0.b.a)) {
            esh0Var.b();
        } else if (epx.f(cVar2, ish0.e.a)) {
            esh0Var.clear();
        } else {
            if (!epx.f(cVar2, ish0.g.a)) {
                throw new NoWhenBranchMatchedException();
            }
            yqh0 c = esh0Var.c();
            if (c != null) {
                hsh0Var.c.C(new wqh0.e(c));
            }
        }
        return s3q0.a;
    }
}
