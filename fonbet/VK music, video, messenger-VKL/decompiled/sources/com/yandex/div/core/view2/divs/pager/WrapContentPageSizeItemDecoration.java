package com.yandex.div.core.view2.divs.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div2.DivPager;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;

/* compiled from: WrapContentPageSizeItemDecoration.kt */
/* loaded from: classes7.dex */
public final class WrapContentPageSizeItemDecoration extends RecyclerView.n {
    private final DivPager.ItemAlignment alignment;
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

    /* compiled from: WrapContentPageSizeItemDecoration.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivPager.ItemAlignment.values().length];
            try {
                iArr[DivPager.ItemAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivPager.ItemAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivPager.ItemAlignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WrapContentPageSizeItemDecoration(int i, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        this.parentSize = i;
        this.paddings = divPagerPaddingsHolder;
        this.alignment = itemAlignment;
    }

    private final int getBottomOffset(View view) {
        float start;
        int i = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i == 1) {
            start = (this.parentSize - this.paddings.getStart()) - view.getMeasuredHeight();
        } else if (i == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = this.paddings.getEnd();
        }
        return an10.b(start);
    }

    private final int getHorizontalOffset(View view) {
        float start;
        int measuredWidth;
        float f;
        int i = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i == 1) {
            start = this.parentSize - this.paddings.getStart();
            measuredWidth = view.getMeasuredWidth();
        } else {
            if (i == 2) {
                f = (this.parentSize - view.getMeasuredWidth()) / 2.0f;
                return an10.b(f);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = this.parentSize - this.paddings.getEnd();
            measuredWidth = view.getMeasuredWidth();
        }
        f = start - measuredWidth;
        return an10.b(f);
    }

    private final int getTopOffset(View view) {
        float start;
        int i = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i == 1) {
            start = this.paddings.getStart();
        } else if (i == 2) {
            start = (this.parentSize - view.getMeasuredHeight()) / 2.0f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = (this.parentSize - this.paddings.getEnd()) - view.getMeasuredHeight();
        }
        return an10.b(start);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View child;
        int width = recyclerView.getWidth();
        DivPagerPaddingsHolder divPagerPaddingsHolder = this.paddings;
        int b = width - an10.b(divPagerPaddingsHolder.getRight() + divPagerPaddingsHolder.getLeft());
        int height = recyclerView.getHeight();
        DivPagerPaddingsHolder divPagerPaddingsHolder2 = this.paddings;
        view.measure(ViewsKt.makeExactSpec(b), ViewsKt.makeExactSpec(height - an10.b(divPagerPaddingsHolder2.getBottom() + divPagerPaddingsHolder2.getTop())));
        DivPagerPageLayout divPagerPageLayout = view instanceof DivPagerPageLayout ? (DivPagerPageLayout) view : null;
        if (divPagerPageLayout == null || (child = divPagerPageLayout.getChild()) == null) {
            return;
        }
        Integer alignedLeft = this.paddings.getAlignedLeft();
        int intValue = alignedLeft != null ? alignedLeft.intValue() : getHorizontalOffset(child);
        Integer alignedTop = this.paddings.getAlignedTop();
        int intValue2 = alignedTop != null ? alignedTop.intValue() : getTopOffset(child);
        Integer alignedRight = this.paddings.getAlignedRight();
        int intValue3 = alignedRight != null ? alignedRight.intValue() : getHorizontalOffset(child);
        Integer alignedBottom = this.paddings.getAlignedBottom();
        rect.set(intValue, intValue2, intValue3, alignedBottom != null ? alignedBottom.intValue() : getBottomOffset(child));
    }
}
