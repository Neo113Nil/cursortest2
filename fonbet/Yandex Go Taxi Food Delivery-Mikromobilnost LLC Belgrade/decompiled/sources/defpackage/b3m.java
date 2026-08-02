package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class b3m implements e3m {
    public final int a;
    public final xzl b;
    public final u1m c;
    public final ywl d;

    public b3m(int i, xzl xzlVar, u1m u1mVar, ywl ywlVar) {
        this.a = i;
        this.b = xzlVar;
        this.c = u1mVar;
        this.d = ywlVar;
    }

    @Override // defpackage.e3m
    public final zyl a() {
        return new zyl(this.a);
    }

    @Override // defpackage.e3m
    public final xzl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3m)) {
            return false;
        }
        b3m b3mVar = (b3m) obj;
        return this.a == b3mVar.a && jl40.l(this.b, b3mVar.b) && jl40.l(this.c, b3mVar.c) && jl40.l(this.d, b3mVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        xzl xzlVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (xzlVar == null ? 0 : xzlVar.hashCode())) * 31)) * 31;
        ywl ywlVar = this.d;
        return hashCode2 + (ywlVar != null ? ywlVar.hashCode() : 0);
    }

    public final String toString() {
        return "Loading(epoch=" + zyl.a(this.a) + ", lastDocument=" + this.b + ", query=" + this.c + ", preview=" + this.d + Extension.C_BRAKE;
    }
}
