package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/AuctionInfo;", "", "Companion", "com/yandex/go/zone/dto/objects/f", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AuctionInfo {
    public static final f Companion = new f();
    public static final AuctionInfo f = new AuctionInfo(0);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final AuctionDisplaySettings e;

    public /* synthetic */ AuctionInfo(int i, double d, double d2, double d3, double d4, AuctionDisplaySettings auctionDisplaySettings) {
        if ((i & 1) == 0) {
            this.a = 0.0d;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = 0.0d;
        } else {
            this.c = d3;
        }
        if ((i & 8) == 0) {
            this.d = 0.0d;
        } else {
            this.d = d4;
        }
        if ((i & 16) == 0) {
            this.e = new AuctionDisplaySettings(0);
        } else {
            this.e = auctionDisplaySettings;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionInfo)) {
            return false;
        }
        AuctionInfo auctionInfo = (AuctionInfo) obj;
        return Double.compare(this.a, auctionInfo.a) == 0 && Double.compare(this.b, auctionInfo.b) == 0 && Double.compare(this.c, auctionInfo.c) == 0 && Double.compare(this.d, auctionInfo.d) == 0 && jl40.l(this.e, auctionInfo.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.a(unr0.a(unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "AuctionInfo(initialPrice=", ", priceStep=");
        u.append(this.b);
        nzs.o(u, ", minPrice=", this.c, ", maxPrice=");
        u.append(this.d);
        u.append(", displaySettings=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public AuctionInfo() {
        this(0);
    }

    public AuctionInfo(int i) {
        AuctionDisplaySettings auctionDisplaySettings = new AuctionDisplaySettings(0);
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = 0.0d;
        this.e = auctionDisplaySettings;
    }
}
