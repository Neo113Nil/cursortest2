package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryCostDetailsItem;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/n0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryCostDetailsItem {
    public static final n0 Companion = new n0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ DeliveryCostDetailsItem(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryCostDetailsItem)) {
            return false;
        }
        DeliveryCostDetailsItem deliveryCostDetailsItem = (DeliveryCostDetailsItem) obj;
        return jl40.l(this.a, deliveryCostDetailsItem.a) && jl40.l(this.b, deliveryCostDetailsItem.b) && jl40.l(this.c, deliveryCostDetailsItem.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("DeliveryCostDetailsItem(title=", this.a, ", price=", this.b, ", description="), this.c, Extension.C_BRAKE);
    }

    public DeliveryCostDetailsItem(int i) {
        this.a = "";
        this.b = "";
        this.c = null;
    }

    public DeliveryCostDetailsItem() {
        this(0);
    }
}
