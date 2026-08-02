package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.q630;

/* compiled from: SemanticsNode.kt */
/* loaded from: classes11.dex */
public final class kgi0 {
    public static final igi0 a(LayoutNode layoutNode, boolean z) {
        q630.c cVar = layoutNode.G.f;
        Object obj = null;
        if ((cVar.e & 8) != 0) {
            loop0: while (true) {
                if (cVar == null) {
                    break;
                }
                if ((cVar.d & 8) != 0) {
                    q630.c cVar2 = cVar;
                    ci50 ci50Var = null;
                    while (cVar2 != null) {
                        if (cVar2 instanceof fgi0) {
                            obj = cVar2;
                            break loop0;
                        }
                        if ((cVar2.d & 8) != 0 && (cVar2 instanceof ytl)) {
                            int i = 0;
                            for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                if ((cVar3.d & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVar2 = cVar3;
                                    } else {
                                        if (ci50Var == null) {
                                            ci50Var = new ci50(new q630.c[16]);
                                        }
                                        if (cVar2 != null) {
                                            ci50Var.b(cVar2);
                                            cVar2 = null;
                                        }
                                        ci50Var.b(cVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVar2 = itl.b(ci50Var);
                    }
                }
                if ((cVar.e & 8) == 0) {
                    break;
                }
                cVar = cVar.g;
            }
        }
        q630.c z2 = ((fgi0) obj).z();
        xfi0 d = layoutNode.d();
        if (d == null) {
            d = new xfi0();
        }
        return new igi0(z2, z, layoutNode, d);
    }
}
