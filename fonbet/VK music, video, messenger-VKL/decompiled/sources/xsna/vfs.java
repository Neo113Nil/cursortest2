package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: FramePlayerThreadHandler.kt */
/* loaded from: classes3.dex */
public final class vfs extends Handler {
    public final WeakReference<ufs> a;
    public final Object b;

    public vfs(Looper looper, WeakReference<ufs> weakReference) {
        super(looper);
        this.a = weakReference;
        this.b = new Object();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ufs ufsVar = this.a.get();
        if (ufsVar == null) {
            return;
        }
        switch (message.what) {
            case 1:
                ufsVar.e();
                return;
            case 2:
                ufsVar.m(((Long) message.obj).longValue());
                return;
            case 3:
                ufsVar.h();
                return;
            case 4:
                ufsVar.k();
                return;
            case 5:
                ufsVar.j();
                return;
            case 6:
                if (ufsVar.isInterrupted()) {
                    ufsVar.quit();
                }
                ufsVar.a().removeMessages(5);
                ufsVar.l(new pce(ufsVar, 25));
                return;
            default:
                throw new IllegalStateException("unknown message with type " + message.what);
        }
    }
}
