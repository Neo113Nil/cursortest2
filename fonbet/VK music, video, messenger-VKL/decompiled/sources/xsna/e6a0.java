package xsna;

import android.app.Activity;
import java.io.File;
import java.util.Iterator;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6a0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e6a0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                k6a0.a((k6a0) this.c, (File) this.d, (Activity) this.e);
                break;
            default:
                zwy0 zwy0Var = (zwy0) this.c;
                RtcCommand<?> rtcCommand = (RtcCommand) this.d;
                Throwable th = (Throwable) this.e;
                Iterator it = zwy0Var.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((RtcCommandExecutor.Listener) it.next()).onRtcCommandError(rtcCommand, th);
                    } catch (Throwable th2) {
                        zwy0Var.a.reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th2);
                    }
                }
                break;
        }
    }
}
