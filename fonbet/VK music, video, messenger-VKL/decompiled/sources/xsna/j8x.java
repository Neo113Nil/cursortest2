package xsna;

import android.content.Context;
import com.ironsource.X3;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class j8x extends t46 {
    public final int e;
    public final Context f;
    public int g;
    public int h;
    public yh0 i;
    public vcz0 j;
    public vhz0 k;
    public ipy0 l;

    public j8x(int i, int i2, Context context) {
        super(context, i, "instreamresearch");
        this.g = 0;
        this.h = -1;
        this.e = i2;
        this.f = context;
        String str = gt50.a;
        gu8.d("Instream research ad created. Version - 5.50.2");
    }

    public static String c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "completed" : X3.i.e0 : X3.i.d0 : "idle";
    }

    public final void d(String str) {
        ipy0 ipy0Var = this.l;
        if (ipy0Var != null) {
            e5z0 e5z0Var = ipy0Var.a;
            if (h8z0.a != null) {
                b6z0 j = e5z0Var.j(str);
                if (j.c.isEmpty()) {
                    return;
                }
                h8z0.a.a(j, null, 999, null);
            }
        }
    }
}
