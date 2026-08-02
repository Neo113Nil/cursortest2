package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersParkingPanoramaTappedButtonName;
import com.yandex.go.scooters.discovery.ScootersDiscoveryModalView;
import com.yandex.go.scooters.discovery.m;
import com.yandex.go.scooters.insurance.f;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceCompletion;
import com.yandex.go.scooters.offers.v2.components.scooters.ScootersListComponent;
import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.scooters.parking.api.ParkingCardOpenReason;
import com.yandex.go.scooters.parking.b;
import com.yandex.go.scooters.passes.c;
import com.yandex.go.scooters.passes.model.ScootersPassesPendingPurchaseStatus$PackageType;
import com.yandex.go.scooters.passes.purchased.ScootersPurchasedPassStatusModalView;
import com.yandex.go.scooters.preselection.loading.v2.ScootersPreselectionLoadingV2ModalView;
import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;
import com.yandex.go.scooters.qr.preview.ScootersPreviewView;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;
import defpackage.tls;
import java.util.HashMap;
import kotlin.Result;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.presentation.detailed_order.e;
import ru.yandex.taxi.scooters.presentation.personal_goals.a;
import ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationAnalytics$OpenReason;

/* loaded from: classes13.dex */
public final /* synthetic */ class iin0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iin0(deo0 deo0Var, s7a0 s7a0Var) {
        this.a = 16;
        this.b = s7a0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onAttachedToWindow$lambda$0;
        zy11 onAttachedToWindow$lambda$02;
        ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason;
        ScootersAnalytics$ScootersParkingPanoramaTappedButtonName scootersAnalytics$ScootersParkingPanoramaTappedButtonName;
        zy11 insetsType$lambda$0;
        zy11 _init_$lambda$0;
        zy11 insetsType$lambda$02;
        int i = this.a;
        int i2 = 9;
        int i3 = 23;
        int i4 = 17;
        int i5 = 27;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                onAttachedToWindow$lambda$0 = ScootersDiscoveryModalView.onAttachedToWindow$lambda$0((ScootersDiscoveryModalView) obj2, (View) obj);
                break;
            case 1:
                m mVar = (m) obj2;
                mVar.A((m950) mVar.e0.get(), new z7n0((String) obj, true), new v6n0(mVar.D, i6));
                break;
            case 2:
                String str = (String) obj;
                iin0 iin0Var = ((vin0) obj2).t;
                if (iin0Var != null) {
                    iin0Var.invoke(str);
                    break;
                }
                break;
            case 3:
                ((ii3) obj2).r(new dcc0((String) obj, i5));
                break;
            case 4:
                bsn0 bsn0Var = (bsn0) obj2;
                if (!jl40.l((csn0) obj, csn0.a)) {
                    w511.b();
                    break;
                } else {
                    bsn0Var.r(new vkn0(11));
                    break;
                }
            case 5:
                f fVar = (f) obj2;
                int i9 = ttn0.a[((ScootersInsuranceCompletion) obj).ordinal()];
                if (i9 == 1) {
                    fVar.r(new vkn0(16));
                } else if (i9 == 2) {
                    fVar.r(new vkn0(i4));
                } else if (i9 != 3) {
                    w511.b();
                    break;
                } else {
                    fVar.r(new vkn0(18));
                }
                break;
            case 6:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj2;
                uid uidVar = new uid(i6, (tls) obj);
                viewTreeObserver.addOnPreDrawListener(uidVar);
                break;
            case 7:
                onAttachedToWindow$lambda$02 = ScootersListComponent.onAttachedToWindow$lambda$0((ScootersListComponent) obj2, (bpm0) obj);
                break;
            case 8:
                break;
            case 9:
                ((d5o0) obj2).invoke();
                break;
            case 10:
                ((d5o0) obj2).invoke();
                break;
            case 11:
                break;
            case 12:
                b bVar = (b) obj2;
                ybo0 ybo0Var = (ybo0) obj;
                ndl0 ndl0Var = (ndl0) bVar.J.b;
                if (!(ybo0Var instanceof wbo0)) {
                    if (!(ybo0Var instanceof xbo0)) {
                        w511.b();
                        break;
                    } else {
                        xbo0 xbo0Var = (xbo0) ybo0Var;
                        ParkingCardOpenReason parkingCardOpenReason = xbo0Var.b;
                        boolean z = xbo0Var.a;
                        qxm0 qxm0Var = (qxm0) ndl0Var.b;
                        int i10 = lbo0.a[parkingCardOpenReason.ordinal()];
                        if (i10 == 1) {
                            scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason = ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason.OfferCard;
                        } else if (i10 == 2) {
                            scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason = ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason.MapOnOrder;
                        } else if (i10 == 3) {
                            scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason = ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason.MapOnPreorder;
                        } else if (i10 != 4) {
                            w511.b();
                            break;
                        } else {
                            scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason = ScootersAnalytics$ScootersParkingPanoramaOpenedOpenReason.CameraOnCompletion;
                        }
                        HashMap p = tse0.p(qxm0Var);
                        p.put("open_reason", scootersAnalytics$ScootersParkingPanoramaOpenedOpenReason.getEventValue());
                        p.put("is_panorama_available", Boolean.valueOf(z));
                        qxm0Var.a.a("Scooters.ParkingPanorama.Opened", p, 1, new HashMap());
                    }
                } else {
                    ParkingButtonAction parkingButtonAction = ((wbo0) ybo0Var).a;
                    qxm0 qxm0Var2 = (qxm0) ndl0Var.b;
                    int i11 = lbo0.b[parkingButtonAction.ordinal()];
                    if (i11 == 1) {
                        scootersAnalytics$ScootersParkingPanoramaTappedButtonName = ScootersAnalytics$ScootersParkingPanoramaTappedButtonName.BuildRoute;
                    } else if (i11 != 2) {
                        w511.b();
                        break;
                    } else {
                        scootersAnalytics$ScootersParkingPanoramaTappedButtonName = ScootersAnalytics$ScootersParkingPanoramaTappedButtonName.Done;
                    }
                    HashMap p2 = tse0.p(qxm0Var2);
                    p2.put("button_name", scootersAnalytics$ScootersParkingPanoramaTappedButtonName.getEventValue());
                    qxm0Var2.a.a("Scooters.ParkingPanorama.Tapped", p2, 1, new HashMap());
                    bVar.r(new pzn0(i4));
                }
                break;
            case 13:
                pz40 pz40Var = (pz40) obj2;
                if (((MotionEvent) obj).getAction() == 0) {
                    r0 r0Var = (r0) pz40Var;
                    if (((Boolean) r0Var.getValue()).booleanValue()) {
                        r0Var.m(null, Boolean.FALSE);
                    }
                }
                break;
            case 14:
                ufo0 ufo0Var = (ufo0) obj2;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    ((com.yandex.go.scooters.passes.data.b) ufo0Var).a();
                }
                r0 r0Var2 = ((com.yandex.go.scooters.passes.data.b) ufo0Var).b;
                r0Var2.getClass();
                r0Var2.m(null, yeo0.a);
                break;
            case 15:
                ((c) obj2).K.b((m6a0) obj);
                break;
            case 16:
                s7a0 s7a0Var = (s7a0) obj2;
                r5x a = deo0.a("payment_method_state", "id");
                j5x M = jx81.M(s7a0Var.a);
                s6x s6xVar = deo0.b;
                break;
            case 17:
                ((zio0) obj).a.V(((ojo0) ((pjo0) obj2)).a);
                break;
            case 18:
                uv6 uv6Var = (uv6) obj2;
                pjo0 pjo0Var = (pjo0) obj;
                if (!jl40.l(pjo0Var, njo0.a)) {
                    if (!(pjo0Var instanceof ojo0)) {
                        if (!jl40.l(pjo0Var, njo0.b)) {
                            w511.b();
                            break;
                        } else {
                            uv6Var.r(new pzn0(i3));
                        }
                    } else {
                        uv6Var.r(new iin0(i4, pjo0Var));
                    }
                } else {
                    uv6Var.r(new qu(i2));
                }
                break;
            case 19:
                insetsType$lambda$0 = ScootersPreselectionLoadingV2ModalView.insetsType$lambda$0((ScootersPreselectionLoadingV2ModalView) obj2, (t1w) obj);
                break;
            case 20:
                ((ra9) obj2).r(new yux(i8, (Throwable) obj));
                break;
            case 21:
                _init_$lambda$0 = ScootersPreviewView._init_$lambda$0((ScootersPreviewView) obj2, (r7p0) obj);
                break;
            case 22:
                insetsType$lambda$02 = ScootersPurchasedPassStatusModalView.insetsType$lambda$0((ScootersPurchasedPassStatusModalView) obj2, (t1w) obj);
                break;
            case 23:
                krl0 krl0Var = (krl0) obj2;
                final tls tlsVar = (tls) obj;
                SensorManager sensorManager = (SensorManager) krl0Var.a;
                Sensor defaultSensor = sensorManager.getDefaultSensor(5);
                if (defaultSensor != null) {
                    SensorEventListener sensorEventListener = new SensorEventListener() { // from class: com.yandex.go.scooters.qr.domain.ScootersQrDarknessInteractor$isDarkFlow$1$listener$1
                        @Override // android.hardware.SensorEventListener
                        public void onAccuracyChanged(Sensor sensor, int accuracy) {
                        }

                        @Override // android.hardware.SensorEventListener
                        public void onSensorChanged(SensorEvent event) {
                            tls.this.invoke(Boolean.valueOf(event.values[0] < 15.0f));
                        }
                    };
                    sensorManager.registerListener(sensorEventListener, defaultSensor, 2);
                    break;
                } else {
                    jst.e.n("No light sensor");
                    tlsVar.invoke(Boolean.FALSE);
                    break;
                }
            case 24:
                cjm0 cjm0Var = (cjm0) obj2;
                final tls tlsVar2 = (tls) obj;
                SensorManager sensorManager2 = (SensorManager) cjm0Var.b;
                final Sensor defaultSensor2 = sensorManager2.getDefaultSensor(8);
                if (defaultSensor2 != null) {
                    final boolean z2 = defaultSensor2.getMaximumRange() <= 5.0f;
                    SensorEventListener sensorEventListener2 = new SensorEventListener() { // from class: com.yandex.go.scooters.qr.domain.ScootersQrProximityTooCloseInteractor$isTooCloseFlow$1$listener$1
                        @Override // android.hardware.SensorEventListener
                        public void onAccuracyChanged(Sensor sensor, int accuracy) {
                        }

                        @Override // android.hardware.SensorEventListener
                        public void onSensorChanged(SensorEvent event) {
                            boolean z3 = false;
                            float f = event.values[0];
                            if (!z2 ? f < 1.5f : f < defaultSensor2.getMaximumRange()) {
                                z3 = true;
                            }
                            tlsVar2.invoke(Boolean.valueOf(z3));
                        }
                    };
                    sensorManager2.registerListener(sensorEventListener2, defaultSensor2, 2);
                    break;
                } else {
                    jst.e.n("No proximity sensor");
                    tlsVar2.invoke(Boolean.FALSE);
                    break;
                }
            case 25:
                ((wpo0) obj).a.r(new vam0(i5, (r7p0) obj2, ScootersQrNumberResultSource.UNAVAILABLE_SCOOTER));
                break;
            case 26:
                a aVar = (a) obj2;
                String str2 = (String) obj;
                aVar.r(new qu(i2));
                if (str2 != null) {
                    String str3 = evu0.J(str2) ? null : str2;
                    if (str3 != null) {
                        ((a60) ((y50) aVar.G.get())).c(str3, v770.x);
                        break;
                    }
                }
                break;
            case 27:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = new g92(i7, zy11Var);
                agd agdVar = (agd) yfdVar;
                agdVar.e = av0.J;
                agdVar.g = new androidx.compose.runtime.internal.a(-1103041403, new alb0(i3, (ru.yandex.taxi.scooters.presentation.notification.a) obj2), true);
                break;
            case 28:
                ((yto0) obj2).B = (NavigationLayer) obj;
                break;
            default:
                ogn0 ogn0Var = (ogn0) obj;
                zzs zzsVar = ((r0o0) obj2).c;
                e eVar = ogn0Var.a;
                eVar.U = null;
                eVar.R().a(new kwo0(zzsVar, ScootersRouteNavigationAnalytics$OpenReason.SELECT_ON_MAP, ogn0Var.b.a, null));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ iin0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ iin0(ufo0 ufo0Var, ScootersPassesPendingPurchaseStatus$PackageType scootersPassesPendingPurchaseStatus$PackageType) {
        this.a = 14;
        this.b = ufo0Var;
    }
}
