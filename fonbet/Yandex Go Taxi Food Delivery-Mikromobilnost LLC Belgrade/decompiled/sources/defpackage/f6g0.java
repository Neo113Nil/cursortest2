package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class f6g0 {
    public static boolean a(vz5 vz5Var, float f, int i, int i2, List list, int i3) {
        boolean z = false;
        if (i3 >= 0 && i3 < i2 && i >= 0 && i < i2 && vz5Var.b(i, i3)) {
            boolean z2 = i3 < 7;
            int i4 = i2 - 7;
            boolean z3 = i3 >= i4;
            boolean z4 = i < 7;
            boolean z5 = i >= i4;
            if ((!z2 || !z4) && ((!z2 || !z5) && (!z3 || !z4))) {
                if (!list.isEmpty()) {
                    float f2 = i * f;
                    float f3 = i3 * f;
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (rub1.b((qnf) it.next(), f2, f, f3)) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                return true ^ z;
            }
        }
        return false;
    }

    public static Bitmap b(e6g0 e6g0Var) {
        Path path;
        float f;
        int i;
        int i2;
        List list;
        vz5 a = new s5g0().a(e6g0Var.g, BarcodeFormat.QR_CODE, 1, 1, b.i(new Pair(EncodeHintType.ERROR_CORRECTION, e6g0Var.c.getZxingLevel()), new Pair(EncodeHintType.CHARACTER_SET, "UTF-8"), new Pair(EncodeHintType.MARGIN, 0)));
        int i3 = a.a;
        int i4 = e6g0Var.f;
        float f2 = i4 / i3;
        Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(e6g0Var.a);
        paint.setStyle(Paint.Style.FILL);
        List list2 = e6g0Var.b;
        float f3 = e6g0Var.e;
        Path path2 = new Path();
        path2.setFillType(Path.FillType.WINDING);
        float f4 = f2 / 2.0f;
        float f5 = f4 * f3;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = 0;
            while (i6 < i3) {
                List list3 = list2;
                int i7 = i5;
                if (a(a, f2, i6, i3, list3, i7)) {
                    float f6 = i6 * f2;
                    float f7 = i7 * f2;
                    float f8 = f6 + f2;
                    float f9 = f7 + f2;
                    Path.Direction direction = Path.Direction.CW;
                    Path path3 = path2;
                    path3.addRoundRect(f6, f7, f8, f9, f5, f5, direction);
                    path = path3;
                    f = f5;
                    int i8 = i6;
                    i = i7;
                    if (a(a, f2, i8 + 1, i3, list3, i7)) {
                        path.addRect(f6 + f4, f7, f8 + f4, f9, direction);
                    }
                    i2 = i8;
                    list = list3;
                    if (a(a, f2, i8, i3, list3, i + 1)) {
                        path.addRect(f6, f7 + f4, f8, f9 + f4, direction);
                    }
                } else {
                    path = path2;
                    i = i7;
                    i2 = i6;
                    f = f5;
                    list = list3;
                }
                f5 = f;
                path2 = path;
                list2 = list;
                i6 = i2 + 1;
                i5 = i;
            }
            i5++;
            path2 = path2;
            list2 = list2;
        }
        canvas.drawPath(path2, paint);
        List list4 = e6g0Var.b;
        float f10 = e6g0Var.d;
        Path path4 = new Path();
        path4.setFillType(Path.FillType.EVEN_ODD);
        float f11 = 7.0f * f2;
        int i9 = i3 - 7;
        Iterator it = scc.g(new Pair(0, 0), new Pair(0, Integer.valueOf(i9)), new Pair(Integer.valueOf(i9), 0)).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) ((Pair) it.next()).getFirst()).intValue();
            float intValue2 = ((Number) r8.getSecond()).intValue() * f2;
            float f12 = intValue * f2;
            List list5 = list4;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    if (rub1.b((qnf) it2.next(), intValue2, f11, f12)) {
                        break;
                    }
                }
            }
            float f13 = (f11 / 2.0f) * f10;
            Path.Direction direction2 = Path.Direction.CW;
            Path path5 = path4;
            path5.addRoundRect(intValue2, f12, intValue2 + f11, f12 + f11, f13, f13, direction2);
            float f14 = 5.0f * f2;
            float f15 = intValue2 + f2;
            float f16 = f12 + f2;
            float f17 = (f14 / 2.0f) * f10;
            path5.addRoundRect(f15, f16, f15 + f14, f16 + f14, f17, f17, direction2);
            float f18 = 3.0f * f2;
            float f19 = 2.0f * f2;
            float f20 = intValue2 + f19;
            float f21 = f12 + f19;
            float f22 = (f18 / 2.0f) * f10;
            path5.addRoundRect(f20, f21, f20 + f18, f21 + f18, f22, f22, direction2);
            path4 = path5;
        }
        canvas.drawPath(path4, paint);
        return createBitmap;
    }
}
