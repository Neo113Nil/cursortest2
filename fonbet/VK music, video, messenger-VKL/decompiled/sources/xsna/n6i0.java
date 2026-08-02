package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.content.design.view.photo.selectalbum.SelectAlbumSkeletonView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.photos.root.albumssettings.presentation.view.AlbumsSettingsRecyclerPaginatedView;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vkontakte.android.R;

/* compiled from: SelectAlbumView.kt */
/* loaded from: classes4.dex */
public final class n6i0 implements gm50 {
    public final nt10 b;
    public final SelectAlbumBottomSheet c;
    public final SelectAlbumSkeletonView d;
    public final AlbumsSettingsRecyclerPaginatedView e;
    public final f6i0 f;
    public final com.vk.lists.c g;
    public boolean h;
    public final bqa i;

    public n6i0(View view, nt10 nt10Var, SelectAlbumBottomSheet selectAlbumBottomSheet, el1 el1Var, k6i0 k6i0Var, kdg0 kdg0Var, String str, xd40 xd40Var) {
        this.b = nt10Var;
        this.c = selectAlbumBottomSheet;
        this.d = (SelectAlbumSkeletonView) view.findViewById(R.id.albums_skeleton);
        this.e = (AlbumsSettingsRecyclerPaginatedView) view.findViewById(R.id.albums_recycler);
        f6i0 f6i0Var = new f6i0(kdg0Var, el1Var, new dn20(xd40Var, 24));
        this.f = f6i0Var;
        this.h = true;
        bqa bqaVar = new bqa();
        bqaVar.c = 0.73f;
        this.i = bqaVar;
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) view.findViewById(R.id.toolbar);
        photoFlowToolbarView.Q4(R.drawable.vk_icon_cancel_outline_28, R.string.accessibility_close);
        photoFlowToolbarView.setTitle(str);
        n8c0 n8c0Var = new n8c0(xd40Var, 6);
        bwt0.p0(photoFlowToolbarView.u, true);
        photoFlowToolbarView.w = n8c0Var;
        AlbumsSettingsRecyclerPaginatedView albumsSettingsRecyclerPaginatedView = (AlbumsSettingsRecyclerPaginatedView) view.findViewById(R.id.albums_recycler);
        ((TextView) albumsSettingsRecyclerPaginatedView.getEmptyView().findViewById(R.id.text)).setText(R.string.no_albums_in_albums_select_dialog);
        albumsSettingsRecyclerPaginatedView.Om(new m6i0(xd40Var, this));
        albumsSettingsRecyclerPaginatedView.getRecyclerView().addItemDecoration(bqaVar);
        albumsSettingsRecyclerPaginatedView.setAdapter(f6i0Var);
        albumsSettingsRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, albumsSettingsRecyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        albumsSettingsRecyclerPaginatedView.getRecyclerView().addItemDecoration(new dhk0(cn70.b(16), 0, cn70.b(16), 0));
        c.h hVar = new c.h(k6i0Var);
        hVar.i = 30;
        this.g = com.vk.lists.f.a(hVar, albumsSettingsRecyclerPaginatedView);
        selectAlbumBottomSheet.getLifecycle().addObserver(new fqc0(this, 1));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
