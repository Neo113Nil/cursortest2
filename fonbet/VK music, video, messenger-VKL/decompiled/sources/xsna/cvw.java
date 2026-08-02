package xsna;

import xsna.avw;
import xsna.wlp0;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class cvw implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ mtk0 c;

    public /* synthetic */ cvw(Object obj, mtk0 mtk0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = mtk0Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                avw avwVar = (avw) this.b;
                avwVar.a.j((avw.a) this.c);
                break;
            default:
                wlp0 wlp0Var = (wlp0) this.b;
                wlp0Var.i.remove((wlp0.d) this.c);
                break;
        }
    }
}
