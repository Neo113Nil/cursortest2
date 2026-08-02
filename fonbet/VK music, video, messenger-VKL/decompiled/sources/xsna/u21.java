package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.n3i0;
import xsna.tsp0;

/* compiled from: AdtsExtractor.java */
/* loaded from: classes12.dex */
public final class u21 implements pgq {
    public final xi90 c;
    public final wi90 d;
    public rgq e;
    public long f;
    public boolean h;
    public boolean i;
    public final v21 a = new v21(0, null, "audio/mp4a-latm", true);
    public final xi90 b = new xi90(2048);
    public long g = -1;

    public u21(int i) {
        xi90 xi90Var = new xi90(10);
        this.c = xi90Var;
        byte[] bArr = xi90Var.a;
        this.d = new wi90(bArr, bArr.length);
    }

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        this.e.getClass();
        qgqVar.getLength();
        xi90 xi90Var = this.b;
        int read = qgqVar.read(xi90Var.a, 0, 2048);
        boolean z = read == -1;
        if (!this.i) {
            this.e.f(new n3i0.b(C.TIME_UNSET));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        xi90Var.P(0);
        xi90Var.O(read);
        boolean z2 = this.h;
        v21 v21Var = this.a;
        if (!z2) {
            v21Var.u = this.f;
            this.h = true;
        }
        v21Var.a(xi90Var);
        return 0;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        int i = 0;
        while (true) {
            xi90 xi90Var = this.c;
            qgqVar.peekFully(xi90Var.a, 0, 10);
            xi90Var.P(0);
            if (xi90Var.F() != 4801587) {
                break;
            }
            xi90Var.Q(3);
            int B = xi90Var.B();
            i += B + 10;
            qgqVar.advancePeekPosition(B);
        }
        qgqVar.resetPeekPosition();
        qgqVar.advancePeekPosition(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            xi90 xi90Var2 = this.c;
            tel telVar = (tel) qgqVar;
            telVar.peekFully(xi90Var2.a, 0, 2, false);
            xi90Var2.P(0);
            if ((xi90Var2.J() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                telVar.peekFully(xi90Var2.a, 0, 4, false);
                wi90 wi90Var = this.d;
                wi90Var.m(14);
                int g = wi90Var.g(13);
                if (g <= 6) {
                    i2++;
                    telVar.f = 0;
                    telVar.b(i2, false);
                } else {
                    telVar.b(g - 6, false);
                    i4 += g;
                }
            } else {
                i2++;
                telVar.f = 0;
                telVar.b(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.e = rgqVar;
        this.a.b(rgqVar, new tsp0.c(0, 1));
        rgqVar.endTracks();
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.h = false;
        this.a.seek();
        this.f = j2;
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
