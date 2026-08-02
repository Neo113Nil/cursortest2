package xsna;

import java.util.List;

/* compiled from: VectorBackgroundData.kt */
/* loaded from: classes14.dex */
public final class ykr0 {
    public final d a;
    public final List<b> b;
    public final c c;
    public final a d;

    /* compiled from: VectorBackgroundData.kt */
    public static final class a {
        public final int a;
        public final float b;
        public final float c;

        public a(float f, float f2, int i) {
            this.a = i;
            this.b = f;
            this.c = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Blur(color=");
            sb.append(this.a);
            sb.append(", opacity=");
            sb.append(this.b);
            sb.append(", radius=");
            return xq.c(')', this.c, sb);
        }
    }

    /* compiled from: VectorBackgroundData.kt */
    public static final class b {
        public final float a;
        public final float b;
        public final int c;
        public final float d;
        public final float e;

        public b(float f, float f2, float f3, float f4, int i) {
            this.a = f;
            this.b = f2;
            this.c = i;
            this.d = f3;
            this.e = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0 && this.c == bVar.c && Float.compare(this.d, bVar.d) == 0 && Float.compare(this.e, bVar.e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, shy.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ColorEllipse(x=");
            sb.append(this.a);
            sb.append(", y=");
            sb.append(this.b);
            sb.append(", color=");
            sb.append(this.c);
            sb.append(", radiusX=");
            sb.append(this.d);
            sb.append(", radiusY=");
            return xq.c(')', this.e, sb);
        }
    }

    /* compiled from: VectorBackgroundData.kt */
    public static final class c {
        public final List<Integer> a;
        public final float b;

        public c(List<Integer> list, float f) {
            this.a = list;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && Float.compare(this.b, cVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gradient(colors=");
            sb.append(this.a);
            sb.append(", angle=");
            return xq.c(')', this.b, sb);
        }
    }

    /* compiled from: VectorBackgroundData.kt */
    public static final class d {
        public final String a;
        public final int b;
        public final int c;
        public final float d;
        public final boolean e;

        public d(String str, int i, int i2, float f, boolean z) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = f;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && Float.compare(this.d, dVar.d) == 0 && this.e == dVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Pattern(image=");
            sb.append(this.a);
            sb.append(", width=");
            sb.append(this.b);
            sb.append(", height=");
            sb.append(this.c);
            sb.append(", opacity=");
            sb.append(this.d);
            sb.append(", isOverlayMode=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    public ykr0(d dVar, List<b> list, c cVar, a aVar) {
        this.a = dVar;
        this.b = list;
        this.c = cVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykr0)) {
            return false;
        }
        ykr0 ykr0Var = (ykr0) obj;
        return epx.f(this.a, ykr0Var.a) && epx.f(this.b, ykr0Var.b) && epx.f(this.c, ykr0Var.c) && epx.f(this.d, ykr0Var.d);
    }

    public final int hashCode() {
        d dVar = this.a;
        int a2 = fw3.a((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.b);
        c cVar = this.c;
        int hashCode = (a2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "VectorBackgroundData(pattern=" + this.a + ", colorEllipses=" + this.b + ", gradient=" + this.c + ", blur=" + this.d + ')';
    }
}
