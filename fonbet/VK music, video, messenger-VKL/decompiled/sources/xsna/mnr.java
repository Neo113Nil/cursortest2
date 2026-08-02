package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.nio.ByteOrder;
import xsna.pnr;
import xsna.u27;

/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes12.dex */
public final class mnr extends u27 {

    /* compiled from: FlacBinarySearchSeeker.java */
    public static final class a implements u27.f {
        public final tnr a;
        public final int b;
        public final pnr.a c = new pnr.a();

        public a(tnr tnrVar, int i) {
            this.a = tnrVar;
            this.b = i;
        }

        @Override // xsna.u27.f
        public final u27.e a(qgq qgqVar, long j) throws IOException {
            long position = qgqVar.getPosition();
            long c = c(qgqVar);
            long peekPosition = qgqVar.getPeekPosition();
            qgqVar.advancePeekPosition(Math.max(6, this.a.c));
            long c2 = c(qgqVar);
            return (c > j || c2 <= j) ? c2 <= j ? new u27.e(-2, c2, qgqVar.getPeekPosition()) : new u27.e(-1, c, position) : new u27.e(0, C.TIME_UNSET, peekPosition);
        }

        public final long c(qgq qgqVar) throws IOException {
            pnr.a aVar;
            tnr tnrVar;
            int a;
            while (true) {
                long peekPosition = qgqVar.getPeekPosition();
                long length = qgqVar.getLength() - 6;
                aVar = this.c;
                tnrVar = this.a;
                if (peekPosition >= length) {
                    break;
                }
                long peekPosition2 = qgqVar.getPeekPosition();
                xi90 xi90Var = new xi90(17);
                int i = 0;
                boolean a2 = false;
                qgqVar.peekFully(xi90Var.a, 0, 2);
                char j = xi90Var.j(0, ByteOrder.BIG_ENDIAN);
                int i2 = this.b;
                if (j != i2) {
                    qgqVar.resetPeekPosition();
                    qgqVar.advancePeekPosition((int) (peekPosition2 - qgqVar.getPosition()));
                } else {
                    byte[] bArr = xi90Var.a;
                    while (i < 15 && (a = qgqVar.a(2 + i, 15 - i, bArr)) != -1) {
                        i += a;
                    }
                    xi90Var.O(i + 2);
                    qgqVar.resetPeekPosition();
                    qgqVar.advancePeekPosition((int) (peekPosition2 - qgqVar.getPosition()));
                    a2 = pnr.a(xi90Var, tnrVar, i2, aVar);
                }
                if (a2) {
                    break;
                }
                qgqVar.advancePeekPosition(1);
            }
            if (qgqVar.getPeekPosition() < qgqVar.getLength() - 6) {
                return aVar.a;
            }
            qgqVar.advancePeekPosition((int) (qgqVar.getLength() - qgqVar.getPeekPosition()));
            return tnrVar.j;
        }
    }
}
