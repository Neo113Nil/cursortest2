package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

/* loaded from: classes12.dex */
public final class dee0 extends mw01 {
    public final /* synthetic */ int a;
    public final tfv b;

    public /* synthetic */ dee0(tfv tfvVar, int i) {
        this.a = i;
        this.b = tfvVar;
    }

    @Override // defpackage.mw01
    public final String a() {
        switch (this.a) {
            case 0:
                return ((qfv) this.b).c;
            default:
                return ((rfv) this.b).c;
        }
    }

    @Override // defpackage.mw01
    public final Bitmap b(Bitmap bitmap, xis0 xis0Var) {
        float f;
        float f2;
        int i = this.a;
        tfv tfvVar = this.b;
        switch (i) {
            case 0:
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                okj okjVar = xis0Var.a;
                int i2 = okjVar instanceof kkj ? ((kkj) okjVar).a : width;
                okj okjVar2 = xis0Var.b;
                int i3 = okjVar2 instanceof kkj ? ((kkj) okjVar2).a : height;
                if (width == i2 && height == i3) {
                    return bitmap;
                }
                Matrix matrix = new Matrix();
                qfv qfvVar = (qfv) tfvVar;
                float f3 = 0.0f;
                if (width * i3 > i2 * height) {
                    f = i3 / height;
                    float f4 = (i2 - (width * f)) * qfvVar.a;
                    f2 = 0.0f;
                    f3 = f4;
                } else {
                    f = i2 / width;
                    f2 = (i3 - (height * f)) * qfvVar.b;
                }
                matrix.setScale(f, f);
                matrix.postTranslate((int) (f3 + 0.5f), (int) (f2 + 0.5f));
                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, bb1.e(bitmap));
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(bitmap, matrix, new Paint(3));
                canvas.setBitmap(null);
                return createBitmap;
            default:
                rfv rfvVar = (rfv) tfvVar;
                int b = m810.b((0.5f - rfvVar.a) * 2.0f * bitmap.getWidth());
                int b2 = m810.b((0.5f - rfvVar.b) * 2.0f * bitmap.getHeight());
                if (b == 0 && b2 == 0) {
                    return bitmap;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(Math.abs(b) + bitmap.getWidth(), Math.abs(b2) + bitmap.getHeight(), bb1.e(bitmap));
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(bitmap, Math.max(b, 0), Math.max(b2, 0), new Paint(3));
                canvas2.setBitmap(null);
                return createBitmap2;
        }
    }
}
