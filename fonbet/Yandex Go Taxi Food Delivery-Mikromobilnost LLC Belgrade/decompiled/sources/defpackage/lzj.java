package defpackage;

import android.graphics.PointF;
import android.view.Display;

/* loaded from: classes10.dex */
public final class lzj extends t920 {
    public final float b;
    public final float c;
    public final Display d;
    public final ar7 e;

    public lzj(Display display, ar7 ar7Var, float f, float f2) {
        this.b = f;
        this.c = f2;
        this.d = display;
        this.e = ar7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // defpackage.t920
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(float f, float f2) {
        ar7 ar7Var = this.e;
        int i = 0;
        boolean z = ar7Var.d() == 0;
        try {
            int i2 = ar7Var.i(this.d.getRotation());
            i = z ? (360 - i2) % 360 : i2;
        } catch (Exception unused) {
        }
        float f3 = this.b;
        float f4 = this.c;
        if (i != 90 && i != 270) {
            f3 = f4;
            f4 = f3;
            f2 = f;
            f = f2;
        }
        if (i != 90) {
            if (i != 180) {
                if (i == 270) {
                    f2 = f4 - f2;
                }
                if (z) {
                    f2 = f4 - f2;
                }
                return new PointF(f2 / f4, f / f3);
            }
            f2 = f4 - f2;
        }
        f = f3 - f;
        if (z) {
        }
        return new PointF(f2 / f4, f / f3);
    }
}
