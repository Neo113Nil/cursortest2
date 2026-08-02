package defpackage;

import com.yandex.quark.webchat.feature.dependencies.BufferingProfile;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public abstract class az4 implements k9e {
    public final String a;
    public final wls b;
    public final t1j0 c;
    public final xa20 w;
    public final LinkedHashSet x = new LinkedHashSet();

    public az4(String str, wls wlsVar, t1j0 t1j0Var, xa20 xa20Var) {
        this.a = str;
        this.b = wlsVar;
        this.c = t1j0Var;
        this.w = xa20Var;
    }

    @Override // defpackage.k9e
    public final synchronized void a() {
        this.x.clear();
        this.c.clear();
    }

    public void c(e38 e38Var) {
        w(e38Var);
    }

    public void d(v2n v2nVar) {
        w(v2nVar);
    }

    public void g(dsw dswVar) {
        w(dswVar);
    }

    public void i(y9z y9zVar) {
        w(y9zVar);
    }

    public void j(e8h e8hVar) {
        w(e8hVar);
    }

    public void k(Set set) {
        w(set);
    }

    public void m(dsu dsuVar) {
        w(dsuVar);
    }

    public void n(e8h e8hVar) {
        w(e8hVar);
    }

    @Override // defpackage.k9e
    public final synchronized syj0 p(Object obj) {
        this.x.add(obj);
        this.c.a(new kn2(1, this, obj));
        return new lyj0(new ks1(2, this, obj));
    }

    @Override // defpackage.k9e
    public final String q() {
        return this.a;
    }

    public void s(v2n v2nVar) {
        w(v2nVar);
    }

    public void t(yv yvVar) {
        w(yvVar);
    }

    public void u(ms1 ms1Var) {
        w(ms1Var);
    }

    public void v(BufferingProfile bufferingProfile) {
        w(bufferingProfile);
    }

    public final synchronized void w(Object obj) {
        this.c.save(obj);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            try {
                this.b.invoke(it.next(), obj);
            } catch (Throwable th) {
                this.w.a(new ple(this.a, 0), th);
            }
        }
    }
}
