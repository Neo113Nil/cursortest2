package ru.ok.nativenet;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class FDUtils {
    private int _emulateRecvErrorPeriodMillis;
    private int _emulateSendErrorPeriodMillis;
    private long _lastEmulatedRecvError;
    private long _lastEmulatedSendError;
    private long nativeHandle = createHandle();

    public FDUtils(int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        this._lastEmulatedSendError = currentTimeMillis;
        this._lastEmulatedRecvError = currentTimeMillis;
        this._emulateSendErrorPeriodMillis = i;
        this._emulateRecvErrorPeriodMillis = i2;
    }

    private static native long createHandle();

    public static native int doPingDf(String str, int i, byte[] bArr);

    private static native int doReceiveBatch(long j, int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, boolean z);

    private static native int doSend(long j, int i, ByteBuffer byteBuffer, int i2, int i3, boolean z, boolean z2, boolean z3);

    private static native void doSetKey(long j, ByteBuffer byteBuffer, int i, int i2);

    private static native void releaseHandle(long j);

    public static native int setNoFragment(int i, boolean z);

    public void finalize() throws Throwable {
        releaseHandle(this.nativeHandle);
        super.finalize();
    }

    public int receiveBatch(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return doReceiveBatch(this.nativeHandle, i, byteBuffer, byteBuffer.position(), byteBuffer.remaining(), i2, i3, shouldEmulateRecvError());
    }

    public int send(int i, ByteBuffer byteBuffer, boolean z, boolean z2) {
        return doSend(this.nativeHandle, i, byteBuffer, byteBuffer.position(), byteBuffer.remaining(), z, z2, shouldEmulateSendError());
    }

    public void setKey(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        doSetKey(this.nativeHandle, allocateDirect, 0, bArr.length);
    }

    public boolean shouldEmulateRecvError() {
        if (this._emulateRecvErrorPeriodMillis < 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this._lastEmulatedRecvError < this._emulateRecvErrorPeriodMillis) {
            return false;
        }
        this._lastEmulatedRecvError = currentTimeMillis;
        return true;
    }

    public boolean shouldEmulateSendError() {
        if (this._emulateSendErrorPeriodMillis < 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this._lastEmulatedSendError < this._emulateSendErrorPeriodMillis) {
            return false;
        }
        this._lastEmulatedSendError = currentTimeMillis;
        return true;
    }
}
