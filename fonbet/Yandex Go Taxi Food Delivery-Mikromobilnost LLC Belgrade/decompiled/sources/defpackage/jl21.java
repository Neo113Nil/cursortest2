package defpackage;

import java.util.Iterator;

/* loaded from: classes15.dex */
public final class jl21 {
    public final fjs a;
    public final ml21 b;
    public final kl21 c;

    public jl21(fjs fjsVar, ml21 ml21Var, at2 at2Var) {
        this.a = fjsVar;
        this.b = ml21Var;
        this.c = at2Var.Q();
    }

    public final String a() {
        Object obj;
        String str = this.b.a;
        xn21.a(this.a, str);
        Iterator it = this.c.d(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((il21) obj).d, "email")) {
                break;
            }
        }
        il21 il21Var = (il21) obj;
        if (il21Var != null) {
            return il21Var.e;
        }
        return null;
    }
}
