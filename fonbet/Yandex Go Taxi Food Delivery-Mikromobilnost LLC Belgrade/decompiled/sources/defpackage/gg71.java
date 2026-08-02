package defpackage;

import android.content.Context;
import yads.rg1;

/* loaded from: classes7.dex */
public final class gg71 {
    public final a081 a;
    public final Context b;

    public gg71(Context context) {
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
        this.a = a081Var2;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext != null ? applicationContext : context;
    }

    public final boolean a() {
        Boolean bool = (Boolean) l581.a(this.b, rg1.i.b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean b() {
        a081 a081Var = this.a;
        Context context = this.b;
        gg81 a = a081Var.a(context);
        boolean z = a != null && a.t0;
        Boolean bool = (Boolean) l581.a(context, rg1.h.b);
        return a() && !z && (bool != null ? bool.booleanValue() : true);
    }

    public final boolean c() {
        gg81 a = this.a.a(this.b);
        return a() && (a != null && a.K);
    }
}
