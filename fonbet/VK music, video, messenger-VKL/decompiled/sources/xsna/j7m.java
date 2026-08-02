package xsna;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.DiUnscopedWithParamsComponent;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DiContextConfigurationImpl.kt */
/* loaded from: classes.dex */
public final class j7m extends i7m {
    public final fmg0 a;
    public final ConcurrentHashMap<String, oi6> b;

    public j7m(fmg0 fmg0Var) {
        this.a = fmg0Var;
        new ConcurrentHashMap();
        this.b = new ConcurrentHashMap<>();
    }

    @Override // xsna.i7m
    public final y7m a(String str) {
        oi6 putIfAbsent;
        ConcurrentHashMap<String, oi6> concurrentHashMap = this.b;
        oi6 oi6Var = concurrentHashMap.get(str);
        if (oi6Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (oi6Var = new y7m(new v7m(str), this.a)))) != null) {
            oi6Var = putIfAbsent;
        }
        return (y7m) oi6Var;
    }

    @Override // xsna.i7m
    public final <C extends DiUnscopedComponent> void b(String str, gzs<? extends b7m<C>> gzsVar) {
        this.a.h(new v7m(str), new d7m(new lcn(gzsVar)));
    }

    @Override // xsna.i7m
    public final <C extends DiUnscopedComponent> void c(String str, gzs<? extends b7m<C>> gzsVar) {
        this.a.c.putIfAbsent(new v7m(str), new d7m(new lcn(gzsVar)));
    }

    @Override // xsna.i7m
    public final <C extends DiUnscopedWithParamsComponent<P>, P extends l9i> void d(String str, gzs<? extends q8m<C, P>> gzsVar) {
        this.a.h(new v7m(str), new g7m(new w9e0(gzsVar)));
    }
}
