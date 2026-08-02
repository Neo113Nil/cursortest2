package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.mapkit.geometry.Point;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.maas.impl.ride.exitchoice.d;

/* loaded from: classes5.dex */
public final class d100 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ d100(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                dVar.Lg((lgl0) obj);
                break;
            default:
                Triple triple = (Triple) obj;
                List list = (List) triple.getFirst();
                lmo lmoVar = (lmo) triple.getSecond();
                bl00 bl00Var = (bl00) triple.getThird();
                if (!jl40.l(list, dVar.i0)) {
                    dVar.i0 = list;
                    xm00 xm00Var = dVar.d0;
                    if (xm00Var != null) {
                        xm00Var.m();
                    } else {
                        dVar.d0 = dVar.Qg().p();
                    }
                    xm00 xm00Var2 = dVar.d0;
                    if (xm00Var2 == null) {
                        ny61.g("Required value was null.");
                        break;
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ssd0 ssd0Var = ((lmo) it.next()).b.a;
                            f4c0 r = xm00Var2.r(new Point(ssd0Var.a, ssd0Var.b));
                            r.y(dVar.c0);
                            r.k(0.0f);
                        }
                    }
                }
                ssd0 ssd0Var2 = lmoVar.b.a;
                Point point = new Point(ssd0Var2.a, ssd0Var2.b);
                String str = lmoVar.c;
                f4c0 f4c0Var = dVar.b0;
                if (f4c0Var != null) {
                    f4c0Var.d();
                }
                dVar.f0.setText(str);
                f4c0 r2 = dVar.Qg().r(point);
                dVar.b0 = r2;
                Bitmap bitmap = bl00Var.a.get$image();
                Bitmap s = xw31.s(dVar.e0);
                Paint paint = new Paint(1);
                int height = bitmap.getHeight();
                int i2 = 0;
                while (true) {
                    if (i2 < height) {
                        int width = bitmap.getWidth();
                        for (int i3 = 0; i3 < width; i3++) {
                            if (Color.alpha(bitmap.getPixel(i3, i2)) <= 0) {
                            }
                        }
                        i2++;
                    } else {
                        i2 = -1;
                    }
                }
                int max = Math.max(s.getWidth(), bitmap.getWidth());
                int height2 = bitmap.getHeight() + s.getHeight();
                Bitmap createBitmap = Bitmap.createBitmap(max, height2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(s, (max - s.getWidth()) / 2, 0.0f, paint);
                int width2 = (max - bitmap.getWidth()) / 2;
                canvas.drawBitmap(bitmap, new Rect(0, i2, bitmap.getWidth(), bitmap.getHeight()), new Rect(width2, s.getHeight(), max - width2, height2 - i2), paint);
                r2.x(createBitmap);
                r2.k(1.0f);
                break;
        }
        return zy11Var;
    }
}
