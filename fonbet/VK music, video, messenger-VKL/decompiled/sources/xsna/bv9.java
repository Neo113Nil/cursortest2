package xsna;

import android.app.ProgressDialog;
import android.view.View;
import android.view.Window;
import androidx.media3.exoplayer.video.VideoSink;
import com.ironsource.C4618w9;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.util.RecreateActivity;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.im.design.view.pagination.pin.ImMultiPinView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.newsfeed.impl.fragments.ModalReactionsFragment;
import com.vk.photoviewer.PhotoViewPager;
import com.vk.toggle.features.VideoFeatures;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.webrtc.ScreenCapturerAndroid;
import ru.ok.media.PublisherImpl;
import xsna.cv9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bv9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bv9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikv0 ikv0Var;
        yg5 yg5Var;
        switch (this.b) {
            case 0:
                cv9 cv9Var = (cv9) this.c;
                View view = cv9Var.d;
                if (view != null) {
                    cv9Var.e = cv9.a.DRAGGING;
                    cv9Var.b.c(view);
                    return;
                }
                return;
            case 1:
                ((irb) this.c).j = true;
                return;
            case 2:
                com.vk.clips.editor.templates.impl.player.a.j((com.vk.clips.editor.templates.impl.player.a) this.c);
                return;
            case 3:
                ((ImMultiPinView) this.c).f.setPressed(false);
                return;
            case 4:
                xo2.f(((MarketItemReviewRepliesFragment) this.c).W, false, true, 300L);
                return;
            case 5:
                ModalReactionsFragment modalReactionsFragment = (ModalReactionsFragment) this.c;
                int i = ModalReactionsFragment.G0;
                modalReactionsFragment.no();
                return;
            case 6:
                kz30 kz30Var = (kz30) this.c;
                kz30.M(kz30Var.M);
                kz30.K(kz30Var.N);
                return;
            case 7:
                NetworkPerformanceMeasurer.a aVar = (NetworkPerformanceMeasurer.a) this.c;
                ArrayList arrayList = NetworkPerformanceMeasurer.l;
                synchronized (arrayList) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((WeakReference) it.next()).get(), aVar)) {
                            it.remove();
                            return;
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
            case 8:
                PhotoViewPager photoViewPager = (PhotoViewPager) this.c;
                int i2 = PhotoViewPager.c;
                if (photoViewPager.isFakeDragging()) {
                    return;
                }
                photoViewPager.beginFakeDrag();
                if (photoViewPager.isFakeDragging()) {
                    photoViewPager.endFakeDrag();
                    return;
                }
                return;
            case 9:
                ((VideoSink.a) this.c).d();
                return;
            case 10:
                ((enc0) this.c).m.s();
                return;
            case 11:
                b2e0 b2e0Var = (b2e0) this.c;
                try {
                    ProgressDialog progressDialog = b2e0Var.c;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                } catch (Exception unused) {
                }
                b2e0Var.c = null;
                return;
            case 12:
                ((PublisherImpl) this.c).lambda$pause$3();
                return;
            case 13:
                try {
                    ((gzs) this.c).invoke();
                    return;
                } catch (Throwable th) {
                    L.i(new RecreateActivity.b(th));
                    com.vk.metrics.eventtracking.b.a.q(new RecreateActivity.b(th));
                    return;
                }
            case 14:
                ogn ognVar = (ogn) ((Ref$ObjectRef) this.c).element;
                if (ognVar != null) {
                    ognVar.dispose();
                    return;
                }
                return;
            case 15:
                ((ScreenCapturerAndroid) this.c).updateVirtualDisplay();
                return;
            case 16:
                nbm0 nbm0Var = (nbm0) this.c;
                Window y = s200.y(nbm0Var.a);
                if (y == null || (ikv0Var = nbm0Var.f) == null) {
                    return;
                }
                ikv0Var.d(y);
                return;
            case 17:
                x9n0 x9n0Var = (x9n0) this.c;
                int i3 = x9n0.p1;
                x9n0Var.On(3);
                return;
            case 18:
                VideoView videoView = (VideoView) this.c;
                yg5 yg5Var2 = videoView.I;
                if (yg5Var2 != null && !yg5Var2.a() && (((yg5Var = videoView.I) == null || !yg5Var.P0()) && !videoView.O)) {
                    d3m.e(videoView.getViewBinding().h, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                    d3m.c(videoView.getViewBinding().f, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                    videoFeatures.getClass();
                    com.vk.toggle.b.A.a(videoFeatures);
                    d3m.e(videoView.getViewBinding().w, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                    if (videoView.getViewBinding().z.getSkipBackListener() != null) {
                        d3m.e(videoView.getViewBinding().x, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                    }
                    if (videoView.getViewBinding().z.getSkipForwardListener() != null) {
                        d3m.e(videoView.getViewBinding().y, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                    }
                }
                videoView.n0 = null;
                return;
            case 19:
                yads.ul2.a((yads.ul2) this.c);
                return;
            default:
                C4618w9.c((C4618w9) this.c);
                return;
        }
    }
}
