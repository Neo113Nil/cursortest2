package com.yandex.go.scooters.zones.legend.domain;

import com.yandex.go.scooters.zones.data.model.ScootersPolygonInfoResponse;
import com.yandex.go.scooters.zones.data.model.ScootersPolygonLegend;
import defpackage.jst;
import defpackage.ny61;
import defpackage.rap0;
import defpackage.sap0;
import defpackage.tap0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1 scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1;
        int i;
        tap0 tap0Var;
        ?? r9;
        if (continuation instanceof ScootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1) {
            scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1 = (ScootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1) continuation;
            int i2 = scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ScootersPolygonInfoResponse scootersPolygonInfoResponse = (ScootersPolygonInfoResponse) obj;
                    if (scootersPolygonInfoResponse != null) {
                        this.b.b.getClass();
                        ScootersPolygonLegend scootersPolygonLegend = scootersPolygonInfoResponse.b;
                        List list = scootersPolygonLegend.c;
                        if (list == null || list.isEmpty()) {
                            jst.e.getClass();
                        }
                        FormattedText formattedText = scootersPolygonLegend.a;
                        FormattedText formattedText2 = scootersPolygonLegend.b;
                        List list2 = scootersPolygonLegend.c;
                        if (list2 != null) {
                            List<ScootersPolygonLegend.PolygonLegendInfoItem> list3 = list2;
                            r9 = new ArrayList(tcc.n(list3, 10));
                            for (ScootersPolygonLegend.PolygonLegendInfoItem polygonLegendInfoItem : list3) {
                                FormattedText formattedText3 = polygonLegendInfoItem.b;
                                ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle iconStyle = polygonLegendInfoItem.a;
                                String str = iconStyle.a;
                                String str2 = iconStyle.b;
                                Integer num = iconStyle.c;
                                Float f = iconStyle.d;
                                ScootersPolygonLegend.PolygonLegendInfoItem.IconStyle.FillParams fillParams = iconStyle.e;
                                r9.add(new sap0(formattedText3, new rap0(str, str2, num, f, fillParams.a, fillParams.b)));
                            }
                        } else {
                            r9 = 0;
                        }
                        if (r9 == 0) {
                            r9 = EmptyList.a;
                        }
                        tap0Var = new tap0(formattedText, formattedText2, r9, scootersPolygonLegend.d);
                    } else {
                        tap0Var = null;
                    }
                    scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.L$0 = null;
                    scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.L$1 = null;
                    scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.L$2 = null;
                    scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.L$3 = null;
                    scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(tap0Var, scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1 = new ScootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersZonesLegendScreenInteractor$legendScreenFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
