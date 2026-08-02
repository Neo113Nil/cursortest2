package com.yandex.div.internal.widget.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimatorKt;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawerKt;
import kotlin.NoWhenBranchMatchedException;
import xsna.ie40;

/* compiled from: PagerIndicatorView.kt */
/* loaded from: classes7.dex */
public class PagerIndicatorView extends View {
    private DivPagerView divPager;
    private final ViewPager2.g onPageChangeListener;
    private IndicatorsStripDrawer stripDrawer;
    private IndicatorParams$Style style;

    public PagerIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPageChangeListener = new ViewPager2.g() { // from class: com.yandex.div.internal.widget.indicator.PagerIndicatorView$onPageChangeListener$1
            private final int toRealPosition(int i2) {
                DivPagerAdapter currentAdapter;
                currentAdapter = PagerIndicatorView.this.getCurrentAdapter();
                return currentAdapter == null ? i2 : currentAdapter.realItemPosition(i2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            
                if (r5 > 1.0f) goto L6;
             */
            @Override // androidx.viewpager2.widget.ViewPager2.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onPageScrolled(int i2, float f, int i3) {
                IndicatorsStripDrawer indicatorsStripDrawer;
                indicatorsStripDrawer = PagerIndicatorView.this.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = PagerIndicatorView.this;
                    float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 = 1.0f;
                    }
                    f = f2;
                    indicatorsStripDrawer.onPageScrolled(toRealPosition(i2), f);
                    pagerIndicatorView.invalidate();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int i2) {
                IndicatorsStripDrawer indicatorsStripDrawer;
                indicatorsStripDrawer = PagerIndicatorView.this.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = PagerIndicatorView.this;
                    indicatorsStripDrawer.onPageSelected(toRealPosition(i2));
                    pagerIndicatorView.invalidate();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPager$lambda$3(PagerIndicatorView pagerIndicatorView) {
        IndicatorsStripDrawer indicatorsStripDrawer = pagerIndicatorView.stripDrawer;
        if (indicatorsStripDrawer != null) {
            pagerIndicatorView.update(indicatorsStripDrawer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DivPagerAdapter getCurrentAdapter() {
        ViewPager2 viewPager;
        DivPagerView divPagerView = this.divPager;
        RecyclerView.Adapter adapter = (divPagerView == null || (viewPager = divPagerView.getViewPager()) == null) ? null : viewPager.getAdapter();
        if (adapter instanceof DivPagerAdapter) {
            return (DivPagerAdapter) adapter;
        }
        return null;
    }

    private final void update(IndicatorsStripDrawer indicatorsStripDrawer) {
        DivPagerAdapter currentAdapter = getCurrentAdapter();
        if (currentAdapter != null) {
            indicatorsStripDrawer.setItemsCount(currentAdapter.getVisibleItems().size());
            indicatorsStripDrawer.onPageSelected(currentAdapter.realItemPosition(currentAdapter.getCurrentItem()));
            invalidate();
        }
    }

    public final void attachPager(DivPagerView divPagerView) {
        DivPagerView divPagerView2 = this.divPager;
        if (divPagerView2 != null) {
            divPagerView2.removeChangePageCallbackForIndicators(this.onPageChangeListener);
        }
        divPagerView.addChangePageCallbackForIndicators(this.onPageChangeListener);
        if (divPagerView == this.divPager) {
            return;
        }
        this.divPager = divPagerView;
        if (divPagerView.getViewPager().getAdapter() == null) {
            throw new IllegalArgumentException("Attached pager adapter is null!");
        }
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            update(indicatorsStripDrawer);
        }
        divPagerView.setPagerOnItemsCountChange$div_release(new ie40(this, 4));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            indicatorsStripDrawer.onDraw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        IndicatorsStripDrawer indicatorsStripDrawer;
        ViewPager2 viewPager;
        RecyclerView.Adapter adapter;
        IndicatorParams$Shape activeShape;
        IndicatorParams$ItemSize itemSize;
        IndicatorParams$Shape minimumShape;
        IndicatorParams$ItemSize itemSize2;
        IndicatorParams$Shape inactiveShape;
        IndicatorParams$ItemSize itemSize3;
        IndicatorParams$Shape activeShape2;
        IndicatorParams$ItemSize itemSize4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        IndicatorParams$Style indicatorParams$Style = this.style;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float height = (indicatorParams$Style == null || (activeShape2 = indicatorParams$Style.getActiveShape()) == null || (itemSize4 = activeShape2.getItemSize()) == null) ? 0.0f : itemSize4.getHeight();
        IndicatorParams$Style indicatorParams$Style2 = this.style;
        float height2 = (indicatorParams$Style2 == null || (inactiveShape = indicatorParams$Style2.getInactiveShape()) == null || (itemSize3 = inactiveShape.getItemSize()) == null) ? 0.0f : itemSize3.getHeight();
        IndicatorParams$Style indicatorParams$Style3 = this.style;
        int max = (int) (Math.max(height, Math.max(height2, (indicatorParams$Style3 == null || (minimumShape = indicatorParams$Style3.getMinimumShape()) == null || (itemSize2 = minimumShape.getItemSize()) == null) ? 0.0f : itemSize2.getHeight())) + getPaddingTop() + getPaddingBottom());
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max, size);
        } else if (mode != 1073741824) {
            size = max;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        IndicatorParams$Style indicatorParams$Style4 = this.style;
        if (indicatorParams$Style4 != null && (activeShape = indicatorParams$Style4.getActiveShape()) != null && (itemSize = activeShape.getItemSize()) != null) {
            f = itemSize.getWidth();
        }
        IndicatorParams$Style indicatorParams$Style5 = this.style;
        IndicatorParams$ItemPlacement itemsPlacement = indicatorParams$Style5 != null ? indicatorParams$Style5.getItemsPlacement() : null;
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            float spaceBetweenCenters = ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters();
            DivPagerView divPagerView = this.divPager;
            paddingLeft = getPaddingLeft() + ((int) ((spaceBetweenCenters * ((divPagerView == null || (viewPager = divPagerView.getViewPager()) == null || (adapter = viewPager.getAdapter()) == null) ? 0 : adapter.getItemCount())) + f));
            paddingRight = getPaddingRight();
        } else {
            if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch) {
                i3 = size2;
                if (mode2 != Integer.MIN_VALUE) {
                    size2 = Math.min(i3, size2);
                } else if (mode2 != 1073741824) {
                    size2 = i3;
                }
                setMeasuredDimension(size2, size);
                indicatorsStripDrawer = this.stripDrawer;
                if (indicatorsStripDrawer == null) {
                    indicatorsStripDrawer.calculateMaximumVisibleItems((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
                    return;
                }
                return;
            }
            if (itemsPlacement != null) {
                throw new NoWhenBranchMatchedException();
            }
            paddingLeft = getPaddingLeft() + ((int) f);
            paddingRight = getPaddingRight();
        }
        i3 = paddingRight + paddingLeft;
        if (mode2 != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size2, size);
        indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer == null) {
        }
    }

    public final void setStyle(IndicatorParams$Style indicatorParams$Style) {
        this.style = indicatorParams$Style;
        IndicatorsStripDrawer indicatorsStripDrawer = new IndicatorsStripDrawer(indicatorParams$Style, SingleIndicatorDrawerKt.getIndicatorDrawer(indicatorParams$Style), IndicatorAnimatorKt.getIndicatorAnimator(indicatorParams$Style), this);
        indicatorsStripDrawer.calculateMaximumVisibleItems((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        update(indicatorsStripDrawer);
        this.stripDrawer = indicatorsStripDrawer;
        requestLayout();
    }
}
