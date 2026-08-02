package xsna;

import android.util.Pair;
import java.util.ArrayList;
import xsna.i840;

/* compiled from: MultiplexProducer.java */
/* loaded from: classes12.dex */
public final class h840 extends uk6 {
    public final /* synthetic */ Pair a;
    public final /* synthetic */ i840.a b;

    public h840(i840.a aVar, Pair pair) {
        this.b = aVar;
        this.a = pair;
    }

    @Override // xsna.uk6, xsna.vhd0
    public final void a() {
        tk6.a(this.b.j());
    }

    @Override // xsna.uk6, xsna.vhd0
    public final void b() {
        tk6.e(this.b.l());
    }

    @Override // xsna.vhd0
    public final void c() {
        boolean remove;
        ArrayList arrayList;
        tk6 tk6Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        synchronized (this.b) {
            try {
                remove = this.b.b.remove(this.a);
                arrayList = null;
                if (!remove) {
                    tk6Var = null;
                    arrayList2 = null;
                } else if (this.b.b.isEmpty()) {
                    tk6Var = this.b.f;
                    arrayList2 = null;
                } else {
                    ArrayList k = this.b.k();
                    arrayList2 = this.b.l();
                    arrayList3 = this.b.j();
                    tk6Var = null;
                    arrayList = k;
                }
                arrayList3 = arrayList2;
            } catch (Throwable th) {
                throw th;
            }
        }
        tk6.d(arrayList);
        tk6.e(arrayList2);
        tk6.a(arrayList3);
        if (tk6Var != null) {
            tk6Var.f();
        }
        if (remove) {
            ((l7j) this.a.first).a();
        }
    }

    @Override // xsna.uk6, xsna.vhd0
    public final void d() {
        tk6.d(this.b.k());
    }
}
