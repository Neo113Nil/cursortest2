package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LayoutNode;
import defpackage.ce60;
import defpackage.d1y;
import defpackage.e530;
import defpackage.f070;
import defpackage.gp50;
import defpackage.ixv;
import defpackage.izx;
import defpackage.jl40;
import defpackage.k390;
import defpackage.lqh;
import defpackage.n8e;
import defpackage.nfh;
import defpackage.qje;
import defpackage.sls;
import defpackage.t300;
import defpackage.tls;
import defpackage.udq0;
import defpackage.w511;
import defpackage.wz40;
import defpackage.y910;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class n {
    public final LayoutNode a;
    public final nfh b;
    public boolean c;
    public boolean d;
    public final f070 e;
    public final wz40 f;
    public final long g;
    public final wz40 h;
    public n8e i;

    public n(LayoutNode layoutNode) {
        this.a = layoutNode;
        nfh nfhVar = new nfh();
        nfhVar.a = new gp50(14);
        nfhVar.b = new gp50(14);
        nfhVar.c = new gp50(14);
        this.b = nfhVar;
        this.e = new f070();
        this.f = new wz40(new k390[16]);
        this.g = 1L;
        this.h = new wz40(new y910[16]);
    }

    public static final boolean a(n nVar, LayoutNode layoutNode, boolean z) {
        o.a placementScope;
        f fVar;
        LayoutNode s;
        LayoutNode layoutNode2 = nVar.a;
        boolean z2 = layoutNode.l0;
        j jVar = layoutNode.b0;
        if (!z2 && k(layoutNode)) {
            n8e n8eVar = layoutNode == layoutNode2 ? nVar.i : null;
            if (z) {
                r3 = jVar.e ? c(layoutNode, n8eVar) : false;
                if ((r3 || jVar.f) && jl40.l(layoutNode.H(), Boolean.TRUE)) {
                    layoutNode.I();
                }
            } else {
                boolean d = layoutNode.o() ? d(layoutNode, n8eVar) : false;
                if (layoutNode.n() && (layoutNode == layoutNode2 || ((s = layoutNode.s()) != null && s.G() && jVar.p.N))) {
                    if (layoutNode == layoutNode2) {
                        if (layoutNode.V == LayoutNode.UsageByParent.NotUsed) {
                            layoutNode.d();
                        }
                        LayoutNode s2 = layoutNode.s();
                        if (s2 == null || (fVar = (f) s2.a0.d) == null || (placementScope = fVar.E) == null) {
                            placementScope = d1y.a(layoutNode).getPlacementScope();
                        }
                        o.a.o(placementScope, jVar.p, 0, 0);
                    } else {
                        layoutNode.P();
                    }
                    f070 f070Var = nVar.e;
                    f070Var.getClass();
                    if (layoutNode.k0 > 0) {
                        f070Var.a.b(layoutNode);
                        layoutNode.j0 = true;
                    }
                }
                r3 = d;
            }
            nVar.e();
        }
        return r3;
    }

    public static boolean c(LayoutNode layoutNode, n8e n8eVar) {
        boolean U0;
        LayoutNode layoutNode2 = layoutNode.A;
        j jVar = layoutNode.b0;
        if (layoutNode2 == null) {
            return false;
        }
        if (n8eVar != null) {
            if (layoutNode2 != null) {
                U0 = jVar.q.U0(n8eVar.a);
            }
            U0 = false;
        } else {
            l lVar = jVar.q;
            n8e C0 = lVar != null ? lVar.C0() : null;
            if (C0 != null && layoutNode.A != null) {
                U0 = jVar.q.U0(C0.a);
            }
            U0 = false;
        }
        LayoutNode s = layoutNode.s();
        if (U0 && s != null) {
            if (s.A == null) {
                LayoutNode.T(s, false, 3);
                return U0;
            }
            if (layoutNode.q() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.R(s, false, 3);
                return U0;
            }
            if (layoutNode.q() == LayoutNode.UsageByParent.InLayoutBlock) {
                s.Q(false);
            }
        }
        return U0;
    }

    public static boolean d(LayoutNode layoutNode, n8e n8eVar) {
        boolean z;
        if (n8eVar != null) {
            if (layoutNode.V == LayoutNode.UsageByParent.NotUsed) {
                layoutNode.c();
            }
            z = layoutNode.b0.p.J0(n8eVar.a);
        } else {
            p pVar = layoutNode.b0.p;
            n8e n8eVar2 = pVar.C ? new n8e(pVar.w) : null;
            if (n8eVar2 != null) {
                if (layoutNode.V == LayoutNode.UsageByParent.NotUsed) {
                    layoutNode.c();
                }
                z = layoutNode.b0.p.J0(n8eVar2.a);
            } else {
                z = false;
            }
        }
        LayoutNode s = layoutNode.s();
        if (z && s != null) {
            if (layoutNode.p() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.T(s, false, 3);
                return z;
            }
            if (layoutNode.p() == LayoutNode.UsageByParent.InLayoutBlock) {
                s.S(false);
            }
        }
        return z;
    }

    public static boolean i(LayoutNode layoutNode) {
        l lVar;
        a b;
        if (layoutNode.b0.e) {
            return (layoutNode.q() == LayoutNode.UsageByParent.NotUsed && ((lVar = layoutNode.b0.q) == null || (b = lVar.b()) == null || !b.f())) ? false : true;
        }
        return false;
    }

    public static boolean j(LayoutNode layoutNode) {
        if (!layoutNode.o()) {
            return false;
        }
        do {
            if (layoutNode.p() == LayoutNode.UsageByParent.NotUsed && !layoutNode.b0.p.R.f()) {
                LayoutNode s = layoutNode.s();
                if ((s != null ? s.b0.d : null) != LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.s();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.G());
        return true;
    }

    public static boolean k(LayoutNode layoutNode) {
        l lVar;
        a b;
        boolean G = layoutNode.G();
        j jVar = layoutNode.b0;
        return G || jVar.p.N || j(layoutNode) || jl40.l(layoutNode.H(), Boolean.TRUE) || i(layoutNode) || jVar.p.R.f() || !((lVar = jVar.q) == null || (b = lVar.b()) == null || !b.f());
    }

    public final void b(boolean z) {
        f070 f070Var = this.e;
        if (z) {
            wz40 wz40Var = f070Var.a;
            LayoutNode layoutNode = this.a;
            if (layoutNode.k0 > 0) {
                wz40Var.g();
                wz40Var.b(layoutNode);
                layoutNode.j0 = true;
            }
        }
        if (f070Var.a.c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                f070Var.a();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        wz40 wz40Var = this.h;
        int i = wz40Var.c;
        if (i != 0) {
            Object[] objArr = wz40Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                y910 y910Var = (y910) objArr[i2];
                if (y910Var.a.F()) {
                    boolean z = y910Var.b;
                    LayoutNode layoutNode = y910Var.a;
                    boolean z2 = y910Var.c;
                    if (z) {
                        LayoutNode.R(layoutNode, z2, 2);
                    } else {
                        LayoutNode.T(layoutNode, z2, 2);
                    }
                }
            }
            wz40Var.g();
        }
    }

    public final void f(LayoutNode layoutNode) {
        wz40 x = layoutNode.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (jl40.l(layoutNode2.H(), Boolean.TRUE) && !layoutNode2.l0) {
                if (this.b.n(layoutNode2)) {
                    layoutNode2.I();
                }
                f(layoutNode2);
            }
        }
    }

    public final void g(LayoutNode layoutNode, boolean z) {
        if (!this.c) {
            ixv.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? layoutNode.b0.e : layoutNode.o()) {
            ixv.a("node not yet measured");
        }
        h(layoutNode, z);
    }

    public final void h(LayoutNode layoutNode, boolean z) {
        l lVar;
        a b;
        wz40 x = layoutNode.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if ((!z && (layoutNode2.p() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode2.b0.p.R.f())) || (z && (layoutNode2.q() == LayoutNode.UsageByParent.InMeasureBlock || ((lVar = layoutNode2.b0.q) != null && (b = lVar.b()) != null && b.f())))) {
                boolean D = udq0.D(layoutNode2);
                j jVar = layoutNode2.b0;
                if (D && !z) {
                    if (jVar.e && this.b.n(layoutNode2)) {
                        o(layoutNode2, true);
                    } else {
                        g(layoutNode2, true);
                    }
                }
                if (z ? jVar.e : layoutNode2.o()) {
                    o(layoutNode2, z);
                }
                if (!(z ? jVar.e : layoutNode2.o())) {
                    h(layoutNode2, z);
                }
            }
        }
        if (z ? layoutNode.b0.e : layoutNode.o()) {
            o(layoutNode, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [e530] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean l(sls slsVar) {
        boolean z;
        e530 parent$ui;
        e530 e530Var;
        boolean z2;
        LayoutNode layoutNode;
        boolean z3;
        boolean o;
        nfh nfhVar = this.b;
        LayoutNode layoutNode2 = this.a;
        if (!layoutNode2.F()) {
            ixv.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.G()) {
            ixv.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            ixv.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean x = nfhVar.x();
                gp50 gp50Var = (gp50) nfhVar.a;
                if (x) {
                    z = false;
                    while (true) {
                        gp50 gp50Var2 = (gp50) nfhVar.c;
                        gp50 gp50Var3 = (gp50) nfhVar.b;
                        if (!((SortedSet) gp50Var.b).isEmpty()) {
                            layoutNode = (LayoutNode) ((SortedSet) gp50Var.b).first();
                            gp50Var.M(layoutNode);
                            z3 = layoutNode.A != null;
                            z2 = false;
                        } else if (!((SortedSet) gp50Var3.b).isEmpty()) {
                            layoutNode = (LayoutNode) ((SortedSet) gp50Var3.b).first();
                            gp50Var3.M(layoutNode);
                            z3 = layoutNode.A != null;
                            z2 = true;
                        } else {
                            if (((SortedSet) gp50Var2.b).isEmpty()) {
                                break;
                            }
                            LayoutNode layoutNode3 = (LayoutNode) ((SortedSet) gp50Var2.b).first();
                            gp50Var2.M(layoutNode3);
                            z2 = true;
                            layoutNode = layoutNode3;
                            z3 = false;
                        }
                        if (z2) {
                            o = a(this, layoutNode, z3);
                        } else {
                            o = o(layoutNode, z3);
                            if (layoutNode.b0.f) {
                                nfhVar.b(layoutNode, Invalidation.LookaheadPlacement);
                            }
                            if (layoutNode.n()) {
                                nfhVar.b(layoutNode, Invalidation.Placement);
                            }
                        }
                        if (layoutNode == layoutNode2 && o) {
                            z = true;
                        }
                    }
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        wz40 wz40Var = this.f;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        int i2 = 0;
        while (i2 < i) {
            t300 t300Var = ((LayoutNode) ((k390) objArr[i2])).a0;
            f fVar = (f) t300Var.d;
            boolean h = ce60.h(SelfTester_JCP.ENCRYPT_CBC);
            if (h) {
                parent$ui = fVar.q0;
            } else {
                parent$ui = fVar.q0.getParent$ui();
                if (parent$ui == null) {
                    i2++;
                    z4 = false;
                }
            }
            tls tlsVar = s.j0;
            e530 d1 = fVar.d1(h);
            while (d1 != null && (d1.getAggregateChildKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                if ((d1.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                    lqh lqhVar = d1;
                    wz40 wz40Var2 = null;
                    while (lqhVar != 0) {
                        if (lqhVar instanceof izx) {
                            ((izx) lqhVar).A((f) t300Var.d);
                        } else if ((lqhVar.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0 && (lqhVar instanceof lqh)) {
                            e530 e530Var2 = lqhVar.b;
                            ?? r15 = z4;
                            e530Var = lqhVar;
                            wz40Var2 = wz40Var2;
                            while (e530Var2 != null) {
                                if ((e530Var2.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                                    r15++;
                                    wz40Var2 = wz40Var2;
                                    if (r15 == 1) {
                                        e530Var = e530Var2;
                                    } else {
                                        if (wz40Var2 == null) {
                                            wz40Var2 = new wz40(new e530[16]);
                                        }
                                        if (e530Var != null) {
                                            wz40Var2.b(e530Var);
                                            e530Var = null;
                                        }
                                        wz40Var2.b(e530Var2);
                                    }
                                }
                                e530Var2 = e530Var2.getChild$ui();
                                e530Var = e530Var;
                                wz40Var2 = wz40Var2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z4 = false;
                                lqhVar = e530Var;
                                wz40Var2 = wz40Var2;
                            }
                        }
                        e530Var = qje.c(wz40Var2);
                        z4 = false;
                        lqhVar = e530Var;
                        wz40Var2 = wz40Var2;
                    }
                }
                if (d1 != parent$ui) {
                    d1 = d1.getChild$ui();
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        wz40Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void m(LayoutNode layoutNode, long j) {
        int i;
        e530 parent$ui;
        if (layoutNode.l0) {
            return;
        }
        LayoutNode layoutNode2 = this.a;
        if (layoutNode == layoutNode2) {
            ixv.a("measureAndLayout called on root");
        }
        if (!layoutNode2.F()) {
            ixv.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.G()) {
            ixv.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            ixv.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                nfh nfhVar = this.b;
                ((gp50) nfhVar.a).M(layoutNode);
                ((gp50) nfhVar.b).M(layoutNode);
                ((gp50) nfhVar.c).M(layoutNode);
                if ((c(layoutNode, new n8e(j)) || layoutNode.b0.f) && jl40.l(layoutNode.H(), Boolean.TRUE)) {
                    layoutNode.I();
                }
                f(layoutNode);
                d(layoutNode, new n8e(j));
                if (layoutNode.n() && layoutNode.G()) {
                    layoutNode.P();
                    f070 f070Var = this.e;
                    f070Var.getClass();
                    if (layoutNode.k0 > 0) {
                        f070Var.a.b(layoutNode);
                        layoutNode.j0 = true;
                    }
                }
                e();
            } finally {
            }
        }
        wz40 wz40Var = this.f;
        Object[] objArr = wz40Var.a;
        int i2 = wz40Var.c;
        for (0; i < i2; i + 1) {
            t300 t300Var = ((LayoutNode) ((k390) objArr[i])).a0;
            f fVar = (f) t300Var.d;
            if (ce60.h(SelfTester_JCP.ENCRYPT_CBC)) {
                parent$ui = fVar.q0;
            } else {
                parent$ui = fVar.q0.getParent$ui();
                i = parent$ui == null ? i + 1 : 0;
            }
            tls tlsVar = s.j0;
            for (e530 d1 = fVar.d1(r5); d1 != null && (d1.getAggregateChildKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0; d1 = d1.getChild$ui()) {
                if ((d1.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                    lqh lqhVar = d1;
                    ?? r8 = 0;
                    while (lqhVar != 0) {
                        if (lqhVar instanceof izx) {
                            ((izx) lqhVar).A((f) t300Var.d);
                        } else if ((lqhVar.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0 && (lqhVar instanceof lqh)) {
                            e530 e530Var = lqhVar.b;
                            int i3 = 0;
                            lqhVar = lqhVar;
                            r8 = r8;
                            while (e530Var != null) {
                                if ((e530Var.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                                    i3++;
                                    r8 = r8;
                                    if (i3 == 1) {
                                        lqhVar = e530Var;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new wz40(new e530[16]);
                                        }
                                        if (lqhVar != 0) {
                                            r8.b(lqhVar);
                                            lqhVar = 0;
                                        }
                                        r8.b(e530Var);
                                    }
                                }
                                e530Var = e530Var.getChild$ui();
                                lqhVar = lqhVar;
                                r8 = r8;
                            }
                            if (i3 == 1) {
                            }
                        }
                        lqhVar = qje.c(r8);
                    }
                }
                if (d1 != parent$ui) {
                }
            }
        }
        wz40Var.g();
    }

    public final void n() {
        nfh nfhVar = this.b;
        if (nfhVar.x()) {
            LayoutNode layoutNode = this.a;
            if (!layoutNode.F()) {
                ixv.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.G()) {
                ixv.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                ixv.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((SortedSet) ((gp50) nfhVar.c).b).isEmpty() || ((SortedSet) ((gp50) nfhVar.a).b).isEmpty()) ? false : true) {
                        if (layoutNode.A != null) {
                            q(layoutNode, true);
                        } else {
                            p(layoutNode);
                        }
                    }
                    q(layoutNode, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean o(LayoutNode layoutNode, boolean z) {
        boolean z2 = false;
        if (!layoutNode.l0 && k(layoutNode)) {
            n8e n8eVar = layoutNode == this.a ? this.i : null;
            if (z) {
                if (layoutNode.b0.e) {
                    z2 = c(layoutNode, n8eVar);
                }
            } else if (layoutNode.o()) {
                z2 = d(layoutNode, n8eVar);
            }
            e();
        }
        return z2;
    }

    public final void p(LayoutNode layoutNode) {
        wz40 x = layoutNode.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.p() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode2.b0.p.R.f()) {
                if (udq0.D(layoutNode2)) {
                    q(layoutNode2, true);
                } else {
                    p(layoutNode2);
                }
            }
        }
    }

    public final void q(LayoutNode layoutNode, boolean z) {
        if (layoutNode.l0) {
            return;
        }
        n8e n8eVar = layoutNode == this.a ? this.i : null;
        if (z) {
            c(layoutNode, n8eVar);
        } else {
            d(layoutNode, n8eVar);
        }
    }

    public final boolean r(LayoutNode layoutNode, boolean z) {
        int i = m.a[layoutNode.b0.d.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.h.b(new y910(layoutNode, false, z));
            } else {
                if (i != 5) {
                    w511.b();
                    return false;
                }
                if (!layoutNode.o() || z) {
                    layoutNode.b0.p.O = true;
                    if (!layoutNode.l0 && (layoutNode.G() || j(layoutNode))) {
                        LayoutNode s = layoutNode.s();
                        if (s == null || !s.o()) {
                            this.b.b(layoutNode, Invalidation.Measurement);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        n8e n8eVar = this.i;
        if (n8eVar == null ? false : n8e.c(n8eVar.a, j)) {
            return;
        }
        if (this.c) {
            ixv.a("updateRootConstraints called while measuring");
        }
        this.i = new n8e(j);
        LayoutNode layoutNode = this.a;
        LayoutNode layoutNode2 = layoutNode.A;
        j jVar = layoutNode.b0;
        if (layoutNode2 != null) {
            jVar.e = true;
        }
        jVar.p.O = true;
        this.b.b(layoutNode, layoutNode2 != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
    }
}
