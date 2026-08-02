package defpackage;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes.dex */
public final class eju extends e06 {
    public HardwareRenderer a;
    public RenderNode b;

    @Override // defpackage.e06
    public final Bitmap a(float f, Bitmap bitmap) {
        return (bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || f <= 0.0f) ? rzo.B(bitmap) : f(bitmap, f, false);
    }

    @Override // defpackage.e06
    public final Bitmap b(float f, Bitmap bitmap) {
        return (bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || f <= 0.0f) ? rzo.B(bitmap) : f(bitmap, f, true);
    }

    @Override // defpackage.e06
    public final float c(float f) {
        return 1.0f;
    }

    @Override // defpackage.e06
    public final float d(float f) {
        return f;
    }

    @Override // defpackage.e06
    public final void e() {
        RenderNode renderNode = this.b;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.b = null;
        HardwareRenderer hardwareRenderer = this.a;
        if (hardwareRenderer != null) {
            hardwareRenderer.destroy();
        }
        this.a = null;
    }

    public final Bitmap f(Bitmap bitmap, float f, boolean z) {
        RenderEffect createBlurEffect;
        HardwareBuffer hardwareBuffer;
        Bitmap copy;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        float f2 = f / 1.5f;
        createBlurEffect = RenderEffect.createBlurEffect(f2, f2, z ? Shader.TileMode.DECAL : Shader.TileMode.MIRROR);
        RenderNode renderNode = this.b;
        if (renderNode == null) {
            renderNode = new RenderNode("BlurEffect");
            this.b = renderNode;
        }
        renderNode.setPosition(0, 0, bitmap.getWidth(), bitmap.getHeight());
        renderNode.setRenderEffect(createBlurEffect);
        renderNode.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        renderNode.endRecording();
        ImageReader newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
        HardwareRenderer hardwareRenderer = this.a;
        if (hardwareRenderer == null) {
            hardwareRenderer = new HardwareRenderer();
            this.a = hardwareRenderer;
        }
        hardwareRenderer.setContentRoot(renderNode);
        hardwareRenderer.setSurface(newInstance.getSurface());
        hardwareRenderer.setOpaque(false);
        hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
        Image acquireNextImage = newInstance.acquireNextImage();
        if (acquireNextImage != null && (hardwareBuffer = acquireNextImage.getHardwareBuffer()) != null) {
            try {
                Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, bitmap.getColorSpace());
                if (wrapHardwareBuffer == null) {
                    copy = rzo.B(bitmap);
                } else if (z) {
                    Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
                    if (config2 != null) {
                        config = config2;
                    }
                    copy = wrapHardwareBuffer.copy(config, false);
                } else {
                    copy = wrapHardwareBuffer.copy(config, false);
                }
                hardwareBuffer.close();
                acquireNextImage.close();
                return copy;
            } catch (Throwable th) {
                hardwareBuffer.close();
                acquireNextImage.close();
                throw th;
            }
        }
        return rzo.B(bitmap);
    }
}
