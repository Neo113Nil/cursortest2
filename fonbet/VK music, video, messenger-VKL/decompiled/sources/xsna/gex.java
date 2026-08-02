package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesBlockEventDispatcher;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesHolderViewImpl;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.aex;
import xsna.tps0;

/* compiled from: InterestingStoriesBlockItemsHolderAdapter.kt */
/* loaded from: classes4.dex */
public final class gex extends zoj0<aex, RecyclerView.e0> {
    public final int e;
    public final ListDataSet<aex> f;
    public String g;
    public final InterestingStoriesBlockEventDispatcher h;
    public final zex i;
    public final InterestingStoriesHolderViewImpl j;
    public DiscoverBlockType k;
    public final Object l;
    public final Object m;

    /* compiled from: InterestingStoriesBlockItemsHolderAdapter.kt */
    public static final class a {
        public final tps0.a a;

        public a(tps0.a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return epx.f(this.a, aVar.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + bh10.a(Long.hashCode(500L) * 31, 31, 300L);
        }

        public final String toString() {
            return "AutoplayHolderConfig(progressBarStartDelay=500, fadeDuration=300, holderSize=" + this.a + ')';
        }
    }

    /* compiled from: InterestingStoriesBlockItemsHolderAdapter.kt */
    public interface b {
        void n5(aex aexVar);
    }

    public gex(int i, ListDataSet listDataSet, InterestingStoriesBlockEventDispatcher interestingStoriesBlockEventDispatcher, zex zexVar, InterestingStoriesHolderViewImpl interestingStoriesHolderViewImpl) {
        super(listDataSet);
        this.e = i;
        this.f = listDataSet;
        this.g = null;
        this.h = interestingStoriesBlockEventDispatcher;
        this.i = zexVar;
        this.j = interestingStoriesHolderViewImpl;
        this.k = DiscoverBlockType.DISCOVER;
        s1m s1mVar = new s1m(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, s1mVar);
        this.m = msy.a(lazyThreadSafetyMode, new mxj(this, 23));
        setHasStableIds(true);
        fex fexVar = new fex(this);
        ArrayList<RecyclerView.i> arrayList = listDataSet.b;
        if (arrayList.contains(fexVar)) {
            return;
        }
        arrayList.add(fexVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (((aex) this.c.c(i)) == null) {
            return 0L;
        }
        return r3.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        aex aexVar = (aex) this.c.c(i);
        if (aexVar instanceof aex.a.b) {
            return this.k == DiscoverBlockType.PHONE_BOOK_STORIES ? 3 : 0;
        }
        if (aexVar instanceof aex.a.C2538a) {
            return this.k == DiscoverBlockType.PHONE_BOOK_STORIES ? 4 : 1;
        }
        if (aexVar instanceof aex.b) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof b) {
            ((b) e0Var).n5((aex) this.c.c(i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ?? r0 = this.l;
        if (i == 0) {
            return new wex(viewGroup, this.j, new a((tps0.a) r0.getValue()), this.i, this.h);
        }
        ?? r2 = this.m;
        InterestingStoriesBlockEventDispatcher interestingStoriesBlockEventDispatcher = this.h;
        zex zexVar = this.i;
        if (i == 1) {
            return new qex(viewGroup, new a((tps0.a) r2.getValue()), zexVar, interestingStoriesBlockEventDispatcher);
        }
        if (i == 2) {
            return new tex(viewGroup, zexVar);
        }
        if (i == 3) {
            return new x2a0(viewGroup, this.j, new a((tps0.a) r0.getValue()), this.i, this.h);
        }
        if (i == 4) {
            return new u2a0(viewGroup, new a((tps0.a) r2.getValue()), zexVar, interestingStoriesBlockEventDispatcher);
        }
        throw new IllegalStateException("Unsupported viewType");
    }
}
