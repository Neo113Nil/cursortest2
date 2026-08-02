package com.yandex.div.core.view2.divs.pager;

import com.yandex.div2.DivPager;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivPagerPageSizeProvider.kt */
/* loaded from: classes7.dex */
public abstract class DivPagerPageSizeProvider {
    private final DivPager.ItemAlignment alignment;
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

    /* compiled from: DivPagerPageSizeProvider.kt */
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

    public DivPagerPageSizeProvider(int i, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        this.parentSize = i;
        this.paddings = divPagerPaddingsHolder;
        this.alignment = itemAlignment;
    }

    private final Float getCenteredNeighbourSize(int i) {
        Float itemSize = getItemSize(i);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - itemSize.floatValue()) / 2.0f);
    }

    public abstract Float getItemSize(int i);

    public final Float getNextNeighbourSize(int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return getCenteredNeighbourSize(i);
            }
            if (i2 == 3) {
                return Float.valueOf(this.paddings.getEnd());
            }
            throw new NoWhenBranchMatchedException();
        }
        Float itemSize = getItemSize(i);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - this.paddings.getStart()) - itemSize.floatValue());
    }

    public final Float getPrevNeighbourSize(int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i2 == 1) {
            return Float.valueOf(this.paddings.getStart());
        }
        if (i2 == 2) {
            return getCenteredNeighbourSize(i);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Float itemSize = getItemSize(i);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - this.paddings.getEnd()) - itemSize.floatValue());
    }
}
