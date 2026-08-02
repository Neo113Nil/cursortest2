package defpackage;

import java.util.HashMap;

/* loaded from: classes15.dex */
public final class fjs implements xn21 {
    public final kse a;
    public final k020 b;
    public final h3y c;
    public final bv21 d;
    public final HashMap e = new HashMap();

    public fjs(kse kseVar, k020 k020Var, h3y h3yVar, at2 at2Var) {
        this.a = kseVar;
        this.b = k020Var;
        this.c = h3yVar;
        this.d = at2Var.a();
        kse.a(kseVar);
    }

    @Override // defpackage.xn21
    public final e1k b(String str, vn21 vn21Var) {
        kse.a(this.a);
        am21 b = this.d.b(str);
        Long l = b != null ? b.b : null;
        Long l2 = b != null ? b.a : null;
        if (l2 != null && l != null && l2.longValue() >= l.longValue()) {
            return e1k.M1;
        }
        HashMap hashMap = this.e;
        ejs ejsVar = (ejs) hashMap.get(str);
        if (ejsVar == null) {
            ejsVar = new ejs(this, str);
            hashMap.put(str, ejsVar);
        }
        op3 op3Var = ejsVar.c;
        ejsVar.b.b(vn21Var);
        kgx[] kgxVarArr = ejs.x;
        kgx kgxVar = kgxVarArr[0];
        if (op3Var.a() == null) {
            xo3 c = ((to3) ejsVar.w.c.get()).c(ejsVar, ejsVar.a);
            kgx kgxVar2 = kgxVarArr[0];
            op3Var.b(c);
        }
        return new xi3(7, ejsVar, vn21Var);
    }
}
