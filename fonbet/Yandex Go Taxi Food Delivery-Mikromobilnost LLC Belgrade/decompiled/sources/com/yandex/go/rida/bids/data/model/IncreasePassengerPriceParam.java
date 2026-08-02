package com.yandex.go.rida.bids.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/rida/bids/data/model/IncreasePassengerPriceParam;", "", "Companion", "$serializer", "com/yandex/go/rida/bids/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IncreasePassengerPriceParam {
    public static final c Companion = new c();
    public final int a;
    public final String b;
    public final String c;

    public /* synthetic */ IncreasePassengerPriceParam(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, IncreasePassengerPriceParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = str2;
    }

    public IncreasePassengerPriceParam(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
