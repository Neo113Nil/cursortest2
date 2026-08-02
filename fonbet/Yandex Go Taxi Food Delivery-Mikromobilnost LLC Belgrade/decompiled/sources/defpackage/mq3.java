package defpackage;

import defpackage.c3f;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes.dex */
public final class mq3 implements ip60 {
    public static final mq3 a = new mq3();
    public static final lxq b = lxq.c("type");
    public static final lxq c = lxq.c(CRLReasonCodeExtension.REASON);
    public static final lxq d = lxq.c("frames");
    public static final lxq e = lxq.c("causedBy");
    public static final lxq f = lxq.c("overflowCount");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.a.b.c cVar = (c3f.e.d.a.b.c) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, cVar.e());
        jp60Var.f(c, cVar.d());
        jp60Var.f(d, cVar.b());
        jp60Var.f(e, cVar.a());
        jp60Var.c(f, cVar.c());
    }
}
