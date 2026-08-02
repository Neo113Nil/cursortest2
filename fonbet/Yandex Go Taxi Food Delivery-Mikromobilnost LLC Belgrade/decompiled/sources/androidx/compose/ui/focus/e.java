package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import androidx.compose.ui.node.u;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.d6w;
import defpackage.dac;
import defpackage.e530;
import defpackage.gwk0;
import defpackage.ixv;
import defpackage.jl40;
import defpackage.jo5;
import defpackage.lqh;
import defpackage.m6b1;
import defpackage.n;
import defpackage.ny61;
import defpackage.ok11;
import defpackage.pvr;
import defpackage.qje;
import defpackage.qvr;
import defpackage.rvr;
import defpackage.rzx;
import defpackage.sls;
import defpackage.sv7;
import defpackage.t300;
import defpackage.tls;
import defpackage.v7x0;
import defpackage.w511;
import defpackage.wz40;
import defpackage.xtr;
import defpackage.y6i0;
import defpackage.yur;
import defpackage.z170;
import defpackage.zii0;
import defpackage.zy11;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c7 A[EDGE_INSN: B:151:0x01c7->B:132:0x01c7 BREAK  A[LOOP:5: B:91:0x014c->B:146:0x014c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean A(d dVar, d dVar2, int i, tls tlsVar) {
        e530 e530Var;
        LayoutNode P;
        t300 t300Var;
        if (dVar.J0() != FocusStateImpl.ActiveParent) {
            ny61.r("This function should only be used within a parent that has focus.");
            return false;
        }
        d[] dVarArr = new d[16];
        if (!dVar.getNode().isAttached()) {
            ixv.b("visitChildren called on an unattached node");
        }
        wz40 wz40Var = new wz40(new e530[16]);
        e530 child$ui = dVar.getNode().getChild$ui();
        if (child$ui == null) {
            qje.b(wz40Var, dVar.getNode());
        } else {
            wz40Var.b(child$ui);
        }
        int i2 = 0;
        while (true) {
            int i3 = wz40Var.c;
            e530Var = null;
            if (i3 == 0) {
                break;
            }
            e530 e530Var2 = (e530) wz40Var.k(i3 - 1);
            if ((e530Var2.getAggregateChildKindSet$ui() & 1024) == 0) {
                qje.b(wz40Var, e530Var2);
            } else {
                while (true) {
                    if (e530Var2 == null) {
                        break;
                    }
                    if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                        wz40 wz40Var2 = null;
                        while (e530Var2 != null) {
                            if (e530Var2 instanceof d) {
                                d dVar3 = (d) e530Var2;
                                int i4 = i2 + 1;
                                if (dVarArr.length < i4) {
                                    int length = dVarArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(dVarArr, 0, r11, 0, length);
                                    dVarArr = r11;
                                }
                                dVarArr[i2] = dVar3;
                                i2 = i4;
                            } else if ((e530Var2.getKindSet$ui() & 1024) != 0 && (e530Var2 instanceof lqh)) {
                                int i5 = 0;
                                for (e530 e530Var3 = ((lqh) e530Var2).b; e530Var3 != null; e530Var3 = e530Var3.getChild$ui()) {
                                    if ((e530Var3.getKindSet$ui() & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            e530Var2 = e530Var3;
                                        } else {
                                            if (wz40Var2 == null) {
                                                wz40Var2 = new wz40(new e530[16]);
                                            }
                                            if (e530Var2 != null) {
                                                wz40Var2.b(e530Var2);
                                                e530Var2 = null;
                                            }
                                            wz40Var2.b(e530Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            e530Var2 = qje.c(wz40Var2);
                        }
                    } else {
                        e530Var2 = e530Var2.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(dVarArr, 0, i2, rvr.b);
        if (i != 1) {
            if (i != 2) {
                ny61.r("This function should only be used for 1-D focus search");
                return false;
            }
            d6w n = y6i0.n(0, i2);
            int i6 = n.a;
            int i7 = n.b;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        d dVar4 = dVarArr[i7];
                        if (s(dVar4) && a(dVar4, tlsVar)) {
                            break;
                        }
                    }
                    if (jl40.l(dVarArr[i7], dVar2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
                return true;
            }
            if (i != 1) {
                if (!dVar.getNode().isAttached()) {
                }
                e530 parent$ui = dVar.getNode().getParent$ui();
                P = qje.P(dVar);
                loop5: while (true) {
                    if (P == null) {
                    }
                }
                if (e530Var != null) {
                }
            }
            return false;
        }
        d6w n2 = y6i0.n(0, i2);
        int i8 = n2.a;
        int i9 = n2.b;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    d dVar5 = dVarArr[i8];
                    if (s(dVar5) && l(dVar5, tlsVar)) {
                        break;
                    }
                }
                if (jl40.l(dVarArr[i8], dVar2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && dVar.G0().a) {
            if (!dVar.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 parent$ui2 = dVar.getNode().getParent$ui();
            P = qje.P(dVar);
            loop5: while (true) {
                if (P == null) {
                    break;
                }
                if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui2 != null) {
                        if ((parent$ui2.getKindSet$ui() & 1024) != 0) {
                            e530 e530Var4 = parent$ui2;
                            wz40 wz40Var3 = null;
                            while (e530Var4 != null) {
                                if (e530Var4 instanceof d) {
                                    e530Var = e530Var4;
                                    break loop5;
                                }
                                if ((e530Var4.getKindSet$ui() & 1024) != 0 && (e530Var4 instanceof lqh)) {
                                    int i10 = 0;
                                    for (e530 e530Var5 = ((lqh) e530Var4).b; e530Var5 != null; e530Var5 = e530Var5.getChild$ui()) {
                                        if ((e530Var5.getKindSet$ui() & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                e530Var4 = e530Var5;
                                            } else {
                                                if (wz40Var3 == null) {
                                                    wz40Var3 = new wz40(new e530[16]);
                                                }
                                                if (e530Var4 != null) {
                                                    wz40Var3.b(e530Var4);
                                                    e530Var4 = null;
                                                }
                                                wz40Var3.b(e530Var5);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                e530Var4 = qje.c(wz40Var3);
                            }
                        }
                        parent$ui2 = parent$ui2.getParent$ui();
                    }
                }
                P = P.s();
                parent$ui2 = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
            }
            if (e530Var != null) {
                return ((Boolean) tlsVar.invoke(dVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Boolean B(int i, tls tlsVar, zii0 zii0Var, d dVar) {
        FocusStateImpl J0 = dVar.J0();
        int[] iArr = ok11.a;
        int i2 = iArr[J0.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(i(dVar, i, tlsVar));
            }
            if (i2 == 4) {
                return dVar.G0().a ? (Boolean) ((FocusOwnerImpl$focusSearch$1) tlsVar).invoke(dVar) : zii0Var == null ? Boolean.valueOf(i(dVar, i, tlsVar)) : Boolean.valueOf(z(i, tlsVar, zii0Var, dVar));
            }
            w511.b();
            return null;
        }
        d o = o(dVar);
        if (o == null) {
            ny61.r("ActiveParent must have a focusedChild");
            return null;
        }
        int i3 = iArr[o.J0().ordinal()];
        if (i3 != 1) {
            if (i3 == 2 || i3 == 3) {
                if (zii0Var == null) {
                    zii0Var = j(o);
                }
                return Boolean.valueOf(m(i, tlsVar, zii0Var, dVar));
            }
            if (i3 != 4) {
                w511.b();
                return null;
            }
            ny61.r("ActiveParent must have a focusedChild");
            return null;
        }
        Boolean B = B(i, tlsVar, zii0Var, o);
        if (!jl40.l(B, Boolean.FALSE)) {
            return B;
        }
        if (zii0Var == null) {
            if (o.J0() != FocusStateImpl.ActiveParent) {
                ny61.r("Searching for active node in inactive hierarchy");
                return null;
            }
            d g = g(o);
            if (g == null) {
                ny61.r("ActiveParent must have a focusedChild");
                return null;
            }
            zii0Var = j(g);
        }
        return Boolean.valueOf(m(i, tlsVar, zii0Var, dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(d dVar, tls tlsVar) {
        FocusStateImpl J0 = dVar.J0();
        int[] iArr = z170.a;
        int i = iArr[J0.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return x(dVar, tlsVar);
            }
            if (i != 4) {
                w511.b();
                return false;
            }
            if (!x(dVar, tlsVar)) {
                if (!(dVar.G0().a ? ((Boolean) tlsVar.invoke(dVar)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        d o = o(dVar);
        if (o == null) {
            ny61.r("ActiveParent must have a focusedChild");
            return false;
        }
        int i2 = iArr[o.J0().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return n(dVar, o, 2, tlsVar);
            }
            if (i2 != 4) {
                w511.b();
                return false;
            }
            ny61.r("ActiveParent must have a focusedChild");
            return false;
        }
        if (a(o, tlsVar) || n(dVar, o, 2, tlsVar) || (o.G0().a && ((Boolean) tlsVar.invoke(o)).booleanValue())) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.ny61.r("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.ny61.r("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(zii0 zii0Var, zii0 zii0Var2, zii0 zii0Var3, int i) {
        boolean c = c(i, zii0Var3, zii0Var);
        float f = zii0Var3.b;
        float f2 = zii0Var3.d;
        float f3 = zii0Var3.a;
        float f4 = zii0Var3.c;
        float f5 = zii0Var.d;
        float f6 = zii0Var.b;
        float f7 = zii0Var.c;
        float f8 = zii0Var.a;
        if (!c && c(i, zii0Var2, zii0Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            ny61.r("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(int i, zii0 zii0Var, zii0 zii0Var2) {
        if (i == 3 || i == 4) {
            return zii0Var.d > zii0Var2.b && zii0Var.b < zii0Var2.d;
        }
        if (i == 5 || i == 6) {
            return zii0Var.c > zii0Var2.a && zii0Var.a < zii0Var2.c;
        }
        ny61.r("This function should only be used for 2-D focus search");
        return false;
    }

    public static final boolean d(d dVar, boolean z) {
        int i = pvr.a[dVar.J0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return z;
            }
            if (i == 3) {
                d o = o(dVar);
                if (!(o != null ? d(o, z) : true)) {
                    return false;
                }
                dVar.F0(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                return true;
            }
            if (i != 4) {
                w511.b();
                return false;
            }
        }
        return true;
    }

    public static final void e(d dVar, wz40 wz40Var) {
        if (!dVar.getNode().isAttached()) {
            ixv.b("visitChildren called on an unattached node");
        }
        wz40 wz40Var2 = new wz40(new e530[16]);
        e530 child$ui = dVar.getNode().getChild$ui();
        if (child$ui == null) {
            qje.b(wz40Var2, dVar.getNode());
        } else {
            wz40Var2.b(child$ui);
        }
        while (true) {
            int i = wz40Var2.c;
            if (i == 0) {
                return;
            }
            e530 e530Var = (e530) wz40Var2.k(i - 1);
            if ((e530Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                qje.b(wz40Var2, e530Var);
            } else {
                while (true) {
                    if (e530Var == null) {
                        break;
                    }
                    if ((e530Var.getKindSet$ui() & 1024) != 0) {
                        wz40 wz40Var3 = null;
                        while (e530Var != null) {
                            if (e530Var instanceof d) {
                                d dVar2 = (d) e530Var;
                                if (dVar2.isAttached() && !qje.P(dVar2).l0) {
                                    if (dVar2.G0().a) {
                                        wz40Var.b(dVar2);
                                    } else {
                                        e(dVar2, wz40Var);
                                    }
                                }
                            } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                int i2 = 0;
                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            e530Var = e530Var2;
                                        } else {
                                            if (wz40Var3 == null) {
                                                wz40Var3 = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var3.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var3.b(e530Var2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var3);
                        }
                    } else {
                        e530Var = e530Var.getChild$ui();
                    }
                }
            }
        }
    }

    public static final yur f(d dVar, int i, LayoutDirection layoutDirection) {
        yur yurVar;
        FocusPropertiesImpl G0 = dVar.G0();
        yur yurVar2 = G0.h;
        yur yurVar3 = G0.i;
        if (i == 1) {
            return G0.b;
        }
        if (i == 2) {
            return G0.c;
        }
        if (i == 5) {
            return G0.d;
        }
        if (i == 6) {
            return G0.e;
        }
        if (i == 3) {
            int i2 = qvr.a[layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                yurVar2 = yurVar3;
            }
            yurVar = yurVar2 != yur.b ? yurVar2 : null;
            return yurVar == null ? G0.f : yurVar;
        }
        if (i == 4) {
            int i3 = qvr.a[layoutDirection.ordinal()];
            if (i3 == 1) {
                yurVar2 = yurVar3;
            } else if (i3 != 2) {
                w511.b();
                return null;
            }
            yurVar = yurVar2 != yur.b ? yurVar2 : null;
            return yurVar == null ? G0.g : yurVar;
        }
        if (i != 7 && i != 8) {
            ny61.r("invalid FocusDirection");
            return null;
        }
        sv7 sv7Var = new sv7(i);
        c cVar = (c) qje.Q(dVar).getFocusOwner();
        d i4 = cVar.i();
        if (i == 7) {
            G0.j.invoke(sv7Var);
        } else {
            G0.k.invoke(sv7Var);
        }
        return sv7Var.b ? yur.c : i4 != cVar.i() ? yur.d : yur.b;
    }

    public static final d g(d dVar) {
        d i = ((c) qje.Q(dVar).getFocusOwner()).i();
        if (i == null || !i.isAttached()) {
            return null;
        }
        return i;
    }

    public static final d h(wz40 wz40Var, zii0 zii0Var, int i) {
        zii0 i2;
        d dVar = null;
        if (i == 3) {
            i2 = zii0Var.i((zii0Var.c - zii0Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            i2 = zii0Var.i(-((zii0Var.c - zii0Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            i2 = zii0Var.i(0.0f, (zii0Var.d - zii0Var.b) + 1.0f);
        } else {
            if (i != 6) {
                ny61.r("This function should only be used for 2-D focus search");
                return null;
            }
            i2 = zii0Var.i(0.0f, -((zii0Var.d - zii0Var.b) + 1.0f));
        }
        Object[] objArr = wz40Var.a;
        int i3 = wz40Var.c;
        for (int i4 = 0; i4 < i3; i4++) {
            d dVar2 = (d) objArr[i4];
            if (s(dVar2)) {
                zii0 j = j(dVar2);
                if (p(j, i2, zii0Var, i)) {
                    dVar = dVar2;
                    i2 = j;
                }
            }
        }
        return dVar;
    }

    public static final boolean i(d dVar, int i, tls tlsVar) {
        zii0 zii0Var;
        wz40 wz40Var = new wz40(new d[16]);
        e(dVar, wz40Var);
        int i2 = wz40Var.c;
        if (i2 <= 1) {
            d dVar2 = (d) (i2 == 0 ? null : wz40Var.a[0]);
            if (dVar2 != null) {
                return ((Boolean) tlsVar.invoke(dVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                zii0 j = j(dVar);
                float f = j.a;
                float f2 = j.b;
                zii0Var = new zii0(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    ny61.r("This function should only be used for 2-D focus search");
                    return false;
                }
                zii0 j2 = j(dVar);
                float f3 = j2.c;
                float f4 = j2.d;
                zii0Var = new zii0(f3, f4, f3, f4);
            }
            d h = h(wz40Var, zii0Var, i);
            if (h != null) {
                return ((Boolean) tlsVar.invoke(h)).booleanValue();
            }
        }
        return false;
    }

    public static final zii0 j(d dVar) {
        s coordinator$ui;
        boolean isAttached = dVar.isAttached();
        zii0 zii0Var = zii0.e;
        if (isAttached && (coordinator$ui = dVar.getCoordinator$ui()) != null) {
            rzx o = gwk0.o(coordinator$ui);
            if (!o.d()) {
                o = null;
            }
            if (o != null) {
                return dVar.H0(o);
            }
        }
        return zii0Var;
    }

    public static final Boolean k(d dVar, int i, LayoutDirection layoutDirection, zii0 zii0Var, tls tlsVar) {
        boolean a;
        t300 t300Var;
        d dVar2 = null;
        if (i == 1 || i == 2) {
            if (i == 1) {
                a = l(dVar, tlsVar);
            } else {
                if (i != 2) {
                    ny61.r("This function should only be used for 1-D focus search");
                    return null;
                }
                a = a(dVar, tlsVar);
            }
            return Boolean.valueOf(a);
        }
        int i2 = 3;
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return B(i, tlsVar, zii0Var, dVar);
        }
        if (i == 7) {
            int i3 = qvr.a[layoutDirection.ordinal()];
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 != 2) {
                w511.b();
                return null;
            }
            d g = g(dVar);
            if (g != null) {
                return B(i2, tlsVar, zii0Var, g);
            }
            return null;
        }
        if (i != 8) {
            dac.f(xtr.c(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        d g2 = g(dVar);
        boolean z = false;
        if (g2 != null) {
            if (!g2.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 parent$ui = g2.getNode().getParent$ui();
            LayoutNode P = qje.P(g2);
            loop0: while (true) {
                if (P == null) {
                    break;
                }
                if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                            e530 e530Var = parent$ui;
                            wz40 wz40Var = null;
                            while (e530Var != null) {
                                if (e530Var instanceof d) {
                                    d dVar3 = (d) e530Var;
                                    if (dVar3.G0().a) {
                                        dVar2 = dVar3;
                                        break loop0;
                                    }
                                } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                    int i4 = 0;
                                    for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                        if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                e530Var = e530Var2;
                                            } else {
                                                if (wz40Var == null) {
                                                    wz40Var = new wz40(new e530[16]);
                                                }
                                                if (e530Var != null) {
                                                    wz40Var.b(e530Var);
                                                    e530Var = null;
                                                }
                                                wz40Var.b(e530Var2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                e530Var = qje.c(wz40Var);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                P = P.s();
                parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
            }
        }
        if (dVar2 != null && dVar2 != dVar) {
            z = ((Boolean) ((FocusOwnerImpl$focusSearch$1) tlsVar).invoke(dVar2)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public static final boolean l(d dVar, tls tlsVar) {
        int i = z170.a[dVar.J0().ordinal()];
        if (i == 1) {
            d o = o(dVar);
            if (o != null) {
                return l(o, tlsVar) || n(dVar, o, 1, tlsVar);
            }
            ny61.r("ActiveParent must have a focusedChild");
            return false;
        }
        if (i == 2 || i == 3) {
            return y(dVar, tlsVar);
        }
        if (i == 4) {
            return dVar.G0().a ? ((Boolean) tlsVar.invoke(dVar)).booleanValue() : y(dVar, tlsVar);
        }
        w511.b();
        return false;
    }

    public static final boolean m(final int i, final tls tlsVar, final zii0 zii0Var, final d dVar) {
        if (z(i, tlsVar, zii0Var, dVar)) {
            return true;
        }
        final d i2 = ((c) qje.Q(dVar).getFocusOwner()).i();
        Boolean bool = (Boolean) m6b1.b(dVar, i, new tls() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                jo5 jo5Var = (jo5) obj;
                if (d.this != ((c) qje.Q(dVar).getFocusOwner()).i()) {
                    return Boolean.TRUE;
                }
                d dVar2 = dVar;
                boolean z = e.z(i, tlsVar, zii0Var, dVar2);
                Boolean valueOf = Boolean.valueOf(z);
                if (z || !jo5Var.a()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean n(final d dVar, final d dVar2, final int i, final tls tlsVar) {
        if (A(dVar, dVar2, i, tlsVar)) {
            return true;
        }
        final d i2 = ((c) qje.Q(dVar).getFocusOwner()).i();
        Boolean bool = (Boolean) m6b1.b(dVar, i, new tls() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                jo5 jo5Var = (jo5) obj;
                if (d.this != ((c) qje.Q(dVar).getFocusOwner()).i()) {
                    return Boolean.TRUE;
                }
                boolean A = e.A(dVar, dVar2, i, tlsVar);
                Boolean valueOf = Boolean.valueOf(A);
                if (A || !jo5Var.a()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final d o(d dVar) {
        d dVar2;
        if (dVar.getNode().isAttached()) {
            if (!dVar.getNode().isAttached()) {
                ixv.b("visitChildren called on an unattached node");
            }
            wz40 wz40Var = new wz40(new e530[16]);
            e530 child$ui = dVar.getNode().getChild$ui();
            if (child$ui == null) {
                qje.b(wz40Var, dVar.getNode());
            } else {
                wz40Var.b(child$ui);
            }
            loop0: while (true) {
                int i = wz40Var.c;
                if (i == 0) {
                    break;
                }
                e530 e530Var = (e530) wz40Var.k(i - 1);
                if ((e530Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                    qje.b(wz40Var, e530Var);
                } else {
                    while (true) {
                        if (e530Var == null) {
                            break;
                        }
                        if ((e530Var.getKindSet$ui() & 1024) != 0) {
                            wz40 wz40Var2 = null;
                            while (e530Var != null) {
                                if (e530Var instanceof d) {
                                    dVar2 = (d) e530Var;
                                    if (dVar2.getNode().isAttached()) {
                                        int i2 = qvr.b[dVar2.J0().ordinal()];
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            break loop0;
                                        }
                                        if (i2 != 4) {
                                            w511.b();
                                            return null;
                                        }
                                    }
                                } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                    int i3 = 0;
                                    for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                        if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                e530Var = e530Var2;
                                            } else {
                                                if (wz40Var2 == null) {
                                                    wz40Var2 = new wz40(new e530[16]);
                                                }
                                                if (e530Var != null) {
                                                    wz40Var2.b(e530Var);
                                                    e530Var = null;
                                                }
                                                wz40Var2.b(e530Var2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                e530Var = qje.c(wz40Var2);
                            }
                        } else {
                            e530Var = e530Var.getChild$ui();
                        }
                    }
                }
            }
            return dVar2;
        }
        return null;
    }

    public static final boolean p(zii0 zii0Var, zii0 zii0Var2, zii0 zii0Var3, int i) {
        if (!q(i, zii0Var, zii0Var3)) {
            return false;
        }
        if (q(i, zii0Var2, zii0Var3) && !b(zii0Var3, zii0Var, zii0Var2, i)) {
            return !b(zii0Var3, zii0Var2, zii0Var, i) && r(i, zii0Var3, zii0Var) < r(i, zii0Var3, zii0Var2);
        }
        return true;
    }

    public static final boolean q(int i, zii0 zii0Var, zii0 zii0Var2) {
        if (i == 3) {
            float f = zii0Var2.c;
            float f2 = zii0Var2.a;
            float f3 = zii0Var.c;
            return (f > f3 || f2 >= f3) && f2 > zii0Var.a;
        }
        if (i == 4) {
            float f4 = zii0Var2.a;
            float f5 = zii0Var2.c;
            float f6 = zii0Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < zii0Var.c;
        }
        if (i == 5) {
            float f7 = zii0Var2.d;
            float f8 = zii0Var2.b;
            float f9 = zii0Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > zii0Var.b;
        }
        if (i != 6) {
            ny61.r("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = zii0Var2.b;
        float f11 = zii0Var2.d;
        float f12 = zii0Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < zii0Var.d;
    }

    public static final long r(int i, zii0 zii0Var, zii0 zii0Var2) {
        float f;
        float f2;
        float a;
        float f3;
        float f4;
        if (i == 3) {
            f = zii0Var.a;
            f2 = zii0Var2.c;
        } else if (i == 4) {
            f = zii0Var2.a;
            f2 = zii0Var.c;
        } else if (i == 5) {
            f = zii0Var.b;
            f2 = zii0Var2.d;
        } else {
            if (i != 6) {
                ny61.r("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = zii0Var2.b;
            f2 = zii0Var.d;
        }
        float f5 = f - f2;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        long j = (long) f5;
        if (i == 3 || i == 4) {
            float f6 = zii0Var.b;
            a = n.a(zii0Var.d, f6, 2.0f, f6);
            f3 = zii0Var2.b;
            f4 = zii0Var2.d;
        } else {
            if (i != 5 && i != 6) {
                ny61.r("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f7 = zii0Var.a;
            a = n.a(zii0Var.c, f7, 2.0f, f7);
            f3 = zii0Var2.a;
            f4 = zii0Var2.c;
        }
        long j2 = (long) (a - (((f4 - f3) / 2.0f) + f3));
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean s(d dVar) {
        LayoutNode layoutNode;
        s coordinator$ui;
        LayoutNode layoutNode2;
        s coordinator$ui2 = dVar.getCoordinator$ui();
        return (coordinator$ui2 == null || (layoutNode = coordinator$ui2.I) == null || !layoutNode.G() || (coordinator$ui = dVar.getCoordinator$ui()) == null || (layoutNode2 = coordinator$ui.I) == null || !layoutNode2.F()) ? false : true;
    }

    public static final CustomDestinationResult t(d dVar, int i) {
        int i2 = pvr.a[dVar.J0().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                d o = o(dVar);
                if (o == null) {
                    ny61.g("ActiveParent with no focused child");
                    return null;
                }
                CustomDestinationResult t = t(o, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
                CustomDestinationResult customDestinationResult2 = t != customDestinationResult ? t : null;
                if (customDestinationResult2 != null) {
                    return customDestinationResult2;
                }
                if (dVar.c) {
                    return customDestinationResult;
                }
                dVar.c = true;
                try {
                    FocusPropertiesImpl G0 = dVar.G0();
                    sv7 sv7Var = new sv7(i);
                    c cVar = (c) qje.Q(dVar).getFocusOwner();
                    d i3 = cVar.i();
                    G0.k.invoke(sv7Var);
                    d i4 = cVar.i();
                    if (!sv7Var.b) {
                        return (i3 == i4 || i4 == null) ? customDestinationResult : yur.d == yur.c ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                    }
                    yur yurVar = yur.b;
                    return CustomDestinationResult.Cancelled;
                } finally {
                    dVar.c = false;
                }
            }
            if (i2 != 4) {
                w511.b();
                return null;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult u(d dVar, int i) {
        if (!dVar.w) {
            dVar.w = true;
            try {
                FocusPropertiesImpl G0 = dVar.G0();
                sv7 sv7Var = new sv7(i);
                c cVar = (c) qje.Q(dVar).getFocusOwner();
                d i2 = cVar.i();
                G0.j.invoke(sv7Var);
                d i3 = cVar.i();
                if (sv7Var.b) {
                    yur yurVar = yur.b;
                    return CustomDestinationResult.Cancelled;
                }
                if (i2 != i3 && i3 != null) {
                    return yur.d == yur.c ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                }
            } finally {
                dVar.w = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult v(d dVar, int i) {
        e530 e530Var;
        t300 t300Var;
        int i2 = pvr.a[dVar.J0().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            d o = o(dVar);
            if (o != null) {
                return t(o, i);
            }
            ny61.g("ActiveParent with no focused child");
            return null;
        }
        if (i2 != 4) {
            w511.b();
            return null;
        }
        if (!dVar.getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 parent$ui = dVar.getNode().getParent$ui();
        LayoutNode P = qje.P(dVar);
        loop0: while (true) {
            if (P == null) {
                e530Var = null;
                break;
            }
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                        e530Var = parent$ui;
                        wz40 wz40Var = null;
                        while (e530Var != null) {
                            if (e530Var instanceof d) {
                                break loop0;
                            }
                            if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                int i3 = 0;
                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            e530Var = e530Var2;
                                        } else {
                                            if (wz40Var == null) {
                                                wz40Var = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var.b(e530Var2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            P = P.s();
            parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
        d dVar2 = (d) e530Var;
        if (dVar2 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = pvr.a[dVar2.J0().ordinal()];
        if (i4 == 1) {
            return u(dVar2, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return v(dVar2, i);
        }
        if (i4 != 4) {
            w511.b();
            return null;
        }
        CustomDestinationResult v = v(dVar2, i);
        CustomDestinationResult customDestinationResult = v != CustomDestinationResult.None ? v : null;
        return customDestinationResult == null ? u(dVar2, i) : customDestinationResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean w(final d dVar) {
        wz40 wz40Var;
        t300 t300Var;
        c cVar;
        boolean z;
        int i;
        wz40 wz40Var2;
        int i2;
        int i3;
        t300 t300Var2;
        c cVar2 = (c) qje.Q(dVar).getFocusOwner();
        d i4 = cVar2.i();
        FocusStateImpl J0 = dVar.J0();
        if (i4 == dVar) {
            dVar.F0(J0, J0);
            return true;
        }
        wz40 wz40Var3 = null;
        if ((i4 == null || i4.a) && !dVar.a && !((c) qje.Q(dVar).getFocusOwner()).a.mo68requestOwnerFocus7o62pno(null, null)) {
            return false;
        }
        if (i4 != null) {
            wz40Var = new wz40(new d[16]);
            if (!i4.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 parent$ui = i4.getNode().getParent$ui();
            LayoutNode P = qje.P(i4);
            while (P != null) {
                if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 1024) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                            wz40 wz40Var4 = wz40Var3;
                            e530 e530Var = parent$ui;
                            while (e530Var != null) {
                                if (e530Var instanceof d) {
                                    wz40Var.b((d) e530Var);
                                } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                    int i5 = 0;
                                    for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                        if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                e530Var = e530Var2;
                                            } else {
                                                if (wz40Var4 == null) {
                                                    wz40Var4 = new wz40(new e530[16]);
                                                }
                                                if (e530Var != null) {
                                                    wz40Var4.b(e530Var);
                                                    e530Var = null;
                                                }
                                                wz40Var4.b(e530Var2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                e530Var = qje.c(wz40Var4);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                        wz40Var3 = null;
                    }
                }
                P = P.s();
                parent$ui = (P == null || (t300Var2 = P.a0) == null) ? null : (v7x0) t300Var2.f;
                wz40Var3 = null;
            }
        } else {
            wz40Var = null;
        }
        d[] dVarArr = new d[16];
        d[] dVarArr2 = new d[16];
        if (!dVar.getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 parent$ui2 = dVar.getNode().getParent$ui();
        LayoutNode P2 = qje.P(dVar);
        boolean z2 = true;
        int i6 = 0;
        int i7 = 0;
        while (P2 != null) {
            if ((((e530) P2.a0.g).getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui2 != null) {
                    if ((parent$ui2.getKindSet$ui() & 1024) != 0) {
                        e530 e530Var3 = parent$ui2;
                        wz40 wz40Var5 = null;
                        while (e530Var3 != null) {
                            if (e530Var3 instanceof d) {
                                d dVar2 = e530Var3;
                                if (jl40.l(wz40Var != null ? Boolean.valueOf(wz40Var.j(dVar2)) : null, Boolean.TRUE)) {
                                    int i8 = i6 + 1;
                                    if (dVarArr.length < i8) {
                                        int length = dVarArr.length;
                                        cVar = cVar2;
                                        ?? r1 = new Object[Math.max(i8, length * 2)];
                                        i3 = i8;
                                        System.arraycopy(dVarArr, 0, r1, 0, length);
                                        dVarArr = r1;
                                    } else {
                                        cVar = cVar2;
                                        i3 = i8;
                                    }
                                    dVarArr[i6] = dVar2;
                                    i6 = i3;
                                } else {
                                    cVar = cVar2;
                                    int i9 = i7 + 1;
                                    if (dVarArr2.length < i9) {
                                        int length2 = dVarArr2.length;
                                        ?? r6 = new Object[Math.max(i9, length2 * 2)];
                                        i2 = i9;
                                        System.arraycopy(dVarArr2, 0, r6, 0, length2);
                                        dVarArr2 = r6;
                                    } else {
                                        i2 = i9;
                                    }
                                    dVarArr2[i7] = dVar2;
                                    i7 = i2;
                                }
                                if (dVar2 == i4) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                cVar = cVar2;
                                z = true;
                            }
                            if (z && (e530Var3.getKindSet$ui() & 1024) != 0 && (e530Var3 instanceof lqh)) {
                                int i10 = 0;
                                for (e530 e530Var4 = ((lqh) e530Var3).b; e530Var4 != null; e530Var4 = e530Var4.getChild$ui()) {
                                    if ((e530Var4.getKindSet$ui() & 1024) != 0) {
                                        int i11 = i10 + 1;
                                        if (i11 == 1) {
                                            e530Var3 = e530Var4;
                                            i = i11;
                                        } else {
                                            if (wz40Var5 == null) {
                                                i = i11;
                                                wz40Var2 = new wz40(new e530[16]);
                                            } else {
                                                i = i11;
                                                wz40Var2 = wz40Var5;
                                            }
                                            if (e530Var3 != null) {
                                                wz40Var2.b(e530Var3);
                                                e530Var3 = null;
                                            }
                                            wz40Var2.b(e530Var4);
                                            wz40Var5 = wz40Var2;
                                        }
                                        i10 = i;
                                    }
                                }
                                if (i10 == 1) {
                                    cVar2 = cVar;
                                }
                            }
                            e530Var3 = qje.c(wz40Var5);
                            cVar2 = cVar;
                        }
                    }
                    parent$ui2 = parent$ui2.getParent$ui();
                    cVar2 = cVar2;
                }
            }
            c cVar3 = cVar2;
            P2 = P2.s();
            parent$ui2 = (P2 == null || (t300Var = P2.a0) == null) ? null : (v7x0) t300Var.f;
            cVar2 = cVar3;
        }
        c cVar4 = cVar2;
        if (z2 && i4 != null && !d(i4, false)) {
            return false;
        }
        u.e(dVar, new sls() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                d.this.G0();
                return zy11.a;
            }
        });
        int i12 = pvr.a[dVar.J0().ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3 && i12 != 4) {
                w511.b();
                return false;
            }
            ((c) qje.Q(dVar).getFocusOwner()).l(dVar);
        }
        if (z2 && i4 != null) {
            i4.F0(FocusStateImpl.Active, FocusStateImpl.Inactive);
        }
        if (wz40Var != null) {
            int i13 = wz40Var.c - 1;
            Object[] objArr = wz40Var.a;
            if (i13 < objArr.length) {
                while (i13 >= 0) {
                    d dVar3 = (d) objArr[i13];
                    if (cVar4.i() != dVar) {
                        return false;
                    }
                    dVar3.F0(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    i13--;
                }
            }
        }
        int i14 = i7 - 1;
        if (i14 < dVarArr2.length) {
            while (i14 >= 0) {
                d dVar4 = dVarArr2[i14];
                if (cVar4.i() != dVar) {
                    return false;
                }
                dVar4.F0(dVar4 == i4 ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                i14--;
            }
        }
        if (cVar4.i() != dVar) {
            return false;
        }
        dVar.F0(J0, FocusStateImpl.Active);
        return cVar4.i() == dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean x(d dVar, tls tlsVar) {
        d[] dVarArr = new d[16];
        if (!dVar.getNode().isAttached()) {
            ixv.b("visitChildren called on an unattached node");
        }
        wz40 wz40Var = new wz40(new e530[16]);
        e530 child$ui = dVar.getNode().getChild$ui();
        if (child$ui == null) {
            qje.b(wz40Var, dVar.getNode());
        } else {
            wz40Var.b(child$ui);
        }
        int i = 0;
        while (true) {
            int i2 = wz40Var.c;
            if (i2 == 0) {
                break;
            }
            e530 e530Var = (e530) wz40Var.k(i2 - 1);
            if ((e530Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                qje.b(wz40Var, e530Var);
            } else {
                while (true) {
                    if (e530Var == null) {
                        break;
                    }
                    if ((e530Var.getKindSet$ui() & 1024) != 0) {
                        wz40 wz40Var2 = null;
                        while (e530Var != null) {
                            if (e530Var instanceof d) {
                                d dVar2 = (d) e530Var;
                                int i3 = i + 1;
                                if (dVarArr.length < i3) {
                                    int length = dVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(dVarArr, 0, r10, 0, length);
                                    dVarArr = r10;
                                }
                                dVarArr[i] = dVar2;
                                i = i3;
                            } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                int i4 = 0;
                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            e530Var = e530Var2;
                                        } else {
                                            if (wz40Var2 == null) {
                                                wz40Var2 = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var2.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var2.b(e530Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var2);
                        }
                    } else {
                        e530Var = e530Var.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(dVarArr, 0, i, rvr.b);
        int i5 = i - 1;
        if (i5 < dVarArr.length) {
            while (i5 >= 0) {
                d dVar3 = dVarArr[i5];
                if (s(dVar3) && a(dVar3, tlsVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean y(d dVar, tls tlsVar) {
        d[] dVarArr = new d[16];
        if (!dVar.getNode().isAttached()) {
            ixv.b("visitChildren called on an unattached node");
        }
        wz40 wz40Var = new wz40(new e530[16]);
        e530 child$ui = dVar.getNode().getChild$ui();
        if (child$ui == null) {
            qje.b(wz40Var, dVar.getNode());
        } else {
            wz40Var.b(child$ui);
        }
        int i = 0;
        while (true) {
            int i2 = wz40Var.c;
            if (i2 == 0) {
                break;
            }
            e530 e530Var = (e530) wz40Var.k(i2 - 1);
            if ((e530Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                qje.b(wz40Var, e530Var);
            } else {
                while (true) {
                    if (e530Var == null) {
                        break;
                    }
                    if ((e530Var.getKindSet$ui() & 1024) != 0) {
                        wz40 wz40Var2 = null;
                        while (e530Var != null) {
                            if (e530Var instanceof d) {
                                d dVar2 = (d) e530Var;
                                int i3 = i + 1;
                                if (dVarArr.length < i3) {
                                    int length = dVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(dVarArr, 0, r10, 0, length);
                                    dVarArr = r10;
                                }
                                dVarArr[i] = dVar2;
                                i = i3;
                            } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                int i4 = 0;
                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            e530Var = e530Var2;
                                        } else {
                                            if (wz40Var2 == null) {
                                                wz40Var2 = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var2.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var2.b(e530Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var2);
                        }
                    } else {
                        e530Var = e530Var.getChild$ui();
                    }
                }
            }
        }
        Arrays.sort(dVarArr, 0, i, rvr.b);
        for (int i5 = 0; i5 < i; i5++) {
            d dVar3 = dVarArr[i5];
            if (s(dVar3) && l(dVar3, tlsVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z(int i, tls tlsVar, zii0 zii0Var, d dVar) {
        d h;
        wz40 wz40Var = new wz40(new d[16]);
        if (!dVar.getNode().isAttached()) {
            ixv.b("visitChildren called on an unattached node");
        }
        wz40 wz40Var2 = new wz40(new e530[16]);
        e530 child$ui = dVar.getNode().getChild$ui();
        if (child$ui == null) {
            qje.b(wz40Var2, dVar.getNode());
        } else {
            wz40Var2.b(child$ui);
        }
        while (true) {
            int i2 = wz40Var2.c;
            if (i2 == 0) {
                break;
            }
            e530 e530Var = (e530) wz40Var2.k(i2 - 1);
            if ((e530Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                qje.b(wz40Var2, e530Var);
            } else {
                while (true) {
                    if (e530Var == null) {
                        break;
                    }
                    if ((e530Var.getKindSet$ui() & 1024) != 0) {
                        wz40 wz40Var3 = null;
                        while (e530Var != null) {
                            if (e530Var instanceof d) {
                                d dVar2 = (d) e530Var;
                                if (dVar2.isAttached()) {
                                    wz40Var.b(dVar2);
                                }
                            } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                int i3 = 0;
                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            e530Var = e530Var2;
                                        } else {
                                            if (wz40Var3 == null) {
                                                wz40Var3 = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var3.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var3.b(e530Var2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var3);
                        }
                    } else {
                        e530Var = e530Var.getChild$ui();
                    }
                }
            }
        }
        while (wz40Var.c != 0 && (h = h(wz40Var, zii0Var, i)) != null) {
            if (h.G0().a) {
                return ((Boolean) tlsVar.invoke(h)).booleanValue();
            }
            if (m(i, tlsVar, zii0Var, h)) {
                return true;
            }
            wz40Var.j(h);
        }
        return false;
    }
}
