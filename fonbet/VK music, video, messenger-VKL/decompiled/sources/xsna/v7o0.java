package xsna;

/* compiled from: TechBugReportButtonState.kt */
/* loaded from: classes8.dex */
public final class v7o0 implements x0u0, n2u0 {
    public static final v7o0 b = new v7o0(true);
    public static final v7o0 c;
    public static final v7o0 d;
    public final boolean a;

    static {
        v7o0 v7o0Var = new v7o0(false);
        c = v7o0Var;
        d = v7o0Var;
    }

    public v7o0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7o0) && this.a == ((v7o0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("TechBugReportButtonState(isVisible=", ")", this.a);
    }
}
