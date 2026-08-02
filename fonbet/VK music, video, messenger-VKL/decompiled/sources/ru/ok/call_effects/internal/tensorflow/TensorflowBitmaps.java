package ru.ok.call_effects.internal.tensorflow;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.call_effects.CallEffects;
import ru.ok.call_effects.internal.Call_effects_frame_extensionsKt;
import ru.ok.call_effects.internal.Frame_buffer_extensionsKt;
import ru.ok.call_effects.internal.gl.EglDrawable;
import ru.ok.call_effects.internal.gl.EglTexture;
import ru.ok.call_effects.internal.mirroring.MirroringKt;
import ru.ok.gl.GlBitmapReader;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.gl.util.FrameHolder;

/* compiled from: TensorflowBitmaps.kt */
/* loaded from: classes9.dex */
public final class TensorflowBitmaps {
    private final GlBitmapReader bitmapReader;
    private final EglDrawable eglDrawable;
    private boolean isReleased;
    private final RendererMatrices matrices = new RendererMatrices();
    private CallEffects.MirroringParameters mirroringParameters = new CallEffects.MirroringParameters(false, false, false, false, 15, null);
    private FrameBuffer tensBigBuffer;
    private FrameBuffer tensNormalBuffer;
    private FrameBuffer tensSmallBuffer;
    private final TensorflowSegmentationType tensorflowSegmentationType;

    /* compiled from: TensorflowBitmaps.kt */
    public static final class Scale {
        private final float x;
        private final float y;

        public Scale(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }
    }

    public TensorflowBitmaps(Context context, TensorflowSegmentationType tensorflowSegmentationType) {
        this.tensorflowSegmentationType = tensorflowSegmentationType;
        this.eglDrawable = new EglDrawable(context, new EglTexture(EglTexture.ProgramType.TEXTURE_EXT));
        this.bitmapReader = new GlBitmapReader(GlUtil.getGlVersion(context), null, false);
    }

    private final Bitmap createBitmap(Size size, float[] fArr, FrameBuffer frameBuffer, CallEffects.Frame frame) {
        if (!resizeFrame(size, fArr, frameBuffer, frame, false)) {
            return null;
        }
        Bitmap bitmap = this.bitmapReader.getBitmap(size.getWidth(), size.getHeight());
        frameBuffer.unbind();
        return bitmap;
    }

    private final FrameHolder getFrameHolder(CallEffects.Frame frame, FrameBuffer frameBuffer, boolean z, boolean z2) {
        FrameBuffer frameBuffer2;
        Bitmap bitmap;
        int i = -1;
        if (z) {
            bitmap = createBitmap(new Size(frameBuffer.getWidth(), frameBuffer.getHeight()), this.matrices.getTensSmallMvpMatrixSolo(), frameBuffer, frame);
            if (bitmap != null && z2) {
                i = frameBuffer.getTextureId();
            }
            frameBuffer2 = frameBuffer;
        } else {
            if (z2) {
                frameBuffer2 = frameBuffer;
                if (resizeFrame$default(this, new Size(frameBuffer.getWidth(), frameBuffer.getHeight()), this.matrices.getTensSmallMvpMatrixSolo(), frameBuffer2, frame, false, 16, null)) {
                    i = frameBuffer2.getTextureId();
                }
            } else {
                frameBuffer2 = frameBuffer;
            }
            bitmap = null;
        }
        if (bitmap != null && i >= 0) {
            return new FrameHolder(bitmap, i, frameBuffer2.getWidth(), frameBuffer2.getHeight());
        }
        if (bitmap != null) {
            return new FrameHolder(bitmap);
        }
        if (i >= 0) {
            return new FrameHolder(i, frameBuffer2.getWidth(), frameBuffer2.getHeight());
        }
        return null;
    }

    private final boolean resizeFrame(Size size, float[] fArr, FrameBuffer frameBuffer, CallEffects.Frame frame, boolean z) {
        try {
            frameBuffer.bind();
            GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            GLES20.glClear(16640);
            GLES20.glViewport(0, 0, frameBuffer.getWidth(), frameBuffer.getHeight());
            boolean shouldMirrorEffect = MirroringKt.shouldMirrorEffect(frame, this.mirroringParameters);
            this.eglDrawable.getDrawable().makeTexCoordArrays(shouldMirrorEffect, false);
            this.eglDrawable.drawFrame(frame.getTextureId(), fArr, Call_effects_frame_extensionsKt.getRotatedTransformMatrix(frame), shouldMirrorEffect ? EglDrawable.Flip.VERTICAL : EglDrawable.Flip.NO_FLIP);
            if (z) {
                frameBuffer.unbind();
            }
            return true;
        } catch (Throwable th) {
            frameBuffer.unbind();
            throw th;
        }
    }

    public static /* synthetic */ boolean resizeFrame$default(TensorflowBitmaps tensorflowBitmaps, Size size, float[] fArr, FrameBuffer frameBuffer, CallEffects.Frame frame, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        return tensorflowBitmaps.resizeFrame(size, fArr, frameBuffer, frame, z);
    }

    private final void updateMatrices(CallEffects.Frame frame) {
        Size rotatedSize = Call_effects_frame_extensionsKt.getRotatedSize(frame);
        this.matrices.updateMatrices(rotatedSize.getWidth(), rotatedSize.getHeight(), rotatedSize.getWidth(), rotatedSize.getHeight(), frame.isFrontCamera(), this.tensorflowSegmentationType == TensorflowSegmentationType.NEW_SEGMENTATION_BIG);
    }

    public final Bitmap createBigBitmap(CallEffects.Frame frame) {
        if (this.isReleased) {
            return null;
        }
        updateMatrices(frame);
        FrameBuffer createNewIfSizeNotMatched = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.tensBigBuffer, new Size(this.matrices.getTensFrameWidth(), this.matrices.getTensFrameHeight()));
        this.tensBigBuffer = createNewIfSizeNotMatched;
        return createBitmap(new Size(createNewIfSizeNotMatched.getWidth(), createNewIfSizeNotMatched.getHeight()), this.matrices.getTensDefaultMxpMatrix(), createNewIfSizeNotMatched, frame);
    }

    public final FrameHolder createBigFrameHolder(CallEffects.Frame frame, boolean z, boolean z2) {
        if (this.isReleased) {
            return null;
        }
        updateMatrices(frame);
        FrameBuffer createNewIfSizeNotMatched = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.tensBigBuffer, new Size(this.matrices.getTensFrameWidth(), this.matrices.getTensFrameHeight()));
        this.tensBigBuffer = createNewIfSizeNotMatched;
        return getFrameHolder(frame, createNewIfSizeNotMatched, z, z2);
    }

    public final Bitmap createNormalBitmap(CallEffects.Frame frame) {
        if (this.isReleased) {
            return null;
        }
        updateMatrices(frame);
        FrameBuffer createNewIfSizeNotMatched = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.tensNormalBuffer, new Size(this.matrices.getTENS_WIDTH_M(), this.matrices.getTENS_HEIGHT_M()));
        this.tensNormalBuffer = createNewIfSizeNotMatched;
        return createBitmap(new Size(createNewIfSizeNotMatched.getWidth(), createNewIfSizeNotMatched.getHeight()), this.matrices.getTensNormalMvpMatrixSolo(), createNewIfSizeNotMatched, frame);
    }

    public final FrameHolder createNormalFrameHolder(CallEffects.Frame frame, boolean z, boolean z2) {
        if (this.isReleased) {
            return null;
        }
        updateMatrices(frame);
        FrameBuffer createNewIfSizeNotMatched = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.tensNormalBuffer, new Size(this.matrices.getTENS_WIDTH_M(), this.matrices.getTENS_HEIGHT_M()));
        this.tensNormalBuffer = createNewIfSizeNotMatched;
        return getFrameHolder(frame, createNewIfSizeNotMatched, z, z2);
    }

    public final Bitmap createSmallBitmap(CallEffects.Frame frame) {
        if (this.isReleased) {
            return null;
        }
        updateMatrices(frame);
        FrameBuffer createNewIfSizeNotMatched = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.tensSmallBuffer, new Size(this.matrices.getTENS_WIDTH_S(), this.matrices.getTENS_HEIGHT_S()));
        this.tensSmallBuffer = createNewIfSizeNotMatched;
        return createBitmap(new Size(createNewIfSizeNotMatched.getWidth(), createNewIfSizeNotMatched.getHeight()), this.matrices.getTensSmallMvpMatrixSolo(), createNewIfSizeNotMatched, frame);
    }

    public final FrameHolder createSmallFrameHolder(CallEffects.Frame frame, boolean z, boolean z2) {
        if (this.isReleased) {
            return null;
        }
        updateMatrices(frame);
        FrameBuffer createNewIfSizeNotMatched = Frame_buffer_extensionsKt.createNewIfSizeNotMatched(this.tensSmallBuffer, new Size(this.matrices.getTENS_WIDTH_S(), this.matrices.getTENS_HEIGHT_S()));
        this.tensSmallBuffer = createNewIfSizeNotMatched;
        return getFrameHolder(frame, createNewIfSizeNotMatched, z, z2);
    }

    public final Scale getSegmentationScale() {
        return new Scale(this.matrices.getSegmScaleX(), this.matrices.getSegmScaleY());
    }

    public final void release() {
        if (this.isReleased) {
            return;
        }
        FrameBuffer frameBuffer = this.tensSmallBuffer;
        if (frameBuffer != null) {
            frameBuffer.release();
        }
        this.tensSmallBuffer = null;
        FrameBuffer frameBuffer2 = this.tensNormalBuffer;
        if (frameBuffer2 != null) {
            frameBuffer2.release();
        }
        this.tensNormalBuffer = null;
        FrameBuffer frameBuffer3 = this.tensBigBuffer;
        if (frameBuffer3 != null) {
            frameBuffer3.release();
        }
        this.tensBigBuffer = null;
        this.bitmapReader.release(true);
        this.eglDrawable.release(true);
        this.isReleased = true;
    }

    public final void setMirroringParameters(CallEffects.MirroringParameters mirroringParameters) {
        this.mirroringParameters = mirroringParameters;
    }
}
