package defpackage;

/* loaded from: classes2.dex */
public final class f2u {
    public final String a;
    public final qqc0 b;

    public f2u(String str, qqc0 qqc0Var) {
        this.a = str;
        this.b = qqc0Var;
    }

    public final qqc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2u)) {
            return false;
        }
        f2u f2uVar = (f2u) obj;
        return this.a.equals(f2uVar.a) && this.b.equals(f2uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundShapeSettings(__typename=" + this.a + ", plaqueShapeSettings=" + this.b + ')';
    }
}
