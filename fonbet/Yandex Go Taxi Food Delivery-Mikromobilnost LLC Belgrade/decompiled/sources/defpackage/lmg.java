package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lmg implements mmg {
    public final String a;
    public final List b;

    public lmg(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmg)) {
            return false;
        }
        lmg lmgVar = (lmg) obj;
        return jl40.l(this.a, lmgVar.a) && jl40.l(this.b, lmgVar.b);
    }

    @Override // defpackage.mmg
    public final String getProductId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("Products(productId=", this.a, ", screenParamsEntity=", Extension.C_BRAKE, this.b);
    }
}
