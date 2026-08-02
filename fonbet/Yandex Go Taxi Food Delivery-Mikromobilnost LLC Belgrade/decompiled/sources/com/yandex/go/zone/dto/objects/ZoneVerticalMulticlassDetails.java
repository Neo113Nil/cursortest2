package com.yandex.go.zone.dto.objects;

import com.yandex.go.multitariff.Description;
import com.yandex.go.zone.dto.response.SearchScreen;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ZoneVerticalMulticlassDetails;", "", "Companion", "com/yandex/go/zone/dto/objects/y6", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ZoneVerticalMulticlassDetails {
    public static final y6 Companion = new y6();
    public static final ZoneVerticalMulticlassDetails d = new ZoneVerticalMulticlassDetails(0);
    public final Description a;
    public final com.yandex.go.multitariff.OrderButton b;
    public final SearchScreen c;

    public ZoneVerticalMulticlassDetails(int i, Description description, com.yandex.go.multitariff.OrderButton orderButton, SearchScreen searchScreen) {
        if ((i & 1) == 0) {
            Description.Companion.getClass();
            description = Description.c;
        }
        this.a = description;
        if ((i & 2) == 0) {
            this.b = com.yandex.go.multitariff.OrderButton.c;
        } else {
            this.b = orderButton;
        }
        if ((i & 4) != 0) {
            this.c = searchScreen;
        } else {
            SearchScreen.Companion.getClass();
            this.c = SearchScreen.d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneVerticalMulticlassDetails)) {
            return false;
        }
        ZoneVerticalMulticlassDetails zoneVerticalMulticlassDetails = (ZoneVerticalMulticlassDetails) obj;
        return jl40.l(this.a, zoneVerticalMulticlassDetails.a) && jl40.l(this.b, zoneVerticalMulticlassDetails.b) && jl40.l(this.c, zoneVerticalMulticlassDetails.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ZoneVerticalMulticlassDetails(description=" + this.a + ", orderButton=" + this.b + ", searchScreen=" + this.c + Extension.C_BRAKE;
    }

    public ZoneVerticalMulticlassDetails() {
        this(0);
    }

    public ZoneVerticalMulticlassDetails(int i) {
        Description.Companion.getClass();
        SearchScreen.Companion.getClass();
        this.a = Description.c;
        this.b = com.yandex.go.multitariff.OrderButton.c;
        this.c = SearchScreen.d;
    }
}
