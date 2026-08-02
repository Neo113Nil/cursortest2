package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;

/* compiled from: RecommendedGameSkeletonErrorHolder.kt */
/* loaded from: classes4.dex */
public final class bdf0 extends qi6<NewsEntry> implements w8i, View.OnClickListener {
    public final View C;

    public bdf0(ViewGroup viewGroup) {
        super(R.layout.holder_recommended_game_skeleton_error, viewGroup);
        View findViewById = this.itemView.findViewById(R.id.retry_load_button);
        this.C = findViewById;
        findViewById.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var;
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : 0;
        NewsEntry q6 = q6();
        if (q6 == null || (s980Var = this.y) == null) {
            return;
        }
        s980Var.d9(q6, t6(), PostActions.ACTION_LAZY_LOAD_RETRY.h(), i);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
    }
}
