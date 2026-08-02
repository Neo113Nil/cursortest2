package com.yandex.div.internal.widget.indicator;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.awf;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.g5g;
import xsna.i9x;
import xsna.izs;
import xsna.j5g;
import xsna.swe0;
import xsna.xq;
import xsna.z8x;
import xsna.zcl;

/* compiled from: IndicatorsStripDrawer.kt */
/* loaded from: classes7.dex */
public final class IndicatorsStripDrawer {
    private final IndicatorAnimator animator;
    private float baseYOffset;
    private int itemsCount;
    private int maxVisibleCount;
    private float selectedItemFraction;
    private int selectedItemPosition;
    private final SingleIndicatorDrawer singleIndicatorDrawer;
    private float spaceBetweenCenters;
    private final IndicatorParams$Style styleParams;
    private final View view;
    private int viewportHeight;
    private int viewportWidth;
    private final IndicatorsRibbon ribbon = new IndicatorsRibbon();
    private float itemWidthMultiplier = 1.0f;

    /* compiled from: IndicatorsStripDrawer.kt */
    public final class IndicatorsRibbon {
        private final List<Indicator> allItems = new ArrayList();
        private final List<Indicator> visibleItems = new ArrayList();

        public IndicatorsRibbon() {
        }

        private final float calcOffsetShiftFor(int i, float f) {
            float f2;
            if (this.allItems.size() <= IndicatorsStripDrawer.this.maxVisibleCount) {
                return (IndicatorsStripDrawer.this.viewportWidth / 2.0f) - (((Indicator) j5g.i0(this.allItems)).getRight() / 2);
            }
            float f3 = IndicatorsStripDrawer.this.viewportWidth / 2.0f;
            boolean isLayoutRtl = ViewsKt.isLayoutRtl(IndicatorsStripDrawer.this.view);
            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (isLayoutRtl) {
                if (i != -1) {
                    f4 = this.allItems.get((r1.size() - 1) - i).getCenterOffset();
                }
                f2 = (IndicatorsStripDrawer.this.spaceBetweenCenters * f) + (f3 - f4);
            } else {
                if (i != -1) {
                    f4 = this.allItems.get(i).getCenterOffset();
                }
                f2 = (f3 - f4) - (IndicatorsStripDrawer.this.spaceBetweenCenters * f);
            }
            return IndicatorsStripDrawer.this.maxVisibleCount % 2 == 0 ? (IndicatorsStripDrawer.this.spaceBetweenCenters / 2) + f2 : f2;
        }

        private final float calcScaleFraction(float f) {
            float f2 = IndicatorsStripDrawer.this.spaceBetweenCenters + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f > f2) {
                float f3 = IndicatorsStripDrawer.this.viewportWidth - f;
                f = f3 > f2 ? f2 : f3;
            }
            if (f > f2) {
                return 1.0f;
            }
            return swe0.f(f / (f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        }

        private final void downscaleAndDisperse(List<Indicator> list) {
            int i;
            Indicator indicator;
            IndicatorsStripDrawer indicatorsStripDrawer = IndicatorsStripDrawer.this;
            int i2 = 0;
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                Indicator indicator2 = (Indicator) obj;
                float calcScaleFraction = calcScaleFraction(indicator2.getCenterOffset());
                list.set(i3, (indicator2.getPosition() == 0 || indicator2.getPosition() == indicatorsStripDrawer.itemsCount + (-1) || indicator2.getActive()) ? Indicator.copy$default(indicator2, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, calcScaleFraction, 15, null) : scaleItem(indicator2, calcScaleFraction));
                i3 = i4;
            }
            Iterator<Indicator> it = list.iterator();
            int i5 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                } else if (it.next().getScaleFactor() == 1.0f) {
                    break;
                } else {
                    i5++;
                }
            }
            Integer valueOf = Integer.valueOf(i5);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                ListIterator<Indicator> listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().getScaleFactor() == 1.0f) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i);
                if (valueOf2.intValue() < 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    int i6 = intValue - 1;
                    int intValue2 = valueOf2.intValue() + 1;
                    IndicatorsStripDrawer indicatorsStripDrawer2 = IndicatorsStripDrawer.this;
                    for (Object obj2 : list) {
                        int i7 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        Indicator indicator3 = (Indicator) obj2;
                        if (i2 < i6) {
                            Indicator indicator4 = (Indicator) j5g.b0(i6, list);
                            if (indicator4 != null) {
                                list.set(i2, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() - (indicatorsStripDrawer2.spaceBetweenCenters * (1.0f - indicator4.getScaleFactor())), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 27, null));
                            } else {
                                i2 = i7;
                            }
                        }
                        if (i2 > intValue2 && (indicator = (Indicator) j5g.b0(intValue2, list)) != null) {
                            list.set(i2, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() + (indicatorsStripDrawer2.spaceBetweenCenters * (1.0f - indicator.getScaleFactor())), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 27, null));
                        }
                        i2 = i7;
                    }
                }
            }
        }

        private final List<Indicator> relayoutVisibleItems(int i, float f) {
            float calcOffsetShiftFor = calcOffsetShiftFor(i, f);
            List<Indicator> list = this.allItems;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (Indicator indicator : list) {
                arrayList.add(Indicator.copy$default(indicator, 0, false, indicator.getCenterOffset() + calcOffsetShiftFor, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 27, null));
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.size() <= IndicatorsStripDrawer.this.maxVisibleCount) {
                return arrayList2;
            }
            final awf awfVar = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IndicatorsStripDrawer.this.viewportWidth);
            int i2 = 0;
            if (awfVar.b(Float.valueOf(((Indicator) j5g.Y(arrayList2)).getLeft()))) {
                float f2 = -((Indicator) j5g.Y(arrayList2)).getLeft();
                for (Object obj : arrayList2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    Indicator indicator2 = (Indicator) obj;
                    arrayList2.set(i2, Indicator.copy$default(indicator2, 0, false, indicator2.getCenterOffset() + f2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 27, null));
                    i2 = i3;
                }
            } else if (awfVar.b(Float.valueOf(((Indicator) j5g.i0(arrayList2)).getRight()))) {
                float right = IndicatorsStripDrawer.this.viewportWidth - ((Indicator) j5g.i0(arrayList2)).getRight();
                for (Object obj2 : arrayList2) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    Indicator indicator3 = (Indicator) obj2;
                    arrayList2.set(i2, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() + right, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 27, null));
                    i2 = i4;
                }
            }
            g5g.D(arrayList2, true, new izs<Indicator, Boolean>() { // from class: com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public final Boolean invoke(IndicatorsStripDrawer.Indicator indicator4) {
                    return Boolean.valueOf(!awfVar.b(Float.valueOf(indicator4.getCenterOffset())));
                }
            });
            downscaleAndDisperse(arrayList2);
            return arrayList2;
        }

        private final Indicator scaleItem(Indicator indicator, float f) {
            IndicatorParams$ItemSize itemSize = indicator.getItemSize();
            float width = itemSize.getWidth() * f;
            if (width <= IndicatorsStripDrawer.this.styleParams.getMinimumShape().getItemSize().getWidth()) {
                return Indicator.copy$default(indicator, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IndicatorsStripDrawer.this.styleParams.getMinimumShape().getItemSize(), f, 7, null);
            }
            if (width >= itemSize.getWidth()) {
                return indicator;
            }
            if (itemSize instanceof IndicatorParams$ItemSize.RoundedRect) {
                IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSize;
                return Indicator.copy$default(indicator, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect, width, (width / roundedRect.getItemWidth()) * roundedRect.getItemHeight(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null), f, 7, null);
            }
            if (itemSize instanceof IndicatorParams$ItemSize.Circle) {
                return Indicator.copy$default(indicator, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((IndicatorParams$ItemSize.Circle) itemSize).copy((itemSize.getWidth() * f) / 2.0f), f, 7, null);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final List<Indicator> getVisibleItems() {
            return this.visibleItems;
        }

        public final void relayout(int i, float f) {
            this.allItems.clear();
            this.visibleItems.clear();
            if (IndicatorsStripDrawer.this.itemsCount <= 0) {
                return;
            }
            i9x indices = ViewsKt.getIndices(IndicatorsStripDrawer.this.view, 0, IndicatorsStripDrawer.this.itemsCount);
            int i2 = indices.b;
            IndicatorsStripDrawer indicatorsStripDrawer = IndicatorsStripDrawer.this;
            Iterator<Integer> it = indices.iterator();
            while (it.hasNext()) {
                int nextInt = ((z8x) it).nextInt();
                IndicatorParams$ItemSize itemSizeAt = indicatorsStripDrawer.getItemSizeAt(nextInt);
                float width = nextInt == i2 ? itemSizeAt.getWidth() / 2.0f : ((Indicator) j5g.i0(this.allItems)).getCenterOffset() + indicatorsStripDrawer.spaceBetweenCenters;
                this.allItems.add(new Indicator(nextInt, nextInt == i, width, itemSizeAt, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, null));
            }
            this.visibleItems.addAll(relayoutVisibleItems(i, f));
        }
    }

    public IndicatorsStripDrawer(IndicatorParams$Style indicatorParams$Style, SingleIndicatorDrawer singleIndicatorDrawer, IndicatorAnimator indicatorAnimator, View view) {
        this.styleParams = indicatorParams$Style;
        this.singleIndicatorDrawer = singleIndicatorDrawer;
        this.animator = indicatorAnimator;
        this.view = view;
        this.baseYOffset = indicatorParams$Style.getInactiveShape().getItemSize().getWidth();
    }

    private final void adjustItemsPlacement() {
        IndicatorParams$ItemPlacement itemsPlacement = this.styleParams.getItemsPlacement();
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            this.spaceBetweenCenters = ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters();
            this.itemWidthMultiplier = 1.0f;
        } else if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch) {
            IndicatorParams$ItemPlacement.Stretch stretch = (IndicatorParams$ItemPlacement.Stretch) itemsPlacement;
            float itemSpacing = (stretch.getItemSpacing() + this.viewportWidth) / this.maxVisibleCount;
            this.spaceBetweenCenters = itemSpacing;
            this.itemWidthMultiplier = (itemSpacing - stretch.getItemSpacing()) / this.styleParams.getActiveShape().getItemSize().getWidth();
        }
        this.animator.updateSpaceBetweenCenters(this.spaceBetweenCenters);
    }

    private final void adjustVisibleItems(int i, float f) {
        this.ribbon.relayout(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndicatorParams$ItemSize getItemSizeAt(int i) {
        IndicatorParams$ItemSize itemSizeAt = this.animator.getItemSizeAt(i);
        if (this.itemWidthMultiplier == 1.0f) {
            return itemSizeAt;
        }
        if (!(itemSizeAt instanceof IndicatorParams$ItemSize.RoundedRect)) {
            return itemSizeAt;
        }
        IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSizeAt;
        IndicatorParams$ItemSize.RoundedRect copy$default = IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect, roundedRect.getItemWidth() * this.itemWidthMultiplier, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, null);
        this.animator.overrideItemWidth(copy$default.getItemWidth());
        return copy$default;
    }

    public final void calculateMaximumVisibleItems(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.viewportWidth = i;
        this.viewportHeight = i2;
        calculateMaximumVisibleItems();
        adjustItemsPlacement();
        this.baseYOffset = i2 / 2.0f;
        adjustVisibleItems(this.selectedItemPosition, this.selectedItemFraction);
    }

    public final void onDraw(Canvas canvas) {
        Object obj;
        RectF selectedItemRect;
        for (Indicator indicator : this.ribbon.getVisibleItems()) {
            this.singleIndicatorDrawer.draw(canvas, indicator.getCenterOffset(), this.baseYOffset, indicator.getItemSize(), this.animator.getColorAt(indicator.getPosition()), this.animator.getBorderWidthAt(indicator.getPosition()), this.animator.getBorderColorAt(indicator.getPosition()));
        }
        Iterator<T> it = this.ribbon.getVisibleItems().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Indicator) obj).getActive()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Indicator indicator2 = (Indicator) obj;
        if (indicator2 == null || (selectedItemRect = this.animator.getSelectedItemRect(indicator2.getCenterOffset(), this.baseYOffset, this.viewportWidth, ViewsKt.isLayoutRtl(this.view))) == null) {
            return;
        }
        this.singleIndicatorDrawer.drawSelected(canvas, selectedItemRect);
    }

    public final void onPageScrolled(int i, float f) {
        this.selectedItemPosition = i;
        this.selectedItemFraction = f;
        this.animator.onPageScrolled(i, f);
        adjustVisibleItems(i, f);
    }

    public final void onPageSelected(int i) {
        this.selectedItemPosition = i;
        this.selectedItemFraction = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.animator.onPageSelected(i);
        adjustVisibleItems(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void setItemsCount(int i) {
        this.itemsCount = i;
        this.animator.setItemsCount(i);
        calculateMaximumVisibleItems();
        this.baseYOffset = this.viewportHeight / 2.0f;
    }

    /* compiled from: IndicatorsStripDrawer.kt */
    public static final class Indicator {
        private final boolean active;
        private final float centerOffset;
        private final IndicatorParams$ItemSize itemSize;
        private final int position;
        private final float scaleFactor;

        public Indicator(int i, boolean z, float f, IndicatorParams$ItemSize indicatorParams$ItemSize, float f2) {
            this.position = i;
            this.active = z;
            this.centerOffset = f;
            this.itemSize = indicatorParams$ItemSize;
            this.scaleFactor = f2;
        }

        public static /* synthetic */ Indicator copy$default(Indicator indicator, int i, boolean z, float f, IndicatorParams$ItemSize indicatorParams$ItemSize, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = indicator.position;
            }
            if ((i2 & 2) != 0) {
                z = indicator.active;
            }
            if ((i2 & 4) != 0) {
                f = indicator.centerOffset;
            }
            if ((i2 & 8) != 0) {
                indicatorParams$ItemSize = indicator.itemSize;
            }
            if ((i2 & 16) != 0) {
                f2 = indicator.scaleFactor;
            }
            float f3 = f2;
            float f4 = f;
            return indicator.copy(i, z, f4, indicatorParams$ItemSize, f3);
        }

        public final Indicator copy(int i, boolean z, float f, IndicatorParams$ItemSize indicatorParams$ItemSize, float f2) {
            return new Indicator(i, z, f, indicatorParams$ItemSize, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Indicator)) {
                return false;
            }
            Indicator indicator = (Indicator) obj;
            return this.position == indicator.position && this.active == indicator.active && Float.compare(this.centerOffset, indicator.centerOffset) == 0 && epx.f(this.itemSize, indicator.itemSize) && Float.compare(this.scaleFactor, indicator.scaleFactor) == 0;
        }

        public final boolean getActive() {
            return this.active;
        }

        public final float getCenterOffset() {
            return this.centerOffset;
        }

        public final IndicatorParams$ItemSize getItemSize() {
            return this.itemSize;
        }

        public final float getLeft() {
            return this.centerOffset - (this.itemSize.getWidth() / 2.0f);
        }

        public final int getPosition() {
            return this.position;
        }

        public final float getRight() {
            return (this.itemSize.getWidth() / 2.0f) + this.centerOffset;
        }

        public final float getScaleFactor() {
            return this.scaleFactor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.position) * 31;
            boolean z = this.active;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return Float.hashCode(this.scaleFactor) + ((this.itemSize.hashCode() + b.a(this.centerOffset, (hashCode + i) * 31, 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Indicator(position=");
            sb.append(this.position);
            sb.append(", active=");
            sb.append(this.active);
            sb.append(", centerOffset=");
            sb.append(this.centerOffset);
            sb.append(", itemSize=");
            sb.append(this.itemSize);
            sb.append(", scaleFactor=");
            return xq.c(')', this.scaleFactor, sb);
        }

        public /* synthetic */ Indicator(int i, boolean z, float f, IndicatorParams$ItemSize indicatorParams$ItemSize, float f2, int i2, zcl zclVar) {
            this(i, z, f, indicatorParams$ItemSize, (i2 & 16) != 0 ? 1.0f : f2);
        }
    }

    private final void calculateMaximumVisibleItems() {
        int maxVisibleItems;
        IndicatorParams$ItemPlacement itemsPlacement = this.styleParams.getItemsPlacement();
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            maxVisibleItems = (int) (this.viewportWidth / ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters());
        } else {
            if (!(itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch)) {
                throw new NoWhenBranchMatchedException();
            }
            maxVisibleItems = ((IndicatorParams$ItemPlacement.Stretch) itemsPlacement).getMaxVisibleItems();
        }
        int i = this.itemsCount;
        if (maxVisibleItems > i) {
            maxVisibleItems = i;
        }
        this.maxVisibleCount = maxVisibleItems;
    }
}
