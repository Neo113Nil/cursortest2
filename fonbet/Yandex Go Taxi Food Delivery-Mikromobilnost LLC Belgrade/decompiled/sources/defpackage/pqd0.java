package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.b;
import com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d;
import com.yandex.go.promocodes.f;
import com.yandex.go.shortcuts.impl.dto.ShortcutsApi;
import com.yandex.go.shortcuts.impl.interactors.r;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.cashback.g;
import ru.yandex.taxi.plus.sdk.micro_widget.websdk.a;
import ru.yandex.taxi.widget.c;

/* loaded from: classes9.dex */
public final class pqd0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ pqd0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new oqd0((g) xvf0Var3.get(), (lg21) xvf0Var2.get(), xvf0Var);
            case 1:
                return new a((ep90) xvf0Var3.get(), (m) xvf0Var2.get(), (tse) xvf0Var.get());
            case 2:
                return new ru.yandex.taxi.modal.popup.ui.model.a((tt2) xvf0Var3.get(), (c) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 3:
                return new bce0((tt2) xvf0Var3.get(), (gq41) xvf0Var2.get(), (iq41) xvf0Var.get());
            case 4:
                return new hqe0((dqe0) xvf0Var3.get(), (axm) xvf0Var2.get(), (y1s) xvf0Var.get());
            case 5:
                return new jqe0((Activity) xvf0Var3.get(), (a980) xvf0Var2.get(), (pit) xvf0Var.get());
            case 6:
                return new w1f0((avx) xvf0Var3.get(), (pux) xvf0Var2.get(), (com.yandex.go.blockeduser.data.c) xvf0Var.get());
            case 7:
                return new saf0((r) xvf0Var3.get(), (ShortcutsApi) xvf0Var2.get(), (blh) xvf0Var.get());
            case 8:
                return new vef0((y120) xvf0Var3.get(), (kse) xvf0Var2.get(), (x22) xvf0Var.get());
            case 9:
                Context context = (Context) xvf0Var3.get();
                wff0 wff0Var = (wff0) xvf0Var2.get();
                x22 x22Var = (x22) xvf0Var.get();
                return Build.VERSION.SDK_INT < 31 ? new uw50(context, wff0Var, x22Var) : new ww50(context, wff0Var, x22Var);
            case 10:
                return new b((com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) xvf0Var3.get(), (smf0) xvf0Var2.get(), (d) xvf0Var.get());
            case 11:
                return new com.yandex.go.promocodes.base.impl.promo_codes.data.datasources.c((on2) xvf0Var3.get(), (ru.yandex.taxi.launch.c) xvf0Var2.get(), (cda0) xvf0Var.get());
            case 12:
                return new com.yandex.go.communications.banners.b((Lifecycle) xvf0Var3.get(), (tse) xvf0Var2.get(), (h) xvf0Var.get());
            case 13:
                return new e2g0((kg51) xvf0Var2.get(), (a3h) xvf0Var.get(), (hh51) xvf0Var3.get());
            case 14:
                return new e3g0((xk60) xvf0Var3.get(), (y4g0) xvf0Var2.get(), (q3g0) xvf0Var.get());
            case 15:
                return new com.yandex.go.diagnostic_qr.a((tse) xvf0Var3.get(), (x6g0) xvf0Var2.get(), i5m.a(xvf0Var));
            case 16:
                return new com.ybsdk.qr.a((qpi0) xvf0Var3.get(), (a3h) xvf0Var2.get(), (com.ybsdk.feature.qr.internal.domain.a) xvf0Var.get());
            case 17:
                return new oig0((tse) xvf0Var3.get(), (zgg0) xvf0Var2.get(), (vgg0) xvf0Var.get());
            case 18:
                return new com.yandex.go.quark.impl.data.a((com.yandex.go.quark.impl.data.b) xvf0Var3.get(), (ru.yandex.taxi.am.g) xvf0Var2.get(), (tse) xvf0Var.get());
            case 19:
                return new elg0();
            case 20:
                return new ru.yandex.taxi.profile.a((on2) xvf0Var3.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 21:
                return new jai0((Context) xvf0Var3.get(), (xav) xvf0Var2.get(), (gsu) xvf0Var.get());
            case 22:
                return new lni0((nni0) xvf0Var3.get(), (ru.yandex.taxi.launch.c) xvf0Var2.get(), (ru.yandex.taxi.startup.launch.h) xvf0Var.get());
            case 23:
                return new hoi0((xni0) xvf0Var3.get(), (ru.yandex.taxi.utils.c) xvf0Var2.get(), (com.yandex.go.promocodes.referral.impl.ui.b) xvf0Var.get());
            case 24:
                return new f((com.yandex.go.lifecycle.a) xvf0Var3.get(), xvf0Var2, (fx60) xvf0Var.get());
            case 25:
                return new fpi0((tse) xvf0Var3.get(), i5m.a(xvf0Var2), (m) xvf0Var.get());
            case 26:
                return new kpi0((xku0) xvf0Var3.get(), (ycq0) xvf0Var2.get(), (dqe0) xvf0Var.get());
            case 27:
                return new nfh((rqo) xvf0Var3.get(), (ijj0) xvf0Var2.get(), (com.yandex.go.taxi.tariffs.repository.g) xvf0Var.get());
            case 28:
                return new com.yandex.go.preorder.deeplinks.b((com.yandex.go.route.interactor.b) xvf0Var3.get(), (qiv0) xvf0Var2.get(), (tt2) xvf0Var.get());
            default:
                return new isj0((w5t) xvf0Var3.get(), (j3u) xvf0Var2.get(), (lwi) xvf0Var.get());
        }
    }

    public /* synthetic */ pqd0(Object obj, v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }
}
