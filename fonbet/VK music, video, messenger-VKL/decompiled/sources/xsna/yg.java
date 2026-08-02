package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketProfileInfoSimpleButtonDto;
import com.vk.attachpicker.impl.fragment.AttachMediaFragment;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.catalog2.common.ui.holders.ads.AdSearchBannerVh;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.live.impl.broadcast_settings.BroadcastSettingsFragment;
import com.vk.mediapicker.api.di.MediaPickerComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeAdCampaign;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToWishlists;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorArguments;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.ClipsEditorComponentVkApp;
import xsna.am9;
import xsna.bw3;
import xsna.dzc;
import xsna.ki8;
import xsna.rgd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 configure$lambda$9;
        Object obj;
        Object parcelable;
        io.reactivex.rxjava3.disposables.c cVar;
        String str;
        String url;
        MarketUtmData marketUtmData;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator translationY2;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator2;
        ViewPropertyAnimator duration2;
        oo9 cameraView;
        SurfaceView c;
        int i = this.b;
        int i2 = 0;
        r3 = null;
        r3 = null;
        Object obj2 = null;
        r3 = null;
        String str2 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int i3 = AbstractPollView.S;
                ((AbstractPollView) obj3).i();
                return s3q0.a;
            case 1:
                return new AdSearchBannerVh.b((AdSearchBannerVh) obj3);
            case 2:
                return com.vk.clips.sdk.shared.item.ads.c.u((com.vk.clips.sdk.shared.item.ads.c) obj3);
            case 3:
                d12 d12Var = (d12) obj3;
                wh50 wh50Var = d12Var.l;
                wh50 wh50Var2 = d12Var.g;
                Object value = ((zak0) wh50Var).getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = ((vak0) d12Var.j).getFloatValue();
                if (Float.isNaN(floatValue)) {
                    return ((zak0) wh50Var2).getValue();
                }
                Object value2 = ((zak0) wh50Var2).getValue();
                tgo e = d12Var.e();
                float c2 = e.c(value2);
                if (c2 != floatValue && !Float.isNaN(c2)) {
                    if (c2 < floatValue) {
                        Object b = e.b(floatValue, true);
                        if (b != null) {
                            return b;
                        }
                    } else {
                        Object b2 = e.b(floatValue, false);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                return value2;
            case 4:
                configure$lambda$9 = AndroidDiagnosticEventRepository.configure$lambda$9((AndroidDiagnosticEventRepository) obj3);
                return configure$lambda$9;
            case 5:
                return ((ms2) obj3).c.e();
            case 6:
                aw3 aw3Var = (aw3) obj3;
                if (aw3Var.k) {
                    aw3Var.i.onNext(bw3.a.a);
                }
                return s3q0.a;
            case 7:
                int i4 = AttachMediaFragment.S;
                return ((MediaPickerComponent) m7m.d((AttachMediaFragment) obj3).mo408a(fpf0.a(MediaPickerComponent.class))).Be();
            case 8:
                com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b bVar = (com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b) obj3;
                qcy<Object>[] qcyVarArr = com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b.j1;
                Bundle requireArguments = bVar.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arguments", AuthorArguments.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arguments");
                    obj = (AuthorArguments) (parcelable2 instanceof AuthorArguments ? parcelable2 : null);
                }
                dc5 dc5Var = new dc5((AuthorArguments) obj);
                l7m d = m7m.d(bVar);
                AuthorModalInternalComponent.i.getClass();
                return (AuthorModalInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, dc5Var, fpf0.a(AuthorModalInternalComponent.class), new cc5(i2))).a(fpf0.a(AuthorModalInternalComponent.class));
            case 9:
                ((izs) ((zak0) ((xn7) obj3).b).getValue()).invoke(a.g.C0965a.b);
                return s3q0.a;
            case 10:
                ((BroadcastSettingsFragment.b) obj3).invoke(ki8.b.b);
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr2 = CatalogSectionScreenFragment.T;
                return ((CatalogSectionScreenFragment) obj3).fo().createView();
            case 12:
                ChannelProfileFragment channelProfileFragment = (ChannelProfileFragment) obj3;
                int i5 = ChannelProfileFragment.e0;
                return new w8b((ixa) channelProfileFragment.V.getValue(), channelProfileFragment.Q, channelProfileFragment.P);
            case 13:
                return i5s.a(new StringBuilder(), ((wgb) obj3).s, ": updateExpiredHistory: update for next expired chunk");
            case 14:
                imv imvVar = ((ChatFragment) obj3).J0;
                (imvVar != null ? imvVar : null).h(MsgSendHidePopupsReason.OTHER);
                return s3q0.a;
            case 15:
                tsu tsuVar = ((azb) obj3).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).x.g) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 16:
                fgc fgcVar = (fgc) obj3;
                wfc wfcVar = fgcVar.c;
                MarketAnalyticsParams marketAnalyticsParams = fgcVar.d;
                if (marketAnalyticsParams != null) {
                    wfcVar.getClass();
                    str = marketAnalyticsParams.j;
                } else {
                    str = null;
                }
                wfcVar.getClass();
                CommonMarketStat$TypeAdCampaign a = wfc.a(marketAnalyticsParams);
                if (marketAnalyticsParams != null && (marketUtmData = marketAnalyticsParams.b) != null) {
                    str2 = marketUtmData.h;
                }
                wfc.b(str, new CommonMarketStat$TypeMarketTransitionToWishlists(a, str2));
                dw20 dw20Var = fgcVar.a.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                ggc ggcVar = fgcVar.b;
                MarketProfileInfoSimpleButtonDto k = ggcVar.b.k();
                if (k != null && (url = k.getUrl()) != null) {
                    maz.c(ggcVar.c, ggcVar.a, url, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 17:
                int i6 = ClipFeedListFragment.a2;
                return ((MarketComponent) m7m.d((ClipFeedListFragment) obj3).a(fpf0.a(MarketComponent.class))).l7();
            case 18:
                return new dzc.a((dzc) obj3);
            case 19:
                return ((ClipsTemplatesEditorComponent) ((k7m) m7m.f((o1d) obj3)).a(fpf0.a(ClipsTemplatesEditorComponent.class))).l5();
            case 20:
                return (VkButton) ((q8d) obj3).b().findViewById(R.id.video_single_clip_button);
            case 21:
                return new VkImageSimple((Context) obj3, null, 6, 0);
            case 22:
                rgd.a aVar = ((rgd) obj3).b;
                jpd jpdVar = aVar.d;
                jpdVar.b.i.y = true;
                jpdVar.u(true);
                CameraUIView cameraUIView = aVar.a;
                zd9 camera1View = cameraUIView.getCamera1View();
                if (camera1View != null && (cameraView = camera1View.getCameraView()) != null && (c = cameraView.c()) != null) {
                    obj2 = c.getParent();
                }
                View view = (View) obj2;
                if (view != null && (animate2 = view.animate()) != null && (translationY2 = animate2.translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (scaleX = translationY2.scaleX(1.0f)) != null && (scaleY = scaleX.scaleY(1.0f)) != null && (interpolator2 = scaleY.setInterpolator(new AccelerateDecelerateInterpolator())) != null && (duration2 = interpolator2.setDuration(350L)) != null) {
                    duration2.start();
                }
                zd9 camera1View2 = cameraUIView.getCamera1View();
                if (camera1View2 != null && (animate = camera1View2.animate()) != null && (translationY = animate.translationY(cameraUIView.Q(false).d())) != null && (interpolator = translationY.setInterpolator(new AccelerateDecelerateInterpolator())) != null && (duration = interpolator.setDuration(350L)) != null) {
                    duration.start();
                }
                zd9 camera1View3 = cameraUIView.getCamera1View();
                if (camera1View3 != null) {
                    camera1View3.M();
                }
                nf9 nf9Var = nf9.b;
                nf9Var.getClass();
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS;
                StoryPublishEvent storyPublishEvent = StoryPublishEvent.CANCEL_MUSIC_CAMERA;
                am9.a aVar2 = new am9.a();
                aVar2.j = com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen);
                nf9.b(nf9Var, storyPublishEvent, aVar2, null, null, true, null, 108).e();
                return s3q0.a;
            case 23:
                ((mqd) obj3).w0("#");
                return s3q0.a;
            case 24:
                qcy<Object>[] qcyVarArr3 = ClipsEditorComponentVkApp.c;
                return ((ClipsBlacklistsComponent) obj3).f4();
            case 25:
                return Float.valueOf(((q0e) obj3).e.o.a.g.b);
            case 26:
                p4e p4eVar = (p4e) obj3;
                dw20 dw20Var2 = p4eVar.k;
                if (dw20Var2 != null) {
                    dw20Var2.hide();
                }
                p4eVar.k = null;
                return s3q0.a;
            case 27:
                int i7 = ClipsGridCommonClipsListFragment.q0;
                return Boolean.valueOf(((ClipsGridCommonClipsListFragment) obj3).requireArguments().getBoolean("ClipsGridListFragment.force_dark_theme", false));
            case 28:
                return ((ClipsUploadSdkUploaderComponent) ((k7m) m7m.f((mkf) obj3)).a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).k3();
            default:
                return ((ClipsViewerComponentImpl) obj3).h.Uc();
        }
    }
}
