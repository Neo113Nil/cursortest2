package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.feature.stories.internal.screens.verticalstories.view.StoriesPageView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class dvb extends RecyclerView.Adapter {
    public final eg01 a;
    public final rm31 b;
    public n751 w;
    public List c = EmptyList.a;
    public final LinkedHashSet x = new LinkedHashSet();

    public dvb(eg01 eg01Var, rm31 rm31Var) {
        this.a = eg01Var;
        this.b = rm31Var;
    }

    public static void g(ViewPager2 viewPager2, int i) {
        x0 findViewHolderForAdapterPosition = ((RecyclerView) viewPager2.getChildAt(0)).findViewHolderForAdapterPosition(i);
        ymu0 ymu0Var = findViewHolderForAdapterPosition instanceof ymu0 ? (ymu0) findViewHolderForAdapterPosition : null;
        if (ymu0Var != null) {
            ymu0Var.N.pauseStory();
        }
    }

    public static void h(ViewPager2 viewPager2, int i) {
        x0 findViewHolderForAdapterPosition = ((RecyclerView) viewPager2.getChildAt(0)).findViewHolderForAdapterPosition(i);
        ymu0 ymu0Var = findViewHolderForAdapterPosition instanceof ymu0 ? (ymu0) findViewHolderForAdapterPosition : null;
        if (ymu0Var != null) {
            ymu0Var.N.resumeStory();
        }
    }

    public final int f() {
        if (this.c.isEmpty()) {
            return 0;
        }
        return 1073741823 - (1073741823 % this.c.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    public final void i(n751 n751Var) {
        this.w = n751Var;
    }

    public final void j(List list) {
        LinkedHashSet linkedHashSet = this.x;
        int d = gw00.d(tcc.n(linkedHashSet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : linkedHashSet) {
            int intValue = ((Number) obj).intValue();
            List list2 = this.c;
            linkedHashMap.put(obj, (wmu0) a.S(intValue % list2.size(), list2));
        }
        this.c = list;
        int d2 = gw00.d(tcc.n(linkedHashSet, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
        for (Object obj2 : linkedHashSet) {
            int intValue2 = ((Number) obj2).intValue();
            List list3 = this.c;
            linkedHashMap2.put(obj2, (wmu0) a.S(intValue2 % list3.size(), list3));
        }
        if (linkedHashSet.isEmpty()) {
            notifyDataSetChanged();
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            int intValue3 = ((Number) it.next()).intValue();
            if (!jl40.l(linkedHashMap.get(Integer.valueOf(intValue3)), linkedHashMap2.get(Integer.valueOf(intValue3)))) {
                notifyItemChanged(intValue3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ymu0 ymu0Var = (ymu0) x0Var;
        List list = this.c;
        wmu0 wmu0Var = (wmu0) a.S(i % list.size(), list);
        if (wmu0Var != null) {
            StoriesPageView storiesPageView = ymu0Var.N;
            storiesPageView.setCallbacks(this.a);
            storiesPageView.render(wmu0Var);
        }
        this.x.add(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        StoriesPageView storiesPageView = new StoriesPageView(viewGroup.getContext(), null, 0, 6, null);
        storiesPageView.setVideoPlayerFactory(this.b);
        storiesPageView.setInsets(this.w);
        return new ymu0(storiesPageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        ymu0 ymu0Var = (ymu0) x0Var;
        ymu0Var.N.onRecycled();
        super.onViewRecycled(ymu0Var);
    }
}
