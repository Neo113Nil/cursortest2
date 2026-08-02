package xsna;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.fragment.app.Fragment;
import androidx.media.MediaBrowserServiceCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.video.dto.VideoContentDto;
import com.vk.api.generated.video.dto.VideoGetSimilarResponseDto;
import com.vk.api.generated.video.dto.VideoItemsInSimilarDto;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.video.Doc2DocItem;
import com.vk.im.ui.components.contact.vc.UserProfileView;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.mediapicker.photovk.albums_list.VkAlbumsFragment;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.motion.scene.transition.DiscoveryScreenTransitions$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.transition.DiscoveryScreenTransitions$Portrait;
import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.cqw0;
import xsna.ddt0;
import xsna.fxw0;
import xsna.giw0;
import xsna.ikv0;
import xsna.it80;
import xsna.pyq0;
import xsna.suq;
import xsna.tj50;
import xsna.tww0;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fvq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fvq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0518, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Parcelable video;
        Parcelable parcelable;
        UserId userId;
        String str;
        s3q0 _init_$lambda$9;
        int i = this.b;
        int i2 = 3;
        boolean z = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        r6 = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        int i3 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i4 = UserProfileView.N;
                ((UserProfileView) obj2).getClass();
                return s3q0.a;
            case 1:
                tj50.a aVar = (tj50.a) obj;
                myq0 myq0Var = myq0.b;
                ao8 ao8Var = ao8.d;
                return new pyq0.a(aVar.a(myq0Var, ao8Var), aVar.a(nyq0.b, ao8Var), aVar.a(new tml0(4), ao8Var), aVar.a(oyq0.b, ao8Var), aVar.a(new oi40(26), ao8Var), aVar.a(new ltl0(4), ao8Var), aVar.a(new jyq0(z ? 1 : 0), ao8Var), aVar.a(new kbq0(i3), ao8Var), aVar.a(new weq0(i3), ao8Var), aVar.a(new mcl0(9), ao8Var), aVar.a(new kyq0((lyq0) obj2, z ? 1 : 0), ao8Var), aVar.a(new fyo0(i2), ao8Var));
            case 2:
                kym0 kym0Var = (kym0) obj;
                rfz.b(((g2r0) obj2).a, new gkq0(kym0Var.b, kym0Var.c), null, new r0r0(kym0Var, i3), 2);
                return s3q0.a;
            case 3:
                ((MediaBrowserServiceCompat.g) obj2).f((List) obj);
                return s3q0.a;
            case 4:
                int i5 = VideoAuthorView.l;
                ((etv0) obj).b(false);
                ((VideoAuthorView) obj2).c.d.performClick();
                return s3q0.a;
            case 5:
                xbs0 xbs0Var = (xbs0) obj2;
                xbs0Var.t8((NewsComment) obj);
                xbs0Var.R7(true);
                return s3q0.a;
            case 6:
                VideoDiscoveryRecommendationsRepository videoDiscoveryRecommendationsRepository = (VideoDiscoveryRecommendationsRepository) obj2;
                VideoGetSimilarResponseDto videoGetSimilarResponseDto = (VideoGetSimilarResponseDto) obj;
                videoDiscoveryRecommendationsRepository.getClass();
                ddt0.a.getClass();
                List<VideoItemsInSimilarDto> f = videoGetSimilarResponseDto.f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                for (VideoItemsInSimilarDto videoItemsInSimilarDto : f) {
                    ums0 ums0Var = ums0.a;
                    VideoContentDto e = videoItemsInSimilarDto.e();
                    List e2 = ums0.e(ums0Var, e != null ? e.d() : null, videoGetSimilarResponseDto.j(), videoGetSimilarResponseDto.e(), false, 52);
                    int i6 = ddt0.a.$EnumSwitchMapping$0[videoItemsInSimilarDto.g().ordinal()];
                    if (i6 != 1) {
                        if (i6 == 2) {
                            parcelable = new Doc2DocItem.Carousel(e2, videoItemsInSimilarDto.f());
                        } else if (i6 != 3) {
                            video = new Doc2DocItem.Stub(null, 1, null);
                        } else {
                            parcelable = new Doc2DocItem.Floor(e2, videoItemsInSimilarDto.f());
                        }
                        video = parcelable;
                    } else {
                        video = new Doc2DocItem.Video(e2);
                    }
                    arrayList.add(video);
                }
                return videoDiscoveryRecommendationsRepository.a(new c3t(arrayList, videoGetSimilarResponseDto.getCount()), videoGetSimilarResponseDto.d(), videoGetSimilarResponseDto.i(), videoGetSimilarResponseDto.g());
            case 7:
                ((VideoItemListLargeVh) obj2).X = (View) obj;
                return s3q0.a;
            case 8:
                Optional optional = (Optional) obj;
                UserId B = dz5.B((VideoFile) optional.get(), ((VideoFile) optional.get()).I0());
                return ((com.vk.video.ui.discovery.minimizable.g) obj2).g.b(B).U(new i4f0(new eus0(B, z ? 1 : 0), 11));
            case 9:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj2;
                TouchActionInfo touchActionInfo = (TouchActionInfo) obj;
                nmp0 nmp0Var = touchActionInfo.a;
                boolean z3 = mVar.f;
                DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait = DiscoveryScreenTransitions$Portrait.DiscoveryToMiniplayer;
                if (nmp0Var == discoveryScreenTransitions$Portrait || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryVideoMatchRatioToMiniplayer || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryMatchVideoRatioToDiscovery || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryToDiscoveryPreparedToPip || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryVideoMatchRatioToPreparedToPip || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToMiniplayer || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToDiscoveryPreparedToPip || nmp0Var == DiscoveryScreenTransitions$Portrait.DialogFullscreenToMiniplayer || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryMatchVideoRatioToDiscoveryWithDialogUnderVideo || nmp0Var == DiscoveryScreenTransitions$Portrait.HiddenToDiscovery || nmp0Var == DiscoveryScreenTransitions$Portrait.HiddenToDiscoveryMatchVideoRatio || nmp0Var == DiscoveryScreenTransitions$Portrait.DialogFullscreenToHidden || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToHidden || nmp0Var == DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToDialogFullscreen) {
                    return nmp0Var == discoveryScreenTransitions$Portrait ? Boolean.valueOf(z) : Boolean.valueOf(z);
                }
                DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape = DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreen;
                if (nmp0Var != discoveryScreenTransitions$Landscape && nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryToHidden && nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryWithDialogToHidden && nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryToDiscoveryWithDialog && nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryToMiniplayer && nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryWithDialogToMiniplayer && nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryToPreparedToPip && nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryWithDialogToPreparedPip && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenToHidden && nmp0Var != DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreenWithDialog && nmp0Var != DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreenWithRightPromo && nmp0Var != DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreenWithBottomPromo && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithRightPromoToHidden && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithRightPromoToFullscreenWithDialog && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithRightPromoToDiscovery && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithRightPromoToDiscoveryWithDialog && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithBottomPromoToHidden && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithBottomPromoToFullscreenWithDialog && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenToFullscreenWithSimilar && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithBottomPromoToDiscovery && nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithBottomPromoToDiscoverWithDialog) {
                    TouchActionInfo.d dVar = touchActionInfo.h;
                    if (dVar instanceof TouchActionInfo.d.b) {
                        return Boolean.valueOf(((TouchActionInfo.d.b) dVar).a);
                    }
                    return null;
                }
                boolean z4 = mVar.e;
                if (nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryToMiniplayer ? nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryToHidden ? nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryWithDialogToHidden ? nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryWithDialogToMiniplayer ? nmp0Var != discoveryScreenTransitions$Landscape ? nmp0Var != DiscoveryScreenTransitions$Landscape.DiscoveryToDiscoveryWithDialog ? nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenToHidden ? nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithDialogToHidden ? nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithRightPromoToHidden ? nmp0Var != DiscoveryScreenTransitions$Landscape.FullscreenWithBottomPromoToHidden ? nmp0Var != DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreenWithDialog ? (nmp0Var == DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreenWithRightPromo || nmp0Var == DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreenWithBottomPromo) && !z4 && mVar.s && mVar.r && z3 && epx.f(mVar.p, b.a.a) : !z4 && mVar.s && mVar.r && z3 && !epx.f(mVar.p, b.a.a) : !mVar.s && mVar.r && epx.f(mVar.p, b.a.a) : !mVar.s && mVar.r && epx.f(mVar.p, b.a.a) : !mVar.s && mVar.r && !epx.f(mVar.p, b.a.a) : !mVar.s && mVar.r && epx.f(mVar.p, b.a.a) : z4 && mVar.r && !epx.f(mVar.p, b.a.a) : !z4 && mVar.s && mVar.r && z3 && epx.f(mVar.p, b.a.a) : z4 && mVar.r && mVar.s && z3 && !epx.f(mVar.p, b.a.a) : z4 && mVar.r && z3 && !mVar.s && !epx.f(mVar.p, b.a.a) : z4 && mVar.r && z3 && !mVar.s && epx.f(mVar.p, b.a.a) : z4 && mVar.r && mVar.s && z3 && epx.f(mVar.p, b.a.a)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 10:
                ((io.reactivex.rxjava3.core.r) obj2).onNext((List) obj);
                return s3q0.a;
            case 11:
                int intValue = ((Integer) obj).intValue();
                int i7 = VideoProfileCreatorOnboardingVideoCounterView.o;
                return Float.valueOf(((Number) ((if2) ((SnapshotStateList) obj2).get(intValue)).d()).floatValue());
            case 12:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                int i8 = VkAlbumsFragment.Y;
                Fragment parentFragment = ((VkAlbumsFragment) obj2).getParentFragment();
                PostingFragment postingFragment = parentFragment instanceof PostingFragment ? (PostingFragment) parentFragment : null;
                efc0 feature = postingFragment != null ? postingFragment.getFeature() : null;
                if (feature != null) {
                    feature.C(new PostingAction.Navigation.OpenInCurrentStep(new PostingStepScreen.VkPhotoAlbum(photoAlbum)));
                }
                return s3q0.a;
            case 13:
                v2v0 v2v0Var = (v2v0) ((a3v0) obj2).a;
                if (v2v0Var != null) {
                    v2v0Var.Ge();
                }
                return s3q0.a;
            case 14:
                q5j q5jVar = (q5j) obj;
                jcv.b(q5jVar.e, (y5j.a) obj2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                m6j m6jVar = q5jVar.d;
                s5j s5jVar = q5jVar.c;
                jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                return s3q0.a;
            case 15:
                ((kti) obj2).invoke((iku0) obj);
                return s3q0.a;
            case 16:
                ((uei0) obj2).n();
                return s3q0.a;
            case 17:
                tfw0 tfw0Var = (tfw0) obj2;
                Boolean bool = (Boolean) obj;
                UserId userId2 = tfw0Var.c.a;
                L.e("VoipCallAuthDataProviderImpl", "App user login did change from " + userId2 + " to " + bool);
                if (!tfw0Var.a() || tfw0Var.b.a().g().contains(userId2)) {
                    UserId l = tfw0Var.l();
                    if (bool.booleanValue() && fkq0.c(l)) {
                        L.e("VoipCallAuthDataProviderImpl", "Set new authorised (" + l + ") user as new call user");
                        tfw0Var.reset();
                    }
                    tfw0Var.h.b();
                } else {
                    L.e("VoipCallAuthDataProviderImpl", "Current call user is not anonymous and no longer authorized. Reset");
                    tfw0Var.reset();
                }
                return s3q0.a;
            case 18:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((zhw0) obj2).T(new giw0.b(th));
                return s3q0.a;
            case 19:
                ekw0 ekw0Var = (ekw0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ViewGroup viewGroup = ekw0Var.a;
                    ikv0 ikv0Var = ekw0Var.c;
                    if (ikv0Var != null) {
                        ikv0Var.a();
                    }
                    l7s u = bwt0.u(viewGroup.getContext());
                    ikv0.a aVar2 = new ikv0.a(u);
                    aVar2.u = new ikv0.d(u.getString(R.string.voip_answered_as_contact_notification_title), (String) null, (ikv0.d.a) null, 6);
                    aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, u.getString(R.string.voip_answered_as_contact_notification_btn), new r0r0(ekw0Var, 19));
                    aVar2.o = Integer.valueOf(ekw0.d);
                    aVar2.e = 10000L;
                    aVar2.f = viewGroup;
                    aVar2.b = true;
                    ekw0Var.c = aVar2.o(viewGroup);
                }
                return s3q0.a;
            case 20:
                return new cqw0.a((ViewGroup) obj, (k7x) obj2);
            case 21:
                fxw0.a aVar3 = (fxw0.a) obj;
                tww0.u uVar = (tww0.u) ((tww0) obj2);
                if (uVar instanceof tww0.u.a) {
                    return fxw0.a.a(aVar3, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33552383);
                }
                if (uVar instanceof tww0.u.b) {
                    return fxw0.a.a(aVar3, null, null, 0L, 0L, null, null, null, null, true, false, false, false, false, null, null, null, null, false, null, null, false, false, 33552383);
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                lcx0 lcx0Var = (lcx0) obj2;
                if (!((ybx0) obj).a) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                it80.a aVar4 = it80.b;
                FeatureId featureId = lcx0Var.a;
                suq suqVar = new suq(featureId, lcx0Var.a(featureId), new suq.c.a(R.string.voip_feature_onboarding_watch_together_title, R.string.voip_feature_onboarding_watch_together_subtitle, 56, Integer.valueOf(R.drawable.vk_icon_logo_vk_video_outline_28)));
                aVar4.getClass();
                return new it80(suqVar);
            case 23:
                l5g0 l5g0Var = (l5g0) obj2;
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                int i9 = ReportFragment.a0;
                ReportFragment.a a = ReportFragment.b.a();
                String str2 = l5g0Var.a;
                a.K(str2);
                int hashCode = str2.hashCode();
                if (hashCode == -1480249367) {
                    if (str2.equals("community")) {
                        UserId userId3 = l5g0Var.c;
                        if (userId3 != null) {
                            a.C(userId3);
                        }
                    }
                    userId = l5g0Var.f;
                    if (userId != null) {
                    }
                    str = l5g0Var.g;
                    if (str != null) {
                    }
                } else if (hashCode == 3107) {
                    if (str2.equals("ad")) {
                        String str3 = l5g0Var.d;
                        if (str3 != null) {
                            a.A(str3);
                        }
                    }
                    userId = l5g0Var.f;
                    if (userId != null) {
                    }
                    str = l5g0Var.g;
                    if (str != null) {
                    }
                } else if (hashCode != 96801) {
                    if (hashCode == 3599307 && str2.equals("user")) {
                        UserId userId4 = l5g0Var.b;
                        if (userId4 != null) {
                            a.L(userId4);
                        }
                    }
                    userId = l5g0Var.f;
                    if (userId != null) {
                        a.G(userId);
                    }
                    str = l5g0Var.g;
                    if (str != null) {
                        a.E(str);
                    }
                } else {
                    if (str2.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        Long l2 = l5g0Var.e;
                        if (l2 != null) {
                            a.B(l2.longValue());
                        }
                    }
                    userId = l5g0Var.f;
                    if (userId != null) {
                    }
                    str = l5g0Var.g;
                    if (str != null) {
                    }
                }
                a.l(fragmentImpl);
                return s3q0.a;
            case 24:
                _init_$lambda$9 = WebViewAdPlayer._init_$lambda$9((WebViewAdPlayer) obj2, (Throwable) obj);
                return _init_$lambda$9;
            case 25:
                ((xkx0) obj2).C0();
                return s3q0.a;
            default:
                return (Attach) obj2;
        }
    }

    public /* synthetic */ fvq0(www0 www0Var, tww0 tww0Var) {
        this.b = 21;
        this.c = tww0Var;
    }
}
