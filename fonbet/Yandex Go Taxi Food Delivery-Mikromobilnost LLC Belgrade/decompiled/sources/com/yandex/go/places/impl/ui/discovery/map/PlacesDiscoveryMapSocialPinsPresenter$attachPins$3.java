package com.yandex.go.places.impl.ui.discovery.map;

import defpackage.c5t0;
import defpackage.d5t0;
import defpackage.e2c0;
import defpackage.e5t0;
import defpackage.f5t0;
import defpackage.fva0;
import defpackage.g5t0;
import defpackage.h5t0;
import defpackage.i5t0;
import defpackage.in00;
import defpackage.j5t0;
import defpackage.jl40;
import defpackage.kn00;
import defpackage.oyr;
import defpackage.qfc0;
import defpackage.tls;
import defpackage.tzb0;
import defpackage.w511;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PlacesDiscoveryMapSocialPinsPresenter$attachPins$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object obj2;
        Long l;
        j5t0 j5t0Var = (j5t0) obj;
        d dVar = (d) this.receiver;
        e2c0 e2c0Var = dVar.b0;
        e2c0 e2c0Var2 = dVar.b0;
        if (j5t0Var instanceof e5t0) {
            e2c0Var.b(((e5t0) j5t0Var).a);
        } else if (j5t0Var instanceof i5t0) {
            qfc0 qfc0Var = dVar.a0;
            i5t0 i5t0Var = (i5t0) j5t0Var;
            List list = i5t0Var.a;
            int i = qfc0Var.b;
            PerformanceAnalytics$Type performanceAnalytics$Type = qfc0Var.e;
            fva0 fva0Var = qfc0Var.a;
            if (i < 10) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((kn00) obj2).getId(), qfc0Var.d)) {
                        break;
                    }
                }
                if (obj2 != null && (l = qfc0Var.c) != null) {
                    long longValue = l.longValue();
                    String i2 = oyr.i(qfc0Var.b, "Places.PinWar.Pins.Prepared.");
                    fva0Var.e(i2, performanceAnalytics$Type, longValue);
                    fva0.b(fva0Var, i2, performanceAnalytics$Type, null, 4);
                    qfc0Var.d = null;
                    qfc0Var.c = null;
                    qfc0Var.b++;
                }
            }
            e2c0Var.c(list, i5t0Var.b);
        } else if (j5t0Var instanceof f5t0) {
            ru.yandex.yandexmaps.multiplatform.pin.war.c cVar = e2c0Var.a;
            if (cVar != null) {
                cVar.l(Collections.singletonList(e2c0Var.b.a(((f5t0) j5t0Var).a)));
            }
        } else if (jl40.l(j5t0Var, c5t0.a)) {
            ru.yandex.yandexmaps.multiplatform.pin.war.c cVar2 = e2c0Var2.a;
            if (cVar2 != null) {
                cVar2.o();
            }
            tzb0 tzb0Var = e2c0Var2.b;
            tzb0Var.a.clear();
            tzb0Var.b.clear();
            dVar.c0 = null;
            dVar.d0 = null;
        } else if (jl40.l(j5t0Var, d5t0.a)) {
            ru.yandex.yandexmaps.multiplatform.pin.war.c cVar3 = e2c0Var2.a;
            if (cVar3 != null) {
                cVar3.g();
            }
        } else if (jl40.l(j5t0Var, h5t0.a)) {
            ru.yandex.yandexmaps.multiplatform.pin.war.c cVar4 = e2c0Var2.a;
            if (cVar4 != null) {
                cVar4.q();
            }
        } else {
            if (!(j5t0Var instanceof g5t0)) {
                w511.b();
                return null;
            }
            g5t0 g5t0Var = (g5t0) j5t0Var;
            in00 in00Var = g5t0Var.a;
            if (in00Var == null) {
                dVar.Ng(null);
                dVar.c0 = null;
                ru.yandex.yandexmaps.multiplatform.pin.war.c cVar5 = e2c0Var.a;
                if (cVar5 != null) {
                    cVar5.d();
                }
            } else if (jl40.l(in00Var.getId(), dVar.c0)) {
                ru.yandex.yandexmaps.multiplatform.pin.war.c cVar6 = e2c0Var.a;
                if (cVar6 != null) {
                    cVar6.p(e2c0Var.b.a(in00Var));
                }
            } else {
                dVar.c0 = in00Var.getId();
                ru.yandex.yandexmaps.multiplatform.pin.war.c cVar7 = e2c0Var.a;
                tzb0 tzb0Var2 = e2c0Var.b;
                if (cVar7 != null) {
                    cVar7.d();
                    dVar.Ng(in00Var.getId());
                    if (g5t0Var.b) {
                        cVar7.g();
                        ru.yandex.yandexmaps.multiplatform.pin.war.b.b(cVar7, Collections.singletonList(tzb0Var2.b(in00Var)));
                        dVar.d0 = in00Var;
                    } else {
                        dVar.d0 = null;
                    }
                    cVar7.p(tzb0Var2.a(in00Var));
                    cVar7.q();
                }
            }
        }
        return zy11.a;
    }
}
