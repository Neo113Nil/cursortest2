package com.yandex.go.navigator.gas_stations.filters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.navigator.ui.BubbleGridView;
import defpackage.rqr;
import defpackage.tje;
import defpackage.vws;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.FlowLayout;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/filters/GasStationsServiceFiltersView;", "Lcom/yandex/go/navigator/ui/BubbleGridView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "maxLines", "Ljava/lang/Integer;", "getMaxLines", "()Ljava/lang/Integer;", "setMaxLines", "(Ljava/lang/Integer;)V", "Lvws;", "adapter", "Lvws;", "getAdapter", "()Lvws;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GasStationsServiceFiltersView extends BubbleGridView {
    public static final int $stable = 8;
    private final vws adapter;
    private Integer maxLines;

    public GasStationsServiceFiltersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.adapter = new vws(this);
        setGravity(8388611);
        setLineSpacing(tje.u(8, getContext()));
        setItemSpacing(tje.u(8, getContext()));
    }

    public final Integer getMaxLines() {
        return this.maxLines;
    }

    @Override // ru.yandex.taxi.widget.FlowLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int i5;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        if (!getFixedColumns() || getMaxColumns() <= 0 || mode == 0) {
            i = widthMeasureSpec;
        } else {
            int maxColumns = getMaxColumns();
            i = View.MeasureSpec.makeMeasureSpec((getPaddingRight() + (getPaddingLeft() + (((i6 - getPaddingLeft()) - getPaddingRight()) / maxColumns))) - (((maxColumns - 1) * getItemSpacing()) / maxColumns), 1073741824);
        }
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int childCount = getChildCount();
        int i7 = paddingTop;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            int i12 = paddingLeft2;
            Integer num = this.maxLines;
            int i13 = childCount;
            if (num != null && i10 >= num.intValue() && childAt.getTag() != "show_all" && !childAt.isSelected()) {
                childAt.setVisibility(8);
                childAt = getChildAt(getChildCount() - 1);
                childAt.setVisibility(0);
            }
            int i14 = i7;
            if (childAt.getVisibility() == 8) {
                i5 = paddingRight;
                i2 = i;
            } else {
                measureChild(childAt, i, heightMeasureSpec);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                i2 = i;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i15 = i3;
                int measuredWidth = childAt.getMeasuredWidth() + i12 + i3;
                int maxColumns2 = getMaxColumns();
                if ((measuredWidth > paddingRight || (maxColumns2 > 0 && i11 % maxColumns2 == 0 && i8 != 0)) && !getSingleLine()) {
                    i10++;
                    Integer num2 = this.maxLines;
                    if (num2 == null || i10 < num2.intValue() || childAt.getTag() == "show_all" || childAt.isSelected()) {
                        paddingLeft = getPaddingLeft();
                        i14 = getLineSpacing() + paddingTop;
                    } else {
                        childAt.setVisibility(8);
                        i5 = paddingRight;
                    }
                } else {
                    paddingLeft = i12;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + paddingLeft + i15;
                i5 = paddingRight;
                int i16 = paddingLeft;
                View view = childAt;
                int max = (int) Math.max(paddingTop, childAt.getMeasuredHeight() + i14);
                if (measuredWidth2 > i9) {
                    i9 = measuredWidth2;
                }
                int itemSpacing = getItemSpacing() + view.getMeasuredWidth() + i15 + i4 + i16;
                if (i8 == getChildCount() - 1) {
                    i9 += i4;
                }
                i11++;
                paddingTop = max;
                paddingLeft2 = itemSpacing;
                i7 = i14;
                i8++;
                childCount = i13;
                paddingRight = i5;
                i = i2;
            }
            paddingLeft2 = i12;
            i7 = i14;
            i8++;
            childCount = i13;
            paddingRight = i5;
            i = i2;
        }
        int paddingRight2 = getPaddingRight() + i9;
        int paddingBottom = getPaddingBottom() + paddingTop;
        FlowLayout.Companion.getClass();
        setMeasuredDimension(rqr.a(size, mode, paddingRight2), rqr.a(size2, mode2, paddingBottom));
    }

    public final void setMaxLines(Integer num) {
        this.maxLines = num;
    }

    @Override // com.yandex.go.navigator.ui.BubbleGridView
    public vws getAdapter() {
        return this.adapter;
    }

    public GasStationsServiceFiltersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GasStationsServiceFiltersView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GasStationsServiceFiltersView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
