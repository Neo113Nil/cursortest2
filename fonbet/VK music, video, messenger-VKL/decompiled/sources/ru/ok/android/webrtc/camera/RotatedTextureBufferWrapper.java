package ru.ok.android.webrtc.camera;

import android.graphics.Matrix;
import android.os.Handler;
import org.webrtc.CalledByNative;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;
import xsna.gs2;

/* loaded from: classes9.dex */
public final class RotatedTextureBufferWrapper implements VideoFrame.TextureBuffer {
    public final VideoFrame.TextureBuffer a;
    public final int b;
    public final Handler c;
    public final YuvConverter d;

    public RotatedTextureBufferWrapper(VideoFrame.TextureBuffer textureBuffer, int i, Handler handler, YuvConverter yuvConverter) {
        this.a = textureBuffer;
        this.b = i;
        this.c = handler;
        this.d = yuvConverter;
    }

    public static final void a(RotatedTextureBufferWrapper rotatedTextureBufferWrapper) {
        rotatedTextureBufferWrapper.a.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    @CalledByNative("Buffer")
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix(this.a.getTransformMatrix());
        if (this.b != 0) {
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(this.b);
            matrix.preTranslate(-0.5f, -0.5f);
        }
        matrix.preTranslate(i / getWidth(), i2 / getHeight());
        matrix.preScale(i3 / getWidth(), i4 / getHeight());
        this.a.retain();
        return new TextureBufferImpl(i5, i6, this.a.getType(), this.a.getTextureId(), matrix, this.c, this.d, new gs2(this, 13));
    }

    @Override // org.webrtc.VideoFrame.Buffer
    @CalledByNative("Buffer")
    public int getHeight() {
        return this.b % 180 == 0 ? this.a.getHeight() : this.a.getWidth();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.a.getTextureId();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.a.getTransformMatrix();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.a.getType();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    @CalledByNative("Buffer")
    public int getWidth() {
        return this.b % 180 == 0 ? this.a.getWidth() : this.a.getHeight();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    @CalledByNative("Buffer")
    public void release() {
        this.a.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    @CalledByNative("Buffer")
    public void retain() {
        this.a.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    @CalledByNative("Buffer")
    public VideoFrame.I420Buffer toI420() {
        return this.a.toI420();
    }
}
