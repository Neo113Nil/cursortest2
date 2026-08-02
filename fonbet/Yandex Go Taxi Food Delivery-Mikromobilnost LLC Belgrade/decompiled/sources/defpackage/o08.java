package defpackage;

import android.app.Activity;
import com.yandex.go.scooters.debt.domain.c;
import com.yandex.messaging.ChatRequest;
import com.yandex.payment.sdk.core.data.AppInfo;
import com.yandex.payment.sdk.core.data.GooglePayData;
import ru.yandex.taxi.communications.data.a;
import ru.yandex.taxi.masstransit.address.interactor.i;
import ru.yandex.taxi.masstransit.router.d;
import ru.yandex.taxi.masstransit.router.l;

/* loaded from: classes13.dex */
public final class o08 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final n3w h;

    public o08(f3g f3gVar, b3g b3gVar, b3g b3gVar2, n3w n3wVar, f3g f3gVar2, xvf0 xvf0Var, g3g g3gVar) {
        this.a = 3;
        this.b = f3gVar;
        this.c = b3gVar;
        this.d = b3gVar2;
        this.h = n3wVar;
        this.e = f3gVar2;
        this.f = xvf0Var;
        this.g = g3gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.g;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.c;
        n3w n3wVar = this.h;
        xvf0 xvf0Var5 = this.d;
        xvf0 xvf0Var6 = this.b;
        switch (i) {
            case 0:
                return new n08((w030) xvf0Var6.get(), (a08) xvf0Var4.get(), (k08) xvf0Var5.get(), (vz7) xvf0Var3.get(), (d08) n3wVar.a, (a) xvf0Var.get(), (com.yandex.go.taxi.order.cancel.similar.notification.a) xvf0Var2.get());
            case 1:
                return new jo9((oep0) xvf0Var6.get(), (w030) xvf0Var4.get(), (vn9) xvf0Var5.get(), (awa) xvf0Var3.get(), this.f, (go9) xvf0Var2.get(), (bo9) n3wVar.a);
            case 2:
                return new com.yandex.messaging.internal.view.messagemenu.a((Activity) xvf0Var6.get(), this.c, (com.yandex.messaging.internal.backendconfig.a) xvf0Var5.get(), (ChatRequest) xvf0Var3.get(), (y4t) xvf0Var.get(), (lu10) n3wVar.a, i5m.a(xvf0Var2));
            case 3:
                return new d((tse) xvf0Var6.get(), (tt2) xvf0Var4.get(), (atd0) xvf0Var5.get(), (ru.yandex.taxi.masstransit.main.router.a) n3wVar.a, (tu30) xvf0Var3.get(), (i2s0) xvf0Var.get(), (i) xvf0Var2.get());
            case 4:
                return new l((yv30) xvf0Var6.get(), (mk40) xvf0Var4.get(), (uj30) xvf0Var5.get(), this.e, this.f, (wk40) n3wVar.a, (xj30) xvf0Var2.get());
            case 5:
                bt5 bt5Var = (bt5) xvf0Var6.get();
                xvt xvtVar = (xvt) xvf0Var4.get();
                y9a0 y9a0Var = (y9a0) xvf0Var5.get();
                AppInfo appInfo = (AppInfo) xvf0Var3.get();
                GooglePayData googlePayData = (GooglePayData) xvf0Var.get();
                boolean booleanValue = ((Boolean) n3wVar.a).booleanValue();
                rwo rwoVar = (rwo) xvf0Var2.get();
                int i2 = 1;
                boolean z = googlePayData != null;
                it00.b.a = new xj00(new vhj(rwoVar, i2), new vhj(rwoVar, 2));
                if (!z) {
                    xvtVar = null;
                }
                return new aia0(bt5Var, xvtVar, rwoVar, y9a0Var, new rg7(appInfo.getPsuid(), appInfo.getTsid(), appInfo.getAppid()), booleanValue);
            case 6:
                return new com.yandex.go.scooters.debt.d((w030) xvf0Var6.get(), (c) xvf0Var4.get(), (po21) xvf0Var5.get(), (ldn0) xvf0Var3.get(), (edn0) n3wVar.a, this.f, this.g);
            default:
                return new tuv0((e7c0) xvf0Var6.get(), (z111) xvf0Var4.get(), (vw9) xvf0Var5.get(), (ein0) xvf0Var3.get(), (sux0) xvf0Var.get(), (com.yandex.go.superapp.discovery.map.impl.domain.interactors.a) xvf0Var2.get(), (ktv0) n3wVar.a);
        }
    }

    public /* synthetic */ o08(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = xvf0Var2;
        this.e = n3wVar;
        this.h = n3wVar2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
    }

    public /* synthetic */ o08(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, n3w n3wVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = n3wVar;
    }

    public /* synthetic */ o08(n3w n3wVar, v7p v7pVar, xvf0 xvf0Var, v7p v7pVar2, v7p v7pVar3, n3w n3wVar2, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = v7pVar;
        this.d = xvf0Var;
        this.e = v7pVar2;
        this.f = v7pVar3;
        this.h = n3wVar2;
        this.g = xvf0Var2;
    }

    public o08(ku90 ku90Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar, n3w n3wVar2, n3w n3wVar3, n3w n3wVar4) {
        this.a = 5;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = n3wVar;
        this.f = n3wVar2;
        this.h = n3wVar3;
        this.g = n3wVar4;
    }
}
