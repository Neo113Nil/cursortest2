package xsna;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;

/* compiled from: FocusTraversal.kt */
/* loaded from: classes11.dex */
public final class ixr {

    /* compiled from: FocusTraversal.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final dxr a(dxr dxrVar) {
        dxr b = itl.g(dxrVar).getFocusOwner().b();
        if (b == null || !b.o) {
            return null;
        }
        return b;
    }

    public static final zhf0 b(dxr dxrVar) {
        androidx.compose.ui.node.o oVar;
        if (dxrVar.o && (oVar = dxrVar.i) != null) {
            tny p = jgz.p(oVar);
            if (!p.e()) {
                p = null;
            }
            if (p != null) {
                return dxrVar.l2(p);
            }
        }
        return zhf0.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0027, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dxr c(dxr dxrVar) {
        boolean z = dxrVar.b.o;
        if (z) {
            if (!z) {
                uzw.b("visitChildren called on an unattached node");
            }
            ci50 ci50Var = new ci50(new q630.c[16]);
            q630.c cVar = dxrVar.b;
            q630.c cVar2 = cVar.g;
            if (cVar2 == null) {
                itl.a(ci50Var, cVar);
            } else {
                ci50Var.b(cVar2);
            }
            loop0: while (true) {
                int i = ci50Var.d;
                if (i == 0) {
                    break;
                }
                q630.c cVar3 = (q630.c) ci50Var.k(i - 1);
                if ((cVar3.e & 1024) == 0) {
                    itl.a(ci50Var, cVar3);
                } else {
                    while (true) {
                        if (cVar3 == null) {
                            break;
                        }
                        if ((cVar3.d & 1024) != 0) {
                            ci50 ci50Var2 = null;
                            while (cVar3 != null) {
                                if (cVar3 instanceof dxr) {
                                    dxr dxrVar2 = (dxr) cVar3;
                                    if (dxrVar2.b.o) {
                                        int i2 = a.$EnumSwitchMapping$1[dxrVar2.k0().ordinal()];
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            break loop0;
                                        }
                                        if (i2 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                } else if ((cVar3.d & 1024) != 0 && (cVar3 instanceof ytl)) {
                                    int i3 = 0;
                                    for (q630.c cVar4 = ((ytl) cVar3).q; cVar4 != null; cVar4 = cVar4.g) {
                                        if ((cVar4.d & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                cVar3 = cVar4;
                                            } else {
                                                if (ci50Var2 == null) {
                                                    ci50Var2 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar3 != null) {
                                                    ci50Var2.b(cVar3);
                                                    cVar3 = null;
                                                }
                                                ci50Var2.b(cVar4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                cVar3 = itl.b(ci50Var2);
                            }
                        } else {
                            cVar3 = cVar3.g;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean d(dxr dxrVar) {
        LayoutNode layoutNode;
        androidx.compose.ui.node.o oVar;
        LayoutNode layoutNode2;
        androidx.compose.ui.node.o oVar2 = dxrVar.i;
        return (oVar2 == null || (layoutNode = oVar2.q) == null || !layoutNode.g() || (oVar = dxrVar.i) == null || (layoutNode2 = oVar.q) == null || !layoutNode2.e()) ? false : true;
    }
}
