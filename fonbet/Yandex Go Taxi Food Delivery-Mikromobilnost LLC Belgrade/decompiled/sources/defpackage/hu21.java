package defpackage;

/* loaded from: classes2.dex */
public final class hu21 implements za70 {
    public final iu21 a;

    public hu21(iu21 iu21Var) {
        this.a = iu21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu21) && this.a.equals(((hu21) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Data(userSyncStatus=" + this.a + ')';
    }
}
