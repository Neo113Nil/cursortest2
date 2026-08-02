package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aa10;
import defpackage.ae60;
import defpackage.ae90;
import defpackage.c1y;
import defpackage.ce60;
import defpackage.ci91;
import defpackage.cnu;
import defpackage.d1y;
import defpackage.e530;
import defpackage.ehr0;
import defpackage.f73;
import defpackage.fwi;
import defpackage.fy40;
import defpackage.ga10;
import defpackage.gtb1;
import defpackage.gwd0;
import defpackage.gwk0;
import defpackage.gz40;
import defpackage.i28;
import defpackage.i2t0;
import defpackage.ixv;
import defpackage.izx;
import defpackage.j390;
import defpackage.jl40;
import defpackage.jw01;
import defpackage.jwd0;
import defpackage.kp60;
import defpackage.lqh;
import defpackage.m2k0;
import defpackage.m390;
import defpackage.n390;
import defpackage.n810;
import defpackage.noz;
import defpackage.ny61;
import defpackage.o810;
import defpackage.ooc;
import defpackage.ooz;
import defpackage.p1b1;
import defpackage.pam;
import defpackage.qje;
import defpackage.qke;
import defpackage.qxx;
import defpackage.qy40;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.scc;
import defpackage.sls;
import defpackage.t300;
import defpackage.tje;
import defpackage.tls;
import defpackage.tms;
import defpackage.v7x0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wwg;
import defpackage.wyz0;
import defpackage.wz40;
import defpackage.x4e;
import defpackage.x910;
import defpackage.xva1;
import defpackage.xy40;
import defpackage.z5w;
import defpackage.zd60;
import defpackage.zii0;
import defpackage.zy11;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public abstract class s extends LookaheadCapablePlaceable implements x910, rzx, n390 {
    public static final tls j0 = null;
    public static final tls k0 = null;
    public static final m2k0 l0 = new m2k0();
    public static final qxx m0 = new qxx();
    public static final float[] n0 = n810.a();
    public static final zd60 o0 = new zd60();
    public static final tms p0 = new tms(5);
    public final LayoutNode I;
    public s J;
    public s K;
    public boolean L;
    public boolean M;
    public tls N;
    public fwi O;
    public LayoutDirection P;
    public aa10 R;
    public qy40 S;
    public float U;
    public gz40 V;
    public qxx W;
    public boolean a0;
    public boolean b0;
    public androidx.compose.ui.graphics.layer.a c0;
    public i28 d0;
    public wls e0;
    public boolean g0;
    public j390 h0;
    public androidx.compose.ui.graphics.layer.a i0;
    public float Q = 0.8f;
    public long T = 0;
    public ehr0 Z = qke.q;
    public final sls f0 = new NodeCoordinator$invalidateParentLayer$1(this);

    public s(LayoutNode layoutNode) {
        this.I = layoutNode;
        this.O = layoutNode.R;
        this.P = layoutNode.S;
    }

    public static s w1(rzx rzxVar) {
        s a;
        ooz oozVar = rzxVar instanceof ooz ? (ooz) rzxVar : null;
        return (oozVar == null || (a = oozVar.a()) == null) ? (s) rzxVar : a;
    }

    public final void A1(tls tlsVar, boolean z) {
        m390 m390Var;
        if (tlsVar != null && this.i0 != null) {
            ixv.a("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = this.I;
        boolean z2 = (!z && this.N == tlsVar && jl40.l(this.O, layoutNode.R) && this.P == layoutNode.S) ? false : true;
        this.O = layoutNode.R;
        this.P = layoutNode.S;
        boolean F = layoutNode.F();
        sls slsVar = this.f0;
        if (!F || tlsVar == null) {
            this.N = null;
            j390 j390Var = this.h0;
            if (j390Var != null) {
                if (!ooc.s(j390Var.mo78getUnderlyingMatrixsQKQjiQ())) {
                    layoutNode.L(this);
                }
                j390Var.destroy();
                this.h0 = null;
                layoutNode.e0 = true;
                ((NodeCoordinator$invalidateParentLayer$1) slsVar).invoke();
                if (d() && layoutNode.G() && (m390Var = layoutNode.G) != null) {
                    m390Var.onLayoutChange(layoutNode);
                }
            }
            this.g0 = false;
            return;
        }
        this.N = tlsVar;
        if (this.h0 != null) {
            if (z2) {
                B1(true);
                return;
            }
            return;
        }
        m390 a = d1y.a(layoutNode);
        wls wlsVar = this.e0;
        if (wlsVar == null) {
            NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = new NodeCoordinator$drawBlock$1(new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this), this);
            this.e0 = nodeCoordinator$drawBlock$1;
            wlsVar = nodeCoordinator$drawBlock$1;
        }
        j390 createLayer = a.createLayer(wlsVar, slsVar, null);
        createLayer.mo83resizeozmzZPI(this.c);
        createLayer.mo82movegyyYBs(this.T);
        this.h0 = createLayer;
        B1(true);
        layoutNode.e0 = true;
        ((NodeCoordinator$invalidateParentLayer$1) slsVar).invoke();
    }

    @Override // defpackage.rzx
    public final void B(rzx rzxVar, float[] fArr) {
        s w1 = w1(rzxVar);
        w1.k1();
        s X0 = X0(w1);
        n810.d(fArr);
        w1.z1(X0, fArr);
        y1(X0, fArr);
    }

    public final void B1(boolean z) {
        m390 m390Var;
        if (this.i0 != null) {
            return;
        }
        j390 j390Var = this.h0;
        final tls tlsVar = this.N;
        if (j390Var == null) {
            if (tlsVar == null) {
                return;
            }
            ixv.b("null layer with a non-null layerBlock");
            return;
        }
        if (tlsVar == null) {
            throw x4e.v("updateLayerParameters requires a non-null layerBlock");
        }
        m2k0 m2k0Var = l0;
        m2k0Var.a();
        LayoutNode layoutNode = this.I;
        m2k0Var.K = layoutNode.R;
        m2k0Var.L = layoutNode.S;
        m2k0Var.J = rzo.a0(this.c);
        d1y.a(layoutNode).getSnapshotObserver().a.c(this, NodeCoordinator$Companion$onCommitAffectingLayerParams$1.w, new sls() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tls tlsVar2 = tls.this;
                m2k0 m2k0Var2 = s.l0;
                tlsVar2.invoke(m2k0Var2);
                boolean l = jl40.l(this.Z, m2k0Var2.G);
                s sVar = this;
                boolean z2 = sVar.a0;
                boolean z3 = m2k0Var2.H;
                boolean z4 = z2 != z3;
                if (!l || z4) {
                    sVar.Z = m2k0Var2.G;
                    sVar.a0 = z3;
                    if (sVar.b0 && (z4 || (z3 && !l))) {
                        sVar.I.D();
                    }
                }
                this.b0 = true;
                m2k0Var2.N = m2k0Var2.G.a(m2k0Var2.J, m2k0Var2.L, m2k0Var2.K);
                return zy11.a;
            }
        });
        qxx qxxVar = this.W;
        if (qxxVar == null) {
            qxxVar = new qxx();
            this.W = qxxVar;
        }
        qxx qxxVar2 = m0;
        qxxVar2.getClass();
        qxxVar2.a = qxxVar.a;
        qxxVar2.b = qxxVar.b;
        qxxVar2.c = qxxVar.c;
        qxxVar2.d = qxxVar.d;
        qxxVar2.e = qxxVar.e;
        qxxVar2.f = qxxVar.f;
        qxxVar2.g = qxxVar.g;
        qxxVar2.h = qxxVar.h;
        qxxVar.a = m2k0Var.b;
        qxxVar.b = m2k0Var.c;
        qxxVar.c = m2k0Var.x;
        qxxVar.d = m2k0Var.y;
        qxxVar.e = m2k0Var.C;
        qxxVar.f = m2k0Var.D;
        qxxVar.g = m2k0Var.E;
        qxxVar.h = m2k0Var.F;
        j390Var.updateLayerProperties(m2k0Var);
        boolean z2 = this.M;
        this.M = m2k0Var.H;
        this.Q = m2k0Var.w;
        boolean z3 = qxxVar2.a == qxxVar.a && qxxVar2.b == qxxVar.b && qxxVar2.c == qxxVar.c && qxxVar2.d == qxxVar.d && qxxVar2.e == qxxVar.e && qxxVar2.f == qxxVar.f && qxxVar2.g == qxxVar.g && jw01.a(qxxVar2.h, qxxVar.h);
        if (z && ((!z3 || z2 != this.M) && (m390Var = layoutNode.G) != null)) {
            m390Var.onLayoutChange(layoutNode);
        }
        if (z3) {
            return;
        }
        layoutNode.L(this);
        if (layoutNode.k0 > 0) {
            d1y.a(layoutNode).requestOnPositionedCallback(layoutNode);
        }
    }

    public final boolean C1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        j390 j390Var = this.h0;
        return j390Var == null || !this.M || j390Var.mo80isInLayerk4lQ0M(j);
    }

    @Override // defpackage.rzx
    public final long G(long j) {
        if (!d()) {
            ixv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        rzx o = gwk0.o(this);
        return U(o, wu60.e(d1y.a(this.I).mo60calculateLocalPositionMKHz9U(j), o.v(0L)));
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable G0() {
        return this.J;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final rzx H0() {
        return this;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean I0() {
        return this.R != null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final aa10 J0() {
        aa10 aa10Var = this.R;
        if (aa10Var != null) {
            return aa10Var;
        }
        ny61.r("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable K0() {
        return this.K;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final long L0() {
        return this.T;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void P0() {
        androidx.compose.ui.graphics.layer.a aVar = this.i0;
        long j = this.T;
        if (aVar != null) {
            x0(j, this.U, aVar);
        } else {
            s0(j, this.U, this.N);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, defpackage.ba10
    public final LayoutNode Q() {
        return this.I;
    }

    public final void Q0(s sVar, gz40 gz40Var, boolean z) {
        if (sVar == this) {
            return;
        }
        s sVar2 = this.K;
        if (sVar2 != null) {
            sVar2.Q0(sVar, gz40Var, z);
        }
        long j = this.T;
        float f = (int) (j >> 32);
        gz40Var.a -= f;
        gz40Var.c -= f;
        float f2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        gz40Var.b -= f2;
        gz40Var.d -= f2;
        j390 j390Var = this.h0;
        if (j390Var != null) {
            j390Var.mapBounds(gz40Var, true);
            if (this.M && z) {
                long j2 = this.c;
                gz40Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
        }
    }

    public final long R0(s sVar, long j) {
        if (sVar == this) {
            return j;
        }
        s sVar2 = this.K;
        return (sVar2 == null || jl40.l(sVar, sVar2)) ? Y0(j) : Y0(sVar2.R0(sVar, j));
    }

    public final long S0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - n0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - m0();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.rzx
    public final long T(rzx rzxVar, long j) {
        return U(rzxVar, j);
    }

    public final float T0(long j, long j2) {
        if (n0() >= Float.intBitsToFloat((int) (j2 >> 32)) && m0() >= Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
            return Float.POSITIVE_INFINITY;
        }
        long S0 = S0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (S0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (S0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - n0());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < 0.0f ? -r9 : r9 - m0())) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.rzx
    public final long U(rzx rzxVar, long j) {
        if (rzxVar instanceof ooz) {
            ooz oozVar = (ooz) rzxVar;
            oozVar.a().k1();
            return oozVar.U(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        s w1 = w1(rzxVar);
        w1.k1();
        s X0 = X0(w1);
        while (w1 != X0) {
            j390 j390Var = w1.h0;
            if (j390Var != null) {
                j = j390Var.mo81mapOffset8S9VItk(j, false);
            }
            j = wwg.D(j, w1.T);
            w1 = w1.K;
        }
        return R0(X0, j);
    }

    public final void U0(i28 i28Var, androidx.compose.ui.graphics.layer.a aVar) {
        j390 j390Var = this.h0;
        if (j390Var != null) {
            j390Var.drawLayer(i28Var, aVar);
            return;
        }
        long j = this.T;
        float f = (int) (j >> 32);
        float f2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        i28Var.c(f, f2);
        V0(i28Var, aVar);
        i28Var.c(-f, -f2);
    }

    public final void V0(i28 i28Var, androidx.compose.ui.graphics.layer.a aVar) {
        s sVar;
        i28 i28Var2;
        androidx.compose.ui.graphics.layer.a aVar2;
        e530 c1 = c1(4);
        if (c1 == null) {
            q1(i28Var, aVar);
            return;
        }
        LayoutNode layoutNode = this.I;
        layoutNode.getClass();
        c1y sharedDrawScope = d1y.a(layoutNode).getSharedDrawScope();
        long a0 = rzo.a0(this.c);
        sharedDrawScope.getClass();
        wz40 wz40Var = null;
        while (c1 != null) {
            if (c1 instanceof pam) {
                sVar = this;
                i28Var2 = i28Var;
                aVar2 = aVar;
                sharedDrawScope.b(i28Var2, a0, sVar, (pam) c1, aVar2);
            } else {
                sVar = this;
                i28Var2 = i28Var;
                aVar2 = aVar;
                if ((c1.getKindSet$ui() & 4) != 0 && (c1 instanceof lqh)) {
                    int i = 0;
                    for (e530 e530Var = ((lqh) c1).b; e530Var != null; e530Var = e530Var.getChild$ui()) {
                        if ((e530Var.getKindSet$ui() & 4) != 0) {
                            i++;
                            if (i == 1) {
                                c1 = e530Var;
                            } else {
                                if (wz40Var == null) {
                                    wz40Var = new wz40(new e530[16]);
                                }
                                if (c1 != null) {
                                    wz40Var.b(c1);
                                    c1 = null;
                                }
                                wz40Var.b(e530Var);
                            }
                        }
                    }
                    if (i == 1) {
                        i28Var = i28Var2;
                        this = sVar;
                        aVar = aVar2;
                    }
                }
            }
            c1 = qje.c(wz40Var);
            i28Var = i28Var2;
            this = sVar;
            aVar = aVar2;
        }
    }

    public abstract void W0();

    public final s X0(s sVar) {
        LayoutNode layoutNode = sVar.I;
        LayoutNode layoutNode2 = this.I;
        if (layoutNode == layoutNode2) {
            e530 b1 = sVar.b1();
            e530 b12 = b1();
            if (!b12.getNode().isAttached()) {
                ixv.b("visitLocalAncestors called on an unattached node");
            }
            for (e530 parent$ui = b12.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
                if ((parent$ui.getKindSet$ui() & 2) != 0 && parent$ui == b1) {
                    return sVar;
                }
            }
            return this;
        }
        while (layoutNode.I > layoutNode2.I) {
            layoutNode = layoutNode.s();
        }
        LayoutNode layoutNode3 = layoutNode2;
        while (layoutNode3.I > layoutNode.I) {
            layoutNode3 = layoutNode3.s();
        }
        while (layoutNode != layoutNode3) {
            layoutNode = layoutNode.s();
            layoutNode3 = layoutNode3.s();
            if (layoutNode == null || layoutNode3 == null) {
                ny61.g("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (layoutNode3 != layoutNode2) {
            if (layoutNode != sVar.I) {
                return (f) layoutNode.a0.d;
            }
            return sVar;
        }
        return this;
    }

    public final long Y0(long j) {
        long j2 = this.T;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        j390 j390Var = this.h0;
        return j390Var != null ? j390Var.mo81mapOffset8S9VItk(floatToRawIntBits, true) : floatToRawIntBits;
    }

    public abstract noz Z0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [e530] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [e530] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.ca10, defpackage.x910
    public final Object a() {
        LayoutNode layoutNode = this.I;
        if (!layoutNode.a0.e(64)) {
            return null;
        }
        b1();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (e530 e530Var = (v7x0) layoutNode.a0.f; e530Var != null; e530Var = e530Var.getParent$ui()) {
            if ((e530Var.getKindSet$ui() & 64) != 0) {
                lqh lqhVar = e530Var;
                ?? r5 = 0;
                while (lqhVar != 0) {
                    if (lqhVar instanceof ae90) {
                        ref$ObjectRef.element = ((ae90) lqhVar).X(layoutNode.R, ref$ObjectRef.element);
                    } else if ((lqhVar.getKindSet$ui() & 64) != 0 && (lqhVar instanceof lqh)) {
                        e530 e530Var2 = lqhVar.b;
                        int i = 0;
                        lqhVar = lqhVar;
                        r5 = r5;
                        while (e530Var2 != null) {
                            if ((e530Var2.getKindSet$ui() & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    lqhVar = e530Var2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new wz40(new e530[16]);
                                    }
                                    if (lqhVar != 0) {
                                        r5.b(lqhVar);
                                        lqhVar = 0;
                                    }
                                    r5.b(e530Var2);
                                }
                            }
                            e530Var2 = e530Var2.getChild$ui();
                            lqhVar = lqhVar;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    lqhVar = qje.c(r5);
                }
            }
        }
        return ref$ObjectRef.element;
    }

    public final long a1() {
        return this.O.R(this.I.T.h());
    }

    @Override // defpackage.rzx
    public final void b0(float[] fArr) {
        m390 a = d1y.a(this.I);
        s w1 = w1(gwk0.o(this));
        z1(w1, fArr);
        if (a instanceof o810) {
            ((o810) a).mo64localToScreen58bKbWc(fArr);
            return;
        }
        long mo43localToScreenMKHz9U = w1.mo43localToScreenMKHz9U(0L);
        if ((9223372034707292159L & mo43localToScreenMKHz9U) != 9205357640488583168L) {
            n810.g(fArr, Float.intBitsToFloat((int) (mo43localToScreenMKHz9U >> 32)), Float.intBitsToFloat((int) (mo43localToScreenMKHz9U & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        }
    }

    public abstract e530 b1();

    public final e530 c1(int i) {
        boolean h = ce60.h(i);
        e530 b1 = b1();
        if (!h && (b1 = b1.getParent$ui()) == null) {
            return null;
        }
        for (e530 d1 = d1(h); d1 != null && (d1.getAggregateChildKindSet$ui() & i) != 0; d1 = d1.getChild$ui()) {
            if ((d1.getKindSet$ui() & i) != 0) {
                return d1;
            }
            if (d1 == b1) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.rzx
    public final boolean d() {
        return b1().isAttached();
    }

    public final e530 d1(boolean z) {
        e530 b1;
        t300 t300Var = this.I.a0;
        if (((s) t300Var.e) == this) {
            return (e530) t300Var.g;
        }
        s sVar = this.K;
        if (!z) {
            if (sVar != null) {
                return sVar.b1();
            }
            return null;
        }
        if (sVar == null || (b1 = sVar.b1()) == null) {
            return null;
        }
        return b1.getChild$ui();
    }

    @Override // defpackage.rzx
    public final long e() {
        return this.c;
    }

    public final void e1(e530 e530Var, ae60 ae60Var, long j, cnu cnuVar, int i, boolean z) {
        long a;
        if (e530Var == null) {
            h1(ae60Var, j, cnuVar, i, z);
            return;
        }
        if (!ae60Var.h(e530Var)) {
            e1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i, z);
            return;
        }
        int i2 = cnuVar.c;
        xy40 xy40Var = cnuVar.a;
        cnuVar.b(i2 + 1, xy40Var.b);
        cnuVar.c++;
        xy40Var.g(e530Var);
        fy40 fy40Var = cnuVar.b;
        a = p1b1.a(-1.0f, z, false);
        fy40Var.a(a);
        e1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i, z);
        cnuVar.c = i2;
    }

    public final void f1(e530 e530Var, ae60 ae60Var, long j, cnu cnuVar, int i, boolean z, float f) {
        long a;
        if (e530Var == null) {
            h1(ae60Var, j, cnuVar, i, z);
            return;
        }
        if (!ae60Var.h(e530Var)) {
            f1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i, z, f);
            return;
        }
        int i2 = cnuVar.c;
        xy40 xy40Var = cnuVar.a;
        cnuVar.b(i2 + 1, xy40Var.b);
        cnuVar.c++;
        xy40Var.g(e530Var);
        fy40 fy40Var = cnuVar.b;
        a = p1b1.a(f, z, false);
        fy40Var.a(a);
        p1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i, z, f, true);
        cnuVar.c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (defpackage.ci91.a(r18.a(), r9) > 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1(ae60 ae60Var, long j, cnu cnuVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        long a;
        long a2;
        e530 c1 = c1(ae60Var.b());
        if (!C1(j)) {
            if (jwd0.a(i, 1)) {
                float T0 = T0(j, a1());
                if ((Float.floatToRawIntBits(T0) & Integer.MAX_VALUE) < 2139095040) {
                    if (cnuVar.c != scc.f(cnuVar)) {
                        a2 = p1b1.a(T0, false, false);
                        if (ci91.a(cnuVar.a(), a2) <= 0) {
                            return;
                        }
                    }
                    f1(c1, ae60Var, j, cnuVar, i, false, T0);
                    return;
                }
                return;
            }
            return;
        }
        if (c1 == null) {
            h1(ae60Var, j, cnuVar, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < n0() && intBitsToFloat2 < m0()) {
            e1(c1, ae60Var, j, cnuVar, i, z);
            return;
        }
        float T02 = !jwd0.a(i, 1) ? Float.POSITIVE_INFINITY : T0(j, a1());
        if ((Float.floatToRawIntBits(T02) & Integer.MAX_VALUE) < 2139095040) {
            if (cnuVar.c == scc.f(cnuVar)) {
                z2 = z;
            } else {
                z2 = z;
                a = p1b1.a(T02, z2, false);
            }
            z3 = true;
            p1(c1, ae60Var, j, cnuVar, i, z2, T02, z3);
        }
        z2 = z;
        z3 = false;
        p1(c1, ae60Var, j, cnuVar, i, z2, T02, z3);
    }

    @Override // defpackage.fwi
    public final float getDensity() {
        return this.I.R.getDensity();
    }

    @Override // defpackage.yuw
    public final LayoutDirection getLayoutDirection() {
        return this.I.S;
    }

    public void h1(ae60 ae60Var, long j, cnu cnuVar, int i, boolean z) {
        s sVar = this.J;
        if (sVar != null) {
            sVar.g1(ae60Var, sVar.Y0(j), cnuVar, i, z);
        }
    }

    public final void i1() {
        j390 j390Var = this.h0;
        if (j390Var != null) {
            j390Var.invalidate();
            return;
        }
        s sVar = this.K;
        if (sVar != null) {
            sVar.i1();
        }
    }

    @Override // defpackage.n390
    public final boolean isValidOwnerScope() {
        return (this.h0 == null || this.L || !this.I.F()) ? false : true;
    }

    @Override // defpackage.rzx
    public final zii0 j(rzx rzxVar, boolean z) {
        if (!d()) {
            ixv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!rzxVar.d()) {
            ixv.b("LayoutCoordinates " + rzxVar + " is not attached!");
        }
        s w1 = w1(rzxVar);
        w1.k1();
        s X0 = X0(w1);
        gz40 gz40Var = this.V;
        if (gz40Var == null) {
            gz40Var = new gz40();
            this.V = gz40Var;
        }
        gz40Var.a = 0.0f;
        gz40Var.b = 0.0f;
        gz40Var.c = (int) (rzxVar.e() >> 32);
        gz40Var.d = (int) (rzxVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        while (w1 != X0) {
            w1.s1(gz40Var, z, false);
            if (gz40Var.b()) {
                return zii0.e;
            }
            w1 = w1.K;
        }
        Q0(X0, gz40Var, z);
        return gwk0.G(gz40Var);
    }

    public final boolean j1() {
        if (this.h0 != null && this.Q <= 0.0f) {
            return true;
        }
        s sVar = this.K;
        if (sVar != null) {
            return sVar.j1();
        }
        return false;
    }

    public final void k1() {
        this.I.b0.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v7, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void l1() {
        e530 parent$ui;
        boolean h = ce60.h(128);
        e530 d1 = d1(h);
        if (d1 == null || (d1.getNode().getAggregateChildKindSet$ui() & 128) == 0) {
            return;
        }
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            if (h) {
                parent$ui = b1();
            } else {
                parent$ui = b1().getParent$ui();
                if (parent$ui == null) {
                }
            }
            for (e530 d12 = d1(h); d12 != null; d12 = d12.getChild$ui()) {
                if ((d12.getAggregateChildKindSet$ui() & 128) == 0) {
                    break;
                }
                if ((d12.getKindSet$ui() & 128) != 0) {
                    lqh lqhVar = d12;
                    ?? r8 = 0;
                    while (lqhVar != 0) {
                        if (lqhVar instanceof ga10) {
                            ((ga10) lqhVar).a(this.c);
                        } else if ((lqhVar.getKindSet$ui() & 128) != 0 && (lqhVar instanceof lqh)) {
                            e530 e530Var = lqhVar.b;
                            int i = 0;
                            lqhVar = lqhVar;
                            r8 = r8;
                            while (e530Var != null) {
                                if ((e530Var.getKindSet$ui() & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
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
                            if (i == 1) {
                            }
                        }
                        lqhVar = qje.c(r8);
                    }
                }
                if (d12 == parent$ui) {
                    break;
                }
            }
        } finally {
            tje.W(D, O, e);
        }
    }

    @Override // defpackage.rzx
    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    public final long mo43localToScreenMKHz9U(long j) {
        if (!d()) {
            ixv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return d1y.a(this.I).mo65localToScreenMKHz9U(v(j));
    }

    @Override // defpackage.rzx
    public final long m(long j) {
        return d1y.a(this.I).mo61calculatePositionInWindowMKHz9U(v(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [e530] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void m1() {
        boolean h = ce60.h(SelfTester_JCP.ENCRYPT_CBC);
        e530 b1 = b1();
        if (!h && (b1 = b1.getParent$ui()) == null) {
            return;
        }
        for (e530 d1 = d1(h); d1 != null && (d1.getAggregateChildKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0; d1 = d1.getChild$ui()) {
            if ((d1.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                lqh lqhVar = d1;
                ?? r5 = 0;
                while (lqhVar != 0) {
                    if (lqhVar instanceof izx) {
                        ((izx) lqhVar).A(this);
                    } else if ((lqhVar.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0 && (lqhVar instanceof lqh)) {
                        e530 e530Var = lqhVar.b;
                        int i = 0;
                        lqhVar = lqhVar;
                        r5 = r5;
                        while (e530Var != null) {
                            if ((e530Var.getKindSet$ui() & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    lqhVar = e530Var;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new wz40(new e530[16]);
                                    }
                                    if (lqhVar != 0) {
                                        r5.b(lqhVar);
                                        lqhVar = 0;
                                    }
                                    r5.b(e530Var);
                                }
                            }
                            e530Var = e530Var.getChild$ui();
                            lqhVar = lqhVar;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    lqhVar = qje.c(r5);
                }
            }
            if (d1 == b1) {
                return;
            }
        }
    }

    public final void n1() {
        this.L = true;
        ((NodeCoordinator$invalidateParentLayer$1) this.f0).invoke();
        t1();
        if (z5w.a(this.T, 0L)) {
            return;
        }
        this.I.L(this);
    }

    public final void o1() {
        boolean h = ce60.h(1048576);
        e530 d1 = d1(h);
        if (d1 == null || (d1.getNode().getAggregateChildKindSet$ui() & 1048576) == 0) {
            return;
        }
        e530 b1 = b1();
        if (!h && (b1 = b1.getParent$ui()) == null) {
            return;
        }
        for (e530 d12 = d1(h); d12 != null && (d12.getAggregateChildKindSet$ui() & 1048576) != 0; d12 = d12.getChild$ui()) {
            if ((d12.getKindSet$ui() & 1048576) != 0) {
                e530 e530Var = d12;
                wz40 wz40Var = null;
                while (e530Var != null) {
                    if ((e530Var.getKindSet$ui() & 1048576) != 0 && (e530Var instanceof lqh)) {
                        int i = 0;
                        for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                            if ((e530Var2.getKindSet$ui() & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    e530Var = e530Var2;
                                } else {
                                    if (wz40Var == null) {
                                        wz40Var = new wz40(new e530[16]);
                                    }
                                    if (e530Var != null) {
                                        wz40Var.b(e530Var);
                                        e530Var = null;
                                    }
                                    wz40Var.b(e530Var2);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    e530Var = qje.c(wz40Var);
                }
            }
            if (d12 == b1) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r2v18 */
    public final void p1(final e530 e530Var, final ae60 ae60Var, final long j, final cnu cnuVar, int i, final boolean z, final float f, final boolean z2) {
        long a;
        long a2;
        long a3;
        e530 c;
        if (e530Var == null) {
            h1(ae60Var, j, cnuVar, i, z);
            return;
        }
        if (!ae60Var.h(e530Var)) {
            p1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (jwd0.a(i2, 3) || jwd0.a(i2, 4)) {
            lqh lqhVar = e530Var;
            wz40 wz40Var = null;
            while (true) {
                if (lqhVar == 0) {
                    break;
                }
                if (lqhVar instanceof gwd0) {
                    long B = ((gwd0) lqhVar).B();
                    int i3 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i3);
                    LayoutNode layoutNode = this.I;
                    if (intBitsToFloat >= (-wyz0.a(B, layoutNode.S))) {
                        if (Float.intBitsToFloat(i3) < wyz0.b(B, layoutNode.S) + n0()) {
                            int i4 = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j);
                            if (Float.intBitsToFloat(i4) >= (-wyz0.d(B))) {
                                if (Float.intBitsToFloat(i4) < wyz0.c(B) + m0()) {
                                    final int i5 = i2;
                                    sls slsVar = new sls() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // defpackage.sls
                                        public final Object invoke() {
                                            s.this.p1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i5, z, f, z2);
                                            return zy11.a;
                                        }
                                    };
                                    fy40 fy40Var = cnuVar.b;
                                    xy40 xy40Var = cnuVar.a;
                                    if (cnuVar.c == scc.f(cnuVar)) {
                                        int i6 = cnuVar.c;
                                        cnuVar.b(i6 + 1, xy40Var.b);
                                        cnuVar.c++;
                                        xy40Var.g(e530Var);
                                        a3 = p1b1.a(0.0f, z, true);
                                        fy40Var.a(a3);
                                        slsVar.invoke();
                                        cnuVar.c = i6;
                                        return;
                                    }
                                    long a4 = cnuVar.a();
                                    int i7 = cnuVar.c;
                                    if (!ci91.d(a4)) {
                                        if (ci91.b(a4) > 0.0f) {
                                            int i8 = cnuVar.c;
                                            cnuVar.b(i8 + 1, xy40Var.b);
                                            cnuVar.c++;
                                            xy40Var.g(e530Var);
                                            a = p1b1.a(0.0f, z, true);
                                            fy40Var.a(a);
                                            slsVar.invoke();
                                            cnuVar.c = i8;
                                            return;
                                        }
                                        return;
                                    }
                                    int f2 = scc.f(cnuVar);
                                    cnuVar.c = f2;
                                    cnuVar.b(f2 + 1, xy40Var.b);
                                    cnuVar.c++;
                                    xy40Var.g(e530Var);
                                    a2 = p1b1.a(0.0f, z, true);
                                    fy40Var.a(a2);
                                    slsVar.invoke();
                                    cnuVar.c = f2;
                                    if (ci91.b(cnuVar.a()) < 0.0f) {
                                        cnuVar.b(i7 + 1, cnuVar.c + 1);
                                    }
                                    cnuVar.c = i7;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((lqhVar.getKindSet$ui() & 16) != 0 && (lqhVar instanceof lqh)) {
                        e530 e530Var2 = lqhVar.b;
                        int i9 = 0;
                        c = lqhVar;
                        wz40Var = wz40Var;
                        while (e530Var2 != null) {
                            if ((e530Var2.getKindSet$ui() & 16) != 0) {
                                i9++;
                                wz40Var = wz40Var;
                                if (i9 == 1) {
                                    c = e530Var2;
                                } else {
                                    if (wz40Var == null) {
                                        wz40Var = new wz40(new e530[16]);
                                    }
                                    if (c != null) {
                                        wz40Var.b(c);
                                        c = null;
                                    }
                                    wz40Var.b(e530Var2);
                                }
                            }
                            e530Var2 = e530Var2.getChild$ui();
                            c = c;
                            wz40Var = wz40Var;
                        }
                        if (i9 == 1) {
                            i2 = i;
                            lqhVar = c;
                            wz40Var = wz40Var;
                        }
                    }
                    c = qje.c(wz40Var);
                    i2 = i;
                    lqhVar = c;
                    wz40Var = wz40Var;
                }
            }
        }
        if (z2) {
            f1(e530Var, ae60Var, j, cnuVar, i, z, f);
        } else {
            v1(e530Var, ae60Var, j, cnuVar, i, z, f);
        }
    }

    @Override // defpackage.rzx
    public final rzx q() {
        boolean d = d();
        LayoutNode layoutNode = this.I;
        if (!d) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode layoutNode2 = layoutNode; layoutNode2 != null; layoutNode2 = layoutNode2.s()) {
                sb.append("\n|");
                sb.append(layoutNode2);
                sb.append(" isAttached=");
                sb.append(layoutNode2.F());
                sb.append(" modifier=");
                sb.append(layoutNode2.f0);
                sb.append(" tail=");
                sb.append(b1());
            }
            ixv.b(sb.toString());
        }
        k1();
        return ((s) layoutNode.a0.e).K;
    }

    public abstract void q1(i28 i28Var, androidx.compose.ui.graphics.layer.a aVar);

    public final void r1(long j, float f, tls tlsVar, androidx.compose.ui.graphics.layer.a aVar) {
        LayoutNode layoutNode = this.I;
        if (aVar != null) {
            if (tlsVar != null) {
                ixv.a("both ways to create layers shouldn't be used together");
            }
            if (this.i0 != aVar) {
                this.i0 = null;
                A1(null, false);
                this.i0 = aVar;
            }
            if (this.h0 == null) {
                m390 a = d1y.a(layoutNode);
                wls wlsVar = this.e0;
                if (wlsVar == null) {
                    NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = new NodeCoordinator$drawBlock$1(new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this), this);
                    this.e0 = nodeCoordinator$drawBlock$1;
                    wlsVar = nodeCoordinator$drawBlock$1;
                }
                sls slsVar = this.f0;
                j390 createLayer = a.createLayer(wlsVar, slsVar, aVar);
                createLayer.mo83resizeozmzZPI(this.c);
                createLayer.mo82movegyyYBs(j);
                this.h0 = createLayer;
                layoutNode.e0 = true;
                ((NodeCoordinator$invalidateParentLayer$1) slsVar).invoke();
            }
        } else {
            if (this.i0 != null) {
                this.i0 = null;
                A1(null, false);
            }
            A1(tlsVar, false);
        }
        if (!z5w.a(this.T, j)) {
            d1y.a(layoutNode).voteFrameRate(-4.0f);
            this.T = j;
            j390 j390Var = this.h0;
            if (j390Var != null) {
                j390Var.mo82movegyyYBs(j);
            } else {
                s sVar = this.K;
                if (sVar != null) {
                    sVar.i1();
                }
            }
            layoutNode.L(this);
            LookaheadCapablePlaceable.N0(this);
            m390 m390Var = layoutNode.G;
            if (m390Var != null) {
                m390Var.onLayoutChange(layoutNode);
            }
        }
        this.U = f;
        if (this == ((s) layoutNode.a0.e)) {
            d1y.a(layoutNode).getRectManager().e(layoutNode);
        }
        if (this.D) {
            return;
        }
        F0(J0());
    }

    public final void s1(gz40 gz40Var, boolean z, boolean z2) {
        long j;
        j390 j390Var = this.h0;
        if (j390Var != null) {
            if (this.M) {
                if (z2) {
                    long a1 = a1();
                    float f = gz40Var.a;
                    float f2 = gz40Var.b;
                    if (gz40Var.c >= 0.0f) {
                        long j2 = this.c;
                        if (f <= ((int) (j2 >> 32)) && gz40Var.d >= 0.0f && f2 <= ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (a1 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (a1 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            float f3 = (intBitsToFloat - (gz40Var.c - gz40Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (gz40Var.d - gz40Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            long j3 = this.c;
                            int i = (int) (j3 >> 32);
                            int i2 = (int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            float f7 = i;
                            int i3 = (int) (a1 >> 32);
                            float min = Math.min(Float.intBitsToFloat(i3) + f7, Math.max(f7, Float.intBitsToFloat(i3) + intBitsToFloat3));
                            float f8 = i2;
                            int i4 = (int) (a1 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            gz40Var.a(intBitsToFloat3, intBitsToFloat4, min, Math.min(Float.intBitsToFloat(i4) + f8, Math.max(f8, Float.intBitsToFloat(i4) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    long j32 = this.c;
                    int i5 = (int) (j32 >> 32);
                    int i22 = (int) (j32 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    float f72 = i5;
                    int i32 = (int) (a1 >> 32);
                    float min2 = Math.min(Float.intBitsToFloat(i32) + f72, Math.max(f72, Float.intBitsToFloat(i32) + intBitsToFloat32));
                    float f82 = i22;
                    int i42 = (int) (a1 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    gz40Var.a(intBitsToFloat32, intBitsToFloat42, min2, Math.min(Float.intBitsToFloat(i42) + f82, Math.max(f82, Float.intBitsToFloat(i42) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.c;
                    gz40Var.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                }
                if (gz40Var.b()) {
                    return;
                }
            }
            j390Var.mapBounds(gz40Var, false);
        }
        long j5 = this.T;
        float f9 = (int) (j5 >> 32);
        gz40Var.a += f9;
        gz40Var.c += f9;
        float f10 = (int) (j5 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        gz40Var.b += f10;
        gz40Var.d += f10;
    }

    @Override // defpackage.rzx
    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    public final long mo44screenToLocalMKHz9U(long j) {
        if (!d()) {
            ixv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return U(gwk0.o(this), d1y.a(this.I).mo69screenToLocalMKHz9U(j));
    }

    public final void t1() {
        if (this.h0 != null) {
            if (this.i0 != null) {
                this.i0 = null;
            }
            A1(null, false);
            this.I.S(false);
        }
    }

    @Override // defpackage.fwi
    public final float u0() {
        return this.I.R.u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [e530] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [e530] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [wz40] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [wz40] */
    public final void u1(aa10 aa10Var) {
        s sVar;
        aa10 aa10Var2 = this.R;
        if (aa10Var != aa10Var2) {
            this.R = aa10Var;
            LayoutNode layoutNode = this.I;
            if (aa10Var2 == null || aa10Var.getWidth() != aa10Var2.getWidth() || aa10Var.getHeight() != aa10Var2.getHeight()) {
                int width = aa10Var.getWidth();
                int height = aa10Var.getHeight();
                j390 j390Var = this.h0;
                if (j390Var != null) {
                    j390Var.mo83resizeozmzZPI((width << 32) | (height & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                } else if (layoutNode.G() && (sVar = this.K) != null) {
                    sVar.i1();
                }
                y0((height & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (width << 32));
                if (this.N != null) {
                    B1(false);
                }
                boolean h = ce60.h(4);
                e530 b1 = b1();
                if (h || (b1 = b1.getParent$ui()) != null) {
                    for (e530 d1 = d1(h); d1 != null && (d1.getAggregateChildKindSet$ui() & 4) != 0; d1 = d1.getChild$ui()) {
                        if ((d1.getKindSet$ui() & 4) != 0) {
                            lqh lqhVar = d1;
                            ?? r7 = 0;
                            while (lqhVar != 0) {
                                if (lqhVar instanceof pam) {
                                    ((pam) lqhVar).G();
                                } else if ((lqhVar.getKindSet$ui() & 4) != 0 && (lqhVar instanceof lqh)) {
                                    e530 e530Var = lqhVar.b;
                                    int i = 0;
                                    lqhVar = lqhVar;
                                    r7 = r7;
                                    while (e530Var != null) {
                                        if ((e530Var.getKindSet$ui() & 4) != 0) {
                                            i++;
                                            r7 = r7;
                                            if (i == 1) {
                                                lqhVar = e530Var;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new wz40(new e530[16]);
                                                }
                                                if (lqhVar != 0) {
                                                    r7.b(lqhVar);
                                                    lqhVar = 0;
                                                }
                                                r7.b(e530Var);
                                            }
                                        }
                                        e530Var = e530Var.getChild$ui();
                                        lqhVar = lqhVar;
                                        r7 = r7;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lqhVar = qje.c(r7);
                            }
                        }
                        if (d1 == b1) {
                            break;
                        }
                    }
                }
                m390 m390Var = layoutNode.G;
                if (m390Var != null) {
                    m390Var.onLayoutChange(layoutNode);
                }
                layoutNode.L(this);
            }
            qy40 qy40Var = this.S;
            if (((qy40Var == null || qy40Var.e == 0) && aa10Var.b().isEmpty()) || gtb1.d(this.S, aa10Var.b())) {
                return;
            }
            layoutNode.b0.p.R.g();
            qy40 qy40Var2 = this.S;
            if (qy40Var2 == null) {
                qy40Var2 = kp60.a();
                this.S = qy40Var2;
            }
            qy40Var2.a();
            for (Map.Entry entry : aa10Var.b().entrySet()) {
                qy40Var2.g(entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
    }

    @Override // defpackage.rzx
    public final long v(long j) {
        if (!d()) {
            ixv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        k1();
        while (this != null) {
            LayoutNode layoutNode = this.I;
            if (this == ((s) layoutNode.a0.e) && !layoutNode.c) {
                long b = d1y.a(layoutNode).getRectManager().b(layoutNode);
                if (!z5w.a(b, 9223372034707292159L)) {
                    return wwg.D(j, b);
                }
            }
            j390 j390Var = this.h0;
            if (j390Var != null) {
                j = j390Var.mo81mapOffset8S9VItk(j, false);
            }
            j = wwg.D(j, this.T);
            this = this.K;
        }
        return j;
    }

    public final void v1(final e530 e530Var, final ae60 ae60Var, final long j, final cnu cnuVar, final int i, final boolean z, final float f) {
        long a;
        long a2;
        int i2;
        if (e530Var == null) {
            h1(ae60Var, j, cnuVar, i, z);
            return;
        }
        if (!ae60Var.h(e530Var)) {
            v1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i, z, f);
            return;
        }
        if (!ae60Var.a(e530Var)) {
            p1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i, z, f, false);
            return;
        }
        sls slsVar = new sls() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                s.this.p1(gtb1.e(e530Var, ae60Var.b()), ae60Var, j, cnuVar, i, z, f, false);
                return zy11.a;
            }
        };
        fy40 fy40Var = cnuVar.b;
        xy40 xy40Var = cnuVar.a;
        if (cnuVar.c != scc.f(cnuVar)) {
            long a3 = cnuVar.a();
            int i3 = cnuVar.c;
            int f2 = scc.f(cnuVar);
            cnuVar.c = f2;
            cnuVar.b(f2 + 1, xy40Var.b);
            cnuVar.c++;
            xy40Var.g(e530Var);
            a = p1b1.a(f, z, false);
            fy40Var.a(a);
            slsVar.invoke();
            cnuVar.c = f2;
            long a4 = cnuVar.a();
            if (cnuVar.c + 1 >= scc.f(cnuVar) || ci91.a(a3, a4) <= 0) {
                cnuVar.b(cnuVar.c + 1, xy40Var.b);
            } else {
                int i4 = i3 + 1;
                boolean d = ci91.d(a4);
                int i5 = cnuVar.c;
                cnuVar.b(i4, d ? i5 + 2 : i5 + 1);
            }
            cnuVar.c = i3;
            return;
        }
        int i6 = cnuVar.c;
        int i7 = i6 + 1;
        cnuVar.b(i7, xy40Var.b);
        cnuVar.c++;
        xy40Var.g(e530Var);
        a2 = p1b1.a(f, z, false);
        fy40Var.a(a2);
        slsVar.invoke();
        cnuVar.c = i6;
        if (i7 == scc.f(cnuVar) || ci91.d(cnuVar.a())) {
            int i8 = cnuVar.c;
            int i9 = i8 + 1;
            xy40Var.m(i9);
            if (i9 < 0 || i9 >= (i2 = fy40Var.b)) {
                xva1.d("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = fy40Var.a;
            long j2 = jArr[i9];
            if (i9 != i2 - 1) {
                f73.f(jArr, jArr, i9, i8 + 2, i2);
            }
            fy40Var.b--;
        }
    }

    @Override // androidx.compose.ui.layout.o
    public abstract void x0(long j, float f, androidx.compose.ui.graphics.layer.a aVar);

    public final zii0 x1() {
        if (d()) {
            rzx o = gwk0.o(this);
            gz40 gz40Var = this.V;
            if (gz40Var == null) {
                gz40Var = new gz40();
                this.V = gz40Var;
            }
            long S0 = S0(a1());
            int i = (int) (S0 >> 32);
            gz40Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (S0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            gz40Var.b = -Float.intBitsToFloat(i2);
            gz40Var.c = Float.intBitsToFloat(i) + n0();
            gz40Var.d = Float.intBitsToFloat(i2) + m0();
            while (this != o) {
                this.s1(gz40Var, false, true);
                if (!gz40Var.b()) {
                    this = this.K;
                }
            }
            return gwk0.G(gz40Var);
        }
        return zii0.e;
    }

    public final void y1(s sVar, float[] fArr) {
        if (jl40.l(sVar, this)) {
            return;
        }
        this.K.y1(sVar, fArr);
        if (!z5w.a(this.T, 0L)) {
            float[] fArr2 = n0;
            n810.d(fArr2);
            long j = this.T;
            n810.g(fArr2, -((int) (j >> 32)), -((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            n810.f(fArr, fArr2);
        }
        j390 j390Var = this.h0;
        if (j390Var != null) {
            j390Var.mo79inverseTransform58bKbWc(fArr);
        }
    }

    public final void z1(s sVar, float[] fArr) {
        while (!this.equals(sVar)) {
            j390 j390Var = this.h0;
            if (j390Var != null) {
                j390Var.mo84transform58bKbWc(fArr);
            }
            if (!z5w.a(this.T, 0L)) {
                float[] fArr2 = n0;
                n810.d(fArr2);
                n810.g(fArr2, (int) (r0 >> 32), (int) (r0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                n810.f(fArr, fArr2);
            }
            this = this.K;
        }
    }
}
