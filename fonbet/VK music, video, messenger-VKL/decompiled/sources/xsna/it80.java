package xsna;

/* compiled from: Optional.kt */
/* loaded from: classes.dex */
public final class it80<T> {
    public static final a b = new a();
    public final T a;

    /* compiled from: Optional.kt */
    public static final class a {
        public static it80 a() {
            return new it80(null);
        }
    }

    public it80(T t) {
        this.a = t;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof it80) && epx.f(this.a, ((it80) obj).a);
    }

    public final int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("Optional(value="), this.a, ')');
    }
}
