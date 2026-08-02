package defpackage;

import androidx.compose.ui.node.s;
import androidx.compose.ui.platform.j;

/* loaded from: classes12.dex */
public final class nwo extends e530 implements ejt, fud {
    public wxi0 a;
    public wls b;

    @Override // defpackage.ejt
    public final void g(s sVar) {
        fwi fwiVar = (fwi) npb1.c(this, j.h);
        wxi0 wxi0Var = this.a;
        wxi0Var.a.put(this, (zii0) this.b.invoke(sVar, fwiVar));
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.a.a.remove(this);
    }
}
