package xsna;

/* compiled from: VKRipple.kt */
/* loaded from: classes17.dex */
public final class mlg0 implements guw {
    public final boolean a;
    public final float b;
    public final long c;

    /* compiled from: VKRipple.kt */
    public static final class a implements o7g {
        public a() {
        }

        @Override // xsna.o7g
        public final long a() {
            return mlg0.this.c;
        }
    }

    public mlg0(long j, float f, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // xsna.guw
    public final htl a(wax waxVar) {
        return new oul(waxVar, this.a, this.b, new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlg0)) {
            return false;
        }
        mlg0 mlg0Var = (mlg0) obj;
        if (this.a == mlg0Var.a && pco.b(this.b, mlg0Var.b)) {
            return l5g.d(this.c, mlg0Var.c);
        }
        return false;
    }

    @Override // xsna.guw
    public final int hashCode() {
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = l5g.l;
        return Long.hashCode(this.c) + a2;
    }
}
