package defpackage;

import androidx.compose.foundation.text.selection.j;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.s;

/* loaded from: classes10.dex */
public final class g9y extends e530 implements fud, ejt, v9y, cqh {
    public w9y a;
    public oay b;
    public j c;
    public final oz40 w = f.j(null);

    public g9y(w9y w9yVar, oay oayVar, j jVar) {
        this.a = w9yVar;
        this.b = oayVar;
        this.c = jVar;
    }

    @Override // defpackage.ejt
    public final void g(s sVar) {
        this.w.setValue(sVar);
    }

    @Override // defpackage.e530
    public final void onAttach() {
        w9y w9yVar = this.a;
        if (w9yVar.a != null) {
            lxv.c("Expected textInputModifierNode to be null");
        }
        w9yVar.a = this;
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.a.j(this);
    }
}
