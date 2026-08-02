package defpackage;

import defpackage.f7u0;

/* loaded from: classes.dex */
public final class k84 extends f7u0 {
    public final l84 a;
    public final n84 b;
    public final m84 c;

    public k84(l84 l84Var, n84 n84Var, m84 m84Var) {
        this.a = l84Var;
        this.b = n84Var;
        this.c = m84Var;
    }

    @Override // defpackage.f7u0
    public final f7u0.a a() {
        return this.a;
    }

    @Override // defpackage.f7u0
    public final f7u0.b b() {
        return this.c;
    }

    @Override // defpackage.f7u0
    public final f7u0.c c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7u0)) {
            return false;
        }
        f7u0 f7u0Var = (f7u0) obj;
        return this.a.equals(f7u0Var.a()) && this.b.equals(f7u0Var.c()) && this.c.equals(f7u0Var.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
