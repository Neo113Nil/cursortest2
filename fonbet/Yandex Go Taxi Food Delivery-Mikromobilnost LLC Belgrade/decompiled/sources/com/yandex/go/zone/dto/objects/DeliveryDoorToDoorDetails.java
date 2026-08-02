package com.yandex.go.zone.dto.objects;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryDoorToDoorDetails;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/p0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryDoorToDoorDetails {
    public static final p0 Companion = new p0();
    public final boolean a;
    public final n7v b;
    public final String c;
    public final String d;
    public final String e;
    public final SummaryBubble f;

    public /* synthetic */ DeliveryDoorToDoorDetails(int i, boolean z, n7v n7vVar, String str, String str2, String str3, SummaryBubble summaryBubble) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = n7vVar;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = summaryBubble;
        }
    }

    /* renamed from: a, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final n7v getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final SummaryBubble getF() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryDoorToDoorDetails)) {
            return false;
        }
        DeliveryDoorToDoorDetails deliveryDoorToDoorDetails = (DeliveryDoorToDoorDetails) obj;
        return this.a == deliveryDoorToDoorDetails.a && jl40.l(this.b, deliveryDoorToDoorDetails.b) && jl40.l(this.c, deliveryDoorToDoorDetails.c) && jl40.l(this.d, deliveryDoorToDoorDetails.d) && jl40.l(this.e, deliveryDoorToDoorDetails.e) && jl40.l(this.f, deliveryDoorToDoorDetails.f);
    }

    /* renamed from: f, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        n7v n7vVar = this.b;
        int b = unr0.b((hashCode + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SummaryBubble summaryBubble = this.f;
        return hashCode3 + (summaryBubble != null ? summaryBubble.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryDoorToDoorDetails(default=");
        sb.append(this.a);
        sb.append(", leadImage=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", selectedSubtitle=", this.d, ", unselectedSubtitle=");
        sb.append(this.e);
        sb.append(", summaryBubble=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public DeliveryDoorToDoorDetails() {
        this.a = false;
        this.b = null;
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
