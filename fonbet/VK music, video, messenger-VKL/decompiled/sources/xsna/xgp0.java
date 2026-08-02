package xsna;

import com.ironsource.V2;
import one.video.player.model.FrameSize;

/* compiled from: TrackSelectionConfig.kt */
/* loaded from: classes8.dex */
public final class xgp0 {
    public static final xgp0 j = new xgp0(0);
    public final FrameSize a;
    public final FrameSize b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;

    public xgp0() {
        this(0);
    }

    public static xgp0 a(xgp0 xgp0Var, long j2, long j3, long j4, int i, int i2, float f, int i3) {
        FrameSize frameSize = xgp0Var.a;
        FrameSize frameSize2 = xgp0Var.b;
        long j5 = (i3 & 4) != 0 ? xgp0Var.c : j2;
        long j6 = (i3 & 8) != 0 ? xgp0Var.d : j3;
        long j7 = (i3 & 16) != 0 ? xgp0Var.e : j4;
        int i4 = (i3 & 32) != 0 ? xgp0Var.f : i;
        int i5 = (i3 & 64) != 0 ? xgp0Var.g : i2;
        float f2 = (i3 & 128) != 0 ? xgp0Var.h : 0.6f;
        float f3 = (i3 & 256) != 0 ? xgp0Var.i : f;
        xgp0Var.getClass();
        return new xgp0(frameSize, frameSize2, j5, j6, j7, i4, i5, f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgp0)) {
            return false;
        }
        xgp0 xgp0Var = (xgp0) obj;
        return this.a == xgp0Var.a && this.b == xgp0Var.b && this.c == xgp0Var.c && this.d == xgp0Var.d && this.e == xgp0Var.e && this.f == xgp0Var.f && this.g == xgp0Var.g && Float.compare(this.h, xgp0Var.h) == 0 && Float.compare(this.i, xgp0Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + io.reactivex.rxjava3.subjects.b.a(this.h, shy.a(this.g, shy.a(this.f, bh10.a(bh10.a(bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackSelectionConfig(minFrameSize=");
        sb.append(this.a);
        sb.append(", maxFrameSize=");
        sb.append(this.b);
        sb.append(", minDurationForQualityIncreaseMs=");
        sb.append(this.c);
        tj0.d(sb, ", maxDurationForQualityDecreaseMs=", this.d, ", minDurationToRetainAfterDiscardMs=");
        sb.append(this.e);
        sb.append(", maxWidthToDiscard=");
        sb.append(this.f);
        sb.append(", maxHeightToDiscard=");
        sb.append(this.g);
        sb.append(", bandwidthFraction=");
        sb.append(this.h);
        sb.append(", bufferedFractionToLiveEdgeForQualityIncrease=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public xgp0(FrameSize frameSize, FrameSize frameSize2, long j2, long j3, long j4, int i, int i2, float f, float f2) {
        this.a = frameSize;
        this.b = frameSize2;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i;
        this.g = i2;
        this.h = f;
        this.i = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xgp0(int i) {
        this(r1, FrameSize._4320p, 10000L, V2.h, V2.h, 1279, 719, 0.7f, 0.75f);
        FrameSize.a aVar = FrameSize.Companion;
        aVar.getClass();
        FrameSize frameSize = FrameSize._144p;
        aVar.getClass();
    }
}
