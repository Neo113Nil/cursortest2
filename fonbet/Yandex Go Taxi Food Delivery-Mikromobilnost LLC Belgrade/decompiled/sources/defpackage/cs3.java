package defpackage;

import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes.dex */
public final class cs3 implements ip60 {
    public static final cs3 a = new cs3();
    public static final lxq b;
    public static final lxq c;

    static {
        nb3 nb3Var = new nb3();
        nb3Var.a = 1;
        b = new lxq("eventsDroppedCount", x4e.u(x4e.o(dvf0.class, nb3Var.a())));
        nb3 nb3Var2 = new nb3();
        nb3Var2.a = 3;
        c = new lxq(CRLReasonCodeExtension.REASON, x4e.u(x4e.o(dvf0.class, nb3Var2.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        hez hezVar = (hez) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.e(b, hezVar.a());
        jp60Var.f(c, hezVar.b());
    }
}
