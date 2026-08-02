package androidx.compose.ui.layout;

import android.view.ViewGroup;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.ui.node.LayoutNode;
import defpackage.ab70;
import defpackage.b64;
import defpackage.bts;
import defpackage.bud;
import defpackage.cmm0;
import defpackage.d1y;
import defpackage.dmm0;
import defpackage.dmw0;
import defpackage.dus0;
import defpackage.e1y;
import defpackage.fid;
import defpackage.gid;
import defpackage.gs90;
import defpackage.h1y;
import defpackage.hz40;
import defpackage.i1y;
import defpackage.i2t0;
import defpackage.ixv;
import defpackage.iz40;
import defpackage.jl40;
import defpackage.lid;
import defpackage.q2t0;
import defpackage.qgd;
import defpackage.qir;
import defpackage.rw80;
import defpackage.sls;
import defpackage.syu0;
import defpackage.tje;
import defpackage.tls;
import defpackage.ttd;
import defpackage.uyu0;
import defpackage.uz40;
import defpackage.vyu0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wz40;
import defpackage.zti0;
import defpackage.zy11;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes10.dex */
public final class i implements qgd {
    public int G;
    public int H;
    public final LayoutNode a;
    public ttd b;
    public vyu0 c;
    public int w;
    public int x;
    public final hz40 y = cmm0.b();
    public final hz40 z = cmm0.b();
    public final h A = new h(this);
    public final f B = new f(this);
    public final hz40 C = cmm0.b();
    public final uyu0 D = new uyu0(0);
    public final hz40 E = cmm0.b();
    public final wz40 F = new wz40(new Object[16]);
    public final String I = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public i(LayoutNode layoutNode, vyu0 vyu0Var) {
        this.a = layoutNode;
        this.c = vyu0Var;
    }

    public static final void a(i iVar, Object obj) {
        LayoutNode layoutNode = iVar.a;
        iVar.f();
        LayoutNode layoutNode2 = (LayoutNode) iVar.C.m(obj);
        if (layoutNode2 != null) {
            if (iVar.H <= 0) {
                ixv.b("No pre-composed items to dispose");
            }
            int i = ((uz40) layoutNode.l()).a.i(layoutNode2);
            if (i < ((uz40) layoutNode.l()).a.c - iVar.H) {
                ixv.b("Item is not in pre-composed item range");
            }
            iVar.G++;
            iVar.H--;
            e1y e1yVar = (e1y) iVar.y.d(layoutNode2);
            if (e1yVar != null) {
                c(e1yVar);
            }
            int i2 = (((uz40) layoutNode.l()).a.c - iVar.H) - iVar.G;
            iVar.h(i, i2);
            iVar.e(i2);
        }
        if (iVar.F.h(obj)) {
            LayoutNode.T(layoutNode, true, 6);
        }
    }

    public static void c(e1y e1yVar) {
        iz40 iz40Var;
        gs90 gs90Var = e1yVar.f;
        if (gs90Var != null) {
            gs90Var.h.set(PausedCompositionState.Cancelled);
            zti0 zti0Var = gs90Var.k;
            if (zti0Var.d.h()) {
                iz40Var = zti0Var.d;
                zti0Var.d = dmm0.a();
                zti0Var.c.g();
            } else {
                iz40Var = null;
            }
            zti0Var.b();
            bud budVar = gs90Var.a;
            budVar.J = null;
            if (iz40Var != null) {
                budVar.N.k = iz40Var;
                budVar.P = 2;
            }
            e1yVar.f = null;
            bud budVar2 = e1yVar.c;
            if (budVar2 != null) {
                budVar2.dispose();
            }
            e1yVar.c = null;
        }
    }

    public final void b(e1y e1yVar, boolean z) {
        gs90 gs90Var = e1yVar.f;
        if (gs90Var != null) {
            i2t0 D = tje.D();
            tls e = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            try {
                LayoutNode layoutNode = this.a;
                layoutNode.J = true;
                if (z) {
                    while (!gs90Var.e()) {
                        try {
                            gs90Var.i(new qir(23));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                gs90Var.a();
                e1yVar.f = null;
                layoutNode.J = false;
            } finally {
                tje.W(D, O, e);
            }
        }
    }

    public final syu0 d(Object obj) {
        return !this.a.F() ? new h1y() : new i1y(this, obj);
    }

    public final void e(int i) {
        boolean z;
        boolean z2 = false;
        this.G = 0;
        List l = this.a.l();
        uz40 uz40Var = (uz40) l;
        int i2 = (uz40Var.a.c - this.H) - 1;
        if (i <= i2) {
            this.D.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    this.D.a.a(((e1y) this.y.d((LayoutNode) uz40Var.get(i3))).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.e(this.D);
            i2t0 D = tje.D();
            tls e = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            z = false;
            while (i2 >= i) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((uz40) l).get(i2);
                    e1y e1yVar = (e1y) this.y.d(layoutNode);
                    Object obj = e1yVar.a;
                    if (this.D.a.c(obj)) {
                        this.G++;
                        if (((Boolean) e1yVar.g.getValue()).booleanValue()) {
                            androidx.compose.ui.node.j jVar = layoutNode.b0;
                            androidx.compose.ui.node.p pVar = jVar.p;
                            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                            pVar.E = usageByParent;
                            androidx.compose.ui.node.l lVar = jVar.q;
                            if (lVar != null) {
                                lVar.C = usageByParent;
                            }
                            k(e1yVar, false);
                            if (e1yVar.h) {
                                z = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.a;
                        layoutNode2.J = true;
                        this.y.m(layoutNode);
                        bud budVar = e1yVar.c;
                        if (budVar != null) {
                            budVar.dispose();
                        }
                        this.a.O(i2, 1);
                        layoutNode2.J = false;
                    }
                    this.z.m(obj);
                    i2--;
                } catch (Throwable th) {
                    tje.W(D, O, e);
                    throw th;
                }
            }
            tje.W(D, O, e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (q2t0.c) {
                iz40 iz40Var = q2t0.j.h;
                if (iz40Var != null) {
                    if (iz40Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                q2t0.a();
            }
        }
        f();
    }

    public final void f() {
        int i = ((uz40) this.a.l()).a.c;
        hz40 hz40Var = this.y;
        if (hz40Var.e != i) {
            ixv.a("Inconsistency between the count of nodes tracked by the state (" + hz40Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.G) - this.H < 0) {
            StringBuilder t = b64.t(i, "Incorrect state. Total children ", ". Reusable children ");
            t.append(this.G);
            t.append(". Precomposed children ");
            t.append(this.H);
            ixv.a(t.toString());
        }
        hz40 hz40Var2 = this.C;
        if (hz40Var2.e == this.H) {
            return;
        }
        ixv.a("Incorrect state. Precomposed children " + this.H + ". Map size " + hz40Var2.e);
    }

    public final void g(boolean z) {
        this.H = 0;
        this.C.h();
        List l = this.a.l();
        int i = ((uz40) l).a.c;
        if (this.G != i) {
            this.G = i;
            i2t0 D = tje.D();
            tls e = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((uz40) l).get(i2);
                    e1y e1yVar = (e1y) this.y.d(layoutNode);
                    if (e1yVar != null && ((Boolean) e1yVar.g.getValue()).booleanValue()) {
                        androidx.compose.ui.node.j jVar = layoutNode.b0;
                        androidx.compose.ui.node.p pVar = jVar.p;
                        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                        pVar.E = usageByParent;
                        androidx.compose.ui.node.l lVar = jVar.q;
                        if (lVar != null) {
                            lVar.C = usageByParent;
                        }
                        k(e1yVar, z);
                        e1yVar.a = e.a;
                    }
                } catch (Throwable th) {
                    tje.W(D, O, e);
                    throw th;
                }
            }
            tje.W(D, O, e);
            this.z.h();
        }
        f();
    }

    public final void h(int i, int i2) {
        LayoutNode layoutNode = this.a;
        layoutNode.J = true;
        layoutNode.J(i, i2, 1);
        layoutNode.J = false;
    }

    public final void i() {
        g(false);
    }

    public final void j(wls wlsVar, Object obj, boolean z) {
        LayoutNode layoutNode = this.a;
        if (layoutNode.F()) {
            f();
            if (this.z.b(obj)) {
                return;
            }
            this.E.m(obj);
            hz40 hz40Var = this.C;
            Object d = hz40Var.d(obj);
            if (d == null) {
                d = m(obj);
                if (d != null) {
                    h(((uz40) layoutNode.l()).a.i(d), ((uz40) layoutNode.l()).a.c);
                    this.H++;
                } else {
                    int i = ((uz40) layoutNode.l()).a.c;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.J = true;
                    layoutNode.z(layoutNode2, i);
                    layoutNode.J = false;
                    this.H++;
                    d = layoutNode2;
                }
                hz40Var.o(obj, d);
            }
            l((LayoutNode) d, obj, z, wlsVar);
        }
    }

    public final void k(final e1y e1yVar, boolean z) {
        bud budVar;
        if (z || !e1yVar.h) {
            e1yVar.g = androidx.compose.runtime.f.j(Boolean.FALSE);
        } else {
            e1yVar.g.setValue(Boolean.FALSE);
        }
        if (e1yVar.f != null) {
            c(e1yVar);
            return;
        }
        if (z) {
            bud budVar2 = e1yVar.c;
            if (budVar2 != null) {
                budVar2.o();
                return;
            }
            return;
        }
        rw80 outOfFrameExecutor = d1y.a(this.a).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.schedule(new sls() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$deactivateOutOfFrame$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    bud budVar3;
                    if (!((Boolean) e1y.this.g.getValue()).booleanValue() && (budVar3 = e1y.this.c) != null) {
                        budVar3.o();
                    }
                    return zy11.a;
                }
            });
        } else {
            if (e1yVar.h || (budVar = e1yVar.c) == null) {
                return;
            }
            budVar.o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:37:0x007b, B:40:0x0087, B:45:0x00b2, B:47:0x00c2, B:49:0x00d6, B:51:0x00da, B:52:0x010f, B:55:0x00e7, B:56:0x00f2, B:58:0x00f6, B:59:0x010c, B:60:0x00c5, B:63:0x0097, B:65:0x00a5, B:66:0x0119, B:67:0x0123), top: B:36:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:37:0x007b, B:40:0x0087, B:45:0x00b2, B:47:0x00c2, B:49:0x00d6, B:51:0x00da, B:52:0x010f, B:55:0x00e7, B:56:0x00f2, B:58:0x00f6, B:59:0x010c, B:60:0x00c5, B:63:0x0097, B:65:0x00a5, B:66:0x0119, B:67:0x0123), top: B:36:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:37:0x007b, B:40:0x0087, B:45:0x00b2, B:47:0x00c2, B:49:0x00d6, B:51:0x00da, B:52:0x010f, B:55:0x00e7, B:56:0x00f2, B:58:0x00f6, B:59:0x010c, B:60:0x00c5, B:63:0x0097, B:65:0x00a5, B:66:0x0119, B:67:0x0123), top: B:36:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:37:0x007b, B:40:0x0087, B:45:0x00b2, B:47:0x00c2, B:49:0x00d6, B:51:0x00da, B:52:0x010f, B:55:0x00e7, B:56:0x00f2, B:58:0x00f6, B:59:0x010c, B:60:0x00c5, B:63:0x0097, B:65:0x00a5, B:66:0x0119, B:67:0x0123), top: B:36:0x007b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(LayoutNode layoutNode, Object obj, boolean z, wls wlsVar) {
        boolean z2;
        bud budVar;
        hz40 hz40Var = this.y;
        Object d = hz40Var.d(layoutNode);
        Object obj2 = d;
        if (d == null) {
            ComposableSingletons$SubcomposeLayoutKt.a.getClass();
            androidx.compose.runtime.internal.a aVar = ComposableSingletons$SubcomposeLayoutKt.b;
            e1y e1yVar = new e1y();
            e1yVar.a = obj;
            e1yVar.b = aVar;
            e1yVar.c = null;
            e1yVar.g = androidx.compose.runtime.f.j(Boolean.TRUE);
            hz40Var.o(layoutNode, e1yVar);
            obj2 = e1yVar;
        }
        final e1y e1yVar2 = (e1y) obj2;
        boolean z3 = e1yVar2.b != wlsVar;
        if (e1yVar2.f != null) {
            if (z3) {
                c(e1yVar2);
            } else if (z) {
                return;
            } else {
                b(e1yVar2, true);
            }
        }
        bud budVar2 = e1yVar2.c;
        if (budVar2 != null) {
            synchronized (budVar2.w) {
                z2 = budVar2.G.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || e1yVar2.d) {
            e1yVar2.b = wlsVar;
            if (e1yVar2.f != null) {
                ixv.a("new subcompose call while paused composition is still active");
            }
            i2t0 D = tje.D();
            tls e = D != null ? D.e() : null;
            i2t0 O = tje.O(D);
            try {
                LayoutNode layoutNode2 = this.a;
                layoutNode2.J = true;
                bud budVar3 = e1yVar2.c;
                ttd ttdVar = this.b;
                if (ttdVar == null) {
                    ixv.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (budVar3 != null) {
                    if (budVar3.P == 3) {
                    }
                    e1yVar2.c = budVar3;
                    final wls wlsVar2 = e1yVar2.b;
                    if (d1y.a(this.a).getOutOfFrameExecutor() == null) {
                        e1yVar2.h = false;
                    } else {
                        e1yVar2.h = true;
                        wlsVar2 = new androidx.compose.runtime.internal.a(1524156494, new wls() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$4$1$composable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj3, Object obj4) {
                                fid fidVar = (fid) obj3;
                                int intValue = ((Number) obj4).intValue();
                                bts btsVar = (bts) fidVar;
                                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                                    Boolean bool = (Boolean) e1y.this.g.getValue();
                                    boolean booleanValue = bool.booleanValue();
                                    wls wlsVar3 = wlsVar2;
                                    btsVar.h0(bool);
                                    boolean a = btsVar.a(booleanValue);
                                    if (booleanValue) {
                                        wlsVar3.invoke(btsVar, 0);
                                    } else {
                                        if (btsVar.l != 0) {
                                            lid.a("No nodes can be emitted before calling deactivateToEndGroup");
                                        }
                                        if (!btsVar.S) {
                                            if (a) {
                                                dus0 dus0Var = btsVar.G;
                                                int i = dus0Var.g;
                                                int i2 = dus0Var.h;
                                                gid gidVar = btsVar.M;
                                                gidVar.getClass();
                                                gidVar.d(false);
                                                gidVar.b.a.d(ab70.c);
                                                wwg.c(i, i2, btsVar.s);
                                                btsVar.G.t();
                                            } else {
                                                btsVar.X();
                                            }
                                        }
                                    }
                                    if (btsVar.y && btsVar.G.i == btsVar.z) {
                                        btsVar.z = -1;
                                        btsVar.y = false;
                                    }
                                    btsVar.t(false);
                                } else {
                                    btsVar.Y();
                                }
                                return zy11.a;
                            }
                        }, true);
                    }
                    if (z) {
                        if (e1yVar2.e) {
                            budVar3.l();
                            budVar3.s();
                            bts btsVar = budVar3.O;
                            btsVar.g();
                            budVar3.Q = wlsVar2;
                            budVar3.a.a(budVar3, wlsVar2);
                            btsVar.f();
                        } else {
                            budVar3.A(wlsVar2);
                        }
                    } else if (e1yVar2.e) {
                        budVar3.l();
                        budVar3.s();
                        e1yVar2.f = budVar3.n(true, wlsVar2);
                    } else {
                        e1yVar2.f = budVar3.n(budVar3.l(), wlsVar2);
                    }
                    e1yVar2.e = false;
                    layoutNode2.J = false;
                    tje.W(D, O, e);
                    e1yVar2.d = false;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = androidx.compose.ui.platform.w.a;
                    budVar = new bud(ttdVar, new dmw0(layoutNode));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = androidx.compose.ui.platform.w.a;
                    budVar = new bud(ttdVar, new dmw0(layoutNode));
                }
                budVar3 = budVar;
                e1yVar2.c = budVar3;
                final wls wlsVar22 = e1yVar2.b;
                if (d1y.a(this.a).getOutOfFrameExecutor() == null) {
                }
                if (z) {
                }
                e1yVar2.e = false;
                layoutNode2.J = false;
                tje.W(D, O, e);
                e1yVar2.d = false;
            } catch (Throwable th) {
                tje.W(D, O, e);
                throw th;
            }
        }
    }

    public final LayoutNode m(Object obj) {
        hz40 hz40Var;
        int i;
        if (this.G == 0) {
            return null;
        }
        uz40 uz40Var = (uz40) this.a.l();
        int i2 = uz40Var.a.c - this.H;
        int i3 = i2 - this.G;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            hz40Var = this.y;
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (jl40.l(((e1y) hz40Var.d((LayoutNode) uz40Var.get(i5))).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                e1y e1yVar = (e1y) hz40Var.d((LayoutNode) uz40Var.get(i4));
                Object obj2 = e1yVar.a;
                if (obj2 == e.a || this.c.f(obj, obj2)) {
                    e1yVar.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            h(i5, i3);
        }
        this.G--;
        LayoutNode layoutNode = (LayoutNode) uz40Var.get(i3);
        e1y e1yVar2 = (e1y) hz40Var.d(layoutNode);
        e1yVar2.g = androidx.compose.runtime.f.j(Boolean.TRUE);
        e1yVar2.e = true;
        e1yVar2.d = true;
        return layoutNode;
    }

    @Override // defpackage.qgd
    public final void onDeactivate() {
        g(true);
    }

    @Override // defpackage.qgd
    public final void onRelease() {
        bud budVar;
        LayoutNode layoutNode = this.a;
        layoutNode.J = true;
        hz40 hz40Var = this.y;
        Object[] objArr = hz40Var.c;
        long[] jArr = hz40Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (budVar = ((e1y) objArr[(i << 3) + i3]).c) != null) {
                            budVar.dispose();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        layoutNode.N();
        layoutNode.J = false;
        hz40Var.h();
        this.z.h();
        this.H = 0;
        this.G = 0;
        this.C.h();
        f();
    }
}
