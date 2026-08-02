package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a7u0;
import defpackage.ce60;
import defpackage.e530;
import defpackage.fud;
import defpackage.fwi;
import defpackage.hud;
import defpackage.lqh;
import defpackage.m390;
import defpackage.ohd;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.t300;
import defpackage.uh6;
import defpackage.wls;
import defpackage.wz40;
import defpackage.xp31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lohd;", "Lhud;", "it", "Lzy11;", "invoke", "(Lohd;Lhud;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetResolvedCompositionLocals$1 extends Lambda implements wls {
    public static final ComposeUiNode$Companion$SetResolvedCompositionLocals$1 w = new ComposeUiNode$Companion$SetResolvedCompositionLocals$1(2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [e530] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [wz40] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        hud hudVar = (hud) obj2;
        LayoutNode layoutNode = (LayoutNode) ((ohd) obj);
        layoutNode.U = hudVar;
        t300 t300Var = layoutNode.a0;
        a7u0 a7u0Var = androidx.compose.ui.platform.j.h;
        r1b0 r1b0Var = (r1b0) hudVar;
        r1b0Var.getClass();
        layoutNode.X((fwi) uh6.L(r1b0Var, a7u0Var));
        r1b0 r1b0Var2 = (r1b0) hudVar;
        LayoutDirection layoutDirection = (LayoutDirection) uh6.L(r1b0Var2, androidx.compose.ui.platform.j.n);
        if (layoutNode.S != layoutDirection) {
            layoutNode.S = layoutDirection;
            layoutNode.C();
            LayoutNode s = layoutNode.s();
            if (s != null) {
                s.A();
            } else {
                m390 m390Var = layoutNode.G;
                if (m390Var != null) {
                    m390Var.invalidateRootLayer();
                }
            }
            layoutNode.B();
            for (e530 e530Var = (e530) t300Var.g; e530Var != null; e530Var = e530Var.getChild$ui()) {
                e530Var.onLayoutDirectionChange();
            }
        }
        layoutNode.c0((xp31) uh6.L(r1b0Var2, androidx.compose.ui.platform.j.t));
        if ((((e530) t300Var.g).getAggregateChildKindSet$ui() & 32768) != 0) {
            for (e530 e530Var2 = (e530) t300Var.g; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                if ((e530Var2.getKindSet$ui() & 32768) != 0) {
                    lqh lqhVar = e530Var2;
                    ?? r1 = 0;
                    while (lqhVar != 0) {
                        if (lqhVar instanceof fud) {
                            e530 node = ((fud) lqhVar).getNode();
                            if (node.isAttached()) {
                                ce60.d(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                            }
                        } else if ((lqhVar.getKindSet$ui() & 32768) != 0 && (lqhVar instanceof lqh)) {
                            e530 e530Var3 = lqhVar.b;
                            int i = 0;
                            lqhVar = lqhVar;
                            r1 = r1;
                            while (e530Var3 != null) {
                                if ((e530Var3.getKindSet$ui() & 32768) != 0) {
                                    i++;
                                    r1 = r1;
                                    if (i == 1) {
                                        lqhVar = e530Var3;
                                    } else {
                                        if (r1 == 0) {
                                            r1 = new wz40(new e530[16]);
                                        }
                                        if (lqhVar != 0) {
                                            r1.b(lqhVar);
                                            lqhVar = 0;
                                        }
                                        r1.b(e530Var3);
                                    }
                                }
                                e530Var3 = e530Var3.getChild$ui();
                                lqhVar = lqhVar;
                                r1 = r1;
                            }
                            if (i == 1) {
                            }
                        }
                        lqhVar = qje.c(r1);
                    }
                }
                if ((e530Var2.getAggregateChildKindSet$ui() & 32768) == 0) {
                    break;
                }
            }
        }
        return zy11.a;
    }
}
