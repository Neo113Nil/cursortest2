package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.digest.FeedDigestBlockSkeleton;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;
import xsna.bwy;

/* compiled from: SkeletonDigestBlockHolderV2.kt */
/* loaded from: classes4.dex */
public final class hyj0 extends qi6<Digest> implements View.OnClickListener {
    public final ThemableShimmer C;

    public hyj0(ViewGroup viewGroup) {
        super(R.layout.feed_digest_block_skeleton_item_v2, viewGroup);
        ThemableShimmer a = new ThemableShimmer.a(viewGroup.getContext()).a();
        this.C = a;
        ((FeedDigestBlockSkeleton) this.itemView).setShimmer(a);
    }

    @Override // xsna.qi6
    public final void E6(Digest digest) {
        boolean f = epx.f(digest.f, bwy.c.a);
        ThemableShimmer themableShimmer = this.C;
        if (f) {
            themableShimmer.b();
        } else {
            themableShimmer.c();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Digest q6;
        s980 s980Var;
        if (jjc.b() || (q6 = q6()) == null || (s980Var = this.y) == null) {
            return;
        }
        NewsEntry t6 = t6();
        int h = PostActions.ACTION_LAZY_LOAD_RETRY.h();
        u1c0 J0 = J0();
        s980Var.d9(q6, t6, h, J0 != null ? J0.k : 0);
    }
}
