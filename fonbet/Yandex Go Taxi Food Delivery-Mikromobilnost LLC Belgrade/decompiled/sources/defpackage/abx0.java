package defpackage;

import android.content.Context;
import com.yandex.go.feedback_common.data.FeedbackApi;
import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.api.OrderApi;
import com.yandex.go.taxi.order.chat.data.TaxiOrderChatApi;
import com.yandex.go.taxi.order.infosharing.data.TaxiOrderSharingApi;
import com.yandex.go.taxi.order.perf.experiment.d;
import com.yandex.go.taxi.tariffs.repository.g;
import ru.yandex.taxi.net.taxi.TaxiApi;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes10.dex */
public final class abx0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ abx0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new zax0((pho) xvf0Var.get());
            case 1:
                return new l7s0((g) xvf0Var.get());
            case 2:
                return new pfx0((bfx0) xvf0Var.get());
            case 3:
                return new dxf0((gmx0) xvf0Var.get());
            case 4:
                return new gmx0((rqo) xvf0Var.get());
            case 5:
                return new nnx0((pho) xvf0Var.get());
            case 6:
                return new o7r0((pho) xvf0Var.get());
            case 7:
                return new cux0((ju6) xvf0Var.get());
            case 8:
                return new jc4((pho) xvf0Var.get());
            case 9:
                return new nux0((nrd) xvf0Var.get());
            case 10:
                return new awx0((fwx0) xvf0Var.get());
            case 11:
                return new ywx0(i5m.a(xvf0Var));
            case 12:
                return new me0((Context) xvf0Var.get(), (byte) 0);
            case 13:
                return new exx0((pho) xvf0Var.get());
            case 14:
                return new ixx0((jqb0) xvf0Var.get());
            case 15:
                return new yxx0((pho) xvf0Var.get());
            case 16:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ChangeOrderApi changeOrderApi = (ChangeOrderApi) on2Var.a(GoApiName.TaxiV3, ChangeOrderApi.class);
                q5z.i(changeOrderApi);
                return changeOrderApi;
            case 17:
                on2 on2Var2 = (on2) xvf0Var.get();
                on2Var2.getClass();
                FeedbackApi feedbackApi = (FeedbackApi) on2Var2.a(GoApiName.TaxiV3, FeedbackApi.class);
                q5z.i(feedbackApi);
                return feedbackApi;
            case 18:
                return (FeedbackStrategy) ((hvq) xvf0Var.get()).b.b;
            case 19:
                on2 on2Var3 = (on2) xvf0Var.get();
                on2Var3.getClass();
                OrderApi orderApi = (OrderApi) on2Var3.a(GoApiName.TaxiV3, OrderApi.class);
                q5z.i(orderApi);
                return orderApi;
            case 20:
                return new qs70((rqo) xvf0Var.get());
            case 21:
                on2 on2Var4 = (on2) xvf0Var.get();
                on2Var4.getClass();
                TaxiApi taxiApi = (TaxiApi) on2Var4.a(GoApiName.TaxiV3, TaxiApi.class);
                q5z.i(taxiApi);
                return taxiApi;
            case 22:
                return new ayx0((Context) xvf0Var.get());
            case 23:
                return new kyx0((rqo) xvf0Var.get());
            case 24:
                TaxiOrderChatApi h = h2b1.h((on2) xvf0Var.get());
                q5z.i(h);
                return h;
            case 25:
                return new mzx0((rqo) xvf0Var.get());
            case 26:
                TaxiOrderSharingApi z = xpb1.z((on2) xvf0Var.get());
                q5z.i(z);
                return z;
            case 27:
                return new t2y0((e) xvf0Var.get());
            case 28:
                return b3y0.a((y030) xvf0Var.get());
            default:
                return new d((rqo) xvf0Var.get());
        }
    }
}
