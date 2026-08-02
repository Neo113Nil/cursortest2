package defpackage;

/* loaded from: classes8.dex */
public final class h3b0 {
    public final h8b0 a;

    public h3b0(h8b0 h8b0Var) {
        this.a = h8b0Var;
    }

    public final String toString() {
        h8b0 h8b0Var = this.a;
        if (h8b0Var == null) {
            return "EMPTY_PAYMENT";
        }
        String str = h8b0Var != null ? h8b0Var.c : null;
        return str == null ? "" : str;
    }
}
