package yads;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import xsna.an10;
import xsna.j9x;
import xsna.jw5;
import xsna.k9x;

/* loaded from: classes10.dex */
public final class uj2 {
    public final ap a;

    public /* synthetic */ uj2() {
        this(new ap());
    }

    public final Bitmap a(Bitmap bitmap, x41 x41Var) {
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || x41Var.a == 0 || x41Var.b == 0) {
            return bitmap;
        }
        if (bitmap.getWidth() * x41Var.b == bitmap.getHeight() * x41Var.a) {
            return bitmap;
        }
        this.a.getClass();
        c13 c13Var = new c13(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && x41Var.a != 0 && x41Var.b != 0) {
            j9x it = new k9x(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (x41Var.a * 100) / x41Var.b)), 1).iterator();
            double d = 1.0d;
            while (true) {
                if (!it.d) {
                    break;
                }
                int nextInt = it.nextInt();
                int i = x41Var.b * nextInt;
                int i2 = x41Var.a;
                if (i % i2 == 0) {
                    c13Var = new c13(nextInt, i / i2);
                    break;
                }
                double d2 = i / i2;
                int a = an10.a(d2);
                double abs = Math.abs(a - d2) / d2;
                if (abs < d) {
                    c13Var = new c13(nextInt, a);
                    d = abs;
                }
            }
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = c13Var.b;
        c13 c13Var2 = new c13(i3, (i3 * height) / width);
        int i4 = c13Var.c;
        c13 c13Var3 = (c13) jw5.v(c13Var2, new c13((width * i4) / height, i4));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, c13Var3.b, c13Var3.c, false);
        int width2 = (createScaledBitmap.getWidth() - c13Var.b) / 2;
        int height2 = createScaledBitmap.getHeight();
        int i5 = c13Var.c;
        return Bitmap.createBitmap(createScaledBitmap, width2, (height2 - i5) / 2, c13Var.b, i5, (Matrix) null, false);
    }

    public uj2(ap apVar) {
        this.a = apVar;
    }
}
