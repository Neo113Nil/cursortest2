package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.u9p;
import xsna.y8g;

/* compiled from: BackgroundInfo.kt */
/* loaded from: classes4.dex */
public final class lw5 {
    public static final lw5 i = new lw5("empty", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 238);
    public final String a;
    public final y8g b;
    public final y8g c;
    public final float d;
    public final float e;
    public final a f;
    public final u9p g;
    public final b h;

    /* compiled from: BackgroundInfo.kt */
    public static final class a {
        public static final a e = new a(0);
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder a = bxj0.a("Padding(left=", this.a, ", top=", this.b, ", right=");
            a.append(this.c);
            a.append(", bottom=");
            a.append(this.d);
            a.append(")");
            return a.toString();
        }

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public /* synthetic */ a(int i) {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: BackgroundInfo.kt */
    public static final class b {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            if (Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 || Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 || Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
                return false;
            }
            y8g.c cVar = y8g.a.a;
            return cVar.equals(cVar);
        }

        public final int hashCode() {
            return Integer.hashCode(0) + io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 31, 31), 31);
        }

        public final String toString() {
            return "ShadowInfo(radius=0.0, dx=0.0, dy=0.0, color=" + y8g.a.a + ")";
        }
    }

    public lw5(String str, y8g y8gVar, y8g y8gVar2, float f, float f2, a aVar, u9p u9pVar, b bVar) {
        this.a = str;
        this.b = y8gVar;
        this.c = y8gVar2;
        this.d = f;
        this.e = f2;
        this.f = aVar;
        this.g = u9pVar;
        this.h = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw5)) {
            return false;
        }
        lw5 lw5Var = (lw5) obj;
        return epx.f(this.a, lw5Var.a) && epx.f(this.b, lw5Var.b) && epx.f(this.c, lw5Var.c) && Float.compare(this.d, lw5Var.d) == 0 && Float.compare(this.e, lw5Var.e) == 0 && epx.f(this.f, lw5Var.f) && epx.f(this.g, lw5Var.g) && epx.f(this.h, lw5Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BackgroundInfo(key=" + this.a + ", fillColor=" + this.b + ", strokeColor=" + this.c + ", strokeWidth=" + this.d + ", alpha=" + this.e + ", paddings=" + this.f + ", effectProvider=" + this.g + ", shadow=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lw5(String str, float f, a aVar, u9p.b bVar, int i2) {
        this(str, r2, r2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r5, r6, r13, r8);
        float f2 = (i2 & 16) != 0 ? 1.0f : f;
        a aVar2 = (i2 & 32) != 0 ? a.e : aVar;
        u9p u9pVar = (i2 & 64) != 0 ? u9p.c.a : bVar;
        b bVar2 = b.a;
        y8g.c cVar = y8g.a.a;
    }
}
