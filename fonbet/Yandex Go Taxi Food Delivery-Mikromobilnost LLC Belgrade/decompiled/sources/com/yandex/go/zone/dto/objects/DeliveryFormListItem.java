package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryFormListItem;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/c1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryFormListItem {
    public static final c1 Companion = new c1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ DeliveryFormListItem(String str, String str2, String str3, String str4, boolean z, int i) {
        this.a = (i & 1) == 0 ? "" : str;
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
            this.e = true;
        } else {
            this.e = z;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryFormListItem)) {
            return false;
        }
        DeliveryFormListItem deliveryFormListItem = (DeliveryFormListItem) obj;
        return jl40.l(this.a, deliveryFormListItem.a) && jl40.l(this.b, deliveryFormListItem.b) && jl40.l(this.c, deliveryFormListItem.c) && jl40.l(this.d, deliveryFormListItem.d) && this.e == deliveryFormListItem.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryFormListItem(title=", this.a, ", subtitle=", this.b, ", trailTitle=");
        g8e.D(v, this.c, ", trailSubtitle=", this.d, ", isClickable=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }

    public DeliveryFormListItem(int i) {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = true;
    }

    public DeliveryFormListItem() {
        this(0);
    }
}
