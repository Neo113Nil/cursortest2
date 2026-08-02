package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.u;
import androidx.compose.ui.platform.j;
import defpackage.dr60;
import defpackage.e530;
import defpackage.f5y;
import defpackage.fud;
import defpackage.i0w;
import defpackage.i530;
import defpackage.ixv;
import defpackage.izx;
import defpackage.j0w;
import defpackage.jl40;
import defpackage.k0w;
import defpackage.ko5;
import defpackage.lo5;
import defpackage.lqh;
import defpackage.lvr;
import defpackage.npb1;
import defpackage.nvr;
import defpackage.ny61;
import defpackage.qje;
import defpackage.rur;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.sls;
import defpackage.t300;
import defpackage.tls;
import defpackage.uur;
import defpackage.v7x0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wz40;
import defpackage.xw91;
import defpackage.ytr;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class d extends e530 implements fud, izx, lvr, dr60, i530 {
    public final boolean a;
    public final wls b;
    public boolean c;
    public boolean w;
    public final int x;

    public d(int i, int i2, wls wlsVar) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        wlsVar = (i2 & 4) != 0 ? null : wlsVar;
        this.a = z;
        this.b = wlsVar;
        this.x = i;
    }

    @Override // defpackage.izx
    public final void A(rzx rzxVar) {
    }

    public final boolean E0(int i) {
        int i2 = nvr.a[e.v(this, i).ordinal()];
        if (i2 == 1) {
            return e.w(this);
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        w511.b();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [e530] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [e530] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public final void F0(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        t300 t300Var;
        wls wlsVar;
        c cVar = (c) qje.Q(this).getFocusOwner();
        d i = cVar.i();
        if (!jl40.l(focusStateImpl, focusStateImpl2) && (wlsVar = this.b) != null) {
            wlsVar.invoke(focusStateImpl, focusStateImpl2);
        }
        e530 node = getNode();
        if (!getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 node2 = getNode();
        LayoutNode P = qje.P(this);
        while (P != null) {
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui() & 4096) != 0) {
                            lqh lqhVar = node2;
                            ?? r5 = 0;
                            while (lqhVar != 0) {
                                if (lqhVar instanceof ytr) {
                                    ytr ytrVar = (ytr) lqhVar;
                                    if (i == cVar.i()) {
                                        ytrVar.x0(focusStateImpl2);
                                    }
                                } else if ((lqhVar.getKindSet$ui() & 4096) != 0 && (lqhVar instanceof lqh)) {
                                    e530 e530Var = lqhVar.b;
                                    int i2 = 0;
                                    lqhVar = lqhVar;
                                    r5 = r5;
                                    while (e530Var != null) {
                                        if ((e530Var.getKindSet$ui() & 4096) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                lqhVar = qje.c(r5);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            P = P.s();
            node2 = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [e530] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [e530] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final FocusPropertiesImpl G0() {
        boolean z;
        t300 t300Var;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int i = this.x;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((i0w) ((k0w) ((j0w) npb1.c(this, j.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                ny61.r("Unknown Focusability");
                return null;
            }
            z = false;
        }
        focusPropertiesImpl.b(z);
        e530 node = getNode();
        if (!getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 node2 = getNode();
        LayoutNode P = qje.P(this);
        loop0: while (P != null) {
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & 1024) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & 2048) != 0) {
                            ?? r7 = 0;
                            lqh lqhVar = node2;
                            while (lqhVar != 0) {
                                if (lqhVar instanceof uur) {
                                    ((uur) lqhVar).applyFocusProperties(focusPropertiesImpl);
                                } else if ((lqhVar.getKindSet$ui() & 2048) != 0 && (lqhVar instanceof lqh)) {
                                    e530 e530Var = lqhVar.b;
                                    int i2 = 0;
                                    lqhVar = lqhVar;
                                    r7 = r7;
                                    while (e530Var != null) {
                                        if ((e530Var.getKindSet$ui() & 2048) != 0) {
                                            i2++;
                                            r7 = r7;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                lqhVar = qje.c(r7);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            P = P.s();
            node2 = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
        return focusPropertiesImpl;
    }

    public final zii0 H0(rzx rzxVar) {
        zii0 h = G0().h();
        return h != xw91.y ? rzxVar == null ? h : h.j(rzxVar.U(qje.O(this), 0L)) : rzxVar != null ? rzxVar.j(qje.O(this), false) : wwg.b(0L, rzo.a0(qje.O(this).c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [e530] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    public final ko5 I0() {
        t300 t300Var;
        Object obj;
        if (!getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 parent$ui = getNode().getParent$ui();
        LayoutNode P = qje.P(this);
        while (true) {
            if (P == null) {
                break;
            }
            lqh lqhVar = parent$ui;
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 8388640) != 0) {
                while (lqhVar != 0) {
                    if ((lqhVar.getKindSet$ui() & 8388640) != 0) {
                        if ((8388608 & lqhVar.getKindSet$ui()) != 0) {
                            if (!(lqhVar instanceof lo5)) {
                                if (lqhVar instanceof lqh) {
                                    e530 e530Var = lqhVar.b;
                                    lqhVar = 0;
                                    while (e530Var != null) {
                                        if (e530Var instanceof lo5) {
                                            lqhVar = e530Var;
                                        }
                                        e530Var = e530Var.getChild$ui();
                                        lqhVar = lqhVar;
                                    }
                                } else {
                                    lqhVar = 0;
                                }
                            }
                            lo5 lo5Var = (lo5) lqhVar;
                            if (lo5Var != null) {
                                return (f5y) lo5Var;
                            }
                        } else if ((lqhVar.getKindSet$ui() & 32) == 0) {
                            continue;
                        } else {
                            if (lqhVar instanceof i530) {
                                obj = lqhVar;
                            } else if (lqhVar instanceof lqh) {
                                obj = null;
                                for (e530 e530Var2 = lqhVar.b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if (e530Var2 instanceof i530) {
                                        obj = e530Var2;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            i530 i530Var = (i530) obj;
                            if (i530Var != null && i530Var.q().g()) {
                                i530Var.q().h();
                                throw null;
                            }
                        }
                    }
                    lqhVar = lqhVar.getParent$ui();
                }
            }
            P = P.s();
            parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
        return null;
    }

    public final FocusStateImpl J0() {
        d i;
        t300 t300Var;
        if (isAttached() && (i = ((c) qje.Q(this).getFocusOwner()).i()) != null) {
            if (this == i) {
                return FocusStateImpl.Active;
            }
            if (i.isAttached()) {
                if (!i.getNode().isAttached()) {
                    ixv.b("visitAncestors called on an unattached node");
                }
                e530 parent$ui = i.getNode().getParent$ui();
                LayoutNode P = qje.P(i);
                while (P != null) {
                    if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 1024) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                                e530 e530Var = parent$ui;
                                wz40 wz40Var = null;
                                while (e530Var != null) {
                                    if (e530Var instanceof d) {
                                        if (this == ((d) e530Var)) {
                                            return FocusStateImpl.ActiveParent;
                                        }
                                    } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                        int i2 = 0;
                                        for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                            if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
                                        }
                                    }
                                    e530Var = qje.c(wz40Var);
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    P = P.s();
                    parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
                }
            }
            return FocusStateImpl.Inactive;
        }
        return FocusStateImpl.Inactive;
    }

    public final void K0() {
        int i = nvr.b[J0().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                return;
            }
            w511.b();
            return;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        u.e(this, new sls() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.ui.focus.FocusPropertiesImpl] */
            @Override // defpackage.sls
            public final Object invoke() {
                Ref$ObjectRef.this.element = this.G0();
                return zy11.a;
            }
        });
        T t = ref$ObjectRef.element;
        if ((t == 0 ? null : (rur) t).g()) {
            return;
        }
        ((c) qje.Q(this).getFocusOwner()).d(8, true, true);
    }

    public final boolean L0(final int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return G0().g() ? E0(i) : e.i(this, i, new tls() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((d) obj).E0(i));
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.dr60
    public final void e0() {
        K0();
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onDetach() {
        int i = nvr.b[J0().ordinal()];
        if (i == 1 || i == 2) {
            c cVar = (c) qje.Q(this).getFocusOwner();
            cVar.d(8, true, false);
            if (this.a) {
                cVar.a.mo68requestOwnerFocus7o62pno(null, null);
            }
            cVar.d.a();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            w511.b();
            return;
        }
        b focusOwner = qje.Q(this).getFocusOwner();
        d g = e.g(this);
        if (g == null || !g.a) {
            return;
        }
        c cVar2 = (c) focusOwner;
        cVar2.a.mo68requestOwnerFocus7o62pno(null, null);
        cVar2.d.a();
    }

    @Override // defpackage.e530
    public final void onReset() {
        if (J0().b()) {
            ((c) qje.Q(this).getFocusOwner()).d(8, true, true);
        }
    }
}
