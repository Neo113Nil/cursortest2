package defpackage;

import android.content.Context;
import com.yandex.go.delivery.tracking.DeliveryTrackingModalView;
import com.yandex.go.delivery.tracking.di.f;
import com.yandex.go.delivery.tracking.l;
import com.yandex.go.delivery.tracking.map_overlay.r;
import com.yandex.messenger.websdk.api.WebMessenger;
import java.util.UUID;
import kotlin.a;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;
import ru.yandex.taxi.logistics.photocomment.c;
import ru.yandex.taxi.logistics.sdk.tracking.preparer.b;
import ru.yandex.taxi.logistics.sdk.tracking.uuid_store.d;
import ru.yandex.taxi.settings.info.modal.MenuInfoModalView;

/* loaded from: classes12.dex */
public final class lui extends m230 {
    public final /* synthetic */ int E = 1;
    public final w030 F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final yvf0 J;
    public final Object K;
    public final Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lui(w030 w030Var, xti xtiVar, rii riiVar, zzg zzgVar, gw7 gw7Var) {
        super(null);
        final int i = 0;
        this.F = w030Var;
        this.G = xtiVar;
        this.H = riiVar;
        this.I = zzgVar;
        this.J = gw7Var;
        this.K = a.a(new sls(this) { // from class: jui
            public final /* synthetic */ lui b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                lui luiVar = this.b;
                switch (i2) {
                    case 0:
                        return (auh) ((zzg) luiVar.I).get();
                    default:
                        return new myh(luiVar);
                }
            }
        });
        final int i2 = 1;
        this.L = new sls(this) { // from class: jui
            public final /* synthetic */ lui b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                lui luiVar = this.b;
                switch (i22) {
                    case 0:
                        return (auh) ((zzg) luiVar.I).get();
                    default:
                        return new myh(luiVar);
                }
            }
        };
    }

    @Override // defpackage.m230, defpackage.h55
    public void G(Object obj) {
        switch (this.E) {
            case 1:
                super.G((zy11) obj);
                b750 b750Var = (b750) this.G;
                b750Var.getClass();
                b750Var.a = NavigationDirection.NO_ANIMATE;
                break;
            default:
                super.G(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.E) {
            case 0:
                z((auh) ((i3y) this.K).getValue(), sy60.Q2);
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        Object z601Var;
        b bVar;
        aoi aoiVar;
        switch (this.E) {
            case 0:
                rui ruiVar = (rui) obj;
                xti xtiVar = (xti) this.G;
                DeliveryStateBaseParams deliveryStateBaseParams = new DeliveryStateBaseParams(ruiVar.a, ruiVar.b, ruiVar.c, ruiVar.d, ruiVar.e);
                kui kuiVar = new kui(this);
                vyh vyhVar = new vyh(2, (jui) this.L);
                rii riiVar = (rii) this.H;
                w030 w030Var = this.F;
                xtiVar.getClass();
                riiVar.getClass();
                w030Var.getClass();
                n3w a = n3w.a(deliveryStateBaseParams);
                n3w a2 = n3w.a(kuiVar);
                uyf uyfVar = new uyf(xtiVar, 15);
                uyf uyfVar2 = new uyf(xtiVar, 7);
                uyf uyfVar3 = new uyf(xtiVar, 3);
                uyf uyfVar4 = new uyf(xtiVar, 8);
                int i = 13;
                rx4 rx4Var = new rx4(new uyf(xtiVar, 19), new uyf(xtiVar, 6), mni.a(new vx0(new uyf(xtiVar, 1), new uyf(xtiVar, i), new uyf(xtiVar, 24))), new uyf(xtiVar, 21), 5);
                uyf uyfVar5 = new uyf(xtiVar, 10);
                int i2 = 22;
                xvf0 b = i5m.b(new vui(a, a2, uyfVar, uyfVar2, oui.a, uyfVar3, uyfVar4, rx4Var, new gb0((xvf0) new p7r0(uyfVar5, i), (xvf0) new uyf(xtiVar, 12), (xvf0) new y500(uyfVar5, 17), (xvf0) new z5i(uyfVar5, 1), (xvf0) new p7r0(uyfVar5, 11), (xvf0) new xyd0(uyfVar5, 20), (xvf0) new vrt0(uyfVar5, 24), (xvf0) new p7r0(uyfVar5, 12), (xvf0) new ig7(uyfVar5, 4), (v7p) new peb(uyfVar5, 8), 14), new uyf(xtiVar, 14), new uyf(xtiVar, 16), new uyf(xtiVar, i2), new uyf(xtiVar, 23), new kk(a, i2), new uyf(xtiVar, 18), new uyf(xtiVar, 25), new uyf(xtiVar, 0), new uyf(xtiVar, 17), mui.a, new uyf(xtiVar, 4), new uyf(xtiVar, 11), new uyf(xtiVar, 20), new uyf(xtiVar, 9), new uyf(xtiVar, 2), new uyf(xtiVar, 5)));
                uyf uyfVar6 = new uyf(xtiVar, 26);
                Context context = xtiVar.a;
                q5z.h(context);
                l lVar = (l) b.get();
                l lVar2 = (l) b.get();
                ru.yandex.taxi.logistics.payment.a aVar = xtiVar.q;
                q5z.h(aVar);
                h3y a3 = i5m.a(uyfVar6);
                y50 y50Var = xtiVar.C;
                q5z.h(y50Var);
                g gVar = xtiVar.B;
                q5z.h(gVar);
                c cVar = new c(y50Var, gVar);
                ru.yandex.taxi.messenger.a aVar2 = xtiVar.y;
                q5z.h(aVar2);
                com.yandex.go.urbanads.b bVar2 = xtiVar.F;
                q5z.h(bVar2);
                y8g y8gVar = null;
                WebMessenger webMessenger = ((h120) aVar2.a.c()).getB() ? (WebMessenger) a3.get() : null;
                String deliveryId = deliveryStateBaseParams.getDeliveryId();
                if (deliveryId != null) {
                    z601Var = new b701(deliveryId);
                } else {
                    UUID localUuid = deliveryStateBaseParams.getLocalUuid();
                    z601Var = localUuid != null ? new z601(localUuid) : a701.a;
                }
                z4m0 z4m0Var = new z4m0(z601Var, lVar2, new m5i(2, vyhVar), aVar, new x501(webMessenger, 6), cVar, bVar2, 11);
                Object obj2 = bvf0.g;
                synchronized (obj2) {
                    y8g y8gVar2 = bvf0.e;
                    if (y8gVar2 == null) {
                        y8gVar2 = null;
                    }
                    rfw0 rfw0Var = ((y601) y8gVar2.q1.a).a;
                    bVar = new b((d) ((xvf0) rfw0Var.a).get(), (a201) ((yvr0) rfw0Var.b).get(), z4m0Var);
                }
                com.yandex.go.route.interactor.c cVar2 = xtiVar.v;
                q5z.h(cVar2);
                ru.yandex.taxi.delivery.d dVar = new ru.yandex.taxi.delivery.d(cVar2.f());
                n3h n3hVar = xtiVar.g;
                q5z.h(n3hVar);
                or4 or4Var = new or4(new mr4(e.t(new f(dVar)), e.t(new com.yandex.go.delivery.tracking.di.d(new com.yandex.go.delivery.tracking.di.b((n4u0) kk.a(deliveryStateBaseParams).e.getValue()))), new g92(2, null), null, null), new yzh(n3hVar), vyhVar);
                synchronized (obj2) {
                    y8g y8gVar3 = bvf0.e;
                    if (y8gVar3 != null) {
                        y8gVar = y8gVar3;
                    }
                    ur4 ur4Var = (ur4) y8gVar.f().A(or4Var).l.get();
                    qcp0 qcp0Var = ur4Var.a;
                    xr4 xr4Var = ur4Var.b;
                    lvn lvnVar = new lvn();
                    mvn mvnVar = new mvn();
                    qcp0Var.getClass();
                    aoiVar = new aoi(xr4Var, lvnVar, mvnVar);
                }
                yth ythVar = xtiVar.o;
                q5z.h(ythVar);
                r rVar = xtiVar.s;
                q5z.h(rVar);
                zui zuiVar = xtiVar.G;
                q5z.h(zuiVar);
                ah00 ah00Var = xtiVar.f;
                q5z.h(ah00Var);
                zuj0 zuj0Var = xtiVar.E;
                q5z.h(zuj0Var);
                return new DeliveryTrackingModalView(context, lVar, bVar, aoiVar, ythVar, rVar, zuiVar, ah00Var, zuj0Var, deliveryStateBaseParams);
            default:
                zk10 zk10Var = (zk10) this.H;
                dl10 dl10Var = (dl10) this.I;
                fl10 fl10Var = new fl10(this);
                kjz kjzVar = dl10Var.a;
                cl10 cl10Var = new cl10(fl10Var, (uk10) ((dt00) kjzVar.b).get(), (ru.yandex.taxi.settings.info.interactor.a) ((xcz) kjzVar.c).get());
                NavigationDirection navigationDirection = ((b750) this.G).a;
                mc mcVar = zk10Var.a;
                return new MenuInfoModalView((Context) mcVar.a.get(), cl10Var, navigationDirection, (v3u0) mcVar.b.get());
        }
    }

    public lui(w030 w030Var, b750 b750Var, zk10 zk10Var, dl10 dl10Var, yvf0 yvf0Var, yvf0 yvf0Var2, bi4 bi4Var) {
        super(null);
        this.F = w030Var;
        this.G = b750Var;
        this.H = zk10Var;
        this.I = dl10Var;
        this.J = yvf0Var;
        this.K = yvf0Var2;
        this.L = bi4Var;
    }
}
