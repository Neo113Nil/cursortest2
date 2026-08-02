package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.pin.api.widget.b;
import com.ybsdk.feature.accountdetails.internal.data.a;
import com.ybsdk.feature.accountdetails.internal.network.AccountDetailsApi;
import com.ybsdk.feature.accountdetails.internal.screens.accountdetails.AccountDetailsFragment;
import ru.yandex.taxi.altpins.map.AlternativeDestinationOnMapControl;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button.c;

/* loaded from: classes5.dex */
public final class c1 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ c1(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static c1 a(eqh eqhVar) {
        return new c1(eqhVar, 0);
    }

    public static c1 b(xvf0 xvf0Var) {
        return new c1(xvf0Var, 17);
    }

    public static c1 c(eqh eqhVar) {
        return new c1(eqhVar, 8);
    }

    public static c1 d(xvf0 xvf0Var) {
        return new c1(xvf0Var, 18);
    }

    public static c1 e(eqh eqhVar) {
        return new c1(eqhVar, 13);
    }

    public static c1 f(eqh eqhVar) {
        return new c1(eqhVar, 16);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new b1((pho) xvf0Var.get());
            case 1:
                return new q4((zuj0) xvf0Var.get());
            case 2:
                return new c((lb) xvf0Var.get());
            case 3:
                tw51 tw51Var = (tw51) xvf0Var.get();
                int i2 = 0;
                return new ik(new cdp0(), ImmutableMap.g(AccountDetailsFragment.class, new kk(n3w.a(new uk(new mrj(2, new lk(i2, new c1(i5m.b(new lk(1, new gwf(tw51Var, 5))), 4)), new gwf(tw51Var, 4), new gwf(tw51Var, 6)))), i2)));
            case 4:
                return new a((AccountDetailsApi) xvf0Var.get());
            case 5:
                return new g191((lw) xvf0Var.get());
            case 6:
                return new j00((e) xvf0Var.get());
            case 7:
                return new t70((z22) xvf0Var.get());
            case 8:
                return new pj0((pho) xvf0Var.get());
            case 9:
                return new b1((pho) xvf0Var.get());
            case 10:
                return new ct0((yuj0) xvf0Var.get());
            case 11:
                return new xt0((t6s) xvf0Var.get());
            case 12:
                return new e51((pho) xvf0Var.get());
            case 13:
                return new b1((pho) xvf0Var.get());
            case 14:
                return new pj((pho) xvf0Var.get());
            case 15:
                return new ddf(13, (p6s) xvf0Var.get());
            case 16:
                return new ao1((on2) xvf0Var.get());
            case 17:
                return new po1((Context) xvf0Var.get());
            case 18:
                return new yp1((yp2) xvf0Var.get());
            case 19:
                return new AlternativeDestinationOnMapControl((Context) xvf0Var.get());
            case 20:
                return new ru.yandex.taxi.linked_order.provider.icons.map.a((b) xvf0Var.get());
            case 21:
                return new xk2((i6r) xvf0Var.get());
            case 22:
                return new al2((z22) xvf0Var.get());
            case 23:
                return new cl2((al2) xvf0Var.get());
            case 24:
                return new bz2();
            case 25:
                return new com.yandex.go.taxi.order.change.price.data.repository.a((on2) xvf0Var.get());
            case 26:
                return new o61((pho) xvf0Var.get());
            case 27:
                return new xb3((j1w) xvf0Var.get());
            case 28:
                return new b1((pho) xvf0Var.get());
            default:
                return new ol3((Activity) xvf0Var.get());
        }
    }
}
