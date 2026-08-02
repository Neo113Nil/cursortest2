package xsna;

import androidx.compose.ui.node.LayoutNode;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: ModifierLocalManager.kt */
/* loaded from: classes11.dex */
public final class z630 {
    public final p52 a;
    public final ci50<androidx.compose.ui.node.a> b = new ci50<>(new androidx.compose.ui.node.a[16]);
    public final ci50<x630<?>> c = new ci50<>(new x630[16]);
    public final ci50<LayoutNode> d = new ci50<>(new LayoutNode[16]);
    public final ci50<x630<?>> e = new ci50<>(new x630[16]);
    public boolean f;

    /* compiled from: ModifierLocalManager.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            z630 z630Var = z630.this;
            ci50<x630<?>> ci50Var = z630Var.c;
            ci50<androidx.compose.ui.node.a> ci50Var2 = z630Var.b;
            ci50<x630<?>> ci50Var3 = z630Var.e;
            z630Var.f = false;
            HashSet hashSet = new HashSet();
            ci50<LayoutNode> ci50Var4 = z630Var.d;
            LayoutNode[] layoutNodeArr = ci50Var4.b;
            int i = ci50Var4.d;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = layoutNodeArr[i2];
                x630<?> x630Var = ci50Var3.b[i2];
                q630.c cVar = layoutNode.G.f;
                if (cVar.o) {
                    z630.b(cVar, x630Var, hashSet);
                }
            }
            ci50Var4.g();
            ci50Var3.g();
            androidx.compose.ui.node.a[] aVarArr = ci50Var2.b;
            int i3 = ci50Var2.d;
            for (int i4 = 0; i4 < i3; i4++) {
                androidx.compose.ui.node.a aVar = aVarArr[i4];
                x630<?> x630Var2 = ci50Var.b[i4];
                if (aVar.o) {
                    z630.b(aVar, x630Var2, hashSet);
                }
            }
            ci50Var2.g();
            ci50Var.g();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.compose.ui.node.a) it.next()).k2();
            }
            return s3q0.a;
        }
    }

    public z630(p52 p52Var) {
        this.a = p52Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(q630.c cVar, x630 x630Var, HashSet hashSet) {
        if (!cVar.b.o) {
            uzw.b("visitSubtreeIf called on an unattached node");
        }
        ci50 ci50Var = new ci50(new q630.c[16]);
        q630.c cVar2 = cVar.b;
        q630.c cVar3 = cVar2.g;
        if (cVar3 == null) {
            itl.a(ci50Var, cVar2);
        } else {
            ci50Var.b(cVar3);
        }
        while (true) {
            int i = ci50Var.d;
            if (i == 0) {
                return;
            }
            q630.c cVar4 = (q630.c) ci50Var.k(i - 1);
            if ((cVar4.e & 32) != 0) {
                for (q630.c cVar5 = cVar4; cVar5 != null && cVar5.o; cVar5 = cVar5.g) {
                    if ((cVar5.d & 32) != 0) {
                        ytl ytlVar = cVar5;
                        ?? r5 = 0;
                        while (ytlVar != 0) {
                            if (ytlVar instanceof a730) {
                                a730 a730Var = (a730) ytlVar;
                                if (a730Var instanceof androidx.compose.ui.node.a) {
                                    androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) a730Var;
                                    if ((aVar.p instanceof y630) && aVar.s.contains(x630Var)) {
                                        hashSet.add(a730Var);
                                    }
                                }
                                if (a730Var.U0().K(x630Var)) {
                                    break;
                                }
                            } else if ((ytlVar.d & 32) != 0 && (ytlVar instanceof ytl)) {
                                q630.c cVar6 = ytlVar.q;
                                int i2 = 0;
                                ytlVar = ytlVar;
                                r5 = r5;
                                while (cVar6 != null) {
                                    if ((cVar6.d & 32) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            ytlVar = cVar6;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new ci50(new q630.c[16]);
                                            }
                                            if (ytlVar != 0) {
                                                r5.b(ytlVar);
                                                ytlVar = 0;
                                            }
                                            r5.b(cVar6);
                                        }
                                    }
                                    cVar6 = cVar6.g;
                                    ytlVar = ytlVar;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            ytlVar = itl.b(r5);
                        }
                    }
                }
            }
            itl.a(ci50Var, cVar4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.q(new a());
    }
}
