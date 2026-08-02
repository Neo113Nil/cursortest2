package defpackage;

import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.clarify_address.a;
import java.util.HashMap;
import ru.yandex.taxi.orderforanother.interactor.f;
import ru.yandex.taxi.orderforanother.model.FormedFrom;

/* loaded from: classes6.dex */
public final /* synthetic */ class pz41 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ygi0 b;

    public /* synthetic */ pz41(ygi0 ygi0Var, int i) {
        this.a = i;
        this.b = ygi0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ygi0 ygi0Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = ((f) ygi0Var.J).c;
                agd agdVar = (agd) yfdVar;
                agdVar.e = new pz41(ygi0Var, i2);
                agdVar.f = xpb1.x;
                pfd.a.getClass();
                agdVar.g = pfd.b;
                return zy11Var;
            default:
                uz41 uz41Var = (uz41) obj;
                vz41 vz41Var = (vz41) ygi0Var.K;
                ji41 ji41Var = (ji41) ygi0Var.N;
                qv70 qv70Var = vz41Var.b;
                if (jl40.l(uz41Var, sz41.a)) {
                    qv70Var.getClass();
                    qv70Var.a.a("OrderForAnother.PinAlertShown", new HashMap(), 1, new HashMap());
                    return zy11Var;
                }
                int i3 = 9;
                if (jl40.l(uz41Var, tz41.a)) {
                    qv70Var.getClass();
                    qv70Var.a.a("OrderForAnother.WhoRideUser", new HashMap(), 1, new HashMap());
                    ((a) vz41Var.c).c(true, AddressClarificationReason.Other);
                    ((ygi0) ji41Var.b).r(new qu(i3));
                    return zy11Var;
                }
                if (!jl40.l(uz41Var, qz41.a)) {
                    if (!jl40.l(uz41Var, rz41.a)) {
                        w511.b();
                        return null;
                    }
                    qv70Var.getClass();
                    qv70Var.a.a("OrderForAnother.WhoRideClosed", new HashMap(), 1, new HashMap());
                    return zy11Var;
                }
                qv70Var.getClass();
                qv70Var.a.a("OrderForAnother.WhoRideAnother", new HashMap(), 1, new HashMap());
                vz41Var.a.i(FormedFrom.DIALOG);
                ((ru.yandex.taxi.orderforanother.router.a) ((aw70) ((eqh) ((ygi0) ji41Var.b).M).get())).b(new d82(1), new d82(1));
                ((ygi0) ji41Var.b).r(new qu(i3));
                return zy11Var;
        }
    }
}
