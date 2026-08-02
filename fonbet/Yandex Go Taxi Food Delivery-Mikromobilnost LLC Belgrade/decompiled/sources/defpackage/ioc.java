package defpackage;

import java.util.UUID;

/* loaded from: classes8.dex */
public final class ioc implements p8w {
    public final String a;
    public final sls b;
    public final sls c;
    public final sls d;
    public final sls e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public ioc(String str, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = slsVar;
        this.c = slsVar2;
        this.d = slsVar3;
        this.e = slsVar4;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        String a = d5j0Var.c.a("X-APOLLO-OPERATION-NAME");
        t4j0 b = d5j0Var.b();
        b.c.g("X-Yandex-Plus-Source", this.i);
        b.c.g("X-Yandex-Plus-Service", this.a);
        b.c.g("X-Yandex-Plus-Platform", (String) this.e.invoke());
        String concat = a != null ? a.concat("-") : null;
        if (concat == null) {
            concat = "";
        }
        StringBuilder t = qv10.t(concat);
        t.append(UUID.randomUUID());
        b.c.g("X-Request-Id", t.toString());
        Long l = (Long) this.b.invoke();
        String l2 = l != null ? l.toString() : null;
        if (l2 == null) {
            l2 = "";
        }
        b.c.g("X-Yandex-PUID", l2);
        String str = (String) this.c.invoke();
        if (str == null) {
            str = "";
        }
        b.c.g("X-Yandex-UUID", str);
        String str2 = (String) this.d.invoke();
        b.c.g("X-Yandex-DeviceID", str2 != null ? str2 : "");
        b.c.g("X-Yandex-Plus-SessionId", this.f);
        b.c.g("X-Yandex-Plus-AppId", this.g);
        b.c.g("X-Yandex-Plus-HostAppVersion", this.h);
        b.c.g("X-Yandex-Plus-SdkVersion", "110.0.2");
        return zci0Var.b(new d5j0(b));
    }
}
