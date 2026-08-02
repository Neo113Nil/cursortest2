package yads;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes10.dex */
public final class bm1 implements dl1, Handler.Callback {
    public final Handler b;
    public final /* synthetic */ cm1 c;

    public bm1(cm1 cm1Var, el1 el1Var) {
        this.c = cm1Var;
        Handler a = mc3.a((Handler.Callback) this);
        this.b = a;
        el1Var.a(this, a);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = mc3.a;
        long j = ((i & 4294967295L) << 32) | (4294967295L & i2);
        cm1 cm1Var = this.c;
        if (this == cm1Var.n1) {
            if (j == Long.MAX_VALUE) {
                cm1Var.z0 = true;
            } else {
                try {
                    cm1Var.b(j);
                    cm1Var.D();
                    cm1Var.B0.e++;
                    cm1Var.V0 = true;
                    if (!cm1Var.T0) {
                        cm1Var.T0 = true;
                        cm1Var.I0.a(cm1Var.P0);
                        cm1Var.R0 = true;
                    }
                    cm1Var.a(j);
                } catch (qn0 e) {
                    this.c.A0 = e;
                }
            }
        }
        return true;
    }
}
