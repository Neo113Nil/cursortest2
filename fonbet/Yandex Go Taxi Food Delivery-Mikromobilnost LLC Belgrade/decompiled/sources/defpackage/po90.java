package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Collection;
import java.util.List;

/* loaded from: classes12.dex */
public final class po90 extends vhr0 {
    public final int g;
    public final int h;
    public boolean i;
    public final int j;
    public final float k;

    public po90(int i, int i2, int i3, int i4) {
        super(i4, i);
        this.g = i2;
        this.h = i3;
        this.j = (int) uh6.o(16.0f);
        this.k = uh6.o(42.0f);
    }

    @Override // defpackage.vhr0
    public final void a(List list) {
        boolean z = false;
        if (list.isEmpty()) {
            this.i = false;
            return;
        }
        Rect rect = new Rect(this.e.getBounds());
        int i = this.j;
        rect.inset(-i, -i);
        List<Point> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Point point : list2) {
                if (!rect.contains(point.x, point.y)) {
                    break;
                }
            }
        }
        z = true;
        this.i = z;
    }

    @Override // defpackage.vhr0
    public final boolean b() {
        return this.i;
    }

    @Override // defpackage.vhr0
    public final void c(Rect rect, Path path, Matrix matrix) {
        matrix.setTranslate(rect.left, rect.top);
        RectF rectF = new RectF(0.0f, 0.0f, rect.width(), rect.height());
        float f = this.k;
        path.addRoundRect(rectF, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CW);
    }

    @Override // defpackage.vhr0
    public final void d(Canvas canvas, Paint paint) {
        paint.setColor(this.i ? this.g : this.h);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Path path = new Path();
        RectF rectF = new RectF();
        this.d.computeBounds(rectF, true);
        RectF rectF2 = new RectF(rectF);
        float min = Math.min(rectF2.width(), rectF2.height()) * 0.14f;
        float f = rectF2.left;
        float f2 = rectF2.top;
        float f3 = this.k;
        path.moveTo(f, f2 + f3 + min);
        path.lineTo(rectF2.left, rectF2.top + f3);
        float f4 = rectF2.left;
        float f5 = rectF2.top;
        float f6 = f3 * 2.0f;
        path.arcTo(f4, f5, f6 + f4, f6 + f5, 180.0f, 90.0f, false);
        path.lineTo(rectF2.left + f3 + min, rectF2.top);
        path.moveTo((rectF2.right - f3) - min, rectF2.top);
        path.lineTo(rectF2.right - f3, rectF2.top);
        float f7 = rectF2.right;
        float f8 = rectF2.top;
        path.arcTo(f7 - f6, f8, f7, f6 + f8, -90.0f, 90.0f, false);
        path.lineTo(rectF2.right, rectF2.top + f3 + min);
        path.moveTo(rectF2.right, (rectF2.bottom - f3) - min);
        path.lineTo(rectF2.right, rectF2.bottom - f3);
        float f9 = rectF2.right;
        float f10 = rectF2.bottom;
        path.arcTo(f9 - f6, f10 - f6, f9, f10, 0.0f, 90.0f, false);
        path.lineTo((rectF2.right - f3) - min, rectF2.bottom);
        path.moveTo(rectF2.left + f3 + min, rectF2.bottom);
        path.lineTo(rectF2.left + f3, rectF2.bottom);
        float f11 = rectF2.left;
        float f12 = rectF2.bottom;
        path.arcTo(f11, f12 - f6, f6 + f11, f12, 90.0f, 90.0f, false);
        path.lineTo(rectF2.left, (rectF2.bottom - f3) - min);
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.vhr0
    public final void e() {
        this.i = false;
    }
}
