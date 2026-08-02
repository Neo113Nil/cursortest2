package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import xsna.mut0;

/* compiled from: ComposeView.android.kt */
/* loaded from: classes11.dex */
public abstract class td extends ViewGroup {
    public static final /* synthetic */ int k = 0;
    public WeakReference<cvi> b;
    public IBinder c;
    public rzx0 d;
    public cvi e;
    public iri f;
    public gzs<s3q0> g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* compiled from: ComposeView.android.kt */
    public static final class a extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public a() {
            super(2);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1003123809, intValue, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous>.<anonymous> (ComposeView.android.kt:340)");
                }
                td.this.o(0, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public td(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final void setParentContext(cvi cviVar) {
        if (this.e != cviVar) {
            this.e = cviVar;
            if (cviVar != null) {
                this.b = null;
            }
            rzx0 rzx0Var = this.d;
            if (rzx0Var != null) {
                rzx0Var.dispose();
                this.d = null;
                if (isAttachedToWindow()) {
                    t();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.c != iBinder) {
            this.c = iBinder;
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        q();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        q();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m421getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        we5 we5Var = tag instanceof we5 ? (we5) tag : null;
        if (we5Var != null) {
            return we5Var.a;
        }
        return 1;
    }

    public final iri getComposeViewContext$ui() {
        return this.f;
    }

    public final boolean getHasComposition() {
        return this.d != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.j || super.isTransitionGroup();
    }

    public abstract void o(int i, androidx.compose.runtime.a aVar);

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ph50<Context, ttk0<Float>> ph50Var = xrx0.a;
        Object m = fvr.m(this);
        View view = this;
        while (m instanceof View) {
            View view2 = (View) m;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            m = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new sd(this, 0));
        } else {
            p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        u(i, i2, i3, i4, z);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        t();
        v(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void p() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f == null) {
                p52 p52Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof p52) {
                        p52Var = (p52) childAt;
                    }
                }
                if (p52Var != null) {
                    p52Var.setComposeViewContext(y(ad0.m(this), p52Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                t();
            }
        }
    }

    public final void q() {
        if (this.i) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void r() {
        iri iriVar;
        View view;
        if (this.e == null && !isAttachedToWindow() && ((iriVar = this.f) == null || (view = iriVar.a) == null || !view.isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        t();
    }

    public final void s() {
        View childAt = getChildAt(0);
        p52 p52Var = childAt instanceof p52 ? (p52) childAt : null;
        if (p52Var != null && p52Var.K0) {
            p52Var.getComposeViewContext().b();
            p52Var.K0 = false;
        }
        rzx0 rzx0Var = this.d;
        if (rzx0Var != null) {
            rzx0Var.dispose();
        }
        this.d = null;
        requestLayout();
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m422setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new we5(i));
    }

    public final void setComposeViewContext$ui(iri iriVar) {
        if (this.f != iriVar) {
            if (iriVar == null) {
                s();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                p52 p52Var = childAt instanceof p52 ? (p52) childAt : null;
                if (p52Var != null) {
                    if (p52Var.getCoroutineContext() != iriVar.b.k()) {
                        s();
                    }
                    p52Var.setComposeViewContext(iriVar);
                }
            }
            this.f = iriVar;
        }
    }

    public final void setParentCompositionContext(cvi cviVar) {
        setParentContext(cviVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.h = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.p) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.j = true;
    }

    public final void setViewCompositionStrategy(mut0 mut0Var) {
        gzs<s3q0> gzsVar = this.g;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.g = mut0Var.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        if (this.d == null) {
            try {
                this.i = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    iri iriVar = this.f;
                    if (iriVar == null) {
                        iriVar = w();
                    }
                    this.d = wzx0.a(this, iriVar, new jai(1003123809, new a(), true));
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.i = false;
            }
        }
    }

    public void u(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void v(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final iri w() {
        iri composeViewContext;
        iri q;
        xyt0 xyt0Var;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            p52 p52Var = childAt instanceof p52 ? (p52) childAt : null;
            if (p52Var != null) {
                composeViewContext = p52Var.getComposeViewContext();
                View m = ad0.m(this);
                q = ad0.q(m);
                if (q == null) {
                    return y(m, q);
                }
                cvi x = x();
                f5z e = gqo.e(m);
                if (e == null) {
                    e = composeViewContext != null ? composeViewContext.c : null;
                    if (e == null) {
                        throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                    }
                }
                f5z f5zVar = e;
                z1h0 f = lyd.f(m);
                if (f == null) {
                    f = composeViewContext != null ? composeViewContext.d : null;
                    if (f == null) {
                        throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                    }
                }
                z1h0 z1h0Var = f;
                xyt0 h = ro.h(m);
                if (h == null) {
                    xyt0Var = composeViewContext != null ? composeViewContext.e : null;
                } else {
                    xyt0Var = h;
                }
                iri iriVar = new iri(ad0.q(ad0.m(m)), m, x, f5zVar, z1h0Var, xyt0Var);
                m.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(iriVar));
                return iriVar;
            }
        }
        composeViewContext = null;
        View m2 = ad0.m(this);
        q = ad0.q(m2);
        if (q == null) {
        }
    }

    public final cvi x() {
        Recomposer recomposer;
        cvi cviVar = this.e;
        if (cviVar == null) {
            cviVar = xrx0.a(this);
            if (cviVar == null) {
                Object parent = getParent();
                while (cviVar == null && (parent instanceof View)) {
                    View view = (View) parent;
                    cviVar = xrx0.a(view);
                    parent = fvr.m(view);
                }
            }
            if (cviVar != null) {
                cvi cviVar2 = (!(cviVar instanceof Recomposer) || ((Recomposer.State) ((Recomposer) cviVar).u.getValue()).compareTo(Recomposer.State.ShuttingDown) > 0) ? cviVar : null;
                if (cviVar2 != null) {
                    this.b = new WeakReference<>(cviVar2);
                }
            } else {
                cviVar = null;
            }
            if (cviVar == null) {
                WeakReference<cvi> weakReference = this.b;
                if (weakReference == null || (cviVar = weakReference.get()) == null || ((cviVar instanceof Recomposer) && ((Recomposer.State) ((Recomposer) cviVar).u.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0)) {
                    cviVar = null;
                }
                if (cviVar == null) {
                    if (!isAttachedToWindow()) {
                        uzw.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object m = fvr.m(this);
                    View view2 = this;
                    while (m instanceof View) {
                        View view3 = (View) m;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        m = view3.getParent();
                    }
                    cvi a2 = xrx0.a(view2);
                    if (a2 == null) {
                        recomposer = srx0.a.get().a(view2);
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, recomposer);
                        Handler handler = view2.getHandler();
                        int i = ktu.a;
                        view2.addOnAttachStateChangeListener(new qrx0(myc0.h(q1u.b, new htu(handler, "windowRecomposer cleanup", false).f, null, new rrx0(recomposer, view2, null), 2)));
                    } else {
                        if (!(a2 instanceof Recomposer)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        recomposer = (Recomposer) a2;
                    }
                    Recomposer recomposer2 = ((Recomposer.State) recomposer.u.getValue()).compareTo(Recomposer.State.ShuttingDown) > 0 ? recomposer : null;
                    if (recomposer2 != null) {
                        this.b = new WeakReference<>(recomposer2);
                    }
                    return recomposer;
                }
            }
        }
        return cviVar;
    }

    public final iri y(View view, iri iriVar) {
        cvi x = x();
        f5z e = gqo.e(view);
        xyt0 h = ro.h(view);
        z1h0 f = lyd.f(view);
        cvi cviVar = iriVar.b;
        z1h0 z1h0Var = iriVar.d;
        f5z f5zVar = iriVar.c;
        if (x == cviVar && e == f5zVar && h == iriVar.e && f == z1h0Var) {
            return iriVar;
        }
        if (x.k() != iriVar.b.k()) {
            s();
        }
        if (e == null) {
            e = f5zVar;
        }
        iri iriVar2 = new iri(iriVar, view, x, e, f == null ? z1h0Var : f, h);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(iriVar2));
        return iriVar2;
    }

    public td(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        mut0.b.ViewOnAttachStateChangeListenerC3372b viewOnAttachStateChangeListenerC3372b = new mut0.b.ViewOnAttachStateChangeListenerC3372b(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3372b);
        nut0 nut0Var = new nut0(this);
        g620.i(this).a(nut0Var);
        this.g = new mut0.b.a(this, viewOnAttachStateChangeListenerC3372b, nut0Var);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        q();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        q();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        q();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        q();
        super.addView(view, i, layoutParams);
    }

    public /* synthetic */ td(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
