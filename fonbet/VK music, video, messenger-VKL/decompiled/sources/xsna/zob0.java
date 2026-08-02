package xsna;

/* compiled from: PollEditorPatch.kt */
/* loaded from: classes4.dex */
public final class zob0 implements yob0 {
    public final long b;

    public zob0(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zob0) && this.b == ((zob0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("Interactive(interactiveTime="));
    }
}
