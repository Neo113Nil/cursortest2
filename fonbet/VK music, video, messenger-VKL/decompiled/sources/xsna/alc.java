package xsna;

import android.os.Handler;
import androidx.health.platform.client.impl.ipc.ApiVersionException;

/* compiled from: Client.java */
/* loaded from: classes12.dex */
public final class alc implements n0t<Integer> {
    public final /* synthetic */ int a;
    public final /* synthetic */ lzi0 b;
    public final /* synthetic */ ivf0 c;
    public final /* synthetic */ ioi0 d;

    public alc(ioi0 ioi0Var, int i, lzi0 lzi0Var, ivf0 ivf0Var) {
        this.d = ioi0Var;
        this.a = i;
        this.b = lzi0Var;
        this.c = ivf0Var;
    }

    @Override // xsna.n0t
    public final void onFailure(Throwable th) {
        this.b.l(th);
    }

    @Override // xsna.n0t
    public final void onSuccess(Integer num) {
        Integer num2 = num;
        ioi0 ioi0Var = this.d;
        y3j y3jVar = ioi0Var.a;
        f4j f4jVar = ioi0Var.b;
        int intValue = num2.intValue();
        lzi0 lzi0Var = this.b;
        int i = this.a;
        if (intValue >= i) {
            blc blcVar = new blc(ioi0Var, y3jVar, this.c, lzi0Var);
            Handler handler = f4jVar.c;
            handler.sendMessage(handler.obtainMessage(3, blcVar));
        } else {
            wl6 wl6Var = new wl6(y3jVar);
            Handler handler2 = f4jVar.c;
            handler2.sendMessage(handler2.obtainMessage(3, wl6Var));
            lzi0Var.l(new ApiVersionException(num2.intValue(), i));
        }
    }
}
