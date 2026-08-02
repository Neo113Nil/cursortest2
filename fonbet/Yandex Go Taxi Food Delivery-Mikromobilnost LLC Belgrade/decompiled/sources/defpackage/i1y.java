package defpackage;

import androidx.compose.ui.layout.i;
import androidx.compose.ui.node.LayoutNode;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class i1y implements syu0 {
    public final xx40 a;
    public final /* synthetic */ i b;
    public final /* synthetic */ Object c;

    public i1y(i iVar, Object obj) {
        this.b = iVar;
        this.c = obj;
        int[] iArr = i6w.a;
        this.a = new xx40((Object) null);
    }

    @Override // defpackage.syu0
    public final long a(int i) {
        LayoutNode layoutNode = (LayoutNode) this.b.C.d(this.c);
        if (layoutNode == null || !layoutNode.F()) {
            return 0L;
        }
        int i2 = ((uz40) layoutNode.k()).a.c;
        if (i < 0 || i >= i2) {
            ixv.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.c(i)) {
            return 0L;
        }
        int v = ((LayoutNode) ((uz40) layoutNode.k()).get(i)).v();
        return (((LayoutNode) ((uz40) layoutNode.k()).get(i)).m() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (v << 32);
    }

    @Override // defpackage.syu0
    public final void b(int i, long j) {
        i iVar = this.b;
        LayoutNode layoutNode = (LayoutNode) iVar.C.d(this.c);
        if (layoutNode == null || !layoutNode.F()) {
            return;
        }
        int i2 = ((uz40) layoutNode.k()).a.c;
        if (i < 0 || i >= i2) {
            ixv.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (layoutNode.G()) {
            ixv.a("Pre-measure called on node that is not placed");
        }
        LayoutNode layoutNode2 = iVar.a;
        layoutNode2.J = true;
        d1y.a(layoutNode).mo66measureAndLayout0kLqBqw((LayoutNode) ((uz40) layoutNode.k()).get(i), j);
        layoutNode2.J = false;
        this.a.a(i);
    }

    @Override // defpackage.syu0
    public final void c(h12 h12Var) {
        t300 t300Var;
        LayoutNode layoutNode = (LayoutNode) this.b.C.d(this.c);
        e530 e530Var = (layoutNode == null || (t300Var = layoutNode.a0) == null) ? null : (e530) t300Var.g;
        if (e530Var == null || !e530Var.isAttached()) {
            return;
        }
        dai0.N(e530Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", h12Var);
    }

    @Override // defpackage.syu0
    public final int d() {
        LayoutNode layoutNode = (LayoutNode) this.b.C.d(this.c);
        if (layoutNode != null) {
            return ((uz40) layoutNode.k()).a.c;
        }
        return 0;
    }

    @Override // defpackage.syu0
    public final void dispose() {
        i.a(this.b, this.c);
    }
}
