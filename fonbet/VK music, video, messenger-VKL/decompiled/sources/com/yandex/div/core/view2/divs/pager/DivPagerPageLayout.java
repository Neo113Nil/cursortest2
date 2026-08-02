package com.yandex.div.core.view2.divs.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.core.widget.ViewsKt;
import xsna.gzs;

/* compiled from: DivPagerPageLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class DivPagerPageLayout extends DivViewWrapper {
    private final gzs<Boolean> isHorizontal;

    public DivPagerPageLayout(Context context, gzs<Boolean> gzsVar) {
        super(context, null, 0, 6, null);
        this.isHorizontal = gzsVar;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private final int getMinimumSize(int i) {
        if (ViewsKt.isUnspecified(i)) {
            return 0;
        }
        return View.MeasureSpec.getSize(i);
    }

    private final int getSpec(int i, int i2, boolean z) {
        return (z || i == -1 || i == -3) ? i2 : ViewsKt.makeUnspecifiedSpec();
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
        boolean booleanValue = this.isHorizontal.invoke().booleanValue();
        if (booleanValue) {
            setMinimumHeight(getMinimumSize(i2));
        } else {
            setMinimumWidth(getMinimumSize(i));
        }
        super.onMeasure(getSpec(layoutParams.width, i, booleanValue), getSpec(layoutParams.height, i2, !booleanValue));
    }
}
