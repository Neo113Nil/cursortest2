package xsna;

/* compiled from: MediaParams.kt */
/* loaded from: classes4.dex */
public final class ct10 {
    public final hif0 a;

    public ct10(hif0 hif0Var) {
        this.a = hif0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ct10) && epx.f(this.a, ((ct10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MediaParams(points=" + this.a + ")";
    }

    public ct10() {
        this(new hif0(0));
    }
}
