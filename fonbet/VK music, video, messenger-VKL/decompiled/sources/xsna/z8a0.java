package xsna;

import android.content.Context;
import android.view.View;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photos.root.photoflow.settings.presentation.view.PhotoFlowSettingsRecyclerPaginatedView;
import com.vk.photos.root.photoflow.settings.presentation.view.PhotoFlowSettingsSkeletonView;
import com.vkontakte.android.R;

/* compiled from: PhotoFlowSettingsView.kt */
/* loaded from: classes4.dex */
public final class z8a0 implements gm50 {
    public final m8a0 b;
    public final AlbumsRepository c;
    public final el1 d;
    public final ui e;
    public final Context f;
    public final j8a0 g;
    public final PhotoFlowSettingsRecyclerPaginatedView h;
    public final com.vk.lists.c i;
    public final PhotoFlowSettingsSkeletonView j;
    public int k;
    public com.vk.core.view.components.spinner.c l;
    public final PhotoFlowToolbarView m;

    public z8a0(View view, kdg0 kdg0Var, m8a0 m8a0Var, AlbumsRepository albumsRepository, jed0 jed0Var, UserId userId, io.reactivex.rxjava3.disposables.b bVar, el1 el1Var, ui uiVar) {
        this.b = m8a0Var;
        this.c = albumsRepository;
        this.d = el1Var;
        this.e = uiVar;
        this.f = view.getContext();
        j8a0 j8a0Var = new j8a0(kdg0Var, new d0w(this, 12), new qw30(this, 12));
        this.g = j8a0Var;
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) view.findViewById(R.id.toolbar);
        photoFlowToolbarView.Q4(R.drawable.vk_icon_cancel_outline_28, R.string.photo_flow_settings_acessibility_close_settings);
        photoFlowToolbarView.setTitle(R.string.photo_flow_settings_title);
        dnz dnzVar = new dnz(this, 6);
        bwt0.p0(photoFlowToolbarView.u, true);
        photoFlowToolbarView.w = dnzVar;
        photoFlowToolbarView.getMenuButton().setImageDrawable(dhr0.x(R.drawable.vk_icon_done_outline_28, R.attr.vk_ui_icon_accent, photoFlowToolbarView.getContext()));
        photoFlowToolbarView.getMenuButton().setContentDescription(photoFlowToolbarView.getContext().getString(R.string.accessibility_done));
        bwt0.i0(photoFlowToolbarView.getMenuButton(), new dn20(this, 13));
        this.m = photoFlowToolbarView;
        this.j = (PhotoFlowSettingsSkeletonView) view.findViewById(R.id.albums_skeleton);
        PhotoFlowSettingsRecyclerPaginatedView photoFlowSettingsRecyclerPaginatedView = (PhotoFlowSettingsRecyclerPaginatedView) view.findViewById(R.id.albums_recycler);
        photoFlowSettingsRecyclerPaginatedView.setAdapter(j8a0Var);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, photoFlowSettingsRecyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        photoFlowSettingsRecyclerPaginatedView.getRecyclerView().setVerticalScrollBarEnabled(false);
        photoFlowSettingsRecyclerPaginatedView.getRecyclerView().addItemDecoration(new dhk0(cn70.b(16), 0, cn70.b(16), 0));
        c.h hVar = new c.h(new t8a0(userId, albumsRepository, jed0Var, bVar, el1Var, new jkg(this, 10), new nx7(this, 10)));
        hVar.i = 30;
        this.i = com.vk.lists.f.a(hVar, photoFlowSettingsRecyclerPaginatedView);
        m8a0Var.getLifecycle().addObserver(new gnt(this, 1));
        this.h = photoFlowSettingsRecyclerPaginatedView;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
