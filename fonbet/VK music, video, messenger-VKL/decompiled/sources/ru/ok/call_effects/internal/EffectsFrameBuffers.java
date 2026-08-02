package ru.ok.call_effects.internal;

import android.content.Context;
import android.opengl.GLES20;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.call_effects.CallEffects;
import ru.ok.call_effects.internal.gl.EglDrawable;
import ru.ok.call_effects.internal.gl.EglTexture;
import ru.ok.call_effects.internal.mirroring.MirroringKt;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.TrivialFragmentShader;
import xsna.zcl;

/* compiled from: EffectsFrameBuffers.kt */
/* loaded from: classes9.dex */
public final class EffectsFrameBuffers {
    public static final Companion Companion = new Companion(null);
    private static final int FRAME_BUFFER_INIT_DELAY_MS = 200;
    private final EglDrawable eglDrawable;
    private boolean isReleased;
    private int lastCameraBufferIndex;
    private long lastFrameBufferInitializedTime;
    private FrameBuffer resultFrameBuffer;
    private final TrivialFragmentShader trivialFragmentShader = new TrivialFragmentShader(0, false);
    private FrameBuffer[] cameraFrameBuffers = {null, null};

    /* compiled from: EffectsFrameBuffers.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public EffectsFrameBuffers(Context context) {
        this.eglDrawable = new EglDrawable(context, new EglTexture(EglTexture.ProgramType.TEXTURE_EXT));
    }

    public final void copy(FrameBuffer frameBuffer, FrameBuffer frameBuffer2) {
        try {
            frameBuffer2.bind();
            GLES20.glViewport(0, 0, frameBuffer2.getWidth(), frameBuffer2.getHeight());
            GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            GLES20.glClear(16640);
            this.trivialFragmentShader.setTextureId(frameBuffer.getTextureId());
            this.trivialFragmentShader.render();
        } finally {
            frameBuffer2.unbind();
        }
    }

    public final FrameBuffer getLastCameraFrameBuffer() {
        return this.cameraFrameBuffers[this.lastCameraBufferIndex];
    }

    public final FrameBuffer getResultFrameBuffer(Size size) {
        FrameBuffer createNewIfSizeNotMatched = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.resultFrameBuffer, size);
        this.resultFrameBuffer = createNewIfSizeNotMatched;
        return createNewIfSizeNotMatched;
    }

    public final void release() {
        if (this.isReleased) {
            return;
        }
        this.eglDrawable.release(true);
        for (FrameBuffer frameBuffer : this.cameraFrameBuffers) {
            if (frameBuffer != null) {
                frameBuffer.release();
            }
        }
        FrameBuffer frameBuffer2 = this.resultFrameBuffer;
        if (frameBuffer2 != null) {
            frameBuffer2.release();
        }
        this.resultFrameBuffer = null;
        this.trivialFragmentShader.release();
        this.isReleased = true;
    }

    public final void saveCameraFrame(CallEffects.Frame frame, CallEffects.MirroringParameters mirroringParameters) {
        Size rotatedSize = Call_effects_frame_extensionsKt.getRotatedSize(frame);
        int i = (this.lastCameraBufferIndex + 1) % 2;
        this.lastCameraBufferIndex = i;
        FrameBuffer createNewIfSizeNotMatched = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.cameraFrameBuffers[i], rotatedSize);
        this.cameraFrameBuffers[this.lastCameraBufferIndex] = createNewIfSizeNotMatched;
        try {
            createNewIfSizeNotMatched.bind();
            GLES20.glViewport(0, 0, createNewIfSizeNotMatched.getWidth(), createNewIfSizeNotMatched.getHeight());
            GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            GLES20.glClear(16640);
            float[] rotatedTransformMatrix = Call_effects_frame_extensionsKt.getRotatedTransformMatrix(frame);
            this.eglDrawable.getDrawable().makeTexCoordArrays(MirroringKt.shouldMirrorEffect(frame, mirroringParameters), false);
            this.eglDrawable.drawFrame(frame.getTextureId(), (float[]) null, rotatedTransformMatrix, EglDrawable.Flip.NO_FLIP);
        } finally {
            createNewIfSizeNotMatched.unbind();
        }
    }

    public final boolean tryInitFrameBuffers(CallEffects.Frame frame) {
        FrameBuffer[] frameBufferArr = this.cameraFrameBuffers;
        int length = frameBufferArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (frameBufferArr[i] == null) {
                    break;
                }
                i++;
            } else if (this.resultFrameBuffer != null) {
                return true;
            }
        }
        if (System.currentTimeMillis() - this.lastFrameBufferInitializedTime <= 200) {
            return false;
        }
        this.lastFrameBufferInitializedTime = System.currentTimeMillis();
        Size rotatedSize = Call_effects_frame_extensionsKt.getRotatedSize(frame);
        FrameBuffer[] frameBufferArr2 = this.cameraFrameBuffers;
        FrameBuffer frameBuffer = frameBufferArr2[0];
        if (frameBuffer == null) {
            frameBufferArr2[0] = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(frameBuffer, rotatedSize);
            return false;
        }
        FrameBuffer frameBuffer2 = frameBufferArr2[1];
        if (frameBuffer2 == null) {
            frameBufferArr2[1] = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(frameBuffer2, rotatedSize);
            return false;
        }
        this.resultFrameBuffer = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.resultFrameBuffer, rotatedSize);
        return true;
    }
}
