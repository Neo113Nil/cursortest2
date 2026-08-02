package defpackage;

/* loaded from: classes12.dex */
public final class c8z0 implements e8z0 {
    public final bus0 a;
    public final String b = vpb1.l(we7.a);

    public c8z0(bus0 bus0Var) {
        this.a = bus0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8z0) && this.a.equals(((c8z0) obj).a);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
