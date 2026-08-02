package defpackage;

import com.google.android.gms.internal.measurement.s0;
import ru.CryptoPro.reprov.x509.PolicyConstraintsExtension;

/* loaded from: classes11.dex */
public final class gr91 {
    public final p791 a;
    public final cr71 b;
    public final cr71 c;
    public final cga1 d;

    public gr91() {
        p791 p791Var = new p791();
        this.a = p791Var;
        cr71 cr71Var = new cr71((cr71) null, p791Var);
        this.c = cr71Var;
        this.b = cr71Var.j();
        cga1 cga1Var = new cga1();
        this.d = cga1Var;
        cr71Var.o(PolicyConstraintsExtension.REQUIRE, new bvb1(cga1Var));
        cga1Var.a("internal.platform", f891.c);
        cr71Var.o("runtime.counter", new n591(Double.valueOf(0.0d)));
    }

    public final r691 a(cr71 cr71Var, s0... s0VarArr) {
        r691 r691Var = r691.z5;
        for (s0 s0Var : s0VarArr) {
            r691Var = mwa1.f(s0Var);
            cwa1.o(this.c);
            if ((r691Var instanceof s691) || (r691Var instanceof o691)) {
                r691Var = this.a.b(cr71Var, r691Var);
            }
        }
        return r691Var;
    }
}
