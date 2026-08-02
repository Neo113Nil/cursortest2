package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import defpackage.br60;
import defpackage.c231;
import defpackage.do91;
import defpackage.f1k;
import defpackage.f231;
import defpackage.fg90;
import defpackage.fo40;
import defpackage.fu11;
import defpackage.g8e;
import defpackage.h231;
import defpackage.l6o;
import defpackage.na3;
import defpackage.ngd0;
import defpackage.rg21;
import defpackage.rvo;
import defpackage.sls;
import defpackage.svo;
import defpackage.tls;
import defpackage.unr0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d implements f231 {
    public final yvf0 a;
    public final f231 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final Set w = Collections.synchronizedSet(new LinkedHashSet());
    public final Set x = Collections.synchronizedSet(new LinkedHashSet());
    public final ConcurrentHashMap y = new ConcurrentHashMap();
    public final ConcurrentHashMap z = new ConcurrentHashMap();
    public final ConcurrentHashMap A = new ConcurrentHashMap();
    public final tls B = new tls() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$notifyVariableChangedCallback$1
        {
            super(1);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            d.this.a((c231) obj);
            return zy11.a;
        }
    };
    public final h231 C = new h231(this);

    public d(yvf0 yvf0Var, f231 f231Var) {
        this.a = yvf0Var;
        this.b = f231Var;
    }

    public final void a(final c231 c231Var) {
        ngd0 ngd0Var = ngd0.G;
        Div2View div2View = (Div2View) this.a.get();
        ConcurrentHashMap concurrentHashMap = this.y;
        ConcurrentHashMap concurrentHashMap2 = this.A;
        if (div2View == null) {
            ngd0Var.p();
            fu11 fu11Var = fu11.a;
            if (!fu11Var.a()) {
                fu11Var.b(new na3(this, c231Var, false, 6));
                return;
            }
            Iterator it = kotlin.collections.a.J0(concurrentHashMap2.values()).iterator();
            while (it.hasNext()) {
                ((tls) it.next()).invoke(c231Var);
            }
            br60 br60Var = (br60) concurrentHashMap.get(c231Var.c());
            if (br60Var != null) {
                Iterator it2 = br60Var.iterator();
                while (it2.hasNext()) {
                    ((tls) it2.next()).invoke(c231Var);
                }
                return;
            }
            return;
        }
        ngd0Var.p();
        fu11 fu11Var2 = fu11.a;
        if (fu11Var2.a()) {
            Iterator it3 = kotlin.collections.a.J0(concurrentHashMap2.values()).iterator();
            while (it3.hasNext()) {
                ((tls) it3.next()).invoke(c231Var);
            }
            br60 br60Var2 = (br60) concurrentHashMap.get(c231Var.c());
            if (br60Var2 != null) {
                Iterator it4 = br60Var2.iterator();
                while (it4.hasNext()) {
                    ((tls) it4.next()).invoke(c231Var);
                }
                return;
            }
            return;
        }
        com.yandex.div.core.util.binding.a g = unr0.g(div2View, ngd0Var);
        if (!fu11Var2.a()) {
            g.c(new sls() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$notifyVariableChanged$$inlined$doOnMainThread$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    Iterator it5 = kotlin.collections.a.J0(d.this.A.values()).iterator();
                    while (it5.hasNext()) {
                        ((tls) it5.next()).invoke(c231Var);
                    }
                    br60 br60Var3 = (br60) d.this.y.get(c231Var.c());
                    if (br60Var3 != null) {
                        Iterator it6 = br60Var3.iterator();
                        while (it6.hasNext()) {
                            ((tls) it6.next()).invoke(c231Var);
                        }
                    }
                    return zy11.a;
                }
            });
            return;
        }
        Iterator it5 = kotlin.collections.a.J0(concurrentHashMap2.values()).iterator();
        while (it5.hasNext()) {
            ((tls) it5.next()).invoke(c231Var);
        }
        br60 br60Var3 = (br60) concurrentHashMap.get(c231Var.c());
        if (br60Var3 != null) {
            Iterator it6 = br60Var3.iterator();
            while (it6.hasNext()) {
                ((tls) it6.next()).invoke(c231Var);
            }
        }
    }

    public final void b(String str, l6o l6oVar, boolean z, final tls tlsVar) {
        Object putIfAbsent;
        Object putIfAbsent2;
        ngd0 ngd0Var = ngd0.G;
        final c231 k = k(str);
        ConcurrentHashMap concurrentHashMap = this.y;
        if (k == null) {
            if (l6oVar != null) {
                ParsingException parsingException = fg90.a;
                l6oVar.e(new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, g8e.o("No variable could be resolved for '", str), null, null, null, 24));
            }
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(str, (obj = new br60()))) != null) {
                obj = putIfAbsent2;
            }
            ((br60) obj).a(tlsVar);
            return;
        }
        if (z) {
            Div2View div2View = (Div2View) this.a.get();
            if (div2View == null) {
                ngd0Var.p();
                fu11 fu11Var = fu11.a;
                if (!fu11Var.a()) {
                    fu11Var.b(new do91(16, tlsVar, k));
                }
                tlsVar.invoke(k);
            } else {
                ngd0Var.p();
                fu11 fu11Var2 = fu11.a;
                if (!fu11Var2.a()) {
                    com.yandex.div.core.util.binding.a g = unr0.g(div2View, ngd0Var);
                    if (!fu11Var2.a()) {
                        g.c(new sls() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$subscribeToVariableChangeImpl$$inlined$doOnMainThread$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                tls.this.invoke(k);
                                return zy11.a;
                            }
                        });
                    }
                }
                tlsVar.invoke(k);
            }
        }
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj2 = new br60()))) != null) {
            obj2 = putIfAbsent;
        }
        ((br60) obj2).a(tlsVar);
    }

    @Override // defpackage.f231
    public final f1k e(List list, tls tlsVar) {
        Object putIfAbsent;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ConcurrentHashMap concurrentHashMap = this.z;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new br60()))) != null) {
                obj = putIfAbsent;
            }
            ((br60) obj).a(tlsVar);
        }
        return new svo(3, list, this, tlsVar);
    }

    @Override // defpackage.f231
    public final List f() {
        return kotlin.collections.a.J0(this.c.values());
    }

    @Override // defpackage.f231
    public final f1k g(final ArrayList arrayList, final tls tlsVar) {
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!this.c.containsKey(str)) {
                f231 f231Var = this.b;
                if ((f231Var != null ? f231Var.k(str) : null) != null) {
                    arrayList2.add(f231Var.l(str, null, false, tlsVar));
                }
            }
            b(str, null, false, tlsVar);
        }
        return new f1k() { // from class: g231
            @Override // java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    br60 br60Var = (br60) this.y.get((String) it2.next());
                    if (br60Var != null) {
                        br60Var.b(tlsVar);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((f1k) it3.next()).close();
                }
            }
        };
    }

    @Override // defpackage.o231
    public final Object get(String str) {
        c231 k = k(str);
        Object d = k != null ? k.d() : null;
        if (d instanceof Uri) {
            d = new rg21(d.toString());
        }
        if (d != null) {
            return d;
        }
        f231 f231Var = this.b;
        if (f231Var != null) {
            return f231Var.get(str);
        }
        return null;
    }

    @Override // defpackage.f231
    public final void h(rvo rvoVar, final tls tlsVar) {
        this.A.put(rvoVar, tlsVar);
        f231 f231Var = this.b;
        if (f231Var != null) {
            f231Var.h(rvoVar, new tls() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$setOnAnyVariableChangeCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    c231 c231Var = (c231) obj;
                    if (d.this.c.get(c231Var.c()) == null) {
                        tlsVar.invoke(c231Var);
                    }
                    return zy11.a;
                }
            });
        }
    }

    @Override // defpackage.f231
    public final void i() {
        for (fo40 fo40Var : this.w) {
            fo40Var.a.m(this.B);
            fo40Var.a.l(this.C);
            this.x.remove(fo40Var);
        }
        this.A.clear();
    }

    @Override // defpackage.f231
    public final void j() {
        for (fo40 fo40Var : this.w) {
            a aVar = fo40Var.a;
            a aVar2 = fo40Var.a;
            tls tlsVar = this.B;
            aVar.j(tlsVar);
            if (this.x.add(fo40Var)) {
                aVar2.d(tlsVar);
                aVar2.c(this.C);
            }
        }
    }

    @Override // defpackage.f231
    public final c231 k(String str) {
        c231 k;
        c231 c231Var = (c231) this.c.get(str);
        if (c231Var != null) {
            return c231Var;
        }
        f231 f231Var = this.b;
        if (f231Var != null && (k = f231Var.k(str)) != null) {
            return k;
        }
        for (fo40 fo40Var : this.w) {
            ((DivVariableController$requestsObserver$1) fo40Var.b).invoke(str);
            c231 g = fo40Var.a.g(str);
            if (g != null) {
                return g;
            }
        }
        return null;
    }

    @Override // defpackage.f231
    public final f1k l(String str, l6o l6oVar, boolean z, tls tlsVar) {
        if (!this.c.containsKey(str)) {
            f231 f231Var = this.b;
            if ((f231Var != null ? f231Var.k(str) : null) != null) {
                return f231Var.l(str, l6oVar, z, tlsVar);
            }
        }
        b(str, l6oVar, z, tlsVar);
        return new svo(2, this, str, tlsVar);
    }

    @Override // defpackage.f231
    public final void m(c231 c231Var) {
        String c = c231Var.c();
        ConcurrentHashMap concurrentHashMap = this.c;
        c231 c231Var2 = (c231) concurrentHashMap.put(c, c231Var);
        if (c231Var2 == null) {
            c231Var.a(this.B);
            a(c231Var);
            return;
        }
        concurrentHashMap.put(c231Var.c(), c231Var2);
        throw new VariableDeclarationException("Variable '" + c231Var.c() + "' already declared!", 2);
    }
}
