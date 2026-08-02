package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class j4f0 extends est0 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public j4f0(int i, long j, long j2) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long a(long j, ef90 ef90Var) {
        long y = ef90Var.y();
        if ((128 & y) != 0) {
            return 8589934591L & ((((y & 1) << 32) | ef90Var.A()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.est0
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return oyr.n(this.c, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return oyr.n(this.c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return oyr.n(this.c, " }", sb3);
        }
    }

    public j4f0(List list, long j, long j2) {
        this.a = 1;
        this.b = j;
        this.c = j2;
        Collections.unmodifiableList(list);
    }
}
