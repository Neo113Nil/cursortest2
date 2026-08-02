package xsna;

import android.graphics.Bitmap;
import kotlin.Pair;
import xsna.sg90;

/* compiled from: ActionButtonColorsHelperImpl.kt */
/* loaded from: classes17.dex */
public final class su {
    public final ojh0 a;

    public su(ojh0 ojh0Var) {
        this.a = ojh0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<cut0, cut0> a(sg90 sg90Var) {
        Object obj;
        sg90.d dVar = (sg90.d) sg90Var.c.get(v3o0.e);
        if (dVar == null) {
            gw.a.getClass();
            return new Pair<>(gw.b, gw.c);
        }
        int i = dVar.d;
        b8g b8gVar = new b8g(i);
        if (l8g.e(i) > 0.75f) {
            dVar.a();
            obj = new b8g(dVar.h);
        } else {
            gw.a.getClass();
            obj = gw.c;
        }
        return new Pair<>(b8gVar, obj);
    }

    public final Bitmap b(Bitmap bitmap) {
        if (bitmap.getWidth() != 35 || bitmap.getHeight() != 35) {
            int width = bitmap.getWidth();
            if (35 <= width) {
                width = 35;
            }
            int height = bitmap.getHeight();
            Bitmap d = kd7.d(width, 35 > height ? height : 35);
            if (d != null) {
                this.a.d(bitmap, d);
                return d;
            }
        }
        return bitmap;
    }
}
