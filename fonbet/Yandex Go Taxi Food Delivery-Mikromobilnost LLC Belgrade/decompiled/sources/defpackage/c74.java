package defpackage;

import defpackage.v9x;

/* loaded from: classes10.dex */
public final class c74 extends v9x.a {
    public final k590 a;
    public final r1s b;

    public c74(k590 k590Var, r1s r1sVar) {
        if (k590Var == null) {
            ny61.t("Null packet");
            throw null;
        }
        this.a = k590Var;
        if (r1sVar != null) {
            this.b = r1sVar;
        } else {
            ny61.t("Null outputFileOptions");
            throw null;
        }
    }

    @Override // v9x.a
    public final r1s a() {
        return this.b;
    }

    @Override // v9x.a
    public final k590 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v9x.a)) {
            return false;
        }
        v9x.a aVar = (v9x.a) obj;
        return this.a.equals(aVar.b()) && this.b.equals(aVar.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "In{packet=" + this.a + ", outputFileOptions=" + this.b + "}";
    }
}
