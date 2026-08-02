package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import defpackage.bur;
import defpackage.e530;
import defpackage.gwk0;
import defpackage.ixv;
import defpackage.lqh;
import defpackage.m390;
import defpackage.ny61;
import defpackage.qje;
import defpackage.rur;
import defpackage.sv7;
import defpackage.tje;
import defpackage.tls;
import defpackage.uur;
import defpackage.wz40;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\"8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode;", "Le530;", "Luur;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/d;", "getFocusTargetOfEmbeddedViewWrapper", "()Landroidx/compose/ui/focus/d;", "Lrur;", "focusProperties", "Lzy11;", "applyFocusProperties", "(Lrur;)V", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "onAttach", "onDetach", "focusedChild", "Landroid/view/View;", "getFocusedChild", "()Landroid/view/View;", "setFocusedChild", "(Landroid/view/View;)V", "Landroid/view/ViewTreeObserver;", "attachedViewTreeObserver", "Landroid/view/ViewTreeObserver;", "getAttachedViewTreeObserver", "()Landroid/view/ViewTreeObserver;", "setAttachedViewTreeObserver", "(Landroid/view/ViewTreeObserver;)V", "Lkotlin/Function1;", "Lsv7;", "onEnter", "Ltls;", "getOnEnter", "()Ltls;", "onExit", "getOnExit", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusGroupPropertiesNode extends e530 implements uur, ViewTreeObserver.OnGlobalFocusChangeListener {
    private ViewTreeObserver attachedViewTreeObserver;
    private View focusedChild;
    private final tls onEnter = new tls() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            sv7 sv7Var = (sv7) obj;
            View d = gwk0.d(FocusGroupPropertiesNode.this);
            if (!d.isFocused() && !d.hasFocus()) {
                androidx.compose.ui.focus.b focusOwner = qje.Q(FocusGroupPropertiesNode.this).getFocusOwner();
                View V = tje.V(FocusGroupPropertiesNode.this);
                Integer c = bur.c(sv7Var.b());
                int[] iArr = new int[2];
                V.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                d.getLocationOnScreen(iArr2);
                androidx.compose.ui.focus.d g = androidx.compose.ui.focus.e.g(((androidx.compose.ui.focus.c) focusOwner).c);
                Rect rect = null;
                zii0 j = g != null ? androidx.compose.ui.focus.e.j(g) : null;
                if (j != null) {
                    int i = (int) j.a;
                    int i2 = iArr[0];
                    int i3 = iArr2[0];
                    int i4 = (int) j.b;
                    int i5 = iArr[1];
                    int i6 = iArr2[1];
                    rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) j.c) + i2) - i3, (((int) j.d) + i5) - i6);
                }
                if (!bur.b(d, c, rect)) {
                    sv7Var.a();
                }
            }
            return zy11.a;
        }
    };
    private final tls onExit = new tls() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            gwk0.d(FocusGroupPropertiesNode.this);
            return zy11.a;
        }
    };

    private final androidx.compose.ui.focus.d getFocusTargetOfEmbeddedViewWrapper() {
        boolean z;
        if (!getNode().isAttached()) {
            ixv.b("visitLocalDescendants called on an unattached node");
        }
        e530 node = getNode();
        if ((node.getAggregateChildKindSet$ui() & 1024) != 0) {
            boolean z2 = false;
            for (e530 child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & 1024) != 0) {
                    e530 e530Var = child$ui;
                    wz40 wz40Var = null;
                    while (e530Var != null) {
                        if (e530Var instanceof androidx.compose.ui.focus.d) {
                            androidx.compose.ui.focus.d dVar = (androidx.compose.ui.focus.d) e530Var;
                            if (z2) {
                                return dVar;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                            int i = 0;
                            for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
                            }
                        }
                        e530Var = qje.c(wz40Var);
                    }
                }
            }
        }
        ny61.r("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // defpackage.uur
    public void applyFocusProperties(rur focusProperties) {
        focusProperties.b(false);
        focusProperties.c(this.onEnter);
        focusProperties.a(this.onExit);
    }

    public final ViewTreeObserver getAttachedViewTreeObserver() {
        return this.attachedViewTreeObserver;
    }

    public final View getFocusedChild() {
        return this.focusedChild;
    }

    public final tls getOnEnter() {
        return this.onEnter;
    }

    public final tls getOnExit() {
        return this.onExit;
    }

    @Override // defpackage.e530
    public void onAttach() {
        ViewTreeObserver viewTreeObserver = tje.V(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.cqh, defpackage.gwd0
    public /* bridge */ /* synthetic */ void onDensityChange() {
    }

    @Override // defpackage.e530
    public void onDetach() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        tje.V(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        boolean z;
        if (qje.P(this).G == null) {
            return;
        }
        View d = gwk0.d(this);
        androidx.compose.ui.focus.b focusOwner = qje.Q(this).getFocusOwner();
        m390 Q = qje.Q(this);
        boolean z2 = true;
        if (oldFocus != null && !oldFocus.equals(Q)) {
            for (ViewParent parent = oldFocus.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == d.getParent()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (newFocus != null && !newFocus.equals(Q)) {
            for (ViewParent parent2 = newFocus.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == d.getParent()) {
                    break;
                }
            }
        }
        z2 = false;
        if (z && z2) {
            this.focusedChild = newFocus;
            return;
        }
        if (z2) {
            this.focusedChild = newFocus;
            androidx.compose.ui.focus.d focusTargetOfEmbeddedViewWrapper = getFocusTargetOfEmbeddedViewWrapper();
            if (focusTargetOfEmbeddedViewWrapper.J0().a()) {
                return;
            }
            androidx.compose.ui.focus.e.w(focusTargetOfEmbeddedViewWrapper);
            return;
        }
        if (!z) {
            this.focusedChild = null;
            return;
        }
        this.focusedChild = null;
        if (getFocusTargetOfEmbeddedViewWrapper().J0().b()) {
            ((androidx.compose.ui.focus.c) focusOwner).d(8, false, false);
        }
    }

    @Override // defpackage.cqh
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
    }

    public final void setAttachedViewTreeObserver(ViewTreeObserver viewTreeObserver) {
        this.attachedViewTreeObserver = viewTreeObserver;
    }

    public final void setFocusedChild(View view) {
        this.focusedChild = view;
    }
}
