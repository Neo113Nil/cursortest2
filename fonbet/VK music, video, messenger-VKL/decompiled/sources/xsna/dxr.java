package xsna;

import android.os.Trace;
import androidx.compose.ui.focus.CustomDestinationResult;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.jwr;
import xsna.q630;

/* compiled from: FocusTargetNode.kt */
/* loaded from: classes11.dex */
public final class dxr extends q630.c implements nvi, ony, cxr, hr70, a730 {
    public final boolean p;
    public final wzs<xwr, xwr, s3q0> q;
    public boolean r;
    public boolean s;
    public final int t;

    /* compiled from: FocusTargetNode.kt */
    public static final class a extends d730<dxr> {
        public static final a a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }

        @Override // xsna.d730
        public final dxr r() {
            return new dxr(null, 0, 15);
        }

        @Override // xsna.d730
        public final /* bridge */ /* synthetic */ void s(dxr dxrVar) {
        }
    }

    /* compiled from: FocusTargetNode.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: FocusTargetNode.kt */
    public static final class c extends Lambda implements gzs<s3q0> {
        final /* synthetic */ Ref$ObjectRef<jwr> $focusProperties;
        final /* synthetic */ dxr this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref$ObjectRef<jwr> ref$ObjectRef, dxr dxrVar) {
            super(0);
            this.$focusProperties = ref$ObjectRef;
            this.this$0 = dxrVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, xsna.mwr] */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.$focusProperties.element = this.this$0.k2();
            return s3q0.a;
        }
    }

    /* compiled from: FocusTargetNode.kt */
    public static final class d extends Lambda implements izs<dxr, Boolean> {
        final /* synthetic */ int $focusDirection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(1);
            this.$focusDirection = i;
        }

        @Override // xsna.izs
        public final Boolean invoke(dxr dxrVar) {
            return Boolean.valueOf(dxrVar.i2(this.$focusDirection));
        }
    }

    public dxr() {
        throw null;
    }

    public dxr(wzs wzsVar, int i, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        wzsVar = (i2 & 4) != 0 ? null : wzsVar;
        this.p = z;
        this.q = wzsVar;
        this.t = i;
    }

    @Override // xsna.hr70
    public final void D1() {
        o2();
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void b2() {
        int i = b.$EnumSwitchMapping$1[k0().ordinal()];
        if (i == 1 || i == 2) {
            fwr focusOwner = itl.g(this).getFocusOwner();
            focusOwner.n(8, true, false);
            if (this.p) {
                focusOwner.m();
            }
            focusOwner.q();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        fwr focusOwner2 = itl.g(this).getFocusOwner();
        dxr a2 = ixr.a(this);
        if (a2 == null || !a2.p) {
            return;
        }
        focusOwner2.m();
        focusOwner2.q();
    }

    @Override // xsna.q630.c
    public final void c2() {
        if (k0().h()) {
            itl.g(this).getFocusOwner().n(8, true, true);
        }
    }

    public final boolean i2(int i) {
        int i2 = b.$EnumSwitchMapping$0[gxr.e(this, i).ordinal()];
        if (i2 == 1) {
            return gxr.f(this);
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [xsna.ci50] */
    public final void j2(FocusStateImpl focusStateImpl, FocusStateImpl focusStateImpl2) {
        u470 u470Var;
        wzs<xwr, xwr, s3q0> wzsVar;
        fwr focusOwner = itl.g(this).getFocusOwner();
        dxr b2 = focusOwner.b();
        if (!epx.f(focusStateImpl, focusStateImpl2) && (wzsVar = this.q) != null) {
            wzsVar.invoke(focusStateImpl, focusStateImpl2);
        }
        q630.c cVar = this.b;
        if (!cVar.o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar2 = this.b;
        LayoutNode f = itl.f(this);
        while (f != null) {
            if ((f.G.f.e & 5120) != 0) {
                while (cVar2 != null) {
                    int i = cVar2.d;
                    if ((i & 5120) != 0) {
                        if (cVar2 != cVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ytl ytlVar = cVar2;
                            ?? r6 = 0;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof lvr) {
                                    lvr lvrVar = (lvr) ytlVar;
                                    if (b2 == focusOwner.b()) {
                                        lvrVar.D(focusStateImpl2);
                                    }
                                } else if ((ytlVar.d & 4096) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar3 = ytlVar.q;
                                    int i2 = 0;
                                    ytlVar = ytlVar;
                                    r6 = r6;
                                    while (cVar3 != null) {
                                        if ((cVar3.d & 4096) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                ytlVar = cVar3;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r6.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r6.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.g;
                                        ytlVar = ytlVar;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                ytlVar = itl.b(r6);
                            }
                        }
                    }
                    cVar2 = cVar2.f;
                }
            }
            f = f.I();
            cVar2 = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [xsna.ci50] */
    public final mwr k2() {
        boolean z;
        u470 u470Var;
        mwr mwrVar = new mwr();
        mwrVar.a = true;
        rwr rwrVar = rwr.b;
        mwrVar.b = rwrVar;
        mwrVar.c = rwrVar;
        mwrVar.d = rwrVar;
        mwrVar.e = rwrVar;
        mwrVar.f = rwrVar;
        mwrVar.g = rwrVar;
        mwrVar.h = rwrVar;
        mwrVar.i = rwrVar;
        mwrVar.j = ynp.k;
        mwrVar.k = lwr.i;
        mwrVar.l = jwr.a.a;
        int i = this.t;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((n2x) ovi.a(this, uvi.m)).a() == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        mwrVar.a = z;
        q630.c cVar = this.b;
        if (!cVar.o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar2 = this.b;
        LayoutNode f = itl.f(this);
        loop0: while (f != null) {
            if ((f.G.f.e & 3072) != 0) {
                while (cVar2 != null) {
                    int i2 = cVar2.d;
                    if ((i2 & 3072) != 0) {
                        if (cVar2 != cVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ytl ytlVar = cVar2;
                            ?? r8 = 0;
                            while (ytlVar != 0) {
                                if (ytlVar instanceof owr) {
                                    ((owr) ytlVar).f1(mwrVar);
                                } else if ((ytlVar.d & 2048) != 0 && (ytlVar instanceof ytl)) {
                                    q630.c cVar3 = ytlVar.q;
                                    int i3 = 0;
                                    ytlVar = ytlVar;
                                    r8 = r8;
                                    while (cVar3 != null) {
                                        if ((cVar3.d & 2048) != 0) {
                                            i3++;
                                            r8 = r8;
                                            if (i3 == 1) {
                                                ytlVar = cVar3;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new ci50(new q630.c[16]);
                                                }
                                                if (ytlVar != 0) {
                                                    r8.b(ytlVar);
                                                    ytlVar = 0;
                                                }
                                                r8.b(cVar3);
                                            }
                                        }
                                        cVar3 = cVar3.g;
                                        ytlVar = ytlVar;
                                        r8 = r8;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                ytlVar = itl.b(r8);
                            }
                        }
                    }
                    cVar2 = cVar2.f;
                }
            }
            f = f.I();
            cVar2 = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
        }
        return mwrVar;
    }

    public final zhf0 l2(tny tnyVar) {
        zhf0 zhf0Var = k2().l;
        return zhf0Var != jwr.a.a ? tnyVar == null ? zhf0Var : zhf0Var.j(tnyVar.S(itl.e(this), 0L)) : tnyVar != null ? tnyVar.z(itl.e(this), false) : p490.e(0L, pli.w(itl.e(this).d));
    }

    public final dy6 m2() {
        u470 u470Var;
        Object obj;
        if (!this.b.o) {
            uzw.b("visitAncestors called on an unattached node");
        }
        q630.c cVar = this.b.f;
        LayoutNode f = itl.f(this);
        while (true) {
            if (f == null) {
                break;
            }
            if ((f.G.f.e & 8388640) != 0) {
                for (q630.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.f) {
                    int i = cVar2.d;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            boolean z = cVar2 instanceof gy6;
                            Object obj2 = cVar2;
                            if (!z) {
                                if (cVar2 instanceof ytl) {
                                    q630.c cVar3 = null;
                                    for (q630.c cVar4 = ((ytl) cVar2).q; cVar4 != null; cVar4 = cVar4.g) {
                                        if (cVar4 instanceof gy6) {
                                            cVar3 = cVar4;
                                        }
                                    }
                                    obj2 = cVar3;
                                } else {
                                    obj2 = null;
                                }
                            }
                            gy6 gy6Var = (gy6) obj2;
                            if (gy6Var != null) {
                                return gy6Var.b0();
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (cVar2 instanceof a730) {
                                obj = cVar2;
                            } else if (cVar2 instanceof ytl) {
                                obj = null;
                                for (q630.c cVar5 = ((ytl) cVar2).q; cVar5 != null; cVar5 = cVar5.g) {
                                    if (cVar5 instanceof a730) {
                                        obj = cVar5;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            a730 a730Var = (a730) obj;
                            if (a730Var != null && a730Var.U0().K(ey6.a)) {
                                return (dy6) a730Var.U0().O();
                            }
                        }
                    }
                }
            }
            f = f.I();
            cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
        }
        return null;
    }

    @Override // xsna.cxr
    /* renamed from: n2, reason: merged with bridge method [inline-methods] */
    public final FocusStateImpl k0() {
        u470 u470Var;
        if (!this.o) {
            return FocusStateImpl.Inactive;
        }
        fwr focusOwner = itl.g(this).getFocusOwner();
        dxr b2 = focusOwner.b();
        if (b2 == null) {
            return FocusStateImpl.Inactive;
        }
        if (this == b2) {
            return focusOwner.d() ? FocusStateImpl.Captured : FocusStateImpl.Active;
        }
        if (b2.o) {
            if (!b2.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = b2.b.f;
            LayoutNode f = itl.f(b2);
            while (f != null) {
                if ((f.G.f.e & 1024) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & 1024) != 0) {
                            q630.c cVar2 = cVar;
                            ci50 ci50Var = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof dxr) {
                                    if (this == ((dxr) cVar2)) {
                                        return FocusStateImpl.ActiveParent;
                                    }
                                } else if ((cVar2.d & 1024) != 0 && (cVar2 instanceof ytl)) {
                                    int i = 0;
                                    for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & 1024) != 0) {
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
        }
        return FocusStateImpl.Inactive;
    }

    public final void o2() {
        int i = b.$EnumSwitchMapping$1[k0().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ir70.a(this, new c(ref$ObjectRef, this));
            T t = ref$ObjectRef.element;
            if ((t == 0 ? null : (jwr) t).r0()) {
                return;
            }
            itl.g(this).getFocusOwner().y(true);
        }
    }

    @Override // xsna.cxr
    public final boolean v1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return k2().a ? i2(i) : gtp0.e(this, i, new d(i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.ony
    public final void s0(tny tnyVar) {
    }
}
