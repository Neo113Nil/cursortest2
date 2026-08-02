package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.zxing.pdf417.PDF417Common;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.button.VkButton;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.external.VideoToClipInput;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.model.ClipsEditorSessionParams;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.template.StoryTemplateData;
import com.vk.dto.stories.model.template.StoryTemplatesContainerData;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.api.Subscription;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.pip2.VideoPipModeAction;
import com.vk.libvideo.api.promo.DownloadRedirectionDelegateComponent;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySimilarTracksSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.polls.di.UxPollsComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.dialog.VideoDialogType;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSnackBarManager;
import com.vk.voip.VoipService;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.smartcast.api.ConnectionState;
import xsna.agp0;
import xsna.b4;
import xsna.chd;
import xsna.ejm0;
import xsna.f6x0;
import xsna.ikv0;
import xsna.iyq0;
import xsna.jew0;
import xsna.k840;
import xsna.kkt0;
import xsna.qr60;
import xsna.tlw0;
import xsna.vyd;
import xsna.xcw0;
import xsna.xn50;
import xsna.xts0;
import xsna.y050;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qjm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qjm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v128, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v124, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v173, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v221, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v224, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v227, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v257, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v274, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.lang.Object, kotlin.Lazy] */
    private final Object a(Object obj) {
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait;
        xts0.a e;
        mws0 mws0Var;
        xts0.a c;
        xts0.a a;
        nb30 nb30Var;
        VideoPipModeAction.Minimize.Trigger trigger;
        VideoDiscoveryRelatedVideosSnackBarManager.Event event;
        edt0 edt0Var;
        yks0 yks0Var;
        VideoFile videoFile;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
        ?? r2 = videoMinimizableDiscoveryFragment.l0;
        etn etnVar = videoMinimizableDiscoveryFragment.s0;
        ?? r4 = videoMinimizableDiscoveryFragment.m0;
        VideoMinimizableDiscoverySideEffect videoMinimizableDiscoverySideEffect = (VideoMinimizableDiscoverySideEffect) obj;
        int i = VideoMinimizableDiscoveryFragment.p1;
        if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.j0) {
            MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
            if (miniPlayerControllersWrapper != null) {
                miniPlayerControllersWrapper.f1();
            }
        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.l) {
            VideoFile videoFile2 = ((VideoMinimizableDiscoverySideEffect.l) videoMinimizableDiscoverySideEffect).a;
            if (videoMinimizableDiscoveryFragment.mo2getContext() != null) {
                com.vk.libvideo.api.promo.a l2 = ((DownloadRedirectionDelegateComponent) videoMinimizableDiscoveryFragment.ko().F.getValue()).l2();
                VideoScreenMode videoScreenMode = VideoScreenMode.DISCOVERY;
                l2.getClass();
            }
        } else {
            VideoNotificationsStatus videoNotificationsStatus = null;
            int i2 = 1;
            if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.i0) {
                Subscription subscription = ((VideoMinimizableDiscoverySideEffect.i0) videoMinimizableDiscoverySideEffect).a;
                MiniPlayerControllersWrapper miniPlayerControllersWrapper2 = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper2 != null && (yks0Var = miniPlayerControllersWrapper2.t) != null && (videoFile = yks0Var.e) != null) {
                    boolean z = subscription instanceof Subscription.Subscribed;
                    videoFile.k3(z);
                    Owner s = videoFile.s();
                    if (s != null) {
                        s.g(4, z);
                    }
                    if (z) {
                        int i3 = VideoMinimizableDiscoveryFragment.c.$EnumSwitchMapping$1[((Subscription.Subscribed) subscription).a.ordinal()];
                        if (i3 == 1) {
                            videoNotificationsStatus = VideoNotificationsStatus.ALL;
                        } else if (i3 == 2) {
                            videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
                        } else {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            videoNotificationsStatus = VideoNotificationsStatus.NONE;
                        }
                    } else if (!(subscription instanceof Subscription.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoFile.J6(videoNotificationsStatus);
                    wjs0.a(new fyr0(videoFile));
                }
            } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.g0) {
                nht0 nht0Var = videoMinimizableDiscoveryFragment.d0;
                if (nht0Var != null) {
                    nht0Var.a();
                }
            } else {
                if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.f0) {
                    VideoMinimizableState P0 = ((VideoMinimizablePlayerComponent) videoMinimizableDiscoveryFragment.ko().a.getValue()).b3().P0();
                    if ((P0 != null ? com.vk.libvideo.api.minimizable.a.d(P0) : false) && (edt0Var = videoMinimizableDiscoveryFragment.e0) != null) {
                        edt0Var.a();
                    }
                } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.c0) {
                    VideoRelatedVideosLoopMode videoRelatedVideosLoopMode = ((VideoMinimizableDiscoverySideEffect.c0) videoMinimizableDiscoverySideEffect).a;
                    VideoDiscoveryRelatedVideosSnackBarManager videoDiscoveryRelatedVideosSnackBarManager = videoMinimizableDiscoveryFragment.g0;
                    if (videoDiscoveryRelatedVideosSnackBarManager != null) {
                        int i4 = VideoMinimizableDiscoveryFragment.c.$EnumSwitchMapping$2[videoRelatedVideosLoopMode.ordinal()];
                        if (i4 == 1) {
                            event = VideoDiscoveryRelatedVideosSnackBarManager.Event.LoopDisable;
                        } else if (i4 == 2) {
                            event = VideoDiscoveryRelatedVideosSnackBarManager.Event.Loop;
                        } else {
                            if (i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            event = VideoDiscoveryRelatedVideosSnackBarManager.Event.SingleVideoLoop;
                        }
                        videoDiscoveryRelatedVideosSnackBarManager.a(event);
                    }
                } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.d0) {
                    VideoDiscoveryRelatedVideosSnackBarManager videoDiscoveryRelatedVideosSnackBarManager2 = videoMinimizableDiscoveryFragment.g0;
                    if (videoDiscoveryRelatedVideosSnackBarManager2 != null) {
                        videoDiscoveryRelatedVideosSnackBarManager2.a(VideoDiscoveryRelatedVideosSnackBarManager.Event.Shuffle);
                    }
                } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.e0) {
                    boolean z2 = ((VideoMinimizableDiscoverySideEffect.e0) videoMinimizableDiscoverySideEffect).a;
                    VideoDiscoveryRelatedVideosSnackBarManager videoDiscoveryRelatedVideosSnackBarManager3 = videoMinimizableDiscoveryFragment.g0;
                    if (videoDiscoveryRelatedVideosSnackBarManager3 != null) {
                        videoDiscoveryRelatedVideosSnackBarManager3.a(z2 ? VideoDiscoveryRelatedVideosSnackBarManager.Event.SortInverse : VideoDiscoveryRelatedVideosSnackBarManager.Event.SortNormal);
                    }
                } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.b0) {
                    VideoMinimizableDiscoverySideEffect.b0 b0Var = (VideoMinimizableDiscoverySideEffect.b0) videoMinimizableDiscoverySideEffect;
                    ((VideoGrowthComponent) videoMinimizableDiscoveryFragment.ko().f.getValue()).B6().a(videoMinimizableDiscoveryFragment.requireContext(), b0Var.a, b0Var.b, new x1e0(videoMinimizableDiscoveryFragment, 27));
                } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.a0) {
                    VideoMinimizableDiscoverySideEffect.a0 a0Var = (VideoMinimizableDiscoverySideEffect.a0) videoMinimizableDiscoverySideEffect;
                    ((VideoGrowthComponent) videoMinimizableDiscoveryFragment.ko().f.getValue()).B3().a(videoMinimizableDiscoveryFragment.requireContext(), a0Var.a, (r14 & 4) != 0 ? false : false, (r14 & 8) == 0, (r14 & 16) == 0, a0Var.b);
                } else {
                    int i5 = 10;
                    if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.n0) {
                        VideoMinimizableDiscoverySideEffect.n0 n0Var = (VideoMinimizableDiscoverySideEffect.n0) videoMinimizableDiscoverySideEffect;
                        if (epx.f(n0Var, VideoMinimizableDiscoverySideEffect.n0.a.a)) {
                            odt0 odt0Var = (odt0) r4.getValue();
                            ikv0 ikv0Var = odt0Var.c;
                            if (ikv0Var != null) {
                                ikv0Var.a();
                            }
                            odt0Var.c = null;
                        } else {
                            if (!epx.f(n0Var, VideoMinimizableDiscoverySideEffect.n0.b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            odt0 odt0Var2 = (odt0) r4.getValue();
                            Context context = odt0Var2.a;
                            ikv0 ikv0Var2 = odt0Var2.c;
                            if (ikv0Var2 != null) {
                                ikv0Var2.a();
                                odt0Var2.c = null;
                            }
                            ikv0.a aVar = new ikv0.a(context);
                            aVar.u = new ikv0.d(new ikv0.d.c(context.getResources().getString(R.string.video_restriction_snack_message)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getResources().getString(R.string.watch), new jan0(odt0Var2, i5));
                            aVar.h = new gqe0(odt0Var2, 25);
                            odt0Var2.c = aVar.n();
                        }
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.u) {
                        if (!etnVar.a()) {
                            com.vk.video.ui.discovery.minimizable.r rVar = (com.vk.video.ui.discovery.minimizable.r) videoMinimizableDiscoveryFragment.p0.getValue();
                            if (rVar != null) {
                                kfs0 kfs0Var = rVar.c() ? ((VideoMinimizableDiscoveryFragment) rVar.g.c).H0 : ((VideoMinimizableDiscoveryFragment) rVar.e.c).G0;
                                if (kfs0Var != null) {
                                    kfs0Var.setItems(EmptyList.b);
                                }
                            }
                            com.vk.video.ui.discovery.minimizable.t tVar = (com.vk.video.ui.discovery.minimizable.t) videoMinimizableDiscoveryFragment.q0.getValue();
                            if (tVar != null) {
                                kfs0 kfs0Var2 = tVar.c() ? tVar.f.c.H0 : tVar.e.c.G0;
                                if (kfs0Var2 != null) {
                                    kfs0Var2.setItems(EmptyList.b);
                                }
                            }
                            com.vk.video.ui.discovery.minimizable.a aVar2 = (com.vk.video.ui.discovery.minimizable.a) videoMinimizableDiscoveryFragment.r0.getValue();
                            if (aVar2 != null) {
                                znj0 a2 = aVar2.a();
                                qoj0 g = a2 != null ? a2.g() : null;
                                if (g != null) {
                                    g.setItems(EmptyList.b);
                                }
                            }
                            com.vk.lists.c cVar = videoMinimizableDiscoveryFragment.y0;
                            if (cVar != null) {
                                cVar.p(false);
                            }
                            com.vk.lists.c cVar2 = videoMinimizableDiscoveryFragment.A0;
                            if (cVar2 != null) {
                                cVar2.p(false);
                            }
                            com.vk.lists.c cVar3 = videoMinimizableDiscoveryFragment.z0;
                            if (cVar3 != null) {
                                cVar3.p(false);
                            }
                        }
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.t) {
                        if (!etnVar.c()) {
                            videoMinimizableDiscoveryFragment.o1 = false;
                            kfs0 kfs0Var3 = videoMinimizableDiscoveryFragment.H0;
                            if (kfs0Var3 != null) {
                                kfs0Var3.setItems(EmptyList.b);
                            }
                            VideoMinimizableDiscoveryFragment.b bVar = videoMinimizableDiscoveryFragment.U;
                            (bVar != null ? bVar : null).b.g.f.getRecyclerView().scrollToPosition(0);
                            com.vk.lists.c cVar4 = videoMinimizableDiscoveryFragment.y0;
                            if (cVar4 != null) {
                                cVar4.p(false);
                            }
                            com.vk.lists.c cVar5 = videoMinimizableDiscoveryFragment.A0;
                            if (cVar5 != null) {
                                cVar5.p(false);
                            }
                            com.vk.lists.c cVar6 = videoMinimizableDiscoveryFragment.z0;
                            if (cVar6 != null) {
                                cVar6.p(false);
                            }
                        }
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.q) {
                        videoMinimizableDiscoveryFragment.ho(((VideoMinimizableDiscoverySideEffect.q) videoMinimizableDiscoverySideEffect).a, false, true);
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.i) {
                        videoMinimizableDiscoveryFragment.ho(((VideoMinimizableDiscoverySideEffect.i) videoMinimizableDiscoverySideEffect).a, true, !r5.b);
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.Motion) {
                        VideoMinimizableDiscoverySideEffect.Motion motion = (VideoMinimizableDiscoverySideEffect.Motion) videoMinimizableDiscoverySideEffect;
                        if (epx.f(motion, VideoMinimizableDiscoverySideEffect.Motion.b.a)) {
                            com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                            if (mVar != null) {
                                mVar.d(null);
                            }
                        } else if (epx.f(motion, VideoMinimizableDiscoverySideEffect.Motion.a.a)) {
                            if (videoMinimizableDiscoveryFragment.no()) {
                                com.vk.video.ui.discovery.minimizable.m mVar2 = videoMinimizableDiscoveryFragment.J0;
                                if (mVar2 != null) {
                                    mVar2.r(mVar2.r ? DiscoveryScreenMotionStates$Landscape.Hidden : DiscoveryScreenMotionStates$Portrait.Hidden);
                                }
                                com.vk.video.ui.discovery.minimizable.m mVar3 = videoMinimizableDiscoveryFragment.J0;
                                if (mVar3 != null) {
                                    mVar3.b();
                                }
                                videoMinimizableDiscoveryFragment.ko().Hf().getClass();
                            } else {
                                ((VideoPip2Component) videoMinimizableDiscoveryFragment.ko().b.getValue()).Lb().onNext(VideoPipModeAction.a.a);
                            }
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures)) {
                                qu5.c().getClass();
                                if (ConnectionState.CONNECTED == null) {
                                    qu5.c().getClass();
                                }
                            }
                        } else if (epx.f(motion, VideoMinimizableDiscoverySideEffect.Motion.c.a)) {
                            if (videoMinimizableDiscoveryFragment.no()) {
                                com.vk.video.ui.discovery.minimizable.m mVar4 = videoMinimizableDiscoveryFragment.J0;
                                if (mVar4 != null) {
                                    mVar4.r(mVar4.r ? DiscoveryScreenMotionStates$Landscape.Hidden : DiscoveryScreenMotionStates$Portrait.Hidden);
                                }
                            } else {
                                ((VideoPip2Component) videoMinimizableDiscoveryFragment.ko().b.getValue()).Lb().onNext(VideoPipModeAction.a.a);
                            }
                        } else if (motion instanceof VideoMinimizableDiscoverySideEffect.Motion.d) {
                            if (videoMinimizableDiscoveryFragment.no()) {
                                com.vk.video.ui.discovery.minimizable.m mVar5 = videoMinimizableDiscoveryFragment.J0;
                                if (mVar5 != null) {
                                    boolean z3 = ((VideoMinimizableDiscoverySideEffect.Motion.d) motion).a;
                                    if (mVar5.f) {
                                        nb30 nb30Var2 = mVar5.r ? DiscoveryScreenMotionStates$Landscape.Miniplayer : DiscoveryScreenMotionStates$Portrait.Miniplayer;
                                        if (z3) {
                                            mVar5.r(nb30Var2);
                                        } else {
                                            mVar5.k(nb30Var2);
                                        }
                                    } else {
                                        mVar5.r(mVar5.r ? DiscoveryScreenMotionStates$Landscape.Hidden : DiscoveryScreenMotionStates$Portrait.Hidden);
                                    }
                                }
                            } else {
                                io.reactivex.rxjava3.subjects.f<VideoPipModeAction> Lb = ((VideoPip2Component) videoMinimizableDiscoveryFragment.ko().b.getValue()).Lb();
                                int i6 = VideoMinimizableDiscoveryFragment.c.$EnumSwitchMapping$0[((VideoMinimizableDiscoverySideEffect.Motion.d) motion).b.ordinal()];
                                if (i6 == 1) {
                                    trigger = VideoPipModeAction.Minimize.Trigger.ByGesture;
                                } else if (i6 == 2) {
                                    trigger = VideoPipModeAction.Minimize.Trigger.ByBackButton;
                                } else {
                                    if (i6 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    trigger = VideoPipModeAction.Minimize.Trigger.Other;
                                }
                                Lb.onNext(new VideoPipModeAction.Minimize(true, trigger));
                            }
                        } else {
                            if (!(motion instanceof VideoMinimizableDiscoverySideEffect.Motion.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.vk.video.ui.discovery.minimizable.m mVar6 = videoMinimizableDiscoveryFragment.J0;
                            if (mVar6 != null) {
                                com.vk.video.ui.discovery.minimizable.b bVar2 = ((VideoMinimizableDiscoverySideEffect.Motion.e) motion).a;
                                if (!epx.f(mVar6.p, bVar2)) {
                                    if (bVar2 instanceof b.a) {
                                        mVar6.b();
                                    } else if (bVar2 instanceof b.C1972b) {
                                        com.vk.video.ui.discovery.minimizable.m.m(mVar6, true, 2);
                                    } else {
                                        if (!(bVar2 instanceof b.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.vk.video.ui.discovery.minimizable.m.m(mVar6, false, 2);
                                    }
                                }
                            }
                        }
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.d) {
                        VideoTransitionSource videoTransitionSource = ((VideoMinimizableDiscoverySideEffect.d) videoMinimizableDiscoverySideEffect).b;
                        com.vk.video.ui.discovery.minimizable.m mVar7 = videoMinimizableDiscoveryFragment.J0;
                        if (mVar7 != null) {
                            mVar7.d(videoTransitionSource);
                        }
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.v) {
                        VideoMinimizableState videoMinimizableState = ((VideoMinimizableDiscoverySideEffect.v) videoMinimizableDiscoverySideEffect).a;
                        if (!epx.f(videoMinimizableState, VideoMinimizableState.Pip.b) || videoMinimizableDiscoveryFragment.kn().isInPictureInPictureMode()) {
                            com.vk.video.ui.discovery.minimizable.m mVar8 = videoMinimizableDiscoveryFragment.J0;
                            if (mVar8 != null) {
                                VideoMinimizableState videoMinimizableState2 = videoMinimizableState instanceof VideoMinimizableState.Animating ? ((VideoMinimizableState.Animating) videoMinimizableState).c : videoMinimizableState;
                                if (videoMinimizableState2 instanceof VideoMinimizableState.Collapsed) {
                                    nb30Var = mVar8.r ? DiscoveryScreenMotionStates$Landscape.Miniplayer : DiscoveryScreenMotionStates$Portrait.Miniplayer;
                                } else if (videoMinimizableState2 instanceof VideoMinimizableState.Expanded) {
                                    nb30Var = mVar8.e();
                                } else if (videoMinimizableState2 instanceof VideoMinimizableState.FullscreenHorizontal) {
                                    nb30Var = !epx.f(mVar8.p, b.a.a) ? DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog : DiscoveryScreenMotionStates$Landscape.Fullscreen;
                                } else if (!(videoMinimizableState2 instanceof VideoMinimizableState.FullscreenVertical)) {
                                    nb30Var = videoMinimizableState2 instanceof VideoMinimizableState.Pip ? man.b : mVar8.r ? DiscoveryScreenMotionStates$Landscape.Hidden : DiscoveryScreenMotionStates$Portrait.Hidden;
                                } else if (epx.f(mVar8.p, b.a.a) || !fxc0.B().J().V()) {
                                    nb30Var = DiscoveryScreenMotionStates$Portrait.Fullscreen;
                                } else {
                                    mVar8.v = true;
                                    nb30Var = DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo;
                                }
                                mVar8.k(nb30Var);
                            }
                            MiniPlayerControllersWrapper miniPlayerControllersWrapper3 = videoMinimizableDiscoveryFragment.X;
                            if (miniPlayerControllersWrapper3 != null) {
                                miniPlayerControllersWrapper3.Q(videoMinimizableState);
                            }
                            tts0 tts0Var = videoMinimizableDiscoveryFragment.V;
                            if (tts0Var == null) {
                                tts0Var = null;
                            }
                            tts0Var.c(videoMinimizableState);
                            com.vk.video.ui.discovery.minimizable.announce.a aVar3 = videoMinimizableDiscoveryFragment.W;
                            com.vk.video.ui.discovery.minimizable.announce.a aVar4 = aVar3 != null ? aVar3 : null;
                            if (videoMinimizableState instanceof VideoMinimizableState.Animating) {
                                aVar4.d.invoke();
                            } else {
                                aVar4.e.invoke();
                            }
                            aVar4.f(videoMinimizableState, aVar4.n);
                            aVar4.m = videoMinimizableState;
                        } else {
                            com.vk.video.ui.discovery.minimizable.m mVar9 = videoMinimizableDiscoveryFragment.J0;
                            if (mVar9 != null) {
                                mVar9.d(null);
                            }
                        }
                        hg1.a(((VideoMinimizablePlayerComponent) videoMinimizableDiscoveryFragment.ko().a.getValue()).zb().a().subscribe(new k2y(new mdk0(videoMinimizableDiscoveryFragment, 15), 24)), videoMinimizableDiscoveryFragment.getViewLifecycleOwner());
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.p) {
                        VideoMinimizableDiscoverySideEffect.p pVar = (VideoMinimizableDiscoverySideEffect.p) videoMinimizableDiscoverySideEffect;
                        if (pVar instanceof VideoMinimizableDiscoverySideEffect.p.b) {
                            MiniPlayerControllersWrapper miniPlayerControllersWrapper4 = videoMinimizableDiscoveryFragment.X;
                            if (miniPlayerControllersWrapper4 != null) {
                                ((VideoMinimizableDiscoverySideEffect.p.b) pVar).getClass();
                                miniPlayerControllersWrapper4.c1();
                            }
                        } else if (pVar instanceof VideoMinimizableDiscoverySideEffect.p.e) {
                            MiniPlayerControllersWrapper miniPlayerControllersWrapper5 = videoMinimizableDiscoveryFragment.X;
                            if (miniPlayerControllersWrapper5 != null) {
                                miniPlayerControllersWrapper5.f();
                            }
                        } else if (pVar instanceof VideoMinimizableDiscoverySideEffect.p.c) {
                            MiniPlayerControllersWrapper miniPlayerControllersWrapper6 = videoMinimizableDiscoveryFragment.X;
                            if (miniPlayerControllersWrapper6 != null) {
                                miniPlayerControllersWrapper6.c();
                            }
                        } else if (pVar instanceof VideoMinimizableDiscoverySideEffect.p.d) {
                            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                            xh5 xh5Var = b.C1208b.a().c;
                            yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
                            if (!((yg5Var != null ? yg5Var.A() : null) instanceof ClipVideoFile) && yg5Var != null) {
                                yg5Var.c();
                            }
                        } else if (pVar instanceof VideoMinimizableDiscoverySideEffect.p.a) {
                            MiniPlayerControllersWrapper miniPlayerControllersWrapper7 = videoMinimizableDiscoveryFragment.X;
                            if (miniPlayerControllersWrapper7 != null) {
                                miniPlayerControllersWrapper7.Q5(((VideoMinimizableDiscoverySideEffect.p.a) pVar).a);
                            }
                        } else if (epx.f(pVar, VideoMinimizableDiscoverySideEffect.p.f.a)) {
                            MiniPlayerControllersWrapper miniPlayerControllersWrapper8 = videoMinimizableDiscoveryFragment.X;
                            if (miniPlayerControllersWrapper8 != null) {
                                miniPlayerControllersWrapper8.vm();
                            }
                        } else {
                            if (!(pVar instanceof VideoMinimizableDiscoverySideEffect.p.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            VideoMinimizableDiscoverySideEffect.p.g gVar = (VideoMinimizableDiscoverySideEffect.p.g) pVar;
                            if (gVar.b) {
                                je0 je0Var = gVar.a;
                                if (je0Var != null) {
                                    je0Var.a(true);
                                }
                            } else {
                                MiniPlayerControllersWrapper miniPlayerControllersWrapper9 = videoMinimizableDiscoveryFragment.X;
                                if (miniPlayerControllersWrapper9 != null) {
                                    miniPlayerControllersWrapper9.c1();
                                }
                            }
                        }
                    } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.j) {
                        VideoMinimizableDiscoverySideEffect.j jVar = (VideoMinimizableDiscoverySideEffect.j) videoMinimizableDiscoverySideEffect;
                        if (jVar instanceof VideoMinimizableDiscoverySideEffect.j.i) {
                            ydt0 Y = fxc0.B().Y();
                            Context requireContext = videoMinimizableDiscoveryFragment.requireContext();
                            VideoFile videoFile3 = ((VideoMinimizableDiscoverySideEffect.j.i) jVar).a;
                            FullSourceJoinApi.EntryServiceType entryServiceType = videoMinimizableDiscoveryFragment.a1.a;
                            ydt0.f(Y, requireContext, videoFile3, null, null, entryServiceType != null ? entryServiceType.i() : null, 12);
                        } else if (jVar instanceof VideoMinimizableDiscoverySideEffect.j.c) {
                            mws0 mws0Var2 = videoMinimizableDiscoveryFragment.K0;
                            if (mws0Var2 != null && (a = mws0Var2.a.a()) != null) {
                                mws0Var2.b(a, VideoDialogType.About.i());
                                s3q0 s3q0Var = s3q0.a;
                            }
                        } else if (jVar instanceof VideoMinimizableDiscoverySideEffect.j.g) {
                            mws0 mws0Var3 = videoMinimizableDiscoveryFragment.K0;
                            if (mws0Var3 != null && (c = mws0Var3.a.c()) != null) {
                                mws0Var3.b(c, VideoDialogType.Episodes.i());
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                        } else if (jVar instanceof VideoMinimizableDiscoverySideEffect.j.e) {
                            Optional<VideoFile> P02 = videoMinimizableDiscoveryFragment.r5().P0();
                            if (P02 != null && (mws0Var = videoMinimizableDiscoveryFragment.K0) != null) {
                                VideoFile videoFile4 = P02.get();
                                ReplyInfo replyInfo = ((VideoMinimizableDiscoverySideEffect.j.e) jVar).a;
                                String a3 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY);
                                ((Boolean) videoMinimizableDiscoveryFragment.j1.getValue()).getClass();
                                xts0.a b = mws0Var.a.b(videoFile4, a3, replyInfo);
                                if (b != null) {
                                    mws0Var.b(b, VideoDialogType.Comments.i());
                                }
                            }
                        } else if (jVar instanceof VideoMinimizableDiscoverySideEffect.j.C1970j) {
                            mws0 mws0Var4 = videoMinimizableDiscoveryFragment.K0;
                            if (mws0Var4 != null && (e = mws0Var4.a.e()) != null) {
                                mws0Var4.b(e, VideoDialogType.RelatedVideos.i());
                            }
                        } else if (jVar instanceof VideoMinimizableDiscoverySideEffect.j.f) {
                            mws0 mws0Var5 = videoMinimizableDiscoveryFragment.K0;
                            if (mws0Var5 != null) {
                                xts0.a d = mws0Var5.a.d(((VideoMinimizableDiscoverySideEffect.j.f) jVar).a);
                                if (d != null) {
                                    mws0Var5.b(d, VideoDialogType.CommentsThread.i());
                                }
                            }
                        } else if (jVar instanceof VideoMinimizableDiscoverySideEffect.j.a) {
                            mws0 mws0Var6 = videoMinimizableDiscoveryFragment.K0;
                            if (mws0Var6 != null) {
                                List<VideoDialogType> list = ((VideoMinimizableDiscoverySideEffect.j.a) jVar).a;
                                lws0 lws0Var = mws0Var6.e;
                                List<VideoDialogType> list2 = list;
                                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                                Iterator<T> it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((VideoDialogType) it.next()).i());
                                }
                                ArrayList b2 = lws0Var.b();
                                if (!b2.isEmpty()) {
                                    Iterator it2 = b2.iterator();
                                    while (it2.hasNext()) {
                                        if (j5g.P(arrayList, ((Fragment) it2.next()).getTag())) {
                                            break;
                                        }
                                    }
                                }
                                mws0Var6.b.invoke();
                                Iterator it3 = lws0Var.b().iterator();
                                while (it3.hasNext()) {
                                    Fragment fragment = (Fragment) it3.next();
                                    if (!j5g.P(arrayList, fragment.getTag())) {
                                        lws0Var.c(fragment.getTag());
                                    }
                                }
                            }
                        } else if (epx.f(jVar, VideoMinimizableDiscoverySideEffect.j.b.a)) {
                            mws0 mws0Var7 = videoMinimizableDiscoveryFragment.K0;
                            if (mws0Var7 != null) {
                                Fragment fragment2 = (Fragment) j5g.k0(mws0Var7.e.b());
                                if (epx.f(fragment2 != null ? fragment2.getTag() : null, VideoDialogType.RelatedVideos.i())) {
                                    mws0Var7.a();
                                }
                            }
                        } else if (jVar instanceof VideoMinimizableDiscoverySideEffect.j.h) {
                            ((UxPollsComponent) videoMinimizableDiscoveryFragment.ko().p.getValue()).o2().d(videoMinimizableDiscoveryFragment.requireContext(), ((VideoMinimizableDiscoverySideEffect.j.h) jVar).a);
                        } else {
                            if (!(jVar instanceof VideoMinimizableDiscoverySideEffect.j.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (videoMinimizableDiscoveryFragment.K0 != null) {
                                throw null;
                            }
                        }
                    } else {
                        int i7 = 12;
                        if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.h) {
                            VideoMinimizableDiscoverySideEffect.h hVar = (VideoMinimizableDiscoverySideEffect.h) videoMinimizableDiscoverySideEffect;
                            if (hVar instanceof VideoMinimizableDiscoverySideEffect.h.b) {
                                pbx pbxVar = videoMinimizableDiscoveryFragment.f0;
                                if (pbxVar != null) {
                                    Context context2 = pbxVar.a;
                                    if (pbxVar.b == null) {
                                        ikv0.a aVar5 = new ikv0.a(context2);
                                        aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                                        aVar5.u = new ikv0.d(new ikv0.d.c(context2.getResources().getString(R.string.interactive_video_expand_to_continue)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                                        aVar5.h = new ire(pbxVar, 21);
                                        pbxVar.b = aVar5.n();
                                    }
                                }
                            } else if (hVar instanceof VideoMinimizableDiscoverySideEffect.h.a) {
                                pbx pbxVar2 = videoMinimizableDiscoveryFragment.f0;
                                if (pbxVar2 != null) {
                                    ikv0 ikv0Var3 = pbxVar2.b;
                                    if (ikv0Var3 != null) {
                                        ikv0Var3.a();
                                    }
                                    pbxVar2.b = null;
                                }
                            } else {
                                if (!epx.f(hVar, VideoMinimizableDiscoverySideEffect.h.c.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                pbx pbxVar3 = videoMinimizableDiscoveryFragment.f0;
                                if (pbxVar3 != null) {
                                    i0q0.d(500L, new ja6(pbxVar3, 6));
                                }
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.k0) {
                            VideoMinimizableDiscoverySideEffect.k0 k0Var = (VideoMinimizableDiscoverySideEffect.k0) videoMinimizableDiscoverySideEffect;
                            com.vk.video.ui.discovery.minimizable.m mVar10 = videoMinimizableDiscoveryFragment.J0;
                            if (mVar10 != null) {
                                Context context3 = mVar10.a;
                                boolean z4 = k0Var.a;
                                rzl0 rzl0Var = mVar10.i;
                                boolean z5 = mVar10.e;
                                nb30 c2 = mVar10.c();
                                DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait2 = DiscoveryScreenMotionStates$Portrait.Discovery;
                                if (c2 == discoveryScreenMotionStates$Portrait2 || c2 == (discoveryScreenMotionStates$Portrait = DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio) || c2 == DiscoveryScreenMotionStates$Portrait.DialogFullscreen || c2 == DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo) {
                                    if (!z4) {
                                        HashSet hashSet = iah0.a;
                                        if (!fnj.d(context3)) {
                                            mVar10.w = true;
                                            rzl0Var.invoke(Boolean.TRUE);
                                        }
                                    }
                                    mVar10.w = true;
                                    mVar10.r(DiscoveryScreenMotionStates$Portrait.Fullscreen);
                                } else {
                                    DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape = DiscoveryScreenMotionStates$Landscape.Discovery;
                                    if (c2 == discoveryScreenMotionStates$Landscape || c2 == DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog) {
                                        mVar10.w = true;
                                        if (z4) {
                                            mVar10.r(DiscoveryScreenMotionStates$Portrait.Fullscreen);
                                        } else {
                                            mVar10.r(DiscoveryScreenMotionStates$Landscape.Fullscreen);
                                        }
                                    } else if (c2 == DiscoveryScreenMotionStates$Landscape.Fullscreen || c2 == DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog || c2 == DiscoveryScreenMotionStates$Landscape.FullscreenWithRightPromo || c2 == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar || c2 == DiscoveryScreenMotionStates$Landscape.FullscreenWithBottomPromo) {
                                        if (z5 && mVar10.r) {
                                            mVar10.r(discoveryScreenMotionStates$Landscape);
                                        } else {
                                            HashSet hashSet2 = iah0.a;
                                            if (fnj.d(context3)) {
                                                if (mVar10.f) {
                                                    mVar10.r(mVar10.r ? DiscoveryScreenMotionStates$Landscape.Miniplayer : DiscoveryScreenMotionStates$Portrait.Miniplayer);
                                                } else {
                                                    mVar10.r(mVar10.r ? DiscoveryScreenMotionStates$Landscape.Hidden : DiscoveryScreenMotionStates$Portrait.Hidden);
                                                }
                                            } else if (mVar10.r) {
                                                rzl0Var.invoke(Boolean.FALSE);
                                            } else if (mVar10.x) {
                                                mVar10.r(discoveryScreenMotionStates$Portrait);
                                            } else {
                                                mVar10.r(discoveryScreenMotionStates$Portrait2);
                                            }
                                        }
                                    } else if (c2 == DiscoveryScreenMotionStates$Portrait.Fullscreen) {
                                        if (z5 && mVar10.r) {
                                            mVar10.r(discoveryScreenMotionStates$Landscape);
                                        } else if (mVar10.x) {
                                            mVar10.r(discoveryScreenMotionStates$Portrait);
                                        } else {
                                            mVar10.r(discoveryScreenMotionStates$Portrait2);
                                        }
                                    }
                                }
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.o0) {
                            VideoMinimizableDiscoverySideEffect.o0 o0Var = (VideoMinimizableDiscoverySideEffect.o0) videoMinimizableDiscoverySideEffect;
                            if (epx.f(o0Var, VideoMinimizableDiscoverySideEffect.o0.b.a)) {
                                com.vk.video.ui.discovery.minimizable.m mVar11 = videoMinimizableDiscoveryFragment.J0;
                                if (mVar11 != null) {
                                    mVar11.a(new ume0(i7, mVar11, new tus0(videoMinimizableDiscoveryFragment, null == true ? 1 : 0)));
                                }
                            } else {
                                if (!epx.f(o0Var, VideoMinimizableDiscoverySideEffect.o0.a.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.vk.video.ui.discovery.minimizable.m mVar12 = videoMinimizableDiscoveryFragment.J0;
                                if (mVar12 != null && ((mVar12.c() == DiscoveryScreenMotionStates$Landscape.FullscreenWithRightPromo || mVar12.c() == DiscoveryScreenMotionStates$Landscape.FullscreenWithBottomPromo) && mVar12.r)) {
                                    mVar12.r(DiscoveryScreenMotionStates$Landscape.Fullscreen);
                                }
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.s) {
                            videoMinimizableDiscoveryFragment.po((VideoMinimizableDiscoverySideEffect.s) videoMinimizableDiscoverySideEffect);
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.g) {
                            VideoMinimizableDiscoverySideEffect.g gVar2 = (VideoMinimizableDiscoverySideEffect.g) videoMinimizableDiscoverySideEffect;
                            if (epx.f(gVar2, VideoMinimizableDiscoverySideEffect.g.a.a)) {
                                videoMinimizableDiscoveryFragment.to(false);
                            } else {
                                if (!epx.f(gVar2, VideoMinimizableDiscoverySideEffect.g.b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                videoMinimizableDiscoveryFragment.to(true);
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.c) {
                            VideoMinimizableDiscoverySideEffect.c cVar7 = (VideoMinimizableDiscoverySideEffect.c) videoMinimizableDiscoverySideEffect;
                            if (epx.f(cVar7, VideoMinimizableDiscoverySideEffect.c.a.a)) {
                                com.vk.video.ui.discovery.minimizable.m mVar13 = videoMinimizableDiscoveryFragment.J0;
                                if (mVar13 != null && mVar13.c() == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar && mVar13.r) {
                                    mVar13.r(DiscoveryScreenMotionStates$Landscape.Fullscreen);
                                }
                            } else {
                                if (!epx.f(cVar7, VideoMinimizableDiscoverySideEffect.c.b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.vk.video.ui.discovery.minimizable.m mVar14 = videoMinimizableDiscoveryFragment.J0;
                                if (mVar14 != null) {
                                    mVar14.a(new dp0(mVar14, new com.vk.video.ui.discovery.minimizable.l((coj0) r2.getValue())));
                                }
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.m0) {
                            q4 q4Var = videoMinimizableDiscoveryFragment.I0;
                            if (q4Var != null) {
                                q4Var.d(new b4.c.h("video_endscreen", null, new w2a0(14)));
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.z) {
                            com.vk.video.ui.discovery.minimizable.m mVar15 = videoMinimizableDiscoveryFragment.J0;
                            if (mVar15 != null) {
                                mVar15.a(new dp0(mVar15, new acd((coj0) r2.getValue())));
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.h0) {
                            videoMinimizableDiscoveryFragment.ro();
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.e) {
                            VideoMinimizableDiscoverySideEffect.e eVar = (VideoMinimizableDiscoverySideEffect.e) videoMinimizableDiscoverySideEffect;
                            if (epx.f(eVar, VideoMinimizableDiscoverySideEffect.e.b.a)) {
                                cys cysVar = videoMinimizableDiscoveryFragment.Y;
                                if (cysVar != null) {
                                    VkButton vkButton = cysVar.f.b;
                                    vkButton.setText(R.string.video_fullscreen_unlock_button_label);
                                    vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_lock_outline_16));
                                    vkButton.setClickable(true);
                                    d3m.c(vkButton, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new uv6(i2, vkButton, cysVar), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                            } else {
                                if (!epx.f(eVar, VideoMinimizableDiscoverySideEffect.e.a.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cys cysVar2 = videoMinimizableDiscoveryFragment.Y;
                                if (cysVar2 != null) {
                                    cysVar2.b();
                                }
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.b) {
                            dgs0 dgs0Var = videoMinimizableDiscoveryFragment.i0;
                            if (dgs0Var != null) {
                                Context context4 = dgs0Var.a;
                                io.reactivex.rxjava3.disposables.c cVar8 = dgs0Var.d;
                                if (cVar8 != null) {
                                    cVar8.dispose();
                                }
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                asu0 asu0Var = asu0.a;
                                asu0Var.getClass();
                                dgs0Var.d = io.reactivex.rxjava3.core.a.s(5000L, timeUnit, asu0.i()).o(asu0Var.d()).subscribe(new ig4(dgs0Var, 7));
                                ikv0.d dVar = new ikv0.d(context4.getString(R.string.video_error_occurred_try_later), (String) null, (ikv0.d.a) null, 6);
                                if (dgs0Var.b != null) {
                                    ikv0.d dVar2 = dgs0Var.c;
                                    if (dVar2 != null) {
                                        dVar2.a.k(dVar.a());
                                    }
                                } else {
                                    dgs0Var.c = dVar;
                                    dhr0.a.getClass();
                                    ikv0.a aVar6 = new ikv0.a(dhr0.t(context4));
                                    aVar6.e = -1L;
                                    aVar6.u = dVar;
                                    aVar6.l = 80;
                                    aVar6.h = new whg0(dgs0Var, 19);
                                    HashSet hashSet3 = iah0.a;
                                    if (fnj.b(context4)) {
                                        aVar6.k = 1;
                                        aVar6.g(81);
                                    }
                                    dgs0Var.b = pkv0.f(aVar6);
                                }
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.l0) {
                            Context mo2getContext = videoMinimizableDiscoveryFragment.mo2getContext();
                            if (mo2getContext != null) {
                                ((VideoAdFreeSubscriptionComponent) videoMinimizableDiscoveryFragment.ko().h.getValue()).E2().a(((VideoMinimizableDiscoverySideEffect.l0) videoMinimizableDiscoverySideEffect).a, mo2getContext);
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.w) {
                            videoMinimizableDiscoveryFragment.qo((VideoMinimizableDiscoverySideEffect.w) videoMinimizableDiscoverySideEffect);
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.f) {
                            ((VideoAdFreeSubscriptionComponent) videoMinimizableDiscoveryFragment.ko().h.getValue()).h1().b(videoMinimizableDiscoveryFragment.requireContext(), "https://vk.ru/vkpremium");
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.o) {
                            ((VideoAdFreeSubscriptionComponent) videoMinimizableDiscoveryFragment.ko().h.getValue()).h1().b(videoMinimizableDiscoveryFragment.requireContext(), ((VideoMinimizableDiscoverySideEffect.o) videoMinimizableDiscoverySideEffect).a);
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.n) {
                            maz.c(((BridgeComponent) videoMinimizableDiscoveryFragment.ko().g.getValue()).p().e(), videoMinimizableDiscoveryFragment.requireContext(), ((VideoMinimizableDiscoverySideEffect.n) videoMinimizableDiscoverySideEffect).a, LaunchContext.A, null, null, 24);
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.a) {
                            if (((VideoAdvertisementsComponent) videoMinimizableDiscoveryFragment.ko().E.getValue()).a8().a(videoMinimizableDiscoveryFragment.requireContext(), ((VideoMinimizableDiscoverySideEffect.a) videoMinimizableDiscoverySideEffect).a)) {
                                xn50.a.c(videoMinimizableDiscoveryFragment, c.h.b);
                            }
                        } else if (videoMinimizableDiscoverySideEffect.equals(VideoMinimizableDiscoverySideEffect.y.a)) {
                            if (videoMinimizableDiscoveryFragment.mo2getContext() != null) {
                                ((CastComponent) videoMinimizableDiscoveryFragment.ko().e.getValue()).L7().getClass();
                            }
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.x) {
                            videoMinimizableDiscoveryFragment.lo((VideoMinimizableDiscoverySideEffect.x) videoMinimizableDiscoverySideEffect);
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.k) {
                            ((DonutVideoComponent) videoMinimizableDiscoveryFragment.ko().J.getValue()).Qa().a(videoMinimizableDiscoveryFragment.requireContext(), ((VideoMinimizableDiscoverySideEffect.k) videoMinimizableDiscoverySideEffect).a);
                        } else if (videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.r) {
                            ydt0 Y2 = fxc0.B().Y();
                            videoMinimizableDiscoveryFragment.kn();
                            VideoMinimizableScreenArgs videoMinimizableScreenArgs = ((VideoMinimizableDiscoverySideEffect.r) videoMinimizableDiscoverySideEffect).a;
                            Y2.getClass();
                        } else {
                            if (!(videoMinimizableDiscoverySideEffect instanceof VideoMinimizableDiscoverySideEffect.m)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            VideoMinimizableDiscoverySideEffect.m mVar16 = (VideoMinimizableDiscoverySideEffect.m) videoMinimizableDiscoverySideEffect;
                            ClipsRouter.c(g620.f().a(), videoMinimizableDiscoveryFragment.kn(), mVar16.a, null, mVar16.b, null, null, null, true, null, 1908);
                        }
                    }
                }
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String string;
        String string2;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                StoryTemplatesContainerData storyTemplatesContainerData = (StoryTemplatesContainerData) obj;
                ((rjm0) obj2).a.c(storyTemplatesContainerData.c);
                List<StoryTemplateData> list = storyTemplatesContainerData.d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ejm0.a((StoryTemplateData) it.next()));
                }
                return arrayList;
            case 1:
                r4n0.this.e(new s4n0(new qr60.a.d(true)));
                return s3q0.a;
            case 2:
                ((tdu) obj).b(((Number) ((mtk0) obj2).getValue()).floatValue());
                return s3q0.a;
            case 3:
                zfp0 zfp0Var = (zfp0) obj2;
                bpn0 bpn0Var = zfp0Var.n1;
                ?? r2 = zfp0Var.i1;
                agp0 agp0Var = (agp0) obj;
                int i2 = zfp0.x1;
                if (epx.f(agp0Var, agp0.a.a)) {
                    zfp0Var.dismiss();
                } else if (agp0Var instanceof agp0.d) {
                    kbj0.e(((BridgeComponent) r2.getValue()).h8(), zfp0Var.kn(), new AudioAttachment(((agp0.d) agp0Var).a), false, null, zfp0Var.requireArguments().getBoolean("FORCE_DARK_THEME", false), null, 44);
                } else if (agp0Var instanceof agp0.c) {
                    agp0.c cVar = (agp0.c) agp0Var;
                    ((BridgeComponent) r2.getValue()).Le().m(zfp0Var.kn(), cVar.a, zfp0Var.requireArguments().getBoolean("FORCE_DARK_THEME", false), cVar.b);
                } else if (agp0Var instanceof agp0.b) {
                    y050 U = ((BridgeComponent) r2.getValue()).Le().U();
                    FragmentActivity kn = zfp0Var.kn();
                    agp0.b bVar = (agp0.b) agp0Var;
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = bVar.b;
                    AlbumLink albumLink = bVar.a;
                    U.a(kn, new y050.b.C4065b(albumLink.c, albumLink.b, albumLink.d, musicPlaybackLaunchContext.t(), null, musicPlaybackLaunchContext.Gb(), 48));
                } else if (agp0Var instanceof agp0.g) {
                    MusicTrack co = zfp0.co(zfp0Var.requireArguments());
                    String str = zfp0.bo(zfp0Var.requireArguments()) instanceof MusicBottomSheetLaunchPoint.Player ? "player_track_menu" : "track_menu";
                    boolean d = ob50.d(co);
                    int i3 = co.V;
                    if (d) {
                        com.vk.music.notifications.restriction.a aVar = k840.a.d;
                        (aVar != null ? aVar : null).g(co);
                    } else {
                        if (jnj.g(i3)) {
                            u2b0 u2b0Var = (u2b0) bpn0Var.getValue();
                            String str2 = co.d;
                            StartPlaySimilarTracksSource startPlaySimilarTracksSource = new StartPlaySimilarTracksSource(new PlaySourceMeta.SimilarTrackPlaySourceMeta(str2 != null ? str2 : "", co.Fb(), jnj.g(i3)));
                            MusicPlaybackLaunchContext zb = MusicPlaybackLaunchContext.F.zb();
                            zb.b.putString("__META_LAUNCH_POINT", str);
                            u2b0Var.N0(new lqk0(startPlaySimilarTracksSource, (MusicTrack) null, (List) null, zb.Cb(jnj.a(i3)), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
                        } else {
                            u2b0 u2b0Var2 = (u2b0) bpn0Var.getValue();
                            Bundle arguments = zfp0Var.getArguments();
                            String str3 = (arguments == null || (string2 = arguments.getString("BLOCK_ID")) == null) ? "" : string2;
                            Bundle arguments2 = zfp0Var.getArguments();
                            String str4 = (arguments2 == null || (string = arguments2.getString("SECTION_ID")) == null) ? "" : string;
                            String Hb = co.Hb();
                            String str5 = co.d;
                            StartPlayVkMixSource startPlayVkMixSource = new StartPlayVkMixSource(str3, str4, "track_mix", false, str5 == null ? "" : str5, null, Hb, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE, null);
                            MusicPlaybackLaunchContext zb2 = MusicPlaybackLaunchContext.F.zb();
                            zb2.b.putString("__META_LAUNCH_POINT", str);
                            u2b0Var2.N0(new lqk0((StartPlaySource) startPlayVkMixSource, (MusicTrack) null, (List) null, zb2, (int) (0 == true ? 1 : 0), (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
                        }
                    }
                } else if (agp0Var instanceof agp0.f) {
                    maz.c(((BridgeComponent) r2.getValue()).p().e(), zfp0Var.kn(), ((agp0.f) agp0Var).a, LaunchContext.A, null, null, 24);
                } else {
                    if (!(agp0Var instanceof agp0.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i0q0.f(new i3r(zfp0Var.kn(), 2));
                }
                return s3q0.a;
            case 4:
                return ((isq0) obj2).b.e(new awq0((qr60.a) obj));
            case 5:
                hyq0 hyq0Var = (hyq0) obj2;
                hyq0Var.T(new iyq0.c(hyq0Var.i));
                return s3q0.a;
            case 6:
                ((ubr0) obj2).c.n(JsApiMethodType.SHOW_REQUEST_BOX, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("success", true));
                return s3q0.a;
            case 7:
                return a(obj);
            case 8:
                kkt0 kkt0Var = (kkt0) obj2;
                ?? r1 = kkt0Var.f;
                bpn0 bpn0Var2 = kkt0Var.l;
                List list2 = (List) obj;
                kkt0Var.a();
                Activity activity = kkt0Var.a;
                kkt0.b bVar2 = kkt0Var.b;
                kkt0Var.i.dismiss();
                if (!list2.isEmpty()) {
                    kkt0Var.d.invoke();
                    String str6 = bVar2.g;
                    UserId userId = bVar2.c;
                    if (str6 == null) {
                        vyd.d dVar = new vyd.d(new VideoToClipInput((ClipsProcessedItem) list2.get(0), new VideoToClipInfo(userId.b, bVar2.d, false, false)), (MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint) bpn0Var2.getValue(), false);
                        dhr0.a.getClass();
                        ((vyd) r1.getValue()).a(activity, dVar, new vyd.c(dhr0.u().c, 12, null));
                    } else {
                        vyd.b bVar3 = new vyd.b(Collections.singletonList((ClipsProcessedItem) list2.get(0)), (MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint) bpn0Var2.getValue(), null, null, str6);
                        dhr0.a.getClass();
                        vyd.c cVar2 = new vyd.c(dhr0.u().c, 12, null);
                        ((rhd) kkt0Var.h.getValue()).h(chd.a.a(userId), false);
                        ((vyd) r1.getValue()).e(activity, bVar3, cVar2, new ClipsEditorSessionParams(null, false, false, false, null, false, 63, null));
                    }
                }
                return s3q0.a;
            case 9:
                qst0 qst0Var = (qst0) obj2;
                maz.c(xwk.d().e(), ((View) obj).getContext(), qst0Var.i, LaunchContext.A, null, null, 24);
                qst0Var.d();
                return s3q0.a;
            case 10:
                ffv0 ffv0Var = (ffv0) obj2;
                if (!ffv0Var.p1) {
                    ew3 ew3Var = ffv0Var.n1;
                    (ew3Var != null ? ew3Var : null).invoke();
                }
                ffv0Var.p1 = false;
                ffv0Var.dismiss();
                return s3q0.a;
            case 11:
                jew0.a aVar2 = jew0.a.a;
                lew0 lew0Var = ((nfw0) obj2).b.b;
                lew0Var.getClass();
                lew0Var.c.a.onNext(aVar2);
                return s3q0.a;
            case 12:
                rw0 rw0Var = (rw0) obj2;
                CatalogSectionResponseObjectDto catalogSectionResponseObjectDto = (CatalogSectionResponseObjectDto) obj;
                CatalogSectionDto E2 = catalogSectionResponseObjectDto.E2();
                String id = E2 != null ? E2.getId() : null;
                CatalogSectionDto E22 = catalogSectionResponseObjectDto.E2();
                return new xiw0(id, E22 != null ? E22.l() : null, ((wiw0) rw0Var.b).a(catalogSectionResponseObjectDto.X1(), catalogSectionResponseObjectDto.G()));
            case 13:
                ylw0 ylw0Var = (ylw0) obj2;
                int i4 = ylw0.x1;
                tlw0.c.a aVar3 = tlw0.c.a.b;
                ylw0Var.getClass();
                xn50.a.c(ylw0Var, aVar3);
                return s3q0.a;
            case 14:
                ((nrw0) obj2).q(xcw0.l.a);
                return s3q0.a;
            case 15:
                Object obj3 = VoipService.q;
                ((VoipService) obj2).h();
                return s3q0.a;
            default:
                int i5 = y5x0.l1;
                ((f6x0) obj2).n.onNext(f6x0.b.NO_VMOJI);
                return s3q0.a;
        }
    }
}
