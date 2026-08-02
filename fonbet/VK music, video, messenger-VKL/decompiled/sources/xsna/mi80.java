package xsna;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import xsna.dy6;
import xsna.q630;

/* compiled from: OneDimensionalFocusSearch.kt */
/* loaded from: classes11.dex */
public final class mi80 {

    /* compiled from: OneDimensionalFocusSearch.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OneDimensionalFocusSearch.kt */
    public static final class b extends Lambda implements izs<dy6.a, Boolean> {
        final /* synthetic */ dxr $activeNodeBeforeSearch;
        final /* synthetic */ int $direction;
        final /* synthetic */ dxr $focusedItem;
        final /* synthetic */ izs<dxr, Boolean> $onFound;
        final /* synthetic */ dxr $this_generateAndSearchChildren;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(dxr dxrVar, dxr dxrVar2, dxr dxrVar3, int i, izs<? super dxr, Boolean> izsVar) {
            super(1);
            this.$activeNodeBeforeSearch = dxrVar;
            this.$this_generateAndSearchChildren = dxrVar2;
            this.$focusedItem = dxrVar3;
            this.$direction = i;
            this.$onFound = izsVar;
        }

        @Override // xsna.izs
        public final Boolean invoke(dy6.a aVar) {
            dy6.a aVar2 = aVar;
            if (this.$activeNodeBeforeSearch != itl.g(this.$this_generateAndSearchChildren).getFocusOwner().b()) {
                return Boolean.TRUE;
            }
            boolean f = mi80.f(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound);
            Boolean valueOf = Boolean.valueOf(f);
            if (f || !aVar2.a()) {
                return valueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(dxr dxrVar, izs<? super dxr, Boolean> izsVar) {
        FocusStateImpl k0 = dxrVar.k0();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[k0.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return d(dxrVar, izsVar);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!d(dxrVar, izsVar)) {
                if (!(dxrVar.k2().a ? izsVar.invoke(dxrVar).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        dxr c = ixr.c(dxrVar);
        if (c == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i2 = iArr[c.k0().ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return c(dxrVar, c, 2, izsVar);
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (a(c, izsVar) || c(dxrVar, c, 2, izsVar) || (c.k2().a && izsVar.invoke(c).booleanValue())) {
            return true;
        }
    }

    public static final boolean b(dxr dxrVar, izs<? super dxr, Boolean> izsVar) {
        int i = a.$EnumSwitchMapping$0[dxrVar.k0().ordinal()];
        if (i == 1) {
            dxr c = ixr.c(dxrVar);
            if (c != null) {
                return b(c, izsVar) || c(dxrVar, c, 1, izsVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        if (i == 2 || i == 3) {
            return e(dxrVar, izsVar);
        }
        if (i == 4) {
            return dxrVar.k2().a ? izsVar.invoke(dxrVar).booleanValue() : e(dxrVar, izsVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(dxr dxrVar, dxr dxrVar2, int i, izs<? super dxr, Boolean> izsVar) {
        if (f(dxrVar, dxrVar2, i, izsVar)) {
            return true;
        }
        Boolean bool = (Boolean) fy6.a(dxrVar, i, new b(itl.g(dxrVar).getFocusOwner().b(), dxrVar, dxrVar2, i, izsVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean d(dxr dxrVar, izs<? super dxr, Boolean> izsVar) {
        dxr[] dxrVarArr = new dxr[16];
        if (!dxrVar.b.o) {
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
        int i = 0;
        while (true) {
            int i2 = ci50Var.d;
            if (i2 == 0) {
                break;
            }
            q630.c cVar3 = (q630.c) ci50Var.k(i2 - 1);
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
                                int i3 = i + 1;
                                if (dxrVarArr.length < i3) {
                                    int length = dxrVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(dxrVarArr, 0, r10, 0, length);
                                    dxrVarArr = r10;
                                }
                                dxrVarArr[i] = dxrVar2;
                                i = i3;
                            } else if ((cVar3.d & 1024) != 0 && (cVar3 instanceof ytl)) {
                                int i4 = 0;
                                for (q630.c cVar4 = ((ytl) cVar3).q; cVar4 != null; cVar4 = cVar4.g) {
                                    if ((cVar4.d & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
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
        Arrays.sort(dxrVarArr, 0, i, kxr.b);
        int i5 = i - 1;
        if (i5 < dxrVarArr.length) {
            while (i5 >= 0) {
                dxr dxrVar3 = dxrVarArr[i5];
                if (ixr.d(dxrVar3) && a(dxrVar3, izsVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean e(dxr dxrVar, izs<? super dxr, Boolean> izsVar) {
        dxr[] dxrVarArr = new dxr[16];
        if (!dxrVar.b.o) {
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
        int i = 0;
        while (true) {
            int i2 = ci50Var.d;
            if (i2 == 0) {
                break;
            }
            q630.c cVar3 = (q630.c) ci50Var.k(i2 - 1);
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
                                int i3 = i + 1;
                                if (dxrVarArr.length < i3) {
                                    int length = dxrVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(dxrVarArr, 0, r10, 0, length);
                                    dxrVarArr = r10;
                                }
                                dxrVarArr[i] = dxrVar2;
                                i = i3;
                            } else if ((cVar3.d & 1024) != 0 && (cVar3 instanceof ytl)) {
                                int i4 = 0;
                                for (q630.c cVar4 = ((ytl) cVar3).q; cVar4 != null; cVar4 = cVar4.g) {
                                    if ((cVar4.d & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
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
        Arrays.sort(dxrVarArr, 0, i, kxr.b);
        for (int i5 = 0; i5 < i; i5++) {
            dxr dxrVar3 = dxrVarArr[i5];
            if (ixr.d(dxrVar3) && b(dxrVar3, izsVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0199 A[EDGE_INSN: B:151:0x0199->B:132:0x0199 BREAK  A[LOOP:5: B:91:0x012e->B:146:0x012e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f(dxr dxrVar, dxr dxrVar2, int i, izs<? super dxr, Boolean> izsVar) {
        q630.c cVar;
        LayoutNode f;
        u470 u470Var;
        if (dxrVar.k0() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        dxr[] dxrVarArr = new dxr[16];
        if (!dxrVar.b.o) {
            uzw.b("visitChildren called on an unattached node");
        }
        ci50 ci50Var = new ci50(new q630.c[16]);
        q630.c cVar2 = dxrVar.b;
        q630.c cVar3 = cVar2.g;
        if (cVar3 == null) {
            itl.a(ci50Var, cVar2);
        } else {
            ci50Var.b(cVar3);
        }
        int i2 = 0;
        while (true) {
            int i3 = ci50Var.d;
            cVar = null;
            if (i3 == 0) {
                break;
            }
            q630.c cVar4 = (q630.c) ci50Var.k(i3 - 1);
            if ((cVar4.e & 1024) == 0) {
                itl.a(ci50Var, cVar4);
            } else {
                while (true) {
                    if (cVar4 == null) {
                        break;
                    }
                    if ((cVar4.d & 1024) != 0) {
                        ci50 ci50Var2 = null;
                        while (cVar4 != null) {
                            if (cVar4 instanceof dxr) {
                                dxr dxrVar3 = (dxr) cVar4;
                                int i4 = i2 + 1;
                                if (dxrVarArr.length < i4) {
                                    int length = dxrVarArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(dxrVarArr, 0, r11, 0, length);
                                    dxrVarArr = r11;
                                }
                                dxrVarArr[i2] = dxrVar3;
                                i2 = i4;
                            } else if ((cVar4.d & 1024) != 0 && (cVar4 instanceof ytl)) {
                                int i5 = 0;
                                for (q630.c cVar5 = ((ytl) cVar4).q; cVar5 != null; cVar5 = cVar5.g) {
                                    if ((cVar5.d & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            cVar4 = cVar5;
                                        } else {
                                            if (ci50Var2 == null) {
                                                ci50Var2 = new ci50(new q630.c[16]);
                                            }
                                            if (cVar4 != null) {
                                                ci50Var2.b(cVar4);
                                                cVar4 = null;
                                            }
                                            ci50Var2.b(cVar5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            cVar4 = itl.b(ci50Var2);
                        }
                    } else {
                        cVar4 = cVar4.g;
                    }
                }
            }
        }
        Arrays.sort(dxrVarArr, 0, i2, kxr.b);
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            k9x q = swe0.q(0, i2);
            int i6 = q.b;
            int i7 = q.c;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        dxr dxrVar4 = dxrVarArr[i7];
                        if (ixr.d(dxrVar4) && a(dxrVar4, izsVar)) {
                            break;
                        }
                    }
                    if (epx.f(dxrVarArr[i7], dxrVar2)) {
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
                if (!dxrVar.b.o) {
                }
                q630.c cVar6 = dxrVar.b.f;
                f = itl.f(dxrVar);
                loop5: while (true) {
                    if (f == null) {
                    }
                }
                if (cVar != null) {
                }
            }
            return false;
        }
        k9x q2 = swe0.q(0, i2);
        int i8 = q2.b;
        int i9 = q2.c;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    dxr dxrVar5 = dxrVarArr[i8];
                    if (ixr.d(dxrVar5) && b(dxrVar5, izsVar)) {
                        break;
                    }
                }
                if (epx.f(dxrVarArr[i8], dxrVar2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && dxrVar.k2().a) {
            if (!dxrVar.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar62 = dxrVar.b.f;
            f = itl.f(dxrVar);
            loop5: while (true) {
                if (f == null) {
                    break;
                }
                if ((f.G.f.e & 1024) != 0) {
                    while (cVar62 != null) {
                        if ((cVar62.d & 1024) != 0) {
                            q630.c cVar7 = cVar62;
                            ci50 ci50Var3 = null;
                            while (cVar7 != null) {
                                if (cVar7 instanceof dxr) {
                                    cVar = cVar7;
                                    break loop5;
                                }
                                if ((cVar7.d & 1024) != 0 && (cVar7 instanceof ytl)) {
                                    int i10 = 0;
                                    for (q630.c cVar8 = ((ytl) cVar7).q; cVar8 != null; cVar8 = cVar8.g) {
                                        if ((cVar8.d & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar7 = cVar8;
                                            } else {
                                                if (ci50Var3 == null) {
                                                    ci50Var3 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar7 != null) {
                                                    ci50Var3.b(cVar7);
                                                    cVar7 = null;
                                                }
                                                ci50Var3.b(cVar8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar7 = itl.b(ci50Var3);
                            }
                        }
                        cVar62 = cVar62.f;
                    }
                }
                f = f.I();
                cVar62 = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
            }
            if (cVar != null) {
                return izsVar.invoke(dxrVar).booleanValue();
            }
        }
        return false;
    }
}
