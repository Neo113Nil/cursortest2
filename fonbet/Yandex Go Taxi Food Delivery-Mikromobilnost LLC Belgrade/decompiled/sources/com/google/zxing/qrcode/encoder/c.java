package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import defpackage.aa31;
import defpackage.ji20;
import defpackage.li20;
import defpackage.qv10;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class c {
    public final ArrayList a = new ArrayList();
    public final aa31 b;
    public final /* synthetic */ d c;

    public c(d dVar, aa31 aa31Var, ji20 ji20Var) {
        int i;
        int i2;
        this.c = dVar;
        ji20 ji20Var2 = ji20Var;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (ji20Var2 == null) {
                break;
            }
            int i5 = ji20Var2.c;
            int i6 = i3 + ji20Var2.d;
            ji20 ji20Var3 = ji20Var2.e;
            int i7 = i4;
            Mode mode = ji20Var2.a;
            boolean z = (mode == Mode.BYTE && ji20Var3 == null && i5 != 0) || !(ji20Var3 == null || i5 == ji20Var3.c);
            i = z ? 1 : i7;
            if (ji20Var3 == null || ji20Var3.a != mode || z) {
                this.a.add(0, new li20(this, mode, ji20Var2.b, i5, i6));
                i2 = 0;
            } else {
                i2 = i6;
            }
            if (z) {
                this.a.add(0, new li20(this, Mode.ECI, ji20Var2.b, ji20Var2.c, 0));
            }
            i4 = i;
            ji20Var2 = ji20Var3;
            i3 = i2;
        }
        int i8 = i4;
        boolean z2 = dVar.b;
        ErrorCorrectionLevel errorCorrectionLevel = dVar.d;
        if (z2) {
            li20 li20Var = (li20) this.a.get(0);
            if (li20Var != null) {
                Mode mode2 = li20Var.a;
                Mode mode3 = Mode.ECI;
                if (mode2 != mode3 && i8 != 0) {
                    this.a.add(0, new li20(this, mode3, 0, 0, 0));
                }
            }
            this.a.add(((li20) this.a.get(0)).a == Mode.ECI ? 1 : 0, new li20(this, Mode.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i9 = aa31Var.a;
        int i10 = 26;
        int i11 = b.a[(i9 <= 9 ? MinimalEncoder$VersionSize.SMALL : i9 <= 26 ? MinimalEncoder$VersionSize.MEDIUM : MinimalEncoder$VersionSize.LARGE).ordinal()];
        if (i11 == 1) {
            i10 = 9;
        } else if (i11 != 2) {
            i = 27;
            i10 = 40;
        } else {
            i = 10;
        }
        int a = a(aa31Var);
        while (i9 < i10 && !a.d(a, aa31.c(i9), errorCorrectionLevel)) {
            i9++;
        }
        while (i9 > i && a.d(a, aa31.c(i9 - 1), errorCorrectionLevel)) {
            i9--;
        }
        this.b = aa31.c(i9);
    }

    public final int a(aa31 aa31Var) {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            li20 li20Var = (li20) it.next();
            int i2 = li20Var.d;
            Mode mode = li20Var.a;
            int b = mode.b(aa31Var);
            int i3 = b + 4;
            int i4 = b.b[mode.ordinal()];
            if (i4 == 1) {
                i3 += i2 * 13;
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int b2 = qv10.b(i2, 3, 10, i3);
                    int i5 = i2 % 3;
                    i3 = b2 + (i5 != 1 ? i5 == 2 ? 7 : 0 : 4);
                } else if (i4 == 4) {
                    i3 += li20Var.a() * 8;
                } else if (i4 == 5) {
                    i3 = b + 12;
                }
            } else {
                i3 = qv10.b(i2, 2, 11, i3) + (i2 % 2 == 1 ? 6 : 0);
            }
            i += i3;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        li20 li20Var = null;
        while (it.hasNext()) {
            li20 li20Var2 = (li20) it.next();
            if (li20Var != null) {
                sb.append(",");
            }
            sb.append(li20Var2.toString());
            li20Var = li20Var2;
        }
        return sb.toString();
    }
}
