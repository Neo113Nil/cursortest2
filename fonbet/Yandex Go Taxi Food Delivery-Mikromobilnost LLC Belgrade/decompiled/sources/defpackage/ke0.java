package defpackage;

/* loaded from: classes6.dex */
public abstract class ke0 {
    public abstract ze0 a();

    public abstract bvv b();

    public final boolean equals(Object obj) {
        if (!(obj instanceof ke0)) {
            return false;
        }
        ke0 ke0Var = (ke0) obj;
        return jl40.l(b(), ke0Var.b()) && jl40.l(a(), ke0Var.a());
    }

    public final int hashCode() {
        return getClass().hashCode();
    }
}
