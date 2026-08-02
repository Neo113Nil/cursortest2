package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.collections.EmptyList;
import xsna.aum0;
import xsna.ci50;
import xsna.dak0;
import xsna.q630;
import xsna.tra0;
import xsna.ytm0;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes11.dex */
public final class woy implements ypi {
    public final LayoutNode b;
    public cvi c;
    public aum0 d;
    public int e;
    public int f;
    public int o;
    public int p;
    public final ph50<LayoutNode, b> g = h5h0.b();
    public final ph50<Object, LayoutNode> h = h5h0.b();
    public final c i = new c();
    public final a j = new a();
    public final ph50<Object, LayoutNode> k = h5h0.b();
    public final aum0.a l = new aum0.a(0);
    public final ph50<Object, ytm0.b> m = h5h0.b();
    public final ci50<Object> n = new ci50<>(new Object[16]);
    public final String q = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* compiled from: SubcomposeLayout.kt */
    public final class a implements ztm0, ep10 {
        public final /* synthetic */ c b;

        public a() {
            this.b = woy.this.i;
        }

        @Override // xsna.azl
        public final long E(long j) {
            return this.b.E(j);
        }

        @Override // xsna.ep10
        public final dp10 F1(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2) {
            return this.b.F1(i, i2, map, izsVar, izsVar2);
        }

        @Override // xsna.azl
        public final long I(int i) {
            return this.b.I(i);
        }

        @Override // xsna.azl
        public final float I0(float f) {
            return this.b.getDensity() * f;
        }

        @Override // xsna.azl
        public final long J(float f) {
            return this.b.J(f);
        }

        @Override // xsna.azl
        public final int K0(long j) {
            return this.b.K0(j);
        }

        @Override // xsna.azl
        public final float O0(long j) {
            return this.b.O0(j);
        }

        @Override // xsna.ep10
        public final dp10 Q(int i, int i2, Map<gt1, Integer> map, izs<? super tra0.a, s3q0> izsVar) {
            return this.b.F1(i, i2, map, null, izsVar);
        }

        @Override // xsna.azl
        public final float getDensity() {
            return this.b.c;
        }

        @Override // xsna.azl
        public final float getFontScale() {
            return this.b.d;
        }

        @Override // xsna.apx
        public final LayoutDirection getLayoutDirection() {
            return this.b.b;
        }

        @Override // xsna.azl
        public final long i0(float f) {
            return this.b.i0(f);
        }

        @Override // xsna.azl
        public final float j1(int i) {
            return this.b.j1(i);
        }

        @Override // xsna.azl
        public final float k1(float f) {
            return f / this.b.getDensity();
        }

        @Override // xsna.azl
        public final long p1(long j) {
            return this.b.p1(j);
        }

        @Override // xsna.azl
        public final int r0(float f) {
            return this.b.r0(f);
        }

        @Override // xsna.ztm0
        public final List<zo10> t1(Object obj, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
            woy woyVar = woy.this;
            LayoutNode layoutNode = woyVar.b;
            ph50<Object, LayoutNode> ph50Var = woyVar.h;
            LayoutNode d = ph50Var.d(obj);
            if (d != null && ((ci50.a) layoutNode.C()).b.i(d) < woyVar.e) {
                return d.A();
            }
            ph50<Object, ytm0.b> ph50Var2 = woyVar.m;
            ph50<Object, LayoutNode> ph50Var3 = woyVar.k;
            ci50<Object> ci50Var = woyVar.n;
            if (ci50Var.d < woyVar.f) {
                uzw.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            LayoutNode d2 = ph50Var.d(obj);
            int i = ci50Var.d;
            int i2 = woyVar.f;
            if (i == i2) {
                ci50Var.b(obj);
            } else {
                Object[] objArr = ci50Var.b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
            }
            woyVar.f++;
            boolean a = ph50Var3.a(obj);
            if (a || d2 != null) {
                if (!a && d2 != null) {
                    woyVar.k(((ci50.a) layoutNode.C()).b.i(d2), ((ci50.a) layoutNode.C()).b.d);
                    woyVar.p++;
                    ph50Var.n(obj);
                    ph50Var3.p(obj, d2);
                    ph50Var2.p(obj, woyVar.e(obj));
                    if (layoutNode.e()) {
                        woyVar.h();
                    }
                }
                LayoutNode d3 = ph50Var3.d(obj);
                b d4 = d3 != null ? woyVar.g.d(d3) : null;
                if (d4 != null && d4.d) {
                    woyVar.n(d3, obj, false, wzsVar);
                }
                if ((d4 != null ? d4.f : null) != null) {
                    woyVar.c(d4, true);
                }
            } else {
                woyVar.l(obj, wzsVar, false);
                ph50Var2.p(obj, woyVar.e(obj));
            }
            LayoutNode d5 = ph50Var3.d(obj);
            if (d5 == null) {
                return EmptyList.b;
            }
            List<androidx.compose.ui.node.k> x0 = d5.H.p.x0();
            int size = x0.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((androidx.compose.ui.node.k) ((ci50.a) x0).get(i3)).g.b = true;
            }
            return x0;
        }

        @Override // xsna.azl
        public final float u0(long j) {
            return this.b.u0(j);
        }

        @Override // xsna.apx
        public final boolean z1() {
            return this.b.z1();
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class b {
        public Object a;
        public wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> b;
        public qfg0 c;
        public boolean d;
        public boolean e;
        public jr90 f;
        public wh50<Boolean> g;
        public boolean h;

        public b() {
            throw null;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public final class c implements ztm0 {
        public LayoutDirection b = LayoutDirection.Rtl;
        public float c;
        public float d;

        /* compiled from: SubcomposeLayout.kt */
        public static final class a implements dp10 {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Map<gt1, Integer> c;
            public final /* synthetic */ izs<srg0, s3q0> d;
            public final /* synthetic */ c e;
            public final /* synthetic */ woy f;
            public final /* synthetic */ izs<tra0.a, s3q0> g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, c cVar, woy woyVar, izs<? super tra0.a, s3q0> izsVar2) {
                this.a = i;
                this.b = i2;
                this.c = map;
                this.d = izsVar;
                this.e = cVar;
                this.f = woyVar;
                this.g = izsVar2;
            }

            @Override // xsna.dp10
            public final int getHeight() {
                return this.b;
            }

            @Override // xsna.dp10
            public final int getWidth() {
                return this.a;
            }

            @Override // xsna.dp10
            public final void j() {
                c.a aVar;
                LayoutNode layoutNode = this.f.b;
                boolean z1 = this.e.z1();
                izs<tra0.a, s3q0> izsVar = this.g;
                if (!z1 || (aVar = layoutNode.G.c.Z) == null) {
                    izsVar.invoke(layoutNode.G.c.m);
                } else {
                    izsVar.invoke(aVar.m);
                }
            }

            @Override // xsna.dp10
            public final izs<srg0, s3q0> k() {
                return this.d;
            }

            @Override // xsna.dp10
            public final Map<gt1, Integer> q() {
                return this.c;
            }
        }

        public c() {
        }

        @Override // xsna.ep10
        public final dp10 F1(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                uzw.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i, i2, map, izsVar, this, woy.this, izsVar2);
        }

        @Override // xsna.azl
        public final float getDensity() {
            return this.c;
        }

        @Override // xsna.azl
        public final float getFontScale() {
            return this.d;
        }

        @Override // xsna.apx
        public final LayoutDirection getLayoutDirection() {
            return this.b;
        }

        @Override // xsna.ztm0
        public final List<zo10> t1(Object obj, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
            woy woyVar = woy.this;
            woyVar.h();
            LayoutNode layoutNode = woyVar.b;
            LayoutNode.LayoutState layoutState = layoutNode.H.d;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
            if (layoutState != layoutState2 && layoutState != LayoutNode.LayoutState.LayingOut && layoutState != LayoutNode.LayoutState.LookaheadMeasuring && layoutState != LayoutNode.LayoutState.LookaheadLayingOut) {
                uzw.b("subcompose can only be used inside the measure or layout blocks");
            }
            ph50<Object, LayoutNode> ph50Var = woyVar.h;
            LayoutNode d = ph50Var.d(obj);
            if (d == null) {
                d = woyVar.k.n(obj);
                if (d != null) {
                    woyVar.g.d(d);
                    if (woyVar.p <= 0) {
                        uzw.b("Check failed.");
                    }
                    woyVar.p--;
                } else {
                    d = woyVar.o(obj);
                    if (d == null) {
                        int i = woyVar.e;
                        LayoutNode layoutNode2 = new LayoutNode(2);
                        layoutNode.r = true;
                        layoutNode.N(i, layoutNode2);
                        s3q0 s3q0Var = s3q0.a;
                        layoutNode.r = false;
                        d = layoutNode2;
                    }
                }
                ph50Var.p(obj, d);
            }
            LayoutNode layoutNode3 = d;
            if (j5g.b0(woyVar.e, layoutNode.C()) != layoutNode3) {
                int i2 = ((ci50.a) layoutNode.C()).b.i(layoutNode3);
                if (i2 < woyVar.e) {
                    uzw.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i3 = woyVar.e;
                if (i3 != i2) {
                    woyVar.k(i2, i3);
                }
            }
            woyVar.e++;
            woyVar.n(layoutNode3, obj, false, wzsVar);
            return (layoutState == layoutState2 || layoutState == LayoutNode.LayoutState.LayingOut) ? layoutNode3.A() : layoutNode3.z();
        }

        @Override // xsna.apx
        public final boolean z1() {
            LayoutNode.LayoutState layoutState = woy.this.b.H.d;
            return layoutState == LayoutNode.LayoutState.LookaheadLayingOut || layoutState == LayoutNode.LayoutState.LookaheadMeasuring;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class e implements ytm0.b {
        public final qg50 a = p9x.a();
        public final /* synthetic */ Object c;

        public e(Object obj) {
            this.c = obj;
        }

        @Override // xsna.ytm0.b
        public final long a(int i) {
            LayoutNode d = woy.this.k.d(this.c);
            if (d == null || !d.e()) {
                return 0L;
            }
            int i2 = ((ci50.a) d.B()).b.d;
            if (i < 0 || i >= i2) {
                uzw.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (!this.a.a(i)) {
                return 0L;
            }
            return (((LayoutNode) ((ci50.a) d.B()).get(i)).H.p.b << 32) | (((LayoutNode) ((ci50.a) d.B()).get(i)).H.p.c & 4294967295L);
        }

        @Override // xsna.ytm0.b
        public final int b() {
            LayoutNode d = woy.this.k.d(this.c);
            if (d != null) {
                return ((ci50.a) d.B()).b.d;
            }
            return 0;
        }

        @Override // xsna.ytm0.b
        public final void c(int i, long j) {
            woy woyVar = woy.this;
            LayoutNode d = woyVar.k.d(this.c);
            if (d == null || !d.e()) {
                return;
            }
            int i2 = ((ci50.a) d.B()).b.d;
            if (i < 0 || i >= i2) {
                uzw.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            }
            if (d.g()) {
                uzw.a("Pre-measure called on node that is not placed");
            }
            LayoutNode layoutNode = woyVar.b;
            layoutNode.r = true;
            voy.a(d).w((LayoutNode) ((ci50.a) d.B()).get(i), j);
            s3q0 s3q0Var = s3q0.a;
            layoutNode.r = false;
            this.a.b(i);
        }

        @Override // xsna.ytm0.b
        public final void d(uzc0 uzc0Var) {
            u470 u470Var;
            LayoutNode d = woy.this.k.d(this.c);
            q630.c cVar = (d == null || (u470Var = d.G) == null) ? null : u470Var.f;
            if (cVar == null || !cVar.o) {
                return;
            }
            hr80.J(cVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", uzc0Var);
        }

        @Override // xsna.ytm0.b
        public final void dispose() {
            woy.b(woy.this, this.c);
        }
    }

    public woy(LayoutNode layoutNode, aum0 aum0Var) {
        this.b = layoutNode;
        this.d = aum0Var;
    }

    public static final void b(woy woyVar, Object obj) {
        LayoutNode layoutNode = woyVar.b;
        woyVar.h();
        LayoutNode n = woyVar.k.n(obj);
        if (n != null) {
            if (woyVar.p <= 0) {
                uzw.b("No pre-composed items to dispose");
            }
            int i = ((ci50.a) layoutNode.C()).b.i(n);
            if (i < ((ci50.a) layoutNode.C()).b.d - woyVar.p) {
                uzw.b("Item is not in pre-composed item range");
            }
            woyVar.o++;
            woyVar.p--;
            b d2 = woyVar.g.d(n);
            if (d2 != null) {
                d(d2);
            }
            int i2 = (((ci50.a) layoutNode.C()).b.d - woyVar.p) - woyVar.o;
            woyVar.k(i, i2);
            woyVar.g(i2);
        }
        if (woyVar.n.h(obj)) {
            LayoutNode.f0(layoutNode, true, 6);
        }
    }

    public static void d(b bVar) {
        jr90 jr90Var = bVar.f;
        if (jr90Var != null) {
            jr90Var.cancel();
            bVar.f = null;
            qfg0 qfg0Var = bVar.c;
            if (qfg0Var != null) {
                qfg0Var.dispose();
            }
            bVar.c = null;
        }
    }

    @Override // xsna.ypi
    public final void a() {
        qfg0 qfg0Var;
        LayoutNode layoutNode = this.b;
        layoutNode.r = true;
        ph50<LayoutNode, b> ph50Var = this.g;
        Object[] objArr = ph50Var.c;
        long[] jArr = ph50Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (qfg0Var = ((b) objArr[(i << 3) + i3]).c) != null) {
                            qfg0Var.dispose();
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
        layoutNode.Z();
        s3q0 s3q0Var = s3q0.a;
        layoutNode.r = false;
        ph50Var.h();
        this.h.h();
        this.p = 0;
        this.o = 0;
        this.k.h();
        h();
    }

    public final void c(b bVar, boolean z) {
        jr90 jr90Var = bVar.f;
        if (jr90Var != null) {
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e2 = a2 != null ? a2.e() : null;
            dak0 b2 = dak0.a.b(a2);
            try {
                LayoutNode layoutNode = this.b;
                layoutNode.r = true;
                if (z) {
                    while (!jr90Var.a()) {
                        try {
                            jr90Var.b(new w11(21));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                jr90Var.apply();
                bVar.f = null;
                s3q0 s3q0Var = s3q0.a;
                layoutNode.r = false;
            } finally {
                dak0.a.d(a2, b2, e2);
            }
        }
    }

    public final ytm0.b e(Object obj) {
        return !this.b.e() ? new d() : new e(obj);
    }

    @Override // xsna.ypi
    public final void f() {
        i(false);
    }

    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.o = 0;
        List<LayoutNode> C = this.b.C();
        ci50.a aVar = (ci50.a) C;
        int i2 = (aVar.b.d - this.p) - 1;
        if (i <= i2) {
            this.l.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    this.l.b.b(this.g.d((LayoutNode) aVar.get(i3)).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.d.a(this.l);
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e2 = a2 != null ? a2.e() : null;
            dak0 b2 = dak0.a.b(a2);
            z = false;
            while (i2 >= i) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((ci50.a) C).get(i2);
                    b d2 = this.g.d(layoutNode);
                    Object obj = d2.a;
                    if (this.l.b.a(obj)) {
                        this.o++;
                        if (((Boolean) ((zak0) d2.g).getValue()).booleanValue()) {
                            androidx.compose.ui.node.e eVar = layoutNode.H;
                            androidx.compose.ui.node.k kVar = eVar.p;
                            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                            kVar.m = usageByParent;
                            androidx.compose.ui.node.g gVar = eVar.q;
                            if (gVar != null) {
                                gVar.k = usageByParent;
                            }
                            m(d2, false);
                            if (d2.h) {
                                z = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.b;
                        layoutNode2.r = true;
                        this.g.n(layoutNode);
                        qfg0 qfg0Var = d2.c;
                        if (qfg0Var != null) {
                            qfg0Var.dispose();
                        }
                        this.b.a0(i2, 1);
                        s3q0 s3q0Var = s3q0.a;
                        layoutNode2.r = false;
                    }
                    this.h.n(obj);
                    i2--;
                } catch (Throwable th) {
                    dak0.a.d(a2, b2, e2);
                    throw th;
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            dak0.a.d(a2, b2, e2);
        } else {
            z = false;
        }
        if (z) {
            synchronized (qak0.c) {
                qh50<muk0> qh50Var = qak0.j.h;
                if (qh50Var != null) {
                    if (qh50Var.d()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                qak0.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((ci50.a) this.b.C()).b.d;
        ph50<LayoutNode, b> ph50Var = this.g;
        if (ph50Var.e != i) {
            uzw.a("Inconsistency between the count of nodes tracked by the state (" + ph50Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.o) - this.p < 0) {
            StringBuilder b2 = ji.b(i, "Incorrect state. Total children ", ". Reusable children ");
            b2.append(this.o);
            b2.append(". Precomposed children ");
            b2.append(this.p);
            uzw.a(b2.toString());
        }
        ph50<Object, LayoutNode> ph50Var2 = this.k;
        if (ph50Var2.e == this.p) {
            return;
        }
        uzw.a("Incorrect state. Precomposed children " + this.p + ". Map size " + ph50Var2.e);
    }

    public final void i(boolean z) {
        this.p = 0;
        this.k.h();
        List<LayoutNode> C = this.b.C();
        int i = ((ci50.a) C).b.d;
        if (this.o != i) {
            this.o = i;
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e2 = a2 != null ? a2.e() : null;
            dak0 b2 = dak0.a.b(a2);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) ((ci50.a) C).get(i2);
                    b d2 = this.g.d(layoutNode);
                    if (d2 != null && ((Boolean) ((zak0) d2.g).getValue()).booleanValue()) {
                        androidx.compose.ui.node.e eVar = layoutNode.H;
                        androidx.compose.ui.node.k kVar = eVar.p;
                        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
                        kVar.m = usageByParent;
                        androidx.compose.ui.node.g gVar = eVar.q;
                        if (gVar != null) {
                            gVar.k = usageByParent;
                        }
                        m(d2, z);
                        d2.a = xtm0.a;
                    }
                } catch (Throwable th) {
                    dak0.a.d(a2, b2, e2);
                    throw th;
                }
            }
            s3q0 s3q0Var = s3q0.a;
            dak0.a.d(a2, b2, e2);
            this.h.h();
        }
        h();
    }

    @Override // xsna.ypi
    public final void j() {
        i(true);
    }

    public final void k(int i, int i2) {
        LayoutNode layoutNode = this.b;
        layoutNode.r = true;
        layoutNode.V(i, i2, 1);
        s3q0 s3q0Var = s3q0.a;
        layoutNode.r = false;
    }

    public final void l(Object obj, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, boolean z) {
        LayoutNode layoutNode = this.b;
        if (layoutNode.e()) {
            h();
            if (this.h.b(obj)) {
                return;
            }
            this.m.n(obj);
            ph50<Object, LayoutNode> ph50Var = this.k;
            LayoutNode d2 = ph50Var.d(obj);
            if (d2 == null) {
                d2 = o(obj);
                if (d2 != null) {
                    k(((ci50.a) layoutNode.C()).b.i(d2), ((ci50.a) layoutNode.C()).b.d);
                    this.p++;
                } else {
                    int i = ((ci50.a) layoutNode.C()).b.d;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.r = true;
                    layoutNode.N(i, layoutNode2);
                    s3q0 s3q0Var = s3q0.a;
                    layoutNode.r = false;
                    this.p++;
                    d2 = layoutNode2;
                }
                ph50Var.p(obj, d2);
            }
            n(d2, obj, z, wzsVar);
        }
    }

    public final void m(b bVar, boolean z) {
        qfg0 qfg0Var;
        if (z || !bVar.h) {
            bVar.g = androidx.compose.runtime.k.b(Boolean.FALSE);
        } else {
            ((zak0) bVar.g).setValue(Boolean.FALSE);
        }
        if (bVar.f != null) {
            d(bVar);
            return;
        }
        if (z) {
            qfg0 qfg0Var2 = bVar.c;
            if (qfg0Var2 != null) {
                qfg0Var2.deactivate();
                return;
            }
            return;
        }
        s090 outOfFrameExecutor = voy.a(this.b).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.t(new yoy(bVar));
        } else {
            if (bVar.h || (qfg0Var = bVar.c) == null) {
                return;
            }
            qfg0Var.deactivate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:31:0x006c, B:34:0x0076, B:37:0x009d, B:39:0x00ab, B:41:0x00bf, B:43:0x00c6, B:44:0x00e3, B:47:0x00cf, B:48:0x00d8, B:50:0x00dc, B:51:0x00e0, B:52:0x00ae, B:54:0x0082, B:56:0x0090, B:57:0x00ef, B:58:0x00f9), top: B:30:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:31:0x006c, B:34:0x0076, B:37:0x009d, B:39:0x00ab, B:41:0x00bf, B:43:0x00c6, B:44:0x00e3, B:47:0x00cf, B:48:0x00d8, B:50:0x00dc, B:51:0x00e0, B:52:0x00ae, B:54:0x0082, B:56:0x0090, B:57:0x00ef, B:58:0x00f9), top: B:30:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:31:0x006c, B:34:0x0076, B:37:0x009d, B:39:0x00ab, B:41:0x00bf, B:43:0x00c6, B:44:0x00e3, B:47:0x00cf, B:48:0x00d8, B:50:0x00dc, B:51:0x00e0, B:52:0x00ae, B:54:0x0082, B:56:0x0090, B:57:0x00ef, B:58:0x00f9), top: B:30:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:31:0x006c, B:34:0x0076, B:37:0x009d, B:39:0x00ab, B:41:0x00bf, B:43:0x00c6, B:44:0x00e3, B:47:0x00cf, B:48:0x00d8, B:50:0x00dc, B:51:0x00e0, B:52:0x00ae, B:54:0x0082, B:56:0x0090, B:57:0x00ef, B:58:0x00f9), top: B:30:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(LayoutNode layoutNode, Object obj, boolean z, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        ivi iviVar;
        LayoutNode layoutNode2 = this.b;
        ph50<LayoutNode, b> ph50Var = this.g;
        b d2 = ph50Var.d(layoutNode);
        if (d2 == null) {
            jai jaiVar = mli.a;
            d2 = new b();
            d2.a = obj;
            d2.b = jaiVar;
            d2.c = null;
            d2.g = androidx.compose.runtime.k.b(Boolean.TRUE);
            ph50Var.p(layoutNode, d2);
        }
        b bVar = d2;
        boolean z2 = bVar.b != wzsVar;
        if (bVar.f != null) {
            if (z2) {
                d(bVar);
            } else if (z) {
                return;
            } else {
                c(bVar, true);
            }
        }
        qfg0 qfg0Var = bVar.c;
        boolean w = qfg0Var != null ? qfg0Var.w() : true;
        if (z2 || w || bVar.d) {
            bVar.b = wzsVar;
            if (bVar.f != null) {
                uzw.a("new subcompose call while paused composition is still active");
            }
            dak0 a2 = dak0.a.a();
            izs<Object, s3q0> e2 = a2 != null ? a2.e() : null;
            dak0 b2 = dak0.a.b(a2);
            try {
                layoutNode2.r = true;
                qfg0 qfg0Var2 = bVar.c;
                cvi cviVar = this.c;
                if (cviVar == null) {
                    uzw.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (qfg0Var2 != null) {
                    if (qfg0Var2.h()) {
                    }
                    bVar.c = qfg0Var2;
                    wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2 = bVar.b;
                    if (voy.a(layoutNode2).getOutOfFrameExecutor() == null) {
                        bVar.h = false;
                    } else {
                        bVar.h = true;
                        wzsVar2 = new jai(1524156494, new bpy(bVar, wzsVar2), true);
                    }
                    if (!z) {
                        if (bVar.e) {
                            bVar.f = ((fr90) qfg0Var2).j(wzsVar2);
                        } else {
                            bVar.f = ((fr90) qfg0Var2).k(wzsVar2);
                        }
                    } else if (bVar.e) {
                        qfg0Var2.s(wzsVar2);
                    } else {
                        qfg0Var2.d(wzsVar2);
                    }
                    bVar.e = false;
                    s3q0 s3q0Var = s3q0.a;
                    layoutNode2.r = false;
                    dak0.a.d(a2, b2, e2);
                    bVar.d = false;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = wzx0.a;
                    iviVar = new ivi(cviVar, new myp0(layoutNode));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = wzx0.a;
                    iviVar = new ivi(cviVar, new myp0(layoutNode));
                }
                qfg0Var2 = iviVar;
                bVar.c = qfg0Var2;
                wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar22 = bVar.b;
                if (voy.a(layoutNode2).getOutOfFrameExecutor() == null) {
                }
                if (!z) {
                }
                bVar.e = false;
                s3q0 s3q0Var2 = s3q0.a;
                layoutNode2.r = false;
                dak0.a.d(a2, b2, e2);
                bVar.d = false;
            } catch (Throwable th) {
                dak0.a.d(a2, b2, e2);
                throw th;
            }
        }
    }

    public final LayoutNode o(Object obj) {
        ph50<LayoutNode, b> ph50Var;
        int i;
        if (this.o == 0) {
            return null;
        }
        ci50.a aVar = (ci50.a) this.b.C();
        int i2 = aVar.b.d - this.p;
        int i3 = i2 - this.o;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            ph50Var = this.g;
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (epx.f(ph50Var.d((LayoutNode) aVar.get(i5)).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                b d2 = ph50Var.d((LayoutNode) aVar.get(i4));
                Object obj2 = d2.a;
                if (obj2 == xtm0.a || this.d.b(obj, obj2)) {
                    d2.a = obj;
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
            k(i5, i3);
        }
        this.o--;
        LayoutNode layoutNode = (LayoutNode) aVar.get(i3);
        b d3 = ph50Var.d(layoutNode);
        d3.g = androidx.compose.runtime.k.b(Boolean.TRUE);
        d3.e = true;
        d3.d = true;
        return layoutNode;
    }

    /* compiled from: SubcomposeLayout.kt */
    public static final class d implements ytm0.b {
        @Override // xsna.ytm0.b
        public final void dispose() {
        }
    }
}
