package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/AuctionConditionalSliderSettings;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/d", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AuctionConditionalSliderSettings {
    public static final d Companion = new d();
    public final double a;
    public final AuctionSliderSettings b;

    public /* synthetic */ AuctionConditionalSliderSettings(int i, double d, AuctionSliderSettings auctionSliderSettings) {
        this.a = (i & 1) == 0 ? 0.0d : d;
        if ((i & 2) == 0) {
            this.b = new AuctionSliderSettings(0);
        } else {
            this.b = auctionSliderSettings;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionConditionalSliderSettings)) {
            return false;
        }
        AuctionConditionalSliderSettings auctionConditionalSliderSettings = (AuctionConditionalSliderSettings) obj;
        return Double.compare(this.a, auctionConditionalSliderSettings.a) == 0 && jl40.l(this.b, auctionConditionalSliderSettings.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AuctionConditionalSliderSettings(priceTopBound=" + this.a + ", settings=" + this.b + Extension.C_BRAKE;
    }

    public AuctionConditionalSliderSettings() {
        AuctionSliderSettings auctionSliderSettings = new AuctionSliderSettings(0);
        this.a = 0.0d;
        this.b = auctionSliderSettings;
    }
}
