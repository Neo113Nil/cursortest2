package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jgo0 implements mgo0 {
    public final List a;

    public jgo0(List list) {
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
        return (obj instanceof jgo0) && jl40.l(this.a, ((jgo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Purchased(packageItemModels=", Extension.C_BRAKE, this.a);
    }
}
