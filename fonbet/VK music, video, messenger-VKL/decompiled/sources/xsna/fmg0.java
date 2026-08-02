package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.DiUnscopedWithParamsComponent;
import com.vk.di.scope.SingletonScope;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e7m;
import xsna.wrk;

/* compiled from: RootDiContextImpl.kt */
/* loaded from: classes.dex */
public final class fmg0 implements l7m {
    public final p8m a;
    public final i570 b = new i570();
    public final ConcurrentHashMap<q5q0, c7m> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<q5q0, ConcurrentHashMap<q5q0, d8m>> d = new ConcurrentHashMap<>();
    public final n7m e = new n7m(new o7m(this), this);

    public fmg0(p8m p8mVar, wuj wujVar) {
        this.a = p8mVar;
    }

    @Override // xsna.h7m
    public final DiScopedComponent a(rfc rfcVar) {
        return ((m8m) d(SingletonScope.a)).a(rfcVar);
    }

    @Override // xsna.h7m
    public final DiUnscopedWithParamsComponent b(rfc rfcVar, l9i l9iVar) {
        return (DiUnscopedWithParamsComponent) g(new k9i(rfcVar, l9iVar)).d;
    }

    @Override // xsna.h7m
    public final DiScopedWithParamsComponent c(rfc rfcVar, htd htdVar) {
        return ((m8m) d(SingletonScope.a)).b(rfcVar, htdVar);
    }

    @Override // xsna.l7m
    public final void clear() {
        wrk.a aVar = wrk.a;
        synchronized (wrk.b) {
            try {
                for (r470 r470Var : new HashSet(this.e.a)) {
                    n7m n7mVar = this.e;
                    r470Var.b.remove(n7mVar);
                    n7mVar.a.remove(r470Var);
                    if (r470Var instanceof j9i) {
                        j(r470Var);
                    }
                    if (r470Var instanceof a8m) {
                        j(r470Var);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.h7m
    public final n8m d(x7m x7mVar) {
        return f(x7mVar).d;
    }

    public final c7m e(k9i<?> k9iVar) {
        rfc rfcVar = k9iVar.a;
        c7m c7mVar = this.c.get(new u7m(rfcVar));
        if (c7mVar != null) {
            return c7mVar;
        }
        if (this.a.a) {
            return new ipf0(rfcVar);
        }
        throw new IllegalStateException(rfcVar.h() + " has no registered factories");
    }

    public final <S extends pwj0> a8m f(x7m<S, ? extends pwj0> x7mVar) {
        Throwable th;
        a8m a8mVar;
        b8m b8mVar = new b8m(x7mVar.a());
        r470 r470Var = (r470) ((LinkedHashMap) this.b.a).get(b8mVar);
        a8m a8mVar2 = r470Var instanceof a8m ? (a8m) r470Var : null;
        if (a8mVar2 != null) {
            return a8mVar2;
        }
        synchronized (wrk.b) {
            try {
                r470 r470Var2 = (r470) ((LinkedHashMap) this.b.a).get(b8mVar);
                if (r470Var2 instanceof a8m) {
                    try {
                        a8mVar = (a8m) r470Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    a8mVar = null;
                }
                if (a8mVar != null) {
                    return a8mVar;
                }
                x7m<S, ? extends pwj0> b = x7mVar.b();
                a8m f = b != null ? f(b) : null;
                try {
                    a8m a8mVar3 = new m8m(this, f != null ? f.d : null, x7mVar, b8mVar, this.a).e;
                    ((LinkedHashMap) this.b.a).put(b8mVar, a8mVar3);
                    if (x7mVar.equals(SingletonScope.a)) {
                        n7m n7mVar = this.e;
                        a8mVar3.b.add(n7mVar);
                        n7mVar.a.add(a8mVar3);
                    }
                    if (f != null) {
                        f.b.add(a8mVar3);
                        a8mVar3.a.add(f);
                    }
                    return a8mVar3;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final <C extends a7m> j9i g(k9i<C> k9iVar) {
        Iterable<j9i> iterable;
        r470 r470Var = (r470) ((LinkedHashMap) this.b.a).get(k9iVar);
        j9i j9iVar = r470Var instanceof j9i ? (j9i) r470Var : null;
        if (j9iVar != null) {
            return j9iVar;
        }
        synchronized (wrk.b) {
            r470 r470Var2 = (r470) ((LinkedHashMap) this.b.a).get(k9iVar);
            j9i j9iVar2 = r470Var2 instanceof j9i ? (j9i) r470Var2 : null;
            if (j9iVar2 != null) {
                return j9iVar2;
            }
            c7m e = e(k9iVar);
            e7m e7mVar = new e7m(this);
            j9i j9iVar3 = new j9i(k9iVar, e.a(e7mVar, k9iVar.b));
            ((LinkedHashMap) this.b.a).put(k9iVar, j9iVar3);
            e7m.a aVar = e7mVar.b;
            if (aVar instanceof e7m.a.C2783a) {
                iterable = ((e7m.a.C2783a) aVar).a;
            } else {
                if (!(aVar instanceof e7m.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                iterable = EmptyList.b;
            }
            for (j9i j9iVar4 : iterable) {
                j9iVar4.b.add(j9iVar3);
                j9iVar3.a.add(j9iVar4);
            }
            e7mVar.b = new e7m.a.b(new ipy(j9iVar3, 1));
            return j9iVar3;
        }
    }

    public final void h(v7m v7mVar, c7m c7mVar) {
        this.c.put(v7mVar, c7mVar);
    }

    public final void i(v7m v7mVar, q5q0 q5q0Var, d8m d8mVar) {
        ConcurrentHashMap<q5q0, d8m> putIfAbsent;
        ConcurrentHashMap<q5q0, ConcurrentHashMap<q5q0, d8m>> concurrentHashMap = this.d;
        ConcurrentHashMap<q5q0, d8m> concurrentHashMap2 = concurrentHashMap.get(v7mVar);
        if (concurrentHashMap2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(v7mVar, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = putIfAbsent;
        }
        concurrentHashMap2.put(q5q0Var, d8mVar);
    }

    public final void j(r470 r470Var) {
        CopyOnWriteArraySet<r470> copyOnWriteArraySet = r470Var.a;
        if (r470Var.b.isEmpty()) {
            Iterator it = new HashSet(copyOnWriteArraySet).iterator();
            while (it.hasNext()) {
                r470 r470Var2 = (r470) it.next();
                r470Var2.b.remove(r470Var);
                copyOnWriteArraySet.remove(r470Var2);
                if (r470Var2 instanceof j9i) {
                    j(r470Var2);
                }
            }
            ((LinkedHashMap) this.b.a).remove(r470Var.a());
            if (r470Var instanceof a8m) {
                ((a8m) r470Var).d.clear();
            }
        }
    }

    @Override // xsna.h7m
    /* renamed from: a, reason: collision with other method in class */
    public final DiUnscopedComponent mo408a(rfc rfcVar) {
        return (DiUnscopedComponent) g(new k9i(rfcVar, null)).d;
    }
}
