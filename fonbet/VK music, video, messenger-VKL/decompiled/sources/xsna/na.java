package xsna;

import android.os.Bundle;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogEmbeddedTabsVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.a;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.b;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.vmoji.storage.api.di.component.VmojiStorageComponent;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.actionlinks.views.holders.search.ItemSearch$ItemSearchListener$Mode;
import ru.ok.android.webrtc.Call;
import xsna.dz40;
import xsna.hx7;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class na implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ na(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        AddLinkPresenter.c cVar;
        dmv a;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                f3s f3sVar = ((AbsFollowersListFragment) obj).V;
                if (f3sVar == null) {
                    return null;
                }
                return f3sVar;
            case 1:
                return (NewsFeedComponent) ((k7m) m7m.f((ta0) obj)).a(fpf0.a(NewsFeedComponent.class));
            case 2:
                cm0 cm0Var = (cm0) obj;
                VkSearchView vkSearchView = cm0Var.f;
                if (vkSearchView == null) {
                    vkSearchView = null;
                }
                StringBuilder sb = new StringBuilder("@");
                VkSearchView vkSearchView2 = cm0Var.f;
                if (vkSearchView2 == null) {
                    vkSearchView2 = null;
                }
                sb.append(vkSearchView2.getQuery());
                vkSearchView.setQuery(sb.toString());
                AddLinkPresenter addLinkPresenter = cm0Var.d;
                if (addLinkPresenter != null && (cVar = addLinkPresenter.o) != null) {
                    VkSearchView vkSearchView3 = cm0Var.f;
                    cVar.a((vkSearchView3 != null ? vkSearchView3 : null).getQuery(), ItemSearch$ItemSearchListener$Mode.USER);
                }
                return s3q0.a;
            case 3:
                int i2 = com.vk.channelrestrictions.a.g1;
                ((com.vk.channelrestrictions.a) obj).dismiss();
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((dz40.e) obj).a == ParentBottomSheetState.EXPANDED);
            case 5:
                return ((VmojiStorageComponent) ((k7m) m7m.f((qr2) obj)).a(fpf0.a(VmojiStorageComponent.class))).H();
            case 6:
                int i3 = ar3.l1;
                return (BridgeComponent) m7m.d((ar3) obj).a(fpf0.a(BridgeComponent.class));
            case 7:
                return ((VideoAdvertisementsComponent) ((k7m) m7m.f(((com.vk.libvideo.autoplay.b) obj).d)).mo408a(fpf0.a(VideoAdvertisementsComponent.class))).pc();
            case 8:
                BanReasonBottomSheet.a aVar = BanReasonBottomSheet.g1;
                ((BanReasonBottomSheet) obj).dismiss();
                return s3q0.a;
            case 9:
                return new tnp0(((p36) obj).l);
            case 10:
                return ((StoriesComponent) ((k7m) m7m.f((u440) obj)).a(fpf0.a(StoriesComponent.class))).t0();
            case 11:
                return new sj6((wj6) obj);
            case 12:
                BookingServicesScreenFragment bookingServicesScreenFragment = (BookingServicesScreenFragment) obj;
                qcy<Object>[] qcyVarArr = BookingServicesScreenFragment.S;
                Bundle requireArguments = bookingServicesScreenFragment.requireArguments();
                boolean z = requireArguments.getBoolean("canGoBack", true);
                boolean z2 = requireArguments.getBoolean("isPickerMode", false);
                String str = z2 ? "picker_mode" : epx.f(bookingServicesScreenFragment.go().d, BookingSettings.k) ? "no_settings" : "regular";
                mzp0 mzp0Var = bookingServicesScreenFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.k(str);
                }
                if (z2) {
                    ewy ewyVar = bookingServicesScreenFragment.eo().i;
                    qcy<Object> qcyVar = OnlineBookingInternalComponent.o[8];
                    a = (sha0) ewyVar.c();
                } else {
                    a = bookingServicesScreenFragment.go().q == BookingServiceType.GROUP ? bookingServicesScreenFragment.eo().If().a(bookingServicesScreenFragment.fo(bookingServicesScreenFragment.go())) : bookingServicesScreenFragment.eo().Lf().a(bookingServicesScreenFragment.fo(bookingServicesScreenFragment.go()));
                }
                return new ax7(bookingServicesScreenFragment.go(), bookingServicesScreenFragment.J, new mx7(new hx7.a(z, z2), a, bookingServicesScreenFragment.eo().Mf()), new f20(3));
            case 13:
                return ((Call) obj).g();
            case 14:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i4 = ChannelFragment.a1;
                return new hza(channelFragment.ro(), channelFragment.lo(), channelFragment.requireContext(), false, channelFragment.isPostponed());
            case 15:
                bsb bsbVar = (bsb) obj;
                return new isb(bsbVar.i, bsbVar.l, bsbVar.k);
            case 16:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 17:
                return ((MarketComponent) ((k7m) m7m.f((qkc) obj)).a(fpf0.a(MarketComponent.class))).Ob();
            case 18:
                int i5 = inc.l1;
                return ((ClipsCoauthorsInternalComponent) ((inc) obj).g1.getValue()).Df();
            case 19:
                twc twcVar = (twc) obj;
                wwc wwcVar = new wwc(twcVar);
                fot fotVar = new fot(twcVar.getContext(), wwcVar, null);
                fotVar.a.setOnDoubleTapListener(wwcVar);
                return fotVar;
            case 20:
                return new ErrorOverlayRenderDelegate(((w6d) ((b2d) obj).a.getValue()).p, new tb4(5));
            case 21:
                ((ClipSearchRootVh) obj).A.d();
                return s3q0.a;
            case 22:
                return new wqc((oqc) ((sdd) obj).E.getValue());
            case 23:
                int i6 = ClipsEntryPointsFragment.i0;
                return ((ClipsConfigAuthorsComponent) m7m.d((ClipsEntryPointsFragment) obj).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 24:
                String str2 = com.vk.clips.favorites.impl.ui.folders.renaming.b.m1;
                return (ClipsFavoritesComponentImpl) m7m.d((com.vk.clips.favorites.impl.ui.folders.renaming.b) obj).mo408a(fpf0.a(ClipsFavoritesComponent.class));
            case 25:
                com.vk.clips.attachments.impl.publish.geolocation.presentation.b bVar = (com.vk.clips.attachments.impl.publish.geolocation.presentation.b) obj;
                b.C0547b c0547b = com.vk.clips.attachments.impl.publish.geolocation.presentation.b.k1;
                a.C0546a c0546a = a.C0546a.b;
                bVar.getClass();
                xn50.a.c(bVar, c0546a);
                return s3q0.a;
            case 26:
                u4a u4aVar = ((ClipsMusicSelectorCatalogEmbeddedTabsVh) obj).b;
                return u4aVar.b.s.K(u4aVar);
            case 27:
                qcy<Object>[] qcyVarArr2 = kse.n1;
                return (ClipsPlaylistsComponentImpl) ((k7m) m7m.f((kse) obj)).mo408a(fpf0.a(ClipsPlaylistsComponent.class));
            case 28:
                return ((tud) obj).a();
            default:
                return new yu0(((iwf) obj).c);
        }
    }
}
