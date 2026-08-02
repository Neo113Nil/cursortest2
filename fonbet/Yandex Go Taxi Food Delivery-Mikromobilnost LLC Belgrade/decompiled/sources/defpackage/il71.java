package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes11.dex */
public final class il71 {
    public final View a;
    public final RectF b;
    public final Path c;
    public final float[] d;

    public il71(View view, float f, float f2, float f3, float f4) {
        RectF rectF = new RectF();
        Path path = new Path();
        this.a = view;
        this.b = rectF;
        this.c = path;
        this.d = (f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f) ? new float[]{f, f, f2, f2, f3, f3, f4, f4} : null;
    }

    public final void a() {
        float[] fArr = this.d;
        if (fArr != null) {
            View view = this.a;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = measuredWidth - view.getPaddingRight();
            int paddingBottom = measuredHeight - view.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            RectF rectF = this.b;
            rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            Path path = this.c;
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
    }
}
