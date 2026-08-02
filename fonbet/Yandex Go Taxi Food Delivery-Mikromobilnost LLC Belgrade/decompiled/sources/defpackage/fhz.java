package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes9.dex */
public final class fhz {
    public final lx4 a;
    public final k b;
    public final ma1 c;
    public final cug d;
    public final rx2 e;

    public fhz(lx4 lx4Var, k kVar, ma1 ma1Var, cug cugVar, rx2 rx2Var) {
        this.a = lx4Var;
        this.b = kVar;
        this.c = ma1Var;
        this.d = cugVar;
        this.e = rx2Var;
    }

    public final void a(kj kjVar, String str) {
        ((j) this.a).s("Login.Auto.Error");
        Long valueOf = kjVar != null ? Long.valueOf(kjVar.a) : null;
        cug cugVar = this.d;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        if (valueOf != null) {
            hashMap.put("uid", valueOf);
        }
        if (str != null) {
            hashMap.put("error", str);
        }
        cugVar.a.a("Login.Auto.Error", hashMap, 1, new HashMap());
    }

    public final void b(kj kjVar) {
        ((j) this.a).s("Login.Auto.Success");
        Long valueOf = Long.valueOf(kjVar.a);
        cug cugVar = this.d;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("uid", valueOf);
        cugVar.a.a("Login.Auto.Success", hashMap, 1, new HashMap());
    }

    public final void c(String str) {
        Long valueOf = Long.valueOf(this.b.x.a().a);
        rx2 rx2Var = this.e;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("phone_uid", valueOf);
        if (str != null) {
            hashMap.put("error", str);
        }
        rx2Var.a.a("Zalogin.ConfirmPhonishFailed", hashMap, 1, new HashMap());
    }

    public final void d(String str) {
        Long valueOf = Long.valueOf(this.b.x.a().a);
        rx2 rx2Var = this.e;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("error", str);
        }
        hashMap.put("portal_uid", valueOf);
        rx2Var.a.a("Zalogin.ConfirmPortalFailed", hashMap, 1, new HashMap());
    }

    public final void e() {
        Long valueOf = Long.valueOf(this.b.x.a().a);
        rx2 rx2Var = this.e;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("portal_uid", valueOf);
        rx2Var.a.a("Zalogin.ConfirmPortalShown", hashMap, 1, new HashMap());
    }

    public final Long f() {
        mu11 a = this.b.x.a();
        Long valueOf = Long.valueOf(a.a);
        if (a.a()) {
            return valueOf;
        }
        return null;
    }

    public final void g(kj kjVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, String str) {
        String name = events$Zalogin$LinkageContext.name();
        Long valueOf = kjVar != null ? Long.valueOf(this.b.x.a().a) : null;
        Long valueOf2 = kjVar != null ? Long.valueOf(kjVar.a) : null;
        rx2 rx2Var = this.e;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        if (name != null) {
            hashMap.put("context", name);
        }
        if (str != null) {
            hashMap.put("error", str);
        }
        if (valueOf != null) {
            hashMap.put("phone_uid", valueOf);
        }
        if (valueOf2 != null) {
            hashMap.put("portal_uid", valueOf2);
        }
        rx2Var.a.a("Zalogin.LinkError", hashMap, 1, new HashMap());
    }

    public final void h(kj kjVar) {
        Long valueOf = Long.valueOf(this.b.x.a().a);
        Long valueOf2 = Long.valueOf(kjVar.a);
        rx2 rx2Var = this.e;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("phone_uid", valueOf);
        hashMap.put("portal_uid", valueOf2);
        rx2Var.a.a("Zalogin.Promo.Shown", hashMap, 1, new HashMap());
    }

    public final void i(Events$Zalogin$LoginContext events$Zalogin$LoginContext, String str) {
        ((j) this.a).s("Login.Failed");
        Long f = f();
        String name = events$Zalogin$LoginContext != null ? events$Zalogin$LoginContext.name() : null;
        cug cugVar = this.d;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        if (name != null) {
            hashMap.put("context", name);
        }
        if (str != null) {
            hashMap.put("error", str);
        }
        if (f != null) {
            hashMap.put("uid", f);
        }
        cugVar.a.a("Login.Failed", hashMap, 1, new HashMap());
    }

    public final void j(String str, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext) {
        Long f = f();
        String name = events$Zalogin$LinkageContext.name();
        rx2 rx2Var = this.e;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        if (f != null) {
            hashMap.put("uid", f);
        }
        if (name != null) {
            hashMap.put("context", name);
        }
        rx2Var.a.a("Zalogin.LoginPortalFailed", hashMap, 1, tse0.r("error", hashMap, str));
    }

    public final void k(Events$Zalogin$LoginContext events$Zalogin$LoginContext) {
        ((j) this.a).s("Login.Shown");
        Long f = f();
        String name = events$Zalogin$LoginContext != null ? events$Zalogin$LoginContext.name() : null;
        cug cugVar = this.d;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        if (name != null) {
            hashMap.put("context", name);
        }
        if (f != null) {
            hashMap.put("uid", f);
        }
        cugVar.a.a("Login.Shown", hashMap, 1, new HashMap());
    }
}
