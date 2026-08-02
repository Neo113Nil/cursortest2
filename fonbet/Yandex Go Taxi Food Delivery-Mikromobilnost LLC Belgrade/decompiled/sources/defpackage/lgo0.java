package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lgo0 implements mgo0 {
    public final List a;

    public lgo0(List list) {
        this.a = list;
    }

    @Override // defpackage.mgo0
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgo0) && jl40.l(this.a, ((lgo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("UnavailableForPurchase(packageItemModels=", Extension.C_BRAKE, this.a);
    }
}
