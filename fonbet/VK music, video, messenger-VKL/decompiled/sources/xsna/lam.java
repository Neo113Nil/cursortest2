package xsna;

import java.util.AbstractList;
import java.util.List;

/* compiled from: DialogBackgroundModel.kt */
/* loaded from: classes2.dex */
public final class lam {
    public final String a;
    public final long b;
    public final a c;
    public final a d;
    public final boolean e;
    public final int f;

    /* compiled from: DialogBackgroundModel.kt */
    public static final class a {
        public final b a;
        public final C3243a b;

        /* compiled from: DialogBackgroundModel.kt */
        /* renamed from: xsna.lam$a$a, reason: collision with other inner class name */
        public static final class C3243a {
            public final String a;
            public final int b;
            public final int c;

            public C3243a(String str, int i, int i2) {
                this.a = str;
                this.b = i;
                this.c = i2;
            }

            public final String a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3243a)) {
                    return false;
                }
                C3243a c3243a = (C3243a) obj;
                return epx.f(this.a, c3243a.a) && this.b == c3243a.b && this.c == c3243a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DialogBackgroundShadeRaster(image=");
                sb.append(this.a);
                sb.append(", width=");
                sb.append(this.b);
                sb.append(", height=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: DialogBackgroundModel.kt */
        public static final class b {
            public final d a;
            public final c b;
            public final C3244a c;
            public final List<C3245b> d;

            /* compiled from: DialogBackgroundModel.kt */
            /* renamed from: xsna.lam$a$b$a, reason: collision with other inner class name */
            public static final class C3244a {
                public final String a;
                public final float b;
                public final int c;

                public C3244a(String str, float f, int i) {
                    this.a = str;
                    this.b = f;
                    this.c = i;
                }

                public final String a() {
                    return this.a;
                }

                public final float b() {
                    return this.b;
                }

                public final int c() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3244a)) {
                        return false;
                    }
                    C3244a c3244a = (C3244a) obj;
                    return epx.f(this.a, c3244a.a) && Float.compare(this.b, c3244a.b) == 0 && this.c == c3244a.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("DialogBackgroundShadeBlur(color=");
                    sb.append(this.a);
                    sb.append(", opacity=");
                    sb.append(this.b);
                    sb.append(", radius=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: DialogBackgroundModel.kt */
            /* renamed from: xsna.lam$a$b$b, reason: collision with other inner class name */
            public static final class C3245b {
                public final float a;
                public final float b;
                public final String c;
                public final float d;
                public final float e;

                public C3245b(float f, float f2, String str, float f3, float f4) {
                    this.a = f;
                    this.b = f2;
                    this.c = str;
                    this.d = f3;
                    this.e = f4;
                }

                public final String a() {
                    return this.c;
                }

                public final float b() {
                    return this.d;
                }

                public final float c() {
                    return this.e;
                }

                public final float d() {
                    return this.a;
                }

                public final float e() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3245b)) {
                        return false;
                    }
                    C3245b c3245b = (C3245b) obj;
                    return Float.compare(this.a, c3245b.a) == 0 && Float.compare(this.b, c3245b.b) == 0 && epx.f(this.c, c3245b.c) && Float.compare(this.d, c3245b.d) == 0 && Float.compare(this.e, c3245b.e) == 0;
                }

                public final int hashCode() {
                    return Float.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, urd0.a(io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("DialogBackgroundShadeColorEllipse(x=");
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

            /* compiled from: DialogBackgroundModel.kt */
            public static final class c {
                public final List<String> a;
                public final int b;

                public c(List<String> list, int i) {
                    this.a = list;
                    this.b = i;
                }

                public final int a() {
                    return this.b;
                }

                public final List<String> b() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && this.b == cVar.b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("DialogBackgroundShadeGradient(colors=");
                    sb.append(this.a);
                    sb.append(", angle=");
                    return vu5.b(sb, this.b, ')');
                }
            }

            /* compiled from: DialogBackgroundModel.kt */
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

                public final String a() {
                    return this.a;
                }

                public final int b() {
                    return this.c;
                }

                public final float c() {
                    return this.d;
                }

                public final int d() {
                    return this.b;
                }

                public final boolean e() {
                    return this.e;
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
                    StringBuilder sb = new StringBuilder("DialogBackgroundShadeVectorSvg(file=");
                    sb.append(this.a);
                    sb.append(", width=");
                    sb.append(this.b);
                    sb.append(", height=");
                    sb.append(this.c);
                    sb.append(", opacity=");
                    sb.append(this.d);
                    sb.append(", isOverlay=");
                    return defpackage.q0.a(sb, this.e, ')');
                }
            }

            public b(d dVar, c cVar, C3244a c3244a, AbstractList abstractList) {
                this.a = dVar;
                this.b = cVar;
                this.c = c3244a;
                this.d = abstractList;
            }

            public final C3244a a() {
                return this.c;
            }

            public final List<C3245b> b() {
                return this.d;
            }

            public final c c() {
                return this.b;
            }

            public final d d() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                d dVar = this.a;
                int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
                c cVar = this.b;
                int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
                C3244a c3244a = this.c;
                int hashCode3 = (hashCode2 + (c3244a == null ? 0 : c3244a.hashCode())) * 31;
                List<C3245b> list = this.d;
                return hashCode3 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DialogBackgroundShadeVector(svg=");
                sb.append(this.a);
                sb.append(", gradient=");
                sb.append(this.b);
                sb.append(", blur=");
                sb.append(this.c);
                sb.append(", colors=");
                return ms9.a(')', sb, this.d);
            }
        }

        public a() {
            this((C3243a) null, 3);
        }

        public final C3243a a() {
            return this.b;
        }

        public final b b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            b bVar = this.a;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            C3243a c3243a = this.b;
            return hashCode + (c3243a != null ? c3243a.hashCode() : 0);
        }

        public final String toString() {
            return "DialogBackgroundShade(vector=" + this.a + ", raster=" + this.b + ')';
        }

        public /* synthetic */ a(C3243a c3243a, int i) {
            this((b) null, (i & 2) != 0 ? null : c3243a);
        }

        public a(b bVar, C3243a c3243a) {
            this.a = bVar;
            this.b = c3243a;
        }
    }

    public lam(String str, long j, a aVar, a aVar2, boolean z, int i) {
        this.a = str;
        this.b = j;
        this.c = aVar;
        this.d = aVar2;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lam)) {
            return false;
        }
        lam lamVar = (lam) obj;
        return epx.f(this.a, lamVar.a) && this.b == lamVar.b && epx.f(this.c, lamVar.c) && epx.f(this.d, lamVar.d) && this.e == lamVar.e && this.f == lamVar.f;
    }

    public final int hashCode() {
        int a2 = bh10.a(this.a.hashCode() * 31, 31, this.b);
        a aVar = this.c;
        int hashCode = (a2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.d;
        return Integer.hashCode(this.f) + qoy.b((hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogBackgroundModel(name=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", lightThemeData=");
        sb.append(this.c);
        sb.append(", darkThemeData=");
        sb.append(this.d);
        sb.append(", isHidden=");
        sb.append(this.e);
        sb.append(", sort=");
        return vu5.b(sb, this.f, ')');
    }
}
