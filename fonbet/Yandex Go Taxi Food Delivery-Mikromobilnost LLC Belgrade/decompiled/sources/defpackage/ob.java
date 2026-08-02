package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ob extends n351 {
    public final ldc c;
    public final String d;
    public final ldc e;
    public final String f;
    public final ldc g;
    public final v4v h;
    public final qa91 i;
    public final String j;

    public ob(ldc ldcVar, String str, ldc ldcVar2, String str2, ldc ldcVar3, lvi0 lvi0Var, qa91 qa91Var, String str3) {
        super("accent-button-key", false, 14);
        this.c = ldcVar;
        this.d = str;
        this.e = ldcVar2;
        this.f = str2;
        this.g = ldcVar3;
        this.h = lvi0Var;
        this.i = qa91Var;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return jl40.l(this.c, obVar.c) && jl40.l(this.d, obVar.d) && jl40.l(this.e, obVar.e) && jl40.l(this.f, obVar.f) && jl40.l(this.g, obVar.g) && jl40.l(this.h, obVar.h) && this.i.equals(obVar.i) && jl40.l(this.j, obVar.j);
    }

    public final int hashCode() {
        ldc ldcVar = this.c;
        int b = unr0.b((ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31, 31, this.d);
        ldc ldcVar2 = this.e;
        int hashCode = (b + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ldc ldcVar3 = this.g;
        int hashCode3 = (hashCode2 + (ldcVar3 == null ? 0 : Long.hashCode(ldcVar3.a))) * 31;
        v4v v4vVar = this.h;
        int hashCode4 = (this.i.hashCode() + ((hashCode3 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31)) * 31;
        String str2 = this.j;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AccentButtonModel(backgroundColor=" + this.c + ", title=" + this.d + ", titleColor=" + this.e + ", subtitle=" + this.f + ", subtitleColor=" + this.g + ", icon=" + this.h + ", action=" + this.i + ", metricaLabel=" + this.j + Extension.C_BRAKE;
    }
}
