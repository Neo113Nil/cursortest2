package xsna;

/* compiled from: AndroidAutoApiMappings.kt */
@vby
/* loaded from: classes16.dex */
public final class gkj0 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof gkj0) {
            return this.a == ((gkj0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "ShuffleState(isShuffled=" + this.a + ')';
    }
}
