package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class bq3 implements ip60 {
    public static final bq3 a = new bq3();
    public static final lxq b = lxq.c("key");
    public static final lxq c = lxq.c("value");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.c cVar = (c3f.c) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, cVar.a());
        jp60Var.f(c, cVar.b());
    }
}
