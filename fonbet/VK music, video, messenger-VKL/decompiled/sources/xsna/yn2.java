package xsna;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.ViewPropertyAnimator;
import androidx.core.widget.NestedScrollView;
import com.ironsource.B2;
import com.ironsource.adapters.vungle.banner.VungleBannerAdapter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.player.video.view.SimpleVideoView;
import java.lang.ref.SoftReference;
import xsna.l2f;
import xsna.qmu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yn2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yn2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o2f o2fVar;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator listener;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                B2.e((B2) obj);
                break;
            case 2:
                ((NestedScrollView) obj).f(33);
                break;
            case 3:
                l2f.a aVar = (l2f.a) obj;
                l2f l2fVar = aVar.f;
                if (l2fVar != null) {
                    SpinnerState spinnerState = SpinnerState.Loading;
                    o2f o2fVar2 = l2fVar.h;
                    if (o2fVar2 != null) {
                        o2fVar2.setSpinnerState(spinnerState);
                    }
                }
                l2f l2fVar2 = aVar.f;
                if (l2fVar2 != null && (o2fVar = l2fVar2.h) != null) {
                    o2fVar.setSubtitle(null);
                    break;
                }
                break;
            case 4:
                w1l w1lVar = (w1l) obj;
                if (((Boolean) w1lVar.c.invoke()).booleanValue()) {
                    w1lVar.d.invoke();
                    break;
                }
                break;
            case 5:
                giu giuVar = (giu) obj;
                giuVar.S = true;
                giuVar.e5();
                break;
            case 6:
                qmu qmuVar = (qmu) obj;
                if (qmuVar.u != null) {
                    qmuVar.u = null;
                    ViewPropertyAnimator animate = qmuVar.t.animate();
                    qmuVar.v = animate;
                    if (animate != null && (alpha = animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (listener = alpha.setListener(new qmu.a(qmuVar))) != null) {
                        listener.start();
                        break;
                    }
                }
                break;
            case 7:
                ((r9v) obj).u();
                break;
            case 8:
                ((ni0) obj).invoke();
                break;
            case 9:
                flz flzVar = (flz) obj;
                if (flzVar != null) {
                    flzVar.resume();
                    break;
                }
                break;
            case 10:
                SimpleVideoView simpleVideoView = SimpleVideoView.this;
                simpleVideoView.J = simpleVideoView.getCurrentPosition();
                Surface surface = simpleVideoView.w;
                if (surface != null) {
                    surface.release();
                    simpleVideoView.w = null;
                }
                simpleVideoView.I = false;
                break;
            case 11:
                SoftReference<Bitmap> softReference = VideoTextureView.r;
                ((izs) obj).invoke(null);
                break;
            case 12:
                VungleBannerAdapter.destroyAd$lambda$2((VungleBannerAdapter) obj);
                break;
            case 13:
                ((ru.mail.libverify.api.q) obj).j();
                break;
            default:
                yads.ya2.a((yads.ya2) obj);
                break;
        }
    }
}
