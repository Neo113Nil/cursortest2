package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gam0 {
    public final MoneyEntity a;
    public final ColorModel b;
    public final ColorModel c;
    public final String d;
    public final ColorModel e;

    public gam0(MoneyEntity moneyEntity, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, String str) {
        this.a = moneyEntity;
        this.b = colorModel;
        this.c = colorModel2;
        this.d = str;
        this.e = colorModel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gam0)) {
            return false;
        }
        gam0 gam0Var = (gam0) obj;
        return this.a.equals(gam0Var.a) && this.b.equals(gam0Var.b) && this.c.equals(gam0Var.c) && jl40.l(this.d, gam0Var.d) && this.e.equals(gam0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(vfc.d(this.c, vfc.d(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Description(amount=");
        sb.append(this.a);
        sb.append(", amountTextColor=");
        sb.append(this.b);
        sb.append(", amountBackgroundColor=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", descriptionTextColor=");
        return n.o(sb, this.e, Extension.C_BRAKE);
    }
}
