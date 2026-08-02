package xsna;

/* compiled from: InstanceFactory.java */
/* loaded from: classes.dex */
public final class o6x<T> implements vhq<T>, zpy<T> {
    public final T b;

    public o6x(T t) {
        this.b = t;
    }

    public static o6x a(Object obj) {
        if (obj != null) {
            return new o6x(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // xsna.e9e0
    public final T get() {
        return this.b;
    }
}
