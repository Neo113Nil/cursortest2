package xsna;

/* compiled from: Applier.kt */
/* loaded from: classes11.dex */
public interface fd3<N> {
    N a();

    default void b(Object obj, wzs wzsVar) {
        wzsVar.invoke(a(), obj);
    }

    default void d() {
        N a = a();
        ypi ypiVar = a instanceof ypi ? (ypi) a : null;
        if (ypiVar != null) {
            ypiVar.f();
        }
    }

    void e(int i, N n);

    void f(N n);

    void g(int i, int i2);

    void h(int i, int i2, int i3);

    void i(int i, N n);

    void j();

    default void c() {
    }
}
