package yads;

import android.content.Context;
import java.util.Iterator;
import xsna.iyx;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class g10 {
    public final ov2 a;
    public final Context b;
    public final yvj c;
    public final p12 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ g10(Context context, mv3 mv3Var) {
        this(mv3Var, r4, z10.a(mv3Var.a()), new p12(r4, mv3Var, r0));
        e00 e00Var = e00.g;
        Context applicationContext = context.getApplicationContext();
    }

    public final void a() {
        p12 p12Var = this.d;
        Iterator it = p12Var.d.iterator();
        while (it.hasNext()) {
            n12 n12Var = ((q12) it.next()).b;
            iyx.d(n12Var.k.c.getCoroutineContext());
            o4 o4Var = n12Var.q;
            yp2 yp2Var = o4Var.a;
            String str = o4Var.b;
            yp2Var.getClass();
            yp2.a(str);
            n12Var.x.b.removeCallbacksAndMessages(null);
            n12Var.A.a(le1.b, n12Var);
            n12Var.a(z5.b);
            n12Var.B.a();
        }
        p12Var.d.clear();
        zvj.c(this.c, null);
    }

    public g10(mv3 mv3Var, Context context, yvj yvjVar, p12 p12Var) {
        this.a = mv3Var;
        this.b = context;
        this.c = yvjVar;
        this.d = p12Var;
    }
}
