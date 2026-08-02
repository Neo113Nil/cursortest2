package xsna;

import android.os.Handler;
import android.os.IInterface;
import xsna.di;

/* compiled from: Client.java */
/* loaded from: classes12.dex */
public abstract class clc<S extends IInterface> {
    public final y3j a;
    public final f4j b;
    public final ryt0 c;
    public final up d;
    public volatile int e = -1;

    public clc(mcc0 mcc0Var, f4j f4jVar, ryt0 ryt0Var, up upVar) {
        this.a = new y3j((String) mcc0Var.b, new zkc(this, upVar, ryt0Var));
        this.b = f4jVar;
        this.c = ryt0Var;
        this.d = upVar;
    }

    public final lzi0 a(int i, ivf0 ivf0Var) {
        ugz ugzVar;
        lzi0 lzi0Var = new lzi0();
        if (this.e != -1) {
            ugzVar = new tnw(Integer.valueOf(this.e));
        } else {
            ca6 ca6Var = new ca6(this.d, 5);
            lzi0 lzi0Var2 = new lzi0();
            f4j f4jVar = this.b;
            blc blcVar = new blc(this, this.a, ca6Var, lzi0Var2);
            Handler handler = f4jVar.c;
            handler.sendMessage(handler.obtainMessage(3, blcVar));
            w7 w7Var = new w7((ioi0) this, 11);
            kzm kzmVar = kzm.INSTANCE;
            int i2 = di.k;
            di.a aVar = new di.a();
            aVar.i = lzi0Var2;
            aVar.j = w7Var;
            kzmVar.getClass();
            lzi0Var2.addListener(aVar, kzmVar);
            ugzVar = aVar;
        }
        alc alcVar = new alc((ioi0) this, i, lzi0Var, ivf0Var);
        ugzVar.addListener(new u0t(ugzVar, alcVar), kzm.INSTANCE);
        return lzi0Var;
    }
}
