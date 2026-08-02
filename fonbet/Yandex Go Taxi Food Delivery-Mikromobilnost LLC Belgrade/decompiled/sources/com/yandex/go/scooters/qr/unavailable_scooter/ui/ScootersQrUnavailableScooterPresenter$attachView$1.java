package com.yandex.go.scooters.qr.unavailable_scooter.ui;

import com.yandex.go.scooters.qr.unavailable_scooter.analytics.ScootersQrUnavailableScooterAnalytics$State;
import defpackage.cro0;
import defpackage.dro0;
import defpackage.jl40;
import defpackage.lx4;
import defpackage.rqo0;
import defpackage.s6k0;
import defpackage.wls;
import defpackage.zqo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersQrUnavailableScooterPresenter$attachView$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        dro0 dro0Var = (dro0) obj;
        zqo0 zqo0Var = (zqo0) this.receiver;
        if (dro0Var instanceof cro0) {
            s6k0 s6k0Var = zqo0Var.x;
            cro0 cro0Var = (cro0) dro0Var;
            ScootersQrUnavailableScooterAnalytics$State scootersQrUnavailableScooterAnalytics$State = cro0Var.b.contains(rqo0.a) ? ScootersQrUnavailableScooterAnalytics$State.FALLBACK : ScootersQrUnavailableScooterAnalytics$State.NEAREST_SCOOTER;
            String str = cro0Var.a;
            if (((ScootersQrUnavailableScooterAnalytics$State) s6k0Var.c) != scootersQrUnavailableScooterAnalytics$State || !jl40.l((String) s6k0Var.b, str)) {
                s6k0Var.c = scootersQrUnavailableScooterAnalytics$State;
                s6k0Var.b = str;
                i d = ((j) ((lx4) s6k0Var.a)).d("ScootersQrAlert.Shown");
                d.a.put(ClidProvider.STATE, scootersQrUnavailableScooterAnalytics$State.getAnalyticsName());
                if (str != null) {
                    d.d("open_reason", str);
                }
                d.m();
            }
        } else {
            zqo0Var.getClass();
        }
        return zy11.a;
    }
}
