package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class nnu {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public nnu(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith(HexString.STR_0x) && !str2.startsWith("0X")) {
            z = false;
        }
        d6z.x(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnu)) {
            return false;
        }
        nnu nnuVar = (nnu) obj;
        return this.b == nnuVar.b && Double.compare(this.c, nnuVar.c) == 0 && Objects.equals(this.a, nnuVar.a) && Objects.equals(this.d, nnuVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public nnu(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }
}
