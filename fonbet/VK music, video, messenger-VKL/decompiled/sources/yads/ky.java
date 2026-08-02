package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class ky implements ag0 {
    public final ag0[] a;

    public ky(ag0... ag0VarArr) {
        this.a = ag0VarArr;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        for (ag0 ag0Var : this.a) {
            if (!ag0Var.a(context)) {
                return false;
            }
        }
        return true;
    }
}
