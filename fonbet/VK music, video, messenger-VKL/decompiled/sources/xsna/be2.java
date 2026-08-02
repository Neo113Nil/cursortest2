package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import java.util.HashMap;

/* compiled from: AndroidViewsHandler.android.kt */
/* loaded from: classes11.dex */
public final class be2 extends ViewGroup {
    public final HashMap<xd2, LayoutNode> b;
    public final HashMap<LayoutNode, xd2> c;

    public be2(Context context) {
        super(context);
        setClipChildren(false);
        this.b = new HashMap<>();
        this.c = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<xd2, LayoutNode> getHolderToLayoutNode() {
        return this.b;
    }

    public final HashMap<LayoutNode, xd2> getLayoutNodeToHolder() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (xd2 xd2Var : this.b.keySet()) {
            xd2Var.layout(xd2Var.getLeft(), xd2Var.getTop(), xd2Var.getRight(), xd2Var.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            uzw.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            uzw.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (xd2 xd2Var : this.b.keySet()) {
            int i4 = xd2Var.w;
            if (i4 != Integer.MIN_VALUE && (i3 = xd2Var.x) != Integer.MIN_VALUE) {
                xd2Var.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutNode layoutNode = this.b.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.f0(layoutNode, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
