package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public final class gi10 {
    public final Context a;
    public final double b;
    public final boolean c;
    public final boolean d;

    public gi10(Context context) {
        this.a = context;
        Bitmap.Config[] configArr = m.a;
        double d = 0.2d;
        try {
            if (((ActivityManager) context.getSystemService(ActivityManager.class)).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.b = d;
        this.c = true;
        this.d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bdi0 a() {
        jln jlnVar;
        int i;
        int i2;
        w941 udi0Var = this.d ? new udi0() : new mxn();
        if (this.c) {
            double d = this.b;
            if (d > 0.0d) {
                Context context = this.a;
                Bitmap.Config[] configArr = m.a;
                try {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                    i2 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    i2 = 256;
                }
                i = (int) (d * i2 * 1024.0d * 1024.0d);
            } else {
                i = 0;
            }
            if (i > 0) {
                yxf0 yxf0Var = new yxf0();
                yxf0Var.a = udi0Var;
                yxf0Var.b = new t5e(i, yxf0Var);
                jlnVar = yxf0Var;
            } else {
                jlnVar = new jln(4, udi0Var);
            }
        } else {
            jlnVar = new jln(4, udi0Var);
        }
        return new bdi0(jlnVar, udi0Var);
    }
}
