package defpackage;

/* loaded from: classes8.dex */
public abstract class g6a0 {
    public final fvc a;

    public g6a0(fvc fvcVar) {
        this.a = fvcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g6a0)) {
            return false;
        }
        return this.a.equals(((g6a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
