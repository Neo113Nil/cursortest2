package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;

/* loaded from: classes6.dex */
public final class lyk0 extends kyk0 {
    public final View a;
    public final float[] b = new float[8];
    public final Path c = new Path();

    public lyk0(View view) {
        this.a = view;
    }

    @Override // defpackage.kyk0
    public final void a(Canvas canvas, sls slsVar) {
        int save = canvas.save();
        canvas.clipPath(this.c);
        slsVar.invoke();
        canvas.restoreToCount(save);
    }

    @Override // defpackage.kyk0
    public final void b(float f, float f2) {
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            float[] fArr = this.b;
            fArr[i2] = f;
            fArr[i2 + 1] = f2;
        }
        View view = this.a;
        d(view.getWidth(), view.getHeight());
        view.invalidate();
    }

    @Override // defpackage.kyk0
    public final void c(float f, float f2, float f3, float f4) {
        float[] fArr = this.b;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
        View view = this.a;
        d(view.getWidth(), view.getHeight());
        view.invalidate();
    }

    @Override // defpackage.kyk0
    public final void d(int i, int i2) {
        Path path = this.c;
        path.reset();
        path.addRoundRect(0.0f, 0.0f, i, i2, this.b, Path.Direction.CW);
        path.close();
    }
}
