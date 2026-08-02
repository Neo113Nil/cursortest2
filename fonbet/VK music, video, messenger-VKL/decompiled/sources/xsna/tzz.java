package xsna;

import android.graphics.Bitmap;
import android.media.metrics.PlaybackMetrics;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.imageloader.fresco.CallerContext;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import xsna.i360;
import xsna.my70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tzz implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tzz(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                uzz uzzVar = (uzz) this.c;
                Runnable runnable = (Runnable) this.d;
                RecyclerView recyclerView = uzzVar.e;
                if (recyclerView != null && recyclerView.isComputingLayout()) {
                    uzzVar.a(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ((ps10) this.c).e.reportPlaybackMetrics((PlaybackMetrics) this.d);
                break;
            case 2:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.c;
                io.reactivex.rxjava3.core.b bVar = (io.reactivex.rxjava3.core.b) this.d;
                ref$BooleanRef.element = true;
                bVar.onComplete();
                break;
            case 3:
                my70.c cVar = (my70.c) this.c;
                my70 my70Var = (my70) this.d;
                cVar.g = true;
                if (my70Var.a) {
                    Object m = cVar.b.m();
                    CallerContext callerContext = m instanceof CallerContext ? (CallerContext) m : null;
                    if (callerContext == null) {
                        callerContext = CallerContext.Background;
                    }
                    if (callerContext == CallerContext.Frontend) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Image fetching is requeued: " + cVar.b()});
                            break;
                        }
                    }
                }
                i360.a aVar = cVar.f;
                if (aVar != null) {
                    aVar.a();
                }
                cVar.d = true;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"OkHttpPriorityNetworkFetcher", "Image fetching will be skipped after cancellation: " + cVar.b()});
                    break;
                }
                break;
            case 4:
                PostFragment postFragment = (PostFragment) this.c;
                RecyclerView recyclerView2 = (RecyclerView) this.d;
                int i = PostFragment.S0;
                PostViewFragmentTimeSpentTracker Co = postFragment.Co();
                if (Co != null) {
                    Co.a(recyclerView2);
                    break;
                }
                break;
            case 5:
                ((ru.mail.libverify.b0.a) this.c).a((String) this.d);
                break;
            case 6:
                com.mbridge.msdk.config.dynamic.utils.image.b.a((Bitmap) this.c, (ImageView) this.d);
                break;
            case 7:
                yads.e12.a((yads.e12) this.c, (View) this.d);
                break;
            default:
                zwy0 zwy0Var = (zwy0) this.c;
                RtcCommand<?> rtcCommand = (RtcCommand) this.d;
                Iterator it = zwy0Var.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((RtcCommandExecutor.Listener) it.next()).onRtcCommandSent(rtcCommand);
                    } catch (Throwable th) {
                        zwy0Var.a.reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsent", th);
                    }
                }
                break;
        }
    }
}
