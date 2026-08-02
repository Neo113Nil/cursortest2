package xsna;

import android.util.Size;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv10 implements Runnable {
    public final /* synthetic */ ev10 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gzs e;
    public final /* synthetic */ long f;

    public /* synthetic */ dv10(ev10 ev10Var, int i, int i2, gzs gzsVar, long j) {
        this.b = ev10Var;
        this.c = i;
        this.d = i2;
        this.e = gzsVar;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ev10 ev10Var = this.b;
        int i = this.c;
        int i2 = this.d;
        gzs gzsVar = this.e;
        long j = this.f;
        if (ev10Var.l.getWidth() != i || ev10Var.l.getHeight() != i2) {
            ev10Var.l = new Size(i, i2);
        }
        ev10Var.d.pause();
        if (((Boolean) gzsVar.invoke()).booleanValue()) {
            qfs qfsVar = ev10Var.d;
            fgs fgsVar = ev10Var.h;
            qfsVar.C(fgsVar != null ? fgsVar : null, j);
        } else {
            qfs qfsVar2 = ev10Var.d;
            fgs fgsVar2 = ev10Var.h;
            qfsVar2.n0(fgsVar2 != null ? fgsVar2 : null, j);
        }
        ev10Var.k = true;
    }
}
