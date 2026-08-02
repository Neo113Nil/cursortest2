package io.antmedia.rtmp_client;

import java.io.IOException;
import xsna.lhg;

/* loaded from: classes8.dex */
public class RtmpClient {
    public long a = 0;

    public static class RtmpIOException extends IOException {
        public final int errorCode;

        public RtmpIOException(int i) {
            super(lhg.a(i, "RTMP error: "));
            this.errorCode = i;
        }
    }

    static {
        System.loadLibrary("rtmp-jni");
    }

    private native long nativeAlloc();

    private native void nativeClose(long j);

    private native boolean nativeIsConnected(long j);

    private native int nativeOpen(String str, boolean z, long j, int i, int i2);

    private native int nativePause(boolean z, long j) throws IllegalStateException;

    private native int nativeRead(byte[] bArr, int i, int i2, long j) throws IllegalStateException;

    private native int nativeWrite(byte[] bArr, int i, int i2, long j) throws IllegalStateException;

    public final void a() {
        nativeClose(this.a);
        this.a = 0L;
    }

    public final void b(String str) throws RtmpIOException {
        long nativeAlloc = nativeAlloc();
        this.a = nativeAlloc;
        if (nativeAlloc == 0) {
            throw new RtmpIOException(-2);
        }
        int nativeOpen = nativeOpen(str, false, nativeAlloc, 10000, 10000);
        if (nativeOpen == 0) {
            return;
        }
        this.a = 0L;
        throw new RtmpIOException(nativeOpen);
    }

    public final int c(byte[] bArr, int i, int i2) throws RtmpIOException, IllegalStateException {
        int nativeRead = nativeRead(bArr, i, i2, this.a);
        if (nativeRead >= 0 || nativeRead == -1) {
            return nativeRead;
        }
        throw new RtmpIOException(nativeRead);
    }
}
