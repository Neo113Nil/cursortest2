package xsna;

/* compiled from: GLColorGradingTextures.kt */
/* loaded from: classes4.dex */
public final class o1t {
    public final f2t a;
    public final f2t b;

    /* compiled from: GLColorGradingTextures.kt */
    public static final class a {
        public final j4p a;
        public final j4p b;

        public a(j4p j4pVar, j4p j4pVar2) {
            this.a = j4pVar;
            this.b = j4pVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.c.hashCode() + (this.a.c.hashCode() * 31);
        }

        public final String toString() {
            return "Config(warmNegativeLutTextureLink=" + this.a + ", warmPositiveLutTextureLink=" + this.b + ")";
        }
    }

    public o1t(f2t f2tVar, f2t f2tVar2) {
        this.a = f2tVar;
        this.b = f2tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1t)) {
            return false;
        }
        o1t o1tVar = (o1t) obj;
        return epx.f(this.a, o1tVar.a) && epx.f(this.b, o1tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GLColorGradingTextures(warmNegativeLut=" + this.a + ", warmPositiveLut=" + this.b + ")";
    }
}
