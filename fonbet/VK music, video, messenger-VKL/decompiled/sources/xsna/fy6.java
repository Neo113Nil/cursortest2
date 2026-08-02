package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.dy6;
import xsna.q630;

/* compiled from: BeyondBoundsLayout.kt */
/* loaded from: classes11.dex */
public final class fy6 {
    public static final <T> T a(dxr dxrVar, int i, izs<? super dy6.a, ? extends T> izsVar) {
        int i2;
        q630.c cVar;
        dy6 m2;
        u470 u470Var;
        if (!dxrVar.b.o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar2 = dxrVar.b.f;
        LayoutNode f = itl.f(dxrVar);
        loop0: while (true) {
            i2 = 1;
            if (f == null) {
                cVar = null;
                break;
            }
            if ((f.G.f.e & 1024) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.d & 1024) != 0) {
                        cVar = cVar2;
                        ci50 ci50Var = null;
                        while (cVar != null) {
                            if (cVar instanceof dxr) {
                                break loop0;
                            }
                            if ((cVar.d & 1024) != 0 && (cVar instanceof ytl)) {
                                int i3 = 0;
                                for (q630.c cVar3 = ((ytl) cVar).q; cVar3 != null; cVar3 = cVar3.g) {
                                    if ((cVar3.d & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
                                }
                            }
                            cVar = itl.b(ci50Var);
                        }
                    }
                    cVar2 = cVar2.f;
                }
            }
            f = f.I();
            cVar2 = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
        }
        dxr dxrVar2 = (dxr) cVar;
        if ((dxrVar2 != null && epx.f(dxrVar2.m2(), dxrVar.m2())) || (m2 = dxrVar.m2()) == null) {
            return null;
        }
        int i4 = 5;
        if (i != 5) {
            i4 = 6;
            if (i != 6) {
                i4 = 3;
                if (i != 3) {
                    i4 = 4;
                    if (i != 4) {
                        i4 = 2;
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            return (T) m2.H0(i2, izsVar);
                        }
                    }
                }
            }
        }
        i2 = i4;
        return (T) m2.H0(i2, izsVar);
    }
}
