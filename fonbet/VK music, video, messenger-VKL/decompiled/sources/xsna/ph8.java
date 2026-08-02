package xsna;

import android.content.Context;
import xsna.v1t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph8 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((qh8) this.c).C = null;
                break;
            case 1:
                ((gzs) this.c).invoke();
                break;
            case 2:
                ((scl) this.c).k = false;
                break;
            case 3:
                ic20 ic20Var = (ic20) this.c;
                io.reactivex.rxjava3.subjects.d<Integer> dVar = ic20Var.i;
                com.vk.movika.sdk.android.defaultplayer.interactive.c cVar = new com.vk.movika.sdk.android.defaultplayer.interactive.c(19);
                dVar.getClass();
                ic20Var.i(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.e2(dVar, cVar), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), io.reactivex.rxjava3.internal.functions.a.e, new t520(ic20Var, 2));
                break;
            case 4:
                vfg0 vfg0Var = (vfg0) this.c;
                wdt0 wdt0Var = vfg0Var.h;
                if (wdt0Var != null) {
                    wdt0Var.f.set(true);
                    wdt0Var.a();
                }
                vfg0Var.h = null;
                hg1.f(vfg0Var.g);
                vfg0Var.g = null;
                break;
            case 5:
                k0p0 k0p0Var = (k0p0) this.c;
                k0p0Var.e.b(new v1t0.b(true));
                break;
            default:
                dsq0 dsq0Var = (dsq0) this.c;
                dsq0Var.s().w().g(dsq0Var.l);
                dsq0Var.s().w().g(dsq0Var.m);
                dsq0Var.s().w().g(dsq0Var.o);
                dsq0Var.s().w().g(dsq0Var.n);
                dsq0Var.s().w().g(dsq0Var.i);
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                cuz.a(context).d(dsq0Var.k);
                dsq0Var.s().w().g(dsq0Var.j);
                break;
        }
    }
}
