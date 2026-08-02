package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CheckInZone;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/w", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CheckInZone {
    public static final w Companion = new w();
    public final zzs a;
    public final String b;

    public /* synthetic */ CheckInZone(int i, zzs zzsVar, String str) {
        if ((i & 1) == 0) {
            this.a = new zzs(0.0d, 0.0d, 0, null, null, 28);
        } else {
            this.a = zzsVar;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public CheckInZone() {
        this.a = new zzs(0.0d, 0.0d, 0, null, null, 28);
        this.b = "";
    }
}
