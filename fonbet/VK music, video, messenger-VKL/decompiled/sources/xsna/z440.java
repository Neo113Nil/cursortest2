package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: MultiClassKey.java */
/* loaded from: classes12.dex */
public final class z440 {
    public Class<?> a;
    public Class<?> b;
    public Class<?> c;

    public z440() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z440.class != obj.getClass()) {
            return false;
        }
        z440 z440Var = (z440) obj;
        return this.a.equals(z440Var.a) && this.b.equals(z440Var.b) && s2r0.b(this.c, z440Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public z440(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }
}
