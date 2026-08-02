package yads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class za {
    public static final ExecutorService d = Executors.newCachedThreadPool(new fz1(fz1.b));
    public final d4 a;
    public final ov2 b;
    public final Context c;

    public za(Context context, ov2 ov2Var, d4 d4Var) {
        this.a = d4Var;
        this.b = ov2Var;
        this.c = context.getApplicationContext();
    }

    public static void a(za zaVar, String str, o93 o93Var) {
        ee2 ee2Var = new ee2(zaVar.c, zaVar.a, zaVar.b, o93Var);
        if (str.length() > 0) {
            d.execute(new ya(str, ee2Var, jgp.b));
        }
    }
}
