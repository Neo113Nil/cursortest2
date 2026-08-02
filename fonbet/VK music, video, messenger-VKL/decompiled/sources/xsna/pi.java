package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.n3i0;
import xsna.tsp0;

/* compiled from: Ac4Extractor.java */
/* loaded from: classes12.dex */
public final class pi implements pgq {
    public final qi a = new qi(null, 0, "audio/ac4");
    public final xi90 b = new xi90(16384);
    public boolean c;

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        xi90 xi90Var = this.b;
        int read = qgqVar.read(xi90Var.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        xi90Var.P(0);
        xi90Var.O(read);
        boolean z = this.c;
        qi qiVar = this.a;
        if (!z) {
            qiVar.n = 0L;
            this.c = true;
        }
        qiVar.a(xi90Var);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(qgq qgqVar) throws IOException {
        tel telVar;
        int i;
        xi90 xi90Var = new xi90(10);
        int i2 = 0;
        while (true) {
            telVar = (tel) qgqVar;
            telVar.peekFully(xi90Var.a, 0, 10, false);
            xi90Var.P(0);
            if (xi90Var.F() != 4801587) {
                break;
            }
            xi90Var.Q(3);
            int B = xi90Var.B();
            i2 += B + 10;
            telVar.b(B, false);
        }
        telVar.f = 0;
        telVar.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            telVar.peekFully(xi90Var.a, 0, 7, false);
            xi90Var.P(0);
            int J = xi90Var.J();
            if (J == 44096 || J == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = xi90Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (J == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                telVar.b(i - 7, false);
            } else {
                telVar.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                telVar.b(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.a.b(rgqVar, new tsp0.c(0, 1));
        rgqVar.endTracks();
        rgqVar.f(new n3i0.b(C.TIME_UNSET));
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.c = false;
        this.a.seek();
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
