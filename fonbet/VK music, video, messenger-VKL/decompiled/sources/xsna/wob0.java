package xsna;

/* compiled from: PollEditorPatch.kt */
/* loaded from: classes4.dex */
public final class wob0 implements yob0 {
    public final long b;

    public wob0(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wob0) && this.b == ((wob0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("PickPollEditDate(endDateMs="));
    }
}
