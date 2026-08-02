package com.yandex.div.core.view2.divs.pager;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivPager;
import kotlin.NoWhenBranchMatchedException;
import xsna.pnn;

/* compiled from: PercentagePageSizeProvider.kt */
/* loaded from: classes7.dex */
public final class PercentagePageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourSize;
    private final double pageWidthPercentage;

    /* compiled from: PercentagePageSizeProvider.kt */
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PercentagePageSizeProvider(pnn pnnVar, ExpressionResolver expressionResolver, int i, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        super(i, divPagerPaddingsHolder, itemAlignment);
        float start;
        float itemSize;
        float f;
        double doubleValue = pnnVar.a.a.evaluate(expressionResolver).doubleValue();
        this.pageWidthPercentage = doubleValue;
        this.itemSize = (float) ((i * doubleValue) / 100);
        int i2 = WhenMappings.$EnumSwitchMapping$0[itemAlignment.ordinal()];
        if (i2 == 1) {
            start = i - divPagerPaddingsHolder.getStart();
            itemSize = getItemSize();
        } else if (i2 == 2) {
            f = (i - getItemSize()) / 2;
            this.neighbourSize = f;
            this.hasOffScreenPages = doubleValue < 100.0d;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = i - divPagerPaddingsHolder.getEnd();
            itemSize = getItemSize();
        }
        f = start - itemSize;
        this.neighbourSize = f;
        this.hasOffScreenPages = doubleValue < 100.0d;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public boolean getHasOffScreenPages() {
        return this.hasOffScreenPages;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getItemSize() {
        return this.itemSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getNeighbourSize() {
        return this.neighbourSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    public Float getItemSize(int i) {
        return Float.valueOf(getItemSize());
    }
}
