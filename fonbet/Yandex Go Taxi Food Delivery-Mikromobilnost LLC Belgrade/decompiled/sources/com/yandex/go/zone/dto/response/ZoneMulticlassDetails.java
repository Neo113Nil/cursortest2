package com.yandex.go.zone.dto.response;

import com.yandex.go.multitariff.OrderButton;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/response/ZoneMulticlassDetails;", "", "Companion", "com/yandex/go/zone/dto/response/q", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ZoneMulticlassDetails {
    public static final q Companion = new q();
    public final SearchScreen a;
    public final String b;
    public final OrderButton c;

    public /* synthetic */ ZoneMulticlassDetails(int i, SearchScreen searchScreen, String str, OrderButton orderButton) {
        this.a = (i & 1) == 0 ? null : searchScreen;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = OrderButton.c;
        } else {
            this.c = orderButton;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneMulticlassDetails)) {
            return false;
        }
        ZoneMulticlassDetails zoneMulticlassDetails = (ZoneMulticlassDetails) obj;
        return jl40.l(this.a, zoneMulticlassDetails.a) && jl40.l(this.b, zoneMulticlassDetails.b) && jl40.l(this.c, zoneMulticlassDetails.c);
    }

    public final int hashCode() {
        SearchScreen searchScreen = this.a;
        return this.c.hashCode() + unr0.b((searchScreen == null ? 0 : searchScreen.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "ZoneMulticlassDetails(searchScreen=" + this.a + ", description=" + this.b + ", orderButton=" + this.c + Extension.C_BRAKE;
    }

    public ZoneMulticlassDetails(int i) {
        this.a = null;
        this.b = "";
        this.c = OrderButton.c;
    }

    public ZoneMulticlassDetails() {
        this(0);
    }
}
