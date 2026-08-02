package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsSliderView$AlbumVerticalState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.Image;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.mno0;
import xsna.rmw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tq1 implements s2a {
    public final /* synthetic */ boolean b;

    public /* synthetic */ tq1(boolean z) {
        this.b = z;
    }

    @Override // xsna.s2a
    public final r2a a(CatalogBlockState catalogBlockState) {
        PreviewViewState e;
        Integer a;
        String title;
        RestrictionButton zb;
        String title2;
        String title3;
        Image Db;
        ArrayList arrayList;
        AlbumsSliderView$AlbumVerticalState albumsSliderView$AlbumVerticalState = (AlbumsSliderView$AlbumVerticalState) catalogBlockState;
        VideoAlbum videoAlbum = albumsSliderView$AlbumVerticalState.e;
        if (videoAlbum.Cb()) {
            rmw.f f = smw.f(videoAlbum.getImage());
            VideoRestriction O = videoAlbum.O();
            rmw.g d = (O == null || (Db = O.Db()) == null || (arrayList = Db.b) == null) ? null : smw.d(arrayList);
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
        boolean z = albumsSliderView$AlbumVerticalState.c == CatalogBlockVariant.AlbumsSlider;
        BlockId blockId = albumsSliderView$AlbumVerticalState.b;
        VideoRestriction O4 = videoAlbum.O();
        String str = (O4 == null || (title = O4.getTitle()) == null) ? "" : title;
        String title4 = videoAlbum.getTitle();
        VideoCardViewState videoCardViewState = new VideoCardViewState(e, VideoCardViewState.a.b(new VideoMetaViewState(new VideoMetaViewState.i(nno0.e(title4 != null ? title4 : ""), 2), z ? null : new VideoMetaViewState.a(null, null, null, false, null, hng.b(Integer.valueOf(videoAlbum.Fb())), null, 0, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), 4), false, 5));
        boolean z2 = albumsSliderView$AlbumVerticalState.h;
        boolean z3 = this.b;
        return new wq1(blockId, str, videoCardViewState, z2, z3 ? VideoCardViewState.Size.Medium : VideoCardViewState.Size.Small, z ? 142 : z3 ? Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE : 154);
    }
}
