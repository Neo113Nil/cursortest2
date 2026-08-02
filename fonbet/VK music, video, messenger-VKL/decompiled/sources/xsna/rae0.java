package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.u27;

/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes12.dex */
public final class rae0 extends u27 {

    /* compiled from: PsBinarySearchSeeker.java */
    public static final class a implements u27.f {
        public final txo0 a;
        public final xi90 b = new xi90();

        public a(txo0 txo0Var) {
            this.a = txo0Var;
        }

        @Override // xsna.u27.f
        public final u27.e a(qgq qgqVar, long j) throws IOException {
            long position = qgqVar.getPosition();
            int min = (int) Math.min(20000L, qgqVar.getLength() - position);
            xi90 xi90Var = this.b;
            xi90Var.M(min);
            qgqVar.peekFully(xi90Var.a, 0, min);
            int i = -1;
            int i2 = -1;
            long j2 = -9223372036854775807L;
            while (xi90Var.a() >= 4) {
                if (rae0.d(xi90Var.b, xi90Var.a) != 442) {
                    xi90Var.Q(1);
                } else {
                    xi90Var.Q(4);
                    long c = sae0.c(xi90Var);
                    if (c != C.TIME_UNSET) {
                        long b = this.a.b(c);
                        if (b > j) {
                            return j2 == C.TIME_UNSET ? new u27.e(-1, b, position) : new u27.e(0, C.TIME_UNSET, position + i2);
                        }
                        if (b + 100000 > j) {
                            return new u27.e(0, C.TIME_UNSET, position + xi90Var.b);
                        }
                        j2 = b;
                        i2 = xi90Var.b;
                    }
                    int i3 = xi90Var.c;
                    if (xi90Var.a() >= 10) {
                        xi90Var.Q(9);
                        int C = xi90Var.C() & 7;
                        if (xi90Var.a() >= C) {
                            xi90Var.Q(C);
                            if (xi90Var.a() >= 4) {
                                if (rae0.d(xi90Var.b, xi90Var.a) == 443) {
                                    xi90Var.Q(4);
                                    int J = xi90Var.J();
                                    if (xi90Var.a() < J) {
                                        xi90Var.P(i3);
                                    } else {
                                        xi90Var.Q(J);
                                    }
                                }
                                while (true) {
                                    if (xi90Var.a() < 4) {
                                        break;
                                    }
                                    int d = rae0.d(xi90Var.b, xi90Var.a);
                                    if (d == 442 || d == 441 || (d >>> 8) != 1) {
                                        break;
                                    }
                                    xi90Var.Q(4);
                                    if (xi90Var.a() < 2) {
                                        xi90Var.P(i3);
                                        break;
                                    }
                                    xi90Var.P(Math.min(xi90Var.c, xi90Var.b + xi90Var.J()));
                                }
                            } else {
                                xi90Var.P(i3);
                            }
                        } else {
                            xi90Var.P(i3);
                        }
                    } else {
                        xi90Var.P(i3);
                    }
                    i = xi90Var.b;
                }
            }
            return j2 != C.TIME_UNSET ? new u27.e(-2, j2, position + i) : u27.e.d;
        }

        @Override // xsna.u27.f
        public final void b() {
            byte[] bArr = y2r0.b;
            xi90 xi90Var = this.b;
            xi90Var.getClass();
            xi90Var.N(bArr, bArr.length);
        }
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
