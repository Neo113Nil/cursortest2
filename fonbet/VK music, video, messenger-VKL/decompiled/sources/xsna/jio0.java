package xsna;

import android.graphics.Typeface;
import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextInfo.kt */
/* loaded from: classes4.dex */
public final class jio0 {
    public final y8g a;
    public final int b;
    public final a c;
    public final float d;
    public final int e;
    public final b f;
    public final Layout.Alignment g;
    public final ulo0 h;
    public final u9p i;

    /* compiled from: TextInfo.kt */
    public static final class a {
        public final String a;
        public final Typeface b;
        public final float c;
        public final float d;

        public a(String str, Typeface typeface, float f, float f2) {
            this.a = str;
            this.b = typeface;
            this.c = f;
            this.d = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            return "FontInfo(key=" + this.a + ", typeface=" + this.b + ", minTextSize=" + this.c + ", maxTextSize=" + this.d + ")";
        }
    }

    /* compiled from: TextInfo.kt */
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
            return Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 31, 31), 31);
        }

        public final String toString() {
            return "ShadowInfo(radius=0.0, dx=0.0, dy=0.0, color=0)";
        }
    }

    public jio0(y8g y8gVar, int i, a aVar, float f, int i2, b bVar, Layout.Alignment alignment, ulo0 ulo0Var, u9p u9pVar) {
        this.a = y8gVar;
        this.b = i;
        this.c = aVar;
        this.d = f;
        this.e = i2;
        this.f = bVar;
        this.g = alignment;
        this.h = ulo0Var;
        this.i = u9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jio0)) {
            return false;
        }
        jio0 jio0Var = (jio0) obj;
        return epx.f(this.a, jio0Var.a) && this.b == jio0Var.b && epx.f(this.c, jio0Var.c) && Float.compare(this.d, jio0Var.d) == 0 && this.e == jio0Var.e && epx.f(this.f, jio0Var.f) && this.g == jio0Var.g && epx.f(this.h, jio0Var.h) && epx.f(this.i, jio0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + shy.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, (this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextInfo(color=" + this.a + ", maxWidth=" + this.b + ", fontInfo=" + this.c + ", size=" + this.d + ", horizontalPaddings=" + this.e + ", shadowInfo=" + this.f + ", alignment=" + this.g + ", spacing=" + this.h + ", effectProvider=" + this.i + ")";
    }
}
