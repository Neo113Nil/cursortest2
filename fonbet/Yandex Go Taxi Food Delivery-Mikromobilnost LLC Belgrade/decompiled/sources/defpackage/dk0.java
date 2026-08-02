package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class dk0 implements p8w {
    public final fn21 a;
    public final h3y b;
    public final h3y c;

    public dk0(h hVar, h3y h3yVar, h3y h3yVar2) {
        this.a = hVar;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        ((kpt) this.b.get()).getClass();
        HostMobSupportedApiNames hostMobSupportedApiNames = (HostMobSupportedApiNames) d5j0Var.c(HostMobSupportedApiNames.class);
        boolean z = false;
        if ((hostMobSupportedApiNames == HostMobSupportedApiNames.TAXI_V4 || hostMobSupportedApiNames == HostMobSupportedApiNames.TAXI) && !evu0.y(d5j0Var.a.b(), "launch", false)) {
            ((a) this.c.get()).b();
        } else {
            String a = d5j0Var.c.a("X-YaTaxi-UserId");
            if (a != null && !evu0.J(a)) {
                z = true;
            }
        }
        String Hg = ((h) this.a).Hg();
        if (Hg != null && !evu0.J(Hg) && !z) {
            t4j0 b = d5j0Var.b();
            b.c.a("X-YaTaxi-UserId", Hg);
            d5j0Var = new d5j0(b);
        }
        return zci0Var.b(d5j0Var);
    }
}
