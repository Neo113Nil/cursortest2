package xsna;

import com.vk.toggle.features.VideoFeatures;

/* compiled from: MaxBufferSizeSegmentsToLoad.kt */
/* loaded from: classes3.dex */
public final class bo10 implements qo10 {
    public int b;
    public final g5i0 c = new g5i0();
    public final ru5 d = com.vk.toggle.d.u.b();
    public final bpn0 e = new bpn0(new com.vk.movika.sdk.base.ui.v(22));

    public bo10(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r10 > r1.a) goto L27;
     */
    @Override // xsna.qo10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(long j, long j2, long j3, er10 er10Var) {
        int i = 1;
        ru5 ru5Var = this.d;
        if (ru5Var == null || !ru5Var.d) {
            if (((Boolean) this.e.getValue()).booleanValue()) {
                f8s0 b = com.vk.toggle.d.j.b();
                if (b == null) {
                    f8s0.i.getClass();
                    b = f8s0.j;
                }
            }
            if (j3 > 0) {
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SEGMENTS_COUNT_FIX;
                videoFeatures.getClass();
                long max = Math.max(com.vk.toggle.b.A.a(videoFeatures) ? 1L : 0L, this.b - (j2 - j));
                i = (int) Math.ceil((max >= 5000 ? 5000.0d : max * 1.0d) / j3);
            }
        }
        boolean z = er10Var instanceof cms0;
        g5i0 g5i0Var = this.c;
        if (z) {
            g5i0Var.a = i;
            return i;
        }
        if (er10Var instanceof so4) {
            g5i0Var.b = i;
        }
        return i;
    }

    @Override // xsna.qo10
    public final g5i0 h() {
        return this.c;
    }
}
