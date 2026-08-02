package xsna;

/* compiled from: SettingsButtonState.kt */
/* loaded from: classes8.dex */
public final class w0j0 implements x0u0, n2u0 {
    public static final w0j0 b;
    public static final w0j0 c;
    public static final w0j0 d;
    public final boolean a;

    static {
        w0j0 w0j0Var = new w0j0(true);
        b = w0j0Var;
        c = new w0j0(false);
        d = w0j0Var;
    }

    public w0j0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0j0) && this.a == ((w0j0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("SettingsButtonState(isVisible=", ")", this.a);
    }
}
