package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class i571 extends qv81 {
    public final HashMap P = new HashMap();
    public Handler Q;
    public mr81 R;

    @Override // defpackage.qv81
    public final void a() {
        for (b271 b271Var : this.P.values()) {
            b271Var.a.a(b271Var.b);
        }
    }

    @Override // defpackage.qv81
    public final void b() {
        for (b271 b271Var : this.P.values()) {
            b271Var.a.b(b271Var.b);
        }
    }

    @Override // defpackage.qv81
    public void d() {
        Iterator it = this.P.values().iterator();
        while (it.hasNext()) {
            ((b271) it.next()).a.d();
        }
    }

    @Override // defpackage.qv81
    public void e() {
        HashMap hashMap = this.P;
        for (b271 b271Var : hashMap.values()) {
            qv81 qv81Var = b271Var.a;
            s421 s421Var = b271Var.c;
            qv81Var.c(b271Var.b);
            qv81Var.a((sf81) s421Var);
            qv81Var.a((cz71) s421Var);
        }
        hashMap.clear();
    }

    public v281 f(Object obj, v281 v281Var) {
        return v281Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [g571, java.lang.Object, u581] */
    public final void g(final Integer num, qv81 qv81Var) {
        HashMap hashMap = this.P;
        if (hashMap.containsKey(num)) {
            w511.q();
            return;
        }
        ?? r1 = new u581() { // from class: g571
            @Override // defpackage.u581
            public final void a(qv81 qv81Var2, yn81 yn81Var) {
                i571.this.h(num, qv81Var2, yn81Var);
            }
        };
        s421 s421Var = new s421(this, num);
        hashMap.put(num, new b271(qv81Var, r1, s421Var));
        Handler handler = this.Q;
        handler.getClass();
        qv81Var.getClass();
        sc81 sc81Var = qv81Var.c;
        sc81Var.getClass();
        sc81Var.c.add(new g981(handler, s421Var));
        this.Q.getClass();
        cw71 cw71Var = qv81Var.d;
        cw71Var.getClass();
        cw71Var.c.add(new xs71(s421Var));
        mr81 mr81Var = this.R;
        wl61 wl61Var = this.g;
        if (wl61Var == null) {
            ny61.k();
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = qv81Var.e;
        if (looper != null && looper != myLooper) {
            w511.q();
            return;
        }
        qv81Var.g = wl61Var;
        yn81 yn81Var = qv81Var.f;
        qv81Var.a.add(r1);
        if (qv81Var.e == null) {
            qv81Var.e = myLooper;
            qv81Var.b.add(r1);
            qv81Var.a(mr81Var);
        } else if (yn81Var != null) {
            qv81Var.b(r1);
            r1.a(qv81Var, yn81Var);
        }
        if (this.b.isEmpty()) {
            qv81Var.a((u581) r1);
        }
    }

    public abstract void h(Object obj, qv81 qv81Var, yn81 yn81Var);
}
