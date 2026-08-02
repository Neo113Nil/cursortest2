package defpackage;

import java.util.Calendar;

/* loaded from: classes12.dex */
public final class b8z0 implements e8z0, u190 {
    public final bus0 a;
    public final Calendar b;
    public final wjm c;
    public final e2n d;
    public final boolean e;
    public final String f;

    public b8z0(bus0 bus0Var, Calendar calendar, wjm wjmVar, e2n e2nVar) {
        this.a = bus0Var;
        this.b = calendar;
        this.c = wjmVar;
        this.d = e2nVar;
        boolean z = wjmVar != null;
        this.e = z;
        this.f = vpb1.l(z ? ue7.a : new ve7(calendar));
    }

    @Override // defpackage.u190
    public final e2n c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8z0)) {
            return false;
        }
        b8z0 b8z0Var = (b8z0) obj;
        return jl40.l(this.a, b8z0Var.a) && jl40.l(this.b, b8z0Var.b) && jl40.l(this.c, b8z0Var.c) && jl40.l(this.d, b8z0Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wjm wjmVar = this.c;
        int hashCode2 = (hashCode + (wjmVar == null ? 0 : wjmVar.hashCode())) * 31;
        e2n e2nVar = this.d;
        return hashCode2 + (e2nVar != null ? e2nVar.hashCode() : 0);
    }
}
