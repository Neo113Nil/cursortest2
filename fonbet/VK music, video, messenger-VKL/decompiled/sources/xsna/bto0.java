package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import xsna.sg90;

/* compiled from: TileBackgroundIconTransform.kt */
/* loaded from: classes6.dex */
public final class bto0 extends mk6 {
    public static final LinkedHashMap i = new LinkedHashMap();
    public static final LinkedHashMap j = new LinkedHashMap();
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Paint h;

    public bto0(String str, int i2, int i3, int i4, int i5) {
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        this.h = paint;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return new ppj0("TileBackgroundIconTransform " + this.d + ' ' + this.e + ' ' + this.g + ' ' + this.c);
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        uvf<Bitmap> c = hta0Var.c(this.d, this.e, Bitmap.Config.ARGB_8888);
        try {
            Bitmap r = c.r();
            g(bitmap, r, hta0Var);
            f(r);
            return c.n();
        } finally {
            c.close();
        }
    }

    public final void f(Bitmap bitmap) {
        boolean M = dhr0.M();
        LinkedHashMap linkedHashMap = j;
        LinkedHashMap linkedHashMap2 = i;
        LinkedHashMap linkedHashMap3 = M ? linkedHashMap2 : linkedHashMap;
        String str = this.c;
        if (linkedHashMap3.get(str) != null) {
            return;
        }
        int i2 = this.e;
        int i3 = i2 / 2;
        int i4 = this.d;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i4, i3);
        new Canvas(createBitmap).drawBitmap(bitmap, new Rect(0, i3, i4, i2), new Rect(0, 0, i4, i3), (Paint) null);
        sg90.d dVar = new sg90.b(createBitmap).b().e;
        boolean z = n8g.f(dVar != null ? dVar.d : 0) <= 0.5d;
        createBitmap.recycle();
        if (dhr0.M()) {
            linkedHashMap = linkedHashMap2;
        }
        linkedHashMap.put(str, Boolean.valueOf(z));
    }

    public final void g(Bitmap bitmap, Bitmap bitmap2, hta0 hta0Var) {
        int i2;
        Bitmap createBitmap;
        Canvas canvas = new Canvas(bitmap2);
        int i3 = this.d;
        float width = i3 / bitmap.getWidth();
        int i4 = this.f;
        float height = i4 / bitmap.getHeight();
        if (width < height) {
            width = height;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(width, width);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i3, i4, config);
        new Canvas(createBitmap2).drawBitmap(bitmap, matrix, this.h);
        canvas.drawColor(this.g);
        Bitmap bitmap3 = null;
        canvas.drawBitmap(createBitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        int i5 = this.e;
        int i6 = i5 - i4;
        if (i6 > 0) {
            try {
                Matrix matrix2 = new Matrix();
                matrix2.setScale(1.0f, -1.0f);
                i2 = 0;
                createBitmap = Bitmap.createBitmap(createBitmap2, 0, 0, this.d, this.f, matrix2, true);
                try {
                    canvas.drawBitmap(createBitmap, new Rect(0, 0, i3, i6), new Rect(0, i4, i3, i5), (Paint) null);
                } catch (Throwable th) {
                    th = th;
                    bitmap3 = createBitmap;
                    createBitmap2.recycle();
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            i2 = 0;
            createBitmap = null;
        }
        createBitmap2.recycle();
        if (createBitmap != null) {
            createBitmap.recycle();
        }
        hta0Var.getClass();
        uvf<Bitmap> c = hta0Var.c(i3, i5, Bitmap.Config.ARGB_8888);
        try {
            Bitmap r = c.r();
            Canvas canvas2 = new Canvas(r);
            Rect rect = new Rect(i2, i5 / 2, i3, i5);
            canvas2.drawBitmap(bitmap2, rect, rect, (Paint) null);
            NativeBlurFilter.iterativeBoxBlur(r, 8, 50);
            canvas.drawBitmap(r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        } finally {
            c.close();
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "TileBackgroundIconTransform";
    }
}
