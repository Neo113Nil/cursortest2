package com.yandex.div.core.expression.variables;

import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.data.VariableMutationException;
import defpackage.br60;
import defpackage.c231;
import defpackage.do91;
import defpackage.fo40;
import defpackage.fu11;
import defpackage.h231;
import defpackage.j73;
import defpackage.jl40;
import defpackage.na3;
import defpackage.ngd0;
import defpackage.tls;
import defpackage.uqs;
import defpackage.vuu0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a {
    public final a a;
    public final ConcurrentHashMap b;
    public final ConcurrentLinkedQueue c;
    public final LinkedHashMap d;
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public final ConcurrentLinkedQueue g;
    public final tls h;
    public final fo40 i;

    public a(a aVar) {
        this.a = aVar;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentLinkedQueue();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.g = new ConcurrentLinkedQueue();
        this.i = new fo40(this, new DivVariableController$requestsObserver$1(this));
    }

    public static final void a(a aVar, c231... c231VarArr) {
        ArrayList arrayList = new ArrayList();
        synchronized (aVar.e) {
            try {
                for (c231 c231Var : c231VarArr) {
                    String str = (String) aVar.d.get(c231Var.c());
                    if (str != null && !str.equals(c231Var.getClass().getName())) {
                        throw new VariableMutationException(2, null, "Cannot declare new variable with type = " + c231Var.getClass().getName() + ", because this variable have been declared with another type = " + str);
                    }
                    if (!aVar.e.contains(c231Var.c())) {
                        aVar.e.add(c231Var.c());
                        aVar.f.remove(c231Var.c());
                        arrayList.add(c231Var);
                    }
                    final c231 c231Var2 = (c231) aVar.b.get(c231Var.c());
                    if (!jl40.l(c231Var2, c231Var)) {
                        if (c231Var2 != null) {
                            c231Var2.h(c231Var);
                            c231Var.a(new tls() { // from class: com.yandex.div.core.expression.variables.DivVariableController$putOrUpdateInternal$1$1$1$1
                                {
                                    super(1);
                                }

                                @Override // defpackage.tls
                                public final Object invoke(Object obj) {
                                    c231.this.h((c231) obj);
                                    return zy11.a;
                                }
                            });
                        } else {
                            c231 c231Var3 = (c231) aVar.b.put(c231Var.c(), c231Var);
                            if (c231Var3 != null) {
                                vuu0.c("\n                    Wanted to put new variable '" + c231Var + "', but variable with such name\n                    already exists '" + c231Var3 + "'! Is there a race?\n                ");
                            }
                            aVar.d.remove(c231Var.c());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = aVar.c.iterator();
        while (it.hasNext()) {
            h231 h231Var = (h231) it.next();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c231 c231Var4 = (c231) it2.next();
                d dVar = h231Var.a;
                c231Var4.a(dVar.B);
                dVar.a(c231Var4);
            }
        }
    }

    public static final void b(a aVar, String... strArr) {
        ConcurrentHashMap concurrentHashMap = aVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (j73.y(strArr, entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        synchronized (aVar.e) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                aVar.e.remove(entry2.getKey());
                aVar.d.put(entry2.getKey(), entry2.getValue().getClass().getName());
                aVar.b.remove(entry2.getKey());
            }
        }
        Iterator it = aVar.c.iterator();
        while (it.hasNext()) {
            h231 h231Var = (h231) it.next();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                c231 c231Var = (c231) ((Map.Entry) it2.next()).getValue();
                d dVar = h231Var.a;
                c231Var.f(dVar.B);
                br60 br60Var = (br60) dVar.z.get(c231Var.c());
                if (br60Var != null) {
                    Iterator it3 = br60Var.iterator();
                    while (it3.hasNext()) {
                        ((tls) it3.next()).invoke(c231Var);
                    }
                }
                for (tls tlsVar : kotlin.collections.a.J0(dVar.A.values())) {
                    tlsVar.invoke(c231Var);
                    c231Var.f(tlsVar);
                }
                dVar.c.remove(c231Var.c());
            }
        }
    }

    public final void c(h231 h231Var) {
        this.c.add(h231Var);
        a aVar = this.a;
        if (aVar != null) {
            aVar.c(h231Var);
        }
    }

    public final void d(tls tlsVar) {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((c231) it.next()).a(tlsVar);
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.d(tlsVar);
        }
    }

    public final ArrayList e() {
        Collection values = this.b.values();
        a aVar = this.a;
        return kotlin.collections.a.m0(aVar != null ? aVar.e() : EmptyList.a, values);
    }

    public final void f(c231... c231VarArr) {
        int i;
        synchronized (this.e) {
            try {
                ArrayList arrayList = new ArrayList();
                for (c231 c231Var : c231VarArr) {
                    i = (this.e.contains(c231Var.c()) || this.f.contains(c231Var.c())) ? 0 : i + 1;
                    arrayList.add(c231Var);
                }
                if (!arrayList.isEmpty()) {
                    throw new VariableDeclarationException(vuu0.c("\n                        Wanted to declare new variable(s) '" + arrayList + "',\n                        but variable(s) with such name(s) already exists!\n                    "), 2);
                }
                LinkedHashSet linkedHashSet = this.f;
                ArrayList arrayList2 = new ArrayList(c231VarArr.length);
                for (c231 c231Var2 : c231VarArr) {
                    arrayList2.add(c231Var2.c());
                }
                linkedHashSet.addAll(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (fu11Var.a()) {
            a(this, (c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
        } else {
            fu11Var.b(new uqs(6, this, c231VarArr));
        }
    }

    public final c231 g(String str) {
        boolean contains;
        synchronized (this.e) {
            contains = this.e.contains(str);
        }
        if (contains) {
            return (c231) this.b.get(str);
        }
        a aVar = this.a;
        if (aVar != null) {
            return aVar.g(str);
        }
        return null;
    }

    public final boolean h(String str) {
        boolean contains;
        boolean z;
        a aVar;
        synchronized (this.e) {
            synchronized (this.e) {
                contains = this.e.contains(str);
            }
            z = true;
            if (!contains && ((aVar = this.a) == null || !aVar.h(str))) {
                z = false;
            }
        }
        return z;
    }

    public final void i(c231... c231VarArr) {
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (fu11Var.a()) {
            a(this, (c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
        } else {
            fu11Var.b(new na3(this, c231VarArr, false, 2));
        }
    }

    public final void j(tls tlsVar) {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            tlsVar.invoke((c231) it.next());
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.j(tlsVar);
        }
    }

    public final void k(String... strArr) {
        ngd0.G.p();
        fu11 fu11Var = fu11.a;
        if (fu11Var.a()) {
            b(this, (String[]) Arrays.copyOf(strArr, strArr.length));
        } else {
            fu11Var.b(new do91(6, this, strArr));
        }
    }

    public final void l(h231 h231Var) {
        this.c.remove(h231Var);
        a aVar = this.a;
        if (aVar != null) {
            aVar.l(h231Var);
        }
    }

    public final void m(tls tlsVar) {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            ((c231) it.next()).f(tlsVar);
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.m(tlsVar);
        }
    }

    public a() {
        this(null);
    }
}
