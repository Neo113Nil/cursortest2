package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import xsna.h32;
import xsna.i32;
import xsna.zcl;

/* compiled from: HighApiBitmapEffectHelper.kt */
/* loaded from: classes7.dex */
public final class HighApiBitmapEffectHelper extends BitmapEffectHelper {
    private static final Companion Companion = new Companion(null);
    private HardwareRenderer cachedHardwareRenderer;
    private RenderNode cachedRenderNode;

    /* compiled from: HighApiBitmapEffectHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    private final Bitmap blur(Bitmap bitmap, float f, boolean z) {
        ImageReader newInstance;
        RenderEffect createBlurEffect;
        RecordingCanvas beginRecording;
        HardwareRenderer.FrameRenderRequest createRenderRequest;
        HardwareRenderer.FrameRenderRequest waitForPresent;
        HardwareBuffer hardwareBuffer;
        Bitmap wrapHardwareBuffer;
        HardwareRenderer orCreateHardwareRenderer = getOrCreateHardwareRenderer();
        RenderNode orCreateRenderNode = getOrCreateRenderNode();
        newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
        orCreateHardwareRenderer.setSurface(newInstance.getSurface());
        orCreateHardwareRenderer.setContentRoot(orCreateRenderNode);
        orCreateRenderNode.setPosition(0, 0, newInstance.getWidth(), newInstance.getHeight());
        float f2 = f / 1.5f;
        createBlurEffect = RenderEffect.createBlurEffect(f2, f2, z ? Shader.TileMode.DECAL : Shader.TileMode.MIRROR);
        orCreateRenderNode.setRenderEffect(createBlurEffect);
        beginRecording = orCreateRenderNode.beginRecording();
        beginRecording.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        orCreateRenderNode.endRecording();
        createRenderRequest = orCreateHardwareRenderer.createRenderRequest();
        waitForPresent = createRenderRequest.setWaitForPresent(true);
        waitForPresent.syncAndDraw();
        Image acquireNextImage = newInstance.acquireNextImage();
        if (acquireNextImage == null || (hardwareBuffer = acquireNextImage.getHardwareBuffer()) == null) {
            return bitmap;
        }
        try {
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            if (wrapHardwareBuffer != null) {
                if (z) {
                    Bitmap.Config config = wrapHardwareBuffer.getConfig();
                    Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
                    if (config != config2) {
                        bitmap = wrapHardwareBuffer.copy(config2, false);
                        wrapHardwareBuffer.recycle();
                    }
                }
                if (wrapHardwareBuffer.getConfig() != bitmap.getConfig()) {
                    Bitmap.Config config3 = bitmap.getConfig();
                    if (config3 == null) {
                        config3 = Bitmap.Config.ARGB_8888;
                    }
                    bitmap = wrapHardwareBuffer.copy(config3, false);
                } else {
                    Bitmap.Config config4 = wrapHardwareBuffer.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmap = wrapHardwareBuffer.copy(config4, false);
                }
                wrapHardwareBuffer.recycle();
            }
            hardwareBuffer.close();
            acquireNextImage.close();
            return bitmap;
        } catch (Throwable th) {
            hardwareBuffer.close();
            acquireNextImage.close();
            throw th;
        }
    }

    private final HardwareRenderer getOrCreateHardwareRenderer() {
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            return hardwareRenderer;
        }
        HardwareRenderer c = i32.c();
        this.cachedHardwareRenderer = c;
        return c;
    }

    private final RenderNode getOrCreateRenderNode() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode b = h32.b();
        this.cachedRenderNode = b;
        return b;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public Bitmap blurBitmap(Bitmap bitmap, float f) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f) ? bitmap : blur(bitmap, f, false);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public Bitmap blurShadow(Bitmap bitmap, float f) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f) ? bitmap : blur(bitmap, f, true);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float f) {
        return 1.0f;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.cachedRenderNode = null;
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            hardwareRenderer.destroy();
        }
        this.cachedHardwareRenderer = null;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float f) {
        return f;
    }
}
