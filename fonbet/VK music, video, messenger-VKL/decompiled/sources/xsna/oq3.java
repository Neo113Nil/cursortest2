package xsna;

/* compiled from: ArtistSliderCard.kt */
/* loaded from: classes16.dex */
public final class oq3 {
    public final String a;
    public final a b;

    /* compiled from: ArtistSliderCard.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final float b;
        public final float c;
        public final float d;

        public a(long j, float f, float f2, float f3) {
            this.a = j;
            this.b = f;
            this.c = f2;
            this.d = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return uco.a(this.a, aVar.a) && pco.b(this.b, aVar.b) && pco.b(this.c, aVar.c) && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BubbleConfig(size=");
            sb.append((Object) uco.d(this.a));
            sb.append(", topPadding=");
            oq.f(this.b, ", startPadding=", sb);
            oq.f(this.c, ", rotation=", sb);
            return xq.c(')', this.d, sb);
        }
    }

    public oq3(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq3)) {
            return false;
        }
        oq3 oq3Var = (oq3) obj;
        return epx.f(this.a, oq3Var.a) && epx.f(this.b, oq3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistBubbleViewState(url=" + this.a + ", config=" + this.b + ')';
    }
}
