package xsna;

/* compiled from: Ripple.kt */
/* loaded from: classes11.dex */
public final class llg0 implements guw {
    public final boolean a;
    public final float b;
    public final long c;

    /* compiled from: Ripple.kt */
    public static final class a implements o7g {
        public a() {
        }

        @Override // xsna.o7g
        public final long a() {
            return llg0.this.c;
        }
    }

    public llg0(long j, float f, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // xsna.guw
    public final htl a(wax waxVar) {
        return new nul(waxVar, this.a, this.b, new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llg0)) {
            return false;
        }
        llg0 llg0Var = (llg0) obj;
        if (this.a == llg0Var.a && pco.b(this.b, llg0Var.b)) {
            return l5g.d(this.c, llg0Var.c);
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
