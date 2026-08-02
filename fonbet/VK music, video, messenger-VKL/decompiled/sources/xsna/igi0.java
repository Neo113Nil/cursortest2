package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: SemanticsNode.kt */
/* loaded from: classes11.dex */
public final class igi0 {
    public final q630.c a;
    public final boolean b;
    public final LayoutNode c;
    public final xfi0 d;
    public igi0 e;
    public final int f;

    /* compiled from: SemanticsNode.kt */
    public static final class a extends q630.c implements fgi0 {
        public final /* synthetic */ Lambda p;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super tgi0, s3q0> izsVar) {
            this.p = (Lambda) izsVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
        @Override // xsna.fgi0
        public final void l1(tgi0 tgi0Var) {
            this.p.invoke(tgi0Var);
        }
    }

    public igi0(q630.c cVar, boolean z, LayoutNode layoutNode, xfi0 xfi0Var) {
        this.a = cVar;
        this.b = z;
        this.c = layoutNode;
        this.d = xfi0Var;
        this.f = layoutNode.c;
    }

    public static /* synthetic */ List j(int i, igi0 igi0Var) {
        return igi0Var.i((i & 1) != 0 ? !igi0Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final zhf0 a(androidx.compose.ui.node.o oVar) {
        ytl ytlVar;
        igi0 l = l();
        if (l == null) {
            return zhf0.e;
        }
        q630.c cVar = l.c.G.f;
        if ((cVar.e & 8) != 0) {
            loop0: while (cVar != null) {
                if ((cVar.d & 8) != 0) {
                    ytlVar = cVar;
                    ?? r6 = 0;
                    while (ytlVar != 0) {
                        if (ytlVar instanceof fgi0) {
                            if (ytlVar.w1()) {
                                break loop0;
                            }
                        } else if ((ytlVar.d & 8) != 0 && (ytlVar instanceof ytl)) {
                            q630.c cVar2 = ytlVar.q;
                            int i = 0;
                            ytlVar = ytlVar;
                            r6 = r6;
                            while (cVar2 != null) {
                                if ((cVar2.d & 8) != 0) {
                                    i++;
                                    r6 = r6;
                                    if (i == 1) {
                                        ytlVar = cVar2;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new ci50(new q630.c[16]);
                                        }
                                        if (ytlVar != 0) {
                                            r6.b(ytlVar);
                                            ytlVar = 0;
                                        }
                                        r6.b(cVar2);
                                    }
                                }
                                cVar2 = cVar2.g;
                                ytlVar = ytlVar;
                                r6 = r6;
                            }
                            if (i == 1) {
                            }
                        }
                        ytlVar = itl.b(r6);
                    }
                }
                if ((cVar.e & 8) == 0) {
                    break;
                }
                cVar = cVar.g;
            }
        }
        ytlVar = 0;
        fgi0 fgi0Var = (fgi0) ytlVar;
        androidx.compose.ui.node.o d = fgi0Var != null ? itl.d(fgi0Var, 8) : null;
        return d == null ? l.a(oVar) : d.z(oVar, true);
    }

    public final igi0 b(plg0 plg0Var, izs<? super tgi0, s3q0> izsVar) {
        xfi0 xfi0Var = new xfi0();
        xfi0Var.d = false;
        xfi0Var.e = false;
        izsVar.invoke(xfi0Var);
        igi0 igi0Var = new igi0(new a(izsVar), false, new LayoutNode(true, this.f + (plg0Var != null ? 1000000000 : 2000000000)), xfi0Var);
        igi0Var.e = this;
        return igi0Var;
    }

    public final void c(LayoutNode layoutNode, ArrayList arrayList) {
        ci50<LayoutNode> K = layoutNode.K();
        LayoutNode[] layoutNodeArr = K.b;
        int i = K.d;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = layoutNodeArr[i2];
            if (layoutNode2.e() && !layoutNode2.R) {
                if (layoutNode2.G.d(8)) {
                    arrayList.add(kgi0.a(layoutNode2, this.b));
                } else {
                    c(layoutNode2, arrayList);
                }
            }
        }
    }

    public final androidx.compose.ui.node.o d() {
        androidx.compose.ui.node.o d;
        if (!o()) {
            fgi0 f = f();
            return (f == null || (d = itl.d(f, 8)) == null) ? this.c.G.c : d;
        }
        igi0 l = l();
        if (l != null) {
            return l.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            igi0 igi0Var = (igi0) arrayList.get(size2);
            if (igi0Var.p()) {
                arrayList2.add(igi0Var);
            } else if (!igi0Var.d.e) {
                igi0Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fgi0 f() {
        q630.c cVar;
        boolean z;
        boolean z2 = this.d.d;
        LayoutNode layoutNode = this.c;
        Object obj = null;
        if (!z2) {
            q630.c cVar2 = layoutNode.G.f;
            if ((cVar2.e & 8) != 0) {
                loop3: while (cVar2 != null) {
                    if ((cVar2.d & 8) != 0) {
                        cVar = cVar2;
                        ci50 ci50Var = null;
                        while (cVar != null) {
                            if (cVar instanceof fgi0) {
                                if (((fgi0) cVar).w1()) {
                                    obj = cVar;
                                }
                            } else if ((cVar.d & 8) != 0 && (cVar instanceof ytl)) {
                                int i = 0;
                                for (q630.c cVar3 = ((ytl) cVar).q; cVar3 != null; cVar3 = cVar3.g) {
                                    if ((cVar3.d & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVar = cVar3;
                                        } else {
                                            if (ci50Var == null) {
                                                ci50Var = new ci50(new q630.c[16]);
                                            }
                                            if (cVar != null) {
                                                ci50Var.b(cVar);
                                                cVar = null;
                                            }
                                            ci50Var.b(cVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVar = itl.b(ci50Var);
                        }
                    }
                    if ((cVar2.e & 8) == 0) {
                        break;
                    }
                    cVar2 = cVar2.g;
                }
            }
            return (fgi0) obj;
        }
        q630.c cVar4 = layoutNode.G.f;
        if ((cVar4.e & 8) != 0) {
            cVar = null;
            while (cVar4 != null) {
                if ((cVar4.d & 8) != 0) {
                    q630.c cVar5 = cVar4;
                    ci50 ci50Var2 = null;
                    while (cVar5 != null) {
                        if (cVar5 instanceof fgi0) {
                            fgi0 fgi0Var = (fgi0) cVar5;
                            if (fgi0Var.w1()) {
                                if (fgi0Var.q1()) {
                                    return fgi0Var;
                                }
                                if (cVar == null) {
                                    cVar = fgi0Var;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (cVar5.d & 8) != 0 && (cVar5 instanceof ytl)) {
                            int i2 = 0;
                            for (q630.c cVar6 = ((ytl) cVar5).q; cVar6 != null; cVar6 = cVar6.g) {
                                if ((cVar6.d & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        cVar5 = cVar6;
                                    } else {
                                        if (ci50Var2 == null) {
                                            ci50Var2 = new ci50(new q630.c[16]);
                                        }
                                        if (cVar5 != null) {
                                            ci50Var2.b(cVar5);
                                            cVar5 = null;
                                        }
                                        ci50Var2.b(cVar6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        cVar5 = itl.b(ci50Var2);
                    }
                }
                if ((cVar4.e & 8) == 0) {
                    break;
                }
                cVar4 = cVar4.g;
            }
            obj = cVar;
        }
        return (fgi0) obj;
    }

    public final zhf0 g() {
        androidx.compose.ui.node.o d = d();
        if (d != null) {
            if (!d.D1().o) {
                d = null;
            }
            if (d != null) {
                return jgz.p(d).z(d, true);
            }
        }
        return zhf0.e;
    }

    public final zhf0 h() {
        androidx.compose.ui.node.o d = d();
        if (d != null) {
            if (!d.D1().o) {
                d = null;
            }
            if (d != null) {
                return jgz.j(d, true);
            }
        }
        return zhf0.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.e) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final xfi0 k() {
        boolean p = p();
        xfi0 xfi0Var = this.d;
        if (!p) {
            return xfi0Var;
        }
        xfi0 xfi0Var2 = new xfi0();
        xfi0Var2.d = xfi0Var.d;
        xfi0Var2.e = xfi0Var.e;
        xfi0Var2.b.m(xfi0Var.b);
        r(new ArrayList(), xfi0Var2);
        return xfi0Var2;
    }

    public final igi0 l() {
        LayoutNode layoutNode;
        igi0 igi0Var = this.e;
        if (igi0Var != null) {
            return igi0Var;
        }
        LayoutNode layoutNode2 = this.c;
        boolean z = this.b;
        if (z) {
            layoutNode = layoutNode2.I();
            while (layoutNode != null) {
                xfi0 d = layoutNode.d();
                if (d != null && d.d) {
                    break;
                }
                layoutNode = layoutNode.I();
            }
        }
        layoutNode = null;
        if (layoutNode == null) {
            LayoutNode I = layoutNode2.I();
            while (true) {
                if (I == null) {
                    layoutNode = null;
                    break;
                }
                if (I.G.d(8)) {
                    layoutNode = I;
                    break;
                }
                I = I.I();
            }
        }
        if (layoutNode == null) {
            return null;
        }
        return kgi0.a(layoutNode, z);
    }

    public final zhf0 m() {
        fgi0 f = f();
        if (f == null) {
            return this.c.G.c.g2();
        }
        q630.c z = f.z();
        boolean z2 = zfi0.a(this.d, wfi0.b) != null;
        if (!z.b.o) {
            return zhf0.e;
        }
        if (z2) {
            return itl.d(z, 8).g2();
        }
        androidx.compose.ui.node.o d = itl.d(z, 8);
        return jgz.p(d).z(d, true);
    }

    public final xfi0 n() {
        return this.d;
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.d;
    }

    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        LayoutNode I = this.c.I();
        while (true) {
            if (I == null) {
                I = null;
                break;
            }
            xfi0 d = I.d();
            if (d != null && d.d) {
                break;
            }
            I = I.I();
        }
        return I == null;
    }

    public final void r(ArrayList arrayList, xfi0 xfi0Var) {
        if (this.d.e) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            igi0 igi0Var = (igi0) arrayList.get(size2);
            if (!igi0Var.p()) {
                xfi0Var.e(igi0Var.d);
                igi0Var.r(arrayList, xfi0Var);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        if (o()) {
            return EmptyList.b;
        }
        c(this.c, arrayList);
        if (z) {
            sgi0<plg0> sgi0Var = ngi0.z;
            xfi0 xfi0Var = this.d;
            plg0 plg0Var = (plg0) zfi0.a(xfi0Var, sgi0Var);
            if (plg0Var != null && xfi0Var.d && !arrayList.isEmpty()) {
                arrayList.add(b(plg0Var, new ggi0(plg0Var)));
            }
            sgi0<List<String>> sgi0Var2 = ngi0.a;
            if (xfi0Var.b.b(sgi0Var2) && !arrayList.isEmpty() && xfi0Var.d) {
                List list = (List) zfi0.a(xfi0Var, sgi0Var2);
                String str = list != null ? (String) j5g.a0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new hgi0(str)));
                }
            }
        }
        return arrayList;
    }
}
