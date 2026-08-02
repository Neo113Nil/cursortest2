package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketMultiPickerItemsTabAdapter.kt */
/* loaded from: classes18.dex */
public final class k810 extends PagerAdapter {
    public final Context b;
    public List<wrn0> c = EmptyList.b;

    public k810(Context context) {
        this.b = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(obj instanceof ViewGroup ? (ViewGroup) obj : null);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.b.getString(this.c.get(i).b);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ViewGroup invoke = this.c.get(i).c.invoke(viewGroup);
        viewGroup.addView(invoke);
        return invoke;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }
}
