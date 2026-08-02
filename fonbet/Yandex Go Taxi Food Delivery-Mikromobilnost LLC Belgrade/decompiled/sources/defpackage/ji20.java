package defpackage;

import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.encoder.b;
import com.google.zxing.qrcode.encoder.d;

/* loaded from: classes11.dex */
public final class ji20 {
    public final Mode a;
    public final int b;
    public final int c;
    public final int d;
    public final ji20 e;
    public final int f;

    public ji20(d dVar, Mode mode, int i, int i2, int i3, ji20 ji20Var, aa31 aa31Var) {
        this.a = mode;
        this.b = i;
        Mode mode2 = Mode.BYTE;
        int i4 = (mode == mode2 || ji20Var == null) ? i2 : ji20Var.c;
        this.c = i4;
        this.d = i3;
        this.e = ji20Var;
        boolean z = false;
        int i5 = ji20Var != null ? ji20Var.f : 0;
        if ((mode == mode2 && ji20Var == null && i4 != 0) || (ji20Var != null && i4 != ji20Var.c)) {
            z = true;
        }
        i5 = (ji20Var == null || mode != ji20Var.a || z) ? i5 + mode.b(aa31Var) + 4 : i5;
        int i6 = b.b[mode.ordinal()];
        if (i6 == 1) {
            i5 += 13;
        } else if (i6 == 2) {
            i5 += i3 == 1 ? 6 : 11;
        } else if (i6 == 3) {
            i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        } else if (i6 == 4) {
            i5 += dVar.a.substring(i, i3 + i).getBytes(dVar.c.a[i2].charset()).length * 8;
            if (z) {
                i5 += 12;
            }
        }
        this.f = i5;
    }
}
