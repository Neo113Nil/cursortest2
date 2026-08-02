package xsna;

import android.widget.ImageView;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.holders.ComposeHeaderVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.precache.api.RefreshType;
import com.vk.clips.precache.impl.di.ClipsPrecacheComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.preloader.ui.BookingPreloaderFragment;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.mytarget.di.AdsSdkComponentImpl;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumEntryPoint;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.superapp.miniapps.picker.AppsPickerFragment;
import com.vkontakte.android.R;
import java.io.File;
import one.video.player.BaseVideoPlayer;
import one.video.player.RepeatMode;
import xsna.j9d0;
import xsna.qie;
import xsna.z8w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class w40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        File webviewCacheDir_delegate$lambda$1;
        int i = this.b;
        ?? r3 = this.c;
        switch (i) {
            case 0:
                ((zak0) ((z40) r3).h).setValue(Boolean.valueOf(!r3.e()));
                return s3q0.a;
            case 1:
                ImageView imageView = (ImageView) ((VKImageController) r3).getView();
                imageView.setLayoutParams(cpy.a(-1, -1, 0, 0, 0, 0, 60));
                return imageView;
            case 2:
                qcy<Object>[] qcyVarArr = AdsSdkComponentImpl.e;
                return (AdPixelStatsComponent) r3.getValue();
            case 3:
                int i2 = AlbumDetailsFragment.p0;
                ((dw20) r3).hide();
                return s3q0.a;
            case 4:
                webviewCacheDir_delegate$lambda$1 = AndroidCacheRepository.webviewCacheDir_delegate$lambda$1((AndroidCacheRepository) r3);
                return webviewCacheDir_delegate$lambda$1;
            case 5:
                int i3 = AppsCatalogFragment.W;
                return ((QueueSyncComponent) m7m.d((AppsCatalogFragment) r3).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 6:
                return (AppsPickerFragment) ((nl) r3).b;
            case 7:
                return Float.valueOf(f17.e((h17) r3));
            case 8:
                return Boolean.valueOf(((fh5) r3).G0.c);
            case 9:
                return Integer.valueOf(((j96) r3).c());
            case 10:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) r3;
                PickerRecyclerPaginatedView pickerRecyclerPaginatedView = basePhotoListFragment.a0;
                (pickerRecyclerPaginatedView != null ? pickerRecyclerPaginatedView : null).e0();
                gj6 io2 = basePhotoListFragment.io();
                if (io2 != null) {
                    io2.d();
                }
                return s3q0.a;
            case 11:
                vw3 vw3Var = BaseVideoPlayer.H;
                return "RepeatMode set to " + ((RepeatMode) r3);
            case 12:
                int i4 = BonusCatalogFragment.f0;
                return ((BridgeComponent) m7m.d((BonusCatalogFragment) r3).a(fpf0.a(BridgeComponent.class))).p();
            case 13:
                BookingPreloaderFragment bookingPreloaderFragment = (BookingPreloaderFragment) r3;
                qcy<Object>[] qcyVarArr2 = BookingPreloaderFragment.S;
                ?? r0 = bookingPreloaderFragment.O;
                return new at7(((OnlineBookingInternalComponent) r0.getValue()).Jf(), ((OnlineBookingInternalComponent) r0.getValue()).Lf().a(null), ((OnlineBookingInternalComponent) r0.getValue()).Kf(), (BookingScreenParams) bookingPreloaderFragment.N.getValue(), new com.vk.movika.sdk.base.ui.v(5));
            case 14:
                dt8 dt8Var = (dt8) r3;
                dt8Var.t.invoke();
                dt8Var.p.dismiss();
                return s3q0.a;
            case 15:
                ((z89) r3).e(j9d0.f.a);
                return s3q0.a;
            case 16:
                ChannelFragment channelFragment = (ChannelFragment) r3;
                z8w.a aVar = channelFragment.U.h;
                if (aVar == null) {
                    return null;
                }
                channelFragment.requireContext();
                return aVar.a();
            case 17:
                ngb ngbVar = (ngb) r3;
                return BuildInfo.t() ? ngbVar.a.getString(R.string.vkim_channels_no_posts) : ngbVar.a.getString(R.string.vkim_channels_no_channel_posts);
            case 18:
                io.reactivex.rxjava3.disposables.c cVar = ((cxb) r3).x.h;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 19:
                return jmc.c((jmc) r3);
            case 20:
                lsd lsdVar = (lsd) r3;
                lsdVar.b.t();
                lsdVar.g = null;
                return s3q0.a;
            case 21:
                ClipsPrecacheComponentImpl clipsPrecacheComponentImpl = (ClipsPrecacheComponentImpl) r3;
                hwe hweVar = clipsPrecacheComponentImpl.a;
                a6e N = hweVar.a().N();
                return new qie(new qie.b(N.b, N.a, BuildInfo.s() ? RefreshType.RefreshOnInit : RefreshType.RefreshOnEmpty), new yie(clipsPrecacheComponentImpl.b.a, hweVar.a(), hweVar), new rhh0(hweVar.b()), new vie(hweVar), hweVar);
            case 22:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return new uih0(new rdi(), new bgd(), new cgd(((ClipsViewerComponentImpl) r3).b.getExperiments(), new b590()));
            case 23:
                return ((BridgeComponent) ((k7m) m7m.f((CommunitiesCatalogRootVh) r3)).a(fpf0.a(BridgeComponent.class))).F();
            case 24:
                ((CommunitiesSearchTopBarVh) r3).b.invoke(a.h.a);
                return s3q0.a;
            case 25:
                return (VkImageSimple) ((uqg) r3).findViewById(R.id.community_address_info_cell_metro_icon);
            case 26:
                return (VkVideoPromoComponent) ((h7m) r3).a(fpf0.a(VkVideoPromoComponent.class));
            case 27:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) r3;
                return dVar.O(new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.b(dVar.h, dVar.p, dVar.o, dVar.n));
            case 28:
                ComposeHeaderVh composeHeaderVh = (ComposeHeaderVh) r3;
                qcy<Object>[] qcyVarArr4 = ComposeHeaderVh.n;
                if (!jjc.d().a()) {
                    qcy<Object>[] qcyVarArr5 = ComposeHeaderVh.n;
                    composeHeaderVh.b(ClickType.SHOW_ALL);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            default:
                int i5 = CreateAlbumFragment.Z;
                return (CreateAlbumEntryPoint) ((CreateAlbumFragment) r3).requireArguments().getParcelable("entry_point");
        }
    }
}
