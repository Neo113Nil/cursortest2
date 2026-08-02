package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.a7u0;
import defpackage.aji0;
import defpackage.b1y;
import defpackage.c530;
import defpackage.c9v;
import defpackage.cnq0;
import defpackage.cnu;
import defpackage.d1y;
import defpackage.d530;
import defpackage.dnq0;
import defpackage.e530;
import defpackage.f530;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.gnq0;
import defpackage.gud;
import defpackage.gwd0;
import defpackage.hud;
import defpackage.ixv;
import defpackage.j390;
import defpackage.jhd;
import defpackage.jl40;
import defpackage.k390;
import defpackage.k4o;
import defpackage.kjz;
import defpackage.kpb1;
import defpackage.lqh;
import defpackage.m390;
import defpackage.n0y;
import defpackage.n390;
import defpackage.n8e;
import defpackage.ny61;
import defpackage.o2f;
import defpackage.ohd;
import defpackage.oyr;
import defpackage.qgd;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.t300;
import defpackage.tls;
import defpackage.uh6;
import defpackage.uz40;
import defpackage.v7x0;
import defpackage.wz40;
import defpackage.x4e;
import defpackage.xbb1;
import defpackage.xp31;
import defpackage.xti0;
import defpackage.y0y;
import defpackage.yci0;
import defpackage.yd60;
import defpackage.ytd;
import defpackage.z0y;
import defpackage.z910;
import defpackage.ztd;
import defpackage.zy11;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class LayoutNode implements qgd, xti0, n390, n0y, dnq0, ohd, k390 {
    public static final sls n0 = null;
    public LayoutNode A;
    public int B;
    public final kjz C;
    public wz40 D;
    public boolean E;
    public LayoutNode F;
    public m390 G;
    public AndroidViewHolder H;
    public int I;
    public boolean J;
    public boolean K;
    public cnq0 L;
    public boolean M;
    public final wz40 N;
    public boolean O;
    public z910 P;
    public c9v Q;
    public fwi R;
    public LayoutDirection S;
    public xp31 T;
    public hud U;
    public UsageByParent V;
    public UsageByParent W;
    public boolean Z;
    public final boolean a;
    public final t300 a0;
    public int b;
    public final j b0;
    public boolean c;
    public androidx.compose.ui.layout.i c0;
    public s d0;
    public boolean e0;
    public f530 f0;
    public f530 g0;
    public tls h0;
    public tls i0;
    public boolean j0;
    public int k0;
    public boolean l0;
    public long w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final z0y m0 = new z0y("Undefined intrinsics block and it is required");
    public static final y0y o0 = new y0y();
    public static final o2f p0 = new o2f(3);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LayoutState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LayoutState[] $VALUES;
        public static final LayoutState Idle;
        public static final LayoutState LayingOut;
        public static final LayoutState LookaheadLayingOut;
        public static final LayoutState LookaheadMeasuring;
        public static final LayoutState Measuring;

        static {
            LayoutState layoutState = new LayoutState("Measuring", 0);
            Measuring = layoutState;
            LayoutState layoutState2 = new LayoutState("LookaheadMeasuring", 1);
            LookaheadMeasuring = layoutState2;
            LayoutState layoutState3 = new LayoutState("LayingOut", 2);
            LayingOut = layoutState3;
            LayoutState layoutState4 = new LayoutState("LookaheadLayingOut", 3);
            LookaheadLayingOut = layoutState4;
            LayoutState layoutState5 = new LayoutState("Idle", 4);
            Idle = layoutState5;
            LayoutState[] layoutStateArr = {layoutState, layoutState2, layoutState3, layoutState4, layoutState5};
            $VALUES = layoutStateArr;
            $ENTRIES = kotlin.enums.a.a(layoutStateArr);
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UsageByParent {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ UsageByParent[] $VALUES;
        public static final UsageByParent InLayoutBlock;
        public static final UsageByParent InMeasureBlock;
        public static final UsageByParent NotUsed;

        static {
            UsageByParent usageByParent = new UsageByParent("InMeasureBlock", 0);
            InMeasureBlock = usageByParent;
            UsageByParent usageByParent2 = new UsageByParent("InLayoutBlock", 1);
            InLayoutBlock = usageByParent2;
            UsageByParent usageByParent3 = new UsageByParent("NotUsed", 2);
            NotUsed = usageByParent3;
            UsageByParent[] usageByParentArr = {usageByParent, usageByParent2, usageByParent3};
            $VALUES = usageByParentArr;
            $ENTRIES = kotlin.enums.a.a(usageByParentArr);
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) $VALUES.clone();
        }
    }

    public LayoutNode(boolean z, int i) {
        this.a = z;
        this.b = i;
        this.w = 9223372034707292159L;
        this.x = true;
        this.y = true;
        this.C = new kjz(9, new wz40(new LayoutNode[16]), new LayoutNode$_foldedChildren$1(this));
        this.N = new wz40(new LayoutNode[16]);
        this.O = true;
        this.P = m0;
        this.R = d1y.a;
        this.S = LayoutDirection.Ltr;
        this.T = o0;
        hud.I1.getClass();
        this.U = gud.b;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.V = usageByParent;
        this.W = usageByParent;
        this.a0 = new t300(this);
        this.b0 = new j(this);
        this.e0 = true;
        this.f0 = c530.a;
    }

    public static void R(LayoutNode layoutNode, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.A == null) {
            ixv.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        m390 m390Var = layoutNode.G;
        if (m390Var == null || layoutNode.J || layoutNode.a) {
            return;
        }
        m390Var.onRequestMeasure(layoutNode, true, z, z2);
        if (z3) {
            layoutNode.b0.q.I0(z);
        }
    }

    public static void T(LayoutNode layoutNode, boolean z, int i) {
        m390 m390Var;
        LayoutNode s;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (layoutNode.J || layoutNode.a || (m390Var = layoutNode.G) == null) {
            return;
        }
        m390Var.onRequestMeasure(layoutNode, false, z, z2);
        if (z3) {
            j jVar = layoutNode.b0.p.y;
            LayoutNode s2 = jVar.a.s();
            UsageByParent usageByParent = jVar.a.V;
            if (s2 == null || usageByParent == UsageByParent.NotUsed) {
                return;
            }
            while (s2.V == usageByParent && (s = s2.s()) != null) {
                s2 = s;
            }
            int i2 = o.b[usageByParent.ordinal()];
            if (i2 == 1) {
                T(s2, z, 6);
            } else if (i2 == 2) {
                s2.S(z);
            } else {
                ny61.r("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void U(LayoutNode layoutNode) {
        int i = i.a[layoutNode.b0.d.ordinal()];
        j jVar = layoutNode.b0;
        if (i != 1) {
            yci0.t(jVar.d, "Unexpected state ");
            return;
        }
        if (jVar.e) {
            R(layoutNode, true, 6);
            return;
        }
        if (jVar.f) {
            layoutNode.Q(true);
        }
        if (layoutNode.o()) {
            T(layoutNode, true, 6);
        } else if (layoutNode.n()) {
            layoutNode.S(true);
        }
    }

    private final String g(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(layoutNode);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(e(0));
        sb.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode.F;
        sb.append(layoutNode2 != null ? layoutNode2.e(0) : null);
        return sb.toString();
    }

    public final void A() {
        if (this.e0) {
            t300 t300Var = this.a0;
            s sVar = (f) t300Var.d;
            s sVar2 = ((s) t300Var.e).K;
            this.d0 = null;
            while (true) {
                if (jl40.l(sVar, sVar2)) {
                    break;
                }
                if ((sVar != null ? sVar.h0 : null) != null) {
                    this.d0 = sVar;
                    break;
                }
                sVar = sVar != null ? sVar.K : null;
            }
            this.e0 = false;
        }
        s sVar3 = this.d0;
        if (sVar3 != null && sVar3.h0 == null) {
            throw x4e.v("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (sVar3 != null) {
            sVar3.i1();
            return;
        }
        LayoutNode s = s();
        if (s != null) {
            s.A();
            return;
        }
        m390 m390Var = this.G;
        if (m390Var != null) {
            m390Var.invalidateRootLayer();
        }
    }

    public final void B() {
        t300 t300Var = this.a0;
        s sVar = (s) t300Var.e;
        f fVar = (f) t300Var.d;
        while (sVar != fVar) {
            g gVar = (g) sVar;
            j390 j390Var = gVar.h0;
            if (j390Var != null) {
                j390Var.invalidate();
            }
            sVar = gVar.J;
        }
        j390 j390Var2 = ((f) t300Var.d).h0;
        if (j390Var2 != null) {
            j390Var2.invalidate();
        }
    }

    public final void C() {
        if (this.a) {
            LayoutNode s = s();
            if (s != null) {
                s.C();
                return;
            }
            return;
        }
        if (this.A != null) {
            R(this, false, 7);
        } else {
            T(this, false, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, cnq0] */
    public final void D() {
        if (this.M) {
            return;
        }
        if (((yd60) this.a0.c).getChild$ui() != null || this.g0 != null) {
            this.K = true;
            return;
        }
        cnq0 cnq0Var = this.L;
        this.M = true;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new cnq0();
        w snapshotObserver = d1y.a(this).getSnapshotObserver();
        sls slsVar = new sls() { // from class: androidx.compose.ui.node.LayoutNode$calculateSemanticsConfiguration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [e530] */
            /* JADX WARN: Type inference failed for: r2v10 */
            /* JADX WARN: Type inference failed for: r2v11 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [e530] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r2v9 */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3, types: [wz40] */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v5 */
            /* JADX WARN: Type inference failed for: r3v6, types: [wz40] */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r3v9 */
            /* JADX WARN: Type inference failed for: r4v7, types: [T, cnq0] */
            @Override // defpackage.sls
            public final Object invoke() {
                t300 t300Var = LayoutNode.this.a0;
                Ref$ObjectRef<cnq0> ref$ObjectRef2 = ref$ObjectRef;
                if ((((e530) t300Var.g).getAggregateChildKindSet$ui() & 8) != 0) {
                    for (e530 e530Var = (v7x0) t300Var.f; e530Var != null; e530Var = e530Var.getParent$ui()) {
                        if ((e530Var.getKindSet$ui() & 8) != 0) {
                            lqh lqhVar = e530Var;
                            ?? r3 = 0;
                            while (lqhVar != 0) {
                                if (lqhVar instanceof gnq0) {
                                    gnq0 gnq0Var = (gnq0) lqhVar;
                                    if (gnq0Var.b0()) {
                                        ?? cnq0Var2 = new cnq0();
                                        ref$ObjectRef2.element = cnq0Var2;
                                        cnq0Var2.w = true;
                                    }
                                    if (gnq0Var.T()) {
                                        ref$ObjectRef2.element.c = true;
                                    }
                                    gnq0Var.u(ref$ObjectRef2.element);
                                } else if ((lqhVar.getKindSet$ui() & 8) != 0 && (lqhVar instanceof lqh)) {
                                    e530 e530Var2 = lqhVar.b;
                                    int i = 0;
                                    lqhVar = lqhVar;
                                    r3 = r3;
                                    while (e530Var2 != null) {
                                        if ((e530Var2.getKindSet$ui() & 8) != 0) {
                                            i++;
                                            r3 = r3;
                                            if (i == 1) {
                                                lqhVar = e530Var2;
                                            } else {
                                                if (r3 == 0) {
                                                    r3 = new wz40(new e530[16]);
                                                }
                                                if (lqhVar != 0) {
                                                    r3.b(lqhVar);
                                                    lqhVar = 0;
                                                }
                                                r3.b(e530Var2);
                                            }
                                        }
                                        e530Var2 = e530Var2.getChild$ui();
                                        lqhVar = lqhVar;
                                        r3 = r3;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lqhVar = qje.c(r3);
                            }
                        }
                    }
                }
                return zy11.a;
            }
        };
        snapshotObserver.a.c(this, snapshotObserver.d, slsVar);
        this.M = false;
        this.L = (cnq0) ref$ObjectRef.element;
        this.K = false;
        m390 a = d1y.a(this);
        a.getSemanticsOwner().b(this, cnq0Var);
        a.onSemanticsChange();
    }

    public final void E() {
        LayoutNode layoutNode;
        if (this.B > 0) {
            this.E = true;
        }
        if (!this.a || (layoutNode = this.F) == null) {
            return;
        }
        layoutNode.E();
    }

    public final boolean F() {
        return this.G != null;
    }

    public final boolean G() {
        return this.b0.p.M;
    }

    public final Boolean H() {
        l lVar = this.b0.q;
        if (lVar != null) {
            return Boolean.valueOf(lVar.J0());
        }
        return null;
    }

    public final void I() {
        if (this.V == UsageByParent.NotUsed) {
            d();
        }
        this.b0.q.V0();
    }

    public final void J(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            kjz kjzVar = this.C;
            wz40 wz40Var = (wz40) kjzVar.b;
            sls slsVar = (sls) kjzVar.c;
            Object k = wz40Var.k(i5);
            ((LayoutNode$_foldedChildren$1) slsVar).invoke();
            ((wz40) kjzVar.b).a(i6, (LayoutNode) k);
            ((LayoutNode$_foldedChildren$1) slsVar).invoke();
        }
        M();
        E();
        C();
    }

    public final void K(LayoutNode layoutNode) {
        if (layoutNode.b0.l > 0) {
            this.b0.c(r0.l - 1);
        }
        if (this.G != null) {
            layoutNode.f();
        }
        layoutNode.F = null;
        if (layoutNode.k0 > 0) {
            Y(this.k0 - 1);
        }
        ((s) layoutNode.a0.e).K = null;
        if (layoutNode.a) {
            this.B--;
            wz40 wz40Var = (wz40) layoutNode.C.b;
            Object[] objArr = wz40Var.a;
            int i = wz40Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((s) ((LayoutNode) objArr[i2]).a0.e).K = null;
            }
        }
        E();
        M();
    }

    public final void L(s sVar) {
        m390 m390Var = this.G;
        androidx.compose.ui.spatial.a rectManager = m390Var != null ? m390Var.getRectManager() : null;
        j jVar = this.b0;
        int i = 0;
        boolean z = jVar.d != LayoutState.Idle || o() || n();
        if (this.z && rectManager != null) {
            if (sVar == ((s) this.a0.e)) {
                this.y = true;
                if (!z) {
                    rectManager.e(this);
                }
            } else {
                this.x = true;
                wz40 x = x();
                Object[] objArr = x.a;
                int i2 = x.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    LayoutNode layoutNode = (LayoutNode) objArr[i3];
                    layoutNode.y = true;
                    if (!z) {
                        rectManager.e(layoutNode);
                    }
                }
                if (this.z) {
                    rectManager.e = true;
                    aji0 aji0Var = rectManager.b;
                    int i4 = this.b & 33554431;
                    long[] jArr = aji0Var.a;
                    int i5 = aji0Var.c;
                    while (true) {
                        if (i >= jArr.length - 2 || i >= i5) {
                            break;
                        }
                        int i6 = i + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i4) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                        i += 3;
                    }
                }
                rectManager.h();
            }
        }
        jVar.p.K0();
    }

    public final void M() {
        if (!this.a) {
            this.O = true;
            return;
        }
        LayoutNode s = s();
        if (s != null) {
            s.M();
        }
    }

    public final void N() {
        kjz kjzVar = this.C;
        int i = ((wz40) kjzVar.b).c;
        while (true) {
            i--;
            wz40 wz40Var = (wz40) kjzVar.b;
            if (-1 >= i) {
                wz40Var.g();
                ((LayoutNode$_foldedChildren$1) ((sls) kjzVar.c)).invoke();
                return;
            }
            K((LayoutNode) wz40Var.a[i]);
        }
    }

    public final void O(int i, int i2) {
        if (i2 < 0) {
            ixv.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            kjz kjzVar = this.C;
            K((LayoutNode) ((wz40) kjzVar.b).a[i3]);
            Object k = ((wz40) kjzVar.b).k(i3);
            ((LayoutNode$_foldedChildren$1) ((sls) kjzVar.c)).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void P() {
        LayoutNode s;
        if (this.V == UsageByParent.NotUsed) {
            d();
        }
        p pVar = this.b0.p;
        j jVar = pVar.y;
        try {
            pVar.z = true;
            if (!pVar.D) {
                ixv.b("replace called on unplaced item");
            }
            boolean z = pVar.M;
            pVar.H0(pVar.G, pVar.J, pVar.H, pVar.I);
            if (z && !pVar.b0 && (s = jVar.a.s()) != null) {
                s.S(false);
            }
        } finally {
        }
    }

    public final void Q(boolean z) {
        m390 m390Var;
        if (this.a || (m390Var = this.G) == null) {
            return;
        }
        m390Var.onRequestRelayout(this, true, z);
    }

    public final void S(boolean z) {
        m390 m390Var;
        if (this.a || (m390Var = this.G) == null) {
            return;
        }
        m390Var.onRequestRelayout(this, false, z);
    }

    public final void V() {
        wz40 x = x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            UsageByParent usageByParent = layoutNode.W;
            layoutNode.V = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.V();
            }
        }
    }

    public final void W(Throwable th) {
        hud hudVar = this.U;
        a7u0 a = ztd.a();
        r1b0 r1b0Var = (r1b0) hudVar;
        r1b0Var.getClass();
        ytd ytdVar = (ytd) uh6.L(r1b0Var, a);
        if (ytdVar == null) {
            throw th;
        }
        kpb1.d(th, new jhd(2, ytdVar, this));
        throw th;
    }

    public final void X(fwi fwiVar) {
        if (jl40.l(this.R, fwiVar)) {
            return;
        }
        this.R = fwiVar;
        C();
        LayoutNode s = s();
        if (s != null) {
            s.A();
        } else {
            m390 m390Var = this.G;
            if (m390Var != null) {
                m390Var.invalidateRootLayer();
            }
        }
        B();
        for (e530 e530Var = (e530) this.a0.g; e530Var != null; e530Var = e530Var.getChild$ui()) {
            e530Var.onDensityChange();
        }
    }

    public final void Y(int i) {
        LayoutNode s;
        LayoutNode s2;
        int i2 = this.k0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (s2 = s()) != null) {
                s2.Y(s2.k0 + 1);
            }
            if (i == 0 && this.k0 > 0 && (s = s()) != null) {
                s.Y(s.k0 - 1);
            }
            this.k0 = i;
        }
    }

    public final void Z(LayoutNode layoutNode) {
        if (jl40.l(layoutNode, this.A)) {
            return;
        }
        this.A = layoutNode;
        j jVar = this.b0;
        if (layoutNode != null) {
            if (jVar.q == null) {
                jVar.q = new l(jVar);
            }
            t300 t300Var = this.a0;
            s sVar = ((f) t300Var.d).J;
            for (s sVar2 = (s) t300Var.e; !jl40.l(sVar2, sVar) && sVar2 != null; sVar2 = sVar2.J) {
                sVar2.W0();
            }
        } else {
            jVar.q = null;
            jVar.f = false;
            jVar.e = false;
        }
        C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [e530] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.node.s, e530] */
    /* JADX WARN: Type inference failed for: r9v2, types: [e530, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void a(f530 f530Var) {
        ?? r7;
        wz40 wz40Var;
        wz40 wz40Var2;
        boolean z;
        t300 t300Var;
        yd60 yd60Var;
        boolean z2;
        t300 t300Var2;
        ?? r5;
        boolean z3;
        t300 t300Var3;
        boolean z4;
        tls tlsVar;
        t300 t300Var4 = this.a0;
        boolean e = t300Var4.e(16);
        v7x0 v7x0Var = (v7x0) t300Var4.f;
        boolean e2 = t300Var4.e(1024);
        this.f0 = f530Var;
        f fVar = (f) t300Var4.d;
        LayoutNode layoutNode = (LayoutNode) t300Var4.b;
        e530 e530Var = (e530) t300Var4.g;
        yd60 yd60Var2 = (yd60) t300Var4.c;
        if (e530Var == yd60Var2) {
            ixv.b("padChain called on already padded chain");
        }
        e530 e530Var2 = (e530) t300Var4.g;
        e530Var2.setParent$ui(yd60Var2);
        yd60Var2.setChild$ui(e530Var2);
        wz40 wz40Var3 = (wz40) t300Var4.h;
        int i = wz40Var3 != null ? wz40Var3.c : 0;
        final wz40 wz40Var4 = (wz40) t300Var4.i;
        if (wz40Var4 == null) {
            wz40Var4 = new wz40(new d530[16]);
        }
        wz40 wz40Var5 = (wz40) t300Var4.j;
        wz40Var5.b(f530Var);
        tls tlsVar2 = null;
        while (true) {
            int i2 = wz40Var5.c;
            if (i2 == 0) {
                break;
            }
            f530 f530Var2 = (f530) wz40Var5.k(i2 - 1);
            if (f530Var2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) f530Var2;
                wz40Var5.b(aVar.b);
                wz40Var5.b(aVar.a);
            } else if (f530Var2 instanceof d530) {
                wz40Var4.b(f530Var2);
            } else {
                if (tlsVar2 == null) {
                    tlsVar = new tls() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            wz40.this.b((d530) obj);
                            return Boolean.TRUE;
                        }
                    };
                    tlsVar2 = tlsVar;
                } else {
                    tlsVar = tlsVar2;
                }
                f530Var2.h(tlsVar);
            }
        }
        int i3 = wz40Var4.c;
        if (i3 == i) {
            e530 child$ui = yd60Var2.getChild$ui();
            t300 t300Var5 = t300Var4;
            int i4 = 0;
            while (child$ui != null && i4 < i) {
                if (wz40Var3 == null) {
                    throw x4e.v("expected prior modifier list to be non-empty");
                }
                d530 d530Var = (d530) wz40Var3.a[i4];
                d530 d530Var2 = (d530) wz40Var4.a[i4];
                if (jl40.l(d530Var, d530Var2)) {
                    t300Var3 = t300Var5;
                    z4 = 2;
                } else {
                    t300Var3 = t300Var5;
                    z4 = d530Var.getClass() == d530Var2.getClass();
                }
                if (!z4) {
                    child$ui = child$ui.getParent$ui();
                    break;
                }
                if (z4) {
                    t300.i(d530Var, d530Var2, child$ui);
                }
                child$ui = child$ui.getChild$ui();
                i4++;
                t300Var5 = t300Var3;
            }
            t300Var3 = t300Var5;
            if (i4 >= i) {
                t300Var4 = t300Var3;
                z2 = false;
                t300Var2 = t300Var4;
                wz40Var = wz40Var3;
                r5 = yd60Var2;
                wz40Var2 = wz40Var4;
                z = false;
                r7 = z2;
            } else {
                if (wz40Var3 == null) {
                    throw x4e.v("expected prior modifier list to be non-empty");
                }
                if (child$ui == null) {
                    throw x4e.v("structuralUpdate requires a non-null tail");
                }
                boolean z5 = layoutNode.g0 != null;
                wz40Var = wz40Var3;
                wz40Var2 = wz40Var4;
                z3 = false;
                e530 e530Var3 = child$ui;
                t300 t300Var6 = t300Var3;
                t300Var6.g(i4, wz40Var, wz40Var2, e530Var3, !z5);
                yd60Var = yd60Var2;
                t300Var = t300Var6;
                z = true;
                t300Var2 = t300Var;
                r5 = yd60Var;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            f530 f530Var3 = layoutNode.g0;
            if (f530Var3 != null && i == 0) {
                e530 e530Var4 = yd60Var2;
                for (int i5 = 0; i5 < wz40Var4.c; i5++) {
                    e530Var4 = t300.b((d530) wz40Var4.a[i5], e530Var4);
                }
                int i6 = 0;
                for (e530 parent$ui = v7x0Var.getParent$ui(); parent$ui != null && parent$ui != yd60Var2; parent$ui = parent$ui.getParent$ui()) {
                    i6 |= parent$ui.getKindSet$ui();
                    parent$ui.setAggregateChildKindSet$ui(i6);
                }
                t300Var = t300Var4;
                wz40Var = wz40Var3;
                yd60Var = yd60Var2;
                wz40Var2 = wz40Var4;
                z = true;
                t300Var2 = t300Var;
                r5 = yd60Var;
                r7 = z3;
            } else if (i3 != 0) {
                if (wz40Var3 == null) {
                    wz40Var3 = new wz40(new d530[16]);
                }
                wz40Var = wz40Var3;
                t300 t300Var7 = t300Var4;
                yd60 yd60Var3 = yd60Var2;
                wz40Var2 = wz40Var4;
                t300Var7.g(0, wz40Var, wz40Var2, yd60Var3, !(f530Var3 != null));
                z = true;
                t300Var2 = t300Var7;
                r5 = yd60Var3;
            } else {
                if (wz40Var3 == null) {
                    throw x4e.v("expected prior modifier list to be non-empty");
                }
                e530 child$ui2 = yd60Var2.getChild$ui();
                for (int i7 = 0; child$ui2 != null && i7 < wz40Var3.c; i7++) {
                    child$ui2 = t300.d(child$ui2).getChild$ui();
                }
                LayoutNode s = layoutNode.s();
                fVar.K = s != null ? (f) s.a0.d : null;
                t300Var4.e = fVar;
                t300Var2 = t300Var4;
                wz40Var = wz40Var3;
                r5 = yd60Var2;
                wz40Var2 = wz40Var4;
                z = false;
                r7 = z2;
            }
        }
        t300Var2.h = wz40Var2;
        if (wz40Var != null) {
            wz40Var.g();
        } else {
            wz40Var = r7;
        }
        t300Var2.i = wz40Var;
        e530 child$ui3 = r5.getChild$ui();
        ?? r9 = v7x0Var;
        if (child$ui3 != null) {
            r9 = child$ui3;
        }
        r9.setParent$ui(r7);
        r5.setChild$ui(r7);
        r5.setAggregateChildKindSet$ui(-1);
        r5.updateCoordinator$ui(r7);
        if (r9 == r5) {
            ixv.b("trimChain did not update the head");
        }
        t300Var2.g = r9;
        if (z) {
            t300Var2.h();
        }
        boolean e3 = t300Var2.e(16);
        boolean e4 = t300Var2.e(1024);
        this.b0.i();
        if (this.A == null && t300Var2.e(512)) {
            Z(this);
        }
        if (e == e3 && e2 == e4) {
            return;
        }
        androidx.compose.ui.spatial.a rectManager = d1y.a(this).getRectManager();
        rectManager.getClass();
        if (F()) {
            aji0 aji0Var = rectManager.b;
            int i8 = this.b & 33554431;
            long[] jArr = aji0Var.a;
            int i9 = aji0Var.c;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                int i11 = i10 + 2;
                long j = jArr[i11];
                if ((((int) j) & 33554431) == i8) {
                    jArr[i11] = ((-6917529027641081857L) & j) | ((e4 ? 1L : 0L) * 2305843009213693952L) | ((e3 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void a0(z910 z910Var) {
        if (jl40.l(this.P, z910Var)) {
            return;
        }
        this.P = z910Var;
        c9v c9vVar = this.Q;
        if (c9vVar != null) {
            c9vVar.z(z910Var);
        }
        C();
    }

    public final void b(m390 m390Var) {
        LayoutNode layoutNode;
        if (this.G != null) {
            ixv.b("Cannot attach " + this + " as it already is attached.  Tree: " + e(0));
        }
        LayoutNode layoutNode2 = this.F;
        if (layoutNode2 != null && !jl40.l(layoutNode2.G, m390Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(m390Var);
            sb.append(") than the parent's owner(");
            LayoutNode s = s();
            sb.append(s != null ? s.G : null);
            sb.append("). This tree: ");
            sb.append(e(0));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this.F;
            sb.append(layoutNode3 != null ? layoutNode3.e(0) : null);
            ixv.b(sb.toString());
        }
        LayoutNode s2 = s();
        j jVar = this.b0;
        if (s2 == null) {
            jVar.p.M = true;
            m390Var.getRectManager().e(this);
            l lVar = jVar.q;
            if (lVar != null) {
                lVar.O0();
            }
        }
        t300 t300Var = this.a0;
        ((s) t300Var.e).K = s2 != null ? (f) s2.a0.d : null;
        this.G = m390Var;
        this.I = (s2 != null ? s2.I : -1) + 1;
        f530 f530Var = this.g0;
        if (f530Var != null) {
            a(f530Var);
        }
        this.g0 = null;
        m390Var.onPreAttach(this);
        LayoutNode layoutNode4 = this.F;
        if (layoutNode4 == null || (layoutNode = layoutNode4.A) == null) {
            layoutNode = this.A;
        }
        Z(layoutNode);
        if (this.A == null && t300Var.e(512)) {
            Z(this);
        }
        if (!this.l0) {
            for (e530 e530Var = (e530) t300Var.g; e530Var != null; e530Var = e530Var.getChild$ui()) {
                e530Var.markAsAttached$ui();
            }
        }
        wz40 wz40Var = (wz40) this.C.b;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).b(m390Var);
        }
        if (!this.l0) {
            t300Var.f();
        }
        C();
        if (s2 != null) {
            s2.C();
        }
        tls tlsVar = this.h0;
        if (tlsVar != null) {
            tlsVar.invoke(m390Var);
        }
        jVar.i();
        if (!this.l0 && t300Var.e(8)) {
            D();
        }
        m390Var.onPostAttach(this);
    }

    public final void b0(f530 f530Var) {
        if (this.a && this.f0 != c530.a) {
            ixv.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.l0) {
            ixv.a("modifier is updated when deactivated");
        }
        if (!F()) {
            this.g0 = f530Var;
            return;
        }
        a(f530Var);
        if (this.K) {
            D();
        }
    }

    public final void c() {
        this.W = this.V;
        this.V = UsageByParent.NotUsed;
        wz40 x = x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.V != UsageByParent.NotUsed) {
                layoutNode.c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void c0(xp31 xp31Var) {
        if (jl40.l(this.T, xp31Var)) {
            return;
        }
        this.T = xp31Var;
        t300 t300Var = this.a0;
        if ((((e530) t300Var.g).getAggregateChildKindSet$ui() & 16) != 0) {
            for (e530 e530Var = (e530) t300Var.g; e530Var != null; e530Var = e530Var.getChild$ui()) {
                if ((e530Var.getKindSet$ui() & 16) != 0) {
                    lqh lqhVar = e530Var;
                    ?? r2 = 0;
                    while (lqhVar != 0) {
                        if (lqhVar instanceof gwd0) {
                            ((gwd0) lqhVar).C0();
                        } else if ((lqhVar.getKindSet$ui() & 16) != 0 && (lqhVar instanceof lqh)) {
                            e530 e530Var2 = lqhVar.b;
                            int i = 0;
                            lqhVar = lqhVar;
                            r2 = r2;
                            while (e530Var2 != null) {
                                if ((e530Var2.getKindSet$ui() & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        lqhVar = e530Var2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new wz40(new e530[16]);
                                        }
                                        if (lqhVar != 0) {
                                            r2.b(lqhVar);
                                            lqhVar = 0;
                                        }
                                        r2.b(e530Var2);
                                    }
                                }
                                e530Var2 = e530Var2.getChild$ui();
                                lqhVar = lqhVar;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        lqhVar = qje.c(r2);
                    }
                }
                if ((e530Var.getAggregateChildKindSet$ui() & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final void d() {
        this.W = this.V;
        this.V = UsageByParent.NotUsed;
        wz40 x = x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.V == UsageByParent.InLayoutBlock) {
                layoutNode.d();
            }
        }
    }

    public final void d0() {
        if (this.B <= 0 || !this.E) {
            return;
        }
        this.E = false;
        wz40 wz40Var = this.D;
        if (wz40Var == null) {
            wz40Var = new wz40(new LayoutNode[16]);
            this.D = wz40Var;
        }
        wz40Var.g();
        wz40 wz40Var2 = (wz40) this.C.b;
        Object[] objArr = wz40Var2.a;
        int i = wz40Var2.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.a) {
                wz40Var.c(wz40Var.c, layoutNode.x());
            } else {
                wz40Var.b(layoutNode);
            }
        }
        j jVar = this.b0;
        jVar.p.T = true;
        l lVar = jVar.q;
        if (lVar != null) {
            lVar.W0();
        }
    }

    public final String e(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        wz40 x = x();
        Object[] objArr = x.a;
        int i3 = x.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((LayoutNode) objArr[i4]).e(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? oyr.g(1, 0, sb2) : sb2;
    }

    public final void f() {
        a b;
        m390 m390Var = this.G;
        if (m390Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode s = s();
            sb.append(s != null ? s.e(0) : null);
            ixv.c(sb.toString());
            ny61.A();
            return;
        }
        LayoutNode s2 = s();
        j jVar = this.b0;
        if (s2 != null) {
            s2.A();
            s2.C();
            p pVar = jVar.p;
            UsageByParent usageByParent = UsageByParent.NotUsed;
            pVar.E = usageByParent;
            l lVar = jVar.q;
            if (lVar != null) {
                lVar.X0(usageByParent);
            }
        }
        b1y b1yVar = jVar.p.R;
        b1yVar.b = true;
        b1yVar.c = false;
        b1yVar.e = false;
        b1yVar.d = false;
        b1yVar.f = false;
        b1yVar.g = false;
        b1yVar.h = null;
        l lVar2 = jVar.q;
        if (lVar2 != null && (b = lVar2.b()) != null) {
            b.b = true;
            b.c = false;
            b.e = false;
            b.d = false;
            b.f = false;
            b.g = false;
            b.h = null;
        }
        t300 t300Var = this.a0;
        e530 e530Var = (v7x0) t300Var.f;
        s sVar = ((f) t300Var.d).J;
        for (s sVar2 = (s) t300Var.e; !jl40.l(sVar2, sVar) && sVar2 != null; sVar2 = sVar2.J) {
            sVar2.t1();
            if (sVar2.I.G()) {
                sVar2.o1();
            }
        }
        tls tlsVar = this.i0;
        if (tlsVar != null) {
            tlsVar.invoke(m390Var);
        }
        for (e530 e530Var2 = e530Var; e530Var2 != null; e530Var2 = e530Var2.getParent$ui()) {
            if (e530Var2.isAttached()) {
                e530Var2.runDetachLifecycle$ui();
            }
        }
        this.J = true;
        wz40 wz40Var = (wz40) this.C.b;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).f();
        }
        this.J = false;
        while (e530Var != null) {
            if (e530Var.isAttached()) {
                e530Var.markAsDetached$ui();
            }
            e530Var = e530Var.getParent$ui();
        }
        m390Var.onDetach(this);
        m390Var.getRectManager().f(this);
        this.G = null;
        Z(null);
        this.I = 0;
        p pVar2 = jVar.p;
        pVar2.B = Integer.MAX_VALUE;
        pVar2.A = Integer.MAX_VALUE;
        pVar2.M = false;
        l lVar3 = jVar.q;
        if (lVar3 != null) {
            lVar3.Q0();
        }
        if (t300Var.e(8)) {
            cnq0 cnq0Var = this.L;
            this.L = null;
            this.K = false;
            m390Var.getSemanticsOwner().b(this, cnq0Var);
            m390Var.onSemanticsChange();
        }
    }

    public final void h() {
        if (this.A != null) {
            R(this, false, 5);
        } else {
            T(this, false, 5);
        }
        p pVar = this.b0.p;
        n8e n8eVar = pVar.C ? new n8e(pVar.w) : null;
        m390 m390Var = this.G;
        if (n8eVar != null) {
            if (m390Var != null) {
                m390Var.mo66measureAndLayout0kLqBqw(this, n8eVar.a);
            }
        } else if (m390Var != null) {
            m390Var.measureAndLayout(true);
        }
    }

    public final List i() {
        return this.b0.q.A0();
    }

    @Override // defpackage.n390
    public final boolean isValidOwnerScope() {
        return F();
    }

    public final List j() {
        return this.b0.p.A0();
    }

    public final List k() {
        return x().f();
    }

    public final List l() {
        return ((wz40) this.C.b).f();
    }

    public final int m() {
        return this.b0.p.b;
    }

    public final boolean n() {
        return this.b0.p.P;
    }

    public final boolean o() {
        return this.b0.p.O;
    }

    @Override // defpackage.qgd
    public final void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.H;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        androidx.compose.ui.layout.i iVar = this.c0;
        if (iVar != null) {
            iVar.onDeactivate();
        }
        this.l0 = true;
        e530 e530Var = (v7x0) this.a0.f;
        for (e530 e530Var2 = e530Var; e530Var2 != null; e530Var2 = e530Var2.getParent$ui()) {
            if (e530Var2.isAttached()) {
                e530Var2.reset$ui();
            }
        }
        for (e530 e530Var3 = e530Var; e530Var3 != null; e530Var3 = e530Var3.getParent$ui()) {
            if (e530Var3.isAttached()) {
                e530Var3.runDetachLifecycle$ui();
            }
        }
        while (e530Var != null) {
            if (e530Var.isAttached()) {
                e530Var.markAsDetached$ui();
            }
            e530Var = e530Var.getParent$ui();
        }
        if (F()) {
            this.L = null;
            this.K = false;
        }
        m390 m390Var = this.G;
        if (m390Var != null) {
            m390Var.onLayoutNodeDeactivated(this);
        }
    }

    @Override // defpackage.qgd
    public final void onRelease() {
        AndroidViewHolder androidViewHolder = this.H;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        androidx.compose.ui.layout.i iVar = this.c0;
        if (iVar != null) {
            iVar.onRelease();
        }
        t300 t300Var = this.a0;
        s sVar = ((f) t300Var.d).J;
        for (s sVar2 = (s) t300Var.e; !jl40.l(sVar2, sVar) && sVar2 != null; sVar2 = sVar2.J) {
            sVar2.n1();
        }
    }

    public final UsageByParent p() {
        return this.b0.p.E;
    }

    public final UsageByParent q() {
        UsageByParent F0;
        l lVar = this.b0.q;
        return (lVar == null || (F0 = lVar.F0()) == null) ? UsageByParent.NotUsed : F0;
    }

    public final c9v r() {
        c9v c9vVar = this.Q;
        if (c9vVar != null) {
            return c9vVar;
        }
        c9v c9vVar2 = new c9v(this, this.P);
        this.Q = c9vVar2;
        return c9vVar2;
    }

    public final LayoutNode s() {
        LayoutNode layoutNode = this.F;
        while (layoutNode != null && layoutNode.a) {
            layoutNode = layoutNode.F;
        }
        return layoutNode;
    }

    public final int t() {
        return this.b0.p.B;
    }

    public final String toString() {
        return xbb1.f(this) + " children: " + ((uz40) k()).a.c + " measurePolicy: " + this.P + " deactivated: " + this.l0;
    }

    public final cnq0 u() {
        if (F() && !this.l0 && this.a0.e(8)) {
            return this.L;
        }
        return null;
    }

    public final int v() {
        return this.b0.p.a;
    }

    public final wz40 w() {
        boolean z = this.O;
        wz40 wz40Var = this.N;
        if (z) {
            wz40Var.g();
            wz40Var.c(wz40Var.c, x());
            Arrays.sort(wz40Var.a, 0, wz40Var.c, p0);
            this.O = false;
        }
        return wz40Var;
    }

    public final wz40 x() {
        d0();
        return this.B == 0 ? (wz40) this.C.b : this.D;
    }

    public final void y(long j, cnu cnuVar, int i, boolean z) {
        t300 t300Var = this.a0;
        s sVar = (s) t300Var.e;
        tls tlsVar = s.j0;
        ((s) t300Var.e).g1(s.o0, sVar.Y0(j), cnuVar, i, z);
    }

    public final void z(LayoutNode layoutNode, int i) {
        if (layoutNode.F != null && layoutNode.G != null) {
            ixv.b(g(layoutNode));
        }
        layoutNode.F = this;
        kjz kjzVar = this.C;
        ((wz40) kjzVar.b).a(i, layoutNode);
        ((LayoutNode$_foldedChildren$1) ((sls) kjzVar.c)).invoke();
        M();
        if (layoutNode.a) {
            this.B++;
        }
        E();
        m390 m390Var = this.G;
        if (m390Var != null) {
            layoutNode.b(m390Var);
        }
        if (layoutNode.b0.l > 0) {
            j jVar = this.b0;
            jVar.c(jVar.l + 1);
        }
        if (layoutNode.k0 > 0) {
            Y(this.k0 + 1);
        }
    }

    public LayoutNode(int i) {
        this((i & 1) == 0, fnq0.a.addAndGet(1));
    }

    public LayoutNode() {
        this(3);
    }
}
