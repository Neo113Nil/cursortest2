package com.yandex.div.core.util.bitmap.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import xsna.swe0;
import xsna.zcl;

/* compiled from: LowApiBitmapEffectHelper.kt */
/* loaded from: classes7.dex */
public final class LowApiBitmapEffectHelper extends BitmapEffectHelper {
    private static final Companion Companion = new Companion(null);
    private RenderScript cachedRenderScript;
    private final Context context;

    /* compiled from: LowApiBitmapEffectHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public LowApiBitmapEffectHelper(Context context) {
        this.context = context;
    }

    private final RenderScript getOrCreateRenderScript() {
        RenderScript renderScript = this.cachedRenderScript;
        if (renderScript != null) {
            return renderScript;
        }
        Context context = this.context;
        RenderScript createMultiContext = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
        this.cachedRenderScript = createMultiContext;
        return createMultiContext;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public Bitmap blurBitmap(Bitmap bitmap, float f) {
        float f2;
        Bitmap createScaledBitmap;
        if (!BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f)) {
            return bitmap;
        }
        RenderScript orCreateRenderScript = getOrCreateRenderScript();
        if (f > 25.0f) {
            f2 = (f * 1.0f) / 25.0f;
            f = 25.0f;
        } else {
            f2 = 1.0f;
        }
        if (f2 == 1.0f) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            createScaledBitmap = bitmap.copy(config, false);
        } else {
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f2), (int) (bitmap.getHeight() / f2), false);
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(orCreateRenderScript, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(orCreateRenderScript, createFromBitmap.getType());
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(orCreateRenderScript, Element.U8_4(orCreateRenderScript));
        create.setRadius(f);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(createScaledBitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        create.destroy();
        return createScaledBitmap;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public Bitmap blurShadow(Bitmap bitmap, float f) {
        if (!BlurUtils.INSTANCE.isBlurParamsValid(bitmap, f)) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ALPHA_8);
        RenderScript orCreateRenderScript = getOrCreateRenderScript();
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(orCreateRenderScript, Element.A_8(orCreateRenderScript));
        Allocation createFromBitmap = Allocation.createFromBitmap(orCreateRenderScript, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(orCreateRenderScript, createBitmap);
        create.setRadius(f);
        create.setInput(createFromBitmap);
        create.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap2.destroy();
        createFromBitmap.destroy();
        create.destroy();
        return createBitmap;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float f) {
        if (f <= 25.0f) {
            return 1.0f;
        }
        return 25.0f / f;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float f) {
        return swe0.f(f, 1.0f, 25.0f);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderScript renderScript = this.cachedRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
        }
        this.cachedRenderScript = null;
    }
}
