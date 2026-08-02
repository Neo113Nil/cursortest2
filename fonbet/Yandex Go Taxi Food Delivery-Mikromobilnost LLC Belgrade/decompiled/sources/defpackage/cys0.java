package defpackage;

import com.google.common.collect.ImmutableMap;
import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.h0;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.feature.split.deposit.internal.data.deposit.repository.a;
import com.ybsdk.feature.split.deposit.internal.data.network.SplitDepositApi;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods.AutoTopupPaymentMethodsFragment;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusFragment;
import com.ybsdk.feature.split.deposit.internal.ui.deposit.SplitDepositFragment;
import com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusFragment;
import com.ybsdk.feature.status.screen.internal.ui.StatusScreenFragment;
import com.ybsdk.screens.spoilerOnboarding.SpoilerOnboardingFragment;
import com.ybsdk.utils.poller.b;
import java.util.LinkedHashMap;
import ru.yandex.taxi.orderbutton.summary.base.interactors.i;
import ru.yandex.taxi.orderbutton.summary.solid.interactors.c;
import ru.yandex.taxi.preorder.source.j;
import ru.yandex.taxi.summary.promotions.repository.e;

/* loaded from: classes3.dex */
public final class cys0 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;

    public /* synthetic */ cys0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }

    public static gtt0 a(htt0 htt0Var, tw51 tw51Var) {
        int i = 18;
        int i2 = 20;
        gaq0 gaq0Var = new gaq0(new o9g(tw51Var, i), i2);
        int i3 = 21;
        cys0 cys0Var = new cys0((Object) gaq0Var, (xvf0) new gaq0(new o9g(tw51Var, 16), i3), 7);
        o9g o9gVar = new o9g(tw51Var, i2);
        o9g o9gVar2 = new o9g(tw51Var, 14);
        o9g o9gVar3 = new o9g(tw51Var, 23);
        int i4 = 9;
        o9g o9gVar4 = new o9g(tw51Var, i4);
        pst0 pst0Var = new pst0(o9gVar4, 0);
        xvf0 b = i5m.b(jtt0.a);
        n3w a = n3w.a(new yut0(new w040(cys0Var, o9gVar, o9gVar2, o9gVar3, pst0Var, b, new o9g(tw51Var, 15), (xvf0) fvt0.a)));
        int i5 = 19;
        v8c0 v8c0Var = new v8c0(a, i5);
        cys0 cys0Var2 = new cys0((Object) new o9g(tw51Var, 17), (xvf0) new gaq0(gaq0Var, 22), i4);
        o9g o9gVar5 = new o9g(tw51Var, i5);
        eqh eqhVar = new eqh();
        eqh eqhVar2 = new eqh();
        eqh eqhVar3 = new eqh();
        int i6 = 1;
        pst0 pst0Var2 = new pst0(o9gVar4, i6);
        kk kkVar = new kk(n3w.a(new ww3(new w3i(o9gVar, o9gVar5, eqhVar2, eqhVar3, pst0Var2, new o9g(tw51Var, i3), new lk(24, new o9g(tw51Var, 13)), b, 3))), i6);
        o9g o9gVar6 = new o9g(tw51Var, 12);
        o9g o9gVar7 = new o9g(tw51Var, 11);
        uut0 uut0Var = tut0.a;
        v8c0 v8c0Var2 = new v8c0(n3w.a(new wst0(new st0(o9gVar5, (xvf0) uut0Var, o9gVar6, o9gVar7, o9gVar, o9gVar2, pst0Var2, eqhVar2, eqhVar3, b, (xvf0) att0.a))), i);
        LinkedHashMap A = gtq0.A(4);
        A.put(SplitDepositFragment.class, v8c0Var);
        A.put(SplitDepositPaymentStatusFragment.class, eqhVar);
        A.put(AutoTopupPaymentMethodsFragment.class, kkVar);
        A.put(SplitDepositAutoTopupStatusFragment.class, v8c0Var2);
        eqh.a(eqhVar2, new dsl(uut0Var, new br00(A), 6));
        eqh.a(eqhVar3, new eu0(eqhVar2, 3));
        eqh.a(eqhVar, new cys0((Object) n3w.a(new gut0(new m(o9gVar, cys0Var2, o9gVar2, o9gVar3, o9gVar5, pst0Var, b, eqhVar3, eqhVar2, new gaq0(new o9g(tw51Var, 10), 23)))), (xvf0) new o9g(tw51Var, 22), 8));
        return new gtt0(new sut0(), ImmutableMap.h(SplitDepositFragment.class, v8c0Var, SplitDepositPaymentStatusFragment.class, eqhVar, AutoTopupPaymentMethodsFragment.class, kkVar, SplitDepositAutoTopupStatusFragment.class, v8c0Var2));
    }

    public static b9u0 b(d9u0 d9u0Var, tw51 tw51Var) {
        int i = 25;
        int i2 = 26;
        v8c0 v8c0Var = new v8c0(n3w.a(new j9u0(new fcj0(new gaq0(new gaq0(new o9g(tw51Var, i), i), i2), new o9g(tw51Var, 24), new o9g(tw51Var, 27), new o9g(tw51Var, 28), new o9g(tw51Var, i2)))), 20);
        LinkedHashMap A = gtq0.A(1);
        A.put(StatusScreenFragment.class, v8c0Var);
        b9u0 b9u0Var = (b9u0) i5m.b(new dsl(f9u0.a, new br00(A), 7)).get();
        q5z.i(b9u0Var);
        return b9u0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bys0((qcp0) ((y9g) obj).get(), (pys0) xvf0Var.get());
            case 1:
                return new nys0((gzh) ((fxf) obj).get(), (wor0) ((gaq0) xvf0Var).get());
            case 2:
                return new c((i) ((zs0) obj).get(), (tt2) xvf0Var.get());
            case 3:
                return new y7t0((zrm) ((c4p) obj).get(), (h0) ((h0l0) xvf0Var).get());
            case 4:
                return new eet0((iub0) xvf0Var.get(), (j) ((pmn0) obj).get());
            case 5:
                return ((ujt0) obj).a ? (x560) ((t160) xvf0Var).get() : new rw60();
            case 6:
                return a((htt0) obj, (tw51) xvf0Var.get());
            case 7:
                return new a((SplitDepositApi) ((gaq0) obj).get(), (ytt0) ((gaq0) xvf0Var).get());
            case 8:
                return new SplitDepositPaymentStatusFragment((dut0) ((n3w) obj).a, (ca41) ((o9g) xvf0Var).get());
            case 9:
                return new com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor.a((b) ((o9g) obj).get(), (com.ybsdk.feature.split.deposit.internal.data.payment.status.repository.a) ((gaq0) xvf0Var).get());
            case 10:
                return new SpoilerOnboardingFragment((rm31) xvf0Var.get(), (rct0) obj);
            case 11:
                return new gwt0((x7r0) ((o9g) obj).get(), (if8) ((o9g) xvf0Var).get());
            case 12:
                return new ozt0((wiq0) ((w0g) obj).get(), (j0g) ((wif) xvf0Var).get());
            case 13:
                return b((d9u0) obj, (tw51) xvf0Var.get());
            case 14:
                return new pcu0((r4z) ((ret) obj).get(), (odu0) xvf0Var.get());
            case 15:
                return new kwu0((d) xvf0Var.get(), (com.yandex.go.taxi.order.search.overlay.mvp.b) ((rct0) obj).get());
            case 16:
                return new com.yandex.go.requirements.comment.summary.ui.v3.data.c((w5v0) xvf0Var.get(), (xbv0) ((fwf) obj).get());
            case 17:
                return new niv0((ru.yandex.taxi.tooltips.repository.b) xvf0Var.get(), (liv0) ((miv0) obj).get());
            case 18:
                return new zxs0((b1) ((ig7) obj).get(), (wiq0) ((w0g) xvf0Var).get());
            case 19:
                return new dmv0((wiq0) ((w0g) obj).get(), (e) ((x0g) xvf0Var).get());
            case 20:
                return new rpv0((viv0) ((b1g) obj).get(), (wiq0) ((w0g) xvf0Var).get());
            case 21:
                return new grv0((lrv0) ((mrv0) obj).get(), (fva0) xvf0Var.get());
            case 22:
                return new stv0((uy) xvf0Var.get(), (co40) ((uzu0) obj).get());
            case 23:
                return ((Yatagan$FeedSdkComponent) ((mir) ((nag) xvf0Var).get()).a((vlr) ((eqh) obj).get())).x();
            case 24:
                return ((mjr) ((nag) obj).get()).a(jjr.c, (com.yandex.div.core.expression.variables.a) xvf0Var.get());
            case 25:
                return new daw0((x770) ((uzu0) obj).get(), (law0) ((cys0) xvf0Var).get());
            case 26:
                return new law0((kaw0) ((n3w) obj).a, (wnt) ((nag) xvf0Var).get());
            case 27:
                return ((Yatagan$FeedSdkComponent) ((mir) ((nag) obj).get()).a((vlr) ((eqh) xvf0Var).get())).x();
            case 28:
                return ((mjr) ((nag) obj).get()).a(jjr.w, (com.yandex.div.core.expression.variables.a) xvf0Var.get());
            default:
                return new com.yandex.go.superapp_favorites.flex.jason_state.a((tt2) ((nag) obj).get(), (k6x) ((nag) xvf0Var).get());
        }
    }

    public /* synthetic */ cys0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
    }
}
