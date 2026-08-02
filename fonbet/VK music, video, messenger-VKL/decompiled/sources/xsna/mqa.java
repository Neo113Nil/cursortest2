package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.uyg0;

/* compiled from: CertificateStore.kt */
/* loaded from: classes.dex */
public final class mqa extends ryg0 implements eev0 {
    public final wvb0 b;
    public final c460 c;
    public final io.reactivex.rxjava3.core.q<List<t9e0>> d;
    public volatile List<u9e0> e;
    public final io.reactivex.rxjava3.subjects.d<List<u9e0>> f;

    public mqa(wvb0 wvb0Var, c460 c460Var, boolean z, io.reactivex.rxjava3.core.q qVar) {
        super(c460Var, z);
        this.b = wvb0Var;
        this.c = c460Var;
        this.d = qVar;
        this.f = io.reactivex.rxjava3.subjects.d.N0();
        if (epx.f(c460Var.g, uyg0.a.b.a)) {
            qVar.subscribe(new jqa(new iqa(this, 0), 0));
        } else {
            c460Var.a(new kqa(this));
        }
    }

    @Override // xsna.eev0
    public final io.reactivex.rxjava3.subjects.d a() {
        return this.f;
    }

    @Override // xsna.eev0
    public final boolean b() {
        List<u9e0> list = this.e;
        if (list == null) {
            return false;
        }
        List<u9e0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((u9e0) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ryg0
    public final uyg0 c() {
        return this.c;
    }
}
