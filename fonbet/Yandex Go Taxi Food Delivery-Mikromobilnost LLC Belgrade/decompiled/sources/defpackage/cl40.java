package defpackage;

/* loaded from: classes10.dex */
public class cl40 {
    public Class a;
    public Class b;
    public Class c;

    public cl40(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cl40 cl40Var = (cl40) obj;
        return this.a.equals(cl40Var.a) && this.b.equals(cl40Var.b) && pw21.b(this.c, cl40Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public cl40() {
    }
}
