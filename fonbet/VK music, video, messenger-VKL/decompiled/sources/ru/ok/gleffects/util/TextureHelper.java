package ru.ok.gleffects.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes9.dex */
public class TextureHelper {
    private static final String TAG = "TextureHelper";

    public static void deleteTexture(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            Log.e(TAG, "Tried to delete empty textures array");
        } else {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
        }
    }

    public static void drawBitmapOnTexture(int i, Bitmap bitmap) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, GLUtils.getInternalFormat(bitmap), bitmap, 0);
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static int[] loadTextureFromBitmap(Bitmap bitmap, boolean z) {
        int[] iArr = {0};
        if (bitmap != null) {
            GLES20.glGenTextures(1, iArr, 0);
            if (iArr[0] != 0) {
                new BitmapFactory.Options().inScaled = false;
                GLES20.glBindTexture(3553, iArr[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                if (bitmap.isRecycled()) {
                    GLES20.glDeleteTextures(1, iArr, 0);
                    iArr[0] = 0;
                    return iArr;
                }
                GLUtils.texImage2D(3553, 0, GLUtils.getInternalFormat(bitmap), bitmap, 0);
                if (z) {
                    bitmap.recycle();
                }
            }
        }
        return iArr;
    }

    public static int[] loadTextureFromResources(Context context, int[] iArr) {
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        GLES20.glGenTextures(iArr.length, iArr2, 0);
        if (iArr2[0] == 0) {
            Log.e(TAG, "Unable to create texture from resource");
            return new int[]{0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        for (int i = 0; i < iArr.length; i++) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), iArr[i], options);
            GLES20.glBindTexture(3553, iArr2[i]);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, decodeResource, 0);
            decodeResource.recycle();
        }
        return iArr2;
    }

    public static int[] loadTextureFromText(int i, String str, float f, int i2, float f2, @Nullable Typeface typeface) {
        float descent;
        float descent2;
        float descent3;
        int breakText;
        if (i == 0) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            i = iArr[0];
            if (i == 0) {
                return new int[]{0, 0, 0};
            }
        }
        String[] split = str.split("\n");
        Paint paint = new Paint(1);
        paint.setTextSize(f);
        paint.setColor(i2);
        paint.setTypeface(typeface);
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        paint.setSubpixelText(true);
        paint.setTextAlign(Paint.Align.CENTER);
        if (str.contains("Й") || str.contains("Ё")) {
            descent = (paint.descent() - paint.ascent()) * 1.1f;
            descent2 = (paint.descent() - paint.ascent()) / 1.9f;
            descent3 = paint.descent();
        } else {
            descent = paint.descent() - paint.ascent();
            descent2 = descent / 2.0f;
            descent3 = paint.descent();
        }
        float f3 = descent2 - descent3;
        float f4 = (typeface == null || !typeface.isItalic()) ? 0.0f : (-f) / 15.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < split.length; i4++) {
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (breakText = paint.breakText(split[i4], true, f2, null)) != split[i4].length()) {
                if (breakText > 3) {
                    split[i4] = split[i4].substring(0, breakText - 3) + "...";
                } else {
                    split[i4] = "";
                }
            }
            i3 = Math.max(i3, (int) Math.ceil(paint.measureText(split[i4])));
        }
        int ceil = ((int) Math.ceil(descent)) * split.length;
        int max = Math.max(1, i3) + 2;
        int max2 = Math.max(1, ceil);
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        createBitmap.eraseColor(0);
        for (int i5 = 0; i5 < split.length; i5++) {
            canvas.drawText(split[i5], (max / 2.0f) + f4, (i5 * descent) + (descent / 2.0f) + f3, paint);
        }
        drawBitmapOnTexture(i, createBitmap);
        return new int[]{i, max, max2};
    }

    public static void updateTextureData(int i, Bitmap bitmap) {
        GLES20.glBindTexture(3553, i);
        GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap, GLUtils.getInternalFormat(bitmap), GLUtils.getType(bitmap));
    }
}
