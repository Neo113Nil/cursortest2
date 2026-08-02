package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Pair;
import xsna.ykr0;

/* compiled from: VectorBackgroundFactory.kt */
/* loaded from: classes14.dex */
public final class zkr0 {
    public static final b06 d = new b06((byte) 0, 7);
    public final hne a;
    public final cs7 b;
    public final b06 c = d;

    public zkr0(hne hneVar, cs7 cs7Var) {
        this.a = hneVar;
        this.b = cs7Var;
    }

    public static final void a(float[] fArr, int i, int i2, float f) {
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        double d2 = f;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float abs = Math.abs(f2 / cos);
        float abs2 = Math.abs(f3 / sin);
        Pair pair = abs >= abs2 ? new Pair(Float.valueOf(Math.abs(abs2 * cos)), Float.valueOf(f3)) : new Pair(Float.valueOf(f2), Float.valueOf(Math.abs(abs * sin)));
        float floatValue = ((Number) pair.d()).floatValue();
        float floatValue2 = ((Number) pair.g()).floatValue();
        if (cos >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && sin >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr[0] = f2 + floatValue;
            fArr[1] = f3 - floatValue2;
            return;
        }
        if (cos < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && sin >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr[0] = f2 - floatValue;
            fArr[1] = f3 - floatValue2;
        } else if (cos < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && sin < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr[0] = f2 - floatValue;
            fArr[1] = f3 + floatValue2;
        } else {
            if (cos < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || sin >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            fArr[0] = f2 + floatValue;
            fArr[1] = f3 + floatValue2;
        }
    }

    public final Bitmap b(ykr0 ykr0Var, int i, int i2) throws IllegalStateException {
        if (Looper.getMainLooper().isCurrentThread()) {
            throw new IllegalStateException("Do not rasterize on main thread. Complex computations are doing here!");
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        b06 b06Var = this.c;
        Bitmap bitmap = (Bitmap) b06Var.invoke(valueOf, valueOf2);
        ykr0.c cVar = ykr0Var.c;
        if (cVar != null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = cVar.b;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
            float[] fArr = new float[2];
            a(fArr, width, height, f);
            rectF.left = fArr[0];
            rectF.top = fArr[1];
            a(fArr, width, height, (f + 180.0f) % 360);
            rectF.right = fArr[0];
            rectF.bottom = fArr[1];
            paint.setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, j5g.N0(cVar.a), (float[]) null, Shader.TileMode.CLAMP));
            new Canvas(bitmap).drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight(), paint);
        }
        List<ykr0.b> list = ykr0Var.b;
        Canvas canvas = new Canvas(bitmap);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        for (ykr0.b bVar : list) {
            paint2.setColor(bVar.c);
            float width2 = bitmap.getWidth() * bVar.a;
            float height2 = bitmap.getHeight() * bVar.b;
            float width3 = bitmap.getWidth() * bVar.d;
            float height3 = bitmap.getHeight() * bVar.e;
            canvas.drawOval(width2 - width3, height2 - height3, width3 + width2, height3 + height2, paint2);
        }
        ykr0.a aVar = ykr0Var.d;
        if (aVar != null) {
            this.a.invoke(bitmap, Float.valueOf(aVar.c));
            new Canvas(bitmap).drawColor((swe0.g((int) (aVar.b * 255), 0, 255) << 24) | (aVar.a & 16777215));
        }
        ykr0.d dVar = ykr0Var.a;
        if (dVar != null) {
            Drawable drawable = (Drawable) this.b.invoke(dVar.a, Integer.valueOf(dVar.b), Integer.valueOf(dVar.c));
            int width4 = bitmap.getWidth();
            int height4 = bitmap.getHeight();
            ho3 ho3Var = new ho3(this, dVar, bitmap, drawable, 2);
            Bitmap bitmap2 = (Bitmap) b06Var.invoke(Integer.valueOf(width4), Integer.valueOf(height4));
            ho3Var.invoke(bitmap2);
            bitmap2.recycle();
        }
        return bitmap;
    }
}
