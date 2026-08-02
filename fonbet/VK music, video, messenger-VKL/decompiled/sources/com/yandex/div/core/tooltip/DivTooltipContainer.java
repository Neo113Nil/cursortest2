package com.yandex.div.core.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import xsna.zcl;

/* compiled from: DivTooltipContainer.kt */
/* loaded from: classes7.dex */
public class DivTooltipContainer extends DivViewWrapper {
    public /* synthetic */ DivTooltipContainer(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            Assert.fail("Adding more than one child view to DivTooltipContainer is not allowed.");
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public View getTooltipView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }

    public DivTooltipContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
    }
}
