package com.yandex.go.zone.dto.objects;

import defpackage.dii;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n7v;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPin;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/o1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPin {
    public static final o1 Companion = new o1();
    public static final i3y[] k = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dii(2)), null, null, null, null, null, null, null, null, null};
    public final DeliveryPinType a;
    public final Boolean b;
    public final s1 c;
    public final n7v d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final Boolean j;

    public /* synthetic */ DeliveryPin(int i, DeliveryPinType deliveryPinType, Boolean bool, s1 s1Var, n7v n7vVar, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3) {
        this.a = (i & 1) == 0 ? DeliveryPinType.UNKNOWN : deliveryPinType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = s1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = n7vVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getJ() {
        return this.j;
    }

    /* renamed from: b, reason: from getter */
    public final n7v getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: d, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final s1 getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPin)) {
            return false;
        }
        DeliveryPin deliveryPin = (DeliveryPin) obj;
        return this.a == deliveryPin.a && jl40.l(this.b, deliveryPin.b) && jl40.l(this.c, deliveryPin.c) && jl40.l(this.d, deliveryPin.d) && jl40.l(this.e, deliveryPin.e) && jl40.l(this.f, deliveryPin.f) && jl40.l(this.g, deliveryPin.g) && jl40.l(this.h, deliveryPin.h) && jl40.l(this.i, deliveryPin.i) && jl40.l(this.j, deliveryPin.j);
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getB() {
        return this.b;
    }

    /* renamed from: g, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* renamed from: h, reason: from getter */
    public final Boolean getI() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        s1 s1Var = this.c;
        int hashCode3 = (hashCode2 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        n7v n7vVar = this.d;
        int hashCode4 = (hashCode3 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        return hashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: j, reason: from getter */
    public final DeliveryPinType getA() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryPin(type=");
        sb.append(this.a);
        sb.append(", showOnSummary=");
        sb.append(this.b);
        sb.append(", lead=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", iconBackgroundColor=");
        g8e.D(sb, this.e, ", iconTintColor=", this.f, ", title=");
        g8e.D(sb, this.g, ", subtitle=", this.h, ", swapTexts=");
        sb.append(this.i);
        sb.append(", hasChevron=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public DeliveryPin() {
        this.a = DeliveryPinType.UNKNOWN;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }
}
