package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.view.components.text.VkText;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.profile.community.address.api.di.CommunityAddressComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vkontakte.android.R;
import xsna.dz40;
import xsna.va9;
import xsna.z430;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class b3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object[] objArr = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new pco(((wak0) ((jgh0) obj).a).getIntValue() == 0 ? 0 : 4);
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                int i2 = AbsFollowersListFragment.Y;
                return recyclerView;
            case 2:
                dz20 dz20Var = ((cm0) obj).c;
                if (dz20Var != null) {
                    dz20Var.Qc("AddLinkView");
                }
                return s3q0.a;
            case 3:
                dz20 dz20Var2 = ((sp0) obj).b;
                if (dz20Var2 != null) {
                    dz20Var2.Qc("AddWallView");
                }
                return s3q0.a;
            case 4:
                int i3 = AlbumDetailsFragment.p0;
                return ((AlbumDetailsFragment) obj).ho().r4();
            case 5:
                return Boolean.valueOf(((dz40.e) obj).b == BigPlayerBottomSheetValue.Collapsed);
            case 6:
                int i4 = ArticleAuthorPageFragment.f0;
                return (ProfileFragmentProviderComponent) m7m.d((ArticleAuthorPageFragment) obj).a(fpf0.a(ProfileFragmentProviderComponent.class));
            case 7:
                return ((VideoMinimizablePlayerComponent) ((k7m) m7m.f(((com.vk.libvideo.autoplay.b) obj).d)).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3();
            case 8:
                return new tnp0(((p36) obj).k);
            case 9:
                return ((StickersComponent) ((k7m) m7m.f((u440) obj)).a(fpf0.a(StickersComponent.class))).bc();
            case 10:
                return new tj6((vj6) obj);
            case 11:
                BookingServicesScreenFragment bookingServicesScreenFragment = (BookingServicesScreenFragment) obj;
                qcy<Object>[] qcyVarArr = BookingServicesScreenFragment.S;
                bp80 bp80Var = new bp80(bookingServicesScreenFragment.go());
                l7m d = m7m.d(bookingServicesScreenFragment);
                OnlineBookingInternalComponent.n.getClass();
                return (OnlineBookingInternalComponent) d.d(OnlineBookingInternalComponent.a.a(bp80Var)).a(fpf0.a(OnlineBookingInternalComponent.class));
            case 12:
                ((va9.e) ((va9) obj).e.getValue()).h();
                return s3q0.a;
            case 13:
                int i5 = ChannelFragment.a1;
                return ((StoriesComponent) m7m.d((ChannelFragment) obj).a(fpf0.a(StoriesComponent.class))).w();
            case 14:
                ((a530) ((gmb) obj).d.getValue()).b(z430.c.a);
                return s3q0.a;
            case 15:
                return ((ModerationComponent) ((k7m) m7m.f((qkc) obj)).mo408a(fpf0.a(ModerationComponent.class))).Q2();
            case 16:
                int i6 = inc.l1;
                return ((ClipsCoauthorsInternalComponent) ((inc) obj).g1.getValue()).Ef();
            case 17:
                int i7 = ClipFeedListFragment.a2;
                return new ime(new fc(7), new oxc((ClipFeedListFragment) obj, objArr == true ? 1 : 0));
            case 18:
                return Boolean.valueOf(((ClipSearchRootVh) obj).j0());
            case 19:
                return (VkText) ((wkd) obj).findViewById(R.id.clips_camera_authors_choose_author_name);
            case 20:
                return (ViewGroup) ((d0e) obj).b.inflate();
            case 21:
                return ((leg) obj).o;
            case 22:
                return ((MarketComponent) ((rgg) obj).a.getValue()).l7();
            case 23:
                return ((CommunityAddressComponent) m7m.d(((d3h) obj).a).a(fpf0.a(CommunityAddressComponent.class))).a();
            case 24:
                ((ebh) obj).b();
                return s3q0.a;
            case 25:
                gkh gkhVar = (gkh) obj;
                iea0 iea0Var = (iea0) gkhVar.t;
                if (iea0Var != null) {
                    gkhVar.E.b(iea0Var);
                }
                return s3q0.a;
            case 26:
                return ((TabbarSettingsComponent) ((ynh) obj).r0.getValue()).Ue();
            case 27:
                ((zth) obj).c.invoke();
                return s3q0.a;
            case 28:
                return (YandexAdFeatureComponent) ((k7m) m7m.f((mvh) obj)).a(fpf0.a(YandexAdFeatureComponent.class));
            default:
                int i8 = CommunityReviewsFragment.o0;
                return ((BridgeComponent) m7m.d((CommunityReviewsFragment) obj).a(fpf0.a(BridgeComponent.class))).s().c();
        }
    }
}
