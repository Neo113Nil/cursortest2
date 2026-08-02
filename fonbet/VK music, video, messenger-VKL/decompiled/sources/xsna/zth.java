package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vkontakte.android.R;

/* compiled from: CommunityProfileStaticCoverViewDelegate.kt */
/* loaded from: classes5.dex */
public final class zth {
    public final CommunityStaticCover a;
    public final RecyclerView b;
    public final kbe c;

    public zth(CommunityStaticCover communityStaticCover, RecyclerView recyclerView, kbe kbeVar) {
        this.a = communityStaticCover;
        this.b = recyclerView;
        this.c = kbeVar;
        if (communityStaticCover != null) {
            communityStaticCover.setOnHeightChanges(new vs(this, 28));
        }
    }

    public final void a() {
        CommunityStaticCover communityStaticCover = this.a;
        if (communityStaticCover == null) {
            return;
        }
        int measuredHeight = (communityStaticCover.getMeasuredHeight() - y8g0.a(R.dimen.community_header_background_margin)) - y8g0.a(R.dimen.community_header_corner_radius);
        RecyclerView recyclerView = this.b;
        if (measuredHeight != recyclerView.getPaddingTop()) {
            f4m.y(measuredHeight, recyclerView);
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && linearLayoutManager.v() == 0) {
                recyclerView.post(new ryc(linearLayoutManager, 1));
            }
        }
    }
}
