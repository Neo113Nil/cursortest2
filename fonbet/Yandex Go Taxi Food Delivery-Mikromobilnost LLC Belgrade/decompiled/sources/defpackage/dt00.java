package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.experiment.g;
import com.yandex.messaging.markwon.a;
import com.yandex.messenger.websdk.api.WebChromeClientConfig;
import com.yandex.messenger.websdk.api.WebMessenger;
import com.ybsdk.feature.banners.api.MarkEventsApi;
import com.ybsdk.network.UzApi;

/* loaded from: classes10.dex */
public final class dt00 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ dt00(fx50 fx50Var, v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ct00((am2) ((oe) xvf0Var).get());
            case 1:
                return a.a((i8g) ((o8g) xvf0Var).get());
            case 2:
                return new uk10((o61) ((gk10) xvf0Var).get());
            case 3:
                return new el10((lcw) xvf0Var);
            case 4:
                return new uk10((mj10) ((ea0) xvf0Var).get());
            case 5:
                return new un10(i5m.a((l20) xvf0Var));
            case 6:
                ((h420) xvf0Var).get();
                return new vuz();
            case 7:
                return new vit(29, (t61) ((d441) xvf0Var).get());
            case 8:
                jb7 jb7Var = (jb7) ((t6i) xvf0Var).get();
                rh41 rh41Var = (rh41) jb7Var.b;
                WebChromeClientConfig webChromeClientConfig = new WebChromeClientConfig(null);
                ((rs2) jb7Var.c).getClass();
                f420 f420Var = (f420) jb7Var.w;
                return new WebMessenger(rh41Var.a, rh41Var.a(99L, "yandexgo", !((e420) f420Var.c()).b || ((e420) f420Var.c()).c, !((e420) f420Var.c()).b || ((e420) f420Var.c()).d, false, f420Var.d()), rh41Var.b, rh41Var.c, rh41Var.d, webChromeClientConfig);
            case 9:
                bcy0 bcy0Var = (bcy0) ((umt0) xvf0Var).get();
                rh41 rh41Var2 = bcy0Var.a;
                WebChromeClientConfig webChromeClientConfig2 = bcy0Var.d;
                bcy0Var.b.getClass();
                f420 f420Var2 = bcy0Var.c;
                return new WebMessenger(rh41Var2.a, rh41Var2.a(99L, "yandexgo", !((e420) f420Var2.c()).b || ((e420) f420Var2.c()).c, !((e420) f420Var2.c()).b || ((e420) f420Var2.c()).d, false, f420Var2.d()), rh41Var2.b, rh41Var2.c, rh41Var2.d, webChromeClientConfig2);
            case 10:
                return new WebChromeClientConfig(new weu(9, (m420) ((b8w) xvf0Var).get()));
            case 11:
                return new nb20((hl2) ((qy0) xvf0Var).get());
            case 12:
                return new au50(23, (g) ((y1u) xvf0Var).get());
            case 13:
                return new a630((co40) ((f870) xvf0Var).get());
            case 14:
                return new l730((vd) xvf0Var);
            case 15:
                return r730.b((s3g) ((gk10) xvf0Var).get());
            case 16:
                return new hd30(i2, (i020) xvf0Var);
            case 17:
                return ((yn30) ((k220) xvf0Var).get()).a();
            case 18:
                return new ls30((u8w) ((sp00) xvf0Var).get());
            case 19:
                return new tu30((b011) ((jqz0) xvf0Var).get());
            case 20:
                return new uk10((es40) ((s730) xvf0Var).get());
            case 21:
                return new r350((co40) ((p350) xvf0Var).get());
            case 22:
                return new s350((t350) ((p350) xvf0Var).get());
            case 23:
                return (com.yandex.delivery.utils.auth.api.network.a) ((xv2) xvf0Var).get();
            case 24:
                return new com.ybsdk.feature.banners.api.interactors.a((MarkEventsApi) ((p350) xvf0Var).get());
            case 25:
                return (UzApi) ((t0k0) ((gve) xvf0Var).get()).b(UzApi.class);
            case 26:
                return new al60((rx2) ((hro) xvf0Var).get());
            case 27:
                return new pw60((bjf) ((vve) xvf0Var).get());
            case 28:
                return new com.yandex.go.flex.main_screen.data.widgets.descriptors.a((g430) xvf0Var, i3);
            default:
                return new com.yandex.go.flex.common.descriptors.action.factory.a((r2h) ((g430) xvf0Var).get());
        }
    }

    public /* synthetic */ dt00(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
