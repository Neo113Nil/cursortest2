package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class i0m implements peo {
    public final kq90 a;
    public final u1m b;
    public final wbe0 c;
    public final q370 d;

    public i0m(kq90 kq90Var, u1m u1mVar, wbe0 wbe0Var, q370 q370Var) {
        this.a = kq90Var;
        this.b = u1mVar;
        this.c = wbe0Var;
        this.d = q370Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0m)) {
            return false;
        }
        i0m i0mVar = (i0m) obj;
        return jl40.l(this.a, i0mVar.a) && this.b.equals(i0mVar.b) && jl40.l(this.c, i0mVar.c) && jl40.l(this.d, i0mVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        q370 q370Var = this.d;
        return hashCode + (q370Var == null ? 0 : q370Var.a.hashCode());
    }

    public final String toString() {
        return "DocumentLoadPortionEvent(patchParams=" + this.a + ", query=" + this.b + ", portionParams=" + this.c + ", context=" + this.d + Extension.C_BRAKE;
    }
}
