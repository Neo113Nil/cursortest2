package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: TimeSignalCommand.java */
/* loaded from: classes12.dex */
public final class ivo0 extends clk0 {
    public final long a;
    public final long b;

    public ivo0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long d(long j, xi90 xi90Var) {
        long C = xi90Var.C();
        return (128 & C) != 0 ? 8589934591L & ((((C & 1) << 32) | xi90Var.E()) + j) : C.TIME_UNSET;
    }

    @Override // xsna.clk0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return efz.b(this.b, " }", sb);
    }
}
