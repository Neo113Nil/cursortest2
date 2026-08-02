package com.yandex.go.scooters.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.vnm0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.scooters.data.model.CreateOfferType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferParams;", "", "Companion", "Vehicle", "$serializer", "com/yandex/go/scooters/data/model/j", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAlternativeOfferParams {
    public static final j Companion = new j();
    public static final i3y[] g;
    public final String a;
    public final List b;
    public final CreateOfferType c;
    public final zzs d;
    public final String e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new vnm0(18)), kotlin.a.b(lazyThreadSafetyMode, new vnm0(19)), null, null, kotlin.a.b(lazyThreadSafetyMode, new vnm0(20))};
    }

    public /* synthetic */ ScootersAlternativeOfferParams(int i, String str, List list, CreateOfferType createOfferType, zzs zzsVar, String str2, List list2) {
        if (35 != (i & 35)) {
            qje.Z(i, 35, ScootersAlternativeOfferParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = createOfferType;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = zzsVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        this.f = list2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferParams$Vehicle;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/k", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Vehicle {
        public static final k Companion = new k();
        public final String a;
        public final String b;

        public /* synthetic */ Vehicle(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, ScootersAlternativeOfferParams$Vehicle$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public Vehicle(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public ScootersAlternativeOfferParams(String str, ArrayList arrayList, CreateOfferType createOfferType, zzs zzsVar, String str2, List list) {
        this.a = str;
        this.b = arrayList;
        this.c = createOfferType;
        this.d = zzsVar;
        this.e = str2;
        this.f = list;
    }
}
