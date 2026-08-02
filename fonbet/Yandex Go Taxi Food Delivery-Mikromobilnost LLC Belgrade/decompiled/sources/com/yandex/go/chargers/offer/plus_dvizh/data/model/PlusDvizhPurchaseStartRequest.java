package com.yandex.go.chargers.offer.plus_dvizh.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/plus_dvizh/data/model/PlusDvizhPurchaseStartRequest;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/plus_dvizh/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlusDvizhPurchaseStartRequest {
    public static final a Companion = new a();
    public final kotlinx.serialization.json.b a;
    public final String b;
    public final String c;

    public /* synthetic */ PlusDvizhPurchaseStartRequest(int i, String str, String str2, kotlinx.serialization.json.b bVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, PlusDvizhPurchaseStartRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = bVar;
        this.b = str;
        this.c = str2;
    }

    public PlusDvizhPurchaseStartRequest(String str, String str2, kotlinx.serialization.json.b bVar) {
        this.a = bVar;
        this.b = str;
        this.c = str2;
    }
}
