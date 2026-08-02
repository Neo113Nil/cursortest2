package androidx.compose.ui.focus;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.avr;
import defpackage.c9y;
import defpackage.cur;
import defpackage.e530;
import defpackage.fcb1;
import defpackage.hy40;
import defpackage.isv;
import defpackage.ixv;
import defpackage.jl40;
import defpackage.k8w;
import defpackage.lix;
import defpackage.lqa1;
import defpackage.lqh;
import defpackage.ny61;
import defpackage.our;
import defpackage.pur;
import defpackage.qje;
import defpackage.qqa1;
import defpackage.sls;
import defpackage.t300;
import defpackage.t5t0;
import defpackage.tls;
import defpackage.v7x0;
import defpackage.w511;
import defpackage.wz40;
import defpackage.xy40;
import defpackage.yur;
import defpackage.zii0;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class c implements b {
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final a d;
    public hy40 f;
    public d h;
    public final d c = new d(2, 14, null);
    public final pur e = new pur(this);
    public final xy40 g = new xy40(1);

    public c(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new a(this, androidComposeView2);
    }

    public final boolean c(boolean z) {
        t300 t300Var;
        if (i() != null) {
            d i = i();
            l(null);
            if (i != null) {
                i.F0(FocusStateImpl.Active, FocusStateImpl.Inactive);
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
                                        ((d) e530Var).F0(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
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
        }
        return true;
    }

    public final boolean d(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            c(z);
        } else {
            int i2 = our.a[e.t(this.c, i).ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                z3 = false;
            } else {
                if (i2 != 4) {
                    w511.b();
                    return false;
                }
                c(z);
            }
        }
        if (z3 && z2) {
            this.a.clearOwnerFocus();
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    public final void e() {
        isv isvVar;
        t300 t300Var;
        boolean z;
        lqh lqhVar;
        t300 t300Var2;
        d i = i();
        if (i != null) {
            if (!i.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 node = i.getNode();
            LayoutNode P = qje.P(i);
            loop0: while (true) {
                if (P == null) {
                    lqhVar = 0;
                    break;
                }
                if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 2097152) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 2097152) != 0) {
                            ?? r8 = 0;
                            lqhVar = node;
                            while (lqhVar != 0) {
                                if (lqhVar instanceof isv) {
                                    break loop0;
                                }
                                if ((lqhVar.getKindSet$ui() & 2097152) != 0 && (lqhVar instanceof lqh)) {
                                    e530 e530Var = lqhVar.b;
                                    int i2 = 0;
                                    lqhVar = lqhVar;
                                    r8 = r8;
                                    while (e530Var != null) {
                                        if ((e530Var.getKindSet$ui() & 2097152) != 0) {
                                            i2++;
                                            r8 = r8;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                lqhVar = qje.c(r8);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                P = P.s();
                node = (P == null || (t300Var2 = P.a0) == null) ? null : (v7x0) t300Var2.f;
            }
            isvVar = (isv) lqhVar;
        } else {
            isvVar = null;
        }
        if (isvVar != null) {
            if (!isvVar.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 parent$ui = isvVar.getNode().getParent$ui();
            LayoutNode P2 = qje.P(isvVar);
            ArrayList arrayList = null;
            while (P2 != null) {
                if ((((e530) P2.a0.g).getAggregateChildKindSet$ui() & 2097152) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 2097152) != 0) {
                            e530 e530Var2 = parent$ui;
                            wz40 wz40Var = null;
                            while (e530Var2 != null) {
                                if (e530Var2 instanceof isv) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(e530Var2);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (e530Var2.getKindSet$ui() & 2097152) != 0 && (e530Var2 instanceof lqh)) {
                                    int i3 = 0;
                                    for (e530 e530Var3 = ((lqh) e530Var2).b; e530Var3 != null; e530Var3 = e530Var3.getChild$ui()) {
                                        if ((e530Var3.getKindSet$ui() & 2097152) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                e530Var2 = e530Var3;
                                            } else {
                                                if (wz40Var == null) {
                                                    wz40Var = new wz40(new e530[16]);
                                                }
                                                if (e530Var2 != null) {
                                                    wz40Var.b(e530Var2);
                                                    e530Var2 = null;
                                                }
                                                wz40Var.b(e530Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                e530Var2 = qje.c(wz40Var);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                P2 = P2.s();
                parent$ui = (P2 == null || (t300Var = P2.a0) == null) ? null : (v7x0) t300Var.f;
            }
            isvVar.y0();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((isv) arrayList.get(i4)).y0();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [wz40] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [wz40] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r13v10, types: [e530] */
    /* JADX WARN: Type inference failed for: r13v11, types: [e530] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [e530] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25, types: [e530] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v8, types: [e530] */
    /* JADX WARN: Type inference failed for: r13v9, types: [e530] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [wz40] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [wz40] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [wz40] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    public final boolean f(KeyEvent keyEvent) {
        t5t0 t5t0Var;
        int size;
        t300 t300Var;
        boolean z;
        lqh lqhVar;
        t300 t300Var2;
        if (this.d.e) {
            System.out.getClass();
            return false;
        }
        d g = e.g(this.c);
        if (g != null) {
            if (!g.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 node = g.getNode();
            LayoutNode P = qje.P(g);
            loop0: while (true) {
                if (P == null) {
                    lqhVar = 0;
                    break;
                }
                if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 131072) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 131072) != 0) {
                            ?? r8 = 0;
                            lqhVar = node;
                            while (lqhVar != 0) {
                                if (lqhVar instanceof t5t0) {
                                    break loop0;
                                }
                                if ((lqhVar.getKindSet$ui() & 131072) != 0 && (lqhVar instanceof lqh)) {
                                    e530 e530Var = lqhVar.b;
                                    int i = 0;
                                    lqhVar = lqhVar;
                                    r8 = r8;
                                    while (e530Var != null) {
                                        if ((e530Var.getKindSet$ui() & 131072) != 0) {
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
                        node = node.getParent$ui();
                    }
                }
                P = P.s();
                node = (P == null || (t300Var2 = P.a0) == null) ? null : (v7x0) t300Var2.f;
            }
            t5t0Var = (t5t0) lqhVar;
        } else {
            t5t0Var = null;
        }
        if (t5t0Var != null) {
            if (!t5t0Var.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 parent$ui = t5t0Var.getNode().getParent$ui();
            LayoutNode P2 = qje.P(t5t0Var);
            ArrayList arrayList = null;
            while (P2 != null) {
                if ((((e530) P2.a0.g).getAggregateChildKindSet$ui() & 131072) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 131072) != 0) {
                            e530 e530Var2 = parent$ui;
                            wz40 wz40Var = null;
                            while (e530Var2 != null) {
                                if (e530Var2 instanceof t5t0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(e530Var2);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z && (e530Var2.getKindSet$ui() & 131072) != 0 && (e530Var2 instanceof lqh)) {
                                    int i2 = 0;
                                    for (e530 e530Var3 = ((lqh) e530Var2).b; e530Var3 != null; e530Var3 = e530Var3.getChild$ui()) {
                                        if ((e530Var3.getKindSet$ui() & 131072) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                e530Var2 = e530Var3;
                                            } else {
                                                if (wz40Var == null) {
                                                    wz40Var = new wz40(new e530[16]);
                                                }
                                                if (e530Var2 != null) {
                                                    wz40Var.b(e530Var2);
                                                    e530Var2 = null;
                                                }
                                                wz40Var.b(e530Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                e530Var2 = qje.c(wz40Var);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                P2 = P2.s();
                parent$ui = (P2 == null || (t300Var = P2.a0) == null) ? null : (v7x0) t300Var.f;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((k8w) ((t5t0) arrayList.get(size))).E0(keyEvent)) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            lqh node2 = t5t0Var.getNode();
            ?? r0 = 0;
            while (node2 != 0) {
                if (node2 instanceof t5t0) {
                    if (((k8w) ((t5t0) node2)).E0(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet$ui() & 131072) != 0 && (node2 instanceof lqh)) {
                    e530 e530Var4 = node2.b;
                    int i4 = 0;
                    r0 = r0;
                    node2 = node2;
                    while (e530Var4 != null) {
                        if ((e530Var4.getKindSet$ui() & 131072) != 0) {
                            i4++;
                            r0 = r0;
                            if (i4 == 1) {
                                node2 = e530Var4;
                            } else {
                                if (r0 == 0) {
                                    r0 = new wz40(new e530[16]);
                                }
                                if (node2 != 0) {
                                    r0.b(node2);
                                    node2 = 0;
                                }
                                r0.b(e530Var4);
                            }
                        }
                        e530Var4 = e530Var4.getChild$ui();
                        r0 = r0;
                        node2 = node2;
                    }
                    if (i4 == 1) {
                    }
                }
                node2 = qje.c(r0);
            }
            lqh node3 = t5t0Var.getNode();
            ?? r14 = 0;
            while (node3 != 0) {
                if (node3 instanceof t5t0) {
                } else if ((node3.getKindSet$ui() & 131072) != 0 && (node3 instanceof lqh)) {
                    e530 e530Var5 = node3.b;
                    int i5 = 0;
                    node3 = node3;
                    r14 = r14;
                    while (e530Var5 != null) {
                        if ((e530Var5.getKindSet$ui() & 131072) != 0) {
                            i5++;
                            r14 = r14;
                            if (i5 == 1) {
                                node3 = e530Var5;
                            } else {
                                if (r14 == 0) {
                                    r14 = new wz40(new e530[16]);
                                }
                                if (node3 != 0) {
                                    r14.b(node3);
                                    node3 = 0;
                                }
                                r14.b(e530Var5);
                            }
                        }
                        e530Var5 = e530Var5.getChild$ui();
                        node3 = node3;
                        r14 = r14;
                    }
                    if (i5 == 1) {
                    }
                }
                node3 = qje.c(r14);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((k8w) ((t5t0) arrayList.get(i6))).getClass();
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a5 A[Catch: all -> 0x034a, TryCatch #0 {all -> 0x034a, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0017, B:13:0x0021, B:16:0x002d, B:18:0x0037, B:19:0x003c, B:21:0x0048, B:23:0x004f, B:25:0x0057, B:29:0x0061, B:34:0x01a5, B:36:0x01af, B:37:0x01b2, B:39:0x01c1, B:42:0x01d1, B:46:0x01dd, B:49:0x01e3, B:50:0x01e8, B:52:0x01f0, B:54:0x01f8, B:56:0x01fc, B:58:0x0204, B:60:0x020c, B:66:0x0214, B:68:0x021d, B:69:0x0221, B:64:0x0224, B:75:0x022c, B:86:0x0231, B:89:0x0236, B:91:0x023c, B:98:0x0240, B:103:0x024b, B:105:0x0253, B:113:0x026a, B:115:0x0271, B:149:0x0275, B:144:0x02bd, B:117:0x0281, B:119:0x0289, B:121:0x028d, B:123:0x0295, B:125:0x029d, B:131:0x02a5, B:133:0x02ae, B:134:0x02b2, B:129:0x02b5, B:155:0x02c2, B:159:0x02d2, B:161:0x02d9, B:195:0x02dd, B:190:0x0325, B:163:0x02e9, B:165:0x02f1, B:167:0x02f5, B:169:0x02fd, B:171:0x0305, B:177:0x030d, B:179:0x0316, B:180:0x031a, B:175:0x031d, B:202:0x032c, B:204:0x0333, B:217:0x006b, B:219:0x0075, B:220:0x0078, B:222:0x0082, B:225:0x0092, B:229:0x009e, B:264:0x00fb, B:266:0x00ff, B:231:0x00a3, B:233:0x00ab, B:235:0x00af, B:237:0x00b7, B:239:0x00bf, B:245:0x00c7, B:247:0x00d0, B:248:0x00d4, B:243:0x00d7, B:254:0x00df, B:268:0x00e4, B:271:0x00e9, B:273:0x00ef, B:280:0x00f3, B:285:0x0105, B:287:0x010f, B:288:0x0112, B:290:0x0120, B:293:0x0130, B:297:0x013c, B:332:0x0199, B:334:0x019d, B:299:0x0141, B:301:0x0149, B:303:0x014d, B:305:0x0155, B:307:0x015d, B:313:0x0165, B:315:0x016e, B:316:0x0172, B:311:0x0175, B:322:0x017d, B:337:0x0182, B:340:0x0187, B:342:0x018d, B:349:0x0191), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [wz40] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [wz40] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [e530] */
    /* JADX WARN: Type inference failed for: r12v25, types: [e530] */
    /* JADX WARN: Type inference failed for: r12v29, types: [e530] */
    /* JADX WARN: Type inference failed for: r12v30, types: [e530] */
    /* JADX WARN: Type inference failed for: r12v34, types: [e530] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [e530] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [wz40] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(KeyEvent keyEvent, sls slsVar) {
        Object obj;
        e530 node;
        t300 t300Var;
        Object obj2;
        t300 t300Var2;
        int size;
        t300 t300Var3;
        boolean z;
        d dVar = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.getClass();
                return false;
            }
            if (!m(keyEvent)) {
                return false;
            }
            d g = e.g(dVar);
            if (g != null) {
                if (!g.getNode().isAttached()) {
                    ixv.b("visitLocalDescendants called on an unattached node");
                }
                e530 node2 = g.getNode();
                if ((node2.getAggregateChildKindSet$ui() & HProv.CALG_RSA_SIGN) != 0) {
                    node = null;
                    for (e530 child$ui = node2.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                        if ((child$ui.getKindSet$ui() & HProv.CALG_RSA_SIGN) != 0) {
                            if ((child$ui.getKindSet$ui() & 1024) != 0) {
                                break;
                            }
                            node = child$ui;
                        }
                    }
                } else {
                    node = null;
                }
            }
            if (g != null) {
                if (!g.getNode().isAttached()) {
                    ixv.b("visitAncestors called on an unattached node");
                }
                e530 node3 = g.getNode();
                LayoutNode P = qje.P(g);
                loop11: while (true) {
                    if (P == null) {
                        obj2 = null;
                        break;
                    }
                    if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 8192) != 0) {
                        while (node3 != null) {
                            if ((node3.getKindSet$ui() & 8192) != 0) {
                                wz40 wz40Var = null;
                                e530 e530Var = node3;
                                while (e530Var != null) {
                                    if (e530Var instanceof lix) {
                                        obj2 = e530Var;
                                        break loop11;
                                    }
                                    if ((e530Var.getKindSet$ui() & 8192) != 0 && (e530Var instanceof lqh)) {
                                        e530 e530Var2 = ((lqh) e530Var).b;
                                        int i = 0;
                                        e530Var = e530Var;
                                        wz40Var = wz40Var;
                                        while (e530Var2 != null) {
                                            if ((e530Var2.getKindSet$ui() & 8192) != 0) {
                                                i++;
                                                wz40Var = wz40Var;
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
                                            e530Var2 = e530Var2.getChild$ui();
                                            e530Var = e530Var;
                                            wz40Var = wz40Var;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    e530Var = qje.c(wz40Var);
                                }
                            }
                            node3 = node3.getParent$ui();
                        }
                    }
                    P = P.s();
                    node3 = (P == null || (t300Var2 = P.a0) == null) ? null : (v7x0) t300Var2.f;
                }
                lix lixVar = (lix) obj2;
                if (lixVar != null) {
                    node = lixVar.getNode();
                    if (node != null) {
                        if (!node.getNode().isAttached()) {
                            ixv.b("visitAncestors called on an unattached node");
                        }
                        e530 parent$ui = node.getNode().getParent$ui();
                        LayoutNode P2 = qje.P(node);
                        ArrayList arrayList = null;
                        while (P2 != null) {
                            if ((((e530) P2.a0.g).getAggregateChildKindSet$ui() & 8192) != 0) {
                                while (parent$ui != null) {
                                    if ((parent$ui.getKindSet$ui() & 8192) != 0) {
                                        e530 e530Var3 = parent$ui;
                                        wz40 wz40Var2 = null;
                                        while (e530Var3 != null) {
                                            if (e530Var3 instanceof lix) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(e530Var3);
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            if (z && (e530Var3.getKindSet$ui() & 8192) != 0 && (e530Var3 instanceof lqh)) {
                                                int i2 = 0;
                                                for (e530 e530Var4 = ((lqh) e530Var3).b; e530Var4 != null; e530Var4 = e530Var4.getChild$ui()) {
                                                    if ((e530Var4.getKindSet$ui() & 8192) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            e530Var3 = e530Var4;
                                                        } else {
                                                            if (wz40Var2 == null) {
                                                                wz40Var2 = new wz40(new e530[16]);
                                                            }
                                                            if (e530Var3 != null) {
                                                                wz40Var2.b(e530Var3);
                                                                e530Var3 = null;
                                                            }
                                                            wz40Var2.b(e530Var4);
                                                        }
                                                    }
                                                }
                                                if (i2 == 1) {
                                                }
                                            }
                                            e530Var3 = qje.c(wz40Var2);
                                        }
                                    }
                                    parent$ui = parent$ui.getParent$ui();
                                }
                            }
                            P2 = P2.s();
                            parent$ui = (P2 == null || (t300Var3 = P2.a0) == null) ? null : (v7x0) t300Var3.f;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i3 = size - 1;
                                if (((lix) arrayList.get(size)).y(keyEvent)) {
                                    return true;
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size = i3;
                            }
                        }
                        lqh node4 = node.getNode();
                        ?? r0 = 0;
                        while (node4 != 0) {
                            if (node4 instanceof lix) {
                                if (((lix) node4).y(keyEvent)) {
                                    return true;
                                }
                            } else if ((node4.getKindSet$ui() & 8192) != 0 && (node4 instanceof lqh)) {
                                e530 e530Var5 = node4.b;
                                int i4 = 0;
                                r0 = r0;
                                node4 = node4;
                                while (e530Var5 != null) {
                                    if ((e530Var5.getKindSet$ui() & 8192) != 0) {
                                        i4++;
                                        r0 = r0;
                                        if (i4 == 1) {
                                            node4 = e530Var5;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new wz40(new e530[16]);
                                            }
                                            if (node4 != 0) {
                                                r0.b(node4);
                                                node4 = 0;
                                            }
                                            r0.b(e530Var5);
                                        }
                                    }
                                    e530Var5 = e530Var5.getChild$ui();
                                    r0 = r0;
                                    node4 = node4;
                                }
                                if (i4 == 1) {
                                }
                            }
                            node4 = qje.c(r0);
                        }
                        if (((Boolean) slsVar.invoke()).booleanValue()) {
                            return true;
                        }
                        lqh node5 = node.getNode();
                        ?? r14 = 0;
                        while (node5 != 0) {
                            if (node5 instanceof lix) {
                                if (((lix) node5).o0(keyEvent)) {
                                    return true;
                                }
                            } else if ((node5.getKindSet$ui() & 8192) != 0 && (node5 instanceof lqh)) {
                                e530 e530Var6 = node5.b;
                                int i5 = 0;
                                node5 = node5;
                                r14 = r14;
                                while (e530Var6 != null) {
                                    if ((e530Var6.getKindSet$ui() & 8192) != 0) {
                                        i5++;
                                        r14 = r14;
                                        if (i5 == 1) {
                                            node5 = e530Var6;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new wz40(new e530[16]);
                                            }
                                            if (node5 != 0) {
                                                r14.b(node5);
                                                node5 = 0;
                                            }
                                            r14.b(e530Var6);
                                        }
                                    }
                                    e530Var6 = e530Var6.getChild$ui();
                                    node5 = node5;
                                    r14 = r14;
                                }
                                if (i5 == 1) {
                                }
                            }
                            node5 = qje.c(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                if (((lix) arrayList.get(i6)).o0(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!dVar.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 parent$ui2 = dVar.getNode().getParent$ui();
            LayoutNode P3 = qje.P(dVar);
            loop15: while (true) {
                if (P3 == null) {
                    obj = null;
                    break;
                }
                if ((((e530) P3.a0.g).getAggregateChildKindSet$ui() & 8192) != 0) {
                    while (parent$ui2 != null) {
                        if ((parent$ui2.getKindSet$ui() & 8192) != 0) {
                            e530 e530Var7 = parent$ui2;
                            wz40 wz40Var3 = null;
                            while (e530Var7 != null) {
                                if (e530Var7 instanceof lix) {
                                    obj = e530Var7;
                                    break loop15;
                                }
                                if ((e530Var7.getKindSet$ui() & 8192) != 0 && (e530Var7 instanceof lqh)) {
                                    e530 e530Var8 = ((lqh) e530Var7).b;
                                    int i7 = 0;
                                    e530Var7 = e530Var7;
                                    wz40Var3 = wz40Var3;
                                    while (e530Var8 != null) {
                                        if ((e530Var8.getKindSet$ui() & 8192) != 0) {
                                            i7++;
                                            wz40Var3 = wz40Var3;
                                            if (i7 == 1) {
                                                e530Var7 = e530Var8;
                                            } else {
                                                if (wz40Var3 == null) {
                                                    wz40Var3 = new wz40(new e530[16]);
                                                }
                                                if (e530Var7 != null) {
                                                    wz40Var3.b(e530Var7);
                                                    e530Var7 = null;
                                                }
                                                wz40Var3.b(e530Var8);
                                            }
                                        }
                                        e530Var8 = e530Var8.getChild$ui();
                                        e530Var7 = e530Var7;
                                        wz40Var3 = wz40Var3;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                e530Var7 = qje.c(wz40Var3);
                            }
                        }
                        parent$ui2 = parent$ui2.getParent$ui();
                    }
                }
                P3 = P3.s();
                parent$ui2 = (P3 == null || (t300Var = P3.a0) == null) ? null : (v7x0) t300Var.f;
            }
            lix lixVar2 = (lix) obj;
            node = lixVar2 != null ? lixVar2.getNode() : null;
            if (node != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x009d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean h(int i, zii0 zii0Var, tls tlsVar) {
        d dVar = this.c;
        d g = e.g(dVar);
        AndroidComposeView androidComposeView = this.b;
        if (g != null) {
            yur f = e.f(g, i, androidComposeView.getLayoutDirection());
            yur yurVar = yur.b;
            if (!jl40.l(f, qqa1.h())) {
                if (jl40.l(f, qqa1.j())) {
                    d g2 = e.g(dVar);
                    if (g2 != null) {
                        return (Boolean) tlsVar.invoke(g2);
                    }
                } else if (!jl40.l(f, qqa1.i())) {
                    if (f == qqa1.i()) {
                        ny61.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        return null;
                    }
                    if (f == qqa1.h()) {
                        ny61.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        return null;
                    }
                    boolean z = false;
                    if (f.a().c == 0) {
                        System.out.getClass();
                    } else {
                        wz40 a = f.a();
                        Object[] objArr = a.a;
                        int i2 = a.c;
                        boolean z2 = false;
                        for (int i3 = 0; i3 < i2; i3++) {
                            avr avrVar = (avr) objArr[i3];
                            if (!avrVar.getNode().isAttached()) {
                                ixv.b("visitChildren called on an unattached node");
                            }
                            wz40 wz40Var = new wz40(new e530[16]);
                            e530 child$ui = avrVar.getNode().getChild$ui();
                            if (child$ui == null) {
                                qje.b(wz40Var, avrVar.getNode());
                            } else {
                                wz40Var.b(child$ui);
                            }
                            while (true) {
                                int i4 = wz40Var.c;
                                if (i4 != 0) {
                                    e530 e530Var = (e530) wz40Var.k(i4 - 1);
                                    if ((e530Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                                        qje.b(wz40Var, e530Var);
                                    } else {
                                        while (true) {
                                            if (e530Var == null) {
                                                break;
                                            }
                                            if ((e530Var.getKindSet$ui() & 1024) != 0) {
                                                wz40 wz40Var2 = null;
                                                while (e530Var != null) {
                                                    if (e530Var instanceof d) {
                                                        if (((Boolean) tlsVar.invoke((d) e530Var)).booleanValue()) {
                                                            z2 = true;
                                                            break;
                                                        }
                                                    } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                                        int i5 = 0;
                                                        for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                                            if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                                                i5++;
                                                                if (i5 == 1) {
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
                                                        }
                                                        if (i5 == 1) {
                                                        }
                                                    }
                                                    e530Var = qje.c(wz40Var2);
                                                }
                                            } else {
                                                e530Var = e530Var.getChild$ui();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                    return Boolean.valueOf(z);
                }
            }
            return null;
        }
        g = null;
        return e.k(dVar, i, androidComposeView.getLayoutDirection(), zii0Var, new FocusOwnerImpl$focusSearch$1(g, this, tlsVar));
    }

    public final d i() {
        d dVar = this.h;
        if (dVar == null || !dVar.isAttached()) {
            return null;
        }
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
    public final boolean j(final int i, boolean z) {
        d i2 = i();
        AndroidComposeView androidComposeView = this.a;
        if (i2 == null || !i2.a || !androidComposeView.mo67moveFocusInChildren3ESFkO8(i)) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = Boolean.FALSE;
            d i3 = i();
            Boolean h = h(i, androidComposeView.getEmbeddedViewFocusRect(), new tls() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ref$ObjectRef.element = Boolean.valueOf(((d) obj).L0(i));
                    return ref$ObjectRef.element;
                }
            });
            if (!jl40.l(h, Boolean.TRUE) || i3 == i()) {
                if (h != null && ref$ObjectRef.element != 0) {
                    if (!h.booleanValue() || !((Boolean) ref$ObjectRef.element).booleanValue()) {
                        if (lqa1.c(i) && z && d(i, false, false)) {
                            Boolean h2 = h(i, null, new tls() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.tls
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(((d) obj).L0(i));
                                }
                            });
                            if (h2 != null ? h2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean k(final int i) {
        if (!d(i, false, false)) {
            return false;
        }
        Boolean h = h(i, null, new tls() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$resetFocus$successfulReset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((d) obj).L0(i));
            }
        });
        boolean booleanValue = h != null ? h.booleanValue() : false;
        if (!booleanValue) {
            this.a.clearOwnerFocus();
        }
        return booleanValue;
    }

    public final void l(d dVar) {
        d dVar2 = this.h;
        this.h = dVar;
        xy40 xy40Var = this.g;
        Object[] objArr = xy40Var.a;
        int i = xy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cur) objArr[i2]).onFocusChanged(dVar2, dVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0340, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        r32 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r0 = r5.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (r5.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (((r5.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
    
        r0 = r5.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ce, code lost:
    
        if (r0 <= r4) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (java.lang.Long.compareUnsigned(r5.d * 32, r0 * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        r0 = r5.a;
        r3 = r5.c;
        r6 = r5.b;
        r9 = (r3 + 7) >> 3;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        if (r10 >= r9) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
    
        r14 = r0[r10] & (-9187201950435737472L);
        r0[r10] = ((~r14) + (r14 >>> r32)) & (-72340172838076674L);
        r10 = r10 + 1;
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010b, code lost:
    
        r11 = r7;
        r33 = r8;
        r7 = r0.length;
        r8 = r7 - 1;
        r7 = r7 - 2;
        r14 = 72057594037927935L;
        r0[r7] = (r0[r7] & 72057594037927935L) | (-72057594037927936L);
        r0[r8] = r0[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        if (r7 == r3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        r8 = r7 >> 3;
        r23 = (r7 & 7) << 3;
        r9 = (r0[r8] >> r23) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        if (r9 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013e, code lost:
    
        if (r9 == 254) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
    
        r9 = java.lang.Long.hashCode(r6[r7]) * r34;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r24 = r5.b(r10);
        r10 = r10 & r3;
        r37 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0162, code lost:
    
        if ((((r24 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0164, code lost:
    
        r39 = r12;
        r0[r8] = ((r9 & ru.CryptoPro.JCSP.MSCAPI.HProv.PP_VERSION_TIMESTAMP) << r23) | (r0[r8] & (~(255 << r23)));
        r0[r0.length - 1] = (r0[0] & r14) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0185, code lost:
    
        r4 = r37;
        r12 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018a, code lost:
    
        r41 = r11;
        r39 = r12;
        r4 = r24 >> 3;
        r10 = r0[r4];
        r12 = (r24 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019c, code lost:
    
        if (((r10 >> r12) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019e, code lost:
    
        r35 = r14;
        r13 = r3;
        r0[r4] = ((~(255 << r12)) & r10) | ((r9 & ru.CryptoPro.JCSP.MSCAPI.HProv.PP_VERSION_TIMESTAMP) << r12);
        r0[r8] = (r0[r8] & (~(255 << r23))) | (128 << r23);
        r6[r24] = r6[r7];
        r6[r7] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01db, code lost:
    
        r0[r0.length - 1] = (r0[0] & r35) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r11 = r41;
        r3 = r13;
        r14 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c1, code lost:
    
        r13 = r3;
        r35 = r14;
        r0[r4] = ((r9 & ru.CryptoPro.JCSP.MSCAPI.HProv.PP_VERSION_TIMESTAMP) << r12) | ((~(255 << r12)) & r10);
        r3 = r6[r24];
        r6[r24] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ee, code lost:
    
        r41 = r11;
        r39 = r12;
        r5.e = defpackage.cmm0.a(r5.c) - r5.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0275, code lost:
    
        r0 = r5.b(r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0279, code lost:
    
        r11 = r0;
        r5.d++;
        r0 = r5.e;
        r3 = r5.a;
        r4 = r11 >> 3;
        r6 = r3[r4];
        r8 = (r11 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0292, code lost:
    
        if (((r6 >> r8) & 255) != r18) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0294, code lost:
    
        r22 = r41 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0296, code lost:
    
        r5.e = r0 - r22;
        r0 = r5.c;
        r6 = (r6 & (~(255 << r8))) | (r39 << r8);
        r3[r4] = r6;
        r3[(((r11 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0201, code lost:
    
        r41 = true;
        r33 = r8;
        r39 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020b, code lost:
    
        r0 = defpackage.cmm0.c(r5.c);
        r3 = r5.a;
        r4 = r5.b;
        r6 = r5.c;
        r5.c(r0);
        r0 = r5.a;
        r7 = r5.b;
        r8 = r5.c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0222, code lost:
    
        if (r9 >= r6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0231, code lost:
    
        if (((r3[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= r18) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0233, code lost:
    
        r10 = r4[r9];
        r12 = java.lang.Long.hashCode(r10) * r34;
        r12 = r12 ^ (r12 << 16);
        r13 = r5.b(r12 >>> 7);
        r14 = r12 & ru.CryptoPro.JCSP.MSCAPI.HProv.PP_VERSION_TIMESTAMP;
        r12 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r17 = r3;
        r23 = r4;
        r3 = (r0[r12] & (~(255 << r16))) | (r14 << r16);
        r0[r12] = r3;
        r0[(((r13 - 7) & r8) + (r8 & 7)) >> 3] = r3;
        r7[r13] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x026e, code lost:
    
        r9 = r9 + 1;
        r3 = r17;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x026a, code lost:
    
        r17 = r3;
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0208, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c4, code lost:
    
        r41 = true;
        r39 = r12;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033e, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(KeyEvent keyEvent) {
        int i;
        boolean z;
        int i2;
        long c = c9y.c(keyEvent);
        int f = c9y.f(keyEvent);
        int i3 = -862048943;
        int i4 = 8;
        int i5 = 0;
        boolean z2 = true;
        if (fcb1.b(f, 2)) {
            hy40 hy40Var = this.f;
            if (hy40Var == null) {
                hy40Var = new hy40(3);
                this.f = hy40Var;
            }
            hy40 hy40Var2 = hy40Var;
            int hashCode = Long.hashCode(c) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & HProv.PP_VERSION_TIMESTAMP;
            int i9 = hy40Var2.c;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = hy40Var2.a;
                int i12 = i10 >> 3;
                int i13 = (i10 & 7) << 3;
                long j = jArr[i12] >>> i13;
                long j2 = jArr[i12 + 1] << (64 - i13);
                int i14 = i3;
                char c2 = 7;
                long j3 = j | (j2 & ((-i13) >> 63));
                long j4 = i8;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == 0) {
                        break;
                    }
                    i2 = (i10 + (Long.numberOfTrailingZeros(j6) >> 3)) & i9;
                    char c3 = c2;
                    if (hy40Var2.b[i2] == c) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    c2 = c3;
                }
                i11 += 8;
                i10 = (i10 + i11) & i9;
                i3 = i14;
                i4 = i4;
            }
            hy40Var2.b[i2] = c;
            return z;
        }
        if (!fcb1.b(f, 1)) {
            return true;
        }
        hy40 hy40Var3 = this.f;
        if (hy40Var3 == null || !hy40Var3.a(c)) {
            return false;
        }
        hy40 hy40Var4 = this.f;
        if (hy40Var4 != null) {
            int hashCode2 = Long.hashCode(c) * (-862048943);
            int i15 = hashCode2 ^ (hashCode2 << 16);
            int i16 = i15 & HProv.PP_VERSION_TIMESTAMP;
            int i17 = hy40Var4.c;
            int i18 = i15 >>> 7;
            loop5: while (true) {
                int i19 = i18 & i17;
                long[] jArr2 = hy40Var4.a;
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                long j7 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
                long j8 = (i16 * 72340172838076673L) ^ j7;
                long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j9 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j9) >> 3) + i19) & i17;
                    if (hy40Var4.b[i] == c) {
                        break loop5;
                    }
                    j9 &= j9 - 1;
                }
                i5 += 8;
                i18 = i19 + i5;
            }
            if (i >= 0) {
                hy40Var4.d--;
                long[] jArr3 = hy40Var4.a;
                int i22 = hy40Var4.c;
                int i23 = i >> 3;
                int i24 = (i & 7) << 3;
                long j10 = (jArr3[i23] & (~(255 << i24))) | (254 << i24);
                jArr3[i23] = j10;
                jArr3[(((i - 7) & i22) + (i22 & 7)) >> 3] = j10;
                return true;
            }
        }
        return true;
    }
}
