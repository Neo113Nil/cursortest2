package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.taxi.order.perf.a;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.chat.input.textsuggest.b;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final class n2y0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ n2y0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static n2y0 a(eqh eqhVar) {
        return new n2y0(eqhVar, 18);
    }

    public static n2y0 b(eqh eqhVar) {
        return new n2y0(eqhVar, 20);
    }

    public static zgy0 c(tw51 tw51Var) {
        hag hagVar = new hag(tw51Var, 12);
        lk lkVar = new lk(27, new dhy0(hagVar, 1));
        lk lkVar2 = new lk(20, new dhy0(hagVar, 0));
        hag hagVar2 = new hag(tw51Var, 11);
        hag hagVar3 = new hag(tw51Var, 10);
        return new zgy0(ImmutableMap.g(TestPaymentFragment.class, new v8c0(n3w.a(new qhy0(new hlx0(new z6x0(lkVar, lkVar2, hagVar2, hagVar3, 7), new hag(tw51Var, 14), new hag(tw51Var, 13), hagVar3, why0.a, 2))), 24)), new fhy0());
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 5;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new z1y0((x980) xvf0Var.get());
            case 1:
                return new a2y0((x980) xvf0Var.get());
            case 2:
                return new b2y0((x980) xvf0Var.get());
            case 3:
                return new c2y0((x980) xvf0Var.get());
            case 4:
                return new d2y0((x980) xvf0Var.get());
            case 5:
                return new e2y0((x980) xvf0Var.get());
            case 6:
                return new f2y0((x980) xvf0Var.get());
            case 7:
                return new g2y0((x980) xvf0Var.get());
            case 8:
                return new h2y0((x980) xvf0Var.get());
            case 9:
                return new i2y0((x980) xvf0Var.get());
            case 10:
                final x980 x980Var = (x980) xvf0Var.get();
                return new jms() { // from class: j2y0
                    public final boolean equals(Object obj) {
                        if (obj instanceof j2y0) {
                            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // defpackage.jms
                    public final cms getFunctionDelegate() {
                        return new FunctionReferenceImpl(3, x980.this, x980.class, "openIntermediatePointsMap", "openIntermediatePointsMap(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Lcom/yandex/go/taxi/order/api/intermediate_points/NewRoutePoint;Lcom/yandex/go/taxi/order/api/delegates/ChangeSourcePointDelegate;)V", 0);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                };
            case 11:
                return new k2y0((x980) xvf0Var.get());
            case 12:
                return new l2y0((x980) xvf0Var.get());
            case 13:
                return new m2y0((x980) xvf0Var.get());
            case 14:
                return new a((g6y0) xvf0Var.get());
            case 15:
                return new oa1((lx4) xvf0Var.get());
            case 16:
                return new v6y0((w6y0) xvf0Var.get());
            case 17:
                return new bay0((jtq0) xvf0Var.get());
            case 18:
                return new day0((pho) xvf0Var.get());
            case 19:
                return new sxe((o2y0) xvf0Var.get());
            case 20:
                return new acy0((pho) xvf0Var.get());
            case 21:
                return new kip((rqo) xvf0Var.get(), 5);
            case 22:
                return new q5p((lg5) xvf0Var.get(), i2);
            case 23:
                return c((tw51) xvf0Var.get());
            case 24:
                return new aqy0((zhu0) xvf0Var.get());
            case 25:
                return new b((InputTextController) xvf0Var.get());
            case 26:
                return new yi6((Activity) xvf0Var.get());
            case 27:
                return new izy0((com.yandex.messaging.internal.backendconfig.a) xvf0Var.get());
            case 28:
                dbz0 dbz0Var = new dbz0((Activity) xvf0Var.get());
                dbz0Var.c = oyh0.messaging_chat_open_fail_description;
                return dbz0Var;
            default:
                return new kb((Context) xvf0Var.get(), 9);
        }
    }
}
