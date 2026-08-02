package defpackage;

import android.content.Context;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.go.account.phonish_upgrade.d;
import com.yandex.go.account.phonish_upgrade.o;
import com.yandex.go.explorer.impl.data.storage.a;
import com.yandex.passport.api.KPassportEnvironment;
import com.ybsdk.adapters.passportsdk.PassportAdapterFactory;
import com.ybsdk.feature.passport.api.YbPassportEnvironment;
import ru.yandex.taxi.am.i;
import ru.yandex.taxi.credentials.e;
import ru.yandex.taxi.favorites.address.impl.data.b;
import ru.yandex.taxi.favorites.address.impl.domain.c;
import ru.yandex.taxi.logistics.sdk.j;
import ru.yandex.taxi.persuggest.source.f;

/* loaded from: classes.dex */
public final class cuo implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public cuo(xzo xzoVar, n3w n3wVar, xvf0 xvf0Var) {
        this.a = 1;
        this.b = n3wVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        YbPassportEnvironment ybPassportEnvironment;
        KPassportEnvironment kPassportEnvironment;
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new a((Context) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 1:
                Context context = (Context) xvf0Var2.get();
                w4o w4oVar = (w4o) xvf0Var.get();
                new PassportAdapterFactory();
                if (w4oVar.equals(u4o.d) || w4oVar.equals(t4o.d)) {
                    ybPassportEnvironment = YbPassportEnvironment.TESTING;
                } else {
                    if (!w4oVar.equals(v4o.d)) {
                        w511.b();
                        return null;
                    }
                    ybPassportEnvironment = YbPassportEnvironment.PRODUCTION;
                }
                int i3 = en90.a[ybPassportEnvironment.ordinal()];
                if (i3 == 1) {
                    kPassportEnvironment = KPassportEnvironment.TESTING;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    kPassportEnvironment = KPassportEnvironment.PRODUCTION;
                }
                return new com.ybsdk.adapters.passportsdk.impl.a(context, kPassportEnvironment);
            case 2:
                return new j((tt2) xvf0Var2.get(), (ky11) xvf0Var.get());
            case 3:
                return new s2p0(xvf0Var2, xvf0Var, i2);
            case 4:
                return new e((ru.yandex.taxi.experiments.superapp.j) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 5:
                return new zrm((v8w0) xvf0Var2.get(), (nbj) xvf0Var.get());
            case 6:
                return new dap(i5m.a(xvf0Var2), (i130) xvf0Var.get());
            case 7:
                return new c((b) xvf0Var2.get(), (t17) xvf0Var.get());
            case 8:
                return new com.yandex.go.favorites.deeplink.a((fx60) xvf0Var.get(), xvf0Var2);
            case 9:
                return new wip((tj60) xvf0Var.get(), (Context) xvf0Var2.get());
            case 10:
                return new com.yandex.go.taxi.order.api.details.common.domain.feedback.a((tse) xvf0Var2.get(), (com.yandex.go.taxi.order.details.v2.domain.feedback.sending.a) xvf0Var.get());
            case 11:
                return new com.yandex.go.zone.interactors.a((fd61) xvf0Var2.get(), (com.yandex.go.zone.interactors.b) xvf0Var.get());
            case 12:
                return new a1r((oyq) xvf0Var2.get(), (Looper) xvf0Var.get());
            case 13:
                return new f((tse) xvf0Var.get(), (com.yandex.go.navigation.screen.c) xvf0Var2.get());
            case 14:
                return new com.yandex.go.layers.domain.a((uxx) xvf0Var2.get(), (ah00) xvf0Var.get());
            case 15:
                return new b8r((ck31) xvf0Var2.get(), (qrw) xvf0Var.get());
            case 16:
                return new c8r((ck31) xvf0Var2.get(), (urw) xvf0Var.get());
            case 17:
                return new uva(5, (Context) xvf0Var2.get(), (y50) xvf0Var.get());
            case 18:
                return new mir((ypq) xvf0Var2.get(), (com.yandex.go.flex.common.ui.theme.f) xvf0Var.get());
            case 19:
                return new umr((lx4) xvf0Var2.get(), (sh41) xvf0Var.get());
            case 20:
                return new bxr((at2) xvf0Var.get(), (k020) xvf0Var2.get());
            case 21:
                return new d((rqo) xvf0Var2.get(), (i) xvf0Var.get());
            case 22:
                return new o((Context) xvf0Var2.get(), (d) xvf0Var.get());
            case 23:
                dne0 dne0Var = (dne0) xvf0Var2.get();
                jtq0 jtq0Var = (jtq0) xvf0Var.get();
                hzk hzkVar = new hzk();
                hzkVar.a = jtq0Var;
                hzkVar.b = dne0Var.a("force_phonish_upgrade_show_policy_preferences");
                return hzkVar;
            case 24:
                return new ru.yandex.logistics.cargo_form.async.impl.storage.a((ru.yandex.logistics.cargo_form.async.impl.storage.b) xvf0Var2.get(), (st2) xvf0Var.get());
            case 25:
                return new ru.yandex.logistics.cargo_form.async.impl.storage.b((Context) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 26:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.c((Context) xvf0Var.get(), (Moshi) xvf0Var2.get());
            case 27:
                return new ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.e((Context) xvf0Var.get(), (Moshi) xvf0Var2.get());
            case 28:
                return new l6s((jwh) xvf0Var2.get(), (Moshi) xvf0Var.get());
            default:
                return new b3t((wy1) xvf0Var2.get(), (vo00) xvf0Var.get());
        }
    }

    public /* synthetic */ cuo(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
