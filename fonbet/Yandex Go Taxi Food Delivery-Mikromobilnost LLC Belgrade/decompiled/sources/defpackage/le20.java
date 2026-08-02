package defpackage;

/* loaded from: classes8.dex */
public final class le20 implements oe20 {
    public final rkj a;

    public le20(rkj rkjVar) {
        this.a = rkjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le20) && this.a.equals(((le20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fix(value=" + this.a + ')';
    }
}
