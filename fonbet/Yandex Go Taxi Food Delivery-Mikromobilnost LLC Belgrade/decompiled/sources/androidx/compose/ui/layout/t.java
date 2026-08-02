package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import defpackage.dab1;
import defpackage.g1y;
import defpackage.ny61;
import defpackage.ttd;
import defpackage.vyu0;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final class t {
    public final vyu0 a;
    public i b;
    public final wls c;
    public final wls d;
    public final wls e;

    public t(vyu0 vyu0Var) {
        this.a = vyu0Var;
        this.c = new wls() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                LayoutNode layoutNode = (LayoutNode) obj;
                t tVar = t.this;
                i iVar = layoutNode.c0;
                if (iVar == null) {
                    iVar = new i(layoutNode, tVar.a);
                    layoutNode.c0 = iVar;
                }
                tVar.b = iVar;
                t.this.a().f();
                i a = t.this.a();
                vyu0 vyu0Var2 = t.this.a;
                if (a.c != vyu0Var2) {
                    a.c = vyu0Var2;
                    a.g(false);
                    LayoutNode.T(a.a, false, 7);
                }
                return zy11.a;
            }
        };
        this.d = new wls() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                t.this.a().b = (ttd) obj2;
                return zy11.a;
            }
        };
        this.e = new wls() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                i a = t.this.a();
                ((LayoutNode) obj).a0(new g1y(a, (wls) obj2, a.I));
                return zy11.a;
            }
        };
    }

    public final i a() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar;
        }
        ny61.g("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    public t() {
        this(dab1.J);
    }
}
