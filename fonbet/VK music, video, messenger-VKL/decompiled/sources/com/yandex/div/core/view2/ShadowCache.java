package com.yandex.div.core.view2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ShadowCache.kt */
/* loaded from: classes7.dex */
public final class ShadowCache {
    public static final ShadowCache INSTANCE = new ShadowCache();
    private static final Paint paint = new Paint();
    private static final Map<ShadowCacheKey, NinePatch> shadowMap = new LinkedHashMap();

    /* compiled from: ShadowCache.kt */
    public static final class ShadowCacheKey {
        private final float blur;
        private final float[] radii;

        public ShadowCacheKey(float[] fArr, float f) {
            this.radii = fArr;
            this.blur = f;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ShadowCacheKey)) {
                return false;
            }
            ShadowCacheKey shadowCacheKey = (ShadowCacheKey) obj;
            return this.blur == shadowCacheKey.blur && Arrays.equals(this.radii, shadowCacheKey.radii);
        }

        public int hashCode() {
            return Float.hashCode(this.blur) + (Arrays.hashCode(this.radii) * 31);
        }
    }

    private ShadowCache() {
    }

    private final NinePatch createNewShadow(float[] fArr, float f, BitmapEffectHelper bitmapEffectHelper) {
        float max = Math.max(fArr[1] + fArr[2], fArr[5] + fArr[6]) + f;
        float max2 = Math.max(fArr[0] + fArr[7], fArr[3] + fArr[4]) + f;
        if (max <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || max2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return null;
        }
        float coercedBlurRadius = bitmapEffectHelper.getCoercedBlurRadius(f);
        float bitmapScale = bitmapEffectHelper.getBitmapScale(f);
        float f2 = f * 2;
        Bitmap createBitmap = Bitmap.createBitmap((int) ((max + f2) * bitmapScale), (int) ((f2 + max2) * bitmapScale), Bitmap.Config.ALPHA_8);
        drawNewShadow(createBitmap, max, max2, fArr, coercedBlurRadius, bitmapScale);
        Bitmap blurShadow = bitmapEffectHelper.blurShadow(createBitmap, coercedBlurRadius);
        createBitmap.recycle();
        if (bitmapScale < 1.0f) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(blurShadow, (int) (blurShadow.getWidth() / bitmapScale), (int) (blurShadow.getHeight() / bitmapScale), true);
            blurShadow.recycle();
            blurShadow = createScaledBitmap;
        }
        return toNinePatch(blurShadow);
    }

    private final byte[] createNinePatchChunk(int i, int i2) {
        int i3 = i2 / 2;
        int i4 = i / 2;
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i4 - 1);
        order.putInt(i4 + 1);
        order.putInt(i3 - 1);
        order.putInt(i3 + 1);
        for (int i5 = 0; i5 < 9; i5++) {
            order.putInt(1);
        }
        return order.array();
    }

    private final void drawNewShadow(Bitmap bitmap, float f, float f2, float[] fArr, float f3, float f4) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        roundRectShape.resize(f, f2);
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmap);
        int save = canvas.save();
        canvas.translate(f3, f3);
        try {
            save = canvas.save();
            canvas.scale(f4, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            roundRectShape.draw(canvas, paint);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    private final NinePatch toNinePatch(Bitmap bitmap) {
        return new NinePatch(bitmap, createNinePatchChunk(bitmap.getWidth(), bitmap.getHeight()));
    }

    public final NinePatch getShadow(float[] fArr, float f, BitmapEffectHelper bitmapEffectHelper) {
        ShadowCacheKey shadowCacheKey = new ShadowCacheKey(fArr, f);
        Map<ShadowCacheKey, NinePatch> map = shadowMap;
        NinePatch ninePatch = map.get(shadowCacheKey);
        if (ninePatch != null) {
            return ninePatch;
        }
        NinePatch createNewShadow = createNewShadow(fArr, f, bitmapEffectHelper);
        if (createNewShadow == null) {
            return null;
        }
        map.put(shadowCacheKey, createNewShadow);
        return createNewShadow;
    }
}
