package com.yandex.go.chargers.station.data;

import com.yandex.go.chargers.station.data.e;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.i3y;
import defpackage.sls;
import defpackage.wls;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

/* loaded from: classes12.dex */
public final class e {
    public final dne0 a;
    public final i3y b;
    public final i3y c;

    public e(dne0 dne0Var) {
        this.a = dne0Var;
        final int i = 0;
        this.b = kotlin.a.a(new sls(this) { // from class: osa
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                e eVar = this.b;
                switch (i2) {
                    case 0:
                        return eVar.a.a("rare_station_counter_prefs");
                    default:
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        i3y i3yVar = eVar.b;
                        for (String str : ((cne0) i3yVar.getValue()).e()) {
                            concurrentHashMap.put(str, Integer.valueOf(((cne0) i3yVar.getValue()).i(str, 0)));
                        }
                        return concurrentHashMap;
                }
            }
        });
        final int i2 = 1;
        this.c = kotlin.a.a(new sls(this) { // from class: osa
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        return eVar.a.a("rare_station_counter_prefs");
                    default:
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        i3y i3yVar = eVar.b;
                        for (String str : ((cne0) i3yVar.getValue()).e()) {
                            concurrentHashMap.put(str, Integer.valueOf(((cne0) i3yVar.getValue()).i(str, 0)));
                        }
                        return concurrentHashMap;
                }
            }
        });
    }

    public final void a(String str) {
        i3y i3yVar = this.c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i3yVar.getValue();
        ChargersStationInfoPopupRepository$incrementShownCountFor$1 chargersStationInfoPopupRepository$incrementShownCountFor$1 = ChargersStationInfoPopupRepository$incrementShownCountFor$1.b;
        concurrentHashMap.merge(str, 1, new BiFunction() { // from class: com.yandex.go.chargers.station.data.d
            public final /* synthetic */ wls a = ChargersStationInfoPopupRepository$incrementShownCountFor$1.b;

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (Integer) this.a.invoke(obj, obj2);
            }
        });
        cne0 cne0Var = (cne0) this.b.getValue();
        Integer num = (Integer) ((ConcurrentHashMap) i3yVar.getValue()).get(str);
        cne0Var.p(num != null ? num.intValue() : 1, str);
    }
}
