package defpackage;

import android.content.Context;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.payments.data.BillingApi;
import ru.yandex.taxi.communications.benefitscenter.a;
import ru.yandex.taxi.layers.e;
import ru.yandex.taxi.map.overlay.b;
import ru.yandex.taxi.map_common.map.r;

/* loaded from: classes9.dex */
public final class fn5 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ fn5(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        boolean z = false;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((pav) xvf0Var.get());
            case 1:
                return new rz0((rqo) xvf0Var.get(), 1);
            case 2:
                return new rn5((cda0) xvf0Var.get());
            case 3:
                return new bo5(i5m.a(xvf0Var));
            case 4:
                return new co5((rqo) xvf0Var.get());
            case 5:
                return new eo5((on2) xvf0Var.get(), 0);
            case 6:
                return new oo5((pdc) xvf0Var.get());
            case 7:
                return new yo5((r) xvf0Var.get());
            case 8:
                return new cp5((Context) xvf0Var.get());
            case 9:
                return new vit((dne0) xvf0Var.get());
            case 10:
                BillingApi a = s6b1.a((on2) xvf0Var.get());
                q5z.i(a);
                return a;
            case 11:
                BillingApi e = s6b1.e((on2) xvf0Var.get());
                q5z.i(e);
                return e;
            case 12:
                return new ty5((pho) xvf0Var.get());
            case 13:
                return new y16((Context) xvf0Var.get());
            case 14:
                return new com.yandex.go.ble.domain.a((Context) xvf0Var.get());
            case 15:
                return new b1((pho) xvf0Var.get());
            case 16:
                return new y46((e56) xvf0Var.get());
            case 17:
                return new m56((b) xvf0Var.get());
            case 18:
                return new s66((rqo) xvf0Var.get(), 0);
            case 19:
                return new pr6((rqo) xvf0Var.get(), 0);
            case 20:
                return new au6((oxu0) xvf0Var.get());
            case 21:
                return new iu6((dne0) xvf0Var.get());
            case 22:
                return new fw6();
            case 23:
                return new rw6((rqo) xvf0Var.get());
            case 24:
                return new dy6((rqo) xvf0Var.get(), 0);
            case 25:
                return new t17((zuj0) xvf0Var.get());
            case 26:
                return new wbz0(z);
            case 27:
                return new cot(10, (FeedSdkComponent) xvf0Var.get());
            case 28:
                return new wd7((e) xvf0Var.get());
            default:
                return new ce7((bgi) xvf0Var.get());
        }
    }
}
