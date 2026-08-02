package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.ConnectivityManager;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.api.di.AdsComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.SearchPlaylistViewHolder;
import com.vk.clips.clipchecker.api.di.ClipCheckerComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.documents.impl.SearchDocumentsListFragment.b;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photoviewer.ClippingImageView;
import com.vk.photoviewer.PhotoViewer;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stories.StoryPrivacySettingsActivity;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.story.viewer.stat.di.StoryStatisticsComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import java.io.File;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.ivh0;
import xsna.rfa0.j;
import xsna.wl80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z260 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z260(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        File file;
        switch (this.b) {
            case 0:
                return (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            case 1:
                return ((AdsComponent) ((k7m) m7m.f((fa60) this.c)).mo408a(fpf0.a(AdsComponent.class))).j6();
            case 2:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return newsfeedCustomFragment2;
            case 3:
                return new rl60(new k7z((mo60) this.c, 10));
            case 4:
                NotificationListFragment notificationListFragment = (NotificationListFragment) this.c;
                return new ia70((qss) notificationListFragment.T.getValue(), (sz00) notificationListFragment.U.getValue(), (mh70) notificationListFragment.V.getValue(), (ui70) notificationListFragment.W.getValue(), ((ClipCheckerComponent) notificationListFragment.X.getValue()).B9());
            case 5:
                id70 id70Var = (id70) this.c;
                int i = id70.q1;
                return ((BridgeComponent) m7m.d(id70Var).a(fpf0.a(BridgeComponent.class))).s();
            case 6:
                wl80.a aVar = (wl80.a) this.c;
                return "internalShouldIgnoreCallback() - different player= " + wl80.this.M + " this= " + aVar;
            case 7:
                return ((u2a0) this.c).s;
            case 8:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i2 = PhotoFlowFragment.m0;
                return photoFlowFragment.fo().p7().a();
            case 9:
                return new chk(((y9a0) this.c).m);
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                photoViewer.N = photoViewer.q(1.0f);
                ClippingImageView clippingImageView = photoViewer.q.l.get(photoViewer.r);
                if (clippingImageView == null) {
                    return s3q0.a;
                }
                mrx0 mrx0Var = photoViewer.N;
                if (mrx0Var == null) {
                    mrx0Var = null;
                }
                x6e0 a = com.vk.photoviewer.a.a(mrx0Var, photoViewer.K, photoViewer.e);
                mrx0 mrx0Var2 = photoViewer.N;
                if (mrx0Var2 == null) {
                    mrx0Var2 = null;
                }
                Rect rect = mrx0Var2.a;
                int width = rect != null ? rect.width() : a.q;
                mrx0 mrx0Var3 = photoViewer.N;
                if (mrx0Var3 == null) {
                    mrx0Var3 = null;
                }
                Rect rect2 = mrx0Var3.a;
                twt0.g(width, rect2 != null ? rect2.height() : a.r, clippingImageView);
                mrx0 mrx0Var4 = photoViewer.N;
                if ((mrx0Var4 != null ? mrx0Var4 : null).a == null) {
                    photoViewer.o(false);
                    return s3q0.a;
                }
                Iterator it = photoViewer.J.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                clippingImageView.setClipX(0);
                clippingImageView.setClipBottom(0);
                clippingImageView.setClipTop(0);
                clippingImageView.setCorners(new float[8]);
                photoViewer.O = Math.min(a.m, 1.0f);
                photoViewer.e(clippingImageView);
                photoViewer.g = true;
                awt0.t(clippingImageView, new tm1(photoViewer, a, clippingImageView, 6));
                return s3q0.a;
            case 11:
                return ((rfa0) this.c).new j();
            case 12:
                return ((PlayerUIComponent) ((vza0) this.c).b.a(fpf0.a(PlayerUIComponent.class))).ub();
            case 13:
                PodcastFragment podcastFragment = (PodcastFragment) this.c;
                int i3 = PodcastFragment.m0;
                return Boolean.valueOf(podcastFragment.jo());
            case 14:
                msb0 msb0Var = (msb0) this.c;
                int i4 = msb0.n1;
                return ((NewsFeedComponent) ((k7m) m7m.f(msb0Var)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 15:
                w3c0 w3c0Var = (w3c0) this.c;
                return new q3c0(w3c0Var.M, (r3c0) w3c0Var.L.getValue(), w3c0Var.H, w3c0Var.F);
            case 16:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i5 = PostingFragment.L0;
                return ((Posting2Component) ((k7m) m7m.f(postingFragment)).mo408a(fpf0.a(Posting2Component.class))).w8();
            case 17:
                return ((NewsFeedComponent) ((k7m) m7m.f((rhc0) this.c)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 18:
                return ((CartComponent) ((zqd0) this.c).e.getValue()).S3();
            case 19:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) this.c;
                return up2.e(productsSelectionBottomSheet, productsSelectionBottomSheet.l1 ? s200.p(productsSelectionBottomSheet.requireContext()) : productsSelectionBottomSheet.requireContext(), productsSelectionBottomSheet, productsSelectionBottomSheet.l1);
            case 20:
                return (vof0) this.c;
            case 21:
                dzf0 dzf0Var = (dzf0) this.c;
                while (dzf0Var.f > 0) {
                    d2t d2tVar = dzf0Var.g;
                    d2tVar.getClass();
                    try {
                        SurfaceTexture surfaceTexture = d2tVar.b;
                        if (surfaceTexture != null) {
                            surfaceTexture.updateTexImage();
                        }
                        if (d2tVar.b != null) {
                            dzf0Var.e = true;
                        }
                    } catch (RuntimeException e) {
                        j100 j100Var = zjq.g;
                        if (j100Var != null) {
                            j100Var.logError(e);
                        }
                    }
                    dzf0Var.f--;
                }
                return s3q0.a;
            case 22:
                SearchDocumentsListFragment searchDocumentsListFragment = (SearchDocumentsListFragment) this.c;
                int i6 = SearchDocumentsListFragment.h0;
                return searchDocumentsListFragment.new b();
            case 23:
                return new ivh0.a(((ivh0) this.c).b, 2);
            case 24:
                l7m l7mVar = ((SearchPlaylistViewHolder) this.c).g;
                return ((AuthBridgeComponent) (l7mVar != null ? l7mVar : null).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 25:
                com.vk.pushes.notifications.base.a aVar2 = (com.vk.pushes.notifications.base.a) this.c;
                boolean A = aVar2.A();
                CharSequence charSequence = aVar2.p;
                Bitmap bitmap = aVar2.e;
                if (A) {
                    return aVar2.n();
                }
                if (gz80.a(28) && (file = aVar2.f) != null && file.exists()) {
                    String str = o25.a().o().b;
                    j1a0 j1a0Var = new j1a0();
                    j1a0Var.a = str;
                    j1a0Var.b = null;
                    j1a0Var.c = null;
                    j1a0Var.d = null;
                    j1a0Var.e = false;
                    j1a0Var.f = false;
                    return new NotificationCompat.l(j1a0Var);
                }
                if (bitmap != null) {
                    NotificationCompat.e eVar = new NotificationCompat.e();
                    Bitmap bitmap2 = aVar2.d;
                    eVar.f = bitmap2 != null ? IconCompat.c(bitmap2) : null;
                    eVar.g = true;
                    eVar.e = IconCompat.c(bitmap);
                    return eVar;
                }
                if ((charSequence != null ? charSequence.length() : 0) <= 30) {
                    return null;
                }
                NotificationCompat.f fVar = new NotificationCompat.f();
                fVar.b = NotificationCompat.h.d(aVar2.n);
                fVar.e = NotificationCompat.h.d(charSequence);
                return fVar;
            case 26:
                g4m0 g4m0Var = (g4m0) this.c;
                int i7 = (int) g4m0Var.p;
                int i8 = (int) g4m0Var.q;
                Bitmap createBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                g4m0Var.k.v(0).a(i7, i8, createBitmap);
                return createBitmap;
            case 27:
                StoryPrivacySettingsActivity.StoryPrivacySettingsFragment storyPrivacySettingsFragment = (StoryPrivacySettingsActivity.StoryPrivacySettingsFragment) this.c;
                int i9 = StoryPrivacySettingsActivity.StoryPrivacySettingsFragment.X0;
                storyPrivacySettingsFragment.go();
                return s3q0.a;
            case 28:
                StoryStatisticsStickersFragment storyStatisticsStickersFragment = (StoryStatisticsStickersFragment) this.c;
                int i10 = StoryStatisticsStickersFragment.X;
                return ((StoryStatisticsComponent) m7m.d(storyStatisticsStickersFragment).a(fpf0.a(StoryStatisticsComponent.class))).h7();
            default:
                szm0 szm0Var = (szm0) this.c;
                szm0Var.getClass();
                UiTracker uiTracker = UiTracker.a;
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventType.SUBSCRIBE, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BANNER, MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferClick.EventSource.ANYWHERE, MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY), 2)).q();
                b25 b25Var = szm0Var.d;
                boolean b = b25Var.b();
                if (b) {
                    szm0Var.a.J.b(VideoMinimizableDiscoverySideEffect.f.a);
                } else {
                    if (b) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ComposeView composeView = szm0Var.f;
                    if (composeView != null && g2u0.c(composeView) != null) {
                        b25Var.getClass();
                    }
                }
                return s3q0.a;
        }
    }
}
