package xsna;

import androidx.compose.ui.focus.CustomDestinationResult;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;

/* compiled from: FocusTransactions.kt */
/* loaded from: classes11.dex */
public final class gxr {

    /* compiled from: FocusTransactions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(dxr dxrVar, boolean z) {
        int i = a.$EnumSwitchMapping$0[dxrVar.k0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return z;
            }
            if (i == 3) {
                dxr c = ixr.c(dxrVar);
                if (!(c != null ? a(c, z) : true)) {
                    return false;
                }
                dxrVar.j2(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                return true;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static final boolean b(dxr dxrVar) {
        int i = a.$EnumSwitchMapping$0[dxrVar.k0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            itl.g(dxrVar).getFocusOwner().j();
            dxrVar.j2(FocusStateImpl.Captured, FocusStateImpl.Active);
        }
        return true;
    }

    public static final CustomDestinationResult c(dxr dxrVar, int i) {
        int i2 = a.$EnumSwitchMapping$0[dxrVar.k0().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                dxr c = ixr.c(dxrVar);
                if (c == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                CustomDestinationResult c2 = c(c, i);
                CustomDestinationResult customDestinationResult = CustomDestinationResult.None;
                if (c2 == customDestinationResult) {
                    c2 = null;
                }
                if (c2 != null) {
                    return c2;
                }
                if (dxrVar.r) {
                    return customDestinationResult;
                }
                dxrVar.r = true;
                try {
                    mwr k2 = dxrVar.k2();
                    np9 np9Var = new np9(i);
                    fwr focusOwner = itl.g(dxrVar).getFocusOwner();
                    dxr b = focusOwner.b();
                    k2.k.invoke(np9Var);
                    dxr b2 = focusOwner.b();
                    if (!np9Var.b) {
                        return (b == b2 || b2 == null) ? customDestinationResult : rwr.d == rwr.c ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                    }
                    rwr rwrVar = rwr.b;
                    return CustomDestinationResult.Cancelled;
                } finally {
                    dxrVar.r = false;
                }
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult d(dxr dxrVar, int i) {
        if (!dxrVar.s) {
            dxrVar.s = true;
            try {
                mwr k2 = dxrVar.k2();
                np9 np9Var = new np9(i);
                fwr focusOwner = itl.g(dxrVar).getFocusOwner();
                dxr b = focusOwner.b();
                k2.j.invoke(np9Var);
                dxr b2 = focusOwner.b();
                if (np9Var.b) {
                    rwr rwrVar = rwr.b;
                    return CustomDestinationResult.Cancelled;
                }
                if (b != b2 && b2 != null) {
                    return rwr.d == rwr.c ? CustomDestinationResult.Cancelled : CustomDestinationResult.Redirected;
                }
            } finally {
                dxrVar.s = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final CustomDestinationResult e(dxr dxrVar, int i) {
        q630.c cVar;
        u470 u470Var;
        int i2 = a.$EnumSwitchMapping$0[dxrVar.k0().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            dxr c = ixr.c(dxrVar);
            if (c != null) {
                return c(c, i);
            }
            throw new IllegalArgumentException("ActiveParent with no focused child");
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (!dxrVar.b.o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar2 = dxrVar.b.f;
        LayoutNode f = itl.f(dxrVar);
        loop0: while (true) {
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
        if (dxrVar2 == null) {
            return CustomDestinationResult.None;
        }
        int i4 = a.$EnumSwitchMapping$0[dxrVar2.k0().ordinal()];
        if (i4 == 1) {
            return d(dxrVar2, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return e(dxrVar2, i);
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult e = e(dxrVar2, i);
        CustomDestinationResult customDestinationResult = e != CustomDestinationResult.None ? e : null;
        return customDestinationResult == null ? d(dxrVar2, i) : customDestinationResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v10, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final boolean f(dxr dxrVar) {
        ci50 ci50Var;
        u470 u470Var;
        fwr fwrVar;
        boolean z;
        int i;
        ?? r5;
        int i2;
        int i3;
        u470 u470Var2;
        fwr focusOwner = itl.g(dxrVar).getFocusOwner();
        dxr b = focusOwner.b();
        FocusStateImpl k0 = dxrVar.k0();
        if (b == dxrVar) {
            dxrVar.j2(k0, k0);
            return true;
        }
        if ((b == null || b.p) && !dxrVar.p && !itl.g(dxrVar).getFocusOwner().m()) {
            return false;
        }
        if (b != null) {
            ci50Var = new ci50(new dxr[16]);
            if (!b.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = b.b.f;
            LayoutNode f = itl.f(b);
            while (f != null) {
                if ((f.G.f.e & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & 1024) != 0) {
                            q630.c cVar2 = cVar;
                            ci50 ci50Var2 = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof dxr) {
                                    ci50Var.b((dxr) cVar2);
                                } else if ((cVar2.d & 1024) != 0 && (cVar2 instanceof ytl)) {
                                    int i4 = 0;
                                    for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                s3q0 s3q0Var = s3q0.a;
                                                cVar2 = cVar3;
                                            } else {
                                                if (ci50Var2 == null) {
                                                    ci50Var2 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar2 != null) {
                                                    ci50Var2.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                ci50Var2.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                cVar2 = itl.b(ci50Var2);
                            }
                        }
                        cVar = cVar.f;
                    }
                }
                f = f.I();
                cVar = (f == null || (u470Var2 = f.G) == null) ? null : u470Var2.e;
            }
        } else {
            ci50Var = null;
        }
        dxr[] dxrVarArr = new dxr[16];
        dxr[] dxrVarArr2 = new dxr[16];
        if (!dxrVar.b.o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar4 = dxrVar.b.f;
        LayoutNode f2 = itl.f(dxrVar);
        boolean z2 = true;
        int i5 = 0;
        int i6 = 0;
        while (f2 != null) {
            if ((f2.G.f.e & 1024) != 0) {
                while (cVar4 != null) {
                    if ((cVar4.d & 1024) != 0) {
                        dxr dxrVar2 = cVar4;
                        ci50 ci50Var3 = null;
                        while (dxrVar2 != 0) {
                            if (dxrVar2 instanceof dxr) {
                                dxr dxrVar3 = dxrVar2;
                                if (epx.f(ci50Var != null ? Boolean.valueOf(ci50Var.j(dxrVar3)) : null, Boolean.TRUE)) {
                                    int i7 = i5 + 1;
                                    if (dxrVarArr.length < i7) {
                                        int length = dxrVarArr.length;
                                        fwrVar = focusOwner;
                                        ?? r1 = new Object[Math.max(i7, length * 2)];
                                        i3 = i7;
                                        System.arraycopy(dxrVarArr, 0, r1, 0, length);
                                        dxrVarArr = r1;
                                    } else {
                                        fwrVar = focusOwner;
                                        i3 = i7;
                                    }
                                    dxrVarArr[i5] = dxrVar3;
                                    i5 = i3;
                                } else {
                                    fwrVar = focusOwner;
                                    int i8 = i6 + 1;
                                    if (dxrVarArr2.length < i8) {
                                        int length2 = dxrVarArr2.length;
                                        ?? r52 = new Object[Math.max(i8, length2 * 2)];
                                        i2 = i8;
                                        System.arraycopy(dxrVarArr2, 0, r52, 0, length2);
                                        dxrVarArr2 = r52;
                                    } else {
                                        i2 = i8;
                                    }
                                    dxrVarArr2[i6] = dxrVar3;
                                    i6 = i2;
                                }
                                if (dxrVar3 == b) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                fwrVar = focusOwner;
                                z = true;
                            }
                            if (z && (dxrVar2.d & 1024) != 0 && (dxrVar2 instanceof ytl)) {
                                q630.c cVar5 = dxrVar2.q;
                                int i9 = 0;
                                dxrVar2 = dxrVar2;
                                while (cVar5 != null) {
                                    if ((cVar5.d & 1024) != 0) {
                                        int i10 = i9 + 1;
                                        if (i10 == 1) {
                                            s3q0 s3q0Var2 = s3q0.a;
                                            dxrVar2 = cVar5;
                                            i = i10;
                                        } else {
                                            if (ci50Var3 == null) {
                                                i = i10;
                                                r5 = new ci50(new q630.c[16]);
                                            } else {
                                                i = i10;
                                                r5 = ci50Var3;
                                            }
                                            if (dxrVar2 != 0) {
                                                r5.b(dxrVar2);
                                                dxrVar2 = 0;
                                            }
                                            r5.b(cVar5);
                                            ci50Var3 = r5;
                                            dxrVar2 = dxrVar2;
                                        }
                                        i9 = i;
                                    }
                                    cVar5 = cVar5.g;
                                    dxrVar2 = dxrVar2;
                                }
                                if (i9 == 1) {
                                    focusOwner = fwrVar;
                                }
                            }
                            dxrVar2 = itl.b(ci50Var3);
                            focusOwner = fwrVar;
                        }
                    }
                    cVar4 = cVar4.f;
                    focusOwner = focusOwner;
                }
            }
            fwr fwrVar2 = focusOwner;
            f2 = f2.I();
            cVar4 = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
            focusOwner = fwrVar2;
        }
        fwr fwrVar3 = focusOwner;
        if (z2 && b != null && !a(b, false)) {
            return false;
        }
        ir70.a(dxrVar, new hxr(dxrVar));
        int i11 = a.$EnumSwitchMapping$0[dxrVar.k0().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            itl.g(dxrVar).getFocusOwner().k(dxrVar);
        }
        if (z2 && b != null) {
            b.j2(FocusStateImpl.Active, FocusStateImpl.Inactive);
            s3q0 s3q0Var3 = s3q0.a;
        }
        if (ci50Var != null) {
            int i12 = ci50Var.d - 1;
            Object[] objArr = ci50Var.b;
            if (i12 < objArr.length) {
                while (i12 >= 0) {
                    dxr dxrVar4 = (dxr) objArr[i12];
                    if (fwrVar3.b() != dxrVar) {
                        return false;
                    }
                    dxrVar4.j2(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    i12--;
                }
            }
            s3q0 s3q0Var4 = s3q0.a;
        }
        int i13 = i6 - 1;
        if (i13 < dxrVarArr2.length) {
            while (i13 >= 0) {
                dxr dxrVar5 = dxrVarArr2[i13];
                if (fwrVar3.b() != dxrVar) {
                    return false;
                }
                dxrVar5.j2(dxrVar5 == b ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                i13--;
            }
        }
        if (fwrVar3.b() != dxrVar) {
            return false;
        }
        dxrVar.j2(k0, FocusStateImpl.Active);
        return fwrVar3.b() == dxrVar;
    }
}
