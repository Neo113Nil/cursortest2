package com.yandex.div.core.view2.divs.pager;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.widget.DivViewWrapper;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerPageLayout;", "Lcom/yandex/div/core/widget/DivViewWrapper;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "isHorizontal", "<init>", "(Landroid/content/Context;Lsls;)V", "", "parentSpec", "getMinimumSize", "(I)I", "size", "alongScrollAxis", "getSpec", "(IIZ)I", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/view/View;", "child", "", "drawingTime", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "Lsls;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivPagerPageLayout extends DivViewWrapper {
    private final sls isHorizontal;

    public DivPagerPageLayout(Context context, sls slsVar) {
        super(context, null, 0, 6, null);
        this.isHorizontal = slsVar;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private final int getMinimumSize(int parentSpec) {
        if (View.MeasureSpec.getMode(parentSpec) == 0) {
            return 0;
        }
        return View.MeasureSpec.getSize(parentSpec);
    }

    private final int getSpec(int size, int parentSpec, boolean alongScrollAxis) {
        return (alongScrollAxis || size == -1 || size == -3) ? parentSpec : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            com.yandex.div.core.view2.divs.a.r(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, defpackage.ugk
    public /* bridge */ /* synthetic */ void invalidateBorder() {
        super.invalidateBorder();
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper
    public void onBoundsChanged(int i, int i2) {
        com.yandex.div.core.view2.divs.widgets.a divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.g();
        }
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (getChildCount() == 0) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
        boolean booleanValue = ((Boolean) this.isHorizontal.invoke()).booleanValue();
        if (booleanValue) {
            setMinimumHeight(getMinimumSize(heightMeasureSpec));
        } else {
            setMinimumWidth(getMinimumSize(widthMeasureSpec));
        }
        super.onMeasure(getSpec(layoutParams.width, widthMeasureSpec, booleanValue), getSpec(layoutParams.height, heightMeasureSpec, !booleanValue));
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, defpackage.ugk
    public /* bridge */ /* synthetic */ void releaseBorderDrawer() {
        super.releaseBorderDrawer();
    }
}
