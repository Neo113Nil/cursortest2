package yads;

import xsna.epx;
import xsna.gzs;
import xsna.rzl;

/* loaded from: classes10.dex */
public final class a10 {
    public final gzs a;
    public final String b;
    public final int c;
    public final int d;

    public a10(g12 g12Var, String str, int i, int i2) {
        this.a = g12Var;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return epx.f(this.a, a10Var.a) && epx.f(this.b, a10Var.b) && this.c == a10Var.c && this.d == a10Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + re3.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        gzs gzsVar = this.a;
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        StringBuilder sb = new StringBuilder("CoreNativeAdImage(getBitmap=");
        sb.append(gzsVar);
        sb.append(", sizeType=");
        sb.append(str);
        sb.append(", width=");
        return rzl.a(i, i2, ", height=", ")", sb);
    }
}
