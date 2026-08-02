package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j4z extends ra90 {
    public final tls a;
    public final Boolean b;
    public final jt1 c;

    public j4z(tls tlsVar, uo5 uo5Var, int i) {
        Boolean bool = Boolean.FALSE;
        uo5Var = (i & 16) != 0 ? x4c.y : uo5Var;
        this.a = tlsVar;
        this.b = bool;
        this.c = uo5Var;
    }

    @Override // defpackage.v4v
    public final String a() {
        return null;
    }

    @Override // defpackage.v4v
    public final Boolean b() {
        return this.b;
    }

    @Override // defpackage.v4v
    public final bfz0 c() {
        return null;
    }

    @Override // defpackage.ra90
    public final jt1 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4z)) {
            return false;
        }
        j4z j4zVar = (j4z) obj;
        return jl40.l(this.a, j4zVar.a) && jl40.l(this.b, j4zVar.b) && jl40.l(this.c, j4zVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        Boolean bool = this.b;
        return this.c.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 961);
    }

    public final String toString() {
        return "LocalProviderIconModel(iconProvider=" + this.a + ", contentDescription=null, monochrome=" + this.b + ", tintColor=null, contentAlignment=" + this.c + Extension.C_BRAKE;
    }
}
