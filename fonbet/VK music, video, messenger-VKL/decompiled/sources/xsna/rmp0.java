package xsna;

import xsna.wlp0;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class rmp0 implements kgn {
    public final /* synthetic */ wlp0 a;
    public final /* synthetic */ wlp0.a b;

    public rmp0(wlp0 wlp0Var, wlp0.a aVar) {
        this.a = wlp0Var;
        this.b = aVar;
    }

    @Override // xsna.kgn
    public final void dispose() {
        wlp0 wlp0Var = this.a;
        wlp0Var.getClass();
        wlp0.a.C3941a c3941a = (wlp0.a.C3941a) ((zak0) this.b.b).getValue();
        if (c3941a != null) {
            wlp0Var.i.remove(c3941a.b);
        }
    }
}
