package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.n3i0;

/* compiled from: SingleSampleSeekMap.java */
/* loaded from: classes12.dex */
public final class wvj0 implements n3i0 {
    @Override // xsna.n3i0
    public final long getDurationUs() {
        return C.TIME_UNSET;
    }

    @Override // xsna.n3i0
    public final n3i0.a getSeekPoints(long j) {
        p3i0 p3i0Var = new p3i0(j, 0L);
        return new n3i0.a(p3i0Var, p3i0Var);
    }

    @Override // xsna.n3i0
    public final boolean isSeekable() {
        return true;
    }
}
