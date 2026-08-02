package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.hz1;

/* loaded from: classes7.dex */
public final class e781 {
    public final hz1 a;
    public final String b;
    public final int c;
    public final int d;

    public e781(hz1 hz1Var, String str, int i, int i2) {
        this.a = hz1Var;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e781) {
            e781 e781Var = (e781) obj;
            if (this.a == e781Var.a && jl40.l(this.b, e781Var.b) && this.c == e781Var.c && this.d == e781Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + fia1.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreNativeAdImage(getDrawable=");
        sb.append(this.a);
        sb.append(", sizeType=");
        sb.append(this.b);
        sb.append(", width=");
        return ly3.k(this.c, this.d, ", height=", Extension.C_BRAKE, sb);
    }
}
