package xsna;

import java.util.concurrent.ConcurrentHashMap;
import xsna.pwj0;

/* compiled from: DiScopeConfigurationImpl.kt */
/* loaded from: classes.dex */
public final class z7m<SK extends pwj0> extends oi6 {
    public final x7m<SK, ? extends pwj0> a;
    public final ConcurrentHashMap<q5q0, d8m> b = new ConcurrentHashMap<>();

    public z7m(x7m<SK, ? extends pwj0> x7mVar) {
        this.a = x7mVar;
    }

    @Override // xsna.oi6
    public final void e(rfc rfcVar, maj majVar) {
        this.b.put(new u7m(rfcVar), new e8m(new x9e0(majVar)));
    }

    @Override // xsna.oi6
    public final void f(rfc rfcVar, fgm fgmVar) {
        this.b.put(new u7m(rfcVar), new k8m(new zxp(fgmVar)));
    }
}
