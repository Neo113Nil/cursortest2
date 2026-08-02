package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bry {
    public final ary a;
    public final Text.Constant b;
    public final Text c;
    public final zbv d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public bry(ary aryVar, Text.Constant constant, Text.Constant constant2, zbv zbvVar, Integer num, boolean z, boolean z2, boolean z3) {
        this.a = aryVar;
        this.b = constant;
        this.c = constant2;
        this.d = zbvVar;
        this.e = num;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bry)) {
            return false;
        }
        bry bryVar = (bry) obj;
        return jl40.l(this.a, bryVar.a) && this.b.equals(bryVar.b) && jl40.l(this.c, bryVar.c) && this.d.equals(bryVar.d) && jl40.l(this.e, bryVar.e) && this.f == bryVar.f && this.g == bryVar.g && this.h == bryVar.h;
    }

    public final int hashCode() {
        int d = xvz.d(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        int hashCode = (this.d.hashCode() + ((d + (text == null ? 0 : text.hashCode())) * 31)) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.h) + unr0.e(unr0.e((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListContentViewItem(data=");
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
}
