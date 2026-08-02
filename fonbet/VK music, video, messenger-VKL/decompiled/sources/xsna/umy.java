package xsna;

import kotlin.coroutines.d;
import xsna.pvj;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class umy implements huf0, pvj {
    public final kotlin.coroutines.d b;
    public final wzs<yvj, spj<? super s3q0>, Object> c;
    public final hpj d;
    public yok0 e;

    /* JADX WARN: Multi-variable type inference failed */
    public umy(kotlin.coroutines.d dVar, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        this.b = dVar;
        this.c = wzsVar;
        this.d = zvj.a(dVar.plus(this));
    }

    @Override // xsna.huf0
    public final void d() {
        yok0 yok0Var = this.e;
        if (yok0Var != null) {
            yok0Var.P(new pzy());
        }
        this.e = null;
    }

    @Override // xsna.huf0
    public final void e() {
        yok0 yok0Var = this.e;
        if (yok0Var != null) {
            yok0Var.b(fsk.j("Old job was still running!", null));
        }
        this.e = myc0.h(this.d, null, null, this.c, 3);
    }

    @Override // xsna.huf0
    public final void f() {
        yok0 yok0Var = this.e;
        if (yok0Var != null) {
            yok0Var.P(new pzy());
        }
        this.e = null;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<?> getKey() {
        return pvj.a.b;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        gvi gviVar = (gvi) dVar.get(gvi.c);
        if (gviVar != null) {
            gviVar.e(this, th);
        }
        pvj pvjVar = (pvj) this.b.get(pvj.a.b);
        if (pvjVar == null) {
            throw th;
        }
        pvjVar.handleException(dVar, th);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }
}
