package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* compiled from: SystemClock.java */
/* loaded from: classes12.dex */
public final class ypn0 implements dvf {
    @Override // xsna.dvf
    public final long a() {
        return System.nanoTime();
    }

    @Override // xsna.dvf
    public final fqn0 createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new fqn0(new Handler(looper, callback));
    }

    @Override // xsna.dvf
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // xsna.dvf
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // xsna.dvf
    public final long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
