package xsna;

import xsna.v4s;

/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes11.dex */
public final class w4s implements v4s.a {
    public final v82 a;
    public final x82 b;
    public final cks c;
    public final d5s d;
    public final mta0 e;
    public final o1e f;

    public w4s(v82 v82Var, x82 x82Var) {
        cks cksVar = x4s.a;
        d5s d5sVar = new d5s(x4s.b);
        mta0 mta0Var = new mta0();
        this.a = v82Var;
        this.b = x82Var;
        this.c = cksVar;
        this.d = d5sVar;
        this.e = mta0Var;
        this.f = new o1e(this, 23);
    }

    @Override // xsna.v4s.a
    public final oup0 a(v4s v4sVar, b6s b6sVar, int i, int i2) {
        x82 x82Var = this.b;
        x82Var.getClass();
        int i3 = x82Var.a;
        b6s b6sVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? b6sVar : new b6s(swe0.g(b6sVar.b + i3, 1, 1000));
        this.a.getClass();
        return b(new nup0(v4sVar, b6sVar2, i, i2, null));
    }

    public final oup0 b(nup0 nup0Var) {
        cks cksVar = this.c;
        ya yaVar = new ya(16, this, nup0Var);
        synchronized (((xa4) cksVar.b)) {
            oup0 oup0Var = (oup0) ((m900) cksVar.c).get(nup0Var);
            if (oup0Var != null) {
                if (oup0Var.B()) {
                    return oup0Var;
                }
            }
            try {
                oup0 oup0Var2 = (oup0) yaVar.invoke(new j20(27, cksVar, nup0Var));
                synchronized (((xa4) cksVar.b)) {
                    try {
                        if (((m900) cksVar.c).get(nup0Var) == null && oup0Var2.B()) {
                            ((m900) cksVar.c).put(nup0Var, oup0Var2);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return oup0Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
