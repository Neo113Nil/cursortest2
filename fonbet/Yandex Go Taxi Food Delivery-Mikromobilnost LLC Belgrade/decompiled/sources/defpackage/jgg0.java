package defpackage;

/* loaded from: classes.dex */
public final class jgg0 {
    public final Class a;
    public final Class b;

    public jgg0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static jgg0 a(Class cls) {
        return new jgg0(igg0.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jgg0.class != obj.getClass()) {
            return false;
        }
        jgg0 jgg0Var = (jgg0) obj;
        if (this.b.equals(jgg0Var.b)) {
            return this.a.equals(jgg0Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == igg0.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
