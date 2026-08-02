package com.yandex.div.core.view2;

import android.graphics.Rect;
import android.view.View;

/* compiled from: ViewVisibilityCalculator.kt */
/* loaded from: classes7.dex */
public class ViewVisibilityCalculator {
    private final Rect visibleRect = new Rect();

    public int calculateVisibilityPercentage(View view) {
        if (!view.isShown() || !view.getGlobalVisibleRect(this.visibleRect)) {
            return 0;
        }
        return ((this.visibleRect.height() * this.visibleRect.width()) * 100) / (view.getHeight() * view.getWidth());
    }

    public boolean isViewFullyVisible(View view) {
        return view.isShown() && view.getGlobalVisibleRect(this.visibleRect) && view.getWidth() == this.visibleRect.width() && view.getHeight() == this.visibleRect.height();
    }
}
