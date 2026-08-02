package xsna;

/* compiled from: ClipsDraftFilterHsl.kt */
/* loaded from: classes17.dex */
public final class tsd {
    public static final a i = new a(0.5f, 0.5f, 0.5f);
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;

    /* compiled from: ClipsDraftFilterHsl.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;

        public a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(hue=");
            sb.append(this.a);
            sb.append(", saturation=");
            sb.append(this.b);
            sb.append(", brightness=");
            return xq.c(')', this.c, sb);
        }
    }

    public tsd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsd)) {
            return false;
        }
        tsd tsdVar = (tsd) obj;
        return epx.f(this.a, tsdVar.a) && epx.f(this.b, tsdVar.b) && epx.f(this.c, tsdVar.c) && epx.f(this.d, tsdVar.d) && epx.f(this.e, tsdVar.e) && epx.f(this.f, tsdVar.f) && epx.f(this.g, tsdVar.g) && epx.f(this.h, tsdVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClipsDraftFilterHsl(red=" + this.a + ", orange=" + this.b + ", yellow=" + this.c + ", green=" + this.d + ", cyan=" + this.e + ", blue=" + this.f + ", purple=" + this.g + ", magenta=" + this.h + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ tsd(int i2) {
        this(r1, r1, r1, r1, r1, r1, r1, r1);
        a aVar = i;
    }

    public tsd(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.g = aVar7;
        this.h = aVar8;
    }
}
