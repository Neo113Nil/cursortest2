package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.tool.view.CommunityProfileTabsContainerLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import xsna.wih;

/* compiled from: CommunityProfileContentPagerAdapter.kt */
/* loaded from: classes5.dex */
public final class vjh extends androidx.recyclerview.widget.x<CommunityProfileContentItem, wjh<?>> implements CommunityProfileTabsContainerLayout.a {
    public final wlj c;
    public final wih.a.d d;
    public RecyclerView e;
    public final LinkedHashMap f;
    public ViewGroup g;
    public Integer h;

    /* compiled from: CommunityProfileContentPagerAdapter.kt */
    public static final class a extends m.e<CommunityProfileContentItem> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(CommunityProfileContentItem communityProfileContentItem, CommunityProfileContentItem communityProfileContentItem2) {
            return communityProfileContentItem.h() == communityProfileContentItem2.h();
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(CommunityProfileContentItem communityProfileContentItem, CommunityProfileContentItem communityProfileContentItem2) {
            return communityProfileContentItem.h == communityProfileContentItem2.h;
        }
    }

    /* compiled from: CommunityProfileContentPagerAdapter.kt */
    public interface b {
        void a(CommunityProfileContentItem communityProfileContentItem);

        void b(int i);

        void c(CommunityProfileContentItem communityProfileContentItem);

        void d(CommunityProfileContentItem communityProfileContentItem);

        void e(CommunityProfileContentItem communityProfileContentItem);

        void f(CommunityProfileContentItem communityProfileContentItem);

        void g(CommunityProfileContentItem communityProfileContentItem);
    }

    public vjh(wlj wljVar, wih.a.d dVar) {
        super(new a());
        this.c = wljVar;
        this.d = dVar;
        this.f = new LinkedHashMap();
        setHasStableIds(true);
    }

    public static void z0(vjh vjhVar, ViewGroup viewGroup, Integer num, Integer num2, int i) {
        int i2;
        if ((i & 2) != 0) {
            num = null;
        }
        int i3 = 0;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        if ((i & 16) != 0) {
            num2 = null;
        }
        LinkedHashMap linkedHashMap = vjhVar.f;
        int i4 = z ? 11 : z2 ? 17 : 0;
        Iterator<CommunityProfileContentItem> it = vjhVar.getCurrentList().iterator();
        int i5 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i5 = -1;
                break;
            } else if (it.next().h == i4) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 == -1 || linkedHashMap.get(Integer.valueOf(i4)) != null) {
            return;
        }
        if (num2 == null) {
            Iterator<CommunityProfileContentItem> it2 = vjhVar.getCurrentList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int i6 = it2.next().h;
                if (num != null && i6 == num.intValue()) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        } else {
            i2 = num2.intValue();
        }
        if (Math.abs(i2 - i5) <= 2) {
            linkedHashMap.put(Integer.valueOf(i4), vjhVar.c.a(viewGroup, i4, vjhVar.d));
        }
    }

    public final void A0(int i, boolean z) {
        RecyclerView recyclerView = this.e;
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        wjh wjhVar = findViewHolderForAdapterPosition instanceof wjh ? (wjh) findViewHolderForAdapterPosition : null;
        if (wjhVar == null) {
            return;
        }
        wjhVar.l6(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (x0(i) == null) {
            return 0L;
        }
        return r3.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        CommunityProfileContentItem x0 = x0(i);
        if (x0 == null) {
            return 0;
        }
        return x0.h;
    }

    @Override // com.vk.profile.tool.view.CommunityProfileTabsContainerLayout.a
    public final void j(int i) {
        RecyclerView.Adapter adapter;
        this.h = Integer.valueOf(i);
        RecyclerView recyclerView = this.e;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            RecyclerView recyclerView2 = this.e;
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(i2) : null;
            wjh wjhVar = findViewHolderForAdapterPosition instanceof wjh ? (wjh) findViewHolderForAdapterPosition : null;
            if (wjhVar != null) {
                wjhVar.g6(i);
            }
        }
    }

    @Override // com.vk.profile.tool.view.CommunityProfileTabsContainerLayout.a
    public final boolean m0(int i) {
        RecyclerView recyclerView = this.e;
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
        wjh wjhVar = findViewHolderForAdapterPosition instanceof wjh ? (wjh) findViewHolderForAdapterPosition : null;
        if (wjhVar == null) {
            return false;
        }
        return wjhVar.w.getRecyclerView().canScrollVertically(-1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        final wjh wjhVar = (wjh) e0Var;
        CommunityProfileContentItem x0 = x0(i);
        if (x0 == null) {
            return;
        }
        wjhVar.V5(x0);
        Integer num = this.h;
        if (num != null) {
            final int intValue = num.intValue();
            wjhVar.itemView.post(new Runnable() { // from class: xsna.ujh
                @Override // java.lang.Runnable
                public final void run() {
                    wjh.this.g6(intValue);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.g == null) {
            this.g = viewGroup;
        }
        z0(this, viewGroup, Integer.valueOf(i), null, 28);
        z0(this, viewGroup, Integer.valueOf(i), null, 24);
        z0(this, viewGroup, Integer.valueOf(i), null, 20);
        wih.a.d dVar = this.d;
        wlj wljVar = this.c;
        LinkedHashMap linkedHashMap = this.f;
        if (i == 0) {
            wjh wjhVar = (wjh) linkedHashMap.get(0);
            return wjhVar == null ? wljVar.a(viewGroup, i, dVar) : wjhVar;
        }
        if (i == 11) {
            wjh wjhVar2 = (wjh) linkedHashMap.get(11);
            return wjhVar2 == null ? wljVar.a(viewGroup, i, dVar) : wjhVar2;
        }
        if (i != 17) {
            return wljVar.a(viewGroup, i, dVar);
        }
        wjh wjhVar3 = (wjh) linkedHashMap.get(17);
        return wjhVar3 == null ? wljVar.a(viewGroup, i, dVar) : wjhVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.e = null;
    }

    @Override // com.vk.profile.tool.view.CommunityProfileTabsContainerLayout.a
    public final void s0(int i) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.e;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            RecyclerView recyclerView2 = this.e;
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(i2) : null;
            wjh wjhVar = findViewHolderForAdapterPosition instanceof wjh ? (wjh) findViewHolderForAdapterPosition : null;
            if (wjhVar != null) {
                wjhVar.l(i);
            }
        }
    }

    @Override // com.vk.profile.tool.view.CommunityProfileTabsContainerLayout.a
    public final void t0(int i, int i2, int[] iArr) {
        RecyclerView recyclerView = this.e;
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i2) : null;
        wjh wjhVar = findViewHolderForAdapterPosition instanceof wjh ? (wjh) findViewHolderForAdapterPosition : null;
        if (wjhVar == null) {
            return;
        }
        RecyclerPaginatedView recyclerPaginatedView = wjhVar.w;
        if (recyclerPaginatedView.getRecyclerView().hasPendingAdapterUpdates()) {
            return;
        }
        r7j r7jVar = wjhVar.u;
        if (r7jVar == null) {
            r7jVar = new r7j(recyclerPaginatedView.getRecyclerView());
            wjhVar.u = r7jVar;
        }
        try {
            r7jVar.c = 0;
            r7jVar.d = 0;
            r7jVar.b.scrollBy(0, i);
            iArr[0] = r7jVar.c;
            iArr[1] = r7jVar.d;
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("NPE while scrolling, group id = ");
            sb.append(wjhVar.l);
            sb.append(" tab view type = ");
            T t = wjhVar.t;
            sb.append(t != 0 ? Integer.valueOf(t.h) : null);
            L.E(e, sb.toString());
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }

    public final CommunityProfileContentItem x0(int i) {
        return (CommunityProfileContentItem) j5g.b0(i, getCurrentList());
    }

    public final void y0(int i) {
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            z0(this, viewGroup, null, Integer.valueOf(i), 14);
            z0(this, viewGroup, null, Integer.valueOf(i), 10);
            z0(this, viewGroup, null, Integer.valueOf(i), 6);
        }
    }
}
