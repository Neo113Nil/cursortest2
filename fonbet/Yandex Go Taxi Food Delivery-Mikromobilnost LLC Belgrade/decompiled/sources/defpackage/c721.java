package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class c721 {
    public final long a;
    public final String b;
    public final String c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;

    public c721(long j, String str, String str2, Set set, Set set2, Set set3, Set set4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = set;
        this.e = set2;
        this.f = set3;
        this.g = set4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c721)) {
            return false;
        }
        c721 c721Var = (c721) obj;
        return this.a == c721Var.a && jl40.l(this.b, c721Var.b) && jl40.l(this.c, c721Var.c) && jl40.l(this.d, c721Var.d) && jl40.l(this.e, c721Var.e) && jl40.l(this.f, c721Var.f) && jl40.l(this.g, c721Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 961;
        Set set = this.d;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.e;
        int hashCode3 = (hashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f;
        int hashCode4 = (hashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set set4 = this.g;
        return hashCode4 + (set4 != null ? set4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = x4e.k("UpdateFolderParams(organizationId=", this.a, ", folderId=", this.b);
        k.append(", name=");
        k.append(this.c);
        k.append(", icon=null, includedChatIds=");
        k.append(this.d);
        k.append(", excludedChatIds=");
        k.append(this.e);
        k.append(", includedFilterIds=");
        k.append(this.f);
        k.append(", excludedFilterIds=");
        k.append(this.g);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
