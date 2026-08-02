package com.yandex.go.scooters.data.model;

import defpackage.gsq0;
import defpackage.hxe;
import defpackage.i3y;
import defpackage.qje;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.scooters.data.model.CreateOfferType;
import ru.yandex.taxi.scooters.data.model.ScootersCard;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/data/model/CreateOffersV1Params;", "", "Companion", "Vehicle", "$serializer", "com/yandex/go/scooters/data/model/e", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateOffersV1Params {
    public static final e Companion = new e();
    public static final i3y[] k;
    public final List a;
    public final zzs b;
    public final zzs c;
    public final List d;
    public final String e;
    public final CreateOfferType f;
    public final ScootersCard g;
    public final String h;
    public final String i;
    public final boolean j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new hxe(11)), null, null, kotlin.a.b(lazyThreadSafetyMode, new hxe(12)), null, kotlin.a.b(lazyThreadSafetyMode, new hxe(13)), kotlin.a.b(lazyThreadSafetyMode, new hxe(14)), null, null, null};
    }

    public /* synthetic */ CreateOffersV1Params(int i, List list, zzs zzsVar, zzs zzsVar2, List list2, String str, CreateOfferType createOfferType, ScootersCard scootersCard, String str2, String str3, boolean z) {
        if (75 != (i & 75)) {
            qje.Z(i, 75, CreateOffersV1Params$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = zzsVar;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = zzsVar2;
        }
        this.d = list2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = createOfferType;
        }
        this.g = scootersCard;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/CreateOffersV1Params$Vehicle;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/f", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Vehicle {
        public static final f Companion = new f();
        public final String a;
        public final String b;

        public /* synthetic */ Vehicle(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, CreateOffersV1Params$Vehicle$$serializer.INSTANCE.getDescriptor());
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

    public CreateOffersV1Params(ArrayList arrayList, zzs zzsVar, zzs zzsVar2, List list, String str, CreateOfferType createOfferType, ScootersCard scootersCard, String str2, String str3, boolean z) {
        this.a = arrayList;
        this.b = zzsVar;
        this.c = zzsVar2;
        this.d = list;
        this.e = str;
        this.f = createOfferType;
        this.g = scootersCard;
        this.h = str2;
        this.i = str3;
        this.j = z;
    }
}
