package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes10.dex */
public final class ck implements ak {
    public final int a;
    public final int b;
    public final kc2 c;

    public ck(wj wjVar, nx0 nx0Var) {
        kc2 kc2Var = wjVar.b;
        this.c = kc2Var;
        kc2Var.e(12);
        int p = kc2Var.p();
        if (MimeTypes.AUDIO_RAW.equals(nx0Var.m)) {
            int b = mc3.b(nx0Var.B, nx0Var.z);
            if (p == 0 || p % b != 0) {
                ji1.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + b + ", stsz sample size: " + p);
                p = b;
            }
        }
        this.a = p == 0 ? -1 : p;
        this.b = kc2Var.p();
    }

    @Override // yads.ak
    public final int a() {
        return this.a;
    }

    @Override // yads.ak
    public final int b() {
        return this.b;
    }

    @Override // yads.ak
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.p() : i;
    }
}
