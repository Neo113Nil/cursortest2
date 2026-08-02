package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;

/* compiled from: IgnoredFooterHolder.kt */
/* loaded from: classes4.dex */
public final class cwv extends rp6<dwv, NewsEntry> implements View.OnClickListener {
    public final View E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwv(ViewGroup viewGroup) {
        super(R.layout.news_item_ignored_footer, viewGroup);
        viewGroup.getContext();
        View findViewById = this.itemView.findViewById(R.id.item_ignored_cancel);
        this.E = findViewById;
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(dwv dwvVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? q6;
        s980 s980Var;
        if (jjc.b() || (q6 = q6()) == 0) {
            return;
        }
        NewsEntry t6 = t6();
        if (t6 == null) {
            t6 = q6;
        }
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : 0;
        if (!epx.f(view, this.E) || (s980Var = this.y) == 0) {
            return;
        }
        s980Var.d9(q6, t6, PostActions.ACTION_UNIGNORE.h(), i);
    }
}
