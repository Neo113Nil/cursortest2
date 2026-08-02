package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f070 {
    public final wz40 a = new wz40(new LayoutNode[16]);
    public LayoutNode[] b;

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
    public static void b(LayoutNode layoutNode) {
        if (layoutNode.k0 > 0) {
            if (layoutNode.b0.d == LayoutNode.LayoutState.Idle && !layoutNode.n() && !layoutNode.o() && !layoutNode.l0 && layoutNode.G()) {
                t300 t300Var = layoutNode.a0;
                if ((((e530) t300Var.g).getAggregateChildKindSet$ui() & 256) != 0) {
                    for (e530 e530Var = (e530) t300Var.g; e530Var != null; e530Var = e530Var.getChild$ui()) {
                        if ((e530Var.getKindSet$ui() & 256) != 0) {
                            lqh lqhVar = e530Var;
                            ?? r5 = 0;
                            while (lqhVar != 0) {
                                if (lqhVar instanceof ejt) {
                                    ejt ejtVar = (ejt) lqhVar;
                                    ejtVar.g(qje.N(ejtVar, 256));
                                } else if ((lqhVar.getKindSet$ui() & 256) != 0 && (lqhVar instanceof lqh)) {
                                    e530 e530Var2 = lqhVar.b;
                                    int i = 0;
                                    lqhVar = lqhVar;
                                    r5 = r5;
                                    while (e530Var2 != null) {
                                        if ((e530Var2.getKindSet$ui() & 256) != 0) {
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
                        if ((e530Var.getAggregateChildKindSet$ui() & 256) == 0) {
                            break;
                        }
                    }
                }
            }
            layoutNode.j0 = false;
            wz40 x = layoutNode.x();
            Object[] objArr = x.a;
            int i2 = x.c;
            for (int i3 = 0; i3 < i2; i3++) {
                b((LayoutNode) objArr[i3]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r3 < r0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        LayoutNode[] layoutNodeArr;
        y0u y0uVar = y0u.c;
        wz40 wz40Var = this.a;
        Arrays.sort(wz40Var.a, 0, wz40Var.c, y0uVar);
        int i = wz40Var.c;
        LayoutNode[] layoutNodeArr2 = this.b;
        if (layoutNodeArr2 != null) {
            int length = layoutNodeArr2.length;
            layoutNodeArr = layoutNodeArr2;
        }
        layoutNodeArr = new LayoutNode[Math.max(16, i)];
        this.b = null;
        for (int i2 = 0; i2 < i; i2++) {
            layoutNodeArr[i2] = wz40Var.a[i2];
        }
        wz40Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.b = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.j0) {
                b(layoutNode);
            }
            layoutNodeArr[i] = 0;
        }
    }
}
