package defpackage;

/* loaded from: classes2.dex */
public final class e2u {
    public final String a;
    public final ujc0 b;

    public e2u(String str, ujc0 ujc0Var) {
        this.a = str;
        this.b = ujc0Var;
    }

    public final ujc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2u)) {
            return false;
        }
        e2u e2uVar = (e2u) obj;
        return this.a.equals(e2uVar.a) && this.b.equals(e2uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundColorSetting(__typename=" + this.a + ", plaqueColorSettings=" + this.b + ')';
    }
}
