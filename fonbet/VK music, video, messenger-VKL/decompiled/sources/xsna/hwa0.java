package xsna;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.Nullable;

/* compiled from: PlaybackLooperProvider.java */
/* loaded from: classes12.dex */
public final class hwa0 {

    @Nullable
    public Looper b;
    public final Object a = new Object();

    @Nullable
    public HandlerThread c = null;
    public int d = 0;

    public hwa0(@Nullable Looper looper) {
        this.b = looper;
    }

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.a) {
            try {
                fxc0.z(this.d > 0);
                int i = this.d - 1;
                this.d = i;
                if (i == 0 && (handlerThread = this.c) != null) {
                    handlerThread.quit();
                    this.c = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
