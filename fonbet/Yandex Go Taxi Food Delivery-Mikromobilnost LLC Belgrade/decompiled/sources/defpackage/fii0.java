package defpackage;

import androidx.camera.video.g;
import androidx.camera.video.internal.encoder.j;

/* loaded from: classes10.dex */
public final /* synthetic */ class fii0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ b84 c;

    public /* synthetic */ fii0(g gVar, b84 b84Var, int i) {
        this.a = i;
        this.b = gVar;
        this.c = b84Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b84 b84Var = this.c;
        g gVar = this.b;
        switch (i) {
            case 0:
                if (gVar.r == b84Var && !gVar.s) {
                    if (gVar.n()) {
                        gVar.I.l();
                    }
                    j jVar = gVar.G;
                    if (jVar == null) {
                        gVar.i0 = true;
                        break;
                    } else {
                        jVar.l();
                        b84 b84Var2 = gVar.r;
                        b84Var2.k(new fn31(b84Var2.A, gVar.k()), true);
                        break;
                    }
                }
                break;
            default:
                gVar.t(b84Var);
                break;
        }
    }
}
