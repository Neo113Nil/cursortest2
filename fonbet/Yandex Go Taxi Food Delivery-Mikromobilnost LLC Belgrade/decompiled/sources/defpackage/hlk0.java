package defpackage;

/* loaded from: classes14.dex */
public final class hlk0 implements jlk0 {
    public final v8a0 a;

    public hlk0(v8a0 v8a0Var) {
        this.a = v8a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hlk0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        v8a0 v8a0Var = ((hlk0) obj).a;
        v8a0 v8a0Var2 = this.a;
        if (jl40.l(v8a0Var2 != null ? v8a0Var2.b : null, v8a0Var != null ? v8a0Var.b : null)) {
            if (jl40.l(v8a0Var2 != null ? v8a0Var2.a : null, v8a0Var != null ? v8a0Var.a : null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        v8a0 v8a0Var = this.a;
        t0a0 t0a0Var = v8a0Var != null ? v8a0Var.b : null;
        int hashCode = (t0a0Var != null ? t0a0Var.hashCode() : 0) * 31;
        String str = v8a0Var != null ? v8a0Var.a : null;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
