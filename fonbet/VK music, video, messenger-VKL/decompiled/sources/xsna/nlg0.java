package xsna;

/* compiled from: Ripple.kt */
/* loaded from: classes11.dex */
public final class nlg0 implements guw {
    public final boolean a;
    public final long b;

    /* compiled from: Ripple.kt */
    public static final class a implements o7g {
        public a() {
        }

        @Override // xsna.o7g
        public final long a() {
            return nlg0.this.b;
        }
    }

    public nlg0(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // xsna.guw
    public final htl a(wax waxVar) {
        return new pul(waxVar, this.a, new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlg0)) {
            return false;
        }
        nlg0 nlg0Var = (nlg0) obj;
        if (this.a == nlg0Var.a && pco.b(Float.NaN, Float.NaN)) {
            return l5g.d(this.b, nlg0Var.b);
        }
        return false;
    }

    @Override // xsna.guw
    public final int hashCode() {
        int a2 = io.reactivex.rxjava3.subjects.b.a(Float.NaN, Boolean.hashCode(this.a) * 31, 961);
        int i = l5g.l;
        return Long.hashCode(this.b) + a2;
    }
}
