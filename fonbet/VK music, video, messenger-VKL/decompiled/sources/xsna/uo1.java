package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsListView$AlbumHorizontalState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.mno0;
import xsna.rmw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class uo1 implements s2a {
    public final /* synthetic */ boolean b;

    public /* synthetic */ uo1(boolean z) {
        this.b = z;
    }

    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        PreviewViewState e;
        Integer a;
        VideoMetaViewState.a aVar;
        String title;
        ArrayList arrayList;
        ImageSize imageSize;
        RestrictionButton zb;
        String title2;
        String title3;
        Image Db;
        ArrayList arrayList2;
        AlbumsListView$AlbumHorizontalState albumsListView$AlbumHorizontalState = (AlbumsListView$AlbumHorizontalState) catalogBlockState;
        String str = albumsListView$AlbumHorizontalState.h;
        VideoAlbum videoAlbum = albumsListView$AlbumHorizontalState.e;
        if (videoAlbum.Cb()) {
            rmw.f f = smw.f(videoAlbum.getImage());
            VideoRestriction O = videoAlbum.O();
            rmw.g d = (O == null || (Db = O.Db()) == null || (arrayList2 = Db.b) == null) ? null : smw.d(arrayList2);
            VideoRestriction O2 = videoAlbum.O();
            mno0.i e2 = (O2 == null || (title3 = O2.getTitle()) == null) ? null : nno0.e(title3);
            VideoRestriction O3 = videoAlbum.O();
            e = PreviewViewState.a0.a.a(f, true, new PlaceholderViewState(d, e2, (O3 == null || (zb = O3.zb()) == null || (title2 = zb.getTitle()) == null) ? null : nno0.e(title2), null, null, 24));
        } else {
            rmw.f f2 = smw.f(videoAlbum.getImage());
            int count = videoAlbum.getCount();
            int size = videoAlbum.Db().size();
            Integer valueOf = Integer.valueOf(size);
            if (size <= 0) {
                valueOf = null;
            }
            e = PreviewViewState.a0.e(f2, count, valueOf, (videoAlbum.Gb() || (a = hng.a(videoAlbum.getPrivacy())) == null) ? null : new PreviewViewState.n(rmw.a.a(a.intValue()), null, null, null, 14), 32);
        }
        PreviewViewState previewViewState = e;
        String title4 = videoAlbum.getTitle();
        if (title4 == null) {
            title4 = "";
        }
        VideoMetaViewState.i iVar = new VideoMetaViewState.i(nno0.e(title4));
        VideoMetaViewState.a aVar2 = new VideoMetaViewState.a(null, null, null, false, null, hng.b(Integer.valueOf(videoAlbum.Fb())), null, 0, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
        if (str != null) {
            Image image = albumsListView$AlbumHorizontalState.g;
            aVar = new VideoMetaViewState.a(null, (image == null || (arrayList = image.b) == null || (imageSize = (ImageSize) j5g.a0(arrayList)) == null) ? null : imageSize.getUrl(), nno0.e(str), albumsListView$AlbumHorizontalState.i, null, null, null, 0, 241);
        } else {
            aVar = null;
        }
        VideoCellViewState videoCellViewState = new VideoCellViewState(previewViewState, new VideoCellViewState.g(new VideoMetaViewState(iVar, aVar2, aVar)), !videoAlbum.Hb() ? VideoCellViewState.c.a.a() : null, null, albumsListView$AlbumHorizontalState.k ? new VideoCellViewState.e(null) : null, 8);
        BlockId blockId = albumsListView$AlbumHorizontalState.b;
        VideoRestriction O4 = videoAlbum.O();
        return new vo1(blockId, (O4 == null || (title = O4.getTitle()) == null) ? "" : title, videoCellViewState, albumsListView$AlbumHorizontalState.j, this.b);
    }
}
