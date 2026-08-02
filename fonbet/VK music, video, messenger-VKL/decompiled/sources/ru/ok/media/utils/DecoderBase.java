package ru.ok.media.utils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.media.utils.DecoderInterface;
import xsna.ne7;

/* loaded from: classes9.dex */
public class DecoderBase implements DecoderInterface {
    private static final String TAG = "DecoderBase";
    private int bufferIndex;
    private DecoderInterface.Callback cb;
    private byte[] codecHeaders;

    @Nullable
    protected MediaCodec mediaCodec;
    protected boolean render;
    private volatile boolean isVideoFrameRendered = false;
    private final AtomicBoolean mustReconfigure = new AtomicBoolean(true);

    private void closeCodec() {
        MediaCodec mediaCodec = this.mediaCodec;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (RuntimeException e) {
                ne7.K(TAG, "Failed to stop", e);
            }
            try {
                this.mediaCodec.release();
            } catch (RuntimeException e2) {
                ne7.K(TAG, "Failed to release encoder", e2);
            }
        }
        this.mediaCodec = null;
    }

    private boolean configureDecoder() {
        if (!this.mustReconfigure.getAndSet(false)) {
            return true;
        }
        if (this.codecHeaders == null) {
            return false;
        }
        closeCodec();
        try {
            MediaCodec createDecoder = createDecoder();
            this.mediaCodec = createDecoder;
            if (createDecoder == null) {
                return false;
            }
            createDecoder.start();
            ne7.t(TAG, "media codec started");
            return true;
        } catch (Exception e) {
            ne7.o(TAG, "Failed to start decoder", e);
            return false;
        }
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public void close() {
        closeCodec();
    }

    public MediaCodec createDecoder() {
        return null;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public boolean enqueueDataBuffer(int i, long j) {
        return enqueueDataBuffer(i, j, false);
    }

    public byte[] getCodecHeaders() {
        return this.codecHeaders;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public ByteBuffer getDataBuffer(int i) {
        if (!configureDecoder()) {
            ne7.J(TAG, "Decoder was not configured - cannot get buffer");
            return null;
        }
        try {
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(-1L);
            if (dequeueInputBuffer < 0) {
                ne7.J(TAG, "Failed to get frame buffer from decoder");
                return null;
            }
            ByteBuffer byteBuffer = this.mediaCodec.getInputBuffers()[dequeueInputBuffer];
            byteBuffer.clear();
            this.bufferIndex = dequeueInputBuffer;
            if (byteBuffer.capacity() >= i) {
                byteBuffer.limit(i);
                return byteBuffer;
            }
            this.mediaCodec.queueInputBuffer(this.bufferIndex, 0, 0, 0L, 0);
            ne7.J(TAG, "Buffer from decoder is too small for given frame; size=" + i + "; capacity=" + byteBuffer.capacity());
            return null;
        } catch (Exception e) {
            ne7.K(TAG, "Failed to get frame buffer from decoder", e);
            return null;
        }
    }

    public final void handleDecodedData(ByteBuffer byteBuffer) {
        DecoderInterface.Callback callback = this.cb;
        if (callback != null) {
            callback.handleDecodedData(byteBuffer);
        }
    }

    public final void handleFormatChanged(MediaFormat mediaFormat) {
        DecoderInterface.Callback callback = this.cb;
        if (callback != null) {
            callback.handleFormatChanged(mediaFormat);
        }
    }

    public boolean isOpen() {
        return this.mediaCodec != null;
    }

    public boolean isVideoFrameRendered() {
        return this.isVideoFrameRendered;
    }

    public void reconfigure() {
        this.mustReconfigure.set(true);
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public boolean requiresConfig() {
        return true;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public void setCallback(DecoderInterface.Callback callback) {
        this.cb = callback;
    }

    @Override // ru.ok.media.utils.DecoderInterface
    public void setConfig(ByteBuffer byteBuffer) {
        byte[] bArr = this.codecHeaders;
        if (bArr == null || !ByteBuffer.wrap(bArr).equals(byteBuffer)) {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            this.codecHeaders = bArr2;
            byteBuffer.get(bArr2);
            reconfigure();
        }
    }

    public boolean enqueueDataBuffer(int i, long j, boolean z) {
        if (!configureDecoder()) {
            ne7.J(TAG, "Decoder was not configured - cannot enqueue buffer");
            return false;
        }
        try {
            this.mediaCodec.queueInputBuffer(this.bufferIndex, 0, i, j, z ? 2 : 0);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                if (dequeueOutputBuffer >= 0) {
                    try {
                        if (this.cb != null) {
                            ByteBuffer byteBuffer = this.mediaCodec.getOutputBuffers()[dequeueOutputBuffer];
                            byteBuffer.position(0);
                            byteBuffer.limit(bufferInfo.size);
                            handleDecodedData(byteBuffer);
                        }
                        this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, this.render);
                        if (this.render) {
                            this.isVideoFrameRendered = true;
                            handleVideoFrameRendered();
                        }
                    } finally {
                    }
                } else if (dequeueOutputBuffer == -2) {
                    handleFormatChanged(this.mediaCodec.getOutputFormat());
                } else if (dequeueOutputBuffer == -1) {
                    return true;
                }
            }
        } catch (Exception e) {
            ne7.K(TAG, "Failed to decode frame", e);
            return false;
        }
    }

    public void handleVideoFrameRendered() {
    }
}
