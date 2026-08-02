package xsna;

import android.view.View;

/* compiled from: SideControlsFactory.kt */
/* loaded from: classes16.dex */
public abstract class dh2<T> implements xr8<T> {
    public final ggd a;
    public T b;
    public final View c;

    public dh2(ggd ggdVar) {
        this.a = ggdVar;
        this.c = ggdVar.getView();
    }

    @Override // xsna.xr8
    public final void a(T t) {
        if (epx.f(this.b, t)) {
            return;
        }
        b(t);
        this.b = t;
    }

    public abstract void b(T t);

    @Override // xsna.xr8
    public final View getView() {
        return this.c;
    }
}
