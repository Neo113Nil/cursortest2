package defpackage;

import android.content.Context;
import java.util.List;
import yads.p9;

/* loaded from: classes7.dex */
public final class ph71 {
    public final v981 a;

    public /* synthetic */ ph71(v981 v981Var) {
        this.a = v981Var;
    }

    public hq71 a(Context context, tg81 tg81Var, hlx0 hlx0Var, cf71 cf71Var, ck61 ck61Var, o381 o381Var, se71 se71Var, p9 p9Var) {
        jl71 jl71Var = jl71.b;
        if (jl71Var == null) {
            synchronized (jl71.a) {
                jl71Var = jl71.b;
                if (jl71Var == null) {
                    jl71Var = new jl71();
                    jl71.b = jl71Var;
                }
            }
        }
        vi71 vi71Var = new vi71((List) hlx0Var.b, jl71Var);
        return new hq71(tg81Var, new vi71(vi71Var, tg81Var.b), hlx0Var, cf71Var, ck61Var, new j371(o381Var, 1), new cr71(context, vi71Var, jl71Var), this.a, se71Var, p9Var);
    }
}
