package yads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class zv0 extends d53 {
    public cw0 n;
    public yv0 o;

    @Override // yads.d53
    public final long a(kc2 kc2Var) {
        int i;
        int i2;
        int m;
        byte[] bArr = kc2Var.a;
        int i3 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i4 = (bArr[2] & 255) >> 4;
        if (i4 == 6 || i4 == 7) {
            kc2Var.e(kc2Var.b + 4);
            kc2Var.s();
        }
        switch (i4) {
            case 1:
                i3 = PsExtractor.AUDIO_STREAM;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i = i4 - 2;
                i2 = 576;
                i3 = i2 << i;
                break;
            case 6:
                m = kc2Var.m();
                i3 = m + 1;
                break;
            case 7:
                m = kc2Var.r();
                i3 = m + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = i4 - 8;
                i2 = 256;
                i3 = i2 << i;
                break;
        }
        kc2Var.e(0);
        return i3;
    }

    @Override // yads.d53
    public final boolean a(kc2 kc2Var, long j, b53 b53Var) {
        byte[] bArr = kc2Var.a;
        cw0 cw0Var = this.n;
        if (cw0Var == null) {
            cw0 cw0Var2 = new cw0(17, bArr);
            this.n = cw0Var2;
            b53Var.a = cw0Var2.a(Arrays.copyOfRange(bArr, 9, kc2Var.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            bw0 a = xv0.a(kc2Var);
            cw0 cw0Var3 = new cw0(cw0Var.a, cw0Var.b, cw0Var.c, cw0Var.d, cw0Var.e, cw0Var.g, cw0Var.h, cw0Var.j, a, cw0Var.l);
            this.n = cw0Var3;
            this.o = new yv0(cw0Var3, a);
            return true;
        }
        if (b != -1) {
            return true;
        }
        yv0 yv0Var = this.o;
        if (yv0Var != null) {
            yv0Var.c = j;
            b53Var.b = yv0Var;
        }
        b53Var.a.getClass();
        return false;
    }

    @Override // yads.d53
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
