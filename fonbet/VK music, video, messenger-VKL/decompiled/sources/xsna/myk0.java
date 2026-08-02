package xsna;

/* compiled from: ValueHolders.kt */
/* loaded from: classes11.dex */
public final class myk0<T> implements xjr0<T> {
    public final T a;

    public myk0(T t) {
        this.a = t;
    }

    @Override // xsna.xjr0
    public final T a(sy90 sy90Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myk0) && epx.f(this.a, ((myk0) obj).a);
    }

    public final int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("StaticValueHolder(value="), this.a, ')');
    }
}
