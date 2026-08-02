package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class d3m implements e3m {
    public final int a;
    public final xzl b;
    public final u1m c;
    public final zwl d;
    public final zwl e;
    public boolean f;

    public d3m(int i, xzl xzlVar, u1m u1mVar, zwl zwlVar, zwl zwlVar2) {
        this.a = i;
        this.b = xzlVar;
        this.c = u1mVar;
        this.d = zwlVar;
        this.e = zwlVar2;
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
        if (!(obj instanceof d3m)) {
            return false;
        }
        d3m d3mVar = (d3m) obj;
        return this.a == d3mVar.a && jl40.l(this.b, d3mVar.b) && jl40.l(this.c, d3mVar.c) && jl40.l(this.d, d3mVar.d) && jl40.l(this.e, d3mVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        u1m u1mVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (u1mVar == null ? 0 : u1mVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Rendered(epoch=" + zyl.a(this.a) + ", lastDocument=" + this.b + ", query=" + this.c + ", actionCallbacksConfig=" + this.d + ", previousLifecycleCallbacksConfig=" + this.e + Extension.C_BRAKE;
    }
}
