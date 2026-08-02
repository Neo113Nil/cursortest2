package xsna;

import xsna.hbt0;

/* compiled from: TransitionAutoPlayHolder.kt */
/* loaded from: classes2.dex */
public final class amp0 implements cmp0 {
    public final /* synthetic */ sj1 b;
    public final /* synthetic */ hbt0.e c;

    public amp0(sj1 sj1Var, hbt0.e eVar) {
        this.b = sj1Var;
        this.c = eVar;
    }

    @Override // xsna.cmp0
    public final void a() {
        bmp0.e.removeCallbacks(this.b);
    }

    @Override // xsna.dmp0
    public final void b() {
        bmp0.e.removeCallbacks(this.b);
        this.c.b();
    }
}
