package xsna;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xtc0 implements hz20 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ kk6 c;
    public final /* synthetic */ int d;

    public /* synthetic */ xtc0(Context context, kk6 kk6Var, int i) {
        this.b = context;
        this.c = kk6Var;
        this.d = i;
    }

    @Override // xsna.hz20
    public final void a(int i) {
        iuc0 iuc0Var = iuc0.b;
        Context context = this.b;
        kk6 kk6Var = this.c;
        int i2 = this.d;
        if (i2 != -1) {
            kk6Var.d(xa4.L(context), i2);
        } else {
            kk6Var.l(context);
        }
    }
}
