package xsna;

/* compiled from: VkCheckoutResult.kt */
/* loaded from: classes6.dex */
public final class hku0 extends iku0 {
    public final String b;
    public final a c;

    /* compiled from: VkCheckoutResult.kt */
    public static final class a {
        public final gku0 a;

        public a(gku0 gku0Var) {
            this.a = gku0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VkCheckoutError(reason=" + this.a + ')';
        }
    }

    public hku0(String str, a aVar) {
        super(str);
        this.b = str;
        this.c = aVar;
    }

    @Override // xsna.iku0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hku0)) {
            return false;
        }
        hku0 hku0Var = (hku0) obj;
        return epx.f(this.b, hku0Var.b) && epx.f(this.c, hku0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "VkCheckoutFailed(orderId=" + this.b + ", error=" + this.c + ')';
    }
}
