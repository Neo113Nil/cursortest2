package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* loaded from: classes7.dex */
public final class ev81 {
    public static Bitmap a(Bitmap bitmap, cu81 cu81Var) {
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return bitmap;
        }
        int i = cu81Var.a;
        int i2 = cu81Var.b;
        if (i == 0 || i2 == 0 || bitmap.getWidth() * i2 == bitmap.getHeight() * i) {
            return bitmap;
        }
        vn61 vn61Var = new vn61(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && i != 0 && i2 != 0) {
            c6w it = new d6w(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (i * 100) / i2)), 1).iterator();
            double d = 1.0d;
            while (true) {
                if (!it.c) {
                    break;
                }
                int nextInt = it.nextInt();
                int i3 = nextInt * i2;
                if (i3 % i == 0) {
                    vn61Var = new vn61(nextInt, i3 / i);
                    break;
                }
                double d2 = i3 / i;
                int a = m810.a(d2);
                double abs = Math.abs(a - d2) / d2;
                if (abs < d) {
                    vn61Var = new vn61(nextInt, a);
                    d = abs;
                }
            }
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = vn61Var.a;
        vn61 vn61Var2 = new vn61(i4, (i4 * height) / width);
        int i5 = vn61Var.b;
        vn61 vn61Var3 = (vn61) vvc.c(vn61Var2, new vn61((width * i5) / height, i5));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, vn61Var3.a, vn61Var3.b, false);
        int width2 = (createScaledBitmap.getWidth() - i4) / 2;
        int height2 = createScaledBitmap.getHeight();
        int i6 = vn61Var.b;
        return Bitmap.createBitmap(createScaledBitmap, width2, (height2 - i6) / 2, vn61Var.a, i6, (Matrix) null, false);
    }
}
