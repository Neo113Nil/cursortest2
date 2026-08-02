package com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan;

import android.graphics.Rect;
import android.net.Uri;
import com.yandex.go.masstransit.sdk.ble.api.qrscan.analytics.QrScanButtonAction;
import com.yandex.go.masstransit.sdk.ble.api.qrscan.config.QrScannerConfig$QrTarget;
import defpackage.a60;
import defpackage.aeg0;
import defpackage.afg0;
import defpackage.ay21;
import defpackage.beg0;
import defpackage.bfg0;
import defpackage.cbg0;
import defpackage.ceg0;
import defpackage.cfg0;
import defpackage.deg0;
import defpackage.dfg0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.leg0;
import defpackage.meg0;
import defpackage.ny61;
import defpackage.o370;
import defpackage.peg0;
import defpackage.qu;
import defpackage.sdg0;
import defpackage.sue0;
import defpackage.tcc;
import defpackage.tdg0;
import defpackage.teg0;
import defpackage.udg0;
import defpackage.ueg0;
import defpackage.v7j0;
import defpackage.vdg0;
import defpackage.veg0;
import defpackage.vqy;
import defpackage.w511;
import defpackage.wdg0;
import defpackage.xdg0;
import defpackage.y50;
import defpackage.ydg0;
import defpackage.yeg0;
import defpackage.zdg0;
import defpackage.zeg0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.TransportQrScannerExperiment;

/* loaded from: classes12.dex */
public final class a {
    public final zeg0 a;
    public final sue0 b;
    public final o370 c;
    public final o370 d;
    public final deg0 e;
    public boolean f;
    public long g;

    public a(zeg0 zeg0Var, sue0 sue0Var, o370 o370Var, o370 o370Var2, deg0 deg0Var) {
        this.a = zeg0Var;
        this.b = sue0Var;
        this.c = o370Var;
        this.d = o370Var2;
        this.e = deg0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ceg0 ceg0Var, peg0 peg0Var) {
        Object value;
        Object value2;
        Object value3;
        Object obj;
        Object value4;
        String scheme;
        String host;
        Object obj2;
        QrScannerConfig$QrTarget qrScannerConfig$QrTarget;
        Object value5;
        zeg0 zeg0Var = this.a;
        r0 r0Var = zeg0Var.a;
        boolean l = jl40.l(ceg0Var, sdg0.a);
        deg0 deg0Var = this.e;
        if (l) {
            deg0Var.b(QrScanButtonAction.Close);
            peg0Var.a.r(new qu(9));
            return;
        }
        if (jl40.l(ceg0Var, ydg0.a)) {
            deg0Var.b(QrScanButtonAction.OpenSettings);
            ((a60) ((y50) this.d.a)).d();
            return;
        }
        if (jl40.l(ceg0Var, aeg0.a)) {
            if (((com.yandex.go.permission.b) ((v7j0) this.c.a)).a(3)) {
                zeg0Var.b();
                return;
            }
            return;
        }
        if (jl40.l(ceg0Var, beg0.a)) {
            do {
                value5 = r0Var.getValue();
            } while (!r0Var.k(value5, yeg0.a((yeg0) value5, null, null, !r1.c, 3)));
            return;
        }
        int i = 10;
        if (!(ceg0Var instanceof zdg0)) {
            if (jl40.l(ceg0Var, xdg0.a)) {
                do {
                    value3 = r0Var.getValue();
                } while (!r0Var.k(value3, yeg0.a((yeg0) value3, teg0.a, "", false, 4)));
                return;
            }
            if (jl40.l(ceg0Var, tdg0.a)) {
                zeg0Var.b();
                return;
            }
            if (ceg0Var instanceof vdg0) {
                String str = ((vdg0) ceg0Var).a;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, yeg0.a((yeg0) value2, null, str, false, 5)));
                return;
            } else if (jl40.l(ceg0Var, udg0.a)) {
                String str2 = ((yeg0) zeg0Var.b.a.getValue()).b;
                peg0Var.a.r(new cbg0(i));
                return;
            } else if (!jl40.l(ceg0Var, wdg0.a)) {
                w511.b();
                return;
            } else {
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, yeg0.a((yeg0) value, null, null, false, 3)));
                return;
            }
        }
        zdg0 zdg0Var = (zdg0) ceg0Var;
        leg0 leg0Var = leg0.a;
        if (this.f) {
            return;
        }
        Uri uri = zdg0Var.a;
        try {
            scheme = uri.getScheme();
        } catch (Exception unused) {
        }
        if (scheme != null && scheme.length() != 0 && (host = uri.getHost()) != null) {
            if (host.length() != 0) {
                dfg0 dfg0Var = (dfg0) ((bfg0) this.b.b);
                List<TransportQrScannerExperiment.a> list = ((TransportQrScannerExperiment) dfg0Var.a.a.b()).b;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (TransportQrScannerExperiment.a aVar : list) {
                    arrayList.add(new ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.a(aVar.b, aVar.a));
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.a aVar2 = (ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.a) it.next();
                    List list2 = aVar2.a;
                    TransportQrScannerExperiment.QrTarget qrTarget = aVar2.b;
                    if (qrTarget == null) {
                        qrScannerConfig$QrTarget = null;
                    } else {
                        if (cfg0.a[qrTarget.ordinal()] != 1) {
                            w511.b();
                            return;
                        }
                        qrScannerConfig$QrTarget = QrScannerConfig$QrTarget.TRANSPORT_PAYMENT;
                    }
                    arrayList2.add(new afg0(list2, qrScannerConfig$QrTarget));
                }
                ArrayList o0 = kotlin.collections.a.o0(arrayList2, dfg0Var.b);
                String host2 = uri.getHost();
                Iterator it2 = o0.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (kotlin.collections.a.G(((afg0) obj2).a, host2)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                afg0 afg0Var = (afg0) obj2;
                QrScannerConfig$QrTarget qrScannerConfig$QrTarget2 = afg0Var != null ? afg0Var.b : null;
                String queryParameter = uri.getQueryParameter("utm_source");
                String queryParameter2 = uri.getQueryParameter("utm_medium");
                ay21 ay21Var = ((queryParameter == null || evu0.J(queryParameter)) && (queryParameter2 == null || evu0.J(queryParameter2))) ? ay21.c : new ay21(queryParameter, queryParameter2);
                if (qrScannerConfig$QrTarget2 == QrScannerConfig$QrTarget.TRANSPORT_PAYMENT) {
                    obj = new meg0(null, uri.toString(), ay21Var, uri.toString());
                } else {
                    String queryParameter3 = uri.getQueryParameter("vehicle_id");
                    if (queryParameter3 != null) {
                        obj = new meg0(queryParameter3, null, ay21Var, uri.toString());
                    }
                }
                if (!obj.equals(leg0Var)) {
                    this.f = false;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.g >= 5000) {
                        this.g = currentTimeMillis;
                        deg0Var.c();
                    }
                    zeg0Var.b();
                    return;
                }
                if (!(obj instanceof meg0)) {
                    w511.b();
                    return;
                }
                this.f = true;
                Rect rect = zdg0Var.b;
                do {
                    value4 = r0Var.getValue();
                } while (!r0Var.k(value4, yeg0.a((yeg0) value4, new ueg0(rect), null, false, 6)));
                meg0 meg0Var = (meg0) obj;
                peg0Var.a.r(new vqy(meg0Var.a, meg0Var.b, meg0Var.c, meg0Var.d, 22));
                return;
            }
        }
        obj = leg0Var;
        if (!obj.equals(leg0Var)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        QrScanActionInteractor$requestCameraPermission$1 qrScanActionInteractor$requestCameraPermission$1;
        Object obj;
        int i;
        Object value;
        if (continuationImpl instanceof QrScanActionInteractor$requestCameraPermission$1) {
            qrScanActionInteractor$requestCameraPermission$1 = (QrScanActionInteractor$requestCameraPermission$1) continuationImpl;
            int i2 = qrScanActionInteractor$requestCameraPermission$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrScanActionInteractor$requestCameraPermission$1.label = i2 - Integer.MIN_VALUE;
                obj = qrScanActionInteractor$requestCameraPermission$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrScanActionInteractor$requestCameraPermission$1.label;
                zeg0 zeg0Var = this.a;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o370 o370Var = this.c;
                    if (((com.yandex.go.permission.b) ((v7j0) o370Var.a)).a(3)) {
                        zeg0Var.b();
                        return zy11Var;
                    }
                    qrScanActionInteractor$requestCameraPermission$1.label = 1;
                    obj = ((com.yandex.go.permission.b) ((v7j0) o370Var.a)).d(3, qrScanActionInteractor$requestCameraPermission$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    zeg0Var.b();
                    return zy11Var;
                }
                r0 r0Var = zeg0Var.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, yeg0.a((yeg0) value, veg0.a, null, false, 6)));
                return zy11Var;
            }
        }
        qrScanActionInteractor$requestCameraPermission$1 = new QrScanActionInteractor$requestCameraPermission$1(this, continuationImpl);
        obj = qrScanActionInteractor$requestCameraPermission$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrScanActionInteractor$requestCameraPermission$1.label;
        zeg0 zeg0Var2 = this.a;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
