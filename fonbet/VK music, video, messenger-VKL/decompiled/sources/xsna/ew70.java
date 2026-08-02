package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: OggPacket.java */
/* loaded from: classes12.dex */
public final class ew70 {
    public final fw70 a = new fw70();
    public final xi90 b = new xi90(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            fw70 fw70Var = this.a;
            if (i5 >= fw70Var.c) {
                break;
            }
            int[] iArr = fw70Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(qgq qgqVar) throws IOException {
        int i;
        fxc0.z(qgqVar != null);
        boolean z = this.e;
        xi90 xi90Var = this.b;
        if (z) {
            this.e = false;
            xi90Var.M(0);
        }
        while (!this.e) {
            int i2 = this.c;
            fw70 fw70Var = this.a;
            if (i2 < 0) {
                if (fw70Var.b(qgqVar, -1L) && fw70Var.a(qgqVar, true)) {
                    int i3 = fw70Var.d;
                    if ((fw70Var.a & 1) == 1 && xi90Var.c == 0) {
                        i3 += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        qgqVar.skipFully(i3);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a = a(this.c);
            int i4 = this.c + this.d;
            if (a > 0) {
                xi90Var.d(xi90Var.c + a);
                try {
                    qgqVar.readFully(xi90Var.a, xi90Var.c, a);
                    xi90Var.O(xi90Var.c + a);
                    this.e = fw70Var.f[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == fw70Var.c) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
