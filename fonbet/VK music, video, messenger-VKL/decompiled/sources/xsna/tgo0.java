package xsna;

import xsna.o2d0;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class tgo0 implements kgn {
    public final /* synthetic */ wh50 a;
    public final /* synthetic */ sg50 b;

    public tgo0(wh50 wh50Var, sg50 sg50Var) {
        this.a = wh50Var;
        this.b = sg50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.kgn
    public final void dispose() {
        wh50 wh50Var = this.a;
        o2d0.b bVar = (o2d0.b) wh50Var.getValue();
        if (bVar != null) {
            o2d0.a aVar = new o2d0.a(bVar);
            sg50 sg50Var = this.b;
            if (sg50Var != null) {
                sg50Var.c(aVar);
            }
            wh50Var.setValue(null);
        }
    }
}
