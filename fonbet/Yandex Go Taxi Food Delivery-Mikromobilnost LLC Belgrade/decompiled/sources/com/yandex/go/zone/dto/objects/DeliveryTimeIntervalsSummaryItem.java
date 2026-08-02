package com.yandex.go.zone.dto.objects;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryTimeIntervalsSummaryItem;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/x1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryTimeIntervalsSummaryItem {
    public static final x1 Companion = new x1();
    public final n7v a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ DeliveryTimeIntervalsSummaryItem(int i, n7v n7vVar, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = n7vVar;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final n7v getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: e, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTimeIntervalsSummaryItem)) {
            return false;
        }
        DeliveryTimeIntervalsSummaryItem deliveryTimeIntervalsSummaryItem = (DeliveryTimeIntervalsSummaryItem) obj;
        return jl40.l(this.a, deliveryTimeIntervalsSummaryItem.a) && jl40.l(this.b, deliveryTimeIntervalsSummaryItem.b) && jl40.l(this.c, deliveryTimeIntervalsSummaryItem.c) && jl40.l(this.d, deliveryTimeIntervalsSummaryItem.d) && jl40.l(this.e, deliveryTimeIntervalsSummaryItem.e);
    }

    public final int hashCode() {
        n7v n7vVar = this.a;
        int b = unr0.b((n7vVar == null ? 0 : n7vVar.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return b2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryTimeIntervalsSummaryItem(leadIcon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        g8e.D(sb, this.c, ", trailTitle=", this.d, ", badge=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public DeliveryTimeIntervalsSummaryItem(int i) {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
    }

    public DeliveryTimeIntervalsSummaryItem() {
        this(0);
    }
}
