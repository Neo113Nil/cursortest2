package xsna;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* compiled from: InfinitePagerAdapter.java */
/* loaded from: classes17.dex */
public final class xuw extends PagerAdapter {
    public final PagerAdapter b;
    public Boolean c = Boolean.TRUE;

    /* compiled from: InfinitePagerAdapter.java */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            xuw.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            xuw.this.notifyDataSetChanged();
        }
    }

    public xuw(PagerAdapter pagerAdapter) {
        this.b = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new a());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        PagerAdapter pagerAdapter = this.b;
        pagerAdapter.destroyItem(viewGroup, i % pagerAdapter.getCount(), obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(ViewGroup viewGroup) {
        this.b.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        boolean booleanValue = this.c.booleanValue();
        PagerAdapter pagerAdapter = this.b;
        return booleanValue ? pagerAdapter.getCount() == 0 ? 0 : Integer.MAX_VALUE : pagerAdapter.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return this.b.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        PagerAdapter pagerAdapter = this.b;
        return pagerAdapter.getPageTitle(i % pagerAdapter.getCount());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float getPageWidth(int i) {
        return this.b.getPageWidth(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        PagerAdapter pagerAdapter = this.b;
        return pagerAdapter.instantiateItem(viewGroup, i % pagerAdapter.getCount());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return this.b.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.b.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        return this.b.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.b.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(ViewGroup viewGroup) {
        this.b.startUpdate(viewGroup);
    }
}
