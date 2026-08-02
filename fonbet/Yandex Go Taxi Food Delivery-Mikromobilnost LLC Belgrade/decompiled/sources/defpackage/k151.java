package defpackage;

/* loaded from: classes2.dex */
public final class k151 implements l151 {
    public final rkj a;

    public k151(rkj rkjVar) {
        this.a = rkjVar;
    }

    public final tkj a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k151) && this.a.equals(((k151) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fix(size=" + this.a + ')';
    }
}
