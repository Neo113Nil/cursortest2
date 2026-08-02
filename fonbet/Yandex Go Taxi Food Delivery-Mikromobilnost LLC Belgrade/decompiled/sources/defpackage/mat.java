package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class mat {
    public final List a;
    public final long b;
    public final boolean c;

    public mat(boolean z, long j, List list) {
        this.a = list;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mat)) {
            return false;
        }
        mat matVar = (mat) obj;
        return this.a.equals(matVar.a) && this.b == matVar.b && this.c == matVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationWithMentionsInfo(organizations=");
        sb.append(this.a);
        sb.append(", selectedOrganizationId=");
        sb.append(this.b);
        return xra1.a(sb, ", isVisible=", this.c, Extension.C_BRAKE);
    }
}
