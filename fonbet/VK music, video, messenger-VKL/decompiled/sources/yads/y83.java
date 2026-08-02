package yads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes10.dex */
public abstract class y83 extends g11 implements b61, g1 {
    public final e1 d;

    public y83(Context context, v9 v9Var, ov2 ov2Var, d4 d4Var) {
        super(context, v9Var);
        this.d = new e1(context, d4Var, ov2Var, v9Var, this, null);
    }

    public void a(int i, Bundle bundle) {
        switch (i) {
            case 6:
                ((ry0) this).g();
                this.d.e();
                break;
            case 7:
                ((ry0) this).g();
                this.d.c();
                break;
            case 8:
                this.d.d();
                break;
            case 9:
                this.d.a();
                break;
        }
    }
}
