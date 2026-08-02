package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class zg {
    public final ti1 a;
    public final hx2 b;
    public final Context c;

    public /* synthetic */ zg(Context context) {
        this(context, new ti1(), gx2.a());
    }

    public final boolean a() {
        ti1 ti1Var = this.a;
        Context context = this.c;
        ti1Var.getClass();
        Boolean bool = (Boolean) ti1.a(context, ui1.i.b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean b() {
        qu2 a = this.b.a(this.c);
        boolean z = a != null && a.t0;
        ti1 ti1Var = this.a;
        Context context = this.c;
        ti1Var.getClass();
        Boolean bool = (Boolean) ti1.a(context, ui1.h.b);
        return a() && !z && (bool != null ? bool.booleanValue() : true);
    }

    public final boolean c() {
        qu2 a = this.b.a(this.c);
        return a() && (a != null && a.L);
    }

    public zg(Context context, ti1 ti1Var, hx2 hx2Var) {
        this.a = ti1Var;
        this.b = hx2Var;
        this.c = uz.a(context);
    }
}
