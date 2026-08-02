package yads;

import android.content.Context;
import android.view.View;

/* loaded from: classes10.dex */
public final class ad implements jk1 {
    public final boolean a;
    public final lg0 b;
    public final pg0 c;
    public final Context d;

    public /* synthetic */ ad(Context context, boolean z, int i) {
        this(context, (i & 2) != 0 ? false : z, new lg0(), new pg0());
    }

    @Override // yads.jk1
    public final ik1 a(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            Context context = this.d;
            an3 an3Var = om3.a;
            int i3 = context.getResources().getDisplayMetrics().widthPixels;
            pg0 pg0Var = this.c;
            Context context2 = this.d;
            pg0Var.getClass();
            int a = pg0.a(context2, 420.0f);
            int i4 = this.d.getResources().getConfiguration().orientation;
            if (this.b.a(this.d) != kg0.b || i4 != 1) {
                i3 = (int) Math.min(i3, a);
            }
            i = View.MeasureSpec.makeMeasureSpec((int) Math.min(i3, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z = this.a;
            int c = om3.c(this.d);
            pg0 pg0Var2 = this.c;
            Context context3 = this.d;
            pg0Var2.getClass();
            int a2 = pg0.a(context3, 350.0f);
            if (!z) {
                c = (int) Math.min(c, a2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec((int) Math.min(c, size2), 1073741824);
        }
        ik1 ik1Var = new ik1();
        ik1Var.b = i2;
        ik1Var.a = i;
        return ik1Var;
    }

    public ad(Context context, boolean z, lg0 lg0Var, pg0 pg0Var) {
        this.a = z;
        this.b = lg0Var;
        this.c = pg0Var;
        this.d = context.getApplicationContext();
    }
}
