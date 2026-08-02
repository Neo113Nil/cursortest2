package defpackage;

/* loaded from: classes.dex */
public interface o13 {
    void a(int i, int i2);

    default void d() {
    }

    void f();

    default void g(Object obj, wls wlsVar) {
        wlsVar.invoke(l(), obj);
    }

    void i(int i, int i2, int i3);

    void k(int i, Object obj);

    Object l();

    void m(int i, Object obj);

    void n(Object obj);

    void p();
}
