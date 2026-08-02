package xsna;

import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: VideoEncoderSettings.java */
/* loaded from: classes12.dex */
public final class cjs0 {
    public static final cjs0 l = new cjs0(-1, 1, -1, -1, 1.0f, -1, -1, -1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public cjs0(int i, int i2, int i3, int i4, float f, int i5, int i6, long j, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = i5;
        this.g = i6;
        this.h = j;
        this.i = i7;
        this.j = i8;
        this.k = i9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjs0)) {
            return false;
        }
        cjs0 cjs0Var = (cjs0) obj;
        return this.a == cjs0Var.a && this.b == cjs0Var.b && this.c == cjs0Var.c && this.d == cjs0Var.d && this.e == cjs0Var.e && this.f == cjs0Var.f && this.g == cjs0Var.g && this.h == cjs0Var.h && this.i == cjs0Var.i && this.j == cjs0Var.j && this.k == cjs0Var.k;
    }

    public final int hashCode() {
        int floatToIntBits = (((((Float.floatToIntBits(this.e) + ((((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31) + this.f) * 31) + this.g) * 31;
        long j = this.h;
        return ((((((floatToIntBits + ((int) (j ^ (j >>> 32)))) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderSettings{bitrate=");
        sb.append(this.a);
        sb.append(", bitrateMode=");
        sb.append(this.b);
        sb.append(", profile=");
        sb.append(this.c);
        sb.append(", level=");
        sb.append(this.d);
        sb.append(", iFrameIntervalSeconds=");
        sb.append(this.e);
        sb.append(", operatingRate=");
        sb.append(this.f);
        sb.append(", priority=");
        sb.append(this.g);
        sb.append(", repeatPreviousFrameIntervalUs=");
        sb.append(this.h);
        sb.append(", maxBFrames=");
        sb.append(this.i);
        sb.append(", numNonBidirectionalTemporalLayers=");
        sb.append(this.j);
        sb.append(", numBidirectionalTemporalLayers=");
        return vu5.b(sb, this.k, '}');
    }
}
