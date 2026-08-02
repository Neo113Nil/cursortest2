package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.sd;
import com.yandex.passport.internal.report.yd;
import defpackage.fd20;
import defpackage.gw00;
import defpackage.j73;
import defpackage.tcc;
import defpackage.vg10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public abstract class l3 implements f {
    public final Object a;

    public /* synthetic */ l3(Object obj) {
        this.a = obj;
    }

    public boolean a() {
        return true;
    }

    public void b(fd20 fd20Var, Map map) {
        if (a()) {
            com.yandex.passport.internal.report.j jVar = (com.yandex.passport.internal.report.j) this.a;
            if (jVar.c.a()) {
                jVar.a.a(fd20Var.toString(), map);
            }
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public Object c(Bundle bundle) {
        String str = (String) this.a;
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        vg10.d("can't get required string ".concat(str));
        return null;
    }

    @Override // com.yandex.passport.internal.methods.f
    public void d(Bundle bundle, Object obj) {
        bundle.putString((String) this.a, (String) obj);
    }

    public void e(fd20 fd20Var, Iterable iterable) {
        if (a()) {
            com.yandex.passport.internal.util.p.q((com.yandex.passport.internal.report.j) this.a, fd20Var, iterable);
        }
    }

    public void f(fd20 fd20Var, pd... pdVarArr) {
        e(fd20Var, j73.u(pdVarArr));
    }

    public void g(fd20 fd20Var, Uid uid) {
        if (a()) {
            com.yandex.passport.internal.util.p.p((com.yandex.passport.internal.report.j) this.a, fd20Var, new yd(uid));
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        return (String) this.a;
    }

    public void h(fd20 fd20Var) {
        if (a()) {
            com.yandex.passport.internal.util.p.q((com.yandex.passport.internal.report.j) this.a, fd20Var, EmptyList.a);
        }
    }

    public void i(fd20 fd20Var, pd... pdVarArr) {
        com.yandex.passport.internal.report.j jVar = (com.yandex.passport.internal.report.j) this.a;
        Iterable u = j73.u(pdVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = u.iterator();
        while (it.hasNext()) {
            arrayList.add((pd) it.next());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((pd) next).a()) {
                arrayList2.add(next);
            }
        }
        if (jVar.c.a()) {
            sd sdVar = jVar.a;
            String fd20Var2 = fd20Var.toString();
            ArrayList m0 = kotlin.collections.a.m0(jVar.b.a(), arrayList2);
            int d = gw00.d(tcc.n(m0, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it3 = m0.iterator();
            while (it3.hasNext()) {
                pd pdVar = (pd) it3.next();
                Pair pair = new Pair(pdVar.getName(), pdVar.getValue());
                linkedHashMap.put(pair.c(), pair.f());
            }
            sdVar.b(fd20Var2, linkedHashMap);
        }
    }
}
