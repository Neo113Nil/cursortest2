package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nhg {
    public final jo4 a;
    public final jo4 b;
    public final jo4 c;
    public final ColorModel d;
    public final ColorModel e;

    public nhg(jo4 jo4Var, jo4 jo4Var2, jo4 jo4Var3, ColorModel colorModel, ColorModel colorModel2) {
        this.a = jo4Var;
        this.b = jo4Var2;
        this.c = jo4Var3;
        this.d = colorModel;
        this.e = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhg)) {
            return false;
        }
        nhg nhgVar = (nhg) obj;
        return this.a.equals(nhgVar.a) && this.b.equals(nhgVar.b) && jl40.l(this.c, nhgVar.c) && this.d.equals(nhgVar.d) && this.e.equals(nhgVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        jo4 jo4Var = this.c;
        return this.e.hashCode() + vfc.d(this.d, (hashCode + (jo4Var == null ? 0 : jo4Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DashboardBalanceEntity(title=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", balanceColor=");
        sb.append(this.d);
        sb.append(", titleColor=");
        return n.o(sb, this.e, Extension.C_BRAKE);
    }
}
