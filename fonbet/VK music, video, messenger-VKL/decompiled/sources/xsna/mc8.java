package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.q630;

/* compiled from: BringIntoViewModifierNode.kt */
/* loaded from: classes11.dex */
public final class mc8 {
    public static final Object a(htl htlVar, gzs gzsVar, ContinuationImpl continuationImpl) {
        Object obj;
        u470 u470Var;
        if (!htlVar.z().o) {
            return s3q0.a;
        }
        if (!htlVar.z().o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar = htlVar.z().f;
        LayoutNode f = itl.f(htlVar);
        loop0: while (true) {
            obj = null;
            if (f == null) {
                break;
            }
            if ((f.G.f.e & 524288) != 0) {
                while (cVar != null) {
                    if ((cVar.d & 524288) != 0) {
                        q630.c cVar2 = cVar;
                        ci50 ci50Var = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof kc8) {
                                obj = cVar2;
                                break loop0;
                            }
                            if ((cVar2.d & 524288) != 0 && (cVar2 instanceof ytl)) {
                                int i = 0;
                                for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                    if ((cVar3.d & 524288) != 0) {
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
                    cVar = cVar.f;
                }
            }
            f = f.I();
            cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
        }
        kc8 kc8Var = (kc8) obj;
        if (kc8Var == null) {
            return s3q0.a;
        }
        androidx.compose.ui.node.o e = itl.e(htlVar);
        Object S = kc8Var.S(e, new lc8(gzsVar, e), continuationImpl);
        return S == CoroutineSingletons.COROUTINE_SUSPENDED ? S : s3q0.a;
    }
}
