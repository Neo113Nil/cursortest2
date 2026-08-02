package xsna;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.Window;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.lang.ref.WeakReference;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import xsna.jmk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class mls0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mls0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((VideoFileRenderer) this.c).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.d, (VideoFrame) this.e);
                break;
            default:
                csx0 csx0Var = (csx0) this.c;
                Window window = (Window) this.d;
                ScrollScreenType scrollScreenType = (ScrollScreenType) this.e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"WindowsFrameFreezeChecker: Add window to aggregator for screen = " + scrollScreenType});
                }
                jmk.a aVar = csx0Var.b.a;
                if (jmk.b == null) {
                    aVar.getClass();
                    HandlerThread handlerThread = new HandlerThread("CustomAggregator");
                    handlerThread.start();
                    jmk.c = new Handler(handlerThread.getLooper());
                    jmk.b = handlerThread;
                }
                for (int i = 0; i < 9; i++) {
                    SparseIntArray[] sparseIntArrayArr = aVar.b;
                    if (sparseIntArrayArr[i] == null && (aVar.a & (1 << i)) != 0) {
                        sparseIntArrayArr[i] = new SparseIntArray();
                    }
                }
                window.addOnFrameMetricsAvailableListener(aVar.d, jmk.c);
                aVar.c.add(new WeakReference<>(window));
                break;
        }
    }
}
