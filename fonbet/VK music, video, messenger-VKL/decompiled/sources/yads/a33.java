package yads;

/* loaded from: classes10.dex */
public final class a33 implements ch1 {
    @Override // yads.ch1
    public final void a() {
        synchronized (b33.a) {
            Object obj = b33.b;
            synchronized (obj) {
                if (b33.c) {
                    return;
                }
                long a = b33.a();
                synchronized (obj) {
                    b33.d = a;
                    b33.c = true;
                }
            }
        }
    }

    @Override // yads.ch1
    public final void b() {
    }
}
