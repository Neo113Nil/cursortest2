package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.call_order_fallback.experiments.b;
import com.yandex.go.morphlex.data.descriptors.actions.change_status_bar.c;
import com.yandex.go.payments.domain.l;
import com.yandex.go.taxi.order.change.common.domain.d;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.repositories.a;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesFragment;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import com.ybsdk.feature.change.payment.method.internal.network.ChangePaymentMethodsApi;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodFragment;

/* loaded from: classes12.dex */
public final class ig7 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ ig7(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static tc9 a(tw51 tw51Var) {
        int i = 18;
        xvf0 b = i5m.b(new ig7(i5m.b(new ba9(new oxf(tw51Var, 3), 5)), i));
        return new tc9(new ad9(), ImmutableMap.g(ChangePaymentMethodFragment.class, new dx7(n3w.a(new gd9(new boj0(b, new wif((Object) b, (xvf0) new oxf(tw51Var, 2), 7), new oxf(tw51Var, 1), new oxf(tw51Var, 4), new oxf(tw51Var, 0), md9.a, 7))), (xvf0) new oxf(tw51Var, 5), i)));
    }

    public static ig7 b(eqh eqhVar) {
        return new ig7(eqhVar, 4);
    }

    public static ig7 c(eqh eqhVar) {
        return new ig7(eqhVar, 11);
    }

    public static ig7 d(eqh eqhVar) {
        return new ig7(eqhVar, 15);
    }

    public static ig7 e(eqh eqhVar) {
        return new ig7(eqhVar, 22);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new hg7((eg7) xvf0Var.get());
            case 1:
                return new b((rqo) xvf0Var.get());
            case 2:
                return new vr((Context) xvf0Var.get(), (char) 0);
            case 3:
                return new b1((pho) xvf0Var.get());
            case 4:
                return new e18();
            case 5:
                return new t58((Context) xvf0Var.get());
            case 6:
                return new lf8((nvd) xvf0Var.get());
            case 7:
                return new a((CardApi) xvf0Var.get());
            case 8:
                return new nw8((zuj0) xvf0Var.get());
            case 9:
                return new d09((g09) xvf0Var.get());
            case 10:
                return new j19((wnt) xvf0Var.get());
            case 11:
                return new z19((pho) xvf0Var.get());
            case 12:
                return new x29((zuj0) xvf0Var.get());
            case 13:
                tw51 tw51Var = (tw51) xvf0Var.get();
                xvf0 b = i5m.b(new pg5(new owf(tw51Var, 27), 28));
                owf owfVar = new owf(tw51Var, 26);
                ig7 ig7Var = new ig7(i5m.b(new kj7(b, (xvf0) owfVar, (xvf0) new pg5(new owf(tw51Var, 25), 29), 12, (byte) 0)), 14);
                owf owfVar2 = new owf(tw51Var, 28);
                return new r39(new ucp0(), ImmutableMap.j(CashbackCategoriesFragment.class, new kk(n3w.a(new o29(new sk7(7, ig7Var, owfVar2, owfVar))), 12), CashbackDashboardFragment.class, new kk(n3w.a(new g39(new bc(ig7Var, owfVar2, jdp0.a, new owf(tw51Var, 29), owfVar))), 13)));
            case 14:
                return new com.ybsdk.feature.cashback.impl.domain.a((com.ybsdk.feature.cashback.impl.repositiories.a) xvf0Var.get());
            case 15:
                return new b1((pho) xvf0Var.get());
            case 16:
                return new c29(1, (l) xvf0Var.get());
            case 17:
                return a((tw51) xvf0Var.get());
            case 18:
                return new com.ybsdk.feature.change.payment.method.internal.repositories.a((ChangePaymentMethodsApi) xvf0Var.get());
            case 19:
                return new o61((pho) xvf0Var.get());
            case 20:
                return new com.yandex.go.taxi.order.change.requirements.repository.a(i5m.a(xvf0Var));
            case 21:
                return new qf9((d) xvf0Var.get());
            case 22:
                return new b1((pho) xvf0Var.get());
            case 23:
                return new gg9((dne0) xvf0Var.get());
            case 24:
                return new c((n830) xvf0Var.get());
            case 25:
                return new pm5(29, (d) xvf0Var.get());
            case 26:
                return new com.yandex.go.chargers.data.b((dne0) xvf0Var.get());
            case 27:
                return new bn9((k7x0) xvf0Var.get());
            case 28:
                return new c29(4, i5m.a(xvf0Var));
            default:
                return new bq9((sya) xvf0Var.get());
        }
    }

    public /* synthetic */ ig7(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
