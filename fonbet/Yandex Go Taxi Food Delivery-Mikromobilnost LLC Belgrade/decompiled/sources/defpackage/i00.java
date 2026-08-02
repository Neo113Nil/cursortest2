package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class i00 implements vff0 {
    public final Looper a;
    public final el21 b;
    public final ArrayList c = new ArrayList();
    public boolean w;

    public i00(Looper looper, el21 el21Var, wff0 wff0Var) {
        this.a = looper;
        this.b = el21Var;
        z83.g(null, looper, Looper.myLooper());
        wff0Var.a(this);
    }

    public final void a(xx4 xx4Var) {
        z83.g(null, this.a, Looper.myLooper());
        if (this.w) {
            return;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hr hrVar = (hr) it.next();
            if (xx4Var.g(hrVar)) {
                return;
            }
            if (xx4Var.f(hrVar)) {
                hrVar.b();
                it.remove();
            }
        }
        arrayList.add(xx4Var);
        xx4Var.a = this;
        xx4Var.i(this.b.f(xx4Var));
    }

    @Override // defpackage.vff0
    public final void b() {
        this.w = true;
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((hr) it.next()).b();
        }
        arrayList.clear();
    }
}
