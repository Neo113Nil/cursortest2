package xsna;

/* compiled from: Status.kt */
/* loaded from: classes3.dex */
public final class au {
    public final String a;
    public final clt0 b;

    public au(String str, clt0 clt0Var) {
        this.a = str;
        this.b = clt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return this.a.equals(auVar.a) && this.b.equals(auVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Action(title=" + this.a + ", action=" + this.b + ')';
    }
}
