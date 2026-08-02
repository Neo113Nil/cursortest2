package xsna;

import xsna.wl7;

/* compiled from: SingleChoiceController.kt */
/* loaded from: classes6.dex */
public final class jtj0<T> implements jbc<T> {
    public final wl7.a a;
    public T b;

    public jtj0(wl7.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jbc
    public final void a(Object obj) {
        if (epx.f(obj, this.b)) {
            return;
        }
        if (!epx.f(obj, this.b)) {
            this.b = obj;
        }
        qro0.e(0L, new os30(this, 23));
    }

    @Override // xsna.jbc
    public final boolean b(hfz hfzVar) {
        return epx.f(this.b, hfzVar);
    }
}
