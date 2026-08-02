package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import java.io.Serializable;
import ru.yandex.taxi.AutoLoginState;
import ru.yandex.taxi.am.AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.am.AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$3;
import ru.yandex.taxi.am.r;
import ru.yandex.taxi.search.address.view.a;

/* loaded from: classes6.dex */
public final class n61 implements nk3 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ cms e;

    public /* synthetic */ n61(Object obj, Serializable serializable, cms cmsVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = serializable;
        this.e = cmsVar;
    }

    @Override // defpackage.nk3
    public final void b(Throwable th) {
        int i = this.b;
        cms cmsVar = this.e;
        switch (i) {
            case 0:
                ((d4) cmsVar).invoke();
                break;
            default:
                ((r) this.c).g();
                AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$3 autoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$3 = (AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$3) cmsVar;
                if (th == null) {
                    th = new Exception("Failed to start portal login from autologin");
                }
                autoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$3.invoke(th);
                break;
        }
    }

    @Override // defpackage.nk3
    public final void onSuccess() {
        switch (this.b) {
            case 0:
                a aVar = (a) this.c;
                aVar.g.b();
                dqe0 dqe0Var = aVar.f;
                ZoneAddress f = dqe0Var.f();
                if (f != null) {
                    Address a = dqe0Var.a();
                    cre0 cre0Var = new cre0();
                    cre0Var.a = (String) this.d;
                    cre0Var.b = f;
                    cre0Var.c = a;
                    cre0Var.g = !aVar.h.a(new SuitabilityCheckType[0]);
                    cre0Var.h = "Show summary from layers point action";
                    ((pep0) aVar.l).f((m950) aVar.k.get(), new mre0(cre0Var.a(), k9s0.f), hxx.a);
                    break;
                } else {
                    jst.e.s(new IllegalArgumentException("Source address required to show summary"));
                    break;
                }
            default:
                r rVar = (r) this.c;
                rVar.s = false;
                rr3 rr3Var = rVar.r;
                if (rr3Var != null) {
                    rr3Var.r();
                }
                rVar.r = null;
                rVar.t.l(AutoLoginState.COMPLETED);
                ((AutoLogin$showLoginWithMultipleAccounts$$inlined$suspendCallbackApi$2) this.d).invoke(zy11.a);
                break;
        }
    }
}
