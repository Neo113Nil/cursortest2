package com.yandex.div.core.view2.divs.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.DivLayoutParams;

/* compiled from: DivGalleryItemLayout.kt */
/* loaded from: classes7.dex */
public final class DivGalleryItemLayout extends DivViewWrapper {
    public DivGalleryItemLayout(Context context) {
        super(context, null, 0, 6, null);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, 0, layoutParams);
        if (getLayoutParams() == null) {
            if ((view != null ? view.getLayoutParams() : null) != null) {
                setLayoutParams(view.getLayoutParams());
            }
        }
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null || !layoutParams.equals(getLayoutParams());
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams instanceof DivLayoutParams ? layoutParams : layoutParams == null ? new DivLayoutParams(-2, -2) : super.generateLayoutParams(layoutParams);
    }

    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams by;
        by = DivGalleryItemLayoutKt.setBy(generateDefaultLayoutParams(), layoutParams);
        return by;
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View child = getChild();
        if (child != null) {
            child.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i, int i2) {
        View child = getChild();
        if (child != null) {
            child.measure(i, i2);
            setMeasuredDimension(child.getMeasuredWidthAndState(), child.getMeasuredHeightAndState());
            return;
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), i, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight(), i2, 0));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        View child = getChild();
        if (child == null) {
            super.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams != null) {
            DivGalleryItemLayoutKt.setBy(layoutParams, child.getLayoutParams());
        }
        super.setLayoutParams(layoutParams);
        child.setLayoutParams(layoutParams);
    }
}
