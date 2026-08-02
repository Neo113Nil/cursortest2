package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryTimeIntervalsListScreen;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/w1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryTimeIntervalsListScreen {
    public static final w1 Companion = new w1();
    public final String a;
    public final String b;
    public final n7v c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ DeliveryTimeIntervalsListScreen(int i, String str, String str2, n7v n7vVar, String str3, String str4, String str5) {
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
            this.c = n7vVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final n7v getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: e, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTimeIntervalsListScreen)) {
            return false;
        }
        DeliveryTimeIntervalsListScreen deliveryTimeIntervalsListScreen = (DeliveryTimeIntervalsListScreen) obj;
        return jl40.l(this.a, deliveryTimeIntervalsListScreen.a) && jl40.l(this.b, deliveryTimeIntervalsListScreen.b) && jl40.l(this.c, deliveryTimeIntervalsListScreen.c) && jl40.l(this.d, deliveryTimeIntervalsListScreen.d) && jl40.l(this.e, deliveryTimeIntervalsListScreen.e) && jl40.l(this.f, deliveryTimeIntervalsListScreen.f);
    }

    /* renamed from: f, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        n7v n7vVar = this.c;
        return this.f.hashCode() + unr0.b(unr0.b((b + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryTimeIntervalsListScreen(title=", this.a, ", subtitle=", this.b, ", headerImage=");
        v.append(this.c);
        v.append(", pickupHeaderTitle=");
        v.append(this.d);
        v.append(", deliveryHeaderTitle=");
        return g8e.r(v, this.e, ", priceHeaderTitle=", this.f, Extension.C_BRAKE);
    }

    public DeliveryTimeIntervalsListScreen(int i) {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = "";
        this.f = "";
    }

    public DeliveryTimeIntervalsListScreen() {
        this(0);
    }
}
