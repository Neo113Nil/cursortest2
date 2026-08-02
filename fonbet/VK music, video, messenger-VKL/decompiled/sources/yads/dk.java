package yads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes10.dex */
public final class dk implements ak {
    public final kc2 a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public dk(wj wjVar) {
        kc2 kc2Var = wjVar.b;
        this.a = kc2Var;
        kc2Var.e(12);
        this.c = kc2Var.p() & 255;
        this.b = kc2Var.p();
    }

    @Override // yads.ak
    public final int a() {
        return -1;
    }

    @Override // yads.ak
    public final int b() {
        return this.b;
    }

    @Override // yads.ak
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.m();
        }
        if (i == 16) {
            return this.a.r();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int m = this.a.m();
        this.e = m;
        return (m & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }
}
