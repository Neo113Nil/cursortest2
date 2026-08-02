package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class c2k extends a8 {
    public final /* synthetic */ int c;
    public final tls w;
    public final Object x;
    public final Object y;

    public c2k(jll jllVar, m3k m3kVar, rvo rvoVar, tls tlsVar) {
        this.c = 1;
        this.y = jllVar;
        this.w = tlsVar;
        x43 x43Var = new x43();
        cxk cxkVar = new cxk(m3kVar, rvoVar);
        x43Var.addLast(uml.i(m3kVar) ? new gll(cxkVar, jllVar.c, jllVar.d) : new hll(cxkVar));
        this.x = x43Var;
    }

    @Override // defpackage.a8
    public final void a() {
        zy11 zy11Var;
        int i = this.c;
        tls tlsVar = this.w;
        switch (i) {
            case 0:
                Iterator it = (Iterator) this.x;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((HashSet) this.y).add(tlsVar.invoke(next))) {
                        this.b = next;
                        this.a = 1;
                        break;
                    }
                }
                this.a = 2;
                break;
            default:
                cxk b = b();
                if (b != null) {
                    Object invoke = tlsVar.invoke(b);
                    if (invoke != null) {
                        this.b = invoke;
                        this.a = 1;
                        zy11Var = zy11.a;
                    } else {
                        zy11Var = null;
                    }
                    if (zy11Var == null) {
                        a();
                        break;
                    }
                } else {
                    this.a = 2;
                    break;
                }
                break;
        }
    }

    public cxk b() {
        Object hllVar;
        x43 x43Var = (x43) this.x;
        ill illVar = (ill) x43Var.h();
        if (illVar == null) {
            return null;
        }
        cxk q = illVar.q();
        if (q == null) {
            x43Var.removeLast();
            return b();
        }
        m3k m3kVar = q.a;
        if (q == illVar.getItem() || !uml.i(m3kVar) || x43Var.size() >= Integer.MAX_VALUE) {
            return q;
        }
        if (uml.i(m3kVar)) {
            jll jllVar = (jll) this.y;
            hllVar = new gll(q, jllVar.c, jllVar.d);
        } else {
            hllVar = new hll(q);
        }
        x43Var.addLast(hllVar);
        return b();
    }

    public c2k(Iterator it, tls tlsVar) {
        this.c = 0;
        this.x = it;
        this.w = tlsVar;
        this.y = new HashSet();
    }
}
