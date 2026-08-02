package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.y;
import com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector;
import defpackage.isc0;
import defpackage.lg91;
import defpackage.ltg;
import defpackage.ny61;
import defpackage.o6;
import defpackage.p6;
import defpackage.s9h;
import defpackage.wdh;
import defpackage.yjc0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001&\b\u0000\u0018\u0000 /2\u00020\u0001:\u00010B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/yandex/plus/home/plaque/plugin/internal/defaults/DefaultLifecycleVisibilityDetector;", "Lcom/yandex/plus/home/plaque/feature/api/PlaqueViewVisibilityDetector;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "visiblePercent", "Lltg;", "debouncer", "<init>", "(Landroidx/lifecycle/Lifecycle;FLltg;)V", "Landroid/view/View;", "view", "Lzy11;", "handleAttachFirstView", "(Landroid/view/View;)V", "handleDetachLastView", "checkVisibility", "()V", "", "visible", "fireListeners", "(Z)V", "Lisc0;", "listener", "addListener", "(Lisc0;)V", "removeListener", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroidx/lifecycle/Lifecycle;", "F", "Lltg;", "", "listeners", "Ljava/util/Map;", "", "attachedViews", "Ljava/util/Set;", "com/yandex/plus/home/plaque/plugin/internal/defaults/a", "lifecycleObserver", "Lcom/yandex/plus/home/plaque/plugin/internal/defaults/a;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "onScrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Companion", "wdh", "plus-home-plaque-plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultLifecycleVisibilityDetector implements PlaqueViewVisibilityDetector {
    private static final wdh Companion = new wdh();
    private static final float DEFAULT_VIEW_VISIBLE_PERCENT = 0.5f;
    private final Set<View> attachedViews;
    private final ltg debouncer;
    private final Lifecycle lifecycle;
    private final a lifecycleObserver;
    private final Map<isc0, Boolean> listeners;
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
    private final float visiblePercent;

    public DefaultLifecycleVisibilityDetector(Lifecycle lifecycle, float f, ltg ltgVar) {
        this.lifecycle = lifecycle;
        this.visiblePercent = f;
        this.debouncer = ltgVar;
        this.listeners = new WeakHashMap();
        this.attachedViews = new LinkedHashSet();
        this.lifecycleObserver = new a(this);
        this.onGlobalLayoutListener = new o6(4, this);
        this.onScrollChangedListener = new p6(2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ff, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x009b, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.ViewParent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void checkVisibility() {
        boolean z;
        ViewGroup viewGroup;
        int indexOfChild;
        boolean z2 = false;
        for (View view : this.attachedViews) {
            float f = this.visiblePercent;
            View rootView = view.getRootView();
            double d = f;
            if (0.0d > d || d > 1.0d) {
                ny61.g("percentNeeded must be 0.0 <= percentNeeded <= 1.0!");
                return;
            }
            if (view.getVisibility() == 0) {
                Rect rect = new Rect();
                int measuredWidth = view.getMeasuredWidth();
                if (measuredWidth < 1) {
                    measuredWidth = 1;
                }
                int measuredHeight = view.getMeasuredHeight();
                rect.set(0, 0, measuredWidth, measuredHeight >= 1 ? measuredHeight : 1);
                ?? parent = view.getParent();
                if (parent != 0) {
                    parent.getChildVisibleRect(view, rect, null);
                    View rootView2 = view.getRootView();
                    z = rect.intersect(rootView2.getLeft(), rootView2.getTop(), rootView2.getRight(), rootView2.getBottom());
                } else {
                    z = false;
                }
                if (z) {
                    float height = rect.height() * rect.width() * f;
                    if (rect.height() * rect.width() >= height) {
                        Region region = new Region(rect);
                        ViewParent parent2 = view.getParent();
                        if (parent2 instanceof ViewGroup) {
                            viewGroup = (ViewGroup) parent2;
                            while (true) {
                                ViewGroup viewGroup2 = viewGroup;
                                View view2 = view;
                                view = viewGroup2;
                                if (view == 0) {
                                    z2 = view2.equals(rootView);
                                    break;
                                }
                                if (view.getVisibility() != 0 || (indexOfChild = view.indexOfChild(view2)) < 0) {
                                    break;
                                }
                                int i = indexOfChild + 1;
                                Rect rect2 = new Rect();
                                Region region2 = new Region();
                                int childCount = view.getChildCount();
                                while (i < childCount) {
                                    View childAt = view.getChildAt(i);
                                    region2.setEmpty();
                                    if (lg91.b(region2, childAt, rect2) && (!region.op(region2, Region.Op.DIFFERENCE) || region.isEmpty())) {
                                        break;
                                    }
                                    RegionIterator regionIterator = new RegionIterator(region);
                                    Rect rect3 = new Rect();
                                    int i2 = 0;
                                    while (regionIterator.next(rect3)) {
                                        i2 = (rect3.height() * rect3.width()) + i2;
                                        if (i2 >= height) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                ViewParent parent3 = view.getParent();
                                if (parent3 instanceof ViewGroup) {
                                    viewGroup = (ViewGroup) parent3;
                                }
                            }
                        }
                        viewGroup = null;
                    }
                }
            }
            z2 = false;
            if (z2) {
                break;
            }
        }
        fireListeners(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireListeners(boolean visible) {
        Iterator<T> it = this.listeners.keySet().iterator();
        while (it.hasNext()) {
            ((yjc0) ((isc0) it.next())).a(visible);
        }
    }

    private final void handleAttachFirstView(View view) {
        this.lifecycle.a(this.lifecycleObserver);
        ViewTreeObserver viewTreeObserver = view.getRootView().getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        viewTreeObserver.addOnScrollChangedListener(this.onScrollChangedListener);
    }

    private final void handleDetachLastView(View view) {
        view.getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        view.getRootView().getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        this.lifecycle.d(this.lifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGlobalLayoutListener$lambda$0(DefaultLifecycleVisibilityDetector defaultLifecycleVisibilityDetector) {
        ((s9h) defaultLifecycleVisibilityDetector.debouncer).a(new DefaultLifecycleVisibilityDetector$onGlobalLayoutListener$1$1(0, defaultLifecycleVisibilityDetector, DefaultLifecycleVisibilityDetector.class, "checkVisibility", "checkVisibility()V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScrollChangedListener$lambda$1(DefaultLifecycleVisibilityDetector defaultLifecycleVisibilityDetector) {
        ((s9h) defaultLifecycleVisibilityDetector.debouncer).a(new DefaultLifecycleVisibilityDetector$onScrollChangedListener$1$1(0, defaultLifecycleVisibilityDetector, DefaultLifecycleVisibilityDetector.class, "checkVisibility", "checkVisibility()V", 0));
    }

    @Override // com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector
    public void addListener(isc0 listener) {
        this.listeners.put(listener, Boolean.TRUE);
    }

    @Override // com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        boolean isEmpty = this.attachedViews.isEmpty();
        if (this.attachedViews.add(view)) {
            if (isEmpty) {
                handleAttachFirstView(view);
            }
            ((s9h) this.debouncer).c(new DefaultLifecycleVisibilityDetector$onViewAttachedToWindow$1(0, this, DefaultLifecycleVisibilityDetector.class, "checkVisibility", "checkVisibility()V", 0));
        }
    }

    @Override // com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        if (this.attachedViews.remove(view)) {
            if (this.attachedViews.isEmpty()) {
                handleDetachLastView(view);
                ((s9h) this.debouncer).b().removeMessages(1);
                fireListeners(false);
            } else {
                ((s9h) this.debouncer).c(new DefaultLifecycleVisibilityDetector$onViewDetachedFromWindow$1(0, this, DefaultLifecycleVisibilityDetector.class, "checkVisibility", "checkVisibility()V", 0));
            }
        }
    }

    @Override // com.yandex.plus.home.plaque.feature.api.PlaqueViewVisibilityDetector
    public void removeListener(isc0 listener) {
        this.listeners.remove(listener);
    }

    public DefaultLifecycleVisibilityDetector() {
        this(null, 0.0f, null, 7, null);
    }

    public DefaultLifecycleVisibilityDetector(Lifecycle lifecycle, float f, ltg ltgVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? y.A.y : lifecycle, (i & 2) != 0 ? 0.5f : f, (i & 4) != 0 ? new s9h(0) : ltgVar);
    }
}
