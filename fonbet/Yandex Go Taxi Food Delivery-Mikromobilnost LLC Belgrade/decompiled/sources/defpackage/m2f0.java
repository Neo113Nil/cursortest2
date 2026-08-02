package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m2f0 {
    public final Class a;
    public final Class b;

    public m2f0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m2f0)) {
            return false;
        }
        m2f0 m2f0Var = (m2f0) obj;
        return m2f0Var.a.equals(this.a) && m2f0Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
    }
}
