package yads;

import android.content.Context;
import xsna.an10;

/* loaded from: classes10.dex */
public final class xk1 implements ag0 {
    public final int a;
    public final rk1 b;

    public xk1(int i, rk1 rk1Var) {
        this.a = i;
        this.b = rk1Var;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        int c = om3.c(context);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        Float a = this.b.a();
        return i - (a != null ? an10.b(a.floatValue() * ((float) c)) : 0) >= this.a;
    }
}
