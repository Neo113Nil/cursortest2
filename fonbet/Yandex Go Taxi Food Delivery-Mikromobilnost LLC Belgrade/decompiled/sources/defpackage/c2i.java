package defpackage;

import android.app.Application;

/* loaded from: classes5.dex */
public final class c2i implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        t1i t1iVar;
        synchronized (bvf0.g) {
            y8g y8gVar = bvf0.e;
            if (y8gVar == null) {
                y8gVar = null;
            }
            gjz gjzVar = y8gVar.a;
            Application application = (Application) gjzVar.b.c;
            q5z.h(application);
            qcp0 qcp0Var = new qcp0();
            dci b = gjzVar.b();
            q5z.h(b);
            apf apfVar = new apf(application, qcp0Var, b, gjzVar.c(), 11);
            t1iVar = (t1i) i5m.b(new wif((Object) new iyf(apfVar, 2), (xvf0) new bpf(new iyf(apfVar, 0), new iyf(apfVar, 3), n3w.a(new o2i(p2i.a)), new iyf(apfVar, 1), 7), 12)).get();
        }
        q5z.i(t1iVar);
        return t1iVar;
    }
}
