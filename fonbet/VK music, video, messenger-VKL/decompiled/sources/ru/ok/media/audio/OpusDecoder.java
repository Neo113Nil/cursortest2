package ru.ok.media.audio;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import ru.ok.media.utils.DecoderInterface;
import xsna.ne7;

/* loaded from: classes9.dex */
public class OpusDecoder implements DecoderInterface {
    public static final int CHANNELS_COUNT = 2;
    public static final int SAMPLE_RATE = 48000;
    private static final String TAG = "OpusDecoder";
    private DecoderInterface.Callback cb;
    private ByteBuffer inBuffer;
    private long nativeHandle;
    private final ByteBuffer outBuffer = ByteBuffer.allocateDirect(192000);
    private long baseTS = Long.MIN_VALUE;
    private long samplesSent = 0;
    private boolean firstOutput = true;

    public OpusDecoder() {
        createNativeDecoder();
    }

    private native void closeHandle(long j);

    private native long createNativeDecoder(int i, int i2);

    private void createNativeDecoder() {
        this.nativeHandle = createNativeDecoder(48000, 2);
    }

    private native int decodeData(long j, ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2);

    private long getSendTS() {
        return ((this.samplesSent * 1000) / 48000) + this.baseTS;
    }

    private void resetTS(long j) {
        this.baseTS = j;
        this.samplesSent = 0L;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public void close() {
        long j = this.nativeHandle;
        if (j != 0) {
            closeHandle(j);
        }
        this.nativeHandle = 0L;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public boolean enqueueDataBuffer(int i, long j) {
        if (this.baseTS == Long.MIN_VALUE || Math.abs(getSendTS() - j) > 5000) {
            resetTS(j);
        }
        this.outBuffer.clear();
        int decodeData = decodeData(this.nativeHandle, this.inBuffer, i, this.outBuffer);
        if (decodeData > 0) {
            if (this.firstOutput) {
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setInteger("sample-rate", 48000);
                mediaFormat.setInteger("channel-count", 2);
                this.cb.handleFormatChanged(mediaFormat);
                this.firstOutput = false;
            }
            this.samplesSent += decodeData;
            this.outBuffer.position(0);
            this.outBuffer.limit(decodeData * 4);
            DecoderInterface.Callback callback = this.cb;
            if (callback != null) {
                callback.handleDecodedData(this.outBuffer);
            }
        } else if (decodeData < 0) {
            ne7.J(TAG, "Failed to decode, size=" + i);
        }
        return false;
    }

    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public ByteBuffer getDataBuffer(int i) {
        ByteBuffer byteBuffer = this.inBuffer;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.inBuffer = ByteBuffer.allocateDirect(i);
        }
        this.inBuffer.clear();
        return this.inBuffer;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public boolean requiresConfig() {
        return false;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public void setCallback(DecoderInterface.Callback callback) {
        this.cb = callback;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public void setConfig(ByteBuffer byteBuffer) {
    }
}
