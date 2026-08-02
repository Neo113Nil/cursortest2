package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer$State;
import androidx.lifecycle.Lifecycle;
import defpackage.b7;
import defpackage.bb1;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.c851;
import defpackage.d851;
import defpackage.f851;
import defpackage.fid;
import defpackage.fse;
import defpackage.gux;
import defpackage.hjt;
import defpackage.hz40;
import defpackage.i3y;
import defpackage.i6e0;
import defpackage.i6u;
import defpackage.ike;
import defpackage.ixv;
import defpackage.j2m0;
import defpackage.ja30;
import defpackage.l8x;
import defpackage.m390;
import defpackage.mp3;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.ohh0;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.qke;
import defpackage.r630;
import defpackage.rs31;
import defpackage.rtd;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tje;
import defpackage.ttd;
import defpackage.up31;
import defpackage.vng;
import defpackage.vp31;
import defpackage.wls;
import defpackage.xw91;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH'¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0015\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0010¢\u0006\u0004\b \u0010\u001fJ7\u0010(\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0004¢\u0006\u0004\b(\u0010)J7\u0010+\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0010¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\"H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J!\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u00108J)\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010;J#\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b5\u0010>J+\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b5\u0010?J+\u0010@\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<H\u0014¢\u0006\u0004\b@\u0010AJ3\u0010@\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010B\u001a\u00020\"H\u0014¢\u0006\u0004\b@\u0010CJ\u000f\u0010D\u001a\u00020\"H\u0016¢\u0006\u0004\bD\u00100J\u000f\u0010E\u001a\u00020\fH\u0002¢\u0006\u0004\bE\u0010\u0016J\u0013\u0010F\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\nH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\fH\u0002¢\u0006\u0004\bJ\u0010\u0016J\u000f\u0010K\u001a\u00020\u0017H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010O\u001a\u00020\u00172\u0006\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020\u0017H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\fH\u0002¢\u0006\u0004\bQ\u0010\u0016R\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR(\u0010W\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R(\u0010^\u001a\u0004\u0018\u00010\n2\b\u0010V\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b^\u0010_\"\u0004\b`\u0010\u000eR4\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010V\u001a\u0004\u0018\u00010\u00178\u0000@@X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010a\u0012\u0004\bd\u0010\u0016\u001a\u0004\bb\u0010L\"\u0004\bc\u0010\u0019R$\u0010f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bf\u0010g\u0012\u0004\bh\u0010\u0016R0\u0010i\u001a\u00020\"2\u0006\u0010V\u001a\u00020\"8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bm\u0010\u0016\u001a\u0004\bk\u00100\"\u0004\bl\u00102R\u0016\u0010n\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR\u0016\u0010o\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010jR\u0014\u0010q\u001a\u00020\"8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bp\u00100R$\u0010v\u001a\u00020r2\u0006\u0010V\u001a\u00020r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010.R\u0011\u0010x\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bw\u00100R\u0018\u0010y\u001a\u00020\"*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006{"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lttd;", "parent", "Lzy11;", "setParentCompositionContext", "(Lttd;)V", "Lvp31;", "strategy", "setViewCompositionStrategy", "(Lvp31;)V", "Content", "(Lfid;I)V", "createComposition", "()V", "Landroidx/compose/ui/platform/i;", "composeViewContext", "(Landroidx/compose/ui/platform/i;)V", "disposeComposition", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "internalOnMeasure$ui", "internalOnMeasure", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "internalOnLayout$ui", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "checkAddView", "cacheIfAlive", "(Lttd;)Lttd;", "resolveParentCompositionContext", "()Lttd;", "ensureCompositionCreated", "resolveComposeViewContext", "()Landroidx/compose/ui/platform/i;", "contextView", "existingContext", "updateAutoCreatedComposeViewContext", "(Landroid/view/View;Landroidx/compose/ui/platform/i;)Landroidx/compose/ui/platform/i;", "attachedToWindow", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", "value", "previousAttachedWindowToken", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "Lrtd;", "composition", "Lrtd;", "parentContext", "Lttd;", "setParentContext", "Landroidx/compose/ui/platform/i;", "getComposeViewContext$ui", "setComposeViewContext$ui", "getComposeViewContext$ui$annotations", "Lkotlin/Function0;", "disposeViewCompositionStrategy", "Lsls;", "getDisposeViewCompositionStrategy$annotations", "showLayoutBounds", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "creatingComposition", "isTransitionGroupSet", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "Lmp3;", "getAutoClearFocusBehavior-4UtRPd4", "()I", "setAutoClearFocusBehavior-17tfJxM", "autoClearFocusBehavior", "getHasComposition", "hasComposition", "isAlive", "(Lttd;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<ttd> cachedViewTreeCompositionContext;
    private i composeViewContext;
    private rtd composition;
    private boolean creatingComposition;
    private sls disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private ttd parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1(this);
        addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1);
        up31 up31Var = new up31(this);
        i6e0.b(this).a.add(up31Var);
        this.disposeViewCompositionStrategy = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(this, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, up31Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachedToWindow() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(updateAutoCreatedComposeViewContext(bb1.k(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                ensureCompositionCreated();
            }
        }
    }

    private final ttd cacheIfAlive(ttd ttdVar) {
        ttd ttdVar2 = isAlive(ttdVar) ? ttdVar : null;
        if (ttdVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(ttdVar2);
        }
        return ttdVar;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    i iVar = this.composeViewContext;
                    if (iVar == null) {
                        iVar = resolveComposeViewContext();
                    }
                    this.composition = w.a(this, iVar, new androidx.compose.runtime.internal.a(1003123809, new wls() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1$1
                        {
                            super(2);
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            fid fidVar = (fid) obj;
                            int intValue = ((Number) obj2).intValue();
                            bts btsVar = (bts) fidVar;
                            if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                                AbstractComposeView.this.Content(btsVar, 0);
                            } else {
                                btsVar.Y();
                            }
                            return zy11.a;
                        }
                    }, true));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(ttd ttdVar) {
        return !(ttdVar instanceof androidx.compose.runtime.j) || ((Recomposer$State) ((androidx.compose.runtime.j) ttdVar).u.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final i resolveComposeViewContext() {
        i composeViewContext;
        i p;
        rs31 rs31Var;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
                View k = bb1.k(this);
                p = bb1.p(k);
                if (p == null) {
                    return updateAutoCreatedComposeViewContext(k, p);
                }
                ttd resolveParentCompositionContext = resolveParentCompositionContext();
                pey o = vng.o(k);
                if (o == null) {
                    o = composeViewContext != null ? composeViewContext.c : null;
                    if (o == null) {
                        ny61.r("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                pey peyVar = o;
                j2m0 l = s8o.l(k);
                if (l == null) {
                    l = composeViewContext != null ? composeViewContext.d : null;
                    if (l == null) {
                        ny61.r("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                j2m0 j2m0Var = l;
                rs31 z = rzo.z(k);
                if (z == null) {
                    rs31Var = composeViewContext != null ? composeViewContext.e : null;
                } else {
                    rs31Var = z;
                }
                i iVar = new i(bb1.p(bb1.k(k)), k, resolveParentCompositionContext, peyVar, j2m0Var, rs31Var);
                k.setTag(ohh0.androidx_compose_ui_view_compose_view_context, new WeakReference(iVar));
                return iVar;
            }
        }
        composeViewContext = null;
        View k2 = bb1.k(this);
        p = bb1.p(k2);
        if (p == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [T, androidx.compose.ui.platform.p] */
    private final ttd resolveParentCompositionContext() {
        final androidx.compose.runtime.j jVar;
        fse fseVar;
        androidx.compose.runtime.e eVar;
        ttd ttdVar = this.parentContext;
        if (ttdVar == null) {
            ttd a = f851.a(this);
            if (a == null) {
                Object parent = getParent();
                while (a == null && (parent instanceof View)) {
                    View view = (View) parent;
                    a = f851.a(view);
                    parent = qke.p(view);
                }
            }
            ttdVar = a != null ? cacheIfAlive(a) : null;
            if (ttdVar == null) {
                WeakReference<ttd> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference == null || (ttdVar = weakReference.get()) == null || !isAlive(ttdVar)) {
                    ttdVar = null;
                }
                if (ttdVar == null) {
                    if (!isAttachedToWindow()) {
                        ixv.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object p = qke.p(this);
                    final View view2 = this;
                    while (p instanceof View) {
                        View view3 = (View) p;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        p = view3.getParent();
                    }
                    ttd a2 = f851.a(view2);
                    if (a2 == null) {
                        ((c851) d851.a.get()).getClass();
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
                        i3y i3yVar = f.E;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            fseVar = (fse) f.E.getValue();
                        } else {
                            fseVar = (fse) f.F.get();
                            if (fseVar == null) {
                                ny61.r("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        fse plus = fseVar.plus(emptyCoroutineContext);
                        r630 r630Var = (r630) plus.get(xw91.B);
                        if (r630Var != null) {
                            androidx.compose.runtime.e eVar2 = new androidx.compose.runtime.e(r630Var);
                            gux guxVar = eVar2.b;
                            synchronized (guxVar.a) {
                                guxVar.d = false;
                                eVar = eVar2;
                            }
                        } else {
                            eVar = 0;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ja30 ja30Var = (ja30) plus.get(ngd0.C);
                        ja30 ja30Var2 = ja30Var;
                        if (ja30Var == null) {
                            ?? pVar = new p(view2.getContext().getApplicationContext());
                            ref$ObjectRef.element = pVar;
                            ja30Var2 = pVar;
                        }
                        if (eVar != 0) {
                            emptyCoroutineContext = eVar;
                        }
                        fse plus2 = plus.plus(emptyCoroutineContext).plus(ja30Var2);
                        jVar = new androidx.compose.runtime.j(plus2);
                        synchronized (jVar.c) {
                            jVar.t = true;
                        }
                        ike a3 = bvf0.a(plus2);
                        pey o = vng.o(view2);
                        Lifecycle lifecycle = o != null ? o.getLifecycle() : null;
                        if (lifecycle == null) {
                            ixv.c("ViewTreeLifecycleOwner not found from " + view2);
                            ny61.A();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View v) {
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View v) {
                                view2.removeOnAttachStateChangeListener(this);
                                jVar.A();
                            }
                        });
                        lifecycle.a(new u(a3, eVar, jVar, ref$ObjectRef));
                        view2.setTag(ohh0.androidx_compose_ui_view_composition_context, jVar);
                        final pzt0 N = tje.N(hjt.a, i6u.d(view2.getHandler(), "windowRecomposer cleanup").x, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(jVar, view2, null), 2);
                        view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View v) {
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View v) {
                                v.removeOnAttachStateChangeListener(this);
                                l8x.this.a(null);
                            }
                        });
                    } else {
                        if (!(a2 instanceof androidx.compose.runtime.j)) {
                            ny61.r("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        jVar = (androidx.compose.runtime.j) a2;
                    }
                    return cacheIfAlive(jVar);
                }
            }
        }
        return ttdVar;
    }

    private final void setParentContext(ttd ttdVar) {
        if (this.parentContext != ttdVar) {
            this.parentContext = ttdVar;
            if (ttdVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            rtd rtdVar = this.composition;
            if (rtdVar != null) {
                rtdVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final i updateAutoCreatedComposeViewContext(View contextView, i existingContext) {
        ttd resolveParentCompositionContext = resolveParentCompositionContext();
        pey o = vng.o(contextView);
        rs31 z = rzo.z(contextView);
        j2m0 l = s8o.l(contextView);
        ttd ttdVar = existingContext.b;
        j2m0 j2m0Var = existingContext.d;
        pey peyVar = existingContext.c;
        if (resolveParentCompositionContext == ttdVar && o == peyVar && z == existingContext.e && l == j2m0Var) {
            return existingContext;
        }
        if (resolveParentCompositionContext.k() != existingContext.b.k()) {
            disposeComposition();
        }
        if (o == null) {
            o = peyVar;
        }
        i iVar = new i(existingContext, contextView, resolveParentCompositionContext, o, l == null ? j2m0Var : l, z);
        contextView.setTag(ohh0.androidx_compose_ui_view_compose_view_context, new WeakReference(iVar));
        return iVar;
    }

    public abstract void Content(fid fidVar, int i);

    @Override // android.view.ViewGroup
    public void addView(View child) {
        checkAddView();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        return super.addViewInLayout(child, index, params);
    }

    public final void createComposition() {
        i iVar;
        View view;
        if (this.parentContext == null && !isAttachedToWindow() && ((iVar = this.composeViewContext) == null || iVar == null || (view = iVar.a) == null || !view.isAttachedToWindow())) {
            ny61.r("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            ensureCompositionCreated();
        }
    }

    public final void disposeComposition() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null) {
            androidComposeView.removeConnectionToComposeViewContext();
        }
        rtd rtdVar = this.composition;
        if (rtdVar != null) {
            rtdVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m45getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(ohh0.auto_clear_focus_behavior_tag);
        mp3 mp3Var = tag instanceof mp3 ? (mp3) tag : null;
        if (mp3Var != null) {
            return mp3Var.b();
        }
        return 1;
    }

    /* renamed from: getComposeViewContext$ui, reason: from getter */
    public final i getComposeViewContext() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hz40 hz40Var = f851.a;
        Object p = qke.p(this);
        View view = this;
        while (p instanceof View) {
            View view2 = (View) p;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            p = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new b7(0, this));
        } else {
            attachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ensureCompositionCreated();
        internalOnMeasure$ui(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(layoutDirection);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m46setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(ohh0.auto_clear_focus_behavior_tag, mp3.a(i));
    }

    public final void setComposeViewContext$ui(i iVar) {
        if (this.composeViewContext != iVar) {
            if (iVar == null) {
                disposeComposition();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != iVar.b.k()) {
                        disposeComposition();
                    }
                    androidComposeView.setComposeViewContext(iVar);
                }
            }
            this.composeViewContext = iVar;
        }
    }

    public final void setParentCompositionContext(ttd parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((m390) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(vp31 strategy) {
        sls slsVar = this.disposeViewCompositionStrategy;
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        checkAddView();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View child, int index, ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        checkAddView();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        checkAddView();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        checkAddView();
        super.addView(child, index, params);
    }

    public final void createComposition(i composeViewContext) {
        if (composeViewContext.a.isAttachedToWindow()) {
            setComposeViewContext$ui(composeViewContext);
            ensureCompositionCreated();
        } else {
            ny61.r("createComposition requires the ComposeViewContext's view to be attached to a window.");
        }
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
