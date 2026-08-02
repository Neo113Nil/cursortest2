package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.discover.media.cells.DiscoverMediaLayoutManagerImpl;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bwy;

/* compiled from: SkeletonDiscoverMediaBlockHolderV2.kt */
/* loaded from: classes4.dex */
public final class lyj0 extends qi6<DiscoverMediaBlock> implements View.OnClickListener {
    public static final /* synthetic */ int I = 0;
    public final RecyclerView C;
    public final View D;
    public final View E;
    public final ThemableShimmer F;
    public final kln0 G;
    public final List<jyj0> H;

    public lyj0(ViewGroup viewGroup, h2c0 h2c0Var) {
        super(R.layout.newsfeed_discover_media_block_skeleton_v2, viewGroup);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.discover_media_block);
        this.C = recyclerView;
        this.D = this.itemView.findViewById(R.id.discover_media_block_error);
        View findViewById = this.itemView.findViewById(R.id.error_retry);
        this.E = findViewById;
        ThemableShimmer a2 = new ThemableShimmer.a(viewGroup.getContext()).a();
        this.F = a2;
        DiscoverMediaLayoutManagerImpl discoverMediaLayoutManagerImpl = new DiscoverMediaLayoutManagerImpl();
        iyj0 iyj0Var = new iyj0(a2);
        kln0 a3 = h2c0Var.a();
        this.G = a3;
        getContext();
        List<jyj0> l = e43.l(new jyj0(2, 1), new jyj0(1, 1), new jyj0(1, 1), new jyj0(1, 1), new jyj0(1, 1));
        this.H = l;
        a2.u = a2.a();
        this.itemView.getContext();
        discoverMediaLayoutManagerImpl.o(iah0.a(2));
        discoverMediaLayoutManagerImpl.i = new oyj0(iyj0Var);
        recyclerView.setLayoutManager(discoverMediaLayoutManagerImpl);
        recyclerView.addItemDecoration(a3);
        recyclerView.setAdapter(iyj0Var);
        discoverMediaLayoutManagerImpl.p(2);
        iyj0Var.setItems(l);
        if (recyclerView.isAttachedToWindow()) {
            a2.b();
        } else {
            recyclerView.addOnAttachStateChangeListener(new a(recyclerView, this));
        }
        if (recyclerView.isAttachedToWindow()) {
            recyclerView.addOnAttachStateChangeListener(new b(recyclerView, this));
        } else {
            a2.c();
        }
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(DiscoverMediaBlock discoverMediaBlock) {
        DiscoverMediaBlock discoverMediaBlock2 = discoverMediaBlock;
        boolean f = epx.f(discoverMediaBlock2.f, bwy.a.a);
        ThemableShimmer themableShimmer = this.F;
        View view = this.D;
        RecyclerView recyclerView = this.C;
        if (f) {
            bwt0.p0(view, true);
            bwt0.d0(recyclerView, true);
            themableShimmer.c();
        } else {
            bwt0.p0(view, false);
            bwt0.p0(recyclerView, true);
            themableShimmer.b();
        }
        String str = (discoverMediaBlock2.Gb() || discoverMediaBlock2.Fb()) ? "decorationWithBackground" : "decoration";
        kln0 kln0Var = this.G;
        if (epx.f(kln0Var.b, str)) {
            return;
        }
        kln0Var.b = str;
        recyclerView.invalidateItemDecorations();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var;
        if (jjc.b()) {
            return;
        }
        DiscoverMediaBlock q6 = q6();
        if (q6 != null && (s980Var = this.y) != null) {
            NewsEntry t6 = t6();
            int h = PostActions.ACTION_LAZY_LOAD_RETRY.h();
            u1c0 J0 = J0();
            s980Var.d9(q6, t6, h, J0 != null ? J0.k : 0);
        }
        bwt0.p0(this.D, false);
        bwt0.p0(this.C, true);
        this.F.b();
    }

    /* compiled from: View.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ lyj0 c;

        public a(RecyclerView recyclerView, lyj0 lyj0Var) {
            this.b = recyclerView;
            this.c = lyj0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.F.b();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ lyj0 c;

        public b(RecyclerView recyclerView, lyj0 lyj0Var) {
            this.b = recyclerView;
            this.c = lyj0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.F.c();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
