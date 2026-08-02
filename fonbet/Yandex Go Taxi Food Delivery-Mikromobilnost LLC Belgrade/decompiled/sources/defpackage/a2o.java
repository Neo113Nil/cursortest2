package defpackage;

import flex.engine.a;

/* loaded from: classes9.dex */
public final class a2o {
    public final a a;

    public a2o(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a2o) {
            return jl40.l(this.a.F, ((a2o) obj).a.F);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.F.hashCode();
    }
}
