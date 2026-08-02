package defpackage;

import com.google.zxing.common.CharacterSetECI;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class l6w implements man {
    public final /* synthetic */ int a = 0;
    public int[] b;
    public int c;

    public l6w(String str, Charset charset, int i) {
        int i2;
        this.c = i;
        lan lanVar = new lan(str, charset, i);
        CharsetEncoder[] charsetEncoderArr = lanVar.a;
        int i3 = 0;
        if (charsetEncoderArr.length == 1) {
            this.b = new int[str.length()];
            while (i3 < this.b.length) {
                char charAt = str.charAt(i3);
                int[] iArr = this.b;
                if (charAt == i) {
                    charAt = 1000;
                }
                iArr[i3] = charAt;
                i3++;
            }
            return;
        }
        int length = str.length();
        ii20[][] ii20VarArr = (ii20[][]) Array.newInstance((Class<?>) ii20.class, length + 1, charsetEncoderArr.length);
        c(str, lanVar, ii20VarArr, 0, null, i);
        for (int i4 = 1; i4 <= length; i4++) {
            for (int i5 = 0; i5 < charsetEncoderArr.length; i5++) {
                ii20 ii20Var = ii20VarArr[i4][i5];
                if (ii20Var != null && i4 < length) {
                    c(str, lanVar, ii20VarArr, i4, ii20Var, i);
                }
            }
            for (int i6 = 0; i6 < charsetEncoderArr.length; i6++) {
                ii20VarArr[i4 - 1][i6] = null;
            }
        }
        int i7 = -1;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < charsetEncoderArr.length; i9++) {
            ii20 ii20Var2 = ii20VarArr[length][i9];
            if (ii20Var2 != null && (i2 = ii20Var2.d) < i8) {
                i7 = i9;
                i8 = i2;
            }
        }
        if (i7 < 0) {
            ny61.r(oyr.p("Failed to encode \"", str, "\""));
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        ii20 ii20Var3 = ii20VarArr[length][i7];
        while (ii20Var3 != null) {
            ii20 ii20Var4 = ii20Var3.c;
            int i10 = ii20Var3.b;
            char c = ii20Var3.a;
            if (c == 1000) {
                arrayList.add(0, 1000);
            } else {
                byte[] bytes = ("" + c).getBytes(charsetEncoderArr[i10].charset());
                for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(bytes[length2] & 255));
                }
            }
            if ((ii20Var4 == null ? 0 : ii20Var4.b) != i10) {
                arrayList.add(0, Integer.valueOf(CharacterSetECI.a(charsetEncoderArr[i10].charset()).f() + 256));
            }
            ii20Var3 = ii20Var4;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        while (i3 < size) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
            i3++;
        }
        this.b = iArr2;
    }

    public static void c(String str, lan lanVar, ii20[][] ii20VarArr, int i, ii20 ii20Var, int i2) {
        lan lanVar2;
        ii20 ii20Var2;
        int i3;
        char charAt = str.charAt(i);
        int length = lanVar.a.length;
        int i4 = lanVar.b;
        if (i4 < 0 || !(charAt == i2 || lanVar.a(charAt, i4))) {
            i4 = 0;
        } else {
            length = i4 + 1;
        }
        int i5 = i4;
        while (i5 < length) {
            if (charAt == i2 || lanVar.a(charAt, i5)) {
                lanVar2 = lanVar;
                ii20Var2 = ii20Var;
                i3 = i2;
                ii20 ii20Var3 = new ii20(charAt, lanVar2, i5, ii20Var2, i3);
                ii20[] ii20VarArr2 = ii20VarArr[i + 1];
                ii20 ii20Var4 = ii20VarArr2[i5];
                if (ii20Var4 == null || ii20Var4.d > ii20Var3.d) {
                    ii20VarArr2[i5] = ii20Var3;
                }
            } else {
                lanVar2 = lanVar;
                ii20Var2 = ii20Var;
                i3 = i2;
            }
            i5++;
            lanVar = lanVar2;
            ii20Var = ii20Var2;
            i2 = i3;
        }
    }

    @Override // defpackage.man
    public int a(int i) {
        int[] iArr = this.b;
        if (i < 0 || i >= iArr.length) {
            ny61.m(oyr.i(i, ""));
            return 0;
        }
        if (b(i)) {
            return iArr[i] - 256;
        }
        ny61.g(oyr.j(i, "value at ", " is not an ECI but a character"));
        return 0;
    }

    @Override // defpackage.man
    public boolean b(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                int i2 = iArr[i];
                return i2 > 255 && i2 <= 999;
            }
        }
        ny61.m(oyr.i(i, ""));
        return false;
    }

    @Override // defpackage.man
    public char charAt(int i) {
        int[] iArr = this.b;
        if (i < 0 || i >= iArr.length) {
            ny61.m(oyr.i(i, ""));
            return (char) 0;
        }
        if (!b(i)) {
            return e(i) ? (char) this.c : (char) iArr[i];
        }
        ny61.g(oyr.j(i, "value at ", " is not a character but an ECI"));
        return (char) 0;
    }

    public boolean d(int i, int i2) {
        if ((i + i2) - 1 < this.b.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (!b(i + i3)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean e(int i) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                return iArr[i] == 1000;
            }
        }
        ny61.m(oyr.i(i, ""));
        return false;
    }

    public void f(int i, int i2, int i3) {
        int i4 = this.c;
        int[] iArr = this.b;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.b = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.c = i5;
    }

    public void g(int i, int i2, int i3, int i4) {
        int i5 = this.c;
        int[] iArr = this.b;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.b = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.c = i6;
    }

    public void h(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    i(i3, i4);
                }
            }
            i(i3 + 3, i2);
            h(i, i3);
            h(i3 + 6, i2);
        }
    }

    public void i(int i, int i2) {
        int[] iArr = this.b;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    @Override // defpackage.man
    public int length() {
        return this.b.length;
    }

    @Override // defpackage.man
    public CharSequence subSequence(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.b.length) {
            ny61.m(oyr.i(i, ""));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            if (b(i)) {
                ny61.g(oyr.j(i, "value at ", " is not a character but an ECI"));
                return null;
            }
            sb.append(charAt(i));
            i++;
        }
        return sb;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < this.b.length; i++) {
                    if (i > 0) {
                        sb.append(Extension.FIX_SPACE);
                    }
                    if (b(i)) {
                        sb.append("ECI(");
                        sb.append(a(i));
                        sb.append(')');
                    } else if (charAt(i) < 128) {
                        sb.append('\'');
                        sb.append(charAt(i));
                        sb.append('\'');
                    } else {
                        sb.append((int) charAt(i));
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public l6w(int i) {
        this.b = new int[i];
    }
}
