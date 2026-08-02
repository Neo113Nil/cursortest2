package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.u27;

/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes12.dex */
public final class osp0 extends u27 {

    /* compiled from: TsBinarySearchSeeker.java */
    public static final class a implements u27.f {
        public final txo0 a;
        public final xi90 b = new xi90();
        public final int c;

        public a(int i, txo0 txo0Var) {
            this.c = i;
            this.a = txo0Var;
        }

        @Override // xsna.u27.f
        public final u27.e a(qgq qgqVar, long j) throws IOException {
            long j2;
            long position = qgqVar.getPosition();
            int min = (int) Math.min(112800, qgqVar.getLength() - position);
            xi90 xi90Var = this.b;
            xi90Var.M(min);
            qgqVar.peekFully(xi90Var.a, 0, min);
            int i = xi90Var.c;
            long j3 = -1;
            long j4 = -1;
            long j5 = C.TIME_UNSET;
            while (true) {
                if (xi90Var.a() < 188) {
                    j2 = C.TIME_UNSET;
                    break;
                }
                byte[] bArr = xi90Var.a;
                int i2 = xi90Var.b;
                while (true) {
                    if (i2 >= i) {
                        j2 = C.TIME_UNSET;
                        break;
                    }
                    byte b = bArr[i2];
                    j2 = C.TIME_UNSET;
                    if (b == 71) {
                        break;
                    }
                    i2++;
                }
                int i3 = i2 + 188;
                if (i3 > i) {
                    break;
                }
                long n = po40.n(xi90Var, i2, this.c);
                if (n != j2) {
                    long b2 = this.a.b(n);
                    if (b2 > j) {
                        return j5 == j2 ? new u27.e(-1, b2, position) : new u27.e(0, C.TIME_UNSET, position + j4);
                    }
                    if (100000 + b2 > j) {
                        return new u27.e(0, C.TIME_UNSET, position + i2);
                    }
                    j5 = b2;
                    j4 = i2;
                }
                xi90Var.P(i3);
                j3 = i3;
            }
            return j5 != j2 ? new u27.e(-2, j5, position + j3) : u27.e.d;
        }

        @Override // xsna.u27.f
        public final void b() {
            byte[] bArr = y2r0.b;
            xi90 xi90Var = this.b;
            xi90Var.getClass();
            xi90Var.N(bArr, bArr.length);
        }
    }
}
