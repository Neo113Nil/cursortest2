package xsna;

import android.net.Uri;
import java.util.UUID;

/* compiled from: VideoData.kt */
/* loaded from: classes16.dex */
public final class yds0 {
    public final Uri a;
    public final ocr b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final float i;

    public yds0(Uri uri, ocr ocrVar, int i, int i2, long j, long j2, long j3, String str, float f) {
        this.a = uri;
        this.b = ocrVar;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = f;
    }

    public static yds0 a(yds0 yds0Var, ocr ocrVar, long j, int i) {
        Uri uri = yds0Var.a;
        if ((i & 2) != 0) {
            ocrVar = yds0Var.b;
        }
        return new yds0(uri, ocrVar, yds0Var.c, yds0Var.d, yds0Var.e, (i & 32) != 0 ? yds0Var.f : 0L, (i & 64) != 0 ? yds0Var.g : j, yds0Var.h, yds0Var.i);
    }

    public final long b() {
        long j = this.g;
        return j != 0 ? j - this.f : this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yds0)) {
            return false;
        }
        yds0 yds0Var = (yds0) obj;
        return epx.f(this.a, yds0Var.a) && this.f == yds0Var.f && this.g == yds0Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + bh10.a((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoData(uri=");
        sb.append(this.a);
        sb.append(", filterData=");
        sb.append(this.b);
        sb.append(", videoWidth=");
        sb.append(this.c);
        sb.append(", videoHeight=");
        sb.append(this.d);
        sb.append(", originalDurationMs=");
        sb.append(this.e);
        sb.append(", startTimeMs=");
        sb.append(this.f);
        sb.append(", endTimeMs=");
        sb.append(this.g);
        sb.append(", uniqueId=");
        sb.append(this.h);
        sb.append(", mirror=false, speed=");
        return xq.c(')', this.i, sb);
    }

    public /* synthetic */ yds0(Uri uri, ocr ocrVar, int i, int i2, long j, long j2, long j3, int i3) {
        this(uri, ocrVar, i, i2, j, (i3 & 32) != 0 ? 0L : j2, (i3 & 64) != 0 ? 0L : j3, UUID.randomUUID().toString(), 1.0f);
    }
}
