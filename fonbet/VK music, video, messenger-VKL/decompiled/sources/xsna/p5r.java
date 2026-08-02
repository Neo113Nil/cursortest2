package xsna;

/* compiled from: FeedbackButtonState.kt */
/* loaded from: classes8.dex */
public final class p5r implements x0u0, n2u0 {
    public static final p5r b = new p5r(true);
    public static final p5r c;
    public static final p5r d;
    public final boolean a;

    static {
        p5r p5rVar = new p5r(false);
        c = p5rVar;
        d = p5rVar;
    }

    public p5r(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5r) && this.a == ((p5r) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("FeedbackButtonState(isVisible=", ")", this.a);
    }
}
