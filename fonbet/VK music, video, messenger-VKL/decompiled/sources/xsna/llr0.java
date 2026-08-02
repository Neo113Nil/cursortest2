package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import xsna.er9;

/* compiled from: VectorPainter.kt */
/* loaded from: classes11.dex */
public final class llr0 extends lg90 {
    public final wh50 g;
    public final wh50 h;
    public final alr0 i;
    public bvi j;
    public final wh50 k;
    public float l;
    public d6g m;

    /* compiled from: VectorPainter.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            llr0 llr0Var = llr0.this;
            s3q0 s3q0Var = s3q0.a;
            ((zak0) llr0Var.k).setValue(s3q0Var);
            return s3q0Var;
        }
    }

    public llr0() {
        this(0);
    }

    @Override // xsna.lg90
    public final boolean a(float f) {
        this.l = f;
        return true;
    }

    @Override // xsna.lg90
    public final boolean b(d6g d6gVar) {
        this.m = d6gVar;
        return true;
    }

    @Override // xsna.lg90
    public final long i() {
        return ((mxj0) ((zak0) this.g).getValue()).a;
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        d6g d6gVar = this.m;
        alr0 alr0Var = this.i;
        if (d6gVar == null) {
            d6gVar = (d6g) ((zak0) alr0Var.g).getValue();
        }
        if (((Boolean) ((zak0) this.h).getValue()).booleanValue() && oioVar.getLayoutDirection() == LayoutDirection.Rtl) {
            long n1 = oioVar.n1();
            er9.b a0 = oioVar.a0();
            long d = a0.d();
            a0.a().e();
            try {
                a0.a.i(n1, -1.0f, 1.0f);
                alr0Var.e(oioVar, this.l, d6gVar);
            } finally {
                nq.b(a0, d);
            }
        } else {
            alr0Var.e(oioVar, this.l, d6gVar);
        }
        ((zak0) this.k).getValue();
        s3q0 s3q0Var = s3q0.a;
    }

    public /* synthetic */ llr0(int i) {
        this(new nju());
    }

    public llr0(nju njuVar) {
        this.g = androidx.compose.runtime.k.b(new mxj0(0L));
        this.h = androidx.compose.runtime.k.b(Boolean.FALSE);
        alr0 alr0Var = new alr0(njuVar);
        alr0Var.f = new a();
        this.i = alr0Var;
        this.k = androidx.compose.runtime.k.a(s3q0.a, w65.e);
        this.l = 1.0f;
    }
}
