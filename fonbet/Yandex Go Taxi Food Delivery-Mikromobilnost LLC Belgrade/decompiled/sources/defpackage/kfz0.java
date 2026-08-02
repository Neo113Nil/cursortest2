package defpackage;

import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kfz0 implements mfz0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final BigDecimal f;
    public final BigDecimal g;

    public kfz0(String str, String str2, boolean z, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = bigDecimal;
        this.g = bigDecimal2;
    }

    @Override // defpackage.mfz0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfz0)) {
            return false;
        }
        kfz0 kfz0Var = (kfz0) obj;
        return jl40.l(this.a, kfz0Var.a) && jl40.l(this.b, kfz0Var.b) && this.c == kfz0Var.c && jl40.l(this.d, kfz0Var.d) && jl40.l(this.e, kfz0Var.e) && this.f.equals(kfz0Var.f) && this.g.equals(kfz0Var.g);
    }

    @Override // defpackage.mfz0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + smw0.f(this.f, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // defpackage.mfz0
    public final boolean isSelected() {
        return this.c;
    }

    public final String toString() {
        StringBuilder v = b64.v("ManualTipModel(choiceId=", this.a, ", title=", this.b, ", isSelected=");
        unr0.A(", extraSubtitle=", this.d, ", decimalValue=", v, this.c);
        v.append(this.e);
        v.append(", minTipsValue=");
        v.append(this.f);
        v.append(", maxTipsValue=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
