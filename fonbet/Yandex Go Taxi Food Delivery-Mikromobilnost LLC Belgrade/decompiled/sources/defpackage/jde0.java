package defpackage;

import android.app.Activity;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.navigator.rate_route.d;
import com.yandex.messaging.internal.authorized.chat.refresher.c;
import com.yandex.messaging.internal.view.timeline.g0;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerFragment;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionsListFragment;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.ybsdk.feature.qr.payments.internal.screens.refresh.presentation.QrRefreshFragment;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionFragment;
import com.ybsdk.feature.rebind.payment.internal.network.RebindPaymentMethodApi;
import com.ybsdk.feature.rebind.payment.internal.screens.RebindPaymentMethodFragment;
import java.util.LinkedHashMap;
import ru.yandex.taxi.orderbutton.summary.base.interactors.b;
import ru.yandex.taxi.summary.promotions.repository.e;
import ru.yandex.taxi.widgets.data.datasources.fallback.a;

/* loaded from: classes3.dex */
public final class jde0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ jde0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static jde0 a(eqh eqhVar) {
        return new jde0(eqhVar, 0);
    }

    public static jde0 b(xvf0 xvf0Var) {
        return new jde0(xvf0Var, 9);
    }

    public static jde0 c(eqh eqhVar) {
        return new jde0(eqhVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a8g0 d(tw51 tw51Var) {
        int i = 17;
        kxb0 kxb0Var = new kxb0(new c6g(tw51Var, 13), i);
        c6g c6gVar = new c6g(tw51Var, 1);
        n3w a = n3w.a(new p8g0(new o8g0(kxb0Var, c6gVar)));
        c6g c6gVar2 = new c6g(tw51Var, 2);
        n3w a2 = n3w.a(new m7g0(new y4a0(a, c6gVar2, false, 29)));
        kxb0 kxb0Var2 = new kxb0(new c6g(tw51Var, 0 == true ? 1 : 0), 18);
        c6g c6gVar3 = new c6g(tw51Var, 3);
        n3w a3 = n3w.a(new vag0(new yxf0(kxb0Var, c6gVar3)));
        c6g c6gVar4 = new c6g(tw51Var, 10);
        c6g c6gVar5 = new c6g(tw51Var, 14);
        p5g p5gVar = new p5g(tw51Var, 28);
        n3w a4 = n3w.a(new bbg0(new xv10(kxb0Var2, a3, c6gVar4, c6gVar5, n3w.a(new tag0(new o8g0(p5gVar, n3w.a(new y9g0(new s8g0(p5gVar)))))))));
        c6g c6gVar6 = new c6g(tw51Var, 6);
        tgb0 tgb0Var = new tgb0(a4, c6gVar4, c6gVar6, 15);
        kxb0 kxb0Var3 = new kxb0(new vfg0(zfg0.a, c6gVar5, new kxb0(kxb0Var, 23), new kxb0(p5gVar, 21), 0), 22);
        v8c0 v8c0Var = new v8c0(n3w.a(new cdg0(new q6c0(i, p5gVar, c6gVar6, c6gVar5))), 7);
        y7g0 y7g0Var = new y7g0(c6gVar, 0 == true ? 1 : 0);
        int i2 = 4;
        jpf0 jpf0Var = new jpf0((xvf0) new kxb0(y7g0Var, 16), (xvf0) new jpf0((xvf0) new y7g0(c6gVar, 1), (xvf0) y7g0Var, i2), 3);
        n3w a5 = n3w.a(new lbg0(new xv10(n3w.a(new obg0(new o8g0(kxb0Var, aag0.a))), a3, c6gVar2, new c6g(tw51Var, 5), c6gVar3)));
        c6g c6gVar7 = new c6g(tw51Var, 8);
        n3w a6 = n3w.a(new t8g0(new s8g0(p5gVar)));
        c6g c6gVar8 = new c6g(tw51Var, 11);
        n3w a7 = n3w.a(new v7g0(new yxf0(a5, a6)));
        n3w a8 = n3w.a(new jag0(new xv10(a5, new p5g(tw51Var, 29), new c6g(tw51Var, 9), a6, new c6g(tw51Var, i2))));
        oag0 oag0Var = nag0.a;
        cta0 cta0Var = new cta0(n3w.a(new q9g0(new st0(jpf0Var, a5, c6gVar5, c6gVar6, (xvf0) oag0Var, c6gVar4, c6gVar7, a6, c6gVar8, a7, a8))), c6gVar4, new c6g(tw51Var, 7), new c6g(tw51Var, 12), new c6g(tw51Var, 15), 11);
        LinkedHashMap A = gtq0.A(4);
        A.put(QrPaymentsSubscriptionFragment.class, tgb0Var);
        A.put(QrSubscriptionsListFragment.class, kxb0Var3);
        A.put(QrRefreshFragment.class, v8c0Var);
        A.put(QrPaymentsMainFragment.class, cta0Var);
        a8g0 a8g0Var = (a8g0) i5m.b(new tgb0((xvf0) oag0Var, (xvf0) a2, (xvf0) new br00(A), 14, (byte) 0)).get();
        q5z.i(a8g0Var);
        return a8g0Var;
    }

    public static tc9 e(tw51 tw51Var) {
        return new tc9(new bfi0(), ImmutableMap.g(RebindPaymentMethodFragment.class, new jpf0((xvf0) n3w.a(new jfi0(new xv10(new jpf0((xvf0) new jde0(i5m.b(new kxb0(new c6g(tw51Var, 19), 25)), 24), (xvf0) new c6g(tw51Var, 16), 9), new c6g(tw51Var, 17), new c6g(tw51Var, 20), new c6g(tw51Var, 18), mfi0.a))), (xvf0) new c6g(tw51Var, 21), 8)));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 10;
        int i3 = 13;
        int i4 = 15;
        int i5 = 6;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ide0((pho) xvf0Var.get());
            case 1:
                return new x770((pho) xvf0Var.get());
            case 2:
                return new d6i((rqo) xvf0Var.get(), 2);
            case 3:
                return new yze0((rqo) xvf0Var.get());
            case 4:
                return new v5c0(i2, (v4f0) xvf0Var.get());
            case 5:
                return new u5f0((z22) xvf0Var.get());
            case 6:
                return new u8w((pho) xvf0Var.get());
            case 7:
                return new b((e) xvf0Var.get());
            case 8:
                return new q6c0((rbs) xvf0Var.get());
            case 9:
                return new a((g551) xvf0Var.get());
            case 10:
                return new i2b((Activity) xvf0Var.get(), 1);
            case 11:
                return new u8w((pho) xvf0Var.get());
            case 12:
                tw51 tw51Var = (tw51) xvf0Var.get();
                p5g p5gVar = new p5g(tw51Var, 20);
                p5g p5gVar2 = new p5g(tw51Var, i2);
                p5g p5gVar3 = new p5g(tw51Var, 26);
                xvf0 b = i5m.b(k6g0.a);
                p5g p5gVar4 = new p5g(tw51Var, 22);
                int i6 = 19;
                kxb0 kxb0Var = new kxb0(new p5g(tw51Var, 8), i6);
                p5g p5gVar5 = new p5g(tw51Var, i5);
                p5g p5gVar6 = new p5g(tw51Var, 27);
                p5g p5gVar7 = new p5g(tw51Var, i3);
                p5g p5gVar8 = new p5g(tw51Var, i4);
                p5g p5gVar9 = new p5g(tw51Var, i6);
                int i7 = 16;
                m580 m580Var = new m580(n3w.a(new vcg0(new bu0(p5gVar4, kxb0Var, p5gVar5, p5gVar6, p5gVar7, p5gVar8, p5gVar, p5gVar9, new p5g(tw51Var, 21)))), p5gVar9, b, p5gVar, new nwf(i7, tw51Var), p5gVar5, new p5g(tw51Var, 24), new p5g(tw51Var, 23), new p5g(tw51Var, 7));
                p5g p5gVar10 = new p5g(tw51Var, 25);
                p5g p5gVar11 = new p5g(tw51Var, 18);
                p5g p5gVar12 = new p5g(tw51Var, 11);
                p5g p5gVar13 = new p5g(tw51Var, 9);
                ofg0 ofg0Var = nfg0.a;
                v8c0 v8c0Var = new v8c0(n3w.a(new q6g0(new w040(new ph70(ofg0Var, p5gVar10, p5gVar, p5gVar11, p5gVar12, p5gVar13, 13), p5gVar2, new p5g(tw51Var, 17), new p5g(tw51Var, i7), p5gVar, p5gVar13, new p5g(tw51Var, 14), new p5g(tw51Var, 12)))), i5);
                LinkedHashMap A = gtq0.A(2);
                A.put(QrReaderFragment.class, m580Var);
                A.put(QrContainerFragment.class, v8c0Var);
                b7g0 b7g0Var = (b7g0) i5m.b(new ph70(ofg0Var, p5gVar, p5gVar2, p5gVar3, b, new br00(A))).get();
                q5z.i(b7g0Var);
                return b7g0Var;
            case 13:
                return d((tw51) xvf0Var.get());
            case 14:
                return new aye0(i5, (wu30) xvf0Var.get());
            case 15:
                return new mlg0((j1w) xvf0Var.get());
            case 16:
                return new ulg0((m0w) xvf0Var.get());
            case 17:
                return new f7i0((wff0) xvf0Var.get());
            case 18:
                return new d((rqo) xvf0Var.get());
            case 19:
                return new sue0(i3, (vcz0) xvf0Var.get());
            case 20:
                return new rbi0((n5t0) xvf0Var.get());
            case 21:
                return new sbi0((g0) xvf0Var.get());
            case 22:
                return new efi0((com.ybsdk.api.e) xvf0Var.get());
            case 23:
                return e((tw51) xvf0Var.get());
            case 24:
                return new com.ybsdk.feature.rebind.payment.internal.data.a((RebindPaymentMethodApi) xvf0Var.get());
            case 25:
                return new sue0(i4, (umb0) xvf0Var.get());
            case 26:
                return new nji0((jji0) xvf0Var.get());
            case 27:
                return new com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.redirecthost.a((jgs) xvf0Var.get());
            case 28:
                return new com.yandex.messaging.internal.authorized.chat.refresher.a((c) xvf0Var.get());
            default:
                return new com.yandex.messaging.internal.authorized.chat.refresher.b((c) xvf0Var.get());
        }
    }
}
