package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div2.ec;
import com.yandex.div2.zb;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes7.dex */
public abstract class DivTextRangesBackgroundRenderer {
    private final int getLineBottomWithoutSpacing(Layout layout, int i) {
        int lineBottom = layout.getLineBottom(i);
        boolean z = i == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if (spacingAdd == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && spacingMultiplier == 1.0f) {
            return lineBottom;
        }
        if (z) {
            return lineBottom;
        }
        if (Float.compare(spacingMultiplier, 1.0f) != 0) {
            float lineHeight = getLineHeight(layout, i);
            spacingAdd = lineHeight - ((lineHeight - spacingAdd) / spacingMultiplier);
        }
        return (int) (lineBottom - spacingAdd);
    }

    private final int getLineHeight(Layout layout, int i) {
        return layout.getLineTop(i + 1) - layout.getLineTop(i);
    }

    public abstract void draw(Canvas canvas, Layout layout, int i, int i2, int i3, int i4, ec ecVar, zb zbVar);

    public final int getLineBottom(Layout layout, int i) {
        int lineBottomWithoutSpacing = getLineBottomWithoutSpacing(layout, i);
        return i == layout.getLineCount() + (-1) ? lineBottomWithoutSpacing - layout.getBottomPadding() : lineBottomWithoutSpacing;
    }

    public final int getLineTop(Layout layout, int i) {
        int lineTop = layout.getLineTop(i);
        return i == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
