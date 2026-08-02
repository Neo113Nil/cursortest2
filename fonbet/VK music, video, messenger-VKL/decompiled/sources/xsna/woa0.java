package xsna;

/* compiled from: PipButtonState.kt */
/* loaded from: classes8.dex */
public final class woa0 implements x0u0, n2u0 {
    public static final woa0 b;
    public static final woa0 c;
    public final boolean a;

    static {
        woa0 woa0Var = new woa0(false);
        b = woa0Var;
        c = woa0Var;
    }

    public woa0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof woa0) && this.a == ((woa0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("PipButtonState(isVisible=", ")", this.a);
    }
}
