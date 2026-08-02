package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.aa10;
import defpackage.hz40;
import defpackage.ixv;
import defpackage.tls;
import defpackage.tyu0;
import defpackage.uz40;
import defpackage.wls;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class h implements tyu0 {
    public LayoutDirection a = LayoutDirection.Rtl;
    public float b;
    public float c;
    public final /* synthetic */ i w;

    public h(i iVar) {
        this.w = iVar;
    }

    @Override // androidx.compose.ui.layout.k
    public final aa10 E(int i, int i2, Map map, tls tlsVar, tls tlsVar2) {
        if ((i & ModalContentViewContainer.BASE_SHADOW_COLOR) != 0 || ((-16777216) & i2) != 0) {
            ixv.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new g(i, i2, map, tlsVar, this, this.w, tlsVar2);
    }

    @Override // defpackage.yuw
    public final boolean d0() {
        LayoutNode.LayoutState layoutState = this.w.a.b0.d;
        return layoutState == LayoutNode.LayoutState.LookaheadLayingOut || layoutState == LayoutNode.LayoutState.LookaheadMeasuring;
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.b;
    }

    @Override // defpackage.yuw
    public final LayoutDirection getLayoutDirection() {
        return this.a;
    }

    @Override // defpackage.tyu0
    public final List h0(Object obj, wls wlsVar) {
        i iVar = this.w;
        iVar.f();
        LayoutNode layoutNode = iVar.a;
        LayoutNode.LayoutState layoutState = layoutNode.b0.d;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
        if (layoutState != layoutState2 && layoutState != LayoutNode.LayoutState.LayingOut && layoutState != LayoutNode.LayoutState.LookaheadMeasuring && layoutState != LayoutNode.LayoutState.LookaheadLayingOut) {
            ixv.b("subcompose can only be used inside the measure or layout blocks");
        }
        hz40 hz40Var = iVar.z;
        Object d = hz40Var.d(obj);
        if (d == null) {
            d = (LayoutNode) iVar.C.m(obj);
            if (d != null) {
                if (iVar.H <= 0) {
                    ixv.b("Check failed.");
                }
                iVar.H--;
            } else {
                d = iVar.m(obj);
                if (d == null) {
                    int i = iVar.w;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.J = true;
                    layoutNode.z(layoutNode2, i);
                    layoutNode.J = false;
                    d = layoutNode2;
                }
            }
            hz40Var.o(obj, d);
        }
        LayoutNode layoutNode3 = (LayoutNode) d;
        if (kotlin.collections.a.S(iVar.w, layoutNode.l()) != layoutNode3) {
            int i2 = ((uz40) layoutNode.l()).a.i(layoutNode3);
            if (i2 < iVar.w) {
                ixv.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = iVar.w;
            if (i3 != i2) {
                iVar.h(i2, i3);
            }
        }
        iVar.w++;
        iVar.l(layoutNode3, obj, false, wlsVar);
        return (layoutState == layoutState2 || layoutState == LayoutNode.LayoutState.LayingOut) ? layoutNode3.j() : layoutNode3.i();
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.c;
    }
}
