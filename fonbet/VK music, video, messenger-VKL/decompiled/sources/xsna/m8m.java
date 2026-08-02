package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.di.component.DiWithScopeComponent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.g8m;
import xsna.pwj0;

/* compiled from: DiScopedContextImpl.kt */
/* loaded from: classes.dex */
public final class m8m<SK extends pwj0> implements n8m<SK> {
    public final fmg0 a;
    public final n8m<? extends pwj0> b;
    public final x7m<SK, ? extends pwj0> c;
    public final p8m d;
    public final a8m e;
    public final i570 f = new i570();
    public final ConcurrentHashMap.KeySetView<z470, Boolean> g = ConcurrentHashMap.newKeySet();
    public final z7m<SK> h;

    public m8m(fmg0 fmg0Var, n8m<? extends pwj0> n8mVar, x7m<SK, ? extends pwj0> x7mVar, b8m b8mVar, p8m p8mVar) {
        this.a = fmg0Var;
        this.b = n8mVar;
        this.c = x7mVar;
        this.d = p8mVar;
        this.e = new a8m(b8mVar, this);
        this.h = new z7m<>(x7mVar);
    }

    @Override // xsna.n8m
    public final DiScopedComponent a(rfc rfcVar) {
        return (DiScopedComponent) c(new k9i<>(rfcVar, null)).d;
    }

    @Override // xsna.n8m
    public final DiScopedWithParamsComponent b(rfc rfcVar, l9i l9iVar) {
        return (DiScopedWithParamsComponent) c(new k9i<>(rfcVar, l9iVar)).d;
    }

    @Override // xsna.n8m
    public final j9i c(k9i<? extends DiWithScopeComponent<? extends pwj0>> k9iVar) {
        j9i j9iVar;
        r470 r470Var = (r470) ((LinkedHashMap) this.f.a).get(k9iVar);
        j9i j9iVar2 = r470Var instanceof j9i ? (j9i) r470Var : null;
        if (j9iVar2 == null) {
            synchronized (wrk.b) {
                try {
                    r470 r470Var2 = (r470) ((LinkedHashMap) this.f.a).get(k9iVar);
                    j9iVar = r470Var2 instanceof j9i ? (j9i) r470Var2 : null;
                    if (j9iVar == null && (j9iVar = f(k9iVar)) == null) {
                        n8m<? extends pwj0> n8mVar = this.b;
                        j9i c = n8mVar != null ? n8mVar.c(k9iVar) : null;
                        j9iVar = c == null ? g(k9iVar) : c;
                    }
                    ((LinkedHashMap) this.f.a).put(k9iVar, j9iVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            j9iVar2 = j9iVar;
        }
        a8m a8mVar = this.e;
        j9iVar2.b.add(a8mVar);
        a8mVar.a.add(j9iVar2);
        return j9iVar2;
    }

    @Override // xsna.n8m
    public final void clear() {
        fmg0 fmg0Var;
        a8m d;
        a8m a8mVar = this.e;
        CopyOnWriteArraySet<r470> copyOnWriteArraySet = a8mVar.b;
        CopyOnWriteArraySet<r470> copyOnWriteArraySet2 = a8mVar.a;
        if (copyOnWriteArraySet.isEmpty()) {
            Iterator it = new HashSet(copyOnWriteArraySet2).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                fmg0Var = this.a;
                if (!hasNext) {
                    break;
                }
                r470 r470Var = (r470) it.next();
                r470Var.b.remove(a8mVar);
                copyOnWriteArraySet2.remove(r470Var);
                if (this.g.remove(r470Var.a())) {
                    fmg0Var.j(r470Var);
                }
            }
            n8m<? extends pwj0> n8mVar = this.b;
            if (n8mVar != null && (d = n8mVar.d()) != null) {
                a8mVar.b.remove(d);
                d.a.remove(a8mVar);
                fmg0Var.j(d);
            }
            if (n8mVar != null) {
                n8mVar.clear();
            }
            this.h.b.clear();
            this.c.getClass();
        }
    }

    @Override // xsna.n8m
    public final a8m d() {
        return this.e;
    }

    public final j9i e(d8m d8mVar, k9i<? extends a7m> k9iVar) {
        Iterable<j9i> iterable;
        g8m g8mVar = new g8m(this);
        j9i j9iVar = new j9i(k9iVar, d8mVar.a(k9iVar.b, g8mVar, this.c.a()));
        g8m.a aVar = g8mVar.b;
        if (aVar instanceof g8m.a.C2926a) {
            iterable = ((g8m.a.C2926a) aVar).a;
        } else {
            if (!(aVar instanceof g8m.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            iterable = EmptyList.b;
        }
        for (j9i j9iVar2 : iterable) {
            j9iVar2.b.add(j9iVar);
            j9iVar.a.add(j9iVar2);
        }
        g8mVar.b = new g8m.a.b(new l8m(j9iVar, 0));
        return j9iVar;
    }

    public final j9i f(k9i<? extends DiWithScopeComponent<? extends pwj0>> k9iVar) {
        z7m<SK> z7mVar = this.h;
        ConcurrentHashMap<q5q0, d8m> concurrentHashMap = z7mVar.b;
        if (concurrentHashMap.isEmpty()) {
            z7mVar.a.c(z7mVar);
        }
        d8m d8mVar = concurrentHashMap.get(new u7m(k9iVar.a));
        if (d8mVar != null) {
            return e(d8mVar, k9iVar);
        }
        u7m u7mVar = new u7m(fpf0.a(this.c.getClass()));
        u7m u7mVar2 = new u7m(k9iVar.a);
        ConcurrentHashMap<q5q0, d8m> concurrentHashMap2 = this.a.d.get(u7mVar);
        d8m d8mVar2 = concurrentHashMap2 != null ? concurrentHashMap2.get(u7mVar2) : null;
        if (d8mVar2 != null) {
            return e(d8mVar2, k9iVar);
        }
        return null;
    }

    public final j9i g(k9i<? extends DiWithScopeComponent<? extends pwj0>> k9iVar) {
        if (!this.d.a) {
            throw new IllegalStateException(k9iVar.a.h() + " has no registered factories");
        }
        new ArrayList();
        rfc rfcVar = k9iVar.a;
        this.c.getClass();
        try {
            DiScopedComponent diScopedComponent = (DiScopedComponent) dy2.e(rfcVar);
            if (diScopedComponent == null) {
                diScopedComponent = null;
            }
            return new j9i(k9iVar, diScopedComponent);
        } catch (Throwable th) {
            throw new IllegalStateException(rfcVar + " has no registered factories and lacks STUB field, " + th);
        }
    }
}
