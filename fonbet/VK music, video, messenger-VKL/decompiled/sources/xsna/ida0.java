package xsna;

import android.view.View;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.photos.root.photoflow.tags.presentation.view.PhotoTagsSkeletonView;
import com.vk.photos.root.photoflow.tags.presentation.view.TagsRecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.gm50;

/* compiled from: PhotoTagsView.kt */
/* loaded from: classes4.dex */
public final class ida0 implements gm50, w8i {
    public final k7y b;
    public final f5z c;
    public final dca0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final TagsRecyclerPaginatedView g;
    public final PhotoTagsSkeletonView h;

    public ida0(View view, UserId userId, hca0 hca0Var, f5z f5zVar, jca0 jca0Var, kca0 kca0Var, k7y k7yVar) {
        this.b = k7yVar;
        this.c = f5zVar;
        int i = 0;
        dca0 dca0Var = new dca0(new x2y(kca0Var, 26), new es00(kca0Var, 18), new fda0(kca0Var, i), new gda0(kca0Var, i), new kn20(kca0Var, 18));
        this.d = dca0Var;
        this.e = new bpn0(new hk70(view, 4));
        this.f = new bpn0(new by20(view, 13));
        TagsRecyclerPaginatedView tagsRecyclerPaginatedView = (TagsRecyclerPaginatedView) view.findViewById(R.id.tags_recycler);
        this.g = tagsRecyclerPaginatedView;
        this.h = (PhotoTagsSkeletonView) view.findViewById(R.id.skeleton);
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) view.findViewById(R.id.toolbar);
        photoFlowToolbarView.Q4(R.drawable.vk_icon_arrow_left_outline_28, R.string.accessibility_back);
        photoFlowToolbarView.setTitle(R.string.photo_tags_title);
        photoFlowToolbarView.P4(new ac20(this, 10));
        bwt0.i0(view.findViewById(R.id.menu), new ftm(hca0Var, this, jca0Var, 5));
        int i2 = hca0Var.h;
        int i3 = i2 == -1 ? 100 : i2;
        int i4 = hca0Var.i;
        wba0 wba0Var = new wba0(userId, hca0Var.f, i3, i4 == -1 ? 100 : i4, hca0Var, new bk30(hca0Var, 14));
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        tagsRecyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, tagsRecyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        tagsRecyclerPaginatedView.setUiStateCallbacks(new hda0());
        tagsRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        tagsRecyclerPaginatedView.setAdapter(dca0Var);
        tagsRecyclerPaginatedView.getRecyclerView().addItemDecoration(new dhk0(cn70.b(0), cn70.b(8), cn70.b(0), cn70.b(0)));
        tagsRecyclerPaginatedView.getRecyclerView().setOverScrollMode(2);
        c.h hVar = new c.h(wba0Var);
        hVar.v = true;
        com.vk.lists.f.a(hVar, tagsRecyclerPaginatedView);
    }

    public final void a(jda0 jda0Var) {
        gm50.a.b(this, jda0Var.a, new bbw(this, 21));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
