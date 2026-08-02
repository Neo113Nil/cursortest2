package xsna;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import xsna.zrv;

/* compiled from: Id3Peeker.java */
/* loaded from: classes12.dex */
public final class bsv {
    public final xi90 a = new xi90(10);

    @Nullable
    public final fi20 a(qgq qgqVar, @Nullable zrv.a aVar, int i) throws IOException {
        fi20 fi20Var = null;
        int i2 = 0;
        loop0: while (true) {
            int i3 = 0;
            do {
                int i4 = i3 % 10;
                int i5 = i4 + 10;
                xi90 xi90Var = this.a;
                if (i4 == 0 && i3 != 0) {
                    byte[] bArr = xi90Var.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i6 = i3 == 0 ? 10 : 1;
                try {
                    qgqVar.peekFully(xi90Var.a, i5 - i6, i6);
                    xi90Var.P(i4);
                    xi90Var.O(i5);
                    if (xi90Var.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + xi90Var.b + ", limit=" + xi90Var.c);
                    }
                    int F = xi90Var.F();
                    int i7 = xi90Var.b - 3;
                    xi90Var.b = i7;
                    if (F != 4801587) {
                        if (eg30.a(xi90Var.l()) != -1) {
                            break loop0;
                        }
                        if (i3 == 0) {
                            xi90Var.d(20);
                        }
                        i3++;
                    } else {
                        xi90Var.Q(6);
                        int B = xi90Var.B();
                        int i8 = B + 10;
                        if (fi20Var == null) {
                            byte[] bArr2 = new byte[i8];
                            System.arraycopy(xi90Var.a, i7, bArr2, 0, 10);
                            qgqVar.peekFully(bArr2, 10, B);
                            fi20Var = new zrv(aVar).q(i8, bArr2);
                        } else {
                            qgqVar.advancePeekPosition(B);
                        }
                        i2 += i8;
                    }
                } catch (EOFException unused) {
                }
            } while (i3 <= i);
        }
        qgqVar.resetPeekPosition();
        qgqVar.advancePeekPosition(i2);
        return fi20Var;
    }
}
