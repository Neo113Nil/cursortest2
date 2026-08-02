package xsna;

/* compiled from: ProgressViewState.kt */
/* loaded from: classes8.dex */
public final class w3e0 implements x0u0, n2u0 {
    public static final w3e0 b = new w3e0(true);
    public static final w3e0 c;
    public static final w3e0 d;
    public final boolean a;

    static {
        w3e0 w3e0Var = new w3e0(false);
        c = w3e0Var;
        d = w3e0Var;
    }

    public w3e0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3e0) && this.a == ((w3e0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("ProgressViewState(isVisible=", ")", this.a);
    }
}
