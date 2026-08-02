package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiScopedWithParamsComponent;
import java.util.concurrent.ConcurrentHashMap;
import xsna.pwj0;
import xsna.x7m;

/* compiled from: DiScopeByKeyConfigurationImpl.kt */
/* loaded from: classes.dex */
public final class y7m<S extends x7m<SK, ?>, SK extends pwj0> extends oi6 {
    public final v7m a;
    public final fmg0 b;

    public y7m(v7m v7mVar, fmg0 fmg0Var) {
        this.a = v7mVar;
        this.b = fmg0Var;
    }

    @Override // xsna.oi6
    public final void e(rfc rfcVar, maj majVar) {
        this.b.i(this.a, new u7m(rfcVar), new e8m(new x9e0(majVar)));
    }

    @Override // xsna.oi6
    public final void f(rfc rfcVar, fgm fgmVar) {
        this.b.i(this.a, new u7m(rfcVar), new k8m(new zxp(fgmVar)));
    }

    public final <C extends DiScopedComponent<SK>> void g(String str, gzs<? extends c8m<C, SK>> gzsVar) {
        this.b.i(this.a, new v7m(str), new e8m(new x9e0(gzsVar)));
    }

    public final <C extends DiScopedComponent<SK>> void h(String str, gzs<? extends c8m<C, SK>> gzsVar) {
        ConcurrentHashMap<q5q0, d8m> putIfAbsent;
        v7m v7mVar = new v7m(str);
        e8m e8mVar = new e8m(new x9e0(gzsVar));
        ConcurrentHashMap<q5q0, ConcurrentHashMap<q5q0, d8m>> concurrentHashMap = this.b.d;
        v7m v7mVar2 = this.a;
        ConcurrentHashMap<q5q0, d8m> concurrentHashMap2 = concurrentHashMap.get(v7mVar2);
        if (concurrentHashMap2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(v7mVar2, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = putIfAbsent;
        }
        concurrentHashMap2.putIfAbsent(v7mVar, e8mVar);
    }

    public final <C extends DiScopedWithParamsComponent<SK, P>, P extends l9i> void i(String str, gzs<? extends o8m<C, SK, P>> gzsVar) {
        this.b.i(this.a, new v7m(str), new k8m(new zxp(gzsVar)));
    }
}
