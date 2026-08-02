package androidx.compose.ui.node;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LayoutNode;
import defpackage.d1y;
import defpackage.ixv;
import defpackage.koz;
import defpackage.kt1;
import defpackage.lt1;
import defpackage.m390;
import defpackage.n8e;
import defpackage.noz;
import defpackage.ny61;
import defpackage.p8e;
import defpackage.sls;
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

/* loaded from: classes10.dex */
public final class l extends androidx.compose.ui.layout.o implements x910, lt1, wa30 {
    public boolean D;
    public boolean E;
    public boolean F;
    public n8e G;
    public tls I;
    public androidx.compose.ui.graphics.layer.a J;
    public boolean O;
    public Object R;
    public boolean V;
    public final j y;
    public boolean z;
    public int A = Integer.MAX_VALUE;
    public int B = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent C = LayoutNode.UsageByParent.NotUsed;
    public long H = 0;
    public LookaheadPassDelegate$PlacedState K = LookaheadPassDelegate$PlacedState.IsNotPlaced;
    public final koz L = new koz(this);
    public final wz40 M = new wz40(new l[16]);
    public boolean N = true;
    public final sls P = new sls() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt1;", "child", "Lzy11;", "invoke", "(Llt1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        /* renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
        final class AnonymousClass1 extends Lambda implements tls {
            public static final AnonymousClass1 w = new AnonymousClass1(1);

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((lt1) obj).b().d = false;
                return zy11.a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llt1;", "child", "Lzy11;", "invoke", "(Llt1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        /* renamed from: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1$4, reason: invalid class name */
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
            j jVar = l.this.y;
            jVar.h = 0;
            wz40 x = jVar.a.x();
            Object[] objArr = x.a;
            int i = x.c;
            for (int i2 = 0; i2 < i; i2++) {
                l lVar = ((LayoutNode) objArr[i2]).b0.q;
                lVar.A = lVar.B;
                lVar.B = Integer.MAX_VALUE;
                if (lVar.C == LayoutNode.UsageByParent.InLayoutBlock) {
                    lVar.C = LayoutNode.UsageByParent.NotUsed;
                }
            }
            l.this.D(AnonymousClass1.w);
            e eVar = l.this.X().r0;
            if (eVar != null) {
                boolean z = eVar.D;
                List k = l.this.y.a.k();
                int size = k.size();
                for (int i3 = 0; i3 < size; i3++) {
                    noz Z0 = ((s) ((LayoutNode) ((uz40) k).get(i3)).a0.e).Z0();
                    if (Z0 != null) {
                        Z0.D = z;
                    }
                }
            }
            l.this.X().r0.J0().c();
            if (l.this.X().r0 != null) {
                List k2 = l.this.y.a.k();
                int size2 = k2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    noz Z02 = ((s) ((LayoutNode) ((uz40) k2).get(i4)).a0.e).Z0();
                    if (Z02 != null) {
                        Z02.D = false;
                    }
                }
            }
            wz40 x2 = l.this.y.a.x();
            Object[] objArr2 = x2.a;
            int i5 = x2.c;
            for (int i6 = 0; i6 < i5; i6++) {
                l lVar2 = ((LayoutNode) objArr2[i6]).b0.q;
                int i7 = lVar2.A;
                int i8 = lVar2.B;
                if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                    lVar2.K0(true);
                }
            }
            l.this.D(AnonymousClass4.w);
            return zy11.a;
        }
    };
    public boolean Q = true;
    public long S = p8e.b(0, 0, 0, 0, 15);
    public final sls T = new sls() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            l.this.y.a().Z0().l0(l.this.S);
            return zy11.a;
        }
    };
    public final sls U = new sls() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
        @Override // defpackage.sls
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke() {
            noz Z0;
            o.a aVar = null;
            if (!udq0.D(l.this.y.a)) {
                j jVar = l.this.y;
                if (!jVar.c) {
                    s sVar = jVar.a().K;
                    if (sVar != null && (Z0 = sVar.Z0()) != null) {
                        aVar = Z0.E;
                    }
                    if (aVar == null) {
                        aVar = d1y.a(l.this.y.a).getPlacementScope();
                    }
                    l lVar = l.this;
                    o.a.m(aVar, lVar.y.a().Z0(), lVar.H);
                    return zy11.a;
                }
            }
            s sVar2 = l.this.y.a().K;
            if (sVar2 != null) {
                aVar = sVar2.E;
            }
            if (aVar == null) {
            }
            l lVar2 = l.this;
            o.a.m(aVar, lVar2.y.a().Z0(), lVar2.H);
            return zy11.a;
        }
    };

    public l(j jVar) {
        this.y = jVar;
        this.R = jVar.p.L;
    }

    @Override // defpackage.lt1
    public final lt1 A() {
        j jVar;
        LayoutNode s = this.y.a.s();
        if (s == null || (jVar = s.b0) == null) {
            return null;
        }
        return jVar.q;
    }

    public final List A0() {
        j jVar = this.y;
        jVar.a.k();
        boolean z = this.N;
        wz40 wz40Var = this.M;
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
                wz40Var.b(layoutNode2.b0.q);
            } else {
                l lVar = layoutNode2.b0.q;
                Object[] objArr2 = wz40Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = lVar;
            }
        }
        wz40Var.l(((uz40) layoutNode.k()).a.c, wz40Var.c);
        this.N = false;
        return wz40Var.f();
    }

    public final n8e C0() {
        return this.G;
    }

    @Override // defpackage.lt1
    public final void D(tls tlsVar) {
        wz40 x = this.y.a.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            tlsVar.invoke(((LayoutNode) objArr[i2]).b0.q);
        }
    }

    public final boolean E0() {
        return this.O;
    }

    public final LayoutNode.UsageByParent F0() {
        return this.C;
    }

    public final boolean G0() {
        j jVar = this.y;
        return udq0.D(jVar.a) || jVar.c;
    }

    public final boolean H0() {
        return this.E;
    }

    public final void I0(boolean z) {
        LayoutNode s;
        j jVar = this.y;
        LayoutNode s2 = jVar.a.s();
        LayoutNode.UsageByParent usageByParent = jVar.a.V;
        if (s2 == null || usageByParent == LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        while (s2.V == usageByParent && (s = s2.s()) != null) {
            s2 = s;
        }
        int i = k.b[usageByParent.ordinal()];
        if (i == 1) {
            if (s2.A != null) {
                LayoutNode.R(s2, z, 6);
                return;
            } else {
                LayoutNode.T(s2, z, 6);
                return;
            }
        }
        if (i != 2) {
            ny61.r("Intrinsics isn't used by the parent");
        } else if (s2.A != null) {
            s2.Q(z);
        } else {
            s2.S(z);
        }
    }

    public final boolean J0() {
        return this.K != LookaheadPassDelegate$PlacedState.IsNotPlaced;
    }

    public final void K0(boolean z) {
        if (z && G0()) {
            return;
        }
        if (z || G0()) {
            this.K = LookaheadPassDelegate$PlacedState.IsNotPlaced;
            wz40 x = this.y.a.x();
            Object[] objArr = x.a;
            int i = x.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).b0.q.K0(true);
            }
        }
    }

    public final void L0() {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.K;
        j jVar = this.y;
        boolean z = jVar.c;
        LayoutNode layoutNode = jVar.a;
        if (z) {
            this.K = LookaheadPassDelegate$PlacedState.IsPlacedInApproach;
        } else {
            this.K = LookaheadPassDelegate$PlacedState.IsPlacedInLookahead;
        }
        if (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && jVar.e) {
            LayoutNode.R(layoutNode, true, 6);
        }
        wz40 x = layoutNode.x();
        Object[] objArr = x.a;
        int i = x.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            l lVar = layoutNode2.b0.q;
            if (lVar == null) {
                ny61.g("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (lVar.B != Integer.MAX_VALUE) {
                lVar.L0();
                LayoutNode.U(layoutNode2);
            }
        }
    }

    public final void M0() {
        j jVar = this.y;
        if (jVar.o > 0) {
            wz40 x = jVar.a.x();
            Object[] objArr = x.a;
            int i = x.c;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                j jVar2 = layoutNode.b0;
                if ((jVar2.m || jVar2.n) && !jVar2.f) {
                    layoutNode.Q(false);
                }
                l lVar = jVar2.q;
                if (lVar != null) {
                    lVar.M0();
                }
            }
        }
    }

    public final void N0() {
        if (this.K == LookaheadPassDelegate$PlacedState.IsNotPlaced) {
            j jVar = this.y;
            if (udq0.D(jVar.a)) {
                return;
            }
            jVar.c = true;
        }
    }

    @Override // defpackage.lt1
    public final void O() {
        this.O = true;
        koz kozVar = this.L;
        kozVar.i();
        j jVar = this.y;
        boolean z = jVar.f;
        LayoutNode layoutNode = jVar.a;
        if (z) {
            wz40 x = layoutNode.x();
            Object[] objArr = x.a;
            int i = x.c;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
                if (layoutNode2.b0.e && layoutNode2.q() == LayoutNode.UsageByParent.InMeasureBlock) {
                    l lVar = layoutNode2.b0.q;
                    if (lVar.U0((lVar != null ? lVar.C0() : null).a)) {
                        LayoutNode.R(layoutNode, false, 7);
                    }
                }
            }
        }
        e eVar = X().r0;
        if (jVar.g || (!this.D && !eVar.D && jVar.f)) {
            jVar.f = false;
            LayoutNode.LayoutState layoutState = jVar.d;
            jVar.d = LayoutNode.LayoutState.LookaheadLayingOut;
            jVar.h(false);
            w snapshotObserver = d1y.a(layoutNode).getSnapshotObserver();
            snapshotObserver.a.c(layoutNode, snapshotObserver.h, this.P);
            jVar.d = layoutState;
            if (jVar.m && eVar.D) {
                requestLayout();
            }
            jVar.g = false;
        }
        if (kozVar.d) {
            kozVar.e = true;
        }
        if (kozVar.b && kozVar.f()) {
            kozVar.h();
        }
        this.O = false;
    }

    public final void O0() {
        this.K = LookaheadPassDelegate$PlacedState.IsPlacedInLookahead;
    }

    public final void P0() {
        j jVar = this.y;
        LayoutNode.R(jVar.a, false, 7);
        LayoutNode layoutNode = jVar.a;
        LayoutNode s = layoutNode.s();
        if (s == null || layoutNode.V != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        int i = k.a[s.b0.d.ordinal()];
        layoutNode.V = i != 2 ? i != 3 ? s.V : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock;
    }

    public final void Q0() {
        this.B = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.K = LookaheadPassDelegate$PlacedState.IsNotPlaced;
    }

    public final void R0() {
        LayoutNode.LayoutState layoutState;
        this.V = true;
        j jVar = this.y;
        LayoutNode s = jVar.a.s();
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = this.K;
        if ((lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInLookahead && !jVar.c) || (lookaheadPassDelegate$PlacedState != LookaheadPassDelegate$PlacedState.IsPlacedInApproach && jVar.c)) {
            L0();
            if (this.z && s != null) {
                s.Q(false);
            }
        }
        if (s != null) {
            j jVar2 = s.b0;
            if (!this.z && ((layoutState = jVar2.d) == LayoutNode.LayoutState.LayingOut || layoutState == LayoutNode.LayoutState.LookaheadLayingOut)) {
                if (this.B != Integer.MAX_VALUE) {
                    ixv.b("Place was called on a node which was placed already");
                }
                int i = jVar2.h;
                this.B = i;
                jVar2.h = i + 1;
            }
        } else {
            this.B = 0;
        }
        O();
    }

    public final void S0(long j) {
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadMeasuring;
        j jVar = this.y;
        jVar.d = layoutState;
        jVar.e = false;
        this.S = j;
        LayoutNode layoutNode = jVar.a;
        w snapshotObserver = d1y.a(layoutNode).getSnapshotObserver();
        snapshotObserver.a.c(layoutNode, snapshotObserver.b, this.T);
        jVar.f = true;
        jVar.g = true;
        boolean D = udq0.D(layoutNode);
        p pVar = jVar.p;
        if (D) {
            pVar.P = true;
            pVar.Q = true;
        } else {
            pVar.O = true;
        }
        jVar.d = LayoutNode.LayoutState.Idle;
    }

    public final void T0(long j, tls tlsVar, androidx.compose.ui.graphics.layer.a aVar) {
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        LayoutNode layoutNode2 = jVar.a;
        try {
            LayoutNode s = layoutNode.s();
            LayoutNode.LayoutState layoutState = s != null ? s.b0.d : null;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.LookaheadLayingOut;
            if (layoutState == layoutState2) {
                jVar.c = false;
            }
            if (layoutNode2.l0) {
                ixv.a("place is called on a deactivated node");
            }
            jVar.d = layoutState2;
            this.E = true;
            this.V = false;
            if (!z5w.a(j, this.H)) {
                if (jVar.n || jVar.m) {
                    jVar.f = true;
                }
                M0();
            }
            m390 a = d1y.a(layoutNode2);
            this.H = j;
            if (jVar.f || !J0()) {
                jVar.g(false);
                this.L.g = false;
                w snapshotObserver = a.getSnapshotObserver();
                snapshotObserver.a.c(layoutNode2, snapshotObserver.g, this.U);
            } else {
                noz Z0 = jVar.a().Z0();
                Z0.S0(z5w.c(j, Z0.x));
                R0();
            }
            this.I = tlsVar;
            this.J = aVar;
            jVar.d = LayoutNode.LayoutState.Idle;
        } catch (Throwable th) {
            layoutNode.W(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0060, B:30:0x0068, B:33:0x007a, B:35:0x007e, B:36:0x0081, B:38:0x009b, B:42:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0060, B:30:0x0068, B:33:0x007a, B:35:0x007e, B:36:0x0081, B:38:0x009b, B:42:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0060, B:30:0x0068, B:33:0x007a, B:35:0x007e, B:36:0x0081, B:38:0x009b, B:42:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0060, B:30:0x0068, B:33:0x007a, B:35:0x007e, B:36:0x0081, B:38:0x009b, B:42:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U0(long j) {
        boolean z;
        noz Z0;
        l lVar;
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        LayoutNode layoutNode2 = jVar.a;
        try {
            if (layoutNode.l0) {
                ixv.a("measure is called on a deactivated node");
            }
            LayoutNode s = layoutNode2.s();
            if (!layoutNode2.Z && (s == null || !s.Z)) {
                z = false;
                layoutNode2.Z = z;
                if (!layoutNode2.b0.e) {
                    n8e n8eVar = this.G;
                    if (n8eVar == null ? false : n8e.c(n8eVar.a, j)) {
                        m390 m390Var = layoutNode2.G;
                        if (m390Var != null) {
                            m390Var.forceMeasureTheSubtree(layoutNode2, true);
                        }
                        layoutNode2.V();
                        return false;
                    }
                }
                this.G = new n8e(j);
                z0(j);
                this.L.f = false;
                D(LookaheadPassDelegate$remeasure$1$2.w);
                long j2 = !this.F ? this.c : -9223372034707292160L;
                this.F = true;
                Z0 = jVar.a().Z0();
                if (Z0 != null) {
                    ixv.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                lVar = jVar.q;
                if (lVar != null) {
                    lVar.S0(j);
                }
                y0((Z0.a << 32) | (Z0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return ((int) (j2 >> 32)) == Z0.a || ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) != Z0.b;
            }
            z = true;
            layoutNode2.Z = z;
            if (!layoutNode2.b0.e) {
            }
            this.G = new n8e(j);
            z0(j);
            this.L.f = false;
            D(LookaheadPassDelegate$remeasure$1$2.w);
            if (!this.F) {
            }
            this.F = true;
            Z0 = jVar.a().Z0();
            if (Z0 != null) {
            }
            lVar = jVar.q;
            if (lVar != null) {
            }
            y0((Z0.a << 32) | (Z0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            if (((int) (j2 >> 32)) == Z0.a) {
            }
        } catch (Throwable th) {
            layoutNode.W(th);
            throw null;
        }
    }

    @Override // defpackage.x910
    public final int V(int i) {
        P0();
        return this.y.a().Z0().V(i);
    }

    public final void V0() {
        LayoutNode s;
        try {
            this.z = true;
            if (!this.E) {
                ixv.b("replace() called on item that was not placed");
            }
            this.V = false;
            boolean J0 = J0();
            T0(this.H, this.I, this.J);
            if (J0 && !this.V && (s = this.y.a.s()) != null) {
                s.Q(false);
            }
            this.z = false;
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    public final void W0() {
        this.N = true;
    }

    @Override // defpackage.lt1
    public final f X() {
        return (f) this.y.a.a0.d;
    }

    public final void X0(LayoutNode.UsageByParent usageByParent) {
        this.C = usageByParent;
    }

    public final void Y0() {
        this.B = Integer.MAX_VALUE;
    }

    public final boolean Z0() {
        Object obj = this.R;
        j jVar = this.y;
        if ((obj == null && jVar.a().Z0().I.a() == null) || !this.Q) {
            return false;
        }
        this.Q = false;
        this.R = jVar.a().Z0().I.a();
        return true;
    }

    @Override // defpackage.ca10, defpackage.x910
    public final Object a() {
        return this.R;
    }

    @Override // defpackage.lt1
    public final a b() {
        return this.L;
    }

    @Override // defpackage.x910
    public final int e0(int i) {
        P0();
        return this.y.a().Z0().e0(i);
    }

    @Override // defpackage.wa30
    public final void g(boolean z) {
        noz Z0;
        j jVar = this.y;
        noz Z02 = jVar.a().Z0();
        if (Boolean.valueOf(z).equals(Z02 != null ? Boolean.valueOf(Z02.B) : null) || (Z0 = jVar.a().Z0()) == null) {
            return;
        }
        Z0.B = z;
    }

    @Override // defpackage.x910
    public final int k0(int i) {
        P0();
        return this.y.a().Z0().k0(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 != null ? r1.b0.d : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L14;
     */
    @Override // defpackage.x910
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.layout.o l0(long j) {
        LayoutNode.UsageByParent usageByParent;
        j jVar = this.y;
        LayoutNode layoutNode = jVar.a;
        LayoutNode layoutNode2 = jVar.a;
        LayoutNode s = layoutNode.s();
        if ((s != null ? s.b0.d : null) != LayoutNode.LayoutState.LookaheadMeasuring) {
            LayoutNode s2 = layoutNode2.s();
        }
        jVar.b = false;
        LayoutNode s3 = layoutNode2.s();
        if (s3 != null) {
            j jVar2 = s3.b0;
            if (this.C != LayoutNode.UsageByParent.NotUsed && !layoutNode2.Z) {
                ixv.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = k.a[jVar2.d.ordinal()];
            if (i == 1 || i == 2) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 3 && i != 4) {
                    yci0.t(jVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.C = usageByParent;
        } else {
            this.C = LayoutNode.UsageByParent.NotUsed;
        }
        if (layoutNode2.V == LayoutNode.UsageByParent.NotUsed) {
            layoutNode2.c();
        }
        U0(j);
        return this;
    }

    @Override // androidx.compose.ui.layout.o
    public final int m0() {
        return this.y.a().Z0().m0();
    }

    @Override // androidx.compose.ui.layout.o
    public final int n0() {
        return this.y.a().Z0().n0();
    }

    @Override // defpackage.lt1
    public final int o() {
        return this.B;
    }

    @Override // defpackage.lt1
    public final void requestLayout() {
        LayoutNode layoutNode = this.y.a;
        z0y z0yVar = LayoutNode.m0;
        layoutNode.Q(false);
    }

    @Override // androidx.compose.ui.layout.o
    public final void s0(long j, float f, tls tlsVar) {
        T0(j, tlsVar, null);
    }

    @Override // defpackage.ca10
    public final int u(kt1 kt1Var) {
        j jVar = this.y;
        LayoutNode s = jVar.a.s();
        LayoutNode.LayoutState layoutState = s != null ? s.b0.d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.LookaheadMeasuring;
        koz kozVar = this.L;
        if (layoutState == layoutState2) {
            kozVar.c = true;
        } else {
            LayoutNode s2 = jVar.a.s();
            if ((s2 != null ? s2.b0.d : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                kozVar.d = true;
            }
        }
        this.D = true;
        int u = jVar.a().Z0().u(kt1Var);
        this.D = false;
        return u;
    }

    @Override // defpackage.lt1
    public final void x() {
        LayoutNode.R(this.y.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.o
    public final void x0(long j, float f, androidx.compose.ui.graphics.layer.a aVar) {
        T0(j, null, aVar);
    }

    @Override // defpackage.x910
    public final int y(int i) {
        P0();
        return this.y.a().Z0().y(i);
    }
}
