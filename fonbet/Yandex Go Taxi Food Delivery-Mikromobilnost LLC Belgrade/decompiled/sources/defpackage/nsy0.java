package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class nsy0 {
    public final sls a;
    public final g29 b = new g29(0);
    public final v19 c = new v19(Locale.getDefault());

    public nsy0(sls slsVar) {
        this.a = slsVar;
    }

    public final void a(Canvas canvas, Paint paint, float f, float f2, float f3) {
        float f4;
        String str;
        float f5;
        sls slsVar = this.a;
        int height = ((Rect) slsVar.invoke()).height();
        canvas.save();
        canvas.clipRect((Rect) slsVar.invoke());
        float f6 = height;
        g29 g29Var = this.b;
        ArrayList arrayList = g29Var.a;
        int size = arrayList.size();
        if (size == 1) {
            canvas.drawText((String) arrayList.get(0), f2, f3, paint);
        } else if (size == 2) {
            float f7 = g29Var.b;
            if (f7 <= 0.5f) {
                f4 = f3 - ((2.0f * f7) * f6);
                str = (String) arrayList.get(0);
                paint.setAlpha((int) (255.0f - ((4.0f * g29Var.b) * 255.0f)));
                f5 = f;
            } else if (f7 > 1.0f || f7 <= 0.5f) {
                f4 = 100.0f;
                str = "";
                f5 = 0.0f;
            } else {
                f4 = (f3 + f6) - (((2.0f * f7) - 1.0f) * f6);
                str = (String) arrayList.get(1);
                paint.setAlpha((int) (((4.0f * g29Var.b) - 3.0f) * 255.0f));
                f5 = f2;
            }
            canvas.drawText(str, f5, f4, paint);
        }
        canvas.restore();
    }

    public final void b(double d, double d2) {
        g29 g29Var = this.b;
        ArrayList arrayList = g29Var.a;
        ArrayList arrayList2 = g29Var.a;
        arrayList.clear();
        g29Var.b = 0.0f;
        v19 v19Var = this.c;
        if (d < 0.0d || d2 < 0.0d) {
            arrayList2.add(v19Var.a.format(Double.valueOf(d2)));
            return;
        }
        if (d != d2) {
            arrayList2.add(v19Var.a.format(Double.valueOf(d)));
        }
        arrayList2.add(v19Var.a.format(Double.valueOf(d2)));
    }

    public final void c() {
        this.b.getClass();
    }
}
