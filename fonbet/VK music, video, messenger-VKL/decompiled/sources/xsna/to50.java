package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: MyRect.kt */
/* loaded from: classes4.dex */
public final class to50 {
    public final c a;
    public final g b;
    public final e c;
    public final a d;

    /* compiled from: MyRect.kt */
    public static final class a extends f {
    }

    /* compiled from: MyRect.kt */
    public static final class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b() {
            this(r0, r0, r0, 15);
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final b a(b bVar) {
            return new b(this.a * bVar.a, this.b + bVar.b, this.c + bVar.c, 8);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0 && Float.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder a = bxj0.a("FitResult(scale=", this.a, ", diffX=", this.b, ", diffY=");
            a.append(this.c);
            a.append(", angle=");
            a.append(this.d);
            a.append(")");
            return a.toString();
        }

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public /* synthetic */ b(float f, float f2, float f3, int i) {
            this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: MyRect.kt */
    public static final class c extends f {
    }

    /* compiled from: MyRect.kt */
    public static final class d {
        public float a;
        public float b;

        public d(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Float.compare(this.a, dVar.a) == 0 && Float.compare(this.b, dVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Point(x=" + this.a + ", y=" + this.b + ")";
        }
    }

    /* compiled from: MyRect.kt */
    public static final class e extends f {
    }

    /* compiled from: MyRect.kt */
    public static abstract class f {
        public final d a;
        public final d b;

        public f(d dVar, d dVar2) {
            this.a = dVar;
            this.b = dVar2;
        }

        public final void a(float f) {
            this.a.a = f;
            this.b.a = f;
        }

        public final void b(float f) {
            this.a.b = f;
            this.b.b = f;
        }
    }

    /* compiled from: MyRect.kt */
    public static final class g extends f {
    }

    public to50(float f2, float f3, float f4, float f5) {
        d dVar = new d(f2, f3);
        d dVar2 = new d(f4, f3);
        d dVar3 = new d(f4, f5);
        d dVar4 = new d(f2, f5);
        this.a = new c(dVar, dVar4);
        this.b = new g(dVar, dVar2);
        this.c = new e(dVar2, dVar3);
        this.d = new a(dVar3, dVar4);
    }

    public final boolean a(float f2, float f3) {
        float f4 = this.a.a.a;
        float f5 = this.c.a.a;
        if (f4 >= f5) {
            return false;
        }
        float f6 = this.b.a.b;
        float f7 = this.d.a.b;
        return f6 < f7 && f2 >= f4 && f2 <= f5 && f3 >= f6 && f3 <= f7;
    }

    public final b b(d dVar, d dVar2, f fVar, f fVar2) {
        if (epx.f(fVar, this.a) || epx.f(fVar, this.c)) {
            return d() >= Math.abs(dVar2.a - dVar.a) ? e(dVar, fVar, fVar2) : f(dVar, dVar2, fVar, fVar2);
        }
        if (epx.f(fVar, this.b) || epx.f(fVar, this.d)) {
            return c() >= Math.abs(dVar2.b - dVar.b) ? e(dVar, fVar, fVar2) : f(dVar, dVar2, fVar, fVar2);
        }
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return new b(f2, f2, f2, 15);
    }

    public final float c() {
        return this.d.a.b - this.b.a.b;
    }

    public final float d() {
        return this.c.a.a - this.a.a.a;
    }

    public final b e(d dVar, f fVar, f fVar2) {
        c cVar = this.a;
        boolean f2 = epx.f(fVar, cVar);
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        e eVar = this.c;
        if (f2 || epx.f(fVar, eVar)) {
            float f4 = dVar.a - fVar.a.a;
            float d2 = d();
            fVar.a(dVar.a);
            if (epx.f(fVar2, eVar)) {
                eVar.a(dVar.a + d2);
            } else if (epx.f(fVar2, cVar)) {
                cVar.a(dVar.a - d2);
            }
            return new b(f3, f4, f3, 13);
        }
        g gVar = this.b;
        boolean f5 = epx.f(fVar, gVar);
        a aVar = this.d;
        if (!f5 && !epx.f(fVar, aVar)) {
            return new b(f3, f3, f3, 15);
        }
        float f6 = dVar.b - fVar.a.b;
        float c2 = c();
        fVar.b(dVar.b);
        if (epx.f(fVar2, aVar)) {
            aVar.b(dVar.b + c2);
        } else if (epx.f(fVar2, gVar)) {
            gVar.b(dVar.b - c2);
        }
        return new b(f3, f3, f6, 11);
    }

    public final b f(d dVar, d dVar2, f fVar, f fVar2) {
        c cVar = this.a;
        boolean f2 = epx.f(fVar, cVar);
        int i = 8;
        a aVar = this.d;
        g gVar = this.b;
        e eVar = this.c;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 || epx.f(fVar, eVar)) {
            float d2 = d();
            float abs = Math.abs(dVar2.a - dVar.a);
            float f4 = abs / d2;
            float f5 = (abs - d2) / 2.0f;
            if (epx.f(fVar, cVar)) {
                fVar.a(fVar.a.a - f5);
            } else if (epx.f(fVar, eVar)) {
                fVar.a(fVar.a.a + f5);
            }
            if (epx.f(fVar2, eVar)) {
                fVar2.a(fVar.a.a + abs);
            } else if (epx.f(fVar2, cVar)) {
                fVar2.a(fVar.a.a - abs);
            }
            float c2 = ((c() * f4) - c()) / 2.0f;
            gVar.b(gVar.a.b - c2);
            aVar.b(aVar.a.b + c2);
            b e2 = e(dVar, fVar, fVar2);
            return new b(f4 * e2.a, e2.b + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + e2.c, i);
        }
        if (!epx.f(fVar, gVar) && !epx.f(fVar, aVar)) {
            return new b(f3, f3, f3, 15);
        }
        float c3 = c();
        float abs2 = Math.abs(dVar2.b - dVar.b);
        float f6 = abs2 / c3;
        float f7 = (abs2 - c3) / 2.0f;
        if (epx.f(fVar, gVar)) {
            fVar.b(fVar.a.b - f7);
        } else if (epx.f(fVar, aVar)) {
            fVar.b(fVar.a.b + f7);
        }
        if (epx.f(fVar2, aVar)) {
            fVar2.b(fVar.a.b + abs2);
        } else if (epx.f(fVar2, gVar)) {
            fVar2.b(fVar.a.b - abs2);
        }
        float d3 = ((d() * f6) - d()) / 2.0f;
        cVar.a(cVar.a.a - d3);
        eVar.a(eVar.a.a + d3);
        b e3 = e(dVar, fVar, fVar2);
        return new b(f6 * e3.a, e3.b + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + e3.c, i);
    }
}
