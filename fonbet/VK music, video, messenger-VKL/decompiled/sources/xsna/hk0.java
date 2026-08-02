package xsna;

import one.video.player.model.FrameSize;

/* compiled from: AdaptiveTrackSelectionConfig.kt */
/* loaded from: classes8.dex */
public final class hk0 {
    public static final hk0 e = new hk0(0);
    public final FrameSize a;
    public final FrameSize b;
    public final boolean c;
    public final FrameSize d;

    /* compiled from: AdaptiveTrackSelectionConfig.kt */
    public static final class a {
        public static hk0 a() {
            return hk0.e;
        }
    }

    public hk0() {
        this(0);
    }

    public static hk0 a(hk0 hk0Var, FrameSize frameSize, FrameSize frameSize2, boolean z, int i) {
        if ((i & 1) != 0) {
            frameSize = hk0Var.a;
        }
        if ((i & 2) != 0) {
            frameSize2 = hk0Var.b;
        }
        if ((i & 4) != 0) {
            z = hk0Var.c;
        }
        FrameSize frameSize3 = hk0Var.d;
        hk0Var.getClass();
        return new hk0(frameSize, frameSize2, z, frameSize3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0)) {
            return false;
        }
        hk0 hk0Var = (hk0) obj;
        return this.a == hk0Var.a && this.b == hk0Var.b && this.c == hk0Var.c && this.d == hk0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "AdaptiveTrackSelectionConfig(minFrameSize=" + this.a + ", maxFrameSize=" + this.b + ", adaptiveToViewport=" + this.c + ", adaptiveToViewportMinFrameSize=" + this.d + ")";
    }

    public hk0(FrameSize frameSize, FrameSize frameSize2, boolean z, FrameSize frameSize3) {
        this.a = frameSize;
        this.b = frameSize2;
        this.c = z;
        this.d = frameSize3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hk0(int i) {
        this(r0, FrameSize._4320p, false, r0);
        FrameSize.a aVar = FrameSize.Companion;
        aVar.getClass();
        FrameSize frameSize = FrameSize._144p;
        aVar.getClass();
    }
}
