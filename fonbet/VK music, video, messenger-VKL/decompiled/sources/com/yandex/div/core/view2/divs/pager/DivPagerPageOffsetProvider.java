package com.yandex.div.core.view2.divs.pager;

import com.unity3d.services.UnityAdsConstants;
import com.yandex.div2.DivPager;
import xsna.u11;

/* compiled from: DivPagerPageOffsetProvider.kt */
/* loaded from: classes7.dex */
public final class DivPagerPageOffsetProvider {
    private final DivPagerAdapter adapter;
    private final DivPager.ItemAlignment alignment;
    private final boolean infiniteScroll;
    private final float itemSpacing;
    private final DivPagerPaddingsHolder paddings;
    private final DivPagerPageSizeProvider pageSizeProvider;
    private final int parentSize;

    public DivPagerPageOffsetProvider(int i, float f, DivPagerPageSizeProvider divPagerPageSizeProvider, DivPagerPaddingsHolder divPagerPaddingsHolder, boolean z, DivPagerAdapter divPagerAdapter, DivPager.ItemAlignment itemAlignment) {
        this.parentSize = i;
        this.itemSpacing = f;
        this.pageSizeProvider = divPagerPageSizeProvider;
        this.paddings = divPagerPaddingsHolder;
        this.infiniteScroll = z;
        this.adapter = divPagerAdapter;
        this.alignment = itemAlignment;
    }

    private final boolean biggerThan(float f, float f2) {
        return f >= Math.abs(f2);
    }

    private final boolean contentIsSmallerThanPager(int i, int i2) {
        float start = (this.parentSize - this.paddings.getStart()) - this.paddings.getEnd();
        Float itemSize = this.pageSizeProvider.getItemSize(i);
        if (itemSize != null) {
            float floatValue = itemSize.floatValue();
            if (floatValue >= start) {
                return false;
            }
            if (i != i2) {
                float f = this.itemSpacing;
                Float itemSize2 = this.pageSizeProvider.getItemSize(i2);
                if (itemSize2 == null) {
                    return true;
                }
                floatValue += itemSize2.floatValue() + f;
                if (floatValue >= start) {
                    return false;
                }
            }
            for (int i3 = i - 1; -1 < i3; i3--) {
                float f2 = this.itemSpacing;
                Float itemSize3 = this.pageSizeProvider.getItemSize(i3);
                if (itemSize3 == null) {
                    break;
                }
                floatValue += itemSize3.floatValue() + f2;
                if (floatValue >= start) {
                    return false;
                }
            }
            int itemCount = this.adapter.getItemCount();
            for (int i4 = i2 + 1; i4 < itemCount; i4++) {
                float f3 = this.itemSpacing;
                Float itemSize4 = this.pageSizeProvider.getItemSize(i4);
                if (itemSize4 == null) {
                    break;
                }
                floatValue += itemSize4.floatValue() + f3;
                if (floatValue >= start) {
                    return false;
                }
            }
        }
        return true;
    }

    private final float getEndOffset(float f, int i, int i2) {
        Float nextNeighbourSize;
        Float itemSize;
        if (this.alignment != DivPager.ItemAlignment.END && (nextNeighbourSize = this.pageSizeProvider.getNextNeighbourSize(i)) != null) {
            float floatValue = nextNeighbourSize.floatValue();
            Float nextNeighbourSize2 = this.pageSizeProvider.getNextNeighbourSize(i2);
            if (nextNeighbourSize2 != null) {
                float floatValue2 = nextNeighbourSize2.floatValue();
                float frac = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getFrac(f) : getFracInverted(f);
                float b = u11.b(1, frac, floatValue2, floatValue * frac) - this.paddings.getEnd();
                if (b != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (itemSize = this.pageSizeProvider.getItemSize(i2)) != null) {
                    float floatValue3 = itemSize.floatValue() * frac;
                    if (biggerThan(floatValue3, b)) {
                        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    int itemCount = this.adapter.getItemCount();
                    for (int i3 = i2 + 1; i3 < itemCount; i3++) {
                        Float itemSize2 = this.pageSizeProvider.getItemSize(i3);
                        if (itemSize2 == null) {
                            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        floatValue3 += itemSize2.floatValue() + this.itemSpacing;
                        if (biggerThan(floatValue3, b)) {
                            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                    }
                    return b - floatValue3;
                }
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private final float getFrac(float f) {
        float abs = Math.abs(f);
        return abs - ((float) Math.floor(abs));
    }

    private final float getFracInverted(float f) {
        float frac = getFrac(f);
        return frac > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 - frac : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private final float getInitialOffset(float f, int i, boolean z) {
        if (z) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        double d = f;
        int ceil = i - ((int) Math.ceil(d));
        int floor = i - ((int) Math.floor(d));
        if (contentIsSmallerThanPager(ceil, floor)) {
            return getOffsetForSmallContent(f, ceil, floor);
        }
        if (this.infiniteScroll) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float startOffset = getStartOffset(f, ceil, floor);
        if (startOffset != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return startOffset;
        }
        float endOffset = getEndOffset(f, ceil, floor);
        return endOffset == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : endOffset;
    }

    private final float getInitialStartOffset(int i, int i2, float f) {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(i);
        if (prevNeighbourSize != null) {
            float floatValue = prevNeighbourSize.floatValue();
            Float prevNeighbourSize2 = this.pageSizeProvider.getPrevNeighbourSize(i2);
            if (prevNeighbourSize2 != null) {
                return ((prevNeighbourSize2.floatValue() * f) + ((1 - f) * floatValue)) - this.paddings.getStart();
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private final float getOffset(float f, int i) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int signum = (int) Math.signum(f);
        int abs = (int) Math.abs(f);
        int i2 = 1;
        float f3 = 0.0f;
        if (1 <= abs) {
            while (true) {
                f3 += getOnePositionOffset(i, signum);
                i -= signum;
                if (i2 == abs) {
                    break;
                }
                i2++;
            }
        }
        float frac = getFrac(f);
        if (frac > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = frac * getOnePositionOffset(i, signum);
        }
        return f3 + f2;
    }

    private final float getOffsetForSmallContent(float f, int i, int i2) {
        float frac = f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getFrac(f) : getFracInverted(f);
        Float itemSize = this.pageSizeProvider.getItemSize(i);
        if (itemSize == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float floatValue = itemSize.floatValue() * frac;
        for (int i3 = i - 1; -1 < i3; i3--) {
            Float itemSize2 = this.pageSizeProvider.getItemSize(i3);
            if (itemSize2 == null) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            floatValue += itemSize2.floatValue() + this.itemSpacing;
        }
        return floatValue - getInitialStartOffset(i, i2, frac);
    }

    private final float getOnePositionOffset(int i, int i2) {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(i2 > 0 ? i : i + 1);
        if (prevNeighbourSize != null) {
            float floatValue = prevNeighbourSize.floatValue();
            DivPagerPageSizeProvider divPagerPageSizeProvider = this.pageSizeProvider;
            if (i2 > 0) {
                i--;
            }
            Float nextNeighbourSize = divPagerPageSizeProvider.getNextNeighbourSize(i);
            if (nextNeighbourSize != null) {
                return ((nextNeighbourSize.floatValue() + floatValue) - this.itemSpacing) * i2;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private final float getStartOffset(float f, int i, int i2) {
        Float itemSize;
        if (this.alignment == DivPager.ItemAlignment.START) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float frac = f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? getFrac(f) : getFracInverted(f);
        float initialStartOffset = getInitialStartOffset(i, i2, frac);
        if (initialStartOffset == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (itemSize = this.pageSizeProvider.getItemSize(i)) == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float floatValue = itemSize.floatValue() * frac;
        if (biggerThan(floatValue, initialStartOffset)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        do {
            i--;
            if (-1 >= i) {
                return floatValue - initialStartOffset;
            }
            Float itemSize2 = this.pageSizeProvider.getItemSize(i);
            if (itemSize2 == null) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            floatValue += itemSize2.floatValue() + this.itemSpacing;
        } while (!biggerThan(floatValue, initialStartOffset));
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float getPageOffset(float f, int i, boolean z) {
        return getOffset(f, i) - getInitialOffset(f, i, z);
    }
}
