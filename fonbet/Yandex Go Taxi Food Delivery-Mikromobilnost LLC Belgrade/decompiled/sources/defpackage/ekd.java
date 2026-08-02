package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class ekd extends c45 {
    public final HashMap A = new HashMap();
    public Handler B;
    public cj01 C;

    @Override // defpackage.c45
    public final void b() {
        for (dkd dkdVar : this.A.values()) {
            dkdVar.a.disable(dkdVar.b);
        }
    }

    @Override // defpackage.c45
    public final void c() {
        for (dkd dkdVar : this.A.values()) {
            dkdVar.a.enable(dkdVar.b);
        }
    }

    @Override // defpackage.c45
    public void g() {
        HashMap hashMap = this.A;
        for (dkd dkdVar : hashMap.values()) {
            uf10 uf10Var = dkdVar.a;
            ckd ckdVar = dkdVar.c;
            uf10Var.releaseSource(dkdVar.b);
            uf10Var.removeEventListener(ckdVar);
            uf10Var.removeDrmEventListener(ckdVar);
        }
        hashMap.clear();
    }

    public abstract sf10 h(Object obj, sf10 sf10Var);

    public long i(long j, Object obj) {
        return j;
    }

    public int j(int i, Object obj) {
        return i;
    }

    public abstract void k(Object obj, uf10 uf10Var, a9z0 a9z0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [bkd, tf10] */
    public final void l(final Integer num, uf10 uf10Var) {
        HashMap hashMap = this.A;
        d6z.l(!hashMap.containsKey(num));
        ?? r1 = new tf10() { // from class: bkd
            @Override // defpackage.tf10
            public final void onSourceInfoRefreshed(uf10 uf10Var2, a9z0 a9z0Var) {
                ekd.this.k(num, uf10Var2, a9z0Var);
            }
        };
        ckd ckdVar = new ckd(this, num);
        hashMap.put(num, new dkd(uf10Var, r1, ckdVar));
        Handler handler = this.B;
        handler.getClass();
        uf10Var.addEventListener(handler, ckdVar);
        Handler handler2 = this.B;
        handler2.getClass();
        uf10Var.addDrmEventListener(handler2, ckdVar);
        cj01 cj01Var = this.C;
        vyc0 vyc0Var = this.z;
        d6z.z(vyc0Var);
        uf10Var.prepareSource(r1, cj01Var, vyc0Var);
        if (this.b.isEmpty()) {
            uf10Var.disable(r1);
        }
    }

    @Override // defpackage.uf10
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.A.values().iterator();
        while (it.hasNext()) {
            ((dkd) it.next()).a.maybeThrowSourceInfoRefreshError();
        }
    }
}
