package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class nwr {
    public final String a;
    public final long b;
    public final String c;
    public final boolean d;

    public nwr(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwr)) {
            return false;
        }
        nwr nwrVar = (nwr) obj;
        return jl40.l(this.a, nwrVar.a) && this.b == nwrVar.b && jl40.l(this.c, nwrVar.c) && this.d == nwrVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder l = x4e.l("FolderFilterCrossRefEntity(folderId=", this.a, ", organizationId=", this.b);
        uw51.x(", filterId=", this.c, ", inclusive=", l, this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
