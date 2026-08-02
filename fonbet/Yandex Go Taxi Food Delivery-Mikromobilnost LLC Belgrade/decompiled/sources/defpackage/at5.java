package defpackage;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.SystemClock;
import androidx.compose.foundation.gestures.e;
import androidx.compose.runtime.internal.a;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.OptimizedSuperappSuggestMapItemView;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemView;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.Transport;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.mobile.drive.sdk.DriveSdkView;
import com.yandex.mobile.drive.sdk.full.model.MapAddressData;
import com.yandex.smartcamera.arscene.ar_core.helpers.TapHelper;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.SbpPollingStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.masstransit.tickets.c;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final /* synthetic */ class at5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ at5(aia0 aia0Var, NewCard newCard, String str, nw70 nw70Var, oy80 oy80Var, String str2) {
        this.a = 9;
        this.b = aia0Var;
        this.w = newCard;
        this.x = str;
        this.y = nw70Var;
        this.z = oy80Var;
        this.c = str2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 showOfferSummary$lambda$2;
        RequestPoint o;
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                rka0 rka0Var = (rka0) obj7;
                bt5 bt5Var = (bt5) obj6;
                String str = rka0Var.a;
                goz0 goz0Var = ((ynz0) obj).b;
                break;
            case 1:
                qws0 qws0Var = (qws0) obj7;
                yx40 yx40Var = (yx40) obj3;
                bms bmsVar = (bms) obj2;
                u6y u6yVar = (u6y) obj;
                Object obj8 = null;
                u6y.b(u6yVar, null, new a(-700728298, new qk30(20, (fwi) obj6, (vbu) obj5, (oz40) obj4), true), 3);
                if (!qws0Var.b) {
                    List list = qws0Var.a;
                    ((m6y) u6yVar).f(list.size(), null, new qc0(list, 8, new nni(i3)), new a(802480018, new xs4(i3, list, bmsVar), true));
                    break;
                } else {
                    int intValue = yx40Var.getIntValue();
                    while (i2 < intValue) {
                        u6y.b(u6yVar, obj8, new a(-1787421377, new noi(yx40Var, i2), true), 3);
                        i2++;
                        obj8 = null;
                    }
                    break;
                }
            case 2:
                showOfferSummary$lambda$2 = DriveSdkView.showOfferSummary$lambda$2((MapAddressData) obj7, (List) obj6, (String) obj4, (String) obj5, (String) obj3, (shf) obj2, (efm) obj);
                break;
            case 3:
                e eVar = new e((tls) obj2, obj);
                eVar.m.setValue((lah) obj7);
                eVar.j(obj);
                eVar.b = (tls) obj6;
                eVar.c = (sls) obj5;
                eVar.d = (ck11) obj4;
                eVar.e = (gxg) obj3;
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                GLSurfaceView gLSurfaceView = (GLSurfaceView) obj7;
                s33 s33Var = (s33) obj6;
                Lifecycle lifecycle = (Lifecycle) obj3;
                l1 l1Var = (l1) obj2;
                new wyl0(gLSurfaceView, s33Var, ((Activity) obj5).getAssets());
                gLSurfaceView.setOnTouchListener((TapHelper) obj4);
                lifecycle.a(l1Var);
                lifecycle.a(s33Var);
                lifecycle.a(new fdh(1, gLSurfaceView));
                break;
            case 7:
                u510 u510Var = (u510) obj7;
                j940 j940Var = (j940) obj6;
                ugh ughVar = (ugh) obj4;
                tls tlsVar = (tls) obj3;
                c cVar = (c) obj2;
                u6y u6yVar2 = (u6y) obj;
                u6y.b(u6yVar2, null, new a(-1350991607, new qk30((List) obj5, ughVar, tlsVar, 26), true), 3);
                if (u510Var != null) {
                    u6y.b(u6yVar2, null, new a(636766703, new qk30(ughVar, u510Var, tlsVar, 27), true), 3);
                }
                if (j940Var.f != null) {
                    u6y.b(u6yVar2, null, new a(-1059775474, new qk30(j940Var, cVar, tlsVar, 28), true), 3);
                }
                u6y.b(u6yVar2, null, new a(2048090944, new y740(i2, j940Var, tlsVar), true), 3);
                break;
            case 8:
                OptimizedSuperappSuggestMapItemView.bindData$onImageLoaded((Ref$ObjectRef) obj7, (OptimizedSuperappSuggestMapItemView) obj6, (SuperappSuggestMapItemViewProperties) obj5, (zuj0) obj4, (Ref$ObjectRef) obj3, (List) obj2, true);
                break;
            case 9:
                NewCard newCard = (NewCard) obj5;
                String str2 = (String) obj4;
                nw70 nw70Var = (nw70) obj3;
                oy80 oy80Var = (oy80) obj2;
                String str3 = (String) obj6;
                bt5 bt5Var2 = ((aia0) obj7).a;
                ArrayList arrayList = rp8.f;
                String cardPaymentSystem = q501.s(newCard.getCardNumber()).a.toString();
                boolean f = thb1.f(newCard.getCvn());
                rwo rwoVar = bt5Var2.g;
                sv90 sv90Var = qv90.a;
                boolean shouldBeStored = newCard.getShouldBeStored();
                boolean z = bt5Var2.p;
                sv90Var.getClass();
                String l = b64.l("Оплата новой картой ", cardPaymentSystem, " ", z ? "через PSP" : "через Trust");
                if (shouldBeStored) {
                    l = l.concat(", с сохранением карты в Яндекс Пэй");
                }
                if (f) {
                    l = l.concat(", с пустым CVV");
                }
                String str4 = z ? "new_card_payment_v2" : "new_card_payment";
                wj00 wj00Var = new wj00(0);
                wj00Var.i("bind_card", shouldBeStored);
                wj00Var.k("system", cardPaymentSystem);
                wj00Var.i("empty_svv", f);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
                iho c = y891.c(str4, wj00Var);
                md51 a = bt5Var2.a(str2);
                u50 u50Var = new u50(bt5Var2, newCard, str3, nw70Var, oy80Var, 5);
                ymx ymxVar = (ymx) a;
                ymxVar.getClass();
                md51 j = ymx.j(ymxVar, u50Var, null, 5);
                ((y22) rwoVar).b(c, j);
                break;
            case 10:
                SbpPollingStrategy sbpPollingStrategy = (SbpPollingStrategy) obj6;
                String str5 = (String) obj4;
                yj70 yj70Var = (yj70) obj5;
                oy80 oy80Var2 = (oy80) obj2;
                String str6 = (String) obj3;
                bt5 bt5Var3 = ((aia0) obj7).a;
                rwo rwoVar2 = bt5Var3.g;
                sv90 sv90Var2 = qv90.a;
                boolean z2 = bt5Var3.p;
                sv90Var2.getClass();
                iho f2 = xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Оплата через Систему Быстрых Платежей ".concat(z2 ? "через PSP" : "через Trust"), z2 ? "sbp_payment_v2" : "sbp_payment");
                md51 a2 = bt5Var3.a(str5);
                u50 u50Var2 = new u50((Object) bt5Var3, str6, (Object) sbpPollingStrategy, (Object) yj70Var, (Object) oy80Var2, 6);
                ymx ymxVar2 = (ymx) a2;
                ymxVar2.getClass();
                md51 j2 = ymx.j(ymxVar2, u50Var2, null, 5);
                ((y22) rwoVar2).b(f2, j2);
                break;
            case 11:
                ixa0 ixa0Var = (ixa0) obj7;
                List list2 = (List) obj6;
                jel0 jel0Var = (jel0) obj5;
                DrivingOptions drivingOptions = (DrivingOptions) obj4;
                VehicleOptions vehicleOptions = (VehicleOptions) obj3;
                iel0 iel0Var = (iel0) obj2;
                DrivingRouter drivingRouter = (DrivingRouter) obj;
                ArrayList arrayList2 = new ArrayList();
                RequestPoint o2 = k.o(new Point(ixa0Var.c, ixa0Var.d), RequestPointType.WAYPOINT, "");
                if (o2 != null) {
                    arrayList2.add(o2);
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    doe doeVar = ((axa0) it.next()).a;
                    zy11 zy11Var2 = zy11Var;
                    RequestPoint o3 = k.o(new Point(doeVar.a, doeVar.b), RequestPointType.WAYPOINT, "");
                    if (o3 != null) {
                        arrayList2.add(o3);
                    }
                    zy11Var = zy11Var2;
                }
                zy11 zy11Var3 = zy11Var;
                if (arrayList2.size() >= 2) {
                    jel0Var.f = SystemClock.elapsedRealtime();
                    jel0Var.g = drivingRouter.requestRoutes(arrayList2, drivingOptions, vehicleOptions, iel0Var);
                    break;
                } else {
                    jel0Var.a();
                    r0 r0Var = jel0Var.c;
                    ral0 ral0Var = new ral0("Route build error: not enough valid request points");
                    r0Var.getClass();
                    r0Var.m(null, ral0Var);
                    break;
                }
            case 12:
                n70 n70Var = (n70) obj7;
                ((u561) n70Var.N).a.setCallbacks((tls) obj6, (zls) obj5, (wls) obj4, (sls) obj3, (sls) obj2);
                ((u561) n70Var.N).a.render(new tos((x8m0) n70Var.Z()));
                break;
            case 13:
                SuperappSuggestMapItemView.bindData$onImageLoaded((Ref$ObjectRef) obj7, (SuperappSuggestMapItemView) obj6, (SuperappSuggestMapItemViewProperties) obj5, (zuj0) obj4, (Ref$ObjectRef) obj3, (List) obj2, true);
                break;
            case 14:
                m3u0 m3u0Var = (m3u0) obj6;
                qor qorVar = (qor) obj5;
                tls tlsVar2 = (tls) obj4;
                m3u0 m3u0Var2 = (m3u0) obj3;
                fwi fwiVar = (fwi) obj2;
                u6y u6yVar3 = (u6y) obj;
                bpl0 bpl0Var = ((ki31) obj7).f;
                List list3 = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                m6y m6yVar = (m6y) u6yVar3;
                m6yVar.f(list3.size(), wlsVar != null ? new qq5(13, wlsVar, list3) : null, new pcx0(list3, 10), new a(-930734472, new sc0(list3, m3u0Var, qorVar, tlsVar2), true));
                u6y.b(m6yVar, "space_for_overscroll", new a(-769272325, new ays0(23, m3u0Var2, fwiVar), true), 2);
                break;
            default:
                Point point = (Point) obj6;
                m641 m641Var = (m641) obj5;
                jx6 jx6Var = (jx6) obj4;
                j641 j641Var = (j641) obj3;
                x5s0 x5s0Var = (x5s0) obj2;
                Transport transport = (Transport) obj;
                RequestPointType requestPointType = RequestPointType.WAYPOINT;
                RequestPoint o4 = k.o((Point) obj7, requestPointType, null);
                if (o4 != null && (o = k.o(point, requestPointType, null)) != null) {
                    m641Var.b = transport.createPedestrianRouter().requestRoutes(scc.c(o4, o), new TimeOptions(null, null), new RouteOptions(new FitnessOptions(), false), new l641(jx6Var, m641Var, j641Var, x5s0Var));
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ at5(aia0 aia0Var, SbpPollingStrategy sbpPollingStrategy, String str, yj70 yj70Var, oy80 oy80Var, String str2) {
        this.a = 10;
        this.b = aia0Var;
        this.c = sbpPollingStrategy;
        this.x = str;
        this.w = yj70Var;
        this.z = oy80Var;
        this.y = str2;
    }

    public /* synthetic */ at5(MapAddressData mapAddressData, List list, String str, String str2, String str3, shf shfVar) {
        this.a = 2;
        this.b = mapAddressData;
        this.c = list;
        this.x = str;
        this.w = str2;
        this.y = str3;
        this.z = shfVar;
    }

    public /* synthetic */ at5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
    }
}
