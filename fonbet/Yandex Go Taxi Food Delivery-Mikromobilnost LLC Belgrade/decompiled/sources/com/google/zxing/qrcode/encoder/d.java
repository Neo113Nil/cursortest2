package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import defpackage.aa31;
import defpackage.ji20;
import defpackage.lan;
import defpackage.oyr;
import defpackage.yci0;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes11.dex */
public final class d {
    public final String a;
    public final boolean b;
    public final lan c;
    public final ErrorCorrectionLevel d;

    public d(String str, Charset charset, boolean z, ErrorCorrectionLevel errorCorrectionLevel) {
        this.a = str;
        this.b = z;
        this.c = new lan(str, charset, -1);
        this.d = errorCorrectionLevel;
    }

    public static void a(ji20[][][] ji20VarArr, int i, ji20 ji20Var) {
        ji20[] ji20VarArr2 = ji20VarArr[i + ji20Var.d][ji20Var.c];
        Mode mode = ji20Var.a;
        char c = 0;
        if (mode != null) {
            int i2 = b.b[mode.ordinal()];
            char c2 = 1;
            if (i2 != 1) {
                c = 2;
                if (i2 != 2) {
                    c2 = 3;
                    if (i2 != 3) {
                        if (i2 != 4) {
                            yci0.k(mode, "Illegal mode ");
                            return;
                        }
                    }
                }
                c = c2;
            }
        }
        ji20 ji20Var2 = ji20VarArr2[c];
        if (ji20Var2 == null || ji20Var2.f > ji20Var.f) {
            ji20VarArr2[c] = ji20Var;
        }
    }

    public static boolean c(Mode mode, char c) {
        int i = b.b[mode.ordinal()];
        if (i == 1) {
            return a.c(String.valueOf(c));
        }
        if (i == 2) {
            if ((c < '`' ? a.a[c] : -1) == -1) {
                return false;
            }
        } else if (i != 3) {
            if (i != 4) {
                return false;
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static aa31 e(MinimalEncoder$VersionSize minimalEncoder$VersionSize) {
        int i = b.a[minimalEncoder$VersionSize.ordinal()];
        return i != 1 ? i != 2 ? aa31.c(40) : aa31.c(26) : aa31.c(9);
    }

    public final void b(aa31 aa31Var, ji20[][][] ji20VarArr, int i, ji20 ji20Var) {
        int i2;
        lan lanVar = this.c;
        int length = lanVar.a.length;
        int i3 = lanVar.b;
        String str = this.a;
        if (i3 < 0 || !lanVar.a(str.charAt(i), i3)) {
            i3 = 0;
        } else {
            length = i3 + 1;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            if (lanVar.a(str.charAt(i), i5)) {
                a(ji20VarArr, i, new ji20(this, Mode.BYTE, i, i5, 1, ji20Var, aa31Var));
            }
        }
        Mode mode = Mode.KANJI;
        if (c(mode, str.charAt(i))) {
            a(ji20VarArr, i, new ji20(this, mode, i, 0, 1, ji20Var, aa31Var));
        }
        int length2 = str.length();
        Mode mode2 = Mode.ALPHANUMERIC;
        int i6 = 2;
        if (c(mode2, str.charAt(i))) {
            int i7 = i + 1;
            a(ji20VarArr, i, new ji20(this, mode2, i, 0, (i7 >= length2 || !c(mode2, str.charAt(i7))) ? 1 : 2, ji20Var, aa31Var));
        }
        Mode mode3 = Mode.NUMERIC;
        if (c(mode3, str.charAt(i))) {
            int i8 = i + 1;
            if (i8 >= length2 || !c(mode3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length2 && c(mode3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            a(ji20VarArr, i, new ji20(this, mode3, i, 0, i2, ji20Var, aa31Var));
        }
    }

    public final c d(aa31 aa31Var) {
        int i;
        String str = this.a;
        int length = str.length();
        lan lanVar = this.c;
        CharsetEncoder[] charsetEncoderArr = lanVar.a;
        CharsetEncoder[] charsetEncoderArr2 = lanVar.a;
        ji20[][][] ji20VarArr = (ji20[][][]) Array.newInstance((Class<?>) ji20.class, length + 1, charsetEncoderArr.length, 4);
        b(aa31Var, ji20VarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr2.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    ji20 ji20Var = ji20VarArr[i2][i3][i4];
                    if (ji20Var != null && i2 < length) {
                        b(aa31Var, ji20VarArr, i2, ji20Var);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr2.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                ji20 ji20Var2 = ji20VarArr[length][i8][i9];
                if (ji20Var2 != null && (i = ji20Var2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new c(this, aa31Var, ji20VarArr[length][i5][i7]);
        }
        throw new WriterException(oyr.p("Internal error: failed to encode \"", str, "\""));
    }
}
