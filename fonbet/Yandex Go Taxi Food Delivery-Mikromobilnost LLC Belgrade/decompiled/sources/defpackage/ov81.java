package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Random;
import yads.rn0;

/* loaded from: classes7.dex */
public final class ov81 {
    public final wl61 a;
    public final rn0 e;
    public final sc81 f;
    public final cw71 g;
    public final HashMap h;
    public final HashSet i;
    public boolean k;
    public cj71 l;
    public zj61 j = new zj61(new Random());
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();

    public ov81(rn0 rn0Var, xl61 xl61Var, Handler handler, wl61 wl61Var) {
        this.a = wl61Var;
        this.e = rn0Var;
        sc81 sc81Var = new sc81();
        this.f = sc81Var;
        cw71 cw71Var = new cw71();
        this.g = cw71Var;
        this.h = new HashMap();
        this.i = new HashSet();
        xl61Var.getClass();
        sc81Var.c.add(new g981(handler, xl61Var));
        cw71Var.c.add(new xs71(xl61Var));
    }

    public final yn81 a() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return yn81.b;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            vs81 vs81Var = (vs81) arrayList.get(i2);
            vs81Var.d = i;
            i += vs81Var.a.W.a.b();
        }
        return new ii81(arrayList, this.j);
    }

    public final yn81 b(int i, ArrayList arrayList, zj61 zj61Var) {
        if (!arrayList.isEmpty()) {
            this.j = zj61Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                vs81 vs81Var = (vs81) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.b;
                if (i2 > 0) {
                    vs81 vs81Var2 = (vs81) arrayList2.get(i2 - 1);
                    vs81Var.d = vs81Var2.a.W.a.b() + vs81Var2.d;
                    vs81Var.e = false;
                    vs81Var.c.clear();
                } else {
                    vs81Var.d = 0;
                    vs81Var.e = false;
                    vs81Var.c.clear();
                }
                int b = vs81Var.a.W.a.b();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((vs81) arrayList2.get(i3)).d += b;
                }
                arrayList2.add(i2, vs81Var);
                this.d.put(vs81Var.b, vs81Var);
                if (this.k) {
                    d(vs81Var);
                    if (this.c.isEmpty()) {
                        this.i.add(vs81Var);
                    } else {
                        qp81 qp81Var = (qp81) this.h.get(vs81Var);
                        if (qp81Var != null) {
                            qp81Var.a.a(qp81Var.b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final void c(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            vs81 vs81Var = (vs81) arrayList.remove(i3);
            this.d.remove(vs81Var.b);
            int i4 = -vs81Var.a.W.a.b();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((vs81) arrayList.get(i5)).d += i4;
            }
            vs81Var.e = true;
            if (this.k && vs81Var.c.isEmpty()) {
                qp81 qp81Var = (qp81) this.h.remove(vs81Var);
                qp81Var.getClass();
                cr71 cr71Var = qp81Var.c;
                qv81 qv81Var = qp81Var.a;
                qv81Var.c(qp81Var.b);
                qv81Var.a((sf81) cr71Var);
                qv81Var.a((cz71) cr71Var);
                this.i.remove(vs81Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nv81, u581] */
    public final void d(vs81 vs81Var) {
        sy71 sy71Var = vs81Var.a;
        ?? r1 = new u581() { // from class: nv81
            @Override // defpackage.u581
            public final void a(qv81 qv81Var, yn81 yn81Var) {
                ov81.this.e.i.a.sendEmptyMessage(22);
            }
        };
        cr71 cr71Var = new cr71(this, vs81Var);
        this.h.put(vs81Var, new qp81(sy71Var, r1, cr71Var));
        Handler v = rf71.v(null);
        sy71Var.getClass();
        sc81 sc81Var = sy71Var.c;
        sc81Var.getClass();
        sc81Var.c.add(new g981(v, cr71Var));
        rf71.v(null);
        cw71 cw71Var = sy71Var.d;
        cw71Var.getClass();
        cw71Var.c.add(new xs71(cr71Var));
        cj71 cj71Var = this.l;
        Looper myLooper = Looper.myLooper();
        Looper looper = sy71Var.e;
        if (looper != null && looper != myLooper) {
            w511.q();
            return;
        }
        sy71Var.g = this.a;
        yn81 yn81Var = sy71Var.f;
        sy71Var.a.add(r1);
        if (sy71Var.e == null) {
            sy71Var.e = myLooper;
            sy71Var.b.add(r1);
            sy71Var.a(cj71Var);
        } else if (yn81Var != null) {
            sy71Var.b(r1);
            r1.a(sy71Var, yn81Var);
        }
    }
}
