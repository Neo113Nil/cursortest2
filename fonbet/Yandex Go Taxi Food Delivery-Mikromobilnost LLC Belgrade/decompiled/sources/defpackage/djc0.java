package defpackage;

/* loaded from: classes2.dex */
public final class djc0 {
    public final cjc0 a;

    public djc0(cjc0 cjc0Var) {
        this.a = cjc0Var;
    }

    public final cjc0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djc0) && this.a.equals(((djc0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "PlaqueButtonWidget(text=" + this.a + ')';
    }
}
