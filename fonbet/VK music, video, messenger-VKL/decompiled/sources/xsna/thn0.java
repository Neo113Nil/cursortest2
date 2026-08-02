package xsna;

/* compiled from: SuperappWidgetShapes.kt */
/* loaded from: classes11.dex */
public final class thn0 {
    public static final bpn0 g = new bpn0(new xh6(12));
    public static final bpn0 h = new bpn0(new y56(8));
    public static final i i = new i(new h(24, 24, 12.0f), new h(24, 24, 4.0f), new h(24, 24, 6.0f));
    public final g a;
    public final e b;
    public final i c;
    public final h d;
    public final h e;
    public final d f;

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class a {
        public final c a;
        public final c b;
        public final b c;

        public a(c cVar, c cVar2, b bVar) {
            this.a = cVar;
            this.b = cVar2;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ButtonConfig(textPadding=" + this.a + ", iconPadding=" + this.b + ", iconConfig=" + this.c + ')';
        }
    }

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(6) + shy.a(16, Integer.hashCode(16) * 31, 31);
        }

        public final String toString() {
            return "ButtonIconConfig(width=16, height=16, marginToText=6)";
        }
    }

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class c {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public c(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonPadding(left=");
            sb.append(this.a);
            sb.append(", top=");
            sb.append(this.b);
            sb.append(", right=");
            sb.append(this.c);
            sb.append(", bottom=");
            return xq.c(')', this.d, sb);
        }
    }

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class d {
        public final a a;
        public final a b;
        public final a c;
        public final a d;

        public d(a aVar, a aVar2, a aVar3, a aVar4) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.d = aVar4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ButtonShapes(primary=" + this.a + ", secondary=" + this.b + ", tertiary=" + this.c + ", outline=" + this.d + ')';
        }
    }

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class e {
        public final h a;
        public final h b;

        public e(h hVar, h hVar2) {
            this.a = hVar;
            this.b = hVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "IconConfig(small=" + this.a + ", medium=" + this.b + ')';
        }
    }

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class f {
        public final h a;
        public final h b;
        public final h c;
        public final h d;

        public f(h hVar, h hVar2, h hVar3, h hVar4) {
            this.a = hVar;
            this.b = hVar2;
            this.c = hVar3;
            this.d = hVar4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ImageConfig(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ", extraLarge=" + this.d + ')';
        }
    }

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class g {
        public final f a;
        public final f b;
        public final f c;
        public final f d;
        public final f e;

        public g(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
            this.a = fVar;
            this.b = fVar2;
            this.c = fVar3;
            this.d = fVar4;
            this.e = fVar5;
        }
    }

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class h {
        public final int a;
        public final int b;
        public final float c;

        public h(int i, int i2, float f) {
            this.a = i;
            this.b = i2;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b && Float.compare(this.c, hVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageSize(width=");
            sb.append(this.a);
            sb.append(", height=");
            sb.append(this.b);
            sb.append(", cornerRadius=");
            return xq.c(')', this.c, sb);
        }
    }

    /* compiled from: SuperappWidgetShapes.kt */
    public static final class i {
        public final h a;
        public final h b;
        public final h c;

        public i(h hVar, h hVar2, h hVar3) {
            this.a = hVar;
            this.b = hVar2;
            this.c = hVar3;
        }
    }

    public thn0(g gVar, e eVar, i iVar, h hVar, h hVar2, d dVar) {
        this.a = gVar;
        this.b = eVar;
        this.c = iVar;
        this.d = hVar;
        this.e = hVar2;
        this.f = dVar;
    }
}
