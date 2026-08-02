package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VideoMsgStencilView.kt */
/* loaded from: classes6.dex */
public final class hxs0 extends ImageView {
    public final Path b;
    public final Matrix c;
    public Bitmap d;
    public final int e;
    public final int f;
    public final int g;
    public final Path h;
    public final Path i;
    public final Path j;
    public final Path k;
    public final Matrix l;
    public final Paint m;
    public BitmapShader n;
    public final Matrix o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;

    public hxs0(Context context) {
        super(context, null, 0);
        this.b = new Path();
        this.c = new Matrix();
        this.e = iah0.a(16);
        this.f = Color.parseColor("#E5F1FD");
        this.g = Color.parseColor("#9CCCFC");
        this.h = new Path();
        this.i = new Path();
        this.j = new Path();
        this.k = new Path();
        this.l = new Matrix();
        this.m = new Paint(1);
        this.o = new Matrix();
        this.p = true;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
    }

    public final void a(int i, int i2) {
        if (i == this.s && i2 == this.t) {
            return;
        }
        this.s = i;
        this.t = i2;
        Bitmap bitmap = this.d;
        Paint paint = this.m;
        if (bitmap == null) {
            paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, this.f, this.g, Shader.TileMode.CLAMP));
            return;
        }
        BitmapShader bitmapShader = this.n;
        if (bitmapShader == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.n = bitmapShader;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f = i;
        float f2 = i2;
        float max = Math.max(f / width, f2 / height);
        float a = yq.a(width, max, f, 2.0f);
        float f3 = (f2 - (height * max)) / 2.0f;
        Matrix matrix = this.o;
        matrix.reset();
        matrix.setScale(max, max);
        matrix.postTranslate(a, f3);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
    }

    public final void b(int i, int i2) {
        Path path = this.b;
        if (path.isEmpty() || i <= 0 || i2 <= 0) {
            return;
        }
        Path path2 = new Path(path);
        int i3 = i - (this.e * 2);
        if (i3 < 0) {
            i3 = 0;
        }
        int min = Math.min(i3, i2);
        RectF rectF = new RectF();
        path2.computeBounds(rectF, true);
        float f = min;
        float max = f / Math.max(rectF.width(), rectF.height());
        Matrix matrix = this.l;
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.postScale(max, max);
        matrix.postTranslate((f - (rectF.width() * max)) / 2.0f, (f - (rectF.height() * max)) / 2.0f);
        path2.transform(matrix);
        matrix.reset();
        matrix.setTranslate((i - min) / 2.0f, (i2 - min) / 2.0f);
        path2.transform(matrix);
        path2.transform(this.c);
        Path path3 = this.h;
        path3.reset();
        path3.set(path2);
        Path path4 = this.i;
        path4.reset();
        path4.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, Path.Direction.CW);
        path4.addPath(path3);
        path4.setFillType(Path.FillType.EVEN_ODD);
        this.p = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int width2 = getWidth();
        Paint paint = this.m;
        if (width == width2 && height == getHeight()) {
            a(width, height);
            canvas.drawPath(this.i, paint);
            return;
        }
        boolean z = this.p;
        Path path = this.k;
        if (z || width != this.q || height != this.r) {
            this.q = width;
            this.r = height;
            this.p = false;
            float f = width;
            float f2 = height;
            float width3 = getWidth();
            float height2 = getHeight();
            if (width3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && height2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float min = Math.min(f / width3, f2 / height2);
                Matrix matrix = this.l;
                matrix.reset();
                matrix.setScale(min, min);
                matrix.postTranslate((f - (width3 * min)) / 2.0f, (f2 - (height2 * min)) / 2.0f);
                Path path2 = this.j;
                path2.reset();
                path2.set(this.h);
                path2.transform(matrix);
                path.reset();
                path.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, Path.Direction.CW);
                path.addPath(path2);
                path.setFillType(Path.FillType.EVEN_ODD);
            }
        }
        a(width, height);
        canvas.drawPath(path, paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.b.isEmpty()) {
            b(i, i2);
        }
        this.s = -1;
        this.t = -1;
        a(i, i2);
    }

    public final void setBackgroundBitmap(Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.d = bitmap;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            bitmapShader = null;
        }
        this.n = bitmapShader;
        this.s = -1;
        this.t = -1;
        invalidate();
    }

    public final void setStencil(String str) {
        this.b.set(rq90.d(str));
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        b(getWidth(), getHeight());
        invalidate();
    }
}
