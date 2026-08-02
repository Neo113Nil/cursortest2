package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jjf {
    public final String a;
    public final long b;
    public final String c;
    public final int d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final Set h;

    public jjf(String str, long j, String str2, int i, Set set, Set set2, Set set3, Set set4) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = i;
        this.e = set;
        this.f = set2;
        this.g = set3;
        this.h = set4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjf)) {
            return false;
        }
        jjf jjfVar = (jjf) obj;
        return jl40.l(this.a, jjfVar.a) && this.b == jjfVar.b && jl40.l(this.c, jjfVar.c) && this.d == jjfVar.d && jl40.l(this.e, jjfVar.e) && jl40.l(this.f, jjfVar.f) && jl40.l(this.g, jjfVar.g) && jl40.l(this.h, jjfVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + g8e.e(this.g, g8e.e(this.f, g8e.e(this.e, oyr.b(this.d, unr0.b(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("CustomFolder(folderId=", this.a, ", organizationId=", this.b);
        l.append(", name=");
        l.append(this.c);
        l.append(", sortOrder=");
        l.append(this.d);
        l.append(", includedChatIds=");
        l.append(this.e);
        l.append(", excludedChatIds=");
        l.append(this.f);
        l.append(", includedFilterIds=");
        l.append(this.g);
        l.append(", excludedFilterIds=");
        l.append(this.h);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
