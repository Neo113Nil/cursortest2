package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.chargers.subscription.presentation.landing.d;
import com.yandex.go.rida.unavailable.ui.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.interactor.h;
import ru.yandex.taxi.linked_order.map.b;

/* loaded from: classes5.dex */
public final class n12 extends pgd {
    public final /* synthetic */ int F = 4;
    public final Context G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final wfd K;

    public n12(Context context, w030 w030Var, a aVar, aye0 aye0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = aVar;
        this.J = aye0Var;
        this.K = new mu5(new odf0(26, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public void G(Object obj) {
        switch (this.F) {
            case 3:
                q840 q840Var = (q840) obj;
                super.G(q840Var);
                r0 r0Var = ((y840) this.I).a;
                x840 x840Var = new x840(q840Var.a, q840Var.b);
                r0Var.getClass();
                r0Var.m(null, x840Var);
                break;
            default:
                super.G(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.F) {
            case 0:
                ht10 ht10Var = (ht10) this.J;
                ((b) ht10Var.b).Ig();
                h hVar = (h) ht10Var.c;
                hVar.e.b = null;
                hVar.f.a = null;
                amp0 amp0Var = (amp0) this.I;
                ((a3v) amp0Var.b).t4((l12) amp0Var.c);
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.F) {
            case 0:
                ht10 ht10Var = (ht10) this.J;
                h hVar = (h) ht10Var.c;
                o22 o22Var = hVar.e;
                String str = hVar.a.b;
                o22Var.b = str;
                hVar.f.a = str;
                ((b) ht10Var.b).Hg(new jiu(13));
                break;
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        switch (this.F) {
        }
        return (mu5) this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        switch (this.F) {
        }
        return (w030) this.H;
    }

    public n12(Context context, w030 w030Var, com.yandex.go.walking.navigation.impl.error.interactor.a aVar, e141 e141Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = aVar;
        this.J = e141Var;
        this.K = new mu5(new a141(this, 0));
    }

    public n12(Context context, w030 w030Var, y840 y840Var, w840 w840Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = y840Var;
        this.J = w840Var;
        this.K = new p1b(y840Var, new x240(5, this));
    }

    public n12(mrj mrjVar, y12 y12Var, Activity activity, i130 i130Var, amp0 amp0Var, ht10 ht10Var) {
        super(0);
        this.G = activity;
        this.H = i130Var;
        this.I = amp0Var;
        this.J = ht10Var;
        this.K = new mu5(new q(10, this, mrjVar, y12Var));
    }

    public n12(zao0 zao0Var, xao0 xao0Var, Context context, w030 w030Var, gzn0 gzn0Var, xvf0 xvf0Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = gzn0Var;
        this.J = xvf0Var;
        this.K = new mu5(new zdk0(26, this, zao0Var, xao0Var));
    }

    public n12(com.yandex.go.chargers.partner_subscription.ui.a aVar, nea neaVar, Context context, yvf0 yvf0Var, w030 w030Var, yvf0 yvf0Var2) {
        super(0);
        this.G = context;
        this.H = yvf0Var;
        this.I = w030Var;
        this.J = yvf0Var2;
        this.K = new p1b(aVar, new cs8(17, this, neaVar));
    }

    public n12(zta ztaVar, d dVar, Context context, em9 em9Var, w030 w030Var, yvf0 yvf0Var) {
        super(0);
        this.G = context;
        this.H = em9Var;
        this.I = w030Var;
        this.J = yvf0Var;
        this.K = new mu5(new com.yandex.go.chargers.subscription.presentation.landing.a(this, ztaVar, dVar));
    }
}
