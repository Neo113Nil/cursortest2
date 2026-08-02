package xsna;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: ColorInfo.java */
/* loaded from: classes12.dex */
public final class m6g {
    public static final m6g h = new m6g(1, 2, 3, -1, -1, null);
    public static final m6g i = new m6g(1, 1, 2, -1, -1, null);
    public final int a;
    public final int b;
    public final int c;

    @Nullable
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    /* compiled from: ColorInfo.java */
    public static final class a {
        public int a;
        public int b;
        public int c;

        @Nullable
        public byte[] d;
        public int e;
        public int f;
    }

    static {
        cq.h(0, 1, 2, 3, 4);
        y2r0.L(5);
    }

    public m6g(int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String b(int i2) {
        return i2 != -1 ? i2 != 1 ? i2 != 2 ? lhg.a(i2, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String c(int i2) {
        return i2 != -1 ? i2 != 6 ? i2 != 1 ? i2 != 2 ? lhg.a(i2, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static int d(int i2) {
        if (i2 == 1) {
            return 8;
        }
        if (i2 == 2) {
            return 13;
        }
        if (i2 == 6) {
            return 16;
        }
        if (i2 != 7) {
            return i2 != 10 ? 1 : 4;
        }
        return 18;
    }

    public static String e(int i2) {
        return i2 != -1 ? i2 != 10 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 6 ? i2 != 7 ? lhg.a(i2, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean g(@Nullable m6g m6gVar) {
        if (m6gVar == null) {
            return true;
        }
        int i2 = m6gVar.a;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = m6gVar.b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = m6gVar.c;
        if ((i4 != -1 && i4 != 3) || m6gVar.d != null) {
            return false;
        }
        int i5 = m6gVar.f;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = m6gVar.e;
        return i6 == -1 || i6 == 8;
    }

    public static boolean h(@Nullable m6g m6gVar) {
        if (m6gVar == null) {
            return false;
        }
        int i2 = m6gVar.c;
        return i2 == 7 || i2 == 6;
    }

    public static int i(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int j(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m6g.class == obj.getClass()) {
            m6g m6gVar = (m6g) obj;
            if (this.a == m6gVar.a && this.b == m6gVar.b && this.c == m6gVar.c && Arrays.equals(this.d, m6gVar.d) && this.e == m6gVar.e && this.f == m6gVar.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(c(this.a));
        sb.append(", ");
        sb.append(b(this.b));
        sb.append(", ");
        sb.append(e(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        int i2 = this.e;
        sb.append(i2 != -1 ? l6g.a(i2, "bit Luma") : "NA");
        sb.append(", ");
        int i3 = this.f;
        return i5s.a(sb, i3 != -1 ? l6g.a(i3, "bit Chroma") : "NA", ")");
    }
}
