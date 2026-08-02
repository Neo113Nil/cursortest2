package defpackage;

import java.util.List;

/* loaded from: classes15.dex */
public final class pgx implements mgx {
    public final mgx a;

    public pgx(mgx mgxVar) {
        this.a = mgxVar;
    }

    @Override // defpackage.mgx
    public final boolean b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        pgx pgxVar = obj instanceof pgx ? (pgx) obj : null;
        mgx mgxVar = pgxVar != null ? pgxVar.a : null;
        mgx mgxVar2 = this.a;
        if (!jl40.l(mgxVar2, mgxVar)) {
            return false;
        }
        lfx f = mgxVar2.f();
        if (!(f instanceof lfx)) {
            return false;
        }
        mgx mgxVar3 = obj instanceof mgx ? (mgx) obj : null;
        lfx f2 = mgxVar3 != null ? mgxVar3.f() : null;
        if (f2 == null || !(f2 instanceof lfx)) {
            return false;
        }
        return ((zzb) f).a().equals(((zzb) f2).a());
    }

    @Override // defpackage.mgx
    public final lfx f() {
        return this.a.f();
    }

    @Override // defpackage.mgx
    public final List g() {
        return this.a.g();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
