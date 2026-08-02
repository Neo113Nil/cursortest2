package xsna;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* compiled from: ErasePathBrush.kt */
/* loaded from: classes4.dex */
public final class uup implements cq90, w980 {
    public float a;
    public final Paint b;

    public uup(float f) {
        this.a = f;
        Paint paint = new Paint();
        paint.setARGB(255, 0, 0, 0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(this.a);
        paint.setStyle(Paint.Style.STROKE);
        this.b = paint;
    }

    @Override // xsna.cq90
    public final void a(mlo mloVar, Path path) {
        mloVar.b(new td0(16, path, this));
    }

    @Override // xsna.al8
    public final boolean b() {
        return true;
    }

    @Override // xsna.cq90
    public final cq90 copy() {
        return new uup(this.a);
    }

    @Override // xsna.w980
    public final void d(Matrix matrix) {
        float min = Math.min(nn10.d(matrix), nn10.e(matrix)) * this.a;
        this.a = min;
        this.b.setStrokeWidth(min);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uup) && Float.compare(this.a, ((uup) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "ErasePathBrush(strokeWidth=" + this.a + ")";
    }
}
