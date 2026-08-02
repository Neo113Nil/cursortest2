package defpackage;

import java.util.TimeZone;

/* loaded from: classes9.dex */
public final class p8z0 implements p8w {
    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        t4j0 b = zci0Var.e.b();
        b.c.a("Timezone", TimeZone.getDefault().getID());
        return zci0Var.b(new d5j0(b));
    }
}
