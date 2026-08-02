package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes6.dex */
public final class b6p0 {
    public final Context a;

    public b6p0(Context context) {
        this.a = context;
    }

    public final void a(xm00 xm00Var, Point point, int i) {
        f4c0 r = xm00Var.r(point);
        Paint f = unr0.f(true);
        Context context = this.a;
        int u = tje.u(12, context);
        Bitmap createBitmap = Bitmap.createBitmap(u, u, Bitmap.Config.ARGB_8888);
        float f2 = u / 2.0f;
        Canvas canvas = new Canvas(createBitmap);
        f.setColor(qje.u(context.getTheme(), xng0.bgMain));
        canvas.drawCircle(f2, f2, tje.x(context, 5.0f), f);
        f.setColor(i);
        canvas.drawCircle(f2, f2, tje.x(context, 4.0f), f);
        r.x(createBitmap);
    }
}
