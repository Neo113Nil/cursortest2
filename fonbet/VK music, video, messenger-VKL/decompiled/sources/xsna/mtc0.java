package xsna;

import xsna.ltc0;

/* compiled from: PostprocessorProducer.java */
/* loaded from: classes12.dex */
public final class mtc0 implements Runnable {
    public final /* synthetic */ ltc0.a b;

    public mtc0(ltc0.a aVar) {
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uvf<svf> uvfVar;
        int i;
        boolean p;
        synchronized (this.b) {
            ltc0.a aVar = this.b;
            uvfVar = aVar.g;
            i = aVar.h;
            aVar.g = null;
            aVar.i = false;
        }
        if (uvf.t(uvfVar)) {
            try {
                ltc0.a.l(this.b, uvfVar, i);
                uvfVar.close();
            } catch (Throwable th) {
                uvf.q(uvfVar);
                throw th;
            }
        }
        ltc0.a aVar2 = this.b;
        synchronized (aVar2) {
            aVar2.j = false;
            p = aVar2.p();
        }
        if (p) {
            ltc0.this.c.execute(new mtc0(aVar2));
        }
    }
}
