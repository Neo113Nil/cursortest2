package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: ConstraintLayout.kt */
/* loaded from: classes11.dex */
public final class z5j extends Lambda implements izs<tdu, s3q0> {
    final /* synthetic */ bnx0 $frame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5j(bnx0 bnx0Var) {
        super(1);
        this.$frame = bnx0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tdu tduVar) {
        tdu tduVar2 = tduVar;
        if (!Float.isNaN(this.$frame.f) || !Float.isNaN(this.$frame.g)) {
            tduVar2.Y0(f370.i(Float.isNaN(this.$frame.f) ? 0.5f : this.$frame.f, Float.isNaN(this.$frame.g) ? 0.5f : this.$frame.g));
        }
        if (!Float.isNaN(this.$frame.h)) {
            tduVar2.g(this.$frame.h);
        }
        if (!Float.isNaN(this.$frame.i)) {
            tduVar2.h(this.$frame.i);
        }
        if (!Float.isNaN(this.$frame.j)) {
            tduVar2.j(this.$frame.j);
        }
        if (!Float.isNaN(this.$frame.k)) {
            tduVar2.o(this.$frame.k);
        }
        if (!Float.isNaN(this.$frame.l)) {
            tduVar2.n(this.$frame.l);
        }
        if (!Float.isNaN(this.$frame.m)) {
            tduVar2.i(this.$frame.m);
        }
        if (!Float.isNaN(this.$frame.n) || !Float.isNaN(this.$frame.o)) {
            tduVar2.A(Float.isNaN(this.$frame.n) ? 1.0f : this.$frame.n);
            tduVar2.B(Float.isNaN(this.$frame.o) ? 1.0f : this.$frame.o);
        }
        if (!Float.isNaN(this.$frame.p)) {
            tduVar2.b(this.$frame.p);
        }
        return s3q0.a;
    }
}
