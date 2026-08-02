package defpackage;

/* loaded from: classes10.dex */
public final class guy extends juy {
    public final ong a = ong.b;

    public final ong a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || guy.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((guy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (guy.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
