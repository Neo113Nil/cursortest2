package com.yandex.div.core.view2.divs.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.DivLayoutParams;
import defpackage.m810;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJQ\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u000bR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001e¨\u0006&"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemLayout;", "Lcom/yandex/div/core/widget/DivViewWrapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "setEmptySize", "(II)V", "parentSpec", "paddings", "size", "minSize", "maxSize", "margins", "", "alongScrollAxis", "considerMatchParent", "getMeasureSpec", "(IIIIIIZZ)Ljava/lang/Integer;", "onMeasure", "Lkotlin/Function0;", "orientation", "Lsls;", "getOrientation", "()Lsls;", "setOrientation", "(Lsls;)V", "columnCount", "getColumnCount", "setColumnCount", "", "crossSpacing", "getCrossSpacing", "setCrossSpacing", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivGalleryItemLayout extends DivViewWrapper {
    private sls columnCount;
    private sls crossSpacing;
    private sls orientation;

    public DivGalleryItemLayout(Context context) {
        super(context, null, 0, 6, null);
        this.orientation = DivGalleryItemLayout$orientation$1.w;
        this.columnCount = DivGalleryItemLayout$columnCount$1.w;
        this.crossSpacing = DivGalleryItemLayout$crossSpacing$1.w;
    }

    private final Integer getMeasureSpec(int parentSpec, int paddings, int size, int minSize, int maxSize, int margins, boolean alongScrollAxis, boolean considerMatchParent) {
        int i;
        int size2 = View.MeasureSpec.getSize(parentSpec) - paddings;
        if (!alongScrollAxis) {
            size2 = m810.b((size2 - (((Number) this.crossSpacing.invoke()).floatValue() * (((Number) this.columnCount.invoke()).intValue() - 1))) / ((Number) this.columnCount.invoke()).floatValue());
        }
        int i2 = maxSize == Integer.MAX_VALUE ? maxSize : maxSize + margins;
        if (alongScrollAxis || size != -1 || View.MeasureSpec.getMode(parentSpec) != 0) {
            i = size;
        } else {
            if (!considerMatchParent) {
                return null;
            }
            i = -2;
        }
        if (i == -3) {
            return Integer.valueOf(View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(size2, minSize + margins), i2), Integer.MIN_VALUE));
        }
        if (i != -2) {
            return i != -1 ? Integer.valueOf(View.MeasureSpec.makeMeasureSpec(size + margins, 1073741824)) : Integer.valueOf(View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(size2, minSize + margins), i2), 1073741824));
        }
        return Integer.valueOf(maxSize == Integer.MAX_VALUE ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }

    private final void setEmptySize(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), widthMeasureSpec, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight(), heightMeasureSpec, 0));
    }

    public final sls getColumnCount() {
        return this.columnCount;
    }

    public final sls getCrossSpacing() {
        return this.crossSpacing;
    }

    public final sls getOrientation() {
        return this.orientation;
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
        View child = getChild();
        if (child == null) {
            setEmptySize(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) child.getLayoutParams();
        DivRecyclerView divRecyclerView = (DivRecyclerView) getParent();
        boolean z = ((Number) this.orientation.invoke()).intValue() == 0;
        Integer measureSpec = getMeasureSpec(divRecyclerView.getWidthMeasureSpec(), divRecyclerView.getPaddingLeft() + divRecyclerView.getPaddingRight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth(), divLayoutParams.getHorizontalMargins$div_release(), z, divRecyclerView.getConsiderMatchParent());
        Integer measureSpec2 = getMeasureSpec(divRecyclerView.getHeightMeasureSpec(), divRecyclerView.getPaddingBottom() + divRecyclerView.getPaddingTop(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight(), divLayoutParams.getVerticalMargins$div_release(), !z, divRecyclerView.getConsiderMatchParent());
        if (measureSpec == null || measureSpec2 == null) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(measureSpec.intValue(), measureSpec2.intValue());
        }
    }

    @Override // com.yandex.div.core.widget.DivViewWrapper, defpackage.ugk
    public /* bridge */ /* synthetic */ void releaseBorderDrawer() {
        super.releaseBorderDrawer();
    }

    public final void setColumnCount(sls slsVar) {
        this.columnCount = slsVar;
    }

    public final void setCrossSpacing(sls slsVar) {
        this.crossSpacing = slsVar;
    }

    public final void setOrientation(sls slsVar) {
        this.orientation = slsVar;
    }
}
