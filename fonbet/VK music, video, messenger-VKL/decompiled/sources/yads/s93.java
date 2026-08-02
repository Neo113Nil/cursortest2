package yads;

import java.util.Collection;

/* loaded from: classes10.dex */
public final class s93 implements xq {
    public static final s93 c;
    public final s51 b;

    static {
        p51 p51Var = s51.c;
        c = new s93(tn2.f);
    }

    public s93(s51 s51Var) {
        this.b = s51.a((Collection) s51Var);
    }

    public final boolean a(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            r93 r93Var = (r93) this.b.get(i2);
            if (r93Var.b() && r93Var.a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s93.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((s93) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
