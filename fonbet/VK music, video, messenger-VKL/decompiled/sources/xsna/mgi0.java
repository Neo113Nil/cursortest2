package xsna;

import androidx.compose.ui.node.LayoutNode;

/* compiled from: SemanticsOwner.kt */
/* loaded from: classes11.dex */
public final class mgi0 {
    public final LayoutNode a;
    public final fhp b;
    public final f9x<LayoutNode> c;
    public final fh50<cgi0> d = new fh50<>(2);

    public mgi0(LayoutNode layoutNode, fhp fhpVar, pg50 pg50Var) {
        this.a = layoutNode;
        this.b = fhpVar;
        this.c = pg50Var;
    }

    public final igi0 a() {
        return new igi0(this.b, false, this.a, new xfi0());
    }
}
