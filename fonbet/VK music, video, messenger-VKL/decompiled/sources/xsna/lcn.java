package xsna;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: DispatchThread.kt */
/* loaded from: classes11.dex */
public final class lcn {
    public final Object a;

    public lcn() {
        HandlerThread handlerThread = new HandlerThread("VKStatsSendThread", 5);
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    public lcn(gzs gzsVar) {
        this.a = gzsVar;
    }
}
