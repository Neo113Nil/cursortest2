package com.yandex.go.scooters.zones.info.domain;

import com.yandex.go.scooters.zones.data.model.ScootersPolygonInfo;
import com.yandex.go.scooters.zones.data.model.ScootersPolygonInfoResponse;
import defpackage.i9p0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.x9p0;
import defpackage.y9p0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1 scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1;
        int i;
        x9p0 x9p0Var;
        ArrayList arrayList;
        if (continuation instanceof ScootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1) {
            scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1 = (ScootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1) continuation;
            int i2 = scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ScootersPolygonInfoResponse scootersPolygonInfoResponse = (ScootersPolygonInfoResponse) obj;
                    if (scootersPolygonInfoResponse != null) {
                        y9p0 y9p0Var = this.b.a;
                        ScootersPolygonInfo scootersPolygonInfo = scootersPolygonInfoResponse.a;
                        y9p0Var.getClass();
                        FormattedText formattedText = scootersPolygonInfo.b;
                        FormattedText formattedText2 = scootersPolygonInfo.c;
                        String str = scootersPolygonInfo.a;
                        List list = scootersPolygonInfo.d;
                        if (list != null) {
                            List<ScootersPolygonInfo.PolygonInfoItem> list2 = list;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                            for (ScootersPolygonInfo.PolygonInfoItem polygonInfoItem : list2) {
                                arrayList2.add(new i9p0(polygonInfoItem.a, polygonInfoItem.b));
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        ScootersPolygonInfo.PolygonInfoLegendItem polygonInfoLegendItem = scootersPolygonInfo.e;
                        x9p0Var = new x9p0(formattedText, formattedText2, str, arrayList, polygonInfoLegendItem != null ? polygonInfoLegendItem.a : null, polygonInfoLegendItem != null ? polygonInfoLegendItem.b : null, scootersPolygonInfo.f);
                    } else {
                        x9p0Var = null;
                    }
                    scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.L$0 = null;
                    scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.L$1 = null;
                    scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.L$2 = null;
                    scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.L$3 = null;
                    scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(x9p0Var, scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1 = new ScootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersZonesInfoScreenInteractor$infoScreenFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
