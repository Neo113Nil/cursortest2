package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.util.ViewsKt;
import java.util.HashMap;

/* compiled from: RtlViewPager.kt */
/* loaded from: classes7.dex */
public class RtlViewPager extends ViewPager {
    private final HashMap<ViewPager.j, ReversingOnPageChangeListener> pageChangeListeners;

    /* compiled from: RtlViewPager.kt */
    public final class ReversingOnPageChangeListener implements ViewPager.j {
        private final ViewPager.j listener;

        public ReversingOnPageChangeListener(ViewPager.j jVar) {
            this.listener = jVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
            this.listener.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                int count = adapter.getCount();
                int pageWidth = ((int) ((1 - adapter.getPageWidth(i)) * RtlViewPager.this.getWidth())) + i2;
                while (i < count && pageWidth > 0) {
                    i++;
                    pageWidth -= (int) (adapter.getPageWidth(i) * RtlViewPager.this.getWidth());
                }
                i = (count - i) - 1;
                i2 = -pageWidth;
                f = i2 / (adapter.getPageWidth(i) * RtlViewPager.this.getWidth());
            }
            this.listener.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.listener.onPageSelected(i);
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pageChangeListeners = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.j jVar) {
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(jVar);
        this.pageChangeListeners.put(jVar, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.pageChangeListeners.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !ViewsKt.isLayoutRtl(this)) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.j jVar) {
        ReversingOnPageChangeListener remove = this.pageChangeListeners.remove(jVar);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }
}
