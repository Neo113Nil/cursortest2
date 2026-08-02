package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryPaidInsuranceScreen;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/h1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryPaidInsuranceScreen {
    public static final h1 Companion = new h1();
    public static final i3y[] i;
    public final String a;
    public final String b;
    public final DeliveryPaidInsuranceToggleItem c;
    public final List d;
    public final List e;
    public final DeliveryPaidInsuranceInfoButton f;
    public final String g;
    public final DeliveryPaidInsuranceScreenButtonByEntryPoint h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new b9h(23)), kotlin.a.b(lazyThreadSafetyMode, new b9h(24)), null, null, null};
    }

    public /* synthetic */ DeliveryPaidInsuranceScreen(int i2, String str, String str2, DeliveryPaidInsuranceToggleItem deliveryPaidInsuranceToggleItem, List list, List list2, DeliveryPaidInsuranceInfoButton deliveryPaidInsuranceInfoButton, String str3, DeliveryPaidInsuranceScreenButtonByEntryPoint deliveryPaidInsuranceScreenButtonByEntryPoint) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = deliveryPaidInsuranceToggleItem;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = deliveryPaidInsuranceInfoButton;
        }
        if ((i2 & 64) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = deliveryPaidInsuranceScreenButtonByEntryPoint;
        }
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryPaidInsuranceScreenButtonByEntryPoint getH() {
        return this.h;
    }

    /* renamed from: b, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: c, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final List getE() {
        return this.e;
    }

    /* renamed from: e, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPaidInsuranceScreen)) {
            return false;
        }
        DeliveryPaidInsuranceScreen deliveryPaidInsuranceScreen = (DeliveryPaidInsuranceScreen) obj;
        return jl40.l(this.a, deliveryPaidInsuranceScreen.a) && jl40.l(this.b, deliveryPaidInsuranceScreen.b) && jl40.l(this.c, deliveryPaidInsuranceScreen.c) && jl40.l(this.d, deliveryPaidInsuranceScreen.d) && jl40.l(this.e, deliveryPaidInsuranceScreen.e) && jl40.l(this.f, deliveryPaidInsuranceScreen.f) && jl40.l(this.g, deliveryPaidInsuranceScreen.g) && jl40.l(this.h, deliveryPaidInsuranceScreen.h);
    }

    /* renamed from: f, reason: from getter */
    public final DeliveryPaidInsuranceInfoButton getF() {
        return this.f;
    }

    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: h, reason: from getter */
    public final DeliveryPaidInsuranceToggleItem getC() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        DeliveryPaidInsuranceToggleItem deliveryPaidInsuranceToggleItem = this.c;
        int hashCode = (b + (deliveryPaidInsuranceToggleItem == null ? 0 : deliveryPaidInsuranceToggleItem.hashCode())) * 31;
        List list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DeliveryPaidInsuranceInfoButton deliveryPaidInsuranceInfoButton = this.f;
        int b2 = unr0.b((hashCode3 + (deliveryPaidInsuranceInfoButton == null ? 0 : deliveryPaidInsuranceInfoButton.hashCode())) * 31, 31, this.g);
        DeliveryPaidInsuranceScreenButtonByEntryPoint deliveryPaidInsuranceScreenButtonByEntryPoint = this.h;
        return b2 + (deliveryPaidInsuranceScreenButtonByEntryPoint != null ? deliveryPaidInsuranceScreenButtonByEntryPoint.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryPaidInsuranceScreen(iconTag=", this.a, ", title=", this.b, ", toggle=");
        v.append(this.c);
        v.append(", description=");
        v.append(this.d);
        v.append(", descriptionAT=");
        v.append(this.e);
        v.append(", infoButton=");
        v.append(this.f);
        v.append(", buttonText=");
        v.append(this.g);
        v.append(", button=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public DeliveryPaidInsuranceScreen(int i2) {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = "";
        this.h = null;
    }

    public DeliveryPaidInsuranceScreen() {
        this(255);
    }
}
