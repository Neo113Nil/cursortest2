package xsna;

/* compiled from: SoundOnlyViewState.kt */
/* loaded from: classes8.dex */
public final class zfk0 implements x0u0, n2u0 {
    public static final zfk0 b = new zfk0(true);
    public static final zfk0 c;
    public static final zfk0 d;
    public final boolean a;

    static {
        zfk0 zfk0Var = new zfk0(false);
        c = zfk0Var;
        d = zfk0Var;
    }

    public zfk0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfk0) && this.a == ((zfk0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("SoundOnlyViewState(isVisible=", ")", this.a);
    }
}
