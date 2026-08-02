package xsna;

/* compiled from: StickerStyleConfig.kt */
/* loaded from: classes5.dex */
public final class c7l0 {
    public final v2l0 a;

    public c7l0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7l0) && epx.f(this.a, ((c7l0) obj).a);
    }

    public final int hashCode() {
        v2l0 v2l0Var = this.a;
        if (v2l0Var == null) {
            return 0;
        }
        return v2l0Var.hashCode();
    }

    public final String toString() {
        return "StickerStyleConfig(colors=" + this.a + ')';
    }

    public c7l0(v2l0 v2l0Var) {
        this.a = v2l0Var;
    }
}
