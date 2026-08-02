package com.yandex.go.multitariff;

import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.zone.dto.response.SearchScreen;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multitariff/RouteStatsVerticalMulticlassDetails;", "", "Companion", "com/yandex/go/multitariff/d", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RouteStatsVerticalMulticlassDetails {
    public static final d Companion = new d();
    public static final RouteStatsVerticalMulticlassDetails f = new RouteStatsVerticalMulticlassDetails(0);
    public final Description a;
    public final String b;
    public final PriceMeta c;
    public final OrderButton d;
    public final SearchScreen e;

    public RouteStatsVerticalMulticlassDetails(int i, Description description, String str, PriceMeta priceMeta, OrderButton orderButton, SearchScreen searchScreen) {
        if ((i & 1) == 0) {
            Description.Companion.getClass();
            description = Description.c;
        }
        this.a = description;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = priceMeta;
        }
        if ((i & 8) == 0) {
            this.d = OrderButton.c;
        } else {
            this.d = orderButton;
        }
        if ((i & 16) != 0) {
            this.e = searchScreen;
        } else {
            SearchScreen.Companion.getClass();
            this.e = SearchScreen.d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteStatsVerticalMulticlassDetails)) {
            return false;
        }
        RouteStatsVerticalMulticlassDetails routeStatsVerticalMulticlassDetails = (RouteStatsVerticalMulticlassDetails) obj;
        return jl40.l(this.a, routeStatsVerticalMulticlassDetails.a) && jl40.l(this.b, routeStatsVerticalMulticlassDetails.b) && jl40.l(this.c, routeStatsVerticalMulticlassDetails.c) && jl40.l(this.d, routeStatsVerticalMulticlassDetails.d) && jl40.l(this.e, routeStatsVerticalMulticlassDetails.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        PriceMeta priceMeta = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((b + (priceMeta == null ? 0 : priceMeta.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "RouteStatsVerticalMulticlassDetails(description=" + this.a + ", price=" + this.b + ", priceMeta=" + this.c + ", orderButton=" + this.d + ", searchScreen=" + this.e + Extension.C_BRAKE;
    }

    public RouteStatsVerticalMulticlassDetails() {
        this(0);
    }

    public RouteStatsVerticalMulticlassDetails(int i) {
        Description.Companion.getClass();
        SearchScreen.Companion.getClass();
        this.a = Description.c;
        this.b = "";
        this.c = null;
        this.d = OrderButton.c;
        this.e = SearchScreen.d;
    }
}
