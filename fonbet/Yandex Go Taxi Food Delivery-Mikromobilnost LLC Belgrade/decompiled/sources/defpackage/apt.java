package defpackage;

import com.yandex.go.mob.HostMobSupportedApiNames;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes8.dex */
public final class apt {
    public final yo40 a;
    public final qsu b;

    public apt(ju6 ju6Var, yo40 yo40Var, qsu qsuVar) {
        this.a = yo40Var;
        this.b = qsuVar;
    }

    public final Object a(GoApiName goApiName, Class cls, xf7 xf7Var, tls tlsVar) {
        String a;
        HostMobSupportedApiNames c = q5z.c(goApiName);
        int i = zot.a[goApiName.ordinal()];
        qsu qsuVar = this.b;
        switch (i) {
            case 1:
                a = qsuVar.a();
                break;
            case 2:
                a = qsuVar.b();
                break;
            case 3:
                qsuVar.getClass();
                a = "https://pcidss.yandex.net/api/";
                break;
            case 4:
                qsuVar.getClass();
                a = "https://api.diehard.yango.com/api/";
                break;
            case 5:
                ((u02) this.a.a).getClass();
                a = "https://".concat("passport-authproxy.taxi.yandex.net");
                break;
            case 6:
                a = qsuVar.b();
                break;
            default:
                w511.b();
                return null;
        }
        s0k0 s0k0Var = new s0k0();
        s0k0Var.b(a);
        s0k0Var.a = new xot(xf7Var, c, 0);
        return ((s0k0) tlsVar.invoke(s0k0Var)).c().b(cls);
    }
}
