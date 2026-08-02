package xsna;

import org.chromium.base.MemoryPressureListener;
import org.webrtc.EglBase10Impl;
import ru.ok.tracer.profiler.systrace.SystraceHook$start$executingThread$1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class gap implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ gap(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                EglBase10Impl.EglConnection.lambda$new$1();
                break;
            case 1:
                MemoryPressureListener.lambda$notifySelfFreeze$1();
                break;
            default:
                SystraceHook$start$executingThread$1.run$lambda$0();
                break;
        }
    }
}
