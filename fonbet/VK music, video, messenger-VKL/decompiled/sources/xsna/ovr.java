package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: FocusGroupNode.android.kt */
/* loaded from: classes11.dex */
public final class ovr extends q630.c implements owr, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View p;
    public ViewTreeObserver q;
    public final a r = new a();
    public final b s = new b();

    /* compiled from: FocusGroupNode.android.kt */
    public static final class a extends Lambda implements izs<jvr, s3q0> {
        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(jvr jvrVar) {
            Rect rect;
            jvr jvrVar2 = jvrVar;
            View a = mvr.a(ovr.this);
            if (!a.isFocused() && !a.hasFocus()) {
                fwr focusOwner = itl.g(ovr.this).getFocusOwner();
                View a2 = jtl.a(ovr.this);
                Integer c = svr.c(jvrVar2.b());
                int[] iArr = new int[2];
                a2.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                a.getLocationOnScreen(iArr2);
                zhf0 w = focusOwner.w();
                if (w == null) {
                    rect = null;
                } else {
                    int i = (int) w.a;
                    int i2 = iArr[0];
                    int i3 = iArr2[0];
                    int i4 = (int) w.b;
                    int i5 = iArr[1];
                    int i6 = iArr2[1];
                    rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) w.c) + i2) - i3, (((int) w.d) + i5) - i6);
                }
                if (!svr.b(a, c, rect)) {
                    jvrVar2.a();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: FocusGroupNode.android.kt */
    public static final class b extends Lambda implements izs<jvr, s3q0> {
        public b() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(jvr jvrVar) {
            mvr.a(ovr.this);
            return s3q0.a;
        }
    }

    @Override // xsna.q630.c
    public final void a2() {
        ViewTreeObserver viewTreeObserver = jtl.a(this).getViewTreeObserver();
        this.q = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // xsna.q630.c
    public final void b2() {
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.q = null;
        jtl.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.p = null;
    }

    @Override // xsna.owr
    public final void f1(jwr jwrVar) {
        jwrVar.c(false);
        jwrVar.a(this.r);
        jwrVar.b(this.s);
    }

    public final dxr i2() {
        boolean z;
        if (!this.b.o) {
            uzw.b("visitLocalDescendants called on an unattached node");
        }
        q630.c cVar = this.b;
        if ((cVar.e & 1024) != 0) {
            boolean z2 = false;
            for (q630.c cVar2 = cVar.g; cVar2 != null; cVar2 = cVar2.g) {
                if ((cVar2.d & 1024) != 0) {
                    q630.c cVar3 = cVar2;
                    ci50 ci50Var = null;
                    while (cVar3 != null) {
                        if (cVar3 instanceof dxr) {
                            dxr dxrVar = (dxr) cVar3;
                            if (z2) {
                                return dxrVar;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (cVar3.d & 1024) != 0 && (cVar3 instanceof ytl)) {
                            int i = 0;
                            for (q630.c cVar4 = ((ytl) cVar3).q; cVar4 != null; cVar4 = cVar4.g) {
                                if ((cVar4.d & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVar3 = cVar4;
                                    } else {
                                        if (ci50Var == null) {
                                            ci50Var = new ci50(new q630.c[16]);
                                        }
                                        if (cVar3 != null) {
                                            ci50Var.b(cVar3);
                                            cVar3 = null;
                                        }
                                        ci50Var.b(cVar4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVar3 = itl.b(ci50Var);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (itl.f(this).o == null) {
            return;
        }
        View a2 = mvr.a(this);
        fwr focusOwner = itl.g(this).getFocusOwner();
        androidx.compose.ui.node.p g = itl.g(this);
        boolean z2 = true;
        if (view != null && !view.equals(g)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == a2.getParent()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (view2 != null && !view2.equals(g)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == a2.getParent()) {
                    break;
                }
            }
        }
        z2 = false;
        if (z && z2) {
            this.p = view2;
            return;
        }
        if (z2) {
            this.p = view2;
            dxr i2 = i2();
            if (i2.k0().s0()) {
                return;
            }
            gxr.f(i2);
            return;
        }
        if (!z) {
            this.p = null;
            return;
        }
        this.p = null;
        if (i2().k0().h()) {
            focusOwner.n(8, false, false);
        }
    }
}
