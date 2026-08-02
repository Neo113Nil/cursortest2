package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceSummaryListItem;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/m1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPaidInsuranceSummaryListItem {
    public static final m1 Companion = new m1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ DeliveryPaidInsuranceSummaryListItem(String str, String str2, String str3, String str4, int i, String str5) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: e, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaidInsuranceSummaryListItem)) {
            return false;
        }
        DeliveryPaidInsuranceSummaryListItem deliveryPaidInsuranceSummaryListItem = (DeliveryPaidInsuranceSummaryListItem) obj;
        return jl40.l(this.a, deliveryPaidInsuranceSummaryListItem.a) && jl40.l(this.b, deliveryPaidInsuranceSummaryListItem.b) && jl40.l(this.c, deliveryPaidInsuranceSummaryListItem.c) && jl40.l(this.d, deliveryPaidInsuranceSummaryListItem.d) && jl40.l(this.e, deliveryPaidInsuranceSummaryListItem.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryPaidInsuranceSummaryListItem(title=", this.a, ", subtitle=", this.b, ", iconTag=");
        g8e.D(v, this.c, ", iconSymbol=", this.d, ", trailText=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public DeliveryPaidInsuranceSummaryListItem(int i) {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = "";
    }

    public DeliveryPaidInsuranceSummaryListItem() {
        this(0);
    }
}
