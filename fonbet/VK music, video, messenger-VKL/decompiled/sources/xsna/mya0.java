package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PlaybackSessionStat.kt */
/* loaded from: classes3.dex */
public final class mya0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final ArrayList l;
    public final int m;
    public final int n;
    public final List<yx4> o;

    public mya0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, ArrayList arrayList, int i12, int i13, List list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = arrayList;
        this.m = i12;
        this.n = i13;
        this.o = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mya0)) {
            return false;
        }
        mya0 mya0Var = (mya0) obj;
        return this.a == mya0Var.a && this.b == mya0Var.b && this.c == mya0Var.c && this.d == mya0Var.d && this.e == mya0Var.e && this.f == mya0Var.f && this.g == mya0Var.g && this.h == mya0Var.h && this.i == mya0Var.i && this.j == mya0Var.j && this.k == mya0Var.k && this.l.equals(mya0Var.l) && this.m == mya0Var.m && this.n == mya0Var.n && epx.f(this.o, mya0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + shy.a(this.n, shy.a(this.m, qr.a(this.l, shy.a(this.k, shy.a(this.j, shy.a(this.i, shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackSessionStat(initTTFMs=");
        sb.append(this.a);
        sb.append(", seekTTFMs=");
        sb.append(this.b);
        sb.append(", seekTTFSigmaMs=");
        sb.append(this.c);
        sb.append(", seekTTFMaxMs=");
        sb.append(this.d);
        sb.append(", framePrepareScoreAvg=");
        sb.append(this.e);
        sb.append(", framePrepareScoreWithRenderAvg=");
        sb.append(this.f);
        sb.append(", framePrepareScoreSigma=");
        sb.append(this.g);
        sb.append(", framePrepareScoreMaxAvg=");
        sb.append(this.h);
        sb.append(", framePrepareScoreWithRenderMaxAvg=");
        sb.append(this.i);
        sb.append(", updateModelAvgTimeMs=");
        sb.append(this.j);
        sb.append(", parallelDecodersInitFallback=");
        sb.append(this.k);
        sb.append(", playedVideoFormats=");
        sb.append(this.l);
        sb.append(", lastVideoFramePreparingTimeMs=");
        sb.append(this.m);
        sb.append(", lastAudioDataPreparingTimeMs=");
        sb.append(this.n);
        sb.append(", audioDecoderBufferStat=");
        return ms9.a(')', sb, this.o);
    }
}
