package com.yandex.go.chargers.qr.data.model;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/qr/data/model/ChargersStationSearchParams;", "", "Companion", "$serializer", "com/yandex/go/chargers/qr/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationSearchParams {
    public static final a Companion = new a();
    public final String a;
    public final zzs b;
    public final zzs c;

    public /* synthetic */ ChargersStationSearchParams(int i, String str, zzs zzsVar, zzs zzsVar2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ChargersStationSearchParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar2;
        }
    }

    public ChargersStationSearchParams(String str, zzs zzsVar, zzs zzsVar2) {
        this.a = str;
        this.b = zzsVar;
        this.c = zzsVar2;
    }
}
