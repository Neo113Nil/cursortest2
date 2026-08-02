package defpackage;

import android.content.Context;
import kotlin.a;
import yads.is1;
import yads.vf;

/* loaded from: classes7.dex */
public abstract class pk71 {
    public static final a081 a;
    public static volatile ge71 b;

    static {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        a = a081Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ge71 a(Context context, gg81 gg81Var, m771 m771Var) {
        a441 a441Var;
        om71 om71Var = new om71();
        r191 a2 = bv81.a(context);
        String str = xga1.c(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
        boolean z = false;
        if (a2.a.a()) {
            a441Var = new a441(a.a(new vf(m771Var, context, a2, str)), a2.a, z, 9);
            i3y a3 = a.a(new is1(context));
            if (gg81Var != null && gg81Var.h0) {
                z = true;
            }
            ge71 ge71Var = new ge71(a441Var, a3, z);
            hn71 hn71Var = new hn71(context, om71Var);
            p171 p171Var = (p171) hn71Var.c;
            um81 um81Var = (um81) hn71Var.b;
            p171Var.getClass();
            synchronized (p171.b) {
                if (!p171Var.a.containsKey(um81Var)) {
                    p171Var.a.put(um81Var, null);
                }
            }
            return ge71Var;
        }
        a2.b.a();
        a441Var = null;
        i3y a32 = a.a(new is1(context));
        if (gg81Var != null) {
            z = true;
        }
        ge71 ge71Var2 = new ge71(a441Var, a32, z);
        hn71 hn71Var2 = new hn71(context, om71Var);
        p171 p171Var2 = (p171) hn71Var2.c;
        um81 um81Var2 = (um81) hn71Var2.b;
        p171Var2.getClass();
        synchronized (p171.b) {
        }
    }
}
