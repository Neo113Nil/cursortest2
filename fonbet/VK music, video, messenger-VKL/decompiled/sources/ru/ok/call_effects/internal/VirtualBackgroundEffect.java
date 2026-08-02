package ru.ok.call_effects.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.Size;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import ru.ok.call_effects.CallEffects;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.util.AsyncEffectResourceProvider;
import xsna.atv0;
import xsna.epx;

/* compiled from: VirtualBackgroundEffect.kt */
/* loaded from: classes9.dex */
public final class VirtualBackgroundEffect {
    private final Context context;
    private CallEffects.Effect effect;
    private final EffectHolder effectHolder;
    private final GlViewImpl glView;
    private boolean isReleased;
    private DeviceOrientationDetector orientationDetector;
    private final SensorManager sensorManager;
    private final WindowManager windowManager;

    public VirtualBackgroundEffect(Context context, Handler handler) {
        this.context = context;
        this.sensorManager = (SensorManager) context.getSystemService("sensor");
        this.windowManager = (WindowManager) context.getSystemService("window");
        GlViewImpl glViewImpl = new GlViewImpl(context, handler, null, 4, null);
        this.glView = glViewImpl;
        this.effectHolder = new EffectHolder(glViewImpl, new ExtraAudioSupplier(context), new ExtraVideoSupplier(context, null));
    }

    private final void releaseOrientationDetector() {
        DeviceOrientationDetector deviceOrientationDetector = this.orientationDetector;
        if (deviceOrientationDetector != null) {
            deviceOrientationDetector.release();
        }
        this.orientationDetector = null;
    }

    private final void setRotationMatrixIfNeeded(EffectHolder effectHolder) {
        DeviceOrientationDetector deviceOrientationDetector = this.orientationDetector;
        if (deviceOrientationDetector != null) {
            int rotation = this.windowManager.getDefaultDisplay().getRotation();
            if (rotation == 0) {
                rotation = 0;
            } else if (rotation == 1) {
                rotation = 90;
            } else if (rotation == 2) {
                rotation = 180;
            } else if (rotation == 3) {
                rotation = atv0.b;
            }
            float[] rotationMatrix = deviceOrientationDetector.getRotationMatrix(rotation);
            Matrix.rotateM(rotationMatrix, 0, 90.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            effectHolder.receiveDeviceRotationMatrix(rotationMatrix);
        }
    }

    public final void handleFullSegmentation(Bitmap bitmap) {
        this.effectHolder.handleFullSegmentation(bitmap);
    }

    public final boolean isEnabled() {
        return this.effect != null;
    }

    public final void release() {
        if (this.isReleased) {
            return;
        }
        this.effectHolder.releaseFromGl();
        releaseOrientationDetector();
        this.isReleased = true;
    }

    public final void render(FrameBuffer frameBuffer, boolean z, boolean z2) {
        if (this.isReleased) {
            return;
        }
        setRotationMatrixIfNeeded(this.effectHolder);
        this.effectHolder.render(frameBuffer.getTextureId(), frameBuffer.getWidth(), frameBuffer.getHeight(), frameBuffer.getWidth(), frameBuffer.getHeight(), z, z2);
    }

    public final boolean trySelectEffect(CallEffects.Effect effect, Size size) {
        if (this.isReleased) {
            return false;
        }
        if (epx.f(this.effect, effect) && epx.f(this.glView.getSize(), size)) {
            return true;
        }
        this.glView.setSize(size);
        EffectRegistry effectRegistry = this.effectHolder.getEffectRegistry();
        if (!effectRegistry.inputDeviceRotationMatrixRequired(effectRegistry.getEffectHandle(effect.getId()))) {
            releaseOrientationDetector();
        } else {
            if (!CallEffects.Companion.is360BackgroundAvailable(this.context)) {
                return false;
            }
            if (this.orientationDetector == null) {
                this.orientationDetector = new DeviceOrientationDetector(this.sensorManager);
            }
        }
        this.effectHolder.selectEffect(null, null);
        EffectHolder effectHolder = this.effectHolder;
        EffectRegistry.EffectId id = effect.getId();
        File resourcePack = effect.getResourcePack();
        effectHolder.selectEffect(id, resourcePack != null ? new AsyncEffectResourceProvider(resourcePack) : null);
        this.effect = effect;
        return true;
    }

    public final void unselectEffect() {
        if (this.isReleased || this.effect == null) {
            return;
        }
        this.effect = null;
        this.effectHolder.selectEffect(null, null);
        releaseOrientationDetector();
    }
}
