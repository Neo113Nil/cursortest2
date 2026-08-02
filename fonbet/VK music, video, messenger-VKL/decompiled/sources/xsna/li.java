package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import xsna.n3i0;
import xsna.tsp0;

/* compiled from: Ac3Extractor.java */
/* loaded from: classes12.dex */
public final class li implements pgq {
    public final mi a = new mi(MimeTypes.AUDIO_AC3);
    public final xi90 b = new xi90(2786);
    public boolean c;

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        xi90 xi90Var = this.b;
        int read = qgqVar.read(xi90Var.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xi90Var.P(0);
        xi90Var.O(read);
        boolean z = this.c;
        mi miVar = this.a;
        if (!z) {
            miVar.n = 0L;
            this.c = true;
        }
        miVar.a(xi90Var);
        return 0;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        tel telVar;
        int a;
        xi90 xi90Var = new xi90(10);
        int i = 0;
        while (true) {
            telVar = (tel) qgqVar;
            telVar.peekFully(xi90Var.a, 0, 10, false);
            xi90Var.P(0);
            if (xi90Var.F() != 4801587) {
                break;
            }
            xi90Var.Q(3);
            int B = xi90Var.B();
            i += B + 10;
            telVar.b(B, false);
        }
        telVar.f = 0;
        telVar.b(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            telVar.peekFully(xi90Var.a, 0, 6, false);
            xi90Var.P(0);
            if (xi90Var.J() != 2935) {
                telVar.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                telVar.b(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = xi90Var.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    a = ni.a((b & 192) >> 6, b & CharsetEncoder.DEFAULT_REPLACEMENT);
                }
                if (a == -1) {
                    break;
                }
                telVar.b(a - 6, false);
            }
        }
        return false;
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
