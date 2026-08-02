package xsna;

/* compiled from: ClipsWrapperShowFeedOnboardingEvent.kt */
/* loaded from: classes17.dex */
public final class qtf {
    public final tqf a;

    public qtf(tqf tqfVar) {
        this.a = tqfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qtf) && epx.f(this.a, ((qtf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClipsWrapperShowFeedOnboardingEvent(focusedItem=" + this.a + ')';
    }
}
