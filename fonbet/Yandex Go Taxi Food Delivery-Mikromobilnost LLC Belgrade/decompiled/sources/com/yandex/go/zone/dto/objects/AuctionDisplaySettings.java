package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.q03;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/AuctionDisplaySettings;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/e", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AuctionDisplaySettings {
    public static final e Companion = new e();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(6)), null};
    public final AuctionSliderSettings a;
    public final List b;
    public final int c;

    public /* synthetic */ AuctionDisplaySettings(int i, AuctionSliderSettings auctionSliderSettings, List list, int i2) {
        this.a = (i & 1) == 0 ? new AuctionSliderSettings(0) : auctionSliderSettings;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionDisplaySettings)) {
            return false;
        }
        AuctionDisplaySettings auctionDisplaySettings = (AuctionDisplaySettings) obj;
        return jl40.l(this.a, auctionDisplaySettings.a) && jl40.l(this.b, auctionDisplaySettings.b) && this.c == auctionDisplaySettings.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuctionDisplaySettings(defaultSettings=");
        sb.append(this.a);
        sb.append(", conditions=");
        sb.append(this.b);
        sb.append(", costPrecision=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }

    public AuctionDisplaySettings() {
        this(0);
    }

    public AuctionDisplaySettings(int i) {
        this.a = new AuctionSliderSettings(0);
        this.b = EmptyList.a;
        this.c = 0;
    }
}
