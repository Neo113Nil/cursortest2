package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.xz;

/* loaded from: classes7.dex */
public final class nn81 {
    public final fp71 a;
    public final du71 b;

    public nn81(Context context, v981 v981Var, g271 g271Var, fp71 fp71Var, xz xzVar) {
        e971 e971Var = new e971();
        fe81 fe81Var = new fe81(xzVar);
        this.a = fp71Var;
        s421 s421Var = new s421(context, fe81Var, v981Var, e971Var, this);
        this.b = new du71(context, v981Var, g271Var, fe81Var, s421Var, e971Var);
        ((xrr) s421Var.w).z = new a441(fe81Var);
    }

    public final void a() {
        fp71 fp71Var = this.a;
        ((c281) fp71Var.w).a();
        du71 du71Var = this.b;
        s421 s421Var = du71Var.Q;
        s421Var.x = null;
        ((xrr) s421Var.w).e(null, null, null);
        s421 s421Var2 = du71Var.Q;
        s421Var2.getClass();
        ((xrr) s421Var2.w).e((gn61) s421Var2.x, null, null);
        s421 s421Var3 = du71Var.Q;
        s421Var3.getClass();
        ((xrr) s421Var3.w).e((gn61) s421Var3.x, null, null);
        ((CopyOnWriteArrayList) fp71Var.c).remove(this);
    }
}
