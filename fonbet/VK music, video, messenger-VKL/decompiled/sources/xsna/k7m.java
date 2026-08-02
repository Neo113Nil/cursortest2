package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.DiUnscopedWithParamsComponent;
import com.vk.di.scope.SingletonScope;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: DiContextImpl.kt */
/* loaded from: classes.dex */
public final class k7m implements l7m {
    public final fmg0 a;
    public final n7m b = new n7m(new o7m(this), this);

    public k7m(fmg0 fmg0Var) {
        this.a = fmg0Var;
    }

    @Override // xsna.h7m
    public final DiScopedComponent a(rfc rfcVar) {
        return ((m8m) d(SingletonScope.a)).a(rfcVar);
    }

    @Override // xsna.h7m
    public final DiUnscopedWithParamsComponent b(rfc rfcVar, l9i l9iVar) {
        j9i g = this.a.g(new k9i(rfcVar, l9iVar));
        CopyOnWriteArraySet<r470> copyOnWriteArraySet = g.b;
        n7m n7mVar = this.b;
        copyOnWriteArraySet.add(n7mVar);
        n7mVar.a.add(g);
        return (DiUnscopedWithParamsComponent) g.d;
    }

    @Override // xsna.h7m
    public final DiScopedWithParamsComponent c(rfc rfcVar, htd htdVar) {
        return ((m8m) d(SingletonScope.a)).b(rfcVar, htdVar);
    }

    @Override // xsna.l7m
    public final void clear() {
        synchronized (wrk.b) {
            try {
                Iterator it = new HashSet(this.b.a).iterator();
                while (it.hasNext()) {
                    r470 r470Var = (r470) it.next();
                    n7m n7mVar = this.b;
                    r470Var.b.remove(n7mVar);
                    n7mVar.a.remove(r470Var);
                    if (r470Var instanceof j9i) {
                        this.a.j(r470Var);
                    }
                    if (r470Var instanceof a8m) {
                        this.a.j(r470Var);
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
        a8m f = this.a.f(x7mVar);
        CopyOnWriteArraySet<r470> copyOnWriteArraySet = f.b;
        n7m n7mVar = this.b;
        copyOnWriteArraySet.add(n7mVar);
        n7mVar.a.add(f);
        return f.d;
    }

    @Override // xsna.h7m
    /* renamed from: a */
    public final DiUnscopedComponent mo408a(rfc rfcVar) {
        j9i g = this.a.g(new k9i(rfcVar, null));
        CopyOnWriteArraySet<r470> copyOnWriteArraySet = g.b;
        n7m n7mVar = this.b;
        copyOnWriteArraySet.add(n7mVar);
        n7mVar.a.add(g);
        return (DiUnscopedComponent) g.d;
    }
}
