package xsna;

import android.content.Context;
import android.view.View;
import androidx.media3.transformer.y;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.C4382j6;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.reefton.dto.ReefRequestReason;
import com.vk.reefton.trackers.d;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.sync.online.VkOnlineService;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameEncoderImpl;
import xsna.pg30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yh9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yh9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReefRequestReason reefRequestReason;
        switch (this.b) {
            case 0:
                ((CameraUIView) this.c).B0();
                return;
            case 1:
                FragmentImpl fragmentImpl = (FragmentImpl) this.c;
                qcy<Object>[] qcyVarArr = FragmentImpl.M;
                vbs Ln = fragmentImpl.Ln();
                if (Ln != null) {
                    Ln.c();
                    com.vk.core.fragments.a aVar = Ln.h;
                    if (aVar != null) {
                        aVar.G(fragmentImpl);
                    }
                    Ln.d();
                    return;
                }
                return;
            case 2:
                ((FrameEncoderImpl) this.c).b();
                return;
            case 3:
                ViewPager2 viewPager2 = ((f8u) this.c).r;
                viewPager2.e(viewPager2.getCurrentItem(), false);
                return;
            case 4:
                ((bhl0) ((n3w) this.c).I0()).C().cancel();
                return;
            case 5:
                ((tg30) this.c).a.a(pg30.e.a);
                return;
            case 6:
                com.vk.reefton.trackers.d dVar = (com.vk.reefton.trackers.d) this.c;
                int i = d.b.$EnumSwitchMapping$0[dVar.a.ordinal()];
                if (i == 1) {
                    reefRequestReason = ReefRequestReason.HEARTBEAT_PLAYER;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    reefRequestReason = ReefRequestReason.HEARTBEAT_APP;
                }
                dVar.d.a(dVar, reefRequestReason, System.currentTimeMillis());
                return;
            case 7:
                ((y.b) this.c).a();
                return;
            case 8:
                bwt0.p0((View) this.c, false);
                return;
            case 9:
                StoryFragment storyFragment = (StoryFragment) this.c;
                int i2 = StoryFragment.X;
                storyFragment.eo();
                return;
            case 10:
                ((gzs) this.c).invoke();
                return;
            case 11:
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = (SwipeDrawableRefreshLayout) this.c;
                int[] iArr = SwipeDrawableRefreshLayout.l0;
                swipeDrawableRefreshLayout.q();
                return;
            case 12:
                ((lb6) this.c).invoke();
                return;
            case 13:
                VKCaptchaWebViewActivity vKCaptchaWebViewActivity = (VKCaptchaWebViewActivity) this.c;
                ((hiy0) vKCaptchaWebViewActivity.l.getValue()).show(vKCaptchaWebViewActivity.getFragmentManager(), "NoInternetFragment");
                return;
            case 14:
                VideoTopBarView topBar = ((VideoView) this.c).getTopBar();
                if (topBar != null) {
                    topBar.setVisibility(4);
                    return;
                }
                return;
            case 15:
                VkOnlineService vkOnlineService = (VkOnlineService) this.c;
                bpn0 bpn0Var = VkOnlineService.f;
                synchronized (vkOnlineService) {
                    try {
                        if (((Boolean) VkOnlineService.g.getValue()).booleanValue()) {
                            if (VkOnlineService.h == null) {
                                wyk0 wyk0Var = new wyk0();
                                VkOnlineService.h = wyk0Var;
                                wyk0Var.a();
                            }
                        } else if (vkOnlineService.d == null) {
                            wyk0 wyk0Var2 = new wyk0();
                            vkOnlineService.d = wyk0Var2;
                            wyk0Var2.a();
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 16:
                WriteBar.a((WriteBar) this.c);
                return;
            case 17:
                ru.mail.libverify.d0.a.b((Context) this.c);
                return;
            default:
                C4382j6.e((C4382j6) this.c);
                return;
        }
    }
}
