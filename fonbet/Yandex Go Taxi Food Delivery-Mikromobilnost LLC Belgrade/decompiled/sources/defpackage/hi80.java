package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hi80 {
    public final List a;
    public final nj4 b;

    public hi80(List list, nj4 nj4Var) {
        this.a = list;
        this.b = nj4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi80)) {
            return false;
        }
        hi80 hi80Var = (hi80) obj;
        return jl40.l(this.a, hi80Var.a) && jl40.l(this.b, hi80Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nj4 nj4Var = this.b;
        return hashCode + (nj4Var == null ? 0 : nj4Var.hashCode());
    }

    public final String toString() {
        return "OrganizationGallery(galleryItems=" + this.a + ", badge=" + this.b + Extension.C_BRAKE;
    }
}
