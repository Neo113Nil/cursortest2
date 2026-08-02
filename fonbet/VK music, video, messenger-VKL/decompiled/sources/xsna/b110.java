package xsna;

import java.util.ArrayList;

/* compiled from: MarketItemCommentsModel.kt */
/* loaded from: classes17.dex */
public final class b110 {
    public final int a;
    public final int b;
    public final ArrayList c;
    public final Boolean d;

    public b110(int i, int i2, Boolean bool, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = arrayList;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b110)) {
            return false;
        }
        b110 b110Var = (b110) obj;
        return this.a == b110Var.a && this.b == b110Var.b && this.c.equals(b110Var.c) && epx.f(this.d, b110Var.d);
    }

    public final int hashCode() {
        int a = qr.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Boolean bool = this.d;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCommentsModel(count=");
        sb.append(this.a);
        sb.append(", newOffset=");
        sb.append(this.b);
        sb.append(", comments=");
        sb.append(this.c);
        sb.append(", canComment=");
        return tn.a(sb, this.d, ')');
    }
}
