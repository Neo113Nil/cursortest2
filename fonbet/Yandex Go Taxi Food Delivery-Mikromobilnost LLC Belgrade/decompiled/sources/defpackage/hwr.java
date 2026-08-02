package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hwr {
    public final String a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final Set f;
    public final Set g;

    public hwr(String str, String str2, long j, int i, int i2, Set set, Set set2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = set;
        this.g = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwr)) {
            return false;
        }
        hwr hwrVar = (hwr) obj;
        return jl40.l(this.a, hwrVar.a) && jl40.l(this.b, hwrVar.b) && this.c == hwrVar.c && this.d == hwrVar.d && this.e == hwrVar.e && this.f.equals(hwrVar.f) && this.g.equals(hwrVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + g8e.e(this.f, oyr.b(this.e, oyr.b(this.d, qv10.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("FolderEntity(id=", this.a, ", name=", this.b, ", organizationId=");
        vfc.y(v, this.c, ", sortOrder=", this.d);
        v.append(", folderIcon=");
        v.append(this.e);
        v.append(", includedChatIds=");
        v.append(this.f);
        v.append(", excludedChatIds=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
