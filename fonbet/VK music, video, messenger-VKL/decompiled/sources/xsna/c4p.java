package xsna;

import android.graphics.BitmapFactory;
import xsna.b4p;

/* compiled from: EditorImageFactoryExt.kt */
/* loaded from: classes4.dex */
public final class c4p {
    public static final int a(int i, int i2, int i3, int i4) {
        if (i <= i3 && i2 <= i4) {
            return 1;
        }
        int i5 = (i > 5120 || i2 > 5120) ? 2 : 1;
        int i6 = i / 2;
        int i7 = i2 / 2;
        while (i7 / i5 >= i4 && i6 / i5 >= i3) {
            i5 *= 2;
        }
        return i5;
    }

    public static final BitmapFactory.Options b(b4p.a aVar, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        options.inScaled = false;
        options.inSampleSize = ((aVar instanceof b4p.a.C2587a) || aVar.equals(b4p.a.b.e)) ? a(i, i2, 5120, 5120) : a(i, i2, aVar.a, aVar.b);
        return options;
    }
}
