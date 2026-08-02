package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchViewVh;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorComponent;
import com.vk.im.notification.settings.impl.MessengerNotificationSettingsComponentImpl;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.playlist.display.audiobook.offline.presentation.fragment.OfflineAudioBookChaptersFragment;
import com.vk.newsfeed.common.views.clips.NewsFeedControlsLayout;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import xsna.pr50;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x4u implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x4u(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Drawable a;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((y4u) obj).j.c;
            case 1:
                g8u g8uVar = (g8u) obj;
                h8u h8uVar = (h8u) g8uVar.m;
                if (!h8uVar.l && h8uVar.o == MarketItemType.OZON) {
                    g8uVar.o.a(h8uVar.b, h8uVar.c);
                    g8uVar.p.invoke();
                }
                return s3q0.a;
            case 2:
                int i2 = HomeFragment2.x0;
                h3p0.b((HomeFragment2) obj);
                return s3q0.a;
            case 3:
                return (ImCmdCoroutinesExecutorComponent) ((g8m) obj).a(fpf0.a(ImCmdCoroutinesExecutorComponent.class));
            case 4:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) obj;
                return new aaz(bVar, bVar.l.a());
            case 5:
                return Integer.valueOf(((mc90) obj).k());
            case 6:
                int i3 = c810.o1;
                ((c810) obj).hide();
                return s3q0.a;
            case 7:
                return new mqu(new c2u((f910) obj, 10));
            case 8:
                MessengerNotificationSettingsComponentImpl messengerNotificationSettingsComponentImpl = (MessengerNotificationSettingsComponentImpl) obj;
                qcy<Object>[] qcyVarArr = MessengerNotificationSettingsComponentImpl.e;
                return new com.vk.im.notification.settings.impl.a(new y84(9), messengerNotificationSettingsComponentImpl.a.He(), messengerNotificationSettingsComponentImpl.b.s(), messengerNotificationSettingsComponentImpl.c.D3());
            case 9:
                return Integer.valueOf(((qq20) obj).getBindingAdapterPosition());
            case 10:
                return Integer.valueOf((int) ((hk30) obj).b.b(R.dimen.vkim_video_msg_size));
            case 11:
                return (TextView) ((un30) obj).d.findViewById(R.id.publisher);
            case 12:
                Context context = ((cr30) obj).d;
                return new fk30(context != null ? context : null);
            case 13:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((u440) obj)).a(fpf0.a(StoryEditorExtDepsComponent.class))).w0();
            case 14:
                return new com.vk.im.ui.components.msg_search.vc.d(((LayoutInflater) obj).getContext());
            case 15:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj;
                lyd.g().t(musicCatalogRootVh.b);
                w950 w950Var = (w950) musicCatalogRootVh.q.getValue();
                if (w950Var != null) {
                    String str = musicCatalogRootVh.t;
                    w950Var.w(str != null ? str : "");
                }
                return s3q0.a;
            case 16:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj;
                dml dmlVar = musicMyAudiosCatalogRootVh.H;
                return MusicFeatures.AUDIO_VKUI_SEARCH.h() ? new VkSearchViewVh(R.string.music_hint_search, new txh0(new bfm(musicMyAudiosCatalogRootVh, 23), new mcd(musicMyAudiosCatalogRootVh, 1), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), new grp0(true, true), dmlVar) : new VkSearchQueryVh(new SearchQueryVh(R.string.music_hint_search, new qfj(musicMyAudiosCatalogRootVh, 24), new w4u(musicMyAudiosCatalogRootVh, 17), null, dmlVar, 96), null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            case 17:
                MusicSearchCatalogConfiguration musicSearchCatalogConfiguration = (MusicSearchCatalogConfiguration) obj;
                return new huh0(new bpn0(new s1m(musicSearchCatalogConfiguration, 29)), new bpn0(new gd40(musicSearchCatalogConfiguration, 2)), new bpn0(new kr6(16)), new bpn0(new rf20(musicSearchCatalogConfiguration, r3)), new com.vk.music.track.a(), musicSearchCatalogConfiguration.v0());
            case 18:
                cjx cjxVar = ((pr50) obj).E;
                return new pr50.e(cjxVar != null ? cjxVar : null);
            case 19:
                nx50 nx50Var = (nx50) obj;
                BottomNavigationView bottomNavigationView = nx50Var.z;
                if (bottomNavigationView != null) {
                    for (j58 j58Var : bottomNavigationView.c.g) {
                        j58Var.j.setVisibility(8);
                    }
                }
                nx50Var.L0 = null;
                return s3q0.a;
            case 20:
                ((o660) obj).b.invoke(zxd0.e.a);
                return s3q0.a;
            case 21:
                int i4 = NewsFeedControlsLayout.D;
                return (FrameLayout) ((NewsFeedControlsLayout) obj).findViewById(R.id.feed_carousel_products_container);
            case 22:
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) obj;
                return new uq60(newsfeedFragment, newsfeedFragment.Z, newsfeedFragment.fo().w, newsfeedFragment.fo().t);
            case 23:
                return (AudienceResearchComponent) ((mo60) obj).c().a(fpf0.a(AudienceResearchComponent.class));
            case 24:
                OfflineAudioBookChaptersFragment offlineAudioBookChaptersFragment = (OfflineAudioBookChaptersFragment) obj;
                OfflineAudioBookChaptersFragment.b bVar2 = OfflineAudioBookChaptersFragment.Q;
                Bundle requireArguments = offlineAudioBookChaptersFragment.requireArguments();
                bVar2.getClass();
                int i5 = requireArguments.getInt("audio_book_id");
                String string = offlineAudioBookChaptersFragment.requireArguments().getString("audio_book_title");
                if (string == null) {
                    string = "";
                }
                return new ct70(i5, string, new ts70(new ofy0((lq40) offlineAudioBookChaptersFragment.O.getValue(), 7), MusicPlaybackLaunchContext.Fb(offlineAudioBookChaptersFragment.requireArguments().getString("ref", "")).Cb(offlineAudioBookChaptersFragment.requireArguments().getString("launch_origin", "unknown"))));
            case 25:
                b2r b2rVar = ((a880) obj).h;
                if (b2rVar == null || (a = m33.a(R.drawable.on_media_comment_tail, b2rVar.b.getContext())) == null) {
                    return null;
                }
                return new baf0(a, l8g.f(0.7f, dhr0.t.c(R.attr.vk_ui_background_contrast_inverse)));
            case 26:
                return Integer.valueOf(((hh80) obj).c.size());
            case 27:
                Context context2 = ((com.vk.photos.root.photoflow.presentation.j) obj).b;
                HashSet hashSet = iah0.a;
                return Integer.valueOf((fnj.c(context2) || iah0.s(context2)) ? 3 : 6);
            case 28:
                return ((StoryViewerComponent) ((k7m) m7m.f((oba0) obj)).a(fpf0.a(StoryViewerComponent.class))).Me();
            default:
                PhotosRootFragment photosRootFragment = (PhotosRootFragment) obj;
                int i6 = PhotosRootFragment.X;
                return ((PhotosComponent) ((k7m) m7m.f(photosRootFragment)).a(fpf0.a(PhotosComponent.class))).F4().c((UserId) photosRootFragment.Q.getValue());
        }
    }
}
