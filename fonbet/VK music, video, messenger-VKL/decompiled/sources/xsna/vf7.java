package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class vf7 implements ServiceConnection {
    public boolean b = false;
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @NonNull
    public final IBinder l() throws InterruptedException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        exc0.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.b = true;
        IBinder iBinder = (IBinder) this.c.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.c.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
