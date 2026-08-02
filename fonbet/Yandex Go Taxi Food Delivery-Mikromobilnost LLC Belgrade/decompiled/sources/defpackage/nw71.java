package defpackage;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import yads.fx0;
import yads.ln;
import yads.mn;

/* loaded from: classes7.dex */
public abstract class nw71 {
    public final Context a;
    public final v981 b;
    public final jk81 c;
    public final tse d;

    public nw71(Context context, v981 v981Var, jk81 jk81Var, tse tseVar) {
        this.a = context;
        this.b = v981Var;
        this.c = jk81Var;
        this.d = tseVar;
    }

    public abstract Object a(nl61 nl61Var, Object obj, mn mnVar);

    public final Object b(nl61 nl61Var, fx0 fx0Var) {
        j18 j18Var = new j18(1, dvw.b(fx0Var));
        j18Var.u();
        fk71 fk71Var = new fk71(j18Var, nl61Var, this.d, this.c, new mn(this, null));
        j18Var.w(new ln(fk71Var, c(nl61Var, fk71Var), this, nl61Var));
        Object s = j18Var.s();
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }

    public abstract zn71 c(nl61 nl61Var, fk71 fk71Var);
}
