package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;

/* compiled from: PhotoStripHelper.kt */
/* loaded from: classes17.dex */
public final class pba0 {
    public static final /* synthetic */ int a = 0;

    static {
        iah0.a(24);
        iah0.b(2.0f);
        iah0.b(0.5f);
    }

    public static double a(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        return (Math.acos((f3 - f) / ((float) Math.sqrt((f5 * f5) + (r4 * r4)))) * 180.0d) / 3.141592653589793d;
    }

    public static Bitmap b(Context context, int i, int i2, float f, float f2, float f3, ArrayList arrayList) {
        int i3;
        int i4;
        Paint paint;
        Path path;
        Paint paint2;
        int i5 = i;
        int i6 = i2;
        float f4 = f2;
        ArrayList arrayList2 = arrayList;
        Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect();
        RectF rectF = new RectF();
        Path path2 = new Path();
        Paint paint3 = new Paint(1);
        paint3.setColor(context.getColor(R.color.vk_black_alpha8));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(f3);
        Paint paint4 = new Paint(1);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint5 = new Paint(3);
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            int b = an10.b(i6 - f) * i7;
            if (b + i6 > i5) {
                break;
            }
            float f5 = b;
            int b2 = an10.b(f5);
            float f6 = i6;
            int b3 = an10.b(f5 + f6);
            rect.set(b2, 0, b3, i6);
            float f7 = (b2 + b3) / 2.0f;
            float f8 = f6 / 2.0f;
            float f9 = f3 / 2.0f;
            Bitmap bitmap = createBitmap;
            if (i7 == 0) {
                canvas.drawBitmap((Bitmap) arrayList2.get(i7), (Rect) null, rect, paint5);
                canvas.drawCircle(f7, f8, f8 - f9, paint3);
                i4 = i7;
                paint = paint4;
                i3 = size;
                path = path2;
                paint2 = paint3;
            } else {
                Paint paint6 = paint4;
                float f10 = 0;
                float f11 = (f10 / 2.0f) + f8;
                float f12 = -f11;
                float f13 = 2;
                int i8 = i7;
                float b4 = u11.b(1, f4, f11 * f13, f12);
                float f14 = f11 + 0.5f;
                float f15 = f7 - ((f8 * f13) * f4);
                float f16 = f15 - f14;
                float f17 = b3;
                Path path3 = path2;
                canvas = canvas;
                i3 = size;
                int saveLayer = canvas.saveLayer(f16, f10, f17, f6, paint5);
                i4 = i8;
                canvas.drawBitmap((Bitmap) arrayList2.get(i8), (Rect) null, rect, paint5);
                canvas.drawCircle(f15, f8, f14, paint6);
                canvas.restoreToCount(saveLayer);
                float f18 = f8 - b4;
                float f19 = ((f18 * f18) + ((f14 * f14) - (f8 * f8))) / (f18 * 2.0f);
                paint = paint6;
                float sqrt = (float) Math.sqrt(r4 - (f19 * f19));
                float a2 = uq.a(f19, f18, f18, b4);
                float f20 = f8 - f8;
                float a3 = uq.a(f19, f20, f18, f8);
                float a4 = uq.a(sqrt, f20, f18, a2);
                float f21 = a3 - ((sqrt * f18) / f18);
                path3.reset();
                double a5 = a(b4, f8, a4, f21);
                rectF.set(f16 - f9, (f8 - f14) - f9, f15 + f14 + f9, f8 + f14 + f9);
                float f22 = (float) a5;
                path = path3;
                path.addArc(rectF, -f22, f22 * 2.0f);
                double a6 = a(f8, f8, a4, f21);
                rectF.set(b2 + f9, f10 + f9, f17 - f9, f6 - f9);
                float f23 = (float) a6;
                path.addArc(rectF, -f23, f23 * 2.0f);
                paint2 = paint3;
                canvas.drawPath(path, paint2);
            }
            i7 = i4 + 1;
            i6 = i2;
            f4 = f2;
            arrayList2 = arrayList;
            paint3 = paint2;
            path2 = path;
            size = i3;
            createBitmap = bitmap;
            paint4 = paint;
            i5 = i;
        }
        return createBitmap;
    }

    public static Pair c(float f, int i, int i2, int i3) {
        if (i3 <= 0) {
            return new Pair(0, Integer.valueOf(i2));
        }
        return new Pair(Integer.valueOf(((i3 - 1) * (i - ((int) f))) + i), Integer.valueOf(i2));
    }
}
