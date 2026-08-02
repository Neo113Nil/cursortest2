package com.yandex.div.core.view2.items;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import androidx.viewpager.widget.PagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSizeUnit;
import xsna.zcl;

/* compiled from: DivViewWithItems.kt */
/* loaded from: classes7.dex */
public abstract class DivViewWithItems {
    public static final Companion Companion = new Companion(null);
    private static DivViewWithItems viewForTests;
    private final int scrollOffset;
    private final int scrollRange;

    /* compiled from: DivViewWithItems.kt */
    public static final class Companion {

        /* compiled from: DivViewWithItems.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DivGallery.ScrollMode.values().length];
                try {
                    iArr[DivGallery.ScrollMode.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivGallery.ScrollMode.PAGING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final DivViewWithItems getViewForTests$div_release() {
            return DivViewWithItems.viewForTests;
        }

        private Companion() {
        }
    }

    /* compiled from: DivViewWithItems.kt */
    public static final class Gallery extends DivViewWithItems {
        private final Direction direction;
        private final DisplayMetrics metrics;
        private final DivRecyclerView view;

        public Gallery(DivRecyclerView divRecyclerView, Direction direction) {
            super(null);
            this.view = divRecyclerView;
            this.direction = direction;
            this.metrics = divRecyclerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            int currentItem;
            currentItem = DivViewWithItemsKt.currentItem(this.view, this.direction);
            return currentItem;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            int itemCount;
            itemCount = DivViewWithItemsKt.getItemCount(this.view);
            return itemCount;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            int scrollOffset;
            scrollOffset = DivViewWithItemsKt.scrollOffset(this.view);
            return scrollOffset;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            int scrollRange;
            scrollRange = DivViewWithItemsKt.scrollRange(this.view);
            return scrollRange;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int i, DivSizeUnit divSizeUnit, boolean z) {
            DivViewWithItemsKt.scrollTo(this.view, i, divSizeUnit, getMetrics(), z);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z) {
            DivViewWithItemsKt.scrollToTheEnd(this.view, getMetrics(), z);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                final Context context = this.view.getContext();
                v vVar = new v(context) { // from class: com.yandex.div.core.view2.items.DivViewWithItems$Gallery$currentItem$1$smoothScroller$1
                    private final float MILLISECONDS_PER_INCH = 50.0f;

                    @Override // androidx.recyclerview.widget.v
                    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        return this.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
                    }

                    @Override // androidx.recyclerview.widget.v
                    public int getHorizontalSnapPreference() {
                        return -1;
                    }

                    @Override // androidx.recyclerview.widget.v
                    public int getVerticalSnapPreference() {
                        return -1;
                    }
                };
                vVar.setTargetPosition(i);
                RecyclerView.o layoutManager = this.view.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll(vVar);
                    return;
                }
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.scrollToPosition(i);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    public static final class Pager extends DivViewWithItems {
        private final DisplayMetrics metrics;
        private final DivPagerView view;

        public Pager(DivPagerView divPagerView) {
            super(null);
            this.view = divPagerView;
            this.metrics = divPagerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            RecyclerView.Adapter adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z) {
            this.view.getViewPager().e(getItemCount() - 1, z);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.getViewPager().e(i, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.getViewPager().e(i, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    public static final class PagingGallery extends DivViewWithItems {
        private final Direction direction;
        private final DisplayMetrics metrics;
        private final DivRecyclerView view;

        public PagingGallery(DivRecyclerView divRecyclerView, Direction direction) {
            super(null);
            this.view = divRecyclerView;
            this.direction = direction;
            this.metrics = divRecyclerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            int currentItem;
            currentItem = DivViewWithItemsKt.currentItem(this.view, this.direction);
            return currentItem;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            int itemCount;
            itemCount = DivViewWithItemsKt.getItemCount(this.view);
            return itemCount;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            int scrollOffset;
            scrollOffset = DivViewWithItemsKt.scrollOffset(this.view);
            return scrollOffset;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            int scrollRange;
            scrollRange = DivViewWithItemsKt.scrollRange(this.view);
            return scrollRange;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int i, DivSizeUnit divSizeUnit, boolean z) {
            DivViewWithItemsKt.scrollTo(this.view, i, divSizeUnit, getMetrics(), z);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z) {
            DivViewWithItemsKt.scrollToTheEnd(this.view, getMetrics(), z);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.smoothScrollToPosition(i);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.scrollToPosition(i);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    public static final class Tabs extends DivViewWithItems {
        private final DisplayMetrics metrics;
        private final DivTabsLayout view;

        public Tabs(DivTabsLayout divTabsLayout) {
            super(null);
            this.view = divTabsLayout;
            this.metrics = divTabsLayout.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            PagerAdapter adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z) {
            this.view.getViewPager().setCurrentItem(getItemCount() - 1, z);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.getViewPager().setCurrentItem(i, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.getViewPager().setCurrentItem(i, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    public /* synthetic */ DivViewWithItems(zcl zclVar) {
        this();
    }

    public static /* synthetic */ void scrollTo$default(DivViewWithItems divViewWithItems, int i, DivSizeUnit divSizeUnit, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollTo");
        }
        if ((i2 & 2) != 0) {
            divSizeUnit = DivSizeUnit.PX;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        divViewWithItems.scrollTo(i, divSizeUnit, z);
    }

    public abstract int getCurrentItem();

    public abstract int getItemCount();

    public abstract DisplayMetrics getMetrics();

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public int getScrollRange() {
        return this.scrollRange;
    }

    public abstract void scrollToTheEnd(boolean z);

    public abstract void setCurrentItem(int i);

    public abstract void setCurrentItemNoAnimation(int i);

    private DivViewWithItems() {
    }

    public void scrollTo(int i, DivSizeUnit divSizeUnit, boolean z) {
    }
}
