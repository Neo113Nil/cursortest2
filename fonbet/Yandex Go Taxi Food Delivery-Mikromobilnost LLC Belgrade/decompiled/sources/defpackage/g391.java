package defpackage;

/* loaded from: classes7.dex */
public final class g391 implements zl61 {
    @Override // defpackage.zl61
    public final void a() {
        synchronized (oaa1.a) {
            Object obj = oaa1.b;
            synchronized (obj) {
                if (oaa1.c) {
                    return;
                }
                long c = oaa1.c();
                synchronized (obj) {
                    oaa1.d = c;
                    oaa1.c = true;
                }
            }
        }
    }

    @Override // defpackage.zl61
    public final void b() {
    }
}
