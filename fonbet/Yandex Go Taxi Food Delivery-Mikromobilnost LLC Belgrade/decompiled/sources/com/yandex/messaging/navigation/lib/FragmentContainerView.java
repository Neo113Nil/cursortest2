package com.yandex.messaging.navigation.lib;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u000fJ\u0017\u0010$\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u000fJ\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010,\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u000fJ\u001f\u0010/\u001a\u00020\r2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\r2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\rH\u0016¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u001fH\u0014¢\u0006\u0004\b5\u00106R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/yandex/messaging/navigation/lib/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "v", "Lzy11;", "addDisappearingFragmentView", "(Landroid/view/View;)V", "Landroid/animation/LayoutTransition;", "transition", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "index", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "animate", "removeDetachedView", "(Landroid/view/View;Z)V", "Ljava/util/ArrayList;", "mDisappearingFragmentChildren", "Ljava/util/ArrayList;", "mTransitioningFragmentViews", "mDrawDisappearingViewsFirst", "Z", "navigation-lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public class FragmentContainerView extends FrameLayout {
    private ArrayList<View> mDisappearingFragmentChildren;
    private boolean mDrawDisappearingViewsFirst;
    private ArrayList<View> mTransitioningFragmentViews;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void addDisappearingFragmentView(View v) {
        ArrayList<View> arrayList;
        if (v.getAnimation() != null || ((arrayList = this.mTransitioningFragmentViews) != null && arrayList.contains(v))) {
            if (this.mDisappearingFragmentChildren == null) {
                this.mDisappearingFragmentChildren = new ArrayList<>();
            }
            this.mDisappearingFragmentChildren.add(v);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<View> arrayList;
        if (this.mDrawDisappearingViewsFirst && (arrayList = this.mDisappearingFragmentChildren) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                super.drawChild(canvas, this.mDisappearingFragmentChildren.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        ArrayList<View> arrayList;
        if (!this.mDrawDisappearingViewsFirst || (arrayList = this.mDisappearingFragmentChildren) == null || arrayList.size() <= 0 || !this.mDisappearingFragmentChildren.contains(child)) {
            return super.drawChild(canvas, child, drawingTime);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.mTransitioningFragmentViews;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.mDisappearingFragmentChildren;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.mDrawDisappearingViewsFirst = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(insets));
        }
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            addDisappearingFragmentView(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View child, boolean animate) {
        if (animate) {
            addDisappearingFragmentView(child);
        }
        super.removeDetachedView(child, animate);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        addDisappearingFragmentView(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        addDisappearingFragmentView(getChildAt(index));
        super.removeViewAt(index);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        addDisappearingFragmentView(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        int i = start + count;
        for (int i2 = start; i2 < i; i2++) {
            addDisappearingFragmentView(getChildAt(i2));
        }
        super.removeViews(start, count);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        int i = start + count;
        for (int i2 = start; i2 < i; i2++) {
            addDisappearingFragmentView(getChildAt(i2));
        }
        super.removeViewsInLayout(start, count);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.mDrawDisappearingViewsFirst = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.mTransitioningFragmentViews == null) {
                this.mTransitioningFragmentViews = new ArrayList<>();
            }
            this.mTransitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context) {
        super(context);
        this.mDrawDisappearingViewsFirst = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawDisappearingViewsFirst = true;
    }
}
