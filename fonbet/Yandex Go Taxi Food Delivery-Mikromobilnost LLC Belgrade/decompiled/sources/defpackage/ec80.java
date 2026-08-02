package defpackage;

import android.app.Activity;
import android.app.Application;
import com.yandex.go.payments.domain.z;
import com.yandex.go.payments.experiments.g;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.superapp.orders.known.b;
import com.ybsdk.network.Api;
import ru.yandex.taxi.am.internal.f;
import ru.yandex.taxi.parks.api.ParksApi;

/* loaded from: classes8.dex */
public final class ec80 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ ec80(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return dc80.a(i5m.a(xvf0Var));
            case 1:
                return new b((omx) xvf0Var.get());
            case 2:
                return new rx2((pho) xvf0Var.get());
            case 3:
                return new zz80((mhf) xvf0Var.get());
            case 4:
                return new u8w((pho) xvf0Var.get());
            case 5:
                return new nd90(i5m.a(xvf0Var));
            case 6:
                ParksApi h = msb1.h((on2) xvf0Var.get());
                q5z.i(h);
                return h;
            case 7:
                return new f((vo90) xvf0Var.get());
            case 8:
                return new yj70((ep90) xvf0Var.get());
            case 9:
                return new ep90((Application) xvf0Var.get());
            case 10:
                return new ip90((hp90) xvf0Var.get());
            case 11:
                return new ft90((Api) xvf0Var.get());
            case 12:
                return new ut90((rqo) xvf0Var.get());
            case 13:
                return xpb1.A((ju6) xvf0Var.get());
            case 14:
                return xpb1.B((ju6) xvf0Var.get());
            case 15:
                return new qy90((tma0) xvf0Var.get());
            case 16:
                return new xx70((Activity) xvf0Var.get(), 8);
            case 17:
                return new h4a0((pho) xvf0Var.get());
            case 18:
                return new k5a0((pdc) xvf0Var.get());
            case 19:
                return new g9a0((pho) xvf0Var.get());
            case 20:
                return new j9a0((dne0) xvf0Var.get());
            case 21:
                return new z((eex) xvf0Var.get());
            case 22:
                return new jaa0((rqo) xvf0Var.get());
            case 23:
                return new maa0((c) xvf0Var.get());
            case 24:
                return new raa0((e2t) xvf0Var.get());
            case 25:
                return new aba0((as21) xvf0Var.get());
            case 26:
                return new lca0((rqo) xvf0Var.get());
            case 27:
                return new ada0((rqo) xvf0Var.get());
            case 28:
                return new g((rqo) xvf0Var.get());
            default:
                return new pda0((Activity) xvf0Var.get());
        }
    }
}
