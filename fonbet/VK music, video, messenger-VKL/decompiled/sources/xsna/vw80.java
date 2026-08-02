package xsna;

import com.vk.dto.common.Price;

/* compiled from: Order.kt */
/* loaded from: classes18.dex */
public final class vw80 {
    public final String a;
    public final Price b;
    public final boolean c;
    public final String d;

    public vw80(String str, Price price, boolean z, String str2) {
        this.a = str;
        this.b = price;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw80)) {
            return false;
        }
        vw80 vw80Var = (vw80) obj;
        return epx.f(this.a, vw80Var.a) && epx.f(this.b, vw80Var.b) && this.c == vw80Var.c && epx.f(this.d, vw80Var.d);
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderPrice(title=");
        sb.append(this.a);
        sb.append(", price=");
        sb.append(this.b);
        sb.append(", isAccent=");
        sb.append(this.c);
        sb.append(", type=");
        return ho8.a(sb, this.d, ')');
    }
}
