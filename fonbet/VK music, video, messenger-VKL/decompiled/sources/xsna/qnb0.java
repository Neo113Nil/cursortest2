package xsna;

/* compiled from: PollEditorAction.kt */
/* loaded from: classes4.dex */
public final class qnb0 implements pnb0 {
    public final long b;

    public qnb0(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnb0) && this.b == ((qnb0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("Interactive(interactiveTime="));
    }
}
