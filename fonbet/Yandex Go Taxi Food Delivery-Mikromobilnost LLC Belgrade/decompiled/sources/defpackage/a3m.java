package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class a3m implements e3m {
    public final zyl a;
    public final xzl b;
    public final u1m c;

    public /* synthetic */ a3m(zyl zylVar, u1m u1mVar, int i) {
        this((i & 1) != 0 ? null : zylVar, (xzl) null, (i & 4) != 0 ? null : u1mVar);
    }

    @Override // defpackage.e3m
    public final zyl a() {
        return this.a;
    }

    @Override // defpackage.e3m
    public final xzl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3m)) {
            return false;
        }
        a3m a3mVar = (a3m) obj;
        return jl40.l(this.a, a3mVar.a) && jl40.l(this.b, a3mVar.b) && jl40.l(this.c, a3mVar.c);
    }

    public final int hashCode() {
        zyl zylVar = this.a;
        int hashCode = (zylVar == null ? 0 : Integer.hashCode(zylVar.a)) * 31;
        xzl xzlVar = this.b;
        int hashCode2 = (hashCode + (xzlVar == null ? 0 : xzlVar.hashCode())) * 31;
        u1m u1mVar = this.c;
        return hashCode2 + (u1mVar != null ? u1mVar.hashCode() : 0);
    }

    public final String toString() {
        return "Idle(epoch=" + this.a + ", lastDocument=" + this.b + ", query=" + this.c + Extension.C_BRAKE;
    }

    public a3m(zyl zylVar, xzl xzlVar, u1m u1mVar) {
        this.a = zylVar;
        this.b = xzlVar;
        this.c = u1mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a3m() {
        this((zyl) null, (u1m) (0 == true ? 1 : 0), 7);
    }
}
