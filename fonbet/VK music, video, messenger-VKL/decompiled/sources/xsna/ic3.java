package xsna;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.dto.newsfeed.entries.RecommendedMiniAppEntry;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.instantjobs.components.appstate.AppState;
import com.vk.video.profile.presentation.catalog.pager.VideoLargeSliderHorizontalPagerVh;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import ru.ok.android.webrtc.protocol.screenshare.send.ScreenshareSender;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.gestures.TensorflowGestureDetector;
import xsna.wch0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ic3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ic3(Context context, n67 n67Var) {
        this.b = 1;
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        RecommendedMiniAppEntry q6;
        WebApiApplication webApiApplication;
        switch (this.b) {
            case 0:
                jc3 jc3Var = (jc3) this.c;
                Iterator it = jc3Var.j.iterator();
                while (it.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) it.next();
                    boolean z = recyclerView.getParent() == null || !recyclerView.isAttachedToWindow();
                    if (z) {
                        recyclerView.removeOnScrollListener(jc3Var.i);
                    }
                    if (z) {
                        it.remove();
                    }
                }
                return;
            case 1:
                Context context = (Context) this.c;
                ca70 ca70Var = ca70.a;
                ca70.f(context);
                Iterator it2 = o970.b.e(((NotificationManager) context.getSystemService("notification")).getActiveNotifications()).iterator();
                while (it2.hasNext()) {
                    n67.c((Map) it2.next());
                }
                return;
            case 2:
                ((w2d) this.c).b(wch0.a.a);
                return;
            case 3:
                ((izs) this.c).invoke(ClipsDraftPersistentStore.b);
                return;
            case 4:
                com.vk.ads.core.a aVar = (com.vk.ads.core.a) this.c;
                Iterator<T> it3 = aVar.a.iterator();
                while (it3.hasNext()) {
                    ((kuc0) it3.next()).b(aVar.c);
                }
                return;
            case 5:
                oal oalVar = (oal) this.c;
                synchronized (oalVar) {
                    AppState appState = AppState.IDLE;
                    synchronized (oalVar) {
                        AppState appState2 = oalVar.h;
                        if (appState2 != appState) {
                            oalVar.h = appState;
                            oal.j();
                            oal.i();
                            oalVar.h(appState, oal.d(appState2, appState));
                            s3q0 s3q0Var = s3q0.a;
                            oal.j.post(new nal(oalVar, appState));
                        }
                    }
                    return;
                }
                return;
            case 6:
                hq20 hq20Var = (hq20) this.c;
                View view = hq20Var.itemView;
                Rect rect = hq20Var.L;
                boolean isShown = view.isShown();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (isShown && view.getGlobalVisibleRect(rect)) {
                    int height = view.getHeight() * view.getWidth();
                    if (height != 0) {
                        f = (rect.height() * rect.width()) / height;
                    }
                }
                if (hq20Var.q6() != null) {
                    RecommendedMiniAppEntry q62 = hq20Var.q6();
                    if ((q62 == null || (webApiApplication = q62.m) == null || webApiApplication.b != 0) && f >= hq20Var.J && (q6 = hq20Var.q6()) != null) {
                        int intValue = ((Number) hq20Var.C.z.getValue()).intValue();
                        if (!epx.f(q6.i, "recommended_game") || q6.s) {
                            return;
                        }
                        RecommendedMiniAppEntry q63 = hq20Var.q6();
                        if (q63 != null) {
                            q63.s = true;
                        }
                        hq20Var.R6(q6, Integer.valueOf(intValue));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                Tensorflow tensorflow = bVar.M;
                if (tensorflow != null) {
                    tensorflow.release();
                }
                bVar.M = null;
                TensorflowGestureDetector tensorflowGestureDetector = bVar.N;
                if (tensorflowGestureDetector != null) {
                    tensorflowGestureDetector.release();
                }
                bVar.N = null;
                return;
            case 8:
                ((CountDownLatch) this.c).countDown();
                return;
            case 9:
                ((ScreenshareSender) this.c).b();
                return;
            case 10:
                ((Tensorflow) this.c).lambda$handlePrepare$6();
                return;
            case 11:
                VideoLargeSliderHorizontalPagerVh videoLargeSliderHorizontalPagerVh = (VideoLargeSliderHorizontalPagerVh) this.c;
                videoLargeSliderHorizontalPagerVh.w();
                hbt0 hbt0Var = videoLargeSliderHorizontalPagerVh.A;
                if (hbt0Var != null) {
                    hbt0Var.n();
                    return;
                }
                return;
            case 12:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) this.c;
                Activity d = pVar.d();
                if (d != null) {
                    pVar.j.b(d);
                }
                pVar.I(false);
                return;
            case 13:
                ((ihu0) this.c).d.m(true);
                return;
            case 14:
                VkMediaPicker.setState$lambda$0((VkMediaPicker) this.c);
                return;
            default:
                bzy0 bzy0Var = (bzy0) this.c;
                long j = bzy0Var.h - 200;
                bzy0Var.h = j;
                if (j <= 0) {
                    bzy0Var.a();
                    return;
                } else {
                    bzy0Var.b();
                    return;
                }
        }
    }

    public /* synthetic */ ic3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
