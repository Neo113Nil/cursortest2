package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.content.design.view.photo.albumsettings.AlbumsSettingsSkeletonView;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.photos.root.albumssettings.presentation.view.AlbumsSettingsRecyclerPaginatedView;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vkontakte.android.R;

/* compiled from: AlbumsSettingsView.kt */
/* loaded from: classes4.dex */
public final class qq1 implements gm50 {
    public final xp1 b;
    public final AlbumsSettingsSkeletonView c;
    public final View d;
    public final AlbumsSettingsRecyclerPaginatedView e;
    public final androidx.recyclerview.widget.r f;
    public final pk1 g;
    public final qk1 h;
    public final com.vk.lists.c i;

    public qq1(View view, xp1 xp1Var, kdg0 kdg0Var, UserId userId, AlbumsRepository albumsRepository, io.reactivex.rxjava3.disposables.b bVar, com.vk.movika.sdk.base.logic.interactor.p pVar) {
        this.b = xp1Var;
        this.c = (AlbumsSettingsSkeletonView) view.findViewById(R.id.albums_skeleton);
        this.d = view.findViewById(R.id.albums_container);
        this.e = (AlbumsSettingsRecyclerPaginatedView) view.findViewById(R.id.albums_recycler);
        androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r(new pq1(pVar, this));
        this.f = rVar;
        int i = 0;
        int i2 = 3;
        pk1 pk1Var = new pk1(kdg0Var, new mq1(i, pVar, this), new lb(pVar, i2));
        this.g = pk1Var;
        qk1 qk1Var = new qk1();
        this.h = qk1Var;
        d920 y0 = d920.y0(pk1Var, qk1Var);
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) view.findViewById(R.id.toolbar);
        photoFlowToolbarView.Q4(R.drawable.vk_icon_cancel_outline_28, R.string.accessibility_close);
        photoFlowToolbarView.setTitle(R.string.albums_settings_title);
        l8 l8Var = new l8(pVar, i2);
        bwt0.p0(photoFlowToolbarView.u, true);
        photoFlowToolbarView.w = l8Var;
        AlbumsSettingsRecyclerPaginatedView albumsSettingsRecyclerPaginatedView = (AlbumsSettingsRecyclerPaginatedView) view.findViewById(R.id.albums_recycler);
        ((TextView) albumsSettingsRecyclerPaginatedView.getEmptyView().findViewById(R.id.text)).setText(R.string.no_albums_in_albums_settings_dialog);
        albumsSettingsRecyclerPaginatedView.setAdapter(y0);
        albumsSettingsRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, albumsSettingsRecyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        albumsSettingsRecyclerPaginatedView.getRecyclerView().addItemDecoration(new dhk0(cn70.b(16), 0, cn70.b(16), 0));
        c.h hVar = new c.h(new gq1(userId, albumsRepository, bVar, new mb(pVar, i2), new dr0(pVar, 1), new nq1(pVar, i)));
        hVar.i = 30;
        this.i = com.vk.lists.f.a(hVar, albumsSettingsRecyclerPaginatedView);
        rVar.l(albumsSettingsRecyclerPaginatedView.getRecyclerView());
        xp1Var.getLifecycle().addObserver(new oq1(this));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
