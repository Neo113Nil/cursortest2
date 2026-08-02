package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import xsna.io00;
import xsna.twf;
import xsna.wl00;
import xsna.wwf;

/* compiled from: VKClusterManager.kt */
/* loaded from: classes3.dex */
public final class kbr0<T extends twf> extends vwf<jbr0<? extends T>> implements wwf<T>, her0, eer0 {
    public kbr0(Context context, ndr0 ndr0Var) {
        super(context, ndr0Var.a);
    }

    @Override // xsna.wwf
    public final void b() {
        ys1 ys1Var = this.e;
        ys1Var.lock();
        try {
            ys1Var.I();
        } finally {
            ys1Var.unlock();
        }
    }

    @Override // xsna.her0
    public final boolean c(qdr0 qdr0Var) {
        return this.b.e(qdr0Var.a);
    }

    @Override // xsna.wwf
    public final boolean d(tqg tqgVar) {
        jbr0 jbr0Var = new jbr0(tqgVar);
        ys1 ys1Var = this.e;
        ys1Var.lock();
        try {
            return ys1Var.R(jbr0Var);
        } finally {
            ys1Var.unlock();
        }
    }

    @Override // xsna.wwf
    public final boolean h(Collection<? extends T> collection) {
        Collection<? extends T> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(new jbr0((twf) it.next()));
        }
        ys1 ys1Var = this.e;
        ys1Var.lock();
        try {
            return ys1Var.a(arrayList);
        } finally {
            ys1Var.unlock();
        }
    }

    @Override // xsna.wwf
    public final void i(rdr0 rdr0Var) {
        io00.a aVar;
        io00 io00Var = this.b;
        if (io00Var == null || (aVar = (io00.a) ((wl00.b) io00Var.c.get("selected"))) == null) {
            return;
        }
        aVar.b(rdr0Var.a);
    }

    @Override // xsna.wwf
    public final void k() {
        io00.a aVar;
        io00 io00Var = this.b;
        if (io00Var == null || (aVar = (io00.a) ((wl00.b) io00Var.c.get("selected"))) == null) {
            return;
        }
        aVar.a();
    }

    public final void m(wwf.a<T> aVar) {
        uq80 uq80Var = new uq80(aVar, 7);
        this.l = uq80Var;
        this.f.o = uq80Var;
    }

    public final void n(wwf.b<T> bVar) {
        gs00 gs00Var = new gs00(bVar, 15);
        this.k = gs00Var;
        this.f.p = gs00Var;
    }

    public final void o(bxf<T> bxfVar) {
        axf axfVar = (axf) bxfVar.getParent();
        axfVar.s = bxfVar;
        mcl mclVar = this.f;
        mclVar.o = null;
        mclVar.p = null;
        this.d.a();
        this.c.a();
        vwf<T> vwfVar = this.f.c;
        io00.a aVar = vwfVar.c;
        aVar.e = null;
        aVar.c = null;
        aVar.d = null;
        io00.a aVar2 = vwfVar.d;
        aVar2.e = null;
        aVar2.c = null;
        aVar2.d = null;
        this.f = axfVar;
        axfVar.i();
        mcl mclVar2 = this.f;
        mclVar2.o = this.l;
        mclVar2.getClass();
        this.f.getClass();
        mcl mclVar3 = this.f;
        mclVar3.p = this.k;
        mclVar3.getClass();
        this.f.getClass();
        g();
    }
}
