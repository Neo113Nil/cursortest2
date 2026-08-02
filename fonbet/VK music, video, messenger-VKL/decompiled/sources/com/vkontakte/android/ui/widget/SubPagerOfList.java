package com.vkontakte.android.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import xsna.utm0;

/* loaded from: classes7.dex */
public class SubPagerOfList extends ViewPager {
    public static final /* synthetic */ int f = 0;
    public View b;
    public RecyclerView c;
    public View d;
    public final a e;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (SubPagerOfList.this.getAdapter() != null) {
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            SubPagerOfList subPagerOfList = SubPagerOfList.this;
            if (subPagerOfList.getAdapter() != null) {
                throw null;
            }
            View view = subPagerOfList.b;
            if (view != null) {
                view.setTranslationY(Math.max(-subPagerOfList.getEmulatedTop(), 0));
            }
        }
    }

    public interface b {
    }

    public static class c extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((com.vkontakte.android.ui.widget.b) obj);
            throw null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            throw null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            throw null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            new com.vkontakte.android.ui.widget.b((SubPagerOfList) viewGroup);
            throw null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public SubPagerOfList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = null;
        this.d = null;
        this.e = new a();
        setChildrenDrawingOrderEnabled(true);
        addOnPageChangeListener(new utm0(this));
    }

    private View getParentView() {
        if (this.d == null) {
            ViewParent viewParent = this;
            while (true) {
                if (!(viewParent instanceof View)) {
                    break;
                }
                if (viewParent instanceof RecyclerView) {
                    this.c = (RecyclerView) viewParent;
                    break;
                }
                this.d = (View) viewParent;
                viewParent = viewParent.getParent();
            }
        }
        return this.d;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ((ViewPager.g) layoutParams).a |= view instanceof b;
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(@NonNull View view, int i, ViewGroup.LayoutParams layoutParams) {
        ((ViewPager.g) layoutParams).a |= view instanceof b;
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return (i - 1) - i2;
    }

    public int getEmulatedHeight() {
        RecyclerView parentList = getParentList();
        if (parentList == null) {
            return 0;
        }
        return parentList.getHeight();
    }

    public int getEmulatedTop() {
        return getTop();
    }

    public RecyclerView getParentList() {
        if (this.c == null) {
            ViewParent viewParent = this;
            while (true) {
                if (!(viewParent instanceof View)) {
                    break;
                }
                if (viewParent instanceof RecyclerView) {
                    this.c = (RecyclerView) viewParent;
                    break;
                }
                this.d = (View) viewParent;
                viewParent = viewParent.getParent();
            }
        }
        return this.c;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = getParentList();
        this.d = getRootView();
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.e);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.e);
        }
        this.c = null;
        this.d = null;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getPaddingTop();
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                ViewPager.g gVar = (ViewPager.g) childAt.getLayoutParams();
                if (gVar.a && (gVar.b & 112) == 48) {
                    this.b = childAt;
                    childAt.getMeasuredHeight();
                }
            }
        }
        getEmulatedHeight();
        c adapter = getAdapter();
        getCurrentItem();
        adapter.getClass();
        throw null;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof PagerSlidingTabStrip) {
                ((PagerSlidingTabStrip) childAt).setViewPager(this);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public c getAdapter() {
        return (c) super.getAdapter();
    }
}
