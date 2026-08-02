package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.telemetry.VideoOpenTelemetryComponent;
import com.vk.core.view.components.button.VkButton;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.libvideo.api.di.VideoAutologinComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.mediapicker.api.di.MediaPickerComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stickers.views.gift.GiftView;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import one.video.player.OneVideoPlayer;
import xsna.am9;
import xsna.c8p;
import xsna.yns;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nwk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nwk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = (String) obj;
                NativeLibLoader.a.getClass();
                Set f = NativeLibLoader.f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()) + str);
                }
                return j5g.S0(arrayList);
            case 1:
                return (hfm) ((kfm) obj).b.c.getValue();
            case 2:
                return ((otm) obj).b.a(OpenChatListReporter.Span.DIALOGS_ADAPTER_RENDER);
            case 3:
                return ((NewsFeedComponent) ((k7m) m7m.c(((hqj0) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 4:
                ((f0p) obj).J0();
                return null;
            case 5:
                c8p.b bVar = c8p.n1;
                ((c8p) obj).getFeature().C(a.e.b);
                return s3q0.a;
            case 6:
                int i3 = ExploreFragment.h0;
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f((ExploreFragment) obj)).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 7:
                m3r m3rVar = (m3r) obj;
                m3rVar.E = 1.0f;
                m3rVar.H = m3rVar.v;
                m3rVar.G = m3rVar.t;
                m3rVar.requestLayout();
                m3rVar.invalidate();
                return s3q0.a;
            case 8:
                ((FriendsCleanupFragment) obj).U.a(yns.b.a);
                return s3q0.a;
            case 9:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj;
                int i4 = GalleryFragmentImpl.R0;
                nf9 nf9Var = nf9.b;
                am9.a aVar = new am9.a();
                aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_VIDEO_PICKER);
                nf9.b(nf9Var, StoryPublishEvent.OPEN_SETTINGS, aVar, null, null, false, null, 108).e();
                ((krl0) galleryFragmentImpl.N.getValue()).a(galleryFragmentImpl.requireContext(), MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER);
                return s3q0.a;
            case 10:
                GiftView giftView = (GiftView) obj;
                giftView.q.setVisibility(4);
                giftView.g();
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                ((GoodFragment) obj).Po().j = true;
                return s3q0.a;
            case 12:
                return (VideoOpenTelemetryComponent) ((gxw) obj).c().a(fpf0.a(VideoOpenTelemetryComponent.class));
            case 13:
                return ((OneVideoPlayer) obj).x();
            case 14:
                return (TextView) ((oly) obj).a.findViewById(R.id.nativeads_age_restrictions);
            case 15:
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 16:
                ((MarketEditAlbumGoodsFragment) obj).S0 = false;
                return s3q0.a;
            case 17:
                return la10.w0((la10) obj);
            case 18:
                try {
                    return ((MediaPickerComponent) ((k7m) m7m.f((su10) obj)).mo408a(fpf0.a(MediaPickerComponent.class))).Xc();
                } catch (Throwable unused) {
                    return null;
                }
            case 19:
                return ((BridgeComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) obj)).a(fpf0.a(BridgeComponent.class))).cb();
            case 20:
                return new jpu((MusicHidingToolbarVh) obj, i2);
            case 21:
                ((rw40) obj).y.b1(new PlaybackActionMeta(20, 0L, 2, null));
                return s3q0.a;
            case 22:
                return (VkButton) ((g850) obj).a.findViewById(R.id.nativeads_call_to_action);
            case 23:
                return ((MusicSubscriptionComponent) m7m.a((AppCompatActivity) obj).a(fpf0.a(MusicSubscriptionComponent.class))).q1();
            case 24:
                return ((VideoAutologinComponent) j6i.b((h7m) ((yx50) obj).C.getValue(), VideoAutologinComponent.class)).S6();
            case 25:
                com.vk.superapp.widget_settings.p004new.a aVar2 = (com.vk.superapp.widget_settings.p004new.a) obj;
                int i5 = com.vk.superapp.widget_settings.p004new.a.n1;
                if (!jjc.d().a()) {
                    int i6 = com.vk.superapp.widget_settings.p004new.a.n1;
                    aVar2.tn();
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 26:
                int i7 = ge60.l1;
                return ((BridgeComponent) m7m.d((ge60) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 27:
                return (NewsfeedOptionalAdsComponent) ((mo60) obj).c().mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class));
            case 28:
                NewsfeedMappersComponentImpl newsfeedMappersComponentImpl = (NewsfeedMappersComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = NewsfeedMappersComponentImpl.o;
                return new n9x0(newsfeedMappersComponentImpl.a9(), newsfeedMappersComponentImpl.xc());
            default:
                return (NotificationManager) ((Context) ((lj70) obj).a).getSystemService("notification");
        }
    }
}
