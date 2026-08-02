package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class igo0 implements mgo0 {
    public final List a;
    public final CharSequence b;

    public igo0(CharSequence charSequence, List list) {
        this.a = list;
        this.b = charSequence;
    }

    @Override // defpackage.mgo0
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igo0)) {
            return false;
        }
        igo0 igo0Var = (igo0) obj;
        return jl40.l(this.a, igo0Var.a) && jl40.l(this.b, igo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AvailableForPurchase(packageItemModels=" + this.a + ", purchaseButtonTitle=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
