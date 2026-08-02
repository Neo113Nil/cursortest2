package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.e43;
import xsna.epx;
import xsna.k8z0;
import xsna.kxa0;
import xsna.oq80;
import xsna.si60;
import xsna.u1j0;

/* loaded from: classes10.dex */
public final class oz1 implements m32 {
    public final List a;
    public final i32 b;
    public String c;
    public m22 d;

    public oz1(List list, i32 i32Var) {
        this.a = list;
        this.b = i32Var;
    }

    public static final boolean a(oz1 oz1Var, m22 m22Var) {
        List list = oz1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((oi) obj).f) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pi a = m22Var.a((oi) it.next());
            if (a != null && a.d()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(oz1 oz1Var, m22 m22Var) {
        Object obj;
        pi a;
        Iterator it = oz1Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            oi oiVar = (oi) obj;
            if (oiVar.f && epx.f(oiVar.a, "sponsored")) {
                break;
            }
        }
        oi oiVar2 = (oi) obj;
        return oiVar2 == null || ((a = m22Var.a(oiVar2)) != null && a.d());
    }

    public static final boolean c(oz1 oz1Var, m22 m22Var) {
        Object obj;
        List list = oz1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((oi) obj2).f) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            oi oiVar = (oi) obj;
            pi a = m22Var.a(oiVar);
            if (a == null) {
                a = null;
            }
            if (a == null || !a.a(oiVar.c)) {
                break;
            }
        }
        oi oiVar2 = (oi) obj;
        oz1Var.c = oiVar2 != null ? oiVar2.a : null;
        return oiVar2 == null;
    }

    public static final boolean d(oz1 oz1Var, m22 m22Var) {
        Object obj;
        List list = oz1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((oi) obj2).f) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            pi a = m22Var.a((oi) obj);
            if (a == null || !a.e()) {
                break;
            }
        }
        oi oiVar = (oi) obj;
        oz1Var.c = oiVar != null ? oiVar.a : null;
        return oiVar == null;
    }

    public final lq2 e() {
        return new lq2(this.c, a(new kxa0(this, 16)));
    }

    public static final boolean e(oz1 oz1Var, m22 m22Var) {
        Object obj;
        List list = oz1Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((oi) obj2).f) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            pi a = m22Var.a((oi) obj);
            if (a == null || !a.b()) {
                break;
            }
        }
        oi oiVar = (oi) obj;
        oz1Var.c = oiVar != null ? oiVar.a : null;
        return oiVar == null;
    }

    public final boolean b() {
        return !a(new oq80(this, 19));
    }

    public final boolean a() {
        return !a(new si60(this, 22));
    }

    public final boolean a(l32 l32Var) {
        m22 m22Var = this.d;
        if (m22Var == null) {
            return false;
        }
        this.b.getClass();
        return l32Var.a(m22Var);
    }

    public final boolean d() {
        return !a(new u1j0(this, 14));
    }

    public final boolean c() {
        return !a(new k8z0(this));
    }

    public final xc3 a(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (b() && !z) {
            arrayList.add(wc3.d);
        }
        List list = this.a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((oi) it.next()).f && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
            if (i >= 2 && a() && !z) {
                arrayList.add(wc3.e);
            }
        }
        if (c()) {
            arrayList.add(wc3.c);
        }
        if (d() && !z) {
            return new uc3(tc3.f, this.c, null);
        }
        return new vc3(arrayList);
    }
}
