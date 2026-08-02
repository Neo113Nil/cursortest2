package com.yandex.go.zone.dto.objects;

import defpackage.b9h;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DeliveryCostDetailsScreen;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/o0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeliveryCostDetailsScreen {
    public static final o0 Companion = new o0();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(16)), null, null};
    public final String a;
    public final List b;
    public final DeliveryCostDetailsItem c;
    public final String d;

    public /* synthetic */ DeliveryCostDetailsScreen(int i, String str, List list, DeliveryCostDetailsItem deliveryCostDetailsItem, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = new DeliveryCostDetailsItem(0);
        } else {
            this.c = deliveryCostDetailsItem;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final DeliveryCostDetailsItem getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryCostDetailsScreen)) {
            return false;
        }
        DeliveryCostDetailsScreen deliveryCostDetailsScreen = (DeliveryCostDetailsScreen) obj;
        return jl40.l(this.a, deliveryCostDetailsScreen.a) && jl40.l(this.b, deliveryCostDetailsScreen.b) && jl40.l(this.c, deliveryCostDetailsScreen.c) && jl40.l(this.d, deliveryCostDetailsScreen.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("DeliveryCostDetailsScreen(title=", this.a, ", details=", this.b, ", totalPrice=");
        r.append(this.c);
        r.append(", buttonText=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public DeliveryCostDetailsScreen() {
        DeliveryCostDetailsItem deliveryCostDetailsItem = new DeliveryCostDetailsItem(0);
        this.a = "";
        this.b = EmptyList.a;
        this.c = deliveryCostDetailsItem;
        this.d = "";
    }
}
