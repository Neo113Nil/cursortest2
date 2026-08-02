package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class p0b extends ky4 {
    public x08 y;

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        x08 x08Var = this.y;
        if (x08Var != null) {
            x08Var.cancel();
            this.y = null;
        }
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        r0b r0bVar = (r0b) ((m8g) s020Var).q0.get();
        v4a v4aVar = new v4a(4, this);
        z83.g(null, r0bVar.c, Looper.myLooper());
        x08 x08Var = r0bVar.e;
        if (x08Var == null) {
            x08Var = r0bVar.b.f(new q0b(0, r0bVar, v4aVar));
            r0bVar.e = x08Var;
        }
        this.y = x08Var;
    }
}
