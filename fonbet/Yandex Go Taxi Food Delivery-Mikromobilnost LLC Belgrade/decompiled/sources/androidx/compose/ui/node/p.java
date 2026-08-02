package androidx.compose.ui.node;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LayoutNode;
import defpackage.b1y;
import defpackage.d1y;
import defpackage.ixv;
import defpackage.jl40;
import defpackage.k6w;
import defpackage.kt1;
import defpackage.lt1;
import defpackage.m390;
import defpackage.n8e;
import defpackage.p8e;
import defpackage.sls;
import defpackage.t300;
import defpackage.tls;
import defpackage.udq0;
import defpackage.uz40;
import defpackage.wa30;
import defpackage.wz40;
import defpackage.x910;
import defpackage.yci0;
import defpackage.z0y;
import defpackage.z5w;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class p extends androidx.compose.ui.layout.o implements x910, lt1, wa30 {
    public boolean C;
    public boolean D;
    public boolean F;
    public tls H;
    public androidx.compose.ui.graphics.layer.a I;
    public float J;
    public Object L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean U;
    public float a0;
    public boolean b0;
    public tls c0;
    public androidx.compose.ui.graphics.layer.a d0;
    public float f0;
    public boolean h0;
    public final j y;
    public boolean z;
    public int A = Integer.MAX_VALUE;
    public int B = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent E = LayoutNode.UsageByParent.NotUsed;
    public long G = 0;
    public boolean K = true;
    public final b1y R = new b1y(this);
    public final wz40 S = new wz40(new p[16]);
    public boolean T = true;
    public long V = p8e.b(0, 0, 0, 0, 15);
    public final sls W = new sls() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            p.this.y.a().l0(p.this.V);
            return zy11.a;
        }
    };
    public final sls Z = new sls() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt1;", "it", "Lzy11;", "invoke", "(Llt1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        /* renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements tls {
            public static final AnonymousClass1 w = new AnonymousClass1(1);

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((lt1) obj).b().d = false;
                return zy11.a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt1;", "it", "Lzy11;", "invoke", "(Llt1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        /* renamed from: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1$4, reason: invalid class name */
        final class AnonymousClass4 extends Lambda implements tls {
            public static final AnonymousClass4 w = new AnonymousClass4(1);

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                lt1 lt1Var = (lt1) obj;
                lt1Var.b().e = lt1Var.b().d;
                return zy11.a;
            }
        }

        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            j jVar = p.this.y;
            jVar.i = 0;
            wz40 x = jVar.a.x();
            Object[] objArr = x.a;
            int i = x.c;
            for (int i2 = 0; i2 < i; i2++) {
                p pVar = ((LayoutNode) objArr[i2]).b0.p;
                pVar.A = pVar.B;
                pVar.B = Integer.MAX_VALUE;
                pVar.N = false;
                if (pVar.E == LayoutNode.UsageByParent.InLayoutBlock) {
                    pVar.E = LayoutNode.UsageByParent.NotUsed;
                }
            }
            p.this.D(AnonymousClass1.w);
            if (p.this.X().D) {
                List k = p.this.y.a.k();
                int size = k.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((s) ((LayoutNode) ((uz40) k).get(i3)).a0.e).D = true;
                }
            }
            p.this.X().J0().c();
            if (p.this.X().D) {
                List k2 = p.this.y.a.k();
                int size2 = k2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((s) ((LayoutNode) ((uz40) k2).get(i4)).a0.e).D = false;
                }
            }
            LayoutNode layoutNode = p.this.y.a;
            wz40 x2 = layoutNode.x();
            Object[] objArr2 = x2.a;
            int i5 = x2.c;
            for (int i6 = 0; i6 < i5; i6++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr2[i6];
                j jVar2 = layoutNode2.b0;
                if (jVar2.p.A != layoutNode2.t()) {
                    layoutNode.M();
                    layoutNode.A();
                    if (layoutNode2.t() == Integer.MAX_VALUE) {
                        if (jVar2.c || udq0.D(layoutNode2)) {
                            jVar2.q.K0(false);
                        }
                        jVar2.p.E0();
                    }
                }
            }
            p.this.D(AnonymousClass4.w);
            return zy11.a;
        }
    };
    public long e0 = 0;
    public final sls g0 = new sls() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            o.a placementScope;
            s sVar = p.this.y.a().K;
            if (sVar == null || (placementScope = sVar.E) == null) {
                placementScope = d1y.a(p.this.y.a).getPlacementScope();
            }
            p pVar = p.this;
            tls tlsVar = pVar.c0;
            j jVar = pVar.y;
            androidx.compose.ui.graphics.layer.a aVar = pVar.d0;
            if (aVar != null) {
                s a = jVar.a();
                long j = pVar.e0;
                float f = pVar.f0;
                placementScope.getClass();
                o.a.a(placementScope, a);
                a.x0(z5w.c(j, a.x), f, aVar);
            } else if (tlsVar == null) {
                s a2 = jVar.a();
                long j2 = pVar.e0;
                float f2 = pVar.f0;
                placementScope.getClass();
                o.a.a(placementScope, a2);
                a2.s0(z5w.c(j2, a2.x), f2, null);
            } else {
                s a3 = jVar.a();
                long j3 = pVar.e0;
                float f3 = pVar.f0;
                placementScope.getClass();
                o.a.a(placementScope, a3);
                a3.s0(z5w.c(j3, a3.x), f3, tlsVar);
            }
            return zy11.a;
        }
    };

    public p(j jVar) {
        this.y = jVar;
    }

    @Override // defpackage.lt1
    public final lt1 A() {
        j jVar;
        LayoutNode s = this.y.a.s();
        if (s == null || (jVar = s.b0) == null) {
            return null;
        }
        return jVar.p;
    }

    public final List A0() {
        j jVar = this.y;
        jVar.a.d0();
        boolean z = this.T;
        wz40 wz40Var = this.S;
        if (!z) {
            return wz40Var.f();
        }
        LayoutNode layoutNode = jVar.a;
        wz40 x = layoutNode.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (wz40Var.c <= i2) {
                wz40Var.b(layoutNode2.b0.p);
            } else {
                p pVar = layoutNode2.b0.p;
                Object[] objArr2 = wz40Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = pVar;
            }
        }
        wz40Var.l(((uz40) layoutNode.k()).a.c, wz40Var.c);
        this.T = false;
        return wz40Var.f();
    }

    public final void C0() {
        boolean z = this.M;
        this.M = true;
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        t300 t300Var = layoutNode.a0;
        if (!z) {
            ((f) t300Var.d).m1();
            d1y.a(layoutNode).getRectManager().e(jVar.a);
            if (layoutNode.o()) {
                LayoutNode.T(layoutNode, true, 6);
            } else if (layoutNode.b0.e) {
                LayoutNode.R(layoutNode, true, 6);
            }
        }
        s sVar = ((f) t300Var.d).J;
        for (s sVar2 = (s) t300Var.e; !jl40.l(sVar2, sVar) && sVar2 != null; sVar2 = sVar2.J) {
            if (sVar2.g0) {
                sVar2.i1();
            }
        }
        wz40 x = layoutNode.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.t() != Integer.MAX_VALUE) {
                layoutNode2.b0.p.C0();
                LayoutNode.U(layoutNode2);
            }
        }
    }

    @Override // defpackage.lt1
    public final void D(tls tlsVar) {
        wz40 x = this.y.a.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            tlsVar.invoke(((LayoutNode) objArr[i2]).b0.p);
        }
    }

    public final void E0() {
        if (this.M) {
            this.M = false;
            j jVar = this.y;
            LayoutNode layoutNode = jVar.a;
            LayoutNode layoutNode2 = jVar.a;
            d1y.a(layoutNode).getRectManager().f(layoutNode2);
            t300 t300Var = layoutNode2.a0;
            s sVar = ((f) t300Var.d).J;
            for (s sVar2 = (s) t300Var.e; !jl40.l(sVar2, sVar) && sVar2 != null; sVar2 = sVar2.J) {
                sVar2.o1();
                sVar2.t1();
            }
            wz40 x = layoutNode2.x();
            Object[] objArr = x.a;
            int i = x.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).b0.p.E0();
            }
        }
    }

    public final void F0() {
        j jVar = this.y;
        LayoutNode.T(jVar.a, false, 7);
        LayoutNode layoutNode = jVar.a;
        LayoutNode s = layoutNode.s();
        if (s == null || layoutNode.V != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        int i = o.a[s.b0.d.ordinal()];
        layoutNode.V = i != 1 ? i != 2 ? s.V : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock;
    }

    public final void G0() {
        this.b0 = true;
        j jVar = this.y;
        LayoutNode s = jVar.a.s();
        float f = X().U;
        LayoutNode layoutNode = jVar.a;
        t300 t300Var = layoutNode.a0;
        s sVar = (s) t300Var.e;
        f fVar = (f) t300Var.d;
        while (sVar != fVar) {
            g gVar = (g) sVar;
            f += gVar.U;
            sVar = gVar.J;
        }
        if (f != this.a0) {
            this.a0 = f;
            if (s != null) {
                s.M();
            }
            if (s != null) {
                s.A();
            }
        }
        if (!X().D) {
            boolean z = this.M;
            if (!z || this.R.e()) {
                C0();
            }
            if (z) {
                ((f) layoutNode.a0.d).m1();
            } else {
                if (s != null) {
                    s.A();
                }
                if (this.z && s != null) {
                    s.S(false);
                }
            }
        }
        if (s != null) {
            j jVar2 = s.b0;
            if (!this.z && jVar2.d == LayoutNode.LayoutState.LayingOut) {
                if (this.B != Integer.MAX_VALUE) {
                    ixv.b("Place was called on a node which was placed already");
                }
                int i = jVar2.i;
                this.B = i;
                jVar2.i = i + 1;
            }
        } else {
            this.B = 0;
        }
        O();
    }

    public final void H0(long j, float f, tls tlsVar, androidx.compose.ui.graphics.layer.a aVar) {
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        LayoutNode layoutNode2 = jVar.a;
        if (layoutNode.l0) {
            ixv.a("place is called on a deactivated node");
        }
        jVar.d = LayoutNode.LayoutState.LayingOut;
        this.G = j;
        this.J = f;
        this.H = tlsVar;
        this.I = aVar;
        this.b0 = false;
        m390 a = d1y.a(layoutNode2);
        if (this.P || !this.M) {
            this.R.g = false;
            jVar.e(false);
            this.c0 = tlsVar;
            this.e0 = j;
            this.f0 = f;
            this.d0 = aVar;
            w snapshotObserver = a.getSnapshotObserver();
            snapshotObserver.a.c(layoutNode2, snapshotObserver.f, this.g0);
        } else {
            s a2 = jVar.a();
            a2.r1(z5w.c(j, a2.x), f, tlsVar, aVar);
            G0();
        }
        jVar.d = LayoutNode.LayoutState.Idle;
        if (jVar.a().D && (jVar.k || jVar.j)) {
            requestLayout();
        }
        this.D = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:13:0x0036, B:15:0x003a, B:17:0x0040, B:19:0x0048, B:21:0x0054, B:23:0x005c, B:24:0x0060, B:25:0x004c, B:26:0x0072, B:28:0x0076, B:30:0x007c, B:31:0x0081, B:35:0x001f, B:37:0x0023, B:39:0x0027, B:41:0x002b), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:10:0x002f, B:12:0x0033, B:13:0x0036, B:15:0x003a, B:17:0x0040, B:19:0x0048, B:21:0x0054, B:23:0x005c, B:24:0x0060, B:25:0x004c, B:26:0x0072, B:28:0x0076, B:30:0x007c, B:31:0x0081, B:35:0x001f, B:37:0x0023, B:39:0x0027, B:41:0x002b), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(long j, float f, tls tlsVar, androidx.compose.ui.graphics.layer.a aVar) {
        l lVar;
        l lVar2;
        l lVar3;
        s sVar;
        LayoutNode s;
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        LayoutNode layoutNode2 = jVar.a;
        try {
            this.N = true;
            if (z5w.a(j, this.G)) {
                if (tlsVar == this.H) {
                    if (this.h0) {
                    }
                    lVar = jVar.q;
                    if (lVar != null) {
                        lVar.N0();
                    }
                    lVar2 = jVar.q;
                    if (lVar2 != null && lVar2.G0()) {
                        sVar = jVar.a().K;
                        if (sVar != null || (r3 = sVar.E) == null) {
                            o.a placementScope = d1y.a(layoutNode2).getPlacementScope();
                        }
                        l lVar4 = jVar.q;
                        s = layoutNode2.s();
                        if (s != null) {
                            s.b0.h = 0;
                        }
                        lVar4.Y0();
                        placementScope.g(lVar4, (int) (j >> 32), (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j), 0.0f);
                    }
                    lVar3 = jVar.q;
                    if (lVar3 != null && !lVar3.H0()) {
                        ixv.b("Error: Placement happened before lookahead.");
                    }
                    H0(j, f, tlsVar, aVar);
                }
            }
            if (jVar.k || jVar.j || this.h0) {
                this.P = true;
                this.h0 = false;
            }
            lVar = jVar.q;
            if (lVar != null) {
            }
            lVar2 = jVar.q;
            if (lVar2 != null) {
                sVar = jVar.a().K;
                if (sVar != null) {
                }
                o.a placementScope2 = d1y.a(layoutNode2).getPlacementScope();
                l lVar42 = jVar.q;
                s = layoutNode2.s();
                if (s != null) {
                }
                lVar42.Y0();
                placementScope2.g(lVar42, (int) (j >> 32), (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j), 0.0f);
            }
            lVar3 = jVar.q;
            if (lVar3 != null) {
                ixv.b("Error: Placement happened before lookahead.");
            }
            H0(j, f, tlsVar, aVar);
        } catch (Throwable th) {
            layoutNode.W(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:24:0x0063, B:26:0x0080, B:27:0x0086, B:29:0x0092, B:31:0x009c, B:35:0x00a8, B:37:0x005e), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0043, B:24:0x0063, B:26:0x0080, B:27:0x0086, B:29:0x0092, B:31:0x009c, B:35:0x00a8, B:37:0x005e), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J0(long j) {
        boolean z;
        long j2;
        LayoutNode.LayoutState layoutState;
        LayoutNode.LayoutState layoutState2;
        LayoutNode.LayoutState layoutState3;
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        LayoutNode layoutNode2 = jVar.a;
        try {
            if (layoutNode.l0) {
                ixv.a("measure is called on a deactivated node");
            }
            m390 a = d1y.a(layoutNode2);
            LayoutNode s = layoutNode2.s();
            boolean z2 = true;
            if (!layoutNode2.Z && (s == null || !s.Z)) {
                z = false;
                layoutNode2.Z = z;
                if (!layoutNode2.o() && n8e.c(this.w, j)) {
                    a.forceMeasureTheSubtree(layoutNode2, false);
                    layoutNode2.V();
                    return false;
                }
                this.R.f = false;
                D(MeasurePassDelegate$remeasure$1$2.w);
                this.C = true;
                j2 = jVar.a().c;
                z0(j);
                layoutState = jVar.d;
                layoutState2 = LayoutNode.LayoutState.Idle;
                if (layoutState == layoutState2) {
                    ixv.b("layout state is not idle before measure starts");
                }
                this.V = j;
                layoutState3 = LayoutNode.LayoutState.Measuring;
                jVar.d = layoutState3;
                this.O = false;
                w snapshotObserver = d1y.a(layoutNode2).getSnapshotObserver();
                snapshotObserver.a.c(layoutNode2, snapshotObserver.c, this.W);
                if (jVar.d == layoutState3) {
                    this.P = true;
                    this.Q = true;
                    jVar.d = layoutState2;
                }
                if (k6w.a(jVar.a().c, j2) && jVar.a().a == this.a && jVar.a().b == this.b) {
                    z2 = false;
                }
                y0((jVar.a().b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (jVar.a().a << 32));
                return z2;
            }
            z = true;
            layoutNode2.Z = z;
            if (!layoutNode2.o()) {
                a.forceMeasureTheSubtree(layoutNode2, false);
                layoutNode2.V();
                return false;
            }
            this.R.f = false;
            D(MeasurePassDelegate$remeasure$1$2.w);
            this.C = true;
            j2 = jVar.a().c;
            z0(j);
            layoutState = jVar.d;
            layoutState2 = LayoutNode.LayoutState.Idle;
            if (layoutState == layoutState2) {
            }
            this.V = j;
            layoutState3 = LayoutNode.LayoutState.Measuring;
            jVar.d = layoutState3;
            this.O = false;
            w snapshotObserver2 = d1y.a(layoutNode2).getSnapshotObserver();
            snapshotObserver2.a.c(layoutNode2, snapshotObserver2.c, this.W);
            if (jVar.d == layoutState3) {
            }
            if (k6w.a(jVar.a().c, j2)) {
                z2 = false;
            }
            y0((jVar.a().b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (jVar.a().a << 32));
            return z2;
        } catch (Throwable th) {
            layoutNode.W(th);
            throw null;
        }
    }

    public final void K0() {
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        LayoutNode layoutNode2 = jVar.a;
        if (!layoutNode.G() || jVar.l <= 0) {
            return;
        }
        j jVar2 = layoutNode2.b0;
        if ((jVar2.j || jVar2.k) && !jVar2.p.P) {
            layoutNode2.S(false);
        }
        wz40 x = layoutNode2.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).b0.p.K0();
        }
    }

    @Override // defpackage.lt1
    public final void O() {
        boolean z;
        this.U = true;
        b1y b1yVar = this.R;
        b1yVar.i();
        boolean z2 = this.P;
        j jVar = this.y;
        if (z2) {
            wz40 x = jVar.a.x();
            Object[] objArr = x.a;
            int i = x.c;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                boolean o = layoutNode.o();
                j jVar2 = layoutNode.b0;
                if (o && layoutNode.p() == LayoutNode.UsageByParent.InMeasureBlock) {
                    p pVar = jVar2.p;
                    n8e n8eVar = pVar.C ? new n8e(pVar.w) : null;
                    if (n8eVar != null) {
                        if (layoutNode.V == LayoutNode.UsageByParent.NotUsed) {
                            layoutNode.c();
                        }
                        z = jVar2.p.J0(n8eVar.a);
                    } else {
                        z = false;
                    }
                    if (z) {
                        LayoutNode.T(jVar.a, false, 7);
                    }
                }
            }
        }
        if (this.Q || (!this.F && !X().D && this.P)) {
            this.P = false;
            LayoutNode.LayoutState layoutState = jVar.d;
            jVar.d = LayoutNode.LayoutState.LayingOut;
            jVar.f(false);
            LayoutNode layoutNode2 = jVar.a;
            w snapshotObserver = d1y.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.a.c(layoutNode2, snapshotObserver.e, this.Z);
            jVar.d = layoutState;
            this.Q = false;
        }
        if (b1yVar.d) {
            b1yVar.e = true;
        }
        if (b1yVar.b && b1yVar.f()) {
            b1yVar.h();
        }
        this.U = false;
    }

    @Override // defpackage.x910
    public final int V(int i) {
        j jVar = this.y;
        if (udq0.D(jVar.a)) {
            return jVar.q.V(i);
        }
        F0();
        return jVar.a().V(i);
    }

    @Override // defpackage.lt1
    public final f X() {
        return (f) this.y.a.a0.d;
    }

    @Override // defpackage.ca10, defpackage.x910
    public final Object a() {
        return this.L;
    }

    @Override // defpackage.lt1
    public final a b() {
        return this.R;
    }

    @Override // defpackage.x910
    public final int e0(int i) {
        j jVar = this.y;
        if (udq0.D(jVar.a)) {
            return jVar.q.e0(i);
        }
        F0();
        return jVar.a().e0(i);
    }

    @Override // defpackage.wa30
    public final void g(boolean z) {
        j jVar = this.y;
        if (z != jVar.a().B) {
            jVar.a().B = z;
            this.h0 = true;
        }
    }

    @Override // defpackage.x910
    public final int k0(int i) {
        j jVar = this.y;
        if (udq0.D(jVar.a)) {
            return jVar.q.k0(i);
        }
        F0();
        return jVar.a().k0(i);
    }

    @Override // defpackage.x910
    public final androidx.compose.ui.layout.o l0(long j) {
        LayoutNode.UsageByParent usageByParent;
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        LayoutNode layoutNode2 = jVar.a;
        LayoutNode.UsageByParent usageByParent2 = layoutNode.V;
        LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.NotUsed;
        if (usageByParent2 == usageByParent3) {
            layoutNode.c();
        }
        if (udq0.D(layoutNode2)) {
            l lVar = jVar.q;
            lVar.X0(usageByParent3);
            lVar.l0(j);
        }
        LayoutNode s = layoutNode2.s();
        if (s != null) {
            j jVar2 = s.b0;
            if (this.E != usageByParent3 && !layoutNode2.Z) {
                ixv.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = o.a[jVar2.d.ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    yci0.t(jVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.E = usageByParent;
        } else {
            this.E = usageByParent3;
        }
        J0(j);
        return this;
    }

    @Override // androidx.compose.ui.layout.o
    public final int m0() {
        return this.y.a().m0();
    }

    @Override // androidx.compose.ui.layout.o
    public final int n0() {
        return this.y.a().n0();
    }

    @Override // defpackage.lt1
    public final int o() {
        return this.B;
    }

    @Override // defpackage.lt1
    public final void requestLayout() {
        LayoutNode layoutNode = this.y.a;
        z0y z0yVar = LayoutNode.m0;
        layoutNode.S(false);
    }

    @Override // androidx.compose.ui.layout.o
    public final void s0(long j, float f, tls tlsVar) {
        I0(j, f, tlsVar, null);
    }

    @Override // defpackage.ca10
    public final int u(kt1 kt1Var) {
        j jVar = this.y;
        LayoutNode s = jVar.a.s();
        LayoutNode.LayoutState layoutState = s != null ? s.b0.d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
        b1y b1yVar = this.R;
        if (layoutState == layoutState2) {
            b1yVar.c = true;
        } else {
            LayoutNode s2 = jVar.a.s();
            if ((s2 != null ? s2.b0.d : null) == LayoutNode.LayoutState.LayingOut) {
                b1yVar.d = true;
            }
        }
        this.F = true;
        int u = jVar.a().u(kt1Var);
        this.F = false;
        return u;
    }

    @Override // defpackage.lt1
    public final void x() {
        LayoutNode.T(this.y.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.o
    public final void x0(long j, float f, androidx.compose.ui.graphics.layer.a aVar) {
        I0(j, f, null, aVar);
    }

    @Override // defpackage.x910
    public final int y(int i) {
        j jVar = this.y;
        if (udq0.D(jVar.a)) {
            return jVar.q.y(i);
        }
        F0();
        return jVar.a().y(i);
    }
}
