package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aa10;
import defpackage.e1y;
import defpackage.hz40;
import defpackage.ixv;
import defpackage.tls;
import defpackage.tyu0;
import defpackage.uz40;
import defpackage.wls;
import defpackage.wz40;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class f implements tyu0, k {
    public final /* synthetic */ h a;
    public final /* synthetic */ i b;

    public f(i iVar) {
        this.b = iVar;
        this.a = iVar.A;
    }

    @Override // androidx.compose.ui.layout.k
    public final aa10 E(int i, int i2, Map map, tls tlsVar, tls tlsVar2) {
        return this.a.E(i, i2, map, tlsVar, tlsVar2);
    }

    @Override // defpackage.fwi
    public final float H(int i) {
        return this.a.H(i);
    }

    @Override // defpackage.fwi
    public final float I(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.fwi
    public final long R(long j) {
        return this.a.R(j);
    }

    @Override // defpackage.fwi
    public final long W(float f) {
        return this.a.W(f);
    }

    @Override // defpackage.yuw
    public final boolean d0() {
        return this.a.d0();
    }

    @Override // defpackage.fwi
    public final long f(long j) {
        return this.a.f(j);
    }

    @Override // defpackage.fwi
    public final int f0(float f) {
        return this.a.f0(f);
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.a.b;
    }

    @Override // defpackage.yuw
    public final LayoutDirection getLayoutDirection() {
        return this.a.a;
    }

    @Override // defpackage.tyu0
    public final List h0(Object obj, wls wlsVar) {
        i iVar = this.b;
        LayoutNode layoutNode = iVar.a;
        hz40 hz40Var = iVar.z;
        LayoutNode layoutNode2 = (LayoutNode) hz40Var.d(obj);
        if (layoutNode2 != null && ((uz40) layoutNode.l()).a.i(layoutNode2) < iVar.w) {
            return layoutNode2.j();
        }
        hz40 hz40Var2 = iVar.E;
        hz40 hz40Var3 = iVar.C;
        wz40 wz40Var = iVar.F;
        if (wz40Var.c < iVar.x) {
            ixv.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        LayoutNode layoutNode3 = (LayoutNode) hz40Var.d(obj);
        int i = wz40Var.c;
        int i2 = iVar.x;
        if (i == i2) {
            wz40Var.b(obj);
        } else {
            Object[] objArr = wz40Var.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        iVar.x++;
        boolean a = hz40Var3.a(obj);
        if (a || layoutNode3 != null) {
            if (!a && layoutNode3 != null) {
                iVar.h(((uz40) layoutNode.l()).a.i(layoutNode3), ((uz40) layoutNode.l()).a.c);
                iVar.H++;
                hz40Var.m(obj);
                hz40Var3.o(obj, layoutNode3);
                hz40Var2.o(obj, iVar.d(obj));
                if (layoutNode.F()) {
                    iVar.f();
                }
            }
            LayoutNode layoutNode4 = (LayoutNode) hz40Var3.d(obj);
            e1y e1yVar = layoutNode4 != null ? (e1y) iVar.y.d(layoutNode4) : null;
            if (e1yVar != null && e1yVar.d) {
                iVar.l(layoutNode4, obj, false, wlsVar);
            }
            if ((e1yVar != null ? e1yVar.f : null) != null) {
                iVar.b(e1yVar, true);
            }
        } else {
            iVar.j(wlsVar, obj, false);
            hz40Var2.o(obj, iVar.d(obj));
        }
        LayoutNode layoutNode5 = (LayoutNode) hz40Var3.d(obj);
        if (layoutNode5 == null) {
            return EmptyList.a;
        }
        List A0 = layoutNode5.b0.p.A0();
        int size = A0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((androidx.compose.ui.node.p) ((uz40) A0).get(i3)).y.b = true;
        }
        return A0;
    }

    @Override // defpackage.fwi
    public final float i(long j) {
        return this.a.i(j);
    }

    @Override // defpackage.fwi
    public final float i0(long j) {
        return this.a.i0(j);
    }

    @Override // defpackage.fwi
    public final long n(float f) {
        return this.a.n(f);
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.a.c;
    }

    @Override // androidx.compose.ui.layout.k
    public final aa10 w(int i, int i2, Map map, tls tlsVar) {
        return this.a.E(i, i2, map, null, tlsVar);
    }

    @Override // defpackage.fwi
    public final float w0(float f) {
        return this.a.getDensity() * f;
    }
}
