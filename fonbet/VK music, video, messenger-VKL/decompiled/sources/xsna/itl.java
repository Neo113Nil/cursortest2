package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.q630;

/* compiled from: DelegatableNode.kt */
/* loaded from: classes11.dex */
public final class itl {
    public static final void a(ci50 ci50Var, q630.c cVar) {
        ci50<LayoutNode> L = f(cVar).L();
        int i = L.d - 1;
        LayoutNode[] layoutNodeArr = L.b;
        if (i < layoutNodeArr.length) {
            while (i >= 0) {
                ci50Var.b(layoutNodeArr[i].G.f);
                i--;
            }
        }
    }

    public static final q630.c b(ci50 ci50Var) {
        int i;
        if (ci50Var == null || (i = ci50Var.d) == 0) {
            return null;
        }
        return (q630.c) ci50Var.k(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final noy c(q630.c cVar) {
        if ((cVar.d & 2) != 0) {
            if (cVar instanceof noy) {
                return (noy) cVar;
            }
            if (cVar instanceof ytl) {
                q630.c cVar2 = ((ytl) cVar).q;
                while (cVar2 != 0) {
                    if (cVar2 instanceof noy) {
                        return (noy) cVar2;
                    }
                    cVar2 = (!(cVar2 instanceof ytl) || (cVar2.d & 2) == 0) ? cVar2.g : ((ytl) cVar2).q;
                }
            }
        }
        return null;
    }

    public static final androidx.compose.ui.node.o d(htl htlVar, int i) {
        androidx.compose.ui.node.o oVar = htlVar.z().i;
        return (oVar.D1() == htlVar && a570.g(i)) ? oVar.t : oVar;
    }

    public static final androidx.compose.ui.node.o e(htl htlVar) {
        if (!htlVar.z().o) {
            uzw.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        androidx.compose.ui.node.o d = d(htlVar, 2);
        d.getClass();
        if (!d.D1().o) {
            uzw.b("LayoutCoordinates is not attached.");
        }
        return d;
    }

    public static final LayoutNode f(htl htlVar) {
        androidx.compose.ui.node.o oVar = htlVar.z().i;
        if (oVar != null) {
            return oVar.q;
        }
        throw pm0.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final androidx.compose.ui.node.p g(htl htlVar) {
        androidx.compose.ui.node.p pVar = f(htlVar).o;
        if (pVar != null) {
            return pVar;
        }
        throw pm0.f("This node does not have an owner.");
    }
}
