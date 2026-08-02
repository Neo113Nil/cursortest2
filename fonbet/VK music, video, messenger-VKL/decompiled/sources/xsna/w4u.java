package xsna;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Base64;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.catalog2.feature.music.holders.MusicDownloadsInProgressVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.MutualFriendsTabFragment;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.ui.views.msg.MsgStatusViewV2;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.managed_groups.impl.list.ManagedGroupsListFragment;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.passkey.di.PasskeyComponentImpl;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.search.integration.friends.api.di.SearchFriendsIntegrationComponent;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import java.util.ArrayList;
import xsna.a8a;
import xsna.h0k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class w4u implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w4u(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$47;
        Object obj;
        Object parcelable;
        int i = this.b;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i2 = 25;
        boolean z = false;
        int i3 = 1;
        bh90 bh90Var = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((y4u) obj2).f.v();
            case 1:
                return ((SearchParamsComponent) ((k7m) m7m.f((vqu) obj2)).a(fpf0.a(SearchParamsComponent.class))).oa();
            case 2:
                invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47((HandleInvocationsFromAdViewer) obj2);
                return invoke$lambda$47;
            case 3:
                HorizontalPagerView.b bVar = (HorizontalPagerView.b) obj2;
                mc90 mc90Var = bVar.c;
                int k = mc90Var.k();
                float l = mc90Var.l();
                int i4 = bVar.d;
                if (i4 == k) {
                    f = swe0.f(1.0f - Math.abs(l), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                } else if (i4 == k - 1 || i4 == k + 1) {
                    f = swe0.f(Math.abs(l), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                }
                return new a8a.a(f, 0L, 0L, Integer.valueOf(i4), null, new h9x(0L), mc90Var.k.a());
            case 4:
                f0w f0wVar = (f0w) obj2;
                Trace.beginSection(ndp0.f("lazy ImDatabase.sqliteDb"));
                try {
                    return f0wVar.t((rwk) f0wVar.m.getValue());
                } finally {
                    Trace.endSection();
                }
            case 5:
                return ((VideoMinimizablePlayerComponent) m7m.a(((ibx) obj2).s).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3();
            case 6:
                return Integer.valueOf(((xvy) obj2).j().d());
            case 7:
                ((df00) obj2).b(h0k0.c.a);
                return s3q0.a;
            case 8:
                int i5 = ManagedGroupsListFragment.X;
                return ((ImExperimentsComponent) m7m.d((ManagedGroupsListFragment) obj2).a(fpf0.a(ImExperimentsComponent.class))).getExperiments();
            case 9:
                MarketEditAlbumGoodVariantsFragment marketEditAlbumGoodVariantsFragment = (MarketEditAlbumGoodVariantsFragment) obj2;
                int i6 = MarketEditAlbumGoodVariantsFragment.M0;
                Intent intent = new Intent();
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = marketEditAlbumGoodVariantsFragment.K0;
                intent.putExtra("album", goodAlbumEditFlowEntity != null ? goodAlbumEditFlowEntity : null);
                s3q0 s3q0Var = s3q0.a;
                marketEditAlbumGoodVariantsFragment.Mf(-1, intent);
                return s3q0.a;
            case 10:
                vb20 vb20Var = (vb20) obj2;
                vb20Var.s = true;
                vb20Var.a.d1();
                return s3q0.a;
            case 11:
                ((q0c) obj2).e();
                return s3q0.a;
            case 12:
                int i7 = fv20.C1;
                return ((MultiAccountComponent) ((k7m) m7m.f((fv20) obj2)).a(fpf0.a(MultiAccountComponent.class))).a();
            case 13:
                ym30 ym30Var = ((vm30) obj2).t0;
                if (ym30Var != null) {
                    ym30Var.o0();
                }
                return s3q0.a;
            case 14:
                return new MsgStatusViewV2(((u040) obj2).a, null, 0, 14, 0);
            case 15:
                ArrayList arrayList = ((n540) obj2).e;
                if (!arrayList.isEmpty()) {
                    ?? r3 = arrayList.get(0);
                    float c = ((bh90) r3).a.i.c();
                    int h = e43.h(arrayList);
                    boolean z2 = r3;
                    if (1 <= h) {
                        while (true) {
                            Object obj3 = arrayList.get(i3);
                            float c2 = ((bh90) obj3).a.i.c();
                            r3 = z2;
                            if (Float.compare(c, c2) < 0) {
                                r3 = obj3;
                                c = c2;
                            }
                            if (i3 != h) {
                                i3++;
                                z2 = r3;
                            }
                        }
                    }
                    bh90Var = r3;
                }
                bh90 bh90Var2 = bh90Var;
                if (bh90Var2 != null) {
                    f = bh90Var2.a.i.c();
                }
                return Float.valueOf(f);
            case 16:
                MusicDownloadsInProgressVh musicDownloadsInProgressVh = (MusicDownloadsInProgressVh) obj2;
                return new mi40(musicDownloadsInProgressVh.b, musicDownloadsInProgressVh.c);
            case 17:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj2;
                vtk0.d().d(musicMyAudiosCatalogRootVh.R(), new zo40(musicMyAudiosCatalogRootVh));
                return s3q0.a;
            case 18:
                hx40 hx40Var = (hx40) obj2;
                return new pm80(hx40Var.b, hx40Var.d, hx40Var.e, hx40Var.l, new pvh(hx40Var, i2));
            case 19:
                int i8 = MusicSubscriptionControlFragment.a0;
                return ((PurchasesManagerComponent) m7m.d((MusicSubscriptionControlFragment) obj2).a(fpf0.a(PurchasesManagerComponent.class))).J7();
            case 20:
                int i9 = yc50.x1;
                return (AudioManager) ((yc50) obj2).requireContext().getSystemService("audio");
            case 21:
                MutualFriendsTabFragment mutualFriendsTabFragment = (MutualFriendsTabFragment) obj2;
                int i10 = MutualFriendsTabFragment.b0;
                Bundle arguments = mutualFriendsTabFragment.getArguments();
                if (!(arguments != null ? arguments.getBoolean("can_access_profile", true) : true)) {
                    return null;
                }
                ((SearchFriendsIntegrationComponent) m7m.d(mutualFriendsTabFragment).mo408a(fpf0.a(SearchFriendsIntegrationComponent.class))).getClass();
                return new vth0(mutualFriendsTabFragment.R, mutualFriendsTabFragment);
            case 22:
                MviMembersListFragment.a aVar = MviMembersListFragment.T;
                Bundle requireArguments = ((MviMembersListFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("gid", UserId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("gid");
                    obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                }
                if (obj != null) {
                    return (UserId) obj;
                }
                throw new IllegalStateException("Required value was null.");
            case 23:
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return new te60(new cvs((NewsfeedCustomFragment2) obj2, i2));
            case 24:
                return ((jn60) obj2).c.getValue();
            case 25:
                String str = ((OnboardingStep) obj2).h;
                if (str == null) {
                    return null;
                }
                byte[] decode = Base64.decode(drm0.g0(str, "base64,", str), 0);
                return BitmapFactory.decodeByteArray(decode, 0, decode.length);
            case 26:
                ((c290) obj2).g = null;
                return s3q0.a;
            case 27:
                return new am90(((PasskeyComponentImpl) obj2).a);
            case 28:
                int i11 = PhotoFlowFragment.m0;
                return ((NewsFeedBridgeComponent) m7m.d((PhotoFlowFragment) obj2).a(fpf0.a(NewsFeedBridgeComponent.class))).Ad();
            default:
                fea0 fea0Var = (fea0) obj2;
                ProductsPhotoOverlayView productsPhotoOverlayView = fea0Var.g;
                b9u0 b9u0Var = fea0Var.h;
                RectF a = b9u0Var != null ? b9u0Var.a.a() : null;
                b9u0 b9u0Var2 = fea0Var.h;
                Float b = b9u0Var2 != null ? b9u0Var2.b() : null;
                if (a != null) {
                    productsPhotoOverlayView.setTranslationX(a.centerX() - (productsPhotoOverlayView.getWidth() / 2));
                }
                if (b != null && b.floatValue() <= 1.1d) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
