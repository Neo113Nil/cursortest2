package xsna;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.background.controller.VideoBackgroundAudioTrackOnlyController;
import com.vk.libvideo.autoplay.background.controller.d;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stickers.views.animation.VKAnimationView;
import one.video.player.OneVideoPlayer;
import xsna.kms0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class n44 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n44(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d3b0 d3b0Var;
        OneVideoPlayer a;
        switch (this.b) {
            case 0:
                com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) this.c;
                aVar.f.setVisibility(0);
                aVar.j.X(4);
                if (aVar.j.M == 4) {
                    aVar.Z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    aVar.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
                break;
            case 1:
                Runnable runnable = ((kk9) this.c).l;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                ((kms0.c) this.c).f();
                break;
            case 3:
                ((com.vk.attachpicker.fragment.gallery.c) this.c).m = true;
                break;
            case 4:
                h03.b((Throwable) this.c);
                break;
            case 5:
                p6f0 p6f0Var = (p6f0) this.c;
                m3r m3rVar = p6f0Var.a;
                gzs<s3q0> gzsVar = p6f0Var.e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                bwt0.p0(m3rVar, false);
                m3rVar.setSelectedReactionPosition(-1);
                for (f3r f3rVar : p6f0Var.b.getReactionViews()) {
                    f3rVar.e();
                    f3rVar.c();
                }
                p6f0Var.a.setPopupHideInProgress$design_release(false);
                p6f0Var.d.b();
                break;
            case 6:
                View view = (View) this.c;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 7:
                bwt0.p0((VKAnimationView) this.c, false);
                break;
            case 8:
                ayn0 ayn0Var = (ayn0) this.c;
                RecyclerView recyclerView = ayn0Var.a;
                if (!recyclerView.isComputingLayout()) {
                    kt9 kt9Var = ayn0Var.f;
                    if (kt9Var != null) {
                        recyclerView.removeItemDecoration(kt9Var);
                    }
                    kt9 kt9Var2 = new kt9(recyclerView, new zxn0(), !(ayn0Var.e >= 924));
                    kt9Var2.m = false;
                    recyclerView.addItemDecoration(kt9Var2);
                    ayn0Var.f = kt9Var2;
                    break;
                }
                break;
            case 9:
                VideoBackgroundAudioTrackOnlyController videoBackgroundAudioTrackOnlyController = (VideoBackgroundAudioTrackOnlyController) this.c;
                yg5 b = videoBackgroundAudioTrackOnlyController.b.b();
                VideoAutoPlay videoAutoPlay = b instanceof VideoAutoPlay ? (VideoAutoPlay) b : null;
                if (videoAutoPlay != null && (d3b0Var = videoAutoPlay.p0) != null && (a = d3b0Var.a()) != null) {
                    boolean z = videoAutoPlay.l0 instanceof mv70;
                    boolean z2 = videoAutoPlay.Z0().c;
                    PlayerType playerType = videoAutoPlay.Z0().p;
                    boolean x5 = videoAutoPlay.u.x5();
                    boolean W9 = videoAutoPlay.u.W9();
                    boolean I6 = videoAutoPlay.u.I6();
                    AutoPlayMinifiedState R0 = videoAutoPlay.R0();
                    boolean J0 = videoAutoPlay.J0();
                    boolean P0 = videoAutoPlay.P0();
                    OneVideoPlayer.State state = a.getState();
                    if (videoBackgroundAudioTrackOnlyController.d.a(new d.a(z2, x5, W9, I6, P0, playerType, R0))) {
                        if ((J0 || state == OneVideoPlayer.State.PLAYING) && !z && videoBackgroundAudioTrackOnlyController.c.d()) {
                            videoAutoPlay.N1(a);
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.i, new Object[]{"VideoBackgroundAudioTrackOnly videoTrack disabled for " + a.N()});
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ((ru.mail.libverify.j0.j) this.c).b();
                break;
        }
    }
}
