package defpackage;

/* loaded from: classes10.dex */
public final class cts implements vtd, cud {
    public final rtd a;

    public cts(rtd rtdVar) {
        this.a = rtdVar;
    }

    @Override // defpackage.vtd
    public final Iterable d() {
        return uus0.f(((bud) this.a).y);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cts) {
            return jl40.l(this.a, ((cts) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
