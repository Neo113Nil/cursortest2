package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class jo1 {
    public final zf2 a;
    public final io1 e;
    public final co1 f;
    public final pk0 g;
    public final HashMap h;
    public final HashSet i;
    public boolean k;
    public v93 l;
    public wz2 j = new wz2();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();

    public jo1(io1 io1Var, se seVar, Handler handler, zf2 zf2Var) {
        this.a = zf2Var;
        this.e = io1Var;
        co1 co1Var = new co1();
        this.f = co1Var;
        pk0 pk0Var = new pk0();
        this.g = pk0Var;
        this.h = new HashMap();
        this.i = new HashSet();
        co1Var.a(handler, seVar);
        pk0Var.a(handler, seVar);
    }

    public final w73 a(int i, List list, wz2 wz2Var) {
        if (!list.isEmpty()) {
            this.j = wz2Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                ho1 ho1Var = (ho1) list.get(i2 - i);
                if (i2 > 0) {
                    ho1 ho1Var2 = (ho1) this.b.get(i2 - 1);
                    ho1Var.d = ho1Var2.a.o.c.b() + ho1Var2.d;
                    ho1Var.e = false;
                    ho1Var.c.clear();
                } else {
                    ho1Var.d = 0;
                    ho1Var.e = false;
                    ho1Var.c.clear();
                }
                int b = ho1Var.a.o.c.b();
                for (int i3 = i2; i3 < this.b.size(); i3++) {
                    ((ho1) this.b.get(i3)).d += b;
                }
                this.b.add(i2, ho1Var);
                this.d.put(ho1Var.b, ho1Var);
                if (this.k) {
                    a(ho1Var);
                    if (this.c.isEmpty()) {
                        this.i.add(ho1Var);
                    } else {
                        go1 go1Var = (go1) this.h.get(ho1Var);
                        if (go1Var != null) {
                            go1Var.a.a(go1Var.b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final w73 a() {
        if (this.b.isEmpty()) {
            return w73.b;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            ho1 ho1Var = (ho1) this.b.get(i2);
            ho1Var.d = i;
            i += ho1Var.a.o.c.b();
        }
        return new yg2(this.b, this.j);
    }

    public final void a(mo moVar, w73 w73Var) {
        ((ho0) this.e).i.a.sendEmptyMessage(22);
    }

    public final void a(ho1 ho1Var) {
        wj1 wj1Var = ho1Var.a;
        ao1 ao1Var = new ao1() { // from class: xsna.c2z0
            @Override // yads.ao1
            public final void a(yads.mo moVar, yads.w73 w73Var) {
                yads.jo1.this.a(moVar, w73Var);
            }
        };
        fo1 fo1Var = new fo1(this, ho1Var);
        this.h.put(ho1Var, new go1(wj1Var, ao1Var, fo1Var));
        Handler b = mc3.b((Handler.Callback) null);
        wj1Var.getClass();
        co1 co1Var = wj1Var.c;
        co1Var.getClass();
        co1Var.c.add(new bo1(b, fo1Var));
        Handler b2 = mc3.b((Handler.Callback) null);
        pk0 pk0Var = wj1Var.d;
        pk0Var.getClass();
        pk0Var.c.add(new ok0(b2, fo1Var));
        v93 v93Var = this.l;
        zf2 zf2Var = this.a;
        Looper myLooper = Looper.myLooper();
        Looper looper = wj1Var.e;
        if (looper != null && looper != myLooper) {
            throw new IllegalArgumentException();
        }
        wj1Var.g = zf2Var;
        w73 w73Var = wj1Var.f;
        wj1Var.a.add(ao1Var);
        if (wj1Var.e == null) {
            wj1Var.e = myLooper;
            wj1Var.b.add(ao1Var);
            wj1Var.a(v93Var);
        } else if (w73Var != null) {
            wj1Var.b(ao1Var);
            ao1Var.a(wj1Var, w73Var);
        }
    }

    public final void a(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ho1 ho1Var = (ho1) this.b.remove(i3);
            this.d.remove(ho1Var.b);
            int i4 = -ho1Var.a.o.c.b();
            for (int i5 = i3; i5 < this.b.size(); i5++) {
                ((ho1) this.b.get(i5)).d += i4;
            }
            ho1Var.e = true;
            if (this.k && ho1Var.c.isEmpty()) {
                go1 go1Var = (go1) this.h.remove(ho1Var);
                go1Var.getClass();
                go1Var.a.c(go1Var.b);
                go1Var.a.a((do1) go1Var.c);
                go1Var.a.a((qk0) go1Var.c);
                this.i.remove(ho1Var);
            }
        }
    }
}
