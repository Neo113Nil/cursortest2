package defpackage;

import androidx.compose.foundation.lazy.grid.b;
import androidx.compose.foundation.pager.d;
import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes10.dex */
public final class n4y implements yti0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wkp0 b;

    public /* synthetic */ n4y(wkp0 wkp0Var, int i) {
        this.a = i;
        this.b = wkp0Var;
    }

    @Override // defpackage.yti0
    public final void i(LayoutNode layoutNode) {
        int i = this.a;
        wkp0 wkp0Var = this.b;
        switch (i) {
            case 0:
                ((b) wkp0Var).j = layoutNode;
                break;
            case 1:
                ((androidx.compose.foundation.lazy.b) wkp0Var).l = layoutNode;
                break;
            default:
                ((d) wkp0Var).x.setValue(layoutNode);
                break;
        }
    }
}
