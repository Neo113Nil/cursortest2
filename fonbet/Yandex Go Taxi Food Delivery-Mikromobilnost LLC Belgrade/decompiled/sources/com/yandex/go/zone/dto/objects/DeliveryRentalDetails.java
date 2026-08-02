package com.yandex.go.zone.dto.objects;

import defpackage.dii;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryRentalDetails;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/u1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryRentalDetails {
    public static final u1 Companion = new u1();
    public static final i3y[] e;
    public final List a;
    public final List b;
    public final String c;
    public final String d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new dii(6)), kotlin.a.b(lazyThreadSafetyMode, new dii(7)), null, null};
    }

    public /* synthetic */ DeliveryRentalDetails(int i, List list, List list2, String str, String str2) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final List getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryRentalDetails)) {
            return false;
        }
        DeliveryRentalDetails deliveryRentalDetails = (DeliveryRentalDetails) obj;
        return jl40.l(this.a, deliveryRentalDetails.a) && jl40.l(this.b, deliveryRentalDetails.b) && jl40.l(this.c, deliveryRentalDetails.c) && jl40.l(this.d, deliveryRentalDetails.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(qv10.v("DeliveryRentalDetails(rentalDescriptions=", this.a, ", counterValues=", this.b, ", counterTrailText="), this.c, ", summaryListItemTrailTitle=", this.d, Extension.C_BRAKE);
    }

    public DeliveryRentalDetails() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = "";
        this.d = "";
    }
}
