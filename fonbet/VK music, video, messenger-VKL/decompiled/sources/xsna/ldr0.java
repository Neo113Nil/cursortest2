package xsna;

/* compiled from: VKLogoButtonState.kt */
/* loaded from: classes8.dex */
public final class ldr0 implements x0u0, n2u0 {
    public static final ldr0 b = new ldr0(true);
    public static final ldr0 c;
    public static final ldr0 d;
    public final boolean a;

    static {
        ldr0 ldr0Var = new ldr0(false);
        c = ldr0Var;
        d = ldr0Var;
    }

    public ldr0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldr0) && this.a == ((ldr0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("VKLogoButtonState(isVisible=", ")", this.a);
    }
}
