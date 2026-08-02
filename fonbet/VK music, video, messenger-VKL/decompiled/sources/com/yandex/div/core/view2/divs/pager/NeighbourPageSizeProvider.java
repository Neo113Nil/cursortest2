package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivPager;
import kotlin.NoWhenBranchMatchedException;
import xsna.ann;

/* compiled from: NeighbourPageSizeProvider.kt */
/* loaded from: classes7.dex */
public final class NeighbourPageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourPageWidth;
    private final float neighbourSize;

    /* compiled from: NeighbourPageSizeProvider.kt */
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

    public NeighbourPageSizeProvider(ann annVar, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, int i, float f, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPager.ItemAlignment itemAlignment) {
        super(i, divPagerPaddingsHolder, itemAlignment);
        float start;
        float neighbourSize;
        float pxF = BaseDivViewExtensionsKt.toPxF(annVar.a, displayMetrics, expressionResolver);
        this.neighbourPageWidth = pxF;
        this.neighbourSize = f + pxF;
        int i2 = WhenMappings.$EnumSwitchMapping$0[itemAlignment.ordinal()];
        if (i2 == 1) {
            start = i - divPagerPaddingsHolder.getStart();
            neighbourSize = getNeighbourSize();
        } else if (i2 == 2) {
            start = i;
            neighbourSize = getNeighbourSize() * 2;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = i - divPagerPaddingsHolder.getEnd();
            neighbourSize = getNeighbourSize();
        }
        this.itemSize = start - neighbourSize;
        this.hasOffScreenPages = pxF > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
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
