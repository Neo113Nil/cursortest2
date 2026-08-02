package defpackage;

import android.content.Context;

/* loaded from: classes10.dex */
public final class oeh implements mb10 {
    public final Context a;
    public int b;
    public boolean c;

    @Deprecated
    public oeh() {
        this.b = 0;
        this.c = false;
        this.a = null;
    }

    @Override // defpackage.mb10
    public final pb10 o(lb10 lb10Var) {
        Context context;
        int i = tw21.a;
        if (i >= 23) {
            int i2 = this.b;
            int i3 = 1;
            if (i2 == 1 || (i2 == 0 && (i >= 31 || ((context = this.a) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))))) {
                int i4 = eh20.i(lb10Var.c.n);
                lk91.h("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(tw21.K(i4)));
                tis0 tis0Var = new tis0(new kb3(i4, 0), new kb3(i4, i3));
                tis0Var.b = this.c;
                return tis0Var.o(lb10Var);
            }
        }
        return new n1x0().o(lb10Var);
    }

    public oeh(Context context) {
        this.a = context;
        this.b = 0;
        this.c = false;
    }
}
