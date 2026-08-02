package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes11.dex */
public class jy91 {
    public static final xx91 d;
    public final qx91 a;
    public final Character b;
    public volatile jy91 c;

    static {
        new dy91("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new dy91("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new jy91("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new jy91("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new xx91(new qx91("base16()", new char[]{MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public jy91(qx91 qx91Var, Character ch) {
        this.a = qx91Var;
        if (ch != null) {
            byte[] bArr = qx91Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                ny61.g(jsa1.h("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        tra1.e(0, i, bArr.length);
        while (i2 < i) {
            qx91 qx91Var = this.a;
            b(i2, Math.min(qx91Var.f, i - i2), sb, bArr);
            i2 += qx91Var.f;
        }
    }

    public final void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        tra1.e(i, i + i2, bArr.length);
        qx91 qx91Var = this.a;
        int i3 = qx91Var.f;
        int i4 = qx91Var.d;
        if (i2 > i3) {
            w511.q();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(qx91Var.b[((int) (j >>> ((i7 - i4) - i5))) & qx91Var.c]);
            i5 += i4;
        }
        if (this.b != null) {
            while (i5 < qx91Var.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String c(int i, byte[] bArr) {
        tra1.e(0, i, bArr.length);
        qx91 qx91Var = this.a;
        int i2 = qx91Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(qx91Var.e * xva1.f(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jy91) {
            jy91 jy91Var = (jy91) obj;
            if (this.a.equals(jy91Var.a) && Objects.equals(this.b, jy91Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        qx91 qx91Var = this.a;
        sb.append(qx91Var);
        if (8 % qx91Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public jy91(String str, String str2) {
        this(new qx91(str, str2.toCharArray()), (Character) '=');
    }
}
