package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class mjl0 implements Closeable {
    public final OutputStream a;
    public final HandlerThread b;
    public final Handler c;

    public mjl0(njl0 njl0Var, OutputStream outputStream) {
        this.a = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.b = handlerThread;
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HandlerThread handlerThread = this.b;
        Objects.requireNonNull(handlerThread);
        this.c.post(new hxj0(13, handlerThread));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
