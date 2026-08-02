package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bj01 {
    public final ury a;
    public final Text b;
    public final Text c;
    public final zbv d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ bj01(ury uryVar, Text text, Text text2, zbv zbvVar, Integer num, boolean z, int i) {
        this(uryVar, text, text2, zbvVar, num, true, true, (i & 128) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj01)) {
            return false;
        }
        bj01 bj01Var = (bj01) obj;
        return jl40.l(this.a, bj01Var.a) && jl40.l(this.b, bj01Var.b) && jl40.l(this.c, bj01Var.c) && jl40.l(this.d, bj01Var.d) && jl40.l(this.e, bj01Var.e) && this.f == bj01Var.f && this.g == bj01Var.g && this.h == bj01Var.h;
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        int hashCode = (this.d.hashCode() + ((c + (text == null ? 0 : text.hashCode())) * 31)) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.h) + unr0.e(unr0.e((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferListViewItem(data=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subTitle=");
        sb.append(this.c);
        sb.append(", startIcon=");
        sb.append(this.d);
        sb.append(", endIcon=");
        sb.append(this.e);
        sb.append(", enabled=");
        sb.append(this.f);
        sb.append(", clickable=");
        return smw0.k(", shimmerStarted=", Extension.C_BRAKE, sb, this.g, this.h);
    }

    public bj01(ury uryVar, Text text, Text text2, zbv zbvVar, Integer num, boolean z, boolean z2, boolean z3) {
        this.a = uryVar;
        this.b = text;
        this.c = text2;
        this.d = zbvVar;
        this.e = num;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }
}
