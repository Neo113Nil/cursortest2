package defpackage;

/* loaded from: classes7.dex */
public abstract class mwb0 {
    public final Object a;

    public mwb0(Object obj) {
        this.a = obj;
    }

    public abstract Object a();

    public final boolean equals(Object obj) {
        Object a = a();
        mwb0 mwb0Var = obj instanceof mwb0 ? (mwb0) obj : null;
        return jl40.l(a, mwb0Var != null ? mwb0Var.a() : null);
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
