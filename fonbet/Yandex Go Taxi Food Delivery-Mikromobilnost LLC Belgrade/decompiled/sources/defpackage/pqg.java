package defpackage;

/* loaded from: classes11.dex */
public interface pqg {
    void e(nqg nqgVar);

    default void h(hqg hqgVar, Runnable runnable) {
        e(new nqg(hqgVar == null ? null : new sae(23, hqgVar), runnable));
    }

    void k();

    void start();
}
