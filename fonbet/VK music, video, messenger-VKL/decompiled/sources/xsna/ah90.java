package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: MultiParagraph.kt */
/* loaded from: classes11.dex */
public final class ah90 {
    public final ya2 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public ah90(ya2 ya2Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = ya2Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final zhf0 a(zhf0 zhf0Var) {
        return zhf0Var.j((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = qko0.b;
            if (qko0.b(j, j2)) {
                return j2;
            }
        }
        int i = qko0.c;
        int i2 = (int) (j >> 32);
        int i3 = this.b;
        return jgz.c(i2 + i3, ((int) (j & 4294967295L)) + i3);
    }

    public final zhf0 c(zhf0 zhf0Var) {
        float f = -this.f;
        return zhf0Var.j((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return swe0.g(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah90)) {
            return false;
        }
        ah90 ah90Var = (ah90) obj;
        return this.a.equals(ah90Var.a) && this.b == ah90Var.b && this.c == ah90Var.c && this.d == ah90Var.d && this.e == ah90Var.e && Float.compare(this.f, ah90Var.f) == 0 && Float.compare(this.g, ah90Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + io.reactivex.rxjava3.subjects.b.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return xq.c(')', this.g, sb);
    }
}
