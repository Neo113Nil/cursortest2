package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class fy5 extends yx5 {
    public final WeakReference a;
    public final WeakReference b;
    public final WeakReference c;
    public final WeakReference d;

    public fy5(tls tlsVar, sls slsVar, tls tlsVar2, tn1 tn1Var) {
        this.a = new WeakReference(tlsVar);
        this.b = new WeakReference(slsVar);
        this.c = new WeakReference(tlsVar2);
        this.d = new WeakReference(tn1Var);
    }

    @Override // defpackage.yx5
    public final void a(int i, CharSequence charSequence) {
        if (i == 5 || i == 10 || i == 13) {
            sls slsVar = (sls) this.b.get();
            if (slsVar != null) {
                slsVar.invoke();
            }
        } else {
            tls tlsVar = (tls) this.c.get();
            if (tlsVar != null) {
                tlsVar.invoke(Integer.valueOf(i));
            }
        }
        wls wlsVar = (wls) this.d.get();
        if (wlsVar != null) {
            wlsVar.invoke(Integer.valueOf(i), charSequence.toString());
        }
    }

    @Override // defpackage.yx5
    public final void b() {
    }

    @Override // defpackage.yx5
    public final void c(zx5 zx5Var) {
        tls tlsVar = (tls) this.a.get();
        if (tlsVar != null) {
            tlsVar.invoke(zx5Var.a);
        }
    }
}
