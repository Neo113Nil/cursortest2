package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import com.vk.ads.api.di.AdsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.ui.holder.PodcastCategoryCatalogRootVh;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.fullscreen.promo.core.FullscreenPromoComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.offline.settings.api.di.VideoOfflineSettingsComponent;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.fragment.OfflinePodcastEpisodesFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.onepasspromo.impl.OnePassPromoFragment;
import com.vk.photos.root.photoflow.tags.presentation.PhotoTagsFragment;
import com.vk.qrcode.QRStatsTracker;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.MediaPipelineComponentVkApp;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import xsna.b9a0;
import xsna.cca0;
import xsna.l310;
import xsna.tja0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k7y implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k7y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        PostingUserMessage postingUserMessage;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((l7y) obj).l;
            case 1:
                return new swy((izs) ((wh50) obj).getValue());
            case 2:
                j4m j4mVar = (j4m) obj;
                if (j4mVar != null) {
                    j4mVar.v();
                }
                return s3q0.a;
            case 3:
                ?? r0 = ((gq00) obj).a;
                return new gz0(((cq00) r0.getValue()).c, ((cq00) r0.getValue()).d, null, ((cq00) r0.getValue()).e, null, null);
            case 4:
                int i2 = MarketAllReviewsFragment.d0;
                return ((MarketComponent) m7m.d((MarketAllReviewsFragment) obj).a(fpf0.a(MarketComponent.class))).Ob();
            case 5:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj;
                mfy mfyVar = marketItemReviewsFragment.Q;
                WriteBar writeBar = marketItemReviewsFragment.Z;
                EditText input = writeBar != null ? writeBar.getInput() : null;
                mfyVar.getClass();
                int i3 = MarketItemReviewsFragment.w0;
                xn50.a.c(marketItemReviewsFragment, l310.q.b.b);
                s3q0 s3q0Var = s3q0.a;
                if (mfyVar.a && input != null) {
                    input.post(new sc4(input, 8));
                }
                return s3q0.a;
            case 6:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) obj;
                eVar.a(new l9b(eVar, 1), new m9b(eVar, 4), eVar.j);
                return s3q0.a;
            case 7:
                int i4 = MasksWrap.e0;
                return new cwp0(new pi10((MasksWrap) obj, 0));
            case 8:
                return ((gr10) obj).c("pcm-encoding");
            case 9:
                qcy<Object>[] qcyVarArr = MediaPipelineComponentVkApp.d;
                return ((ClipsConfigAuthorsComponent) obj).getExperiments();
            case 10:
                return ((VideoMinimizablePlayerComponent) ((k7m) m7m.c((k120) obj)).a(fpf0.a(VideoMinimizablePlayerComponent.class))).P7();
            case 11:
                ((ViewGroup) obj).setTranslationY(r4.getHeight());
                return s3q0.a;
            case 12:
                Context context = ((vo30) obj).e;
                return Integer.valueOf(e3m.a(R.dimen.msg_bubble_max_width, context != null ? context : null));
            case 13:
                a1w a1wVar = ((rw30) obj).i;
                a1wVar.getClass();
                return a1wVar.r().h;
            case 14:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                return Boolean.valueOf(com.vk.toggle.d.a(((g950) ((xp40) obj).H.getValue()).c()));
            case 15:
                ru40 ru40Var = ((rt40) obj).k1;
                if (ru40Var != null) {
                    ru40Var.b();
                }
                return s3q0.a;
            case 16:
                return new m8x0(((ty40) obj).b, "MusicPlayerStateController");
            case 17:
                int i5 = ck50.k1;
                return j5g.S0(Collections.singletonList(((ck50) obj).Yn()));
            case 18:
                xe60 xe60Var = (xe60) obj;
                mo60 mo60Var = xe60Var.a;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) xe60Var.c.getValue()).cc());
            case 19:
                OfflinePodcastEpisodesFragment.b bVar = OfflinePodcastEpisodesFragment.Q;
                return ((BridgeComponent) m7m.d((OfflinePodcastEpisodesFragment) obj).a(fpf0.a(BridgeComponent.class))).Le();
            case 20:
                int i6 = OnePassPromoFragment.R;
                return ((FullscreenPromoComponent) m7m.d((OnePassPromoFragment) obj).a(fpf0.a(FullscreenPromoComponent.class))).n();
            case 21:
                ((com.vk.photos.root.photoflow.presentation.b) obj).h.b(b9a0.g.a);
                return s3q0.a;
            case 22:
                int i7 = PhotoTagsFragment.U;
                ((PhotoTagsFragment) obj).getFeature().C(cca0.c.b);
                return s3q0.a;
            case 23:
                gzs<s3q0> gzsVar = ((tja0.e) obj).h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 24:
                ((PodcastCategoryCatalogRootVh) obj).p.d();
                return s3q0.a;
            case 25:
                return (SharingComponent) ((k7m) m7m.f((gqb0) obj)).a(fpf0.a(SharingComponent.class));
            case 26:
                h0c0 h0c0Var = (h0c0) obj;
                hb40 hb40Var = h0c0Var.b;
                ActionsAvailabilityState.Availability availability = h0c0Var.d.a.O.h;
                PostingAction.Editing.SetPhotoVideoDisplayMode setPhotoVideoDisplayMode = new PostingAction.Editing.SetPhotoVideoDisplayMode(hg10.l(h0c0Var.f) ? PhotoVideoDisplayMode.Carousel : PhotoVideoDisplayMode.Grid, true);
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    hb40Var.invoke(setPhotoVideoDisplayMode);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    hb40Var.invoke(new PostingAction.ShowMessage(postingUserMessage, setPhotoVideoDisplayMode, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 27:
                return ((AdsComponent) ((k7m) m7m.f((y1c0) obj)).mo408a(fpf0.a(AdsComponent.class))).ea();
            case 28:
                ((uh3) obj).invoke();
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_LINK);
                return s3q0.a;
            default:
                int i8 = com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a.p1;
                return ((VideoOfflineSettingsComponent) m7m.d((com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a) obj).a(fpf0.a(VideoOfflineSettingsComponent.class))).ce();
        }
    }
}
