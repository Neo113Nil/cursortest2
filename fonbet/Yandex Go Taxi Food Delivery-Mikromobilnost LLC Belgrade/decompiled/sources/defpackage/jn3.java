package defpackage;

import com.yandex.messaging.data.e;
import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import com.yandex.messaging.internal.v;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class jn3 {
    public static final /* synthetic */ kgx[] j;
    public final xqi0 a;
    public final k020 b;
    public final x22 c;
    public final wff0 d;
    public final e e;
    public final x2k0 f = new x2k0();
    public final ddf g = new ddf(23, this);
    public final qp3 h = new qp3();
    public AuthorizationObservable$AuthState i;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("organizationDisposable", 0, "getOrganizationDisposable()Lcom/yandex/alicekit/core/Disposable;", jn3.class);
        qoi0.a.getClass();
        j = new kgx[]{mutablePropertyReference1Impl};
    }

    public jn3(xqi0 xqi0Var, k020 k020Var, x22 x22Var, wff0 wff0Var, e eVar, v vVar) {
        this.a = xqi0Var;
        this.b = k020Var;
        this.c = x22Var;
        this.d = wff0Var;
        this.e = eVar;
        tje.e();
        xqi0Var.r.b(new dn3(this));
        int i = 0;
        wff0Var.a(new fn3(i, vVar.c(zy11.a, new en3(this, i))));
    }

    public final AuthorizationObservable$AuthState a() {
        tje.e();
        yk3 yk3Var = this.a.p;
        if (yk3Var == null) {
            return AuthorizationObservable$AuthState.Syncing;
        }
        if (!yk3Var.d()) {
            return AuthorizationObservable$AuthState.LimitedAnonymous;
        }
        k020 k020Var = this.b;
        String r = k020Var.b.T() ? k020Var.r() : null;
        if (r == null) {
            return AuthorizationObservable$AuthState.Upgrading;
        }
        int hashCode = r.hashCode();
        if (hashCode != 76) {
            if (hashCode != 85) {
                if (hashCode == 2473 && r.equals("Lu")) {
                    return AuthorizationObservable$AuthState.LimitedPassport;
                }
            } else if (r.equals("U")) {
                return AuthorizationObservable$AuthState.AuthorizedPassport;
            }
        } else if (r.equals("L")) {
            return AuthorizationObservable$AuthState.Upgrading;
        }
        vg10.d("Unknown registration status: ".concat(r));
        return null;
    }

    public final Object b(AuthorizationObservable$AuthState authorizationObservable$AuthState, bl3 bl3Var) {
        this.c.i("user status", authorizationObservable$AuthState.getReportName());
        int i = gn3.a[authorizationObservable$AuthState.ordinal()];
        if (i == 1) {
            return bl3Var.d();
        }
        if (i == 2) {
            return bl3Var.b();
        }
        if (i == 3) {
            return bl3Var.h();
        }
        if (i == 4) {
            return bl3Var.g();
        }
        if (i == 5) {
            return bl3Var.e();
        }
        w511.b();
        return null;
    }

    public final boolean c() {
        fu1 fu1Var = new fu1();
        tje.e();
        AuthorizationObservable$AuthState authorizationObservable$AuthState = this.i;
        if (authorizationObservable$AuthState == null) {
            authorizationObservable$AuthState = a();
            this.i = authorizationObservable$AuthState;
        }
        return ((Boolean) b(authorizationObservable$AuthState, fu1Var)).booleanValue();
    }

    public final e1k d(cl3 cl3Var) {
        tje.e();
        if (this.d.d.get()) {
            return e1k.M1;
        }
        this.f.b(cl3Var);
        kgx[] kgxVarArr = j;
        kgx kgxVar = kgxVarArr[0];
        qp3 qp3Var = this.h;
        int i = 1;
        if (((e1k) qp3Var.a()) == null) {
            en3 en3Var = new en3(this, i);
            e eVar = this.e;
            eVar.getClass();
            qhw0 a = jl40.a();
            sjh sjhVar = uyj.a;
            vpp0 vpp0Var = new vpp0(bvf0.a(cvw.U(a, o400.a.x)), eVar, en3Var);
            kgx kgxVar2 = kgxVarArr[0];
            qp3Var.b(vpp0Var);
        }
        AuthorizationObservable$AuthState authorizationObservable$AuthState = this.i;
        if (authorizationObservable$AuthState == null) {
            authorizationObservable$AuthState = a();
            this.i = authorizationObservable$AuthState;
        }
        b(authorizationObservable$AuthState, new g191(cl3Var));
        return new xi3(i, this, cl3Var);
    }

    public final void e() {
        AuthorizationObservable$AuthState a;
        if (this.d.d.get() || (a = a()) == this.i) {
            return;
        }
        this.i = a;
        b(a, this.g);
    }
}
