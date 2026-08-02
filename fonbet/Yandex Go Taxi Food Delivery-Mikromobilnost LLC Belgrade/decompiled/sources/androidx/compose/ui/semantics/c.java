package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import defpackage.awk0;
import defpackage.cnq0;
import defpackage.e530;
import defpackage.ffx;
import defpackage.gnq0;
import defpackage.gwk0;
import defpackage.hnq0;
import defpackage.lqh;
import defpackage.mnq0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.t300;
import defpackage.tls;
import defpackage.wz40;
import defpackage.zii0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class c {
    public final e530 a;
    public final boolean b;
    public final LayoutNode c;
    public final cnq0 d;
    public c e;
    public final int f;

    public c(e530 e530Var, boolean z, LayoutNode layoutNode, cnq0 cnq0Var) {
        this.a = e530Var;
        this.b = z;
        this.c = layoutNode;
        this.d = cnq0Var;
        this.f = layoutNode.b;
    }

    public static /* synthetic */ List j(c cVar, int i) {
        return cVar.i((i & 1) != 0 ? !cVar.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
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
    public final zii0 a(s sVar) {
        lqh lqhVar;
        c l = l();
        if (l == null) {
            return zii0.e;
        }
        t300 t300Var = l.c.a0;
        if ((((e530) t300Var.g).getAggregateChildKindSet$ui() & 8) != 0) {
            loop0: for (e530 e530Var = (e530) t300Var.g; e530Var != null; e530Var = e530Var.getChild$ui()) {
                if ((e530Var.getKindSet$ui() & 8) != 0) {
                    lqhVar = e530Var;
                    ?? r5 = 0;
                    while (lqhVar != 0) {
                        if (lqhVar instanceof gnq0) {
                            if (lqhVar.U()) {
                                break loop0;
                            }
                        } else if ((lqhVar.getKindSet$ui() & 8) != 0 && (lqhVar instanceof lqh)) {
                            e530 e530Var2 = lqhVar.b;
                            int i = 0;
                            lqhVar = lqhVar;
                            r5 = r5;
                            while (e530Var2 != null) {
                                if ((e530Var2.getKindSet$ui() & 8) != 0) {
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
                if ((e530Var.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
            }
        }
        lqhVar = 0;
        gnq0 gnq0Var = (gnq0) lqhVar;
        s N = gnq0Var != null ? qje.N(gnq0Var, 8) : null;
        return N == null ? l.a(sVar) : N.j(sVar, true);
    }

    public final c b(awk0 awk0Var, tls tlsVar) {
        cnq0 cnq0Var = new cnq0();
        cnq0Var.c = false;
        cnq0Var.w = false;
        tlsVar.invoke(cnq0Var);
        c cVar = new c(new hnq0(tlsVar), false, new LayoutNode(true, this.f + (awk0Var != null ? 1000000000 : 2000000000)), cnq0Var);
        cVar.e = this;
        return cVar;
    }

    public final void c(LayoutNode layoutNode, ArrayList arrayList) {
        wz40 w = layoutNode.w();
        Object[] objArr = w.a;
        int i = w.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.F() && !layoutNode2.l0) {
                if (layoutNode2.a0.e(8)) {
                    arrayList.add(q5z.a(layoutNode2, this.b));
                } else {
                    c(layoutNode2, arrayList);
                }
            }
        }
    }

    public final s d() {
        if (!o()) {
            gnq0 f = f();
            return f != null ? qje.N(f, 8) : (androidx.compose.ui.node.f) this.c.a0.d;
        }
        c l = l();
        if (l != null) {
            return l.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            c cVar = (c) arrayList.get(size2);
            if (cVar.p()) {
                arrayList2.add(cVar);
            } else if (!cVar.d.w) {
                cVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gnq0 f() {
        e530 e530Var;
        boolean z;
        boolean z2 = this.d.c;
        Object obj = null;
        LayoutNode layoutNode = this.c;
        if (!z2) {
            t300 t300Var = layoutNode.a0;
            if ((((e530) t300Var.g).getAggregateChildKindSet$ui() & 8) != 0) {
                loop3: for (e530 e530Var2 = (e530) t300Var.g; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                    if ((e530Var2.getKindSet$ui() & 8) != 0) {
                        e530Var = e530Var2;
                        wz40 wz40Var = null;
                        while (e530Var != null) {
                            if (e530Var instanceof gnq0) {
                                if (((gnq0) e530Var).U()) {
                                    obj = e530Var;
                                }
                            } else if ((e530Var.getKindSet$ui() & 8) != 0 && (e530Var instanceof lqh)) {
                                int i = 0;
                                for (e530 e530Var3 = ((lqh) e530Var).b; e530Var3 != null; e530Var3 = e530Var3.getChild$ui()) {
                                    if ((e530Var3.getKindSet$ui() & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            e530Var = e530Var3;
                                        } else {
                                            if (wz40Var == null) {
                                                wz40Var = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var.b(e530Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var);
                        }
                    }
                    if ((e530Var2.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                }
            }
            return (gnq0) obj;
        }
        t300 t300Var2 = layoutNode.a0;
        if ((((e530) t300Var2.g).getAggregateChildKindSet$ui() & 8) != 0) {
            e530Var = null;
            for (e530 e530Var4 = (e530) t300Var2.g; e530Var4 != null; e530Var4 = e530Var4.getChild$ui()) {
                if ((e530Var4.getKindSet$ui() & 8) != 0) {
                    e530 e530Var5 = e530Var4;
                    wz40 wz40Var2 = null;
                    while (e530Var5 != null) {
                        if (e530Var5 instanceof gnq0) {
                            gnq0 gnq0Var = (gnq0) e530Var5;
                            if (gnq0Var.U()) {
                                if (gnq0Var.T()) {
                                    return gnq0Var;
                                }
                                if (e530Var == null) {
                                    e530Var = gnq0Var;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (e530Var5.getKindSet$ui() & 8) != 0 && (e530Var5 instanceof lqh)) {
                            int i2 = 0;
                            for (e530 e530Var6 = ((lqh) e530Var5).b; e530Var6 != null; e530Var6 = e530Var6.getChild$ui()) {
                                if ((e530Var6.getKindSet$ui() & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        e530Var5 = e530Var6;
                                    } else {
                                        if (wz40Var2 == null) {
                                            wz40Var2 = new wz40(new e530[16]);
                                        }
                                        if (e530Var5 != null) {
                                            wz40Var2.b(e530Var5);
                                            e530Var5 = null;
                                        }
                                        wz40Var2.b(e530Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        e530Var5 = qje.c(wz40Var2);
                    }
                }
                if ((e530Var4.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
            }
            obj = e530Var;
        }
        return (gnq0) obj;
    }

    public final zii0 g() {
        s d = d();
        if (d != null) {
            if (!d.d()) {
                d = null;
            }
            if (d != null) {
                return gwk0.o(d).j(d, true);
            }
        }
        return zii0.e;
    }

    public final zii0 h() {
        s d = d();
        if (d != null) {
            if (!d.d()) {
                d = null;
            }
            if (d != null) {
                return gwk0.j(d, true);
            }
        }
        return zii0.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.w) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final cnq0 k() {
        boolean p = p();
        cnq0 cnq0Var = this.d;
        if (!p) {
            return cnq0Var;
        }
        cnq0 b = cnq0Var.b();
        r(new ArrayList(), b);
        return b;
    }

    public final c l() {
        LayoutNode layoutNode;
        c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        LayoutNode layoutNode2 = this.c;
        boolean z = this.b;
        if (z) {
            layoutNode = layoutNode2.s();
            while (layoutNode != null) {
                cnq0 u = layoutNode.u();
                if (u != null && u.c) {
                    break;
                }
                layoutNode = layoutNode.s();
            }
        }
        layoutNode = null;
        if (layoutNode == null) {
            LayoutNode s = layoutNode2.s();
            while (true) {
                if (s == null) {
                    layoutNode = null;
                    break;
                }
                if (s.a0.e(8)) {
                    layoutNode = s;
                    break;
                }
                s = s.s();
            }
        }
        if (layoutNode == null) {
            return null;
        }
        return q5z.a(layoutNode, z);
    }

    public final long m() {
        s d = d();
        if (d == null) {
            return 0L;
        }
        if (!d.d()) {
            d = null;
        }
        if (d != null) {
            return d.v(0L);
        }
        return 0L;
    }

    public final zii0 n() {
        gnq0 f = f();
        if (f == null) {
            return ((androidx.compose.ui.node.f) this.c.a0.d).x1();
        }
        return ffx.C(f.getNode(), b.a(this.d, a.b) != null, true);
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.c;
    }

    public final boolean q() {
        if (o() || !j(this, 4).isEmpty()) {
            return false;
        }
        LayoutNode s = this.c.s();
        while (true) {
            if (s == null) {
                s = null;
                break;
            }
            cnq0 u = s.u();
            if (u != null && u.c) {
                break;
            }
            s = s.s();
        }
        return s == null;
    }

    public final void r(ArrayList arrayList, cnq0 cnq0Var) {
        if (this.d.w) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            c cVar = (c) arrayList.get(size2);
            if (!cVar.p()) {
                cnq0Var.f(cVar.d);
                cVar.r(arrayList, cnq0Var);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        if (o()) {
            return EmptyList.a;
        }
        c(this.c, arrayList);
        if (z) {
            g gVar = d.z;
            cnq0 cnq0Var = this.d;
            final awk0 awk0Var = (awk0) b.a(cnq0Var, gVar);
            if (awk0Var != null && cnq0Var.c && !arrayList.isEmpty()) {
                arrayList.add(b(awk0Var, new tls() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        f.p((mnq0) obj, awk0.this.a);
                        return zy11.a;
                    }
                }));
            }
            g gVar2 = d.a;
            if (cnq0Var.a.b(gVar2) && !arrayList.isEmpty() && cnq0Var.c) {
                List list = (List) b.a(cnq0Var, gVar2);
                final String str = list != null ? (String) kotlin.collections.a.R(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new tls() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            f.l((mnq0) obj, str);
                            return zy11.a;
                        }
                    }));
                }
            }
        }
        return arrayList;
    }
}
