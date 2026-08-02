package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: StickersPagerAdapter.kt */
/* loaded from: classes6.dex */
public final class dbl0 extends PagerAdapter {
    public final xzn0 b;
    public final ArrayList c;

    public dbl0(xzn0 xzn0Var, ArrayList arrayList) {
        this.b = xzn0Var;
        this.c = arrayList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (i >= this.c.size()) {
            return;
        }
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        Iterator it = this.c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (((wdl0) next).getClass().equals(obj.getClass())) {
                break;
            }
            i++;
        }
        Integer valueOf = i != -1 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ArrayList arrayList = this.c;
        ((wdl0) arrayList.get(i)).b(this.b.j);
        View a = ((wdl0) arrayList.get(i)).a(viewGroup.getContext());
        a.setTag(Integer.valueOf(i));
        if (a.getParent() != null) {
            ((ViewGroup) a.getParent()).removeView(a);
        }
        viewGroup.addView(a);
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return obj instanceof wdl0 ? view == ((wdl0) obj).a(view.getContext()) : view == obj;
    }
}
