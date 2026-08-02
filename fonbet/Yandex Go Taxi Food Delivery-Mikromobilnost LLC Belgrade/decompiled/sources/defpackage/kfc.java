package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class kfc {
    public static final kfc h;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        jfc jfcVar = new jfc();
        jfcVar.a = 1;
        jfcVar.b = 2;
        jfcVar.c = 3;
        h = jfcVar.a();
        jfc jfcVar2 = new jfc();
        jfcVar2.a = 1;
        jfcVar2.b = 1;
        jfcVar2.c = 2;
        jfcVar2.a();
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(2);
        tw21.Q(3);
        tw21.Q(4);
        tw21.Q(5);
    }

    public kfc(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? oyr.i(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? oyr.i(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? oyr.i(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(kfc kfcVar) {
        if (kfcVar == null) {
            return true;
        }
        int i = kfcVar.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = kfcVar.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = kfcVar.c;
        if ((i3 != -1 && i3 != 3) || kfcVar.d != null) {
            return false;
        }
        int i4 = kfcVar.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = kfcVar.e;
        return i5 == -1 || i5 == 8;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kfc.class == obj.getClass()) {
            kfc kfcVar = (kfc) obj;
            if (this.a == kfcVar.a && this.b == kfcVar.b && this.c == kfcVar.c && Arrays.equals(this.d, kfcVar.d) && this.e == kfcVar.e && this.f == kfcVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(Extension.FIX_SPACE);
        sb.append(a(this.b));
        sb.append(Extension.FIX_SPACE);
        sb.append(c(this.c));
        sb.append(Extension.FIX_SPACE);
        sb.append(this.d != null);
        sb.append(Extension.FIX_SPACE);
        int i = this.e;
        sb.append(i != -1 ? b64.e(i, "bit Luma") : "NA");
        sb.append(Extension.FIX_SPACE);
        int i2 = this.f;
        return oyr.t(sb, i2 != -1 ? b64.e(i2, "bit Chroma") : "NA", Extension.C_BRAKE);
    }
}
