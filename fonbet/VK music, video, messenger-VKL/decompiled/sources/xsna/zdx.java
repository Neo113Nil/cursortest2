package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.newsfeed.entries.InterestingStoriesEntry;
import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesHolderViewImpl;
import com.vkontakte.android.R;
import xsna.bwy;
import xsna.oht0;

/* compiled from: InterestingStoriesBlockHolder.kt */
/* loaded from: classes4.dex */
public final class zdx extends qi6<InterestingStoriesEntry> implements ent0 {
    public fev C;
    public InterestingStoriesHolderViewImpl D;
    public ShimmerFrameLayout E;
    public ViewGroup F;
    public VkButton G;

    /* compiled from: InterestingStoriesBlockHolder.kt */
    public static final class a extends oht0.a {
        @Override // xsna.oht0.a
        public final int a(int i) {
            return 0;
        }
    }

    @Override // xsna.qi6
    public final void E6(InterestingStoriesEntry interestingStoriesEntry) {
        InterestingStoriesEntry interestingStoriesEntry2 = interestingStoriesEntry;
        InterestingStoriesHolderViewImpl interestingStoriesHolderViewImpl = this.D;
        ViewGroup viewGroup = this.F;
        ShimmerFrameLayout shimmerFrameLayout = this.E;
        if (interestingStoriesEntry2.e) {
            if (epx.f(interestingStoriesEntry2.f, bwy.a.a)) {
                f4m.j(this.E);
                ViewGroup viewGroup2 = this.F;
                jjc.g(this.G, new f2s(this, 14));
                viewGroup2.setVisibility(0);
                this.D.setVisibility(4);
                return;
            }
            Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
            cVar.k(e3m.f(R.attr.vk_ui_skeleton_from, shimmerFrameLayout.getContext()));
            cVar.a.d = e3m.f(R.attr.vk_ui_skeleton_to, shimmerFrameLayout.getContext());
            shimmerFrameLayout.b(((Shimmer.c) cVar.d()).a());
            shimmerFrameLayout.setVisibility(0);
            f4m.j(viewGroup);
            interestingStoriesHolderViewImpl.setVisibility(4);
            return;
        }
        tdx tdxVar = interestingStoriesEntry2.k;
        if (tdxVar == null || tdxVar.b <= 0) {
            f4m.j(shimmerFrameLayout);
            ViewGroup viewGroup3 = this.F;
            jjc.g(this.G, new f2s(this, 14));
            viewGroup3.setVisibility(0);
            this.D.setVisibility(4);
            return;
        }
        f4m.j(shimmerFrameLayout);
        f4m.j(viewGroup);
        interestingStoriesHolderViewImpl.setVisibility(0);
        interestingStoriesHolderViewImpl.f0();
        DiscoverBlockType discoverBlockType = tdxVar.e;
        gex gexVar = interestingStoriesHolderViewImpl.P;
        if (gexVar != null) {
            gexVar.k = discoverBlockType;
        }
        zex zexVar = interestingStoriesHolderViewImpl.Q;
        if (zexVar != null) {
            ListDataSet<aex> listDataSet = zexVar.d;
            boolean equals = tdxVar.equals(zexVar.e);
            zexVar.e = tdxVar;
            zexVar.h().b = discoverBlockType;
            InterestingStoriesHolderViewImpl interestingStoriesHolderViewImpl2 = zexVar.b;
            interestingStoriesHolderViewImpl2.setTrackCode(tdxVar.f);
            if (equals) {
                listDataSet.l(0, listDataSet.d.size());
                return;
            }
            listDataSet.setItems(tdxVar.c);
            RecyclerView recyclerView = interestingStoriesHolderViewImpl2.x;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(0);
            }
        }
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        fev fevVar = this.C;
        if (fevVar != null) {
            return fevVar.c;
        }
        return null;
    }
}
