package defpackage;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ie7 implements yu00 {
    public final jp50 a;
    public final p7j0 b;
    public final boolean c;
    public final qu00 d;
    public final kq90 e;

    public ie7(jp50 jp50Var, p7j0 p7j0Var, boolean z, qu00 qu00Var, kq90 kq90Var) {
        this.a = jp50Var;
        this.b = p7j0Var;
        this.c = z;
        this.d = qu00Var;
        this.e = kq90Var;
    }

    @Override // defpackage.yu00
    public final Object a(Map map, InputStream inputStream) {
        return c(map, inputStream, new kn2(2, this, map));
    }

    @Override // defpackage.yu00
    public final Object b(Map map, InputStream inputStream, wu00 wu00Var) {
        return c(map, inputStream, new q(25, this, map, wu00Var));
    }

    public final kg90 c(Map map, InputStream inputStream, tls tlsVar) {
        leu leuVar = new leu(map);
        p7j0 p7j0Var = this.b;
        dyg save = this.a.save(new n8j0(p7j0Var.a, p7j0Var.b, leuVar, this.e), this.c, inputStream, new he7(this, tlsVar));
        if (save instanceof cyg) {
            return (kg90) ((cyg) save).a;
        }
        if (save instanceof byg) {
            return (kg90) ((byg) save).a();
        }
        w511.b();
        return null;
    }
}
