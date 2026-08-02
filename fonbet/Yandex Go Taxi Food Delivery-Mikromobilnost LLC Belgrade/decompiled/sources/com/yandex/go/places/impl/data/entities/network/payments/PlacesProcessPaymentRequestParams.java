package com.yandex.go.places.impl.data.entities.network.payments;

import defpackage.gsq0;
import defpackage.qje;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/payments/PlacesProcessPaymentRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/payments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesProcessPaymentRequestParams {
    public static final c Companion = new c();
    public final String a;
    public final zzs b;
    public final PlacesProcessPaymentMethod c;

    public /* synthetic */ PlacesProcessPaymentRequestParams(int i, String str, zzs zzsVar, PlacesProcessPaymentMethod placesProcessPaymentMethod) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, PlacesProcessPaymentRequestParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zzsVar;
        this.c = placesProcessPaymentMethod;
    }

    public PlacesProcessPaymentRequestParams(String str, zzs zzsVar, PlacesProcessPaymentMethod placesProcessPaymentMethod) {
        this.a = str;
        this.b = zzsVar;
        this.c = placesProcessPaymentMethod;
    }
}
