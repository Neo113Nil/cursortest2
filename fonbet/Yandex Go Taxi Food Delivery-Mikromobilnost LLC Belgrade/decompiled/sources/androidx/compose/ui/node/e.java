package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import defpackage.c9v;
import defpackage.koz;
import defpackage.kt1;
import defpackage.noz;
import defpackage.wz40;
import defpackage.z910;

/* loaded from: classes10.dex */
public final class e extends noz {
    public e(f fVar) {
        super(fVar);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int C0(kt1 kt1Var) {
        l lVar = this.I.I.b0.q;
        koz kozVar = lVar.L;
        if (!lVar.D) {
            j jVar = lVar.y;
            if (jVar.d == LayoutNode.LayoutState.LookaheadMeasuring) {
                kozVar.f = true;
                if (kozVar.b) {
                    jVar.f = true;
                    jVar.g = true;
                }
            } else {
                kozVar.g = true;
            }
        }
        e eVar = lVar.X().r0;
        if (eVar != null) {
            eVar.D = true;
        }
        lVar.O();
        e eVar2 = lVar.X().r0;
        if (eVar2 != null) {
            eVar2.D = false;
        }
        Integer num = (Integer) kozVar.i.get(kt1Var);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.N.g(kt1Var, intValue);
        return intValue;
    }

    @Override // defpackage.noz
    public final void R0() {
        this.I.I.b0.q.R0();
    }

    @Override // defpackage.x910
    public final int V(int i) {
        c9v r = this.I.I.r();
        z910 n = r.n();
        LayoutNode layoutNode = (LayoutNode) r.b;
        return n.i((s) layoutNode.a0.e, layoutNode.i(), i);
    }

    @Override // defpackage.x910
    public final int e0(int i) {
        c9v r = this.I.I.r();
        z910 n = r.n();
        LayoutNode layoutNode = (LayoutNode) r.b;
        return n.f((s) layoutNode.a0.e, layoutNode.i(), i);
    }

    @Override // defpackage.x910
    public final int k0(int i) {
        c9v r = this.I.I.r();
        z910 n = r.n();
        LayoutNode layoutNode = (LayoutNode) r.b;
        return n.e((s) layoutNode.a0.e, layoutNode.i(), i);
    }

    @Override // defpackage.x910
    public final androidx.compose.ui.layout.o l0(long j) {
        z0(j);
        s sVar = this.I;
        wz40 x = sVar.I.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).b0.q.C = LayoutNode.UsageByParent.NotUsed;
        }
        LayoutNode layoutNode = sVar.I;
        noz.Q0(this, layoutNode.P.b(this, layoutNode.i(), j));
        return this;
    }

    @Override // defpackage.x910
    public final int y(int i) {
        c9v r = this.I.I.r();
        z910 n = r.n();
        LayoutNode layoutNode = (LayoutNode) r.b;
        return n.g((s) layoutNode.a0.e, layoutNode.i(), i);
    }
}
