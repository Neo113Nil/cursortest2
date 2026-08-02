package defpackage;

/* loaded from: classes9.dex */
public final class oi9 {
    public static final ni9 b = new ni9();
    public final Object a;

    public /* synthetic */ oi9(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        mi9 mi9Var = obj instanceof mi9 ? (mi9) obj : null;
        if (mi9Var != null) {
            return mi9Var.a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof ni9) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oi9) {
            return jl40.l(this.a, ((oi9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof mi9) {
            return ((mi9) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
