package xsna;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/* compiled from: FileInfoUpdateReceiver.kt */
/* loaded from: classes8.dex */
public final class c9r implements dai0 {
    public final udq0 b;
    public final Pipe.SourceChannel c;
    public final il7 d;
    public final ByteBuffer e = ByteBuffer.allocate(9);

    public c9r(udq0 udq0Var, cdi cdiVar, Pipe.SourceChannel sourceChannel, il7 il7Var) {
        this.b = udq0Var;
        this.c = sourceChannel;
        this.d = il7Var;
    }

    @Override // xsna.dai0
    public final void N1() {
        Pipe.SourceChannel sourceChannel = this.c;
        ByteBuffer byteBuffer = this.e;
        if (sourceChannel.read(byteBuffer) > 0 && byteBuffer.position() == 9) {
            byteBuffer.flip();
            b9r b9rVar = new b9r(byteBuffer.getLong(), byteBuffer.get() == 1);
            this.d.invoke(b9rVar);
            if (b9rVar.b) {
                close();
            }
            byteBuffer.rewind();
        }
    }

    @Override // xsna.dai0
    public final void W() {
        Log.e("FileInfoUpdateReceiver", "Unexpected event for read-only channel");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Pipe.SourceChannel sourceChannel = this.c;
        try {
            sourceChannel.close();
        } catch (Throwable th) {
            Log.e("FileInfoUpdateReceiver", "Failed to close file info updates pipe", th);
        }
        this.b.e(sourceChannel);
    }

    @Override // xsna.dai0
    public final void onConnected() {
        Log.e("FileInfoUpdateReceiver", "Unexpected event for read-only channel");
    }
}
