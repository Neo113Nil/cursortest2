package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import yads.hm2;
import yads.w4;

/* loaded from: classes7.dex */
public final class go61 implements y571, s291, jg71, h981 {
    public final st81 a;
    public final hn71 b;
    public final oz61 c;
    public final Context d;
    public ArrayList e;
    public w4 f;

    public go61(Context context, st81 st81Var, w040 w040Var, hn71 hn71Var) {
        oz61 oz61Var = new oz61(w040Var);
        this.a = st81Var;
        this.b = hn71Var;
        this.c = oz61Var;
        this.d = context.getApplicationContext();
    }

    public final void a() {
        hn71 hn71Var = this.b;
        String str = ((mf1) hn71Var.b).b;
        if (str != null && str.length() != 0) {
            db81 db81Var = (db81) hn71Var.c;
            db81Var.getClass();
            synchronized (db81.c) {
                db81Var.b.remove(str);
                db81Var.b.add(str);
            }
        }
        st81 st81Var = this.a;
        w4 w4Var = this.f;
        d391 d391Var = st81Var.a;
        d391Var.a.post(new fe71(16, d391Var, w4Var));
    }

    @Override // defpackage.s291
    public final void b() {
        if (j()) {
            return;
        }
        oz61 oz61Var = this.c;
        if (!oz61Var.d) {
            oz61Var.d = true;
            for (hm2 hm2Var : oz61.f) {
                w040 w040Var = oz61Var.a;
                Map map = oz61Var.b;
                hn71 a = w040Var.a();
                ((Map) a.b).putAll(map);
                w040Var.c(hm2Var, a);
            }
        }
        if (i()) {
            a();
        }
    }

    @Override // defpackage.y571
    public final void c() {
        if (!j() || i()) {
            return;
        }
        a();
    }

    @Override // defpackage.jg71
    public final void d() {
        if (j()) {
            return;
        }
        oz61 oz61Var = this.c;
        if (!oz61Var.c) {
            oz61Var.c = true;
            for (hm2 hm2Var : oz61.e) {
                w040 w040Var = oz61Var.a;
                Map map = oz61Var.b;
                hn71 a = w040Var.a();
                ((Map) a.b).putAll(map);
                w040Var.c(hm2Var, a);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // defpackage.s291
    public final void e() {
        if (j()) {
            return;
        }
        oz61 oz61Var = this.c;
        if (!oz61Var.c) {
            oz61Var.c = true;
            for (hm2 hm2Var : oz61.e) {
                w040 w040Var = oz61Var.a;
                Map map = oz61Var.b;
                hn71 a = w040Var.a();
                ((Map) a.b).putAll(map);
                w040Var.c(hm2Var, a);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // defpackage.h981
    public final void f() {
    }

    @Override // defpackage.y571
    public final void g() {
        if (j() && i()) {
            a();
        }
    }

    @Override // defpackage.jg71
    public final void h() {
        if (j()) {
            return;
        }
        oz61 oz61Var = this.c;
        if (!oz61Var.d) {
            oz61Var.d = true;
            for (hm2 hm2Var : oz61.f) {
                w040 w040Var = oz61Var.a;
                Map map = oz61Var.b;
                hn71 a = w040Var.a();
                ((Map) a.b).putAll(map);
                w040Var.c(hm2Var, a);
            }
        }
        if (i()) {
            a();
        }
    }

    public final boolean i() {
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
        gg81 a = a081Var2.a(this.d);
        return a == null || a.u;
    }

    public final boolean j() {
        ArrayList arrayList = this.e;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
