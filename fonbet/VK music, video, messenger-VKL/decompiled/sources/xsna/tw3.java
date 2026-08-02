package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.exoplayer.video.VideoSink;
import com.ironsource.C4618w9;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.dynamic_loader.b;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.media.ok.recording.GesturedRecording;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.api.MusicPlayerServiceComponent;
import com.vk.music.broadcast.BecomingNoisyReceiver;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.settings.ManageSpaceActivity;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.data.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.chromium.net.impl.CronetUrlRequest;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.gl.effects.media.controller.video.MoviePlayer;
import xsna.dv9;
import xsna.dy4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class tw3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tw3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        StoryBottomViewGroup storyBottomViewGroup;
        yg5 yg5Var;
        yg5 yg5Var2;
        boolean z = false;
        switch (this.b) {
            case 0:
                ((vw3) this.c).d();
                break;
            case 1:
                dv9 dv9Var = (dv9) this.c;
                View view = dv9Var.d;
                if (view != null) {
                    dv9Var.e = dv9.a.DRAGGING;
                    dv9Var.b.d(view);
                    break;
                }
                break;
            case 2:
                ((com.vk.clips.editor.templates.impl.player.a) this.c).B();
                break;
            case 3:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                View view2 = communityAddressesFragment.Z;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View view3 = communityAddressesFragment.a0;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                View view4 = communityAddressesFragment.Z;
                if (view4 != null) {
                    view4.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                View view5 = communityAddressesFragment.Z;
                if (view5 != null && (animate2 = view5.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null) {
                    alpha2.start();
                }
                View view6 = communityAddressesFragment.a0;
                if (view6 != null) {
                    view6.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                View view7 = communityAddressesFragment.a0;
                if (view7 != null && (animate = view7.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
                    alpha.start();
                    break;
                }
                break;
            case 4:
                ((f8h) this.c).m.requestLayout();
                break;
            case 5:
                ((CronetUrlRequest) this.c).lambda$maybeReportMetrics$1();
                break;
            case 6:
                ((b.e) this.c).r();
                break;
            case 7:
                ((io.reactivex.rxjava3.subjects.d) this.c).onNext(b.AbstractC0762b.c.a);
                break;
            case 8:
                ((b4i) this.c).invoke();
                break;
            case 9:
                GesturedRecording gesturedRecording = (GesturedRecording) this.c;
                if (!gesturedRecording.l && !gesturedRecording.i.s && gesturedRecording.b() == GesturedRecording.Answers.NO) {
                    gesturedRecording.e(true);
                    break;
                }
                break;
            case 10:
                ((ManageSpaceActivity) this.c).T1();
                break;
            case 11:
                nw20 nw20Var = (nw20) this.c;
                nw20Var.x();
                VkBlurView vkBlurView = nw20Var.x0;
                if (vkBlurView != null) {
                    vkBlurView.invalidate();
                }
                if (nw20Var.z0 == null) {
                    nw20Var.r();
                    break;
                }
                break;
            case 12:
                ModalReactionsFragment modalReactionsFragment = (ModalReactionsFragment) this.c;
                int i = ModalReactionsFragment.G0;
                modalReactionsFragment.a0();
                break;
            case 13:
                ((MoviePlayer) this.c).lambda$doExtract$0();
                break;
            case 14:
                MusicSelectorCatalogRootVh musicSelectorCatalogRootVh = (MusicSelectorCatalogRootVh) this.c;
                g3a.a(musicSelectorCatalogRootVh.s, musicSelectorCatalogRootVh);
                break;
            case 15:
                iq50 iq50Var = (iq50) this.c;
                iq50Var.c(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.AD_START_GAME);
                iq50Var.e = true;
                q7r q7rVar = iq50Var.a;
                StoryEntry currentStory = q7rVar.i0.getCurrentStory();
                if (currentStory != null && (storyBottomViewGroup = q7rVar.G) != null) {
                    storyBottomViewGroup.B.m(currentStory, false);
                }
                iq50Var.b(true);
                q7rVar.i0.d1();
                iq50Var.f = true;
                iq50Var.a();
                break;
            case 16:
                ((PeerConnectionClient) this.c).g();
                break;
            case 17:
                ((VideoSink.a) this.c).e();
                break;
            case 18:
                PlayerService.a aVar = (PlayerService.a) this.c;
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b = h5s.b("PLAYER_LOADED");
                b.a(Boolean.FALSE, "music_player_is_null");
                b.b("music_build_version", Integer.valueOf(BuildInfo.e));
                b.f();
                bVar.k(b.e());
                bn40.f("PlayerService Service loaded");
                PlayerService playerService = PlayerService.this;
                boi0 boi0Var = playerService.m;
                if (boi0Var == null) {
                    boi0Var = null;
                }
                ArrayList arrayList = boi0Var.i;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    boi0Var.d((Intent) it.next());
                }
                arrayList.clear();
                playerService.h();
                playerService.l(true);
                dy4 dy4Var = dy4.p;
                e2b0 e2b0Var = playerService.d;
                if (e2b0Var == null) {
                    e2b0Var = null;
                }
                if (dy4Var.b == null) {
                    dy4Var.b = ((MusicPlayerServiceComponent) j6i.b(m7m.f(dy4Var), MusicPlayerServiceComponent.class)).o4();
                }
                dy4Var.b.a(true);
                Context context = e43.a;
                BecomingNoisyReceiver becomingNoisyReceiver = dy4Var.j;
                anj.d(context, becomingNoisyReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), null, 2);
                dy4Var.f = new WeakReference<>(e2b0Var);
                dy4Var.c = e2b0.o0(e2b0Var.u);
                dy4Var.d = e2b0Var.e;
                dy4Var.e = e2b0Var.y.n();
                becomingNoisyReceiver.a = dy4Var;
                dy4.a aVar2 = dy4Var.l;
                pro0.d(aVar2);
                pro0.e(aVar2);
                pro0.e(new ey4(dy4Var));
                dy4.d dVar = dy4Var.o;
                pro0.d(dVar);
                pro0.e(dVar);
                dy4.c cVar = dy4Var.n;
                pro0.d(cVar);
                pro0.e(cVar);
                dy4.b bVar2 = dy4Var.m;
                pro0.d(bVar2);
                pro0.e(bVar2);
                break;
            case 19:
                a2e0 a2e0Var = (a2e0) this.c;
                try {
                    bqu0 bqu0Var = a2e0Var.b;
                    if (bqu0Var != null) {
                        bqu0Var.dismiss();
                    }
                } catch (Exception unused) {
                }
                a2e0Var.b = null;
                break;
            case 20:
                ((HandlerThread) this.c).quit();
                break;
            case 21:
                xoe0 xoe0Var = (xoe0) this.c;
                xoe0Var.z();
                xoe0Var.J.set(true);
                break;
            case 22:
                ((ScreenCapturerAndroid) this.c).lambda$new$0();
                break;
            case 23:
                ((SurfaceTextureHelper) this.c).lambda$returnTextureFrame$5();
                break;
            case 24:
                TextureViewRenderer.notifyTextureSizeChanged$lambda$0((TextureViewRenderer) this.c);
                break;
            case 25:
                ((Toolbar) this.c).m();
                break;
            case 26:
                VideoView videoView = (VideoView) this.c;
                yg5 yg5Var3 = videoView.I;
                if (yg5Var3 != null && !yg5Var3.a() && (((yg5Var = videoView.I) == null || !yg5Var.B()) && ((yg5Var2 = videoView.I) == null || !yg5Var2.J()))) {
                    z = true;
                }
                if (videoView.r0 && !videoView.u0 && !videoView.O && z && !videoView.getMinifiedState().h()) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                    videoFeatures.getClass();
                    com.vk.toggle.b.A.a(videoFeatures);
                    videoView.A0();
                    break;
                }
                break;
            case 27:
                yads.oh0.b((Ref$ObjectRef) this.c);
                break;
            case 28:
                yads.ul2.b((yads.ul2) this.c);
                break;
            default:
                C4618w9.a((C4618w9) this.c);
                break;
        }
    }
}
