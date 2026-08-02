package xsna;

/* compiled from: BaseDataSubscriber.java */
/* loaded from: classes12.dex */
public abstract class ic6<T> implements vvk<T> {
    @Override // xsna.vvk
    public final void c(zuk<T> zukVar) {
        try {
            e(zukVar);
        } finally {
            zukVar.close();
        }
    }

    @Override // xsna.vvk
    public final void d(zuk<T> zukVar) {
        boolean c = zukVar.c();
        try {
            f(zukVar);
        } finally {
            if (c) {
                zukVar.close();
            }
        }
    }

    public abstract void e(zuk<T> zukVar);

    public abstract void f(zuk<T> zukVar);

    @Override // xsna.vvk
    public void a() {
    }

    @Override // xsna.vvk
    public void b(zuk<T> zukVar) {
    }
}
