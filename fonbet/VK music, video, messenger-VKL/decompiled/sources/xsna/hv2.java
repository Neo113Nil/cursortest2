package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.ironsource.C4382j6;
import com.my.tracker.campaign.CampaignService;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.queue.sync.utils.UnRecoverableException;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.face.morphing.FaceMorphingProcessor;
import ru.ok.media.StreamingLaunchScheduler;
import ru.ok.tensorflow.classification.ClassifierWithRegression;
import ru.ok.tracer.crash.report.AnrWatchdogThread;
import xsna.jwj0;
import xsna.rw30;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class hv2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hv2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean interrupted;
        switch (this.b) {
            case 0:
                ((AnrWatchdogThread) this.c).onBgSnapshot();
                return;
            case 1:
                ((CampaignService) this.c).stopSelf();
                return;
            case 2:
                ((ClassifierWithRegression) this.c).lambda$initGPUResources$2();
                return;
            case 3:
                ((nef) this.c).invoke();
                return;
            case 4:
                ((jwj0.a.C3151a) this.c).invoke();
                return;
            case 5:
                pop popVar = (pop) this.c;
                NestedScrollView nestedScrollView = popVar.m;
                if (nestedScrollView != null) {
                    ViewGroup viewGroup = popVar.v;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    nestedScrollView.scrollTo(0, viewGroup.getBottom());
                    return;
                }
                return;
            case 6:
                ((FaceMorphingProcessor) this.c).lambda$initGPUResources$4();
                return;
            case 7:
                ListGroupCallView listGroupCallView = (ListGroupCallView) this.c;
                listGroupCallView.F.setContentDescription(listGroupCallView.getContext().getString(R.string.voip_accessibility_show_participants_feed));
                return;
            case 8:
                ((rw30.b) this.c).b.invoke();
                return;
            case 9:
                yv50 yv50Var = (yv50) this.c;
                L.e("call runnable tryToInvokeOnMapLoadedInsteadSdk");
                yv50Var.a();
                return;
            case 10:
                PhotoEditorView photoEditorView = (PhotoEditorView) this.c;
                photoEditorView.C = true;
                photoEditorView.x(true);
                return;
            case 11:
                cse0 cse0Var = (cse0) this.c;
                ArrayList arrayList = cse0Var.m;
                try {
                    AtomicLong atomicLong = cse0Var.l;
                    long j = atomicLong.get();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        Thread.sleep(j);
                        atomicLong.set(0L);
                        new ise0(cse0Var.h, cse0Var.i, cse0Var.c, cse0Var.d, cse0Var.e, i7o0.a(arrayList), i7o0.a(cse0Var.n), i7o0.a(cse0Var.o), new bzw(cse0Var, 28), new fv90(cse0Var, 15), new vlc0(cse0Var, 3)).b();
                        return;
                    } catch (InterruptedException e) {
                        atomicLong.set(Math.max(0L, j - (SystemClock.elapsedRealtime() - elapsedRealtime)));
                        throw e;
                    }
                } catch (Throwable th) {
                    if (th instanceof InterruptedException) {
                        return;
                    }
                    Thread currentThread = Thread.currentThread();
                    if (currentThread instanceof rmr) {
                        rmr rmrVar = (rmr) currentThread;
                        if (rmrVar.b.get()) {
                            rmrVar.a();
                            interrupted = true;
                            if (interrupted) {
                                wuj wujVar = cse0Var.d;
                                RuntimeException runtimeException = new RuntimeException("Unhandled exception during queue sync process", th);
                                wujVar.getClass();
                                com.vk.metrics.eventtracking.b.a.q(runtimeException);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((zwm0) it.next()).c(new UnRecoverableException(th));
                                }
                                return;
                            }
                            return;
                        }
                    }
                    interrupted = Thread.interrupted();
                    if (interrupted) {
                    }
                }
            case 12:
                ((SharedPeerConnectionFactory) this.c).c();
                return;
            case 13:
                ((gzs) this.c).invoke();
                return;
            case 14:
                ((skm0.a) this.c).s();
                return;
            case 15:
                StreamingLaunchScheduler.notifyDelegateLaunchFailed$lambda$0((StreamingLaunchScheduler) this.c);
                return;
            case 16:
                UiTracker.i.j((UiTrackingScreen) this.c, false);
                return;
            case 17:
                UnityAdsImplementation.lambda$initialize$0((IUnityAdsInitializationListener) this.c);
                return;
            case 18:
                VideoView videoView = (VideoView) this.c;
                VideoTopBarView topBar = videoView.getTopBar();
                if (topBar != null) {
                    topBar.setVisibility(videoView.L0() ? 4 : 0);
                    return;
                }
                return;
            case 19:
                View view = (View) this.c;
                view.requestLayout();
                view.invalidate();
                return;
            default:
                C4382j6.a((C4382j6) this.c);
                return;
        }
    }
}
