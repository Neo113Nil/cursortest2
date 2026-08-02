package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsSliderView$AlbumVerticalState;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.dto.video.VideoAlbum;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.ei1;
import xsna.fet0;
import xsna.t0a;
import xsna.yc1;

/* compiled from: AlbumActionDS.kt */
/* loaded from: classes.dex */
public final class gl1 extends u1a<AlbumsSliderView$AlbumVerticalState, yc1> {
    @Override // xsna.u1a
    public final void g(yc1 yc1Var) {
        yc1 yc1Var2 = yc1Var;
        if (yc1Var2 instanceof yc1.a) {
            t(new ei1.a());
            return;
        }
        boolean z = yc1Var2 instanceof yc1.c;
        mcc0 mcc0Var = this.b;
        if (z) {
            v(new t0a.a(((AlbumsSliderView$AlbumVerticalState) mcc0Var.n()).e.r(), null, null, new t0a.a.d(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP, SchemeStat$EventItem.Type.VIDEO_PLAYLIST), 6));
            t(new ei1.b(((yc1.c) yc1Var2).w(), ((AlbumsSliderView$AlbumVerticalState) mcc0Var.n()).e));
        } else {
            if (yc1Var2 instanceof yc1.d) {
                VideoAlbum videoAlbum = ((AlbumsSliderView$AlbumVerticalState) mcc0Var.n()).e;
                BlockId w = ((yc1.d) yc1Var2).w();
                boolean z2 = ((AlbumsSliderView$AlbumVerticalState) mcc0Var.n()).f;
                t(new fet0.a(w, videoAlbum, ((AlbumsSliderView$AlbumVerticalState) mcc0Var.n()).g));
                return;
            }
            if (!(yc1Var2 instanceof yc1.b)) {
                throw new NoWhenBranchMatchedException();
            }
            yc1.b bVar = (yc1.b) yc1Var2;
            v(new VideoCatalogAnalyticsEvent.a(((AlbumsSliderView$AlbumVerticalState) mcc0Var.n()).e.r(), bVar.b(), bVar.a()));
        }
    }
}
