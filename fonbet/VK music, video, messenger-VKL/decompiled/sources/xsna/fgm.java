package xsna;

import android.content.Context;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$1;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.mediapicker.impl.presentation.fragment.MediaPickerFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.profile.community.members.impl.ui.a;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import xsna.c7q;
import xsna.e3m;
import xsna.fn20;
import xsna.g8i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fgm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fgm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$3;
        yh90 yh90Var;
        switch (this.b) {
            case 0:
                Context context = ((ggm) this.c).d;
                e3m.a aVar = e3m.a;
                return m33.a(R.drawable.ic_call_badge_inactive_26, context);
            case 1:
                ((io.reactivex.rxjava3.disposables.c) this.c).dispose();
                return s3q0.a;
            case 2:
                ((h3o) this.c).q6();
                return s3q0.a;
            case 3:
                EcosystemProfileView ecosystemProfileView = (EcosystemProfileView) this.c;
                int i = EcosystemProfileView.m;
                return ((MultiAccountComponent) ((k7m) m7m.c(ecosystemProfileView)).a(fpf0.a(MultiAccountComponent.class))).c();
            case 4:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((EmptyPlaylistBottomSheet) this.c)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 5:
                return ((mqp) this.c).b();
            case 6:
                l5q l5qVar = (l5q) this.c;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_PLAYER_STAT;
                videoFeatures.getClass();
                if (!com.vk.toggle.b.A.a(videoFeatures)) {
                    return null;
                }
                c7q c7qVar = new c7q();
                androidx.media3.exoplayer.c cVar = l5qVar.c;
                c7q.b bVar = c7qVar.k;
                if (!epx.f(c7qVar.a, cVar)) {
                    c7qVar.d(c7qVar.a);
                    c7qVar.b = null;
                    c7qVar.c = null;
                    androidx.media3.exoplayer.c cVar2 = c7qVar.a;
                    if (cVar2 != null) {
                        cVar2.l(bVar);
                    }
                    if (cVar != null) {
                        cVar.c(bVar);
                    }
                    c7qVar.a = cVar;
                }
                return c7qVar;
            case 7:
                return new FeatureScopesKt$createFeatureScope$scope$1.a((yzs) this.c);
            case 8:
                return z9r.a(((u7r) this.c).a, "Can not ensure file ");
            case 9:
                return new b1s((a1w) this.c);
            case 10:
                FriendsFragment friendsFragment = (FriendsFragment) this.c;
                int i2 = FriendsFragment.q0;
                friendsFragment.Mf(0, null);
                return s3q0.a;
            case 11:
                mss mssVar = (mss) this.c;
                return new g2r0(mssVar.d, mssVar.f.a.T().m());
            case 12:
                GeoPostsFragment geoPostsFragment = (GeoPostsFragment) this.c;
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return geoPostsFragment.getActivity();
            case 13:
                invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3((HandleInvocationsFromAdViewer) this.c);
                return invoke$lambda$3;
            case 14:
                return "    timeoutMs = " + ((g8i.a) this.c).b;
            case 15:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                g7s0 B = fxc0.B();
                AttachWithVideo attachWithVideo = gVar.q;
                B.d((attachWithVideo != null ? attachWithVideo : null).A());
                return s3q0.a;
            case 16:
                ImSelectContactsFragment imSelectContactsFragment = (ImSelectContactsFragment) this.c;
                int i3 = ImSelectContactsFragment.v0;
                VkTopBar vkTopBar = imSelectContactsFragment.Q;
                if (vkTopBar == null) {
                    vkTopBar = null;
                }
                if (vkTopBar.getMiddle() instanceof VkTopBar.Middle.d) {
                    imSelectContactsFragment.ho();
                } else {
                    imSelectContactsFragment.Mf(0, null);
                }
                return s3q0.a;
            case 17:
                c7x c7xVar = (c7x) this.c;
                c7xVar.g();
                sal salVar = (sal) c7xVar.l.getValue();
                synchronized (salVar) {
                    try {
                        if (!salVar.e) {
                            Iterator it = salVar.c.values().iterator();
                            while (it.hasNext()) {
                                ((ScheduledExecutorService) it.next()).shutdownNow();
                            }
                            ((ScheduledExecutorService) salVar.d.getValue()).shutdownNow();
                            salVar.e = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it2 = salVar.c.values().iterator();
                while (it2.hasNext()) {
                    ((ScheduledExecutorService) it2.next()).awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
                }
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) salVar.d.getValue();
                TimeUnit timeUnit = TimeUnit.DAYS;
                scheduledExecutorService.awaitTermination(Long.MAX_VALUE, timeUnit);
                ExecutorService executorService = (ExecutorService) c7xVar.k.getValue();
                executorService.shutdownNow();
                executorService.awaitTermination(Long.MAX_VALUE, timeUnit);
                uml umlVar = c7xVar.g;
                synchronized (umlVar) {
                    if (!umlVar.b) {
                        umlVar.a.close();
                        umlVar.b = true;
                    }
                }
                c7xVar.r.countDown();
                return s3q0.a;
            case 18:
                return ((l4y) this.c).o(VkWorkoutBridgeDelegatesFactory.DelegateType.GET_WORKOUTS_GF);
            case 19:
                return new c5y((r6y) this.c);
            case 20:
                x7y x7yVar = (x7y) this.c;
                Long[] lArr = x7y.n;
                xwv0 xwv0Var = x7yVar.d;
                return Boolean.valueOf(rl3.G(lArr, xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null));
            case 21:
                return Boolean.valueOf(((i8z) this.c).p);
            case 22:
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) this.c)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 23:
                return ((BridgeComponent) m7m.d((ee10) this.c).a(fpf0.a(BridgeComponent.class))).p().e();
            case 24:
                MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this.c;
                int i4 = MediaPickerFragment.Q;
                mediaPickerFragment.fo().k();
                return s3q0.a;
            case 25:
                ((z37) this.c).b(a.j.b);
                return s3q0.a;
            case 26:
                n620 n620Var = (n620) this.c;
                r620 g = n620Var.g();
                return (g == null || (yh90Var = (yh90) g.f.getValue()) == null) ? ((arh0) n620Var.e.getValue()).W(new irh0(false, false, 495)) : yh90Var;
            case 27:
                fn20.a aVar2 = (fn20.a) this.c;
                ((zak0) aVar2.b).setValue(Boolean.valueOf(true ^ aVar2.a()));
                return s3q0.a;
            case 28:
                return h5s.c(((lj30) this.c).c, " found in msghistory but not in msgs", new StringBuilder("Msg "));
            default:
                return Integer.valueOf(e3m.a(R.dimen.vkim_external_video_restriction_icon_size, ((fq30) this.c).t()));
        }
    }
}
