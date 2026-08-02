package xsna;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes.dex */
public final class toe0<T> {
    public final Class<? extends Annotation> a;
    public final Class<T> b;

    /* compiled from: Qualified.java */
    public @interface a {
    }

    public toe0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @NonNull
    public static <T> toe0<T> a(Class<T> cls) {
        return new toe0<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || toe0.class != obj.getClass()) {
            return false;
        }
        toe0 toe0Var = (toe0) obj;
        if (this.b.equals(toe0Var.b)) {
            return this.a.equals(toe0Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.b;
        Class<? extends Annotation> cls2 = this.a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
