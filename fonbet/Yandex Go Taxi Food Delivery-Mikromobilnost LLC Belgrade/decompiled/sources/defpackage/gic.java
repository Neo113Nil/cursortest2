package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.ybsdk.widgets.common.BlendingGradientView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.ui.api.car.CarIconPart$Layer;

/* loaded from: classes10.dex */
public final class gic {
    public static Bitmap a(int i, int i2, int i3, int i4, int i5, ArrayList arrayList) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect();
        rect.left = i4;
        rect.top = i5;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z48 z48Var = (z48) it.next();
            rect.right = z48Var.a().getWidth() + rect.left;
            rect.bottom = z48Var.a().getHeight() + rect.top;
            canvas.drawBitmap(z48Var.a(), (Rect) null, rect, c(i, z48Var.b()));
        }
        return createBitmap;
    }

    public static Bitmap b(int i, int i2, int i3, List list) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z48 z48Var = (z48) it.next();
            canvas.drawBitmap(z48Var.a(), (Rect) null, new Rect(0, 0, i2, i3), c(i, z48Var.b()));
        }
        return createBitmap;
    }

    public static Paint c(int i, CarIconPart$Layer carIconPart$Layer) {
        Paint paint;
        switch (fic.a[carIconPart$Layer.ordinal()]) {
            case 1:
                Paint paint2 = new Paint();
                paint2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                paint = paint2;
                break;
            case 2:
                paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
                break;
            case 3:
                paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
                paint.setAlpha(76);
                break;
            case 4:
                paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                paint.setAlpha(63);
                break;
            case 5:
            case 6:
                paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
                paint.setAlpha(BlendingGradientView.BASE_ALPHA);
                break;
            case 7:
                paint = new Paint();
                break;
            default:
                w511.b();
                return null;
        }
        paint.setFilterBitmap(true);
        return paint;
    }
}
