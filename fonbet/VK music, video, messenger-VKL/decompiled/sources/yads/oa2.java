package yads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class oa2 {
    public final pa2 a = new pa2();
    public final kc2 b = new kc2(0, new byte[OggPageHeader.MAX_PAGE_PAYLOAD]);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(ld0 ld0Var) {
        int i;
        int i2;
        int i3;
        if (this.e) {
            this.e = false;
            this.b.c(0);
        }
        while (true) {
            if (this.e) {
                return true;
            }
            if (this.c < 0) {
                if (!this.a.a(ld0Var, -1L) || !this.a.a(ld0Var, true)) {
                    break;
                }
                pa2 pa2Var = this.a;
                int i4 = pa2Var.d;
                if ((pa2Var.a & 1) == 1 && this.b.c == 0) {
                    this.d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.d;
                        pa2 pa2Var2 = this.a;
                        if (i6 >= pa2Var2.c) {
                            break;
                        }
                        int[] iArr = pa2Var2.f;
                        this.d = i6 + 1;
                        i3 = iArr[i6];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.d;
                } else {
                    i2 = 0;
                }
                try {
                    ld0Var.a(i4);
                    this.c = i2;
                } catch (EOFException unused) {
                }
            }
            int i7 = this.c;
            this.d = 0;
            int i8 = 0;
            do {
                int i9 = this.d;
                int i10 = i7 + i9;
                pa2 pa2Var3 = this.a;
                if (i10 >= pa2Var3.c) {
                    break;
                }
                int[] iArr2 = pa2Var3.f;
                this.d = i9 + 1;
                i = iArr2[i10];
                i8 += i;
            } while (i == 255);
            int i11 = this.c + this.d;
            if (i8 > 0) {
                kc2 kc2Var = this.b;
                kc2Var.a(kc2Var.c + i8);
                kc2 kc2Var2 = this.b;
                try {
                    ld0Var.a(kc2Var2.a, kc2Var2.c, i8, false);
                    kc2 kc2Var3 = this.b;
                    kc2Var3.d(kc2Var3.c + i8);
                    this.e = this.a.f[i11 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i11 == this.a.c) {
                i11 = -1;
            }
            this.c = i11;
        }
        return false;
    }

    public final void a() {
        kc2 kc2Var = this.b;
        byte[] bArr = kc2Var.a;
        if (bArr.length == 65025) {
            return;
        }
        byte[] copyOf = Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, kc2Var.c));
        int i = this.b.c;
        kc2Var.a = copyOf;
        kc2Var.c = i;
        kc2Var.b = 0;
    }
}
