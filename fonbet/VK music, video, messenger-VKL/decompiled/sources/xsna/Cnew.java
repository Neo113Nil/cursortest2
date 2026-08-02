package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.widget.ImageView;
import com.vk.ads.api.di.AdsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabsVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.coowners.di.NewsfeedCoownersComponent;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.newsfeed.common.views.clips.NewsFeedControlsLayout;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.newsfeed.impl.postmodal.reactions.di.ModalPostReactionsComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vkontakte.android.R;
import xsna.h7u0;
import xsna.l310;
import xsna.nbx.g;
import xsna.pr50;
import xsna.v5a0;
import xsna.xn50;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: xsna.new, reason: invalid class name */
/* loaded from: classes7.dex */
public final /* synthetic */ class Cnew implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Cnew(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        int i = this.b;
        boolean z = false;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((oew) obj).c = false;
                return s3q0.a;
            case 1:
                return ((nbx) obj).new g();
            case 2:
                return (FrescoImageView) ((qex) obj).itemView.findViewById(R.id.video_preview);
            case 3:
                return com.vk.clips.sdk.shared.item.market_ads.b.r((com.vk.clips.sdk.shared.item.market_ads.b) obj);
            case 4:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj;
                int i3 = MarketItemReviewsFragment.w0;
                l310.s sVar = l310.s.b;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, sVar);
                return s3q0.a;
            case 5:
                return (qq20) obj;
            case 6:
                int i4 = ModalPostReactionsFragment.f0;
                return ((ModalPostReactionsComponent) ((k7m) m7m.f((ModalPostReactionsFragment) obj)).mo408a(fpf0.a(ModalPostReactionsComponent.class))).wd();
            case 7:
                return x330.b((x330) obj);
            case 8:
                hk30 hk30Var = (hk30) obj;
                return Integer.valueOf(an10.b(((TextPaint) hk30Var.i.getValue()).measureText(hk30Var.b.a.getString(R.string.vkim_msg_empty))));
            case 9:
                return ((g440) obj).getRequireContext();
            case 10:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj;
                w950 w950Var = (w950) musicCatalogRootVh.q.getValue();
                if (w950Var != null) {
                    String str2 = musicCatalogRootVh.t;
                    if (str2 == null) {
                        str2 = "";
                    }
                    w950Var.I(str2, false);
                }
                return s3q0.a;
            case 11:
                vg40 vg40Var = (vg40) obj;
                VkBanner vkBanner = vg40Var.o;
                Playlist playlist = vg40Var.q;
                DownloadingState downloadingState = playlist != null ? playlist.H : null;
                if (downloadingState != null && vg40.a6(downloadingState)) {
                    kco kcoVar = vg40Var.n;
                    Context context = vkBanner.getContext();
                    Playlist playlist2 = vg40Var.q;
                    if (playlist2 != null) {
                        kcoVar.a(context, playlist2, new p5y(vg40Var, 13));
                    }
                } else if (downloadingState instanceof DownloadingState.PartlyDownloaded) {
                    Playlist playlist3 = vg40Var.q;
                    if (playlist3 != null) {
                        vg40Var.l.T(vkBanner.getContext(), playlist3);
                    }
                } else {
                    h7u0.a aVar = new h7u0.a(vkBanner.getContext(), R.style.OfflineRemoveAlert, null, 4);
                    aVar.g0(R.string.music_offline_download_remove_from_queue);
                    aVar.c0(R.string.delete, new e30(vg40Var, 2));
                    aVar.W(R.string.cancel, new f30(2));
                    aVar.m();
                }
                return s3q0.a;
            case 12:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj;
                return new VkTabsVh(musicMyAudiosCatalogRootVh.O, new yii(i2), musicMyAudiosCatalogRootVh.m.b.r, null, 248);
            case 13:
                MusicSearchCatalogRootVh musicSearchCatalogRootVh = (MusicSearchCatalogRootVh) obj;
                if (com.vk.toggle.d.K() && ((str = musicSearchCatalogRootVh.x.e) == null || str.length() == 0)) {
                    musicSearchCatalogRootVh.p.a(false, true);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                ((yj50) obj).getFeature();
                return s3q0.a;
            case 15:
                pr50 pr50Var = (pr50) obj;
                cjx cjxVar = pr50Var.E;
                return new pr50.f(cjxVar != null ? cjxVar : null, pr50Var.c0, pr50Var.R);
            case 16:
                ((o660) obj).b.invoke(zxd0.d.a);
                return s3q0.a;
            case 17:
                int i5 = NewsFeedControlsLayout.D;
                return (ImageView) ((NewsFeedControlsLayout) obj).findViewById(R.id.feed_carousel_product_market_control);
            case 18:
                return (NewsfeedCoownersComponent) ((mo60) obj).c().a(fpf0.a(NewsfeedCoownersComponent.class));
            case 19:
                return (qz60) obj;
            case 20:
                return new uu80((f0p0) ((qd80) obj).c);
            case 21:
                ((lv90) obj).mo();
                return s3q0.a;
            case 22:
                return new v5a0.a((v5a0) obj);
            case 23:
                return ((StoriesSettingsComponent) ((k7m) m7m.f((oba0) obj)).a(fpf0.a(StoriesSettingsComponent.class))).B7();
            case 24:
                int i6 = PhotosRootFragment.X;
                return ((BridgeComponent) ((k7m) m7m.f((PhotosRootFragment) obj)).a(fpf0.a(BridgeComponent.class))).t().b();
            case 25:
                int i7 = PickerRootFragment.W;
                return ((PhotosComponent) ((k7m) m7m.f((PickerRootFragment) obj)).a(fpf0.a(PhotosComponent.class))).r4();
            case 26:
                return new bna0((sdz) ((tma0) obj).k1.getValue());
            case 27:
                int i8 = PollEditorFragment.X;
                nub0.a().h((PollEditorFragment) obj);
                return s3q0.a;
            case 28:
                ((AdsComponent) ((k7m) m7m.f((y1c0) obj)).mo408a(fpf0.a(AdsComponent.class))).getClass();
                return yv0.a;
            default:
                return (Activity) ((y8c0) obj).i.get();
        }
    }
}
