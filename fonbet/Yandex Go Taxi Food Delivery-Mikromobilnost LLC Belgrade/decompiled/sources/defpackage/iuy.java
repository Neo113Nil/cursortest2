package defpackage;

/* loaded from: classes.dex */
public final class iuy extends juy {
    public final ong a = ong.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iuy.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((iuy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (iuy.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
