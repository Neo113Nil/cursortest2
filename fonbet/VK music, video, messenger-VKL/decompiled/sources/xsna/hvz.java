package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.badges.fragments.OneTimeDonutFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.holders.MusicPlaylistCellVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.managed_groups.impl.ManagedGroupsInnerComponent;
import com.vk.musc.kidsmode.impl.di.MusicKidsModeComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.poll.views.PollSettingView;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cs00;
import xsna.e3m;
import xsna.fn20;
import xsna.k840;
import xsna.mzh0;
import xsna.xn50;
import xsna.ydl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hvz implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hvz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Playlist playlist;
        int i = 0;
        switch (this.b) {
            case 0:
                LocalMediaPickerFragment localMediaPickerFragment = (LocalMediaPickerFragment) this.c;
                int i2 = LocalMediaPickerFragment.d0;
                return ((BridgeComponent) m7m.d(localMediaPickerFragment).a(fpf0.a(BridgeComponent.class))).id();
            case 1:
                return new li00(((ManagedGroupsInnerComponent) this.c).a.i0(), new la0(15));
            case 2:
                ((wr00) this.c).i.a(cs00.l.a);
                return s3q0.a;
            case 3:
                return Integer.valueOf(((ArrayList) this.c).size());
            case 4:
                return ((BridgeComponent) m7m.d((ee10) this.c).a(fpf0.a(BridgeComponent.class))).p().a();
            case 5:
                n620 n620Var = (n620) this.c;
                zwh0<P> zwh0Var = n620Var.c;
                iqh0 iqh0Var = n620Var.b;
                ywh0 ywh0Var = new ywh0(n620Var, n620Var.f, (arh0) n620Var.e.getValue());
                mzh0 b = iqh0Var.b();
                mzh0.a aVar = b instanceof mzh0.a ? (mzh0.a) b : null;
                r620 r620Var = aVar == null ? null : new r620(iqh0Var.a(), aVar, ywh0Var, zwh0Var.a);
                if (r620Var != null) {
                    return r620Var;
                }
                return null;
            case 6:
                return "Received historyEvent = ".concat(qjg.a((m8v) this.c));
            case 7:
                ((zak0) ((fn20.a) this.c).a).setValue(Boolean.valueOf(!r0.b()));
                return s3q0.a;
            case 8:
                return Integer.valueOf(((fp20) this.c).getBindingAdapterPosition());
            case 9:
                ((kz20) this.c).e.Qc("about_video_bottom_sheet");
                return s3q0.a;
            case 10:
                return h5s.c(((lj30) this.c).c, " found in msghistory but not in msgs", new StringBuilder("Msg "));
            case 11:
                Context t = ((xt30) this.c).t();
                e3m.a aVar2 = e3m.a;
                return m33.a(R.drawable.vkim_msg_part_transparent_black_bg, t).mutate();
            case 12:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.a) this.c)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 13:
                return ((MusicKidsModeComponentImpl) this.c).b.a();
            case 14:
                MusicPlaylistCellVh musicPlaylistCellVh = (MusicPlaylistCellVh) this.c;
                if (!musicPlaylistCellVh.a() && (playlist = musicPlaylistCellVh.j) != null && epx.f(playlist.H, DownloadingState.NotLoaded.b)) {
                    VkCell vkCell = musicPlaylistCellVh.k;
                    k840.a.d().E((vkCell != null ? vkCell : null).getContext(), playlist);
                }
                return s3q0.a;
            case 15:
                z550 z550Var = (z550) this.c;
                return new n5d0(z550Var.i, (dx40) z550Var.p.getValue(), new x550(z550Var, i));
            case 16:
                ydl0.a aVar3 = ((ys50) this.c).b;
                if (aVar3 != null) {
                    aVar3.onClose();
                }
                return s3q0.a;
            case 17:
                return ((NewsfeedSearchFragment) this.c).S;
            case 18:
                OneTimeDonutFragment oneTimeDonutFragment = (OneTimeDonutFragment) this.c;
                int i3 = OneTimeDonutFragment.V;
                return (NewsFeedComponent) m7m.d(oneTimeDonutFragment).a(fpf0.a(NewsFeedComponent.class));
            case 19:
                ((ru80) this.c).a.invoke(new OrderAction.f(OrderPaymentResult.Success));
                return s3q0.a;
            case 20:
                return ((jh90) this.c).l;
            case 21:
                PhotoAlbumFragment.b bVar = (PhotoAlbumFragment.b) this.c;
                bVar.setupEmptyHeader(bVar.d);
                return s3q0.a;
            case 22:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i4 = PhotoFlowFragment.m0;
                a.g.c cVar = a.g.c.b;
                photoFlowFragment.getClass();
                xn50.a.c(photoFlowFragment, cVar);
                return s3q0.a;
            case 23:
                return ((NewsFeedComponent) ((k7m) m7m.f((faa0) this.c)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 24:
                ((kg50) this.c).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 25:
                return (PollSettingView) ((hpb0) this.c).g(R.id.poll_option_limit);
            case 26:
                ((dcc0) this.c).b.no(false);
                return s3q0.a;
            case 27:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i5 = PostingFragment.L0;
                return (ibc0) postingFragment.s0.getValue();
            case 28:
                pgc0 pgc0Var = (pgc0) this.c;
                return new wcc0((ycc0) pgc0Var.v.getValue(), (com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.a) pgc0Var.x.getValue());
            default:
                ((gzs) this.c).invoke();
                return s3q0.a;
        }
    }
}
