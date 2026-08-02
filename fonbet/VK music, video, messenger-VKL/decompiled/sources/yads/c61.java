package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class c61 implements g61, vv1, zi3, oo2 {
    public final b61 a;
    public final f5 b;
    public final e61 c;
    public final Context d;
    public List e;
    public j5 f;

    public c61(Context context, v02 v02Var, f5 f5Var, e61 e61Var) {
        this.a = v02Var;
        this.b = f5Var;
        this.c = e61Var;
        this.d = context.getApplicationContext();
    }

    public final void a() {
        f5 f5Var = this.b;
        String str = f5Var.a.a;
        if (str != null && str.length() != 0) {
            e5 e5Var = f5Var.b;
            e5Var.getClass();
            synchronized (e5.c) {
                e5Var.b.remove(str);
                e5Var.b.add(str);
            }
        }
        this.a.a(this.f);
    }

    @Override // yads.vv1
    public final void b() {
        if (j()) {
            return;
        }
        e61 e61Var = this.c;
        if (!e61Var.d) {
            e61Var.d = true;
            for (dp2 dp2Var : e61.f) {
                f61 f61Var = e61Var.a;
                Map map = e61Var.b;
                gp2 a = f61Var.a();
                a.a.putAll(map);
                f61Var.a(dp2Var, a);
            }
        }
        if (i()) {
            a();
        }
    }

    @Override // yads.g61
    public final void c() {
        if (!j() || i()) {
            return;
        }
        a();
    }

    @Override // yads.zi3
    public final void d() {
        if (j()) {
            return;
        }
        e61 e61Var = this.c;
        if (!e61Var.c) {
            e61Var.c = true;
            for (dp2 dp2Var : e61.e) {
                f61 f61Var = e61Var.a;
                Map map = e61Var.b;
                gp2 a = f61Var.a();
                a.a.putAll(map);
                f61Var.a(dp2Var, a);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.vv1
    public final void e() {
        if (j()) {
            return;
        }
        e61 e61Var = this.c;
        if (!e61Var.c) {
            e61Var.c = true;
            for (dp2 dp2Var : e61.e) {
                f61 f61Var = e61Var.a;
                Map map = e61Var.b;
                gp2 a = f61Var.a();
                a.a.putAll(map);
                f61Var.a(dp2Var, a);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.g61
    public final void g() {
        if (j() && i()) {
            a();
        }
    }

    @Override // yads.zi3
    public final void h() {
        if (j()) {
            return;
        }
        e61 e61Var = this.c;
        if (!e61Var.d) {
            e61Var.d = true;
            for (dp2 dp2Var : e61.f) {
                f61 f61Var = e61Var.a;
                Map map = e61Var.b;
                gp2 a = f61Var.a();
                a.a.putAll(map);
                f61Var.a(dp2Var, a);
            }
        }
        if (i()) {
            a();
        }
    }

    public final boolean i() {
        qu2 a = gx2.a().a(this.d);
        return a == null || a.u;
    }

    public final boolean j() {
        List list = this.e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void a(List list, j5 j5Var) {
        this.e = list;
        this.f = j5Var;
        e61 e61Var = this.c;
        e61Var.c = false;
        e61Var.d = false;
    }

    @Override // yads.oo2
    public final void f() {
    }
}
