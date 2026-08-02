package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.myc0;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class wv2 implements Runnable {
    public static final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final ov2 b;
    public final yvj c;
    public final vu1 d;
    public final Context e;

    public wv2(Context context, mv3 mv3Var, yvj yvjVar, vu1 vu1Var) {
        this.b = mv3Var;
        this.c = yvjVar;
        this.d = vu1Var;
        this.e = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public final void run() {
        dw2 dw2Var = new dw2(this.e, this.b, this.c, new w5(), null, null, 4194288);
        f.add(dw2Var);
        myc0.h(this.c, null, null, new vv2(dw2Var, this, null), 3);
    }
}
