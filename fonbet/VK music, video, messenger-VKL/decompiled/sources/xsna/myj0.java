package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: SkeletonErrorBlockHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class myj0 extends rp6<nyj0, NewsEntry> {
    public final View E;

    public myj0(ViewGroup viewGroup) {
        super(R.layout.skeleton_error_block_header, viewGroup);
        View findViewById = this.itemView.findViewById(R.id.icon_skeleton_header_error_hide);
        this.E = findViewById;
        findViewById.setOnClickListener(new bn1(this, 13));
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(nyj0 nyj0Var) {
    }
}
