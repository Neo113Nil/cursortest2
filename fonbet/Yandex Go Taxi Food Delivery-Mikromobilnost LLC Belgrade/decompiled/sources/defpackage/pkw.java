package defpackage;

/* loaded from: classes14.dex */
public final class pkw {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final okw e;
    public final okw f;
    public final okw g;

    public pkw(String str, String str2, boolean z, boolean z2, okw okwVar, okw okwVar2, okw okwVar3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = okwVar;
        this.f = okwVar2;
        this.g = okwVar3;
    }

    public static pkw a(pkw pkwVar, boolean z, boolean z2, okw okwVar, okw okwVar2, okw okwVar3, int i) {
        String str = pkwVar.a;
        String str2 = pkwVar.b;
        if ((i & 4) != 0) {
            z = pkwVar.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = pkwVar.d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            okwVar = pkwVar.e;
        }
        okw okwVar4 = okwVar;
        if ((i & 32) != 0) {
            okwVar2 = pkwVar.f;
        }
        okw okwVar5 = okwVar2;
        if ((i & 64) != 0) {
            okwVar3 = pkwVar.g;
        }
        pkwVar.getClass();
        return new pkw(str, str2, z3, z4, okwVar4, okwVar5, okwVar3);
    }

    public final okw b() {
        return this.c ? this.f : !this.d ? this.g : this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkw)) {
            return false;
        }
        pkw pkwVar = (pkw) obj;
        return jl40.l(this.a, pkwVar.a) && jl40.l(this.b, pkwVar.b) && this.c == pkwVar.c && this.d == pkwVar.d && jl40.l(this.e, pkwVar.e) && jl40.l(this.f, pkwVar.f) && jl40.l(this.g, pkwVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
    }
}
