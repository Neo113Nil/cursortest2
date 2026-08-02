package xsna;

import android.util.Size;

/* compiled from: VideoMetricsCalculationResult.kt */
/* loaded from: classes3.dex */
public final class qts0 {
    public final float a;
    public final float b;
    public final Size c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public qts0(float f, float f2, Size size, int i, int i2, int i3, int i4, int i5) {
        this.a = f;
        this.b = f2;
        this.c = size;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qts0)) {
            return false;
        }
        qts0 qts0Var = (qts0) obj;
        return Float.compare(this.a, qts0Var.a) == 0 && Float.compare(this.b, qts0Var.b) == 0 && epx.f(this.c, qts0Var.c) && this.d == qts0Var.d && this.e == qts0Var.e && this.f == qts0Var.f && this.g == qts0Var.g && this.h == qts0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, (this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMetricsCalculationResult(ssimMetric=");
        sb.append(this.a);
        sb.append(", psnrMetric=");
        sb.append(this.b);
        sb.append(", comparedVideosSize=");
        sb.append(this.c);
        sb.append(", comparedDurationMs=");
        sb.append(this.d);
        sb.append(", inputVideoFPS=");
        sb.append(this.e);
        sb.append(", inputVideoRotation=");
        sb.append(this.f);
        sb.append(", outputVideoFPS=");
        sb.append(this.g);
        sb.append(", outputVideoRotation=");
        return vu5.b(sb, this.h, ')');
    }
}
