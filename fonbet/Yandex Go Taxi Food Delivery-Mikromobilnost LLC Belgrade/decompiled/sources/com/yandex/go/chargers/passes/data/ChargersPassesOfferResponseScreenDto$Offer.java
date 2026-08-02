package com.yandex.go.chargers.passes.data;

import defpackage.b64;
import defpackage.bka;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nba;
import defpackage.sga;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/chargers/passes/data/ChargersPassesOfferResponseScreenDto$Offer", "Lsga;", "Lbka;", "Companion", "com/yandex/go/chargers/passes/data/p0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassesOfferResponseScreenDto$Offer implements sga, bka {
    public static final p0 Companion = new p0();
    public static final i3y[] k;
    public final String a;
    public final String b;
    public final ChargersPassTypeDto c;
    public final FormattedText d;
    public final FormattedText e;
    public final String f;
    public final List g;
    public final ChargersPassHowItWorksDto h;
    public final ChargersPassOfferBottomDto i;
    public final ChargersPassOfferSelectorDto j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new nba(19)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new nba(20)), null, null, null};
    }

    public /* synthetic */ ChargersPassesOfferResponseScreenDto$Offer(int i, String str, String str2, ChargersPassTypeDto chargersPassTypeDto, FormattedText formattedText, FormattedText formattedText2, String str3, List list, ChargersPassHowItWorksDto chargersPassHowItWorksDto, ChargersPassOfferBottomDto chargersPassOfferBottomDto, ChargersPassOfferSelectorDto chargersPassOfferSelectorDto) {
        this.a = (i & 1) == 0 ? "offer" : str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = ChargersPassTypeDto.UNKNOWN;
        } else {
            this.c = chargersPassTypeDto;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = new ChargersPassHowItWorksDto(0);
        } else {
            this.h = chargersPassHowItWorksDto;
        }
        if ((i & 256) == 0) {
            this.i = new ChargersPassOfferBottomDto(0);
        } else {
            this.i = chargersPassOfferBottomDto;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = chargersPassOfferSelectorDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassesOfferResponseScreenDto$Offer)) {
            return false;
        }
        ChargersPassesOfferResponseScreenDto$Offer chargersPassesOfferResponseScreenDto$Offer = (ChargersPassesOfferResponseScreenDto$Offer) obj;
        return jl40.l(this.a, chargersPassesOfferResponseScreenDto$Offer.a) && jl40.l(this.b, chargersPassesOfferResponseScreenDto$Offer.b) && this.c == chargersPassesOfferResponseScreenDto$Offer.c && jl40.l(this.d, chargersPassesOfferResponseScreenDto$Offer.d) && jl40.l(this.e, chargersPassesOfferResponseScreenDto$Offer.e) && jl40.l(this.f, chargersPassesOfferResponseScreenDto$Offer.f) && jl40.l(this.g, chargersPassesOfferResponseScreenDto$Offer.g) && jl40.l(this.h, chargersPassesOfferResponseScreenDto$Offer.h) && jl40.l(this.i, chargersPassesOfferResponseScreenDto$Offer.i) && jl40.l(this.j, chargersPassesOfferResponseScreenDto$Offer.j);
    }

    public final int hashCode() {
        int c = unr0.c((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d.a);
        FormattedText formattedText = this.e;
        int hashCode = (c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (this.i.hashCode() + ((this.h.hashCode() + unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.g)) * 31)) * 31;
        ChargersPassOfferSelectorDto chargersPassOfferSelectorDto = this.j;
        return hashCode2 + (chargersPassOfferSelectorDto != null ? chargersPassOfferSelectorDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Offer(type=", this.a, ", offerId=", this.b, ", passType=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", subtitle=");
        v.append(this.e);
        v.append(", topGradientColor=");
        v.append(this.f);
        v.append(", benefits=");
        v.append(this.g);
        v.append(", howItWorks=");
        v.append(this.h);
        v.append(", bottom=");
        v.append(this.i);
        v.append(", selector=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ChargersPassesOfferResponseScreenDto$Offer() {
        ChargersPassTypeDto chargersPassTypeDto = ChargersPassTypeDto.UNKNOWN;
        FormattedText formattedText = FormattedText.c;
        ChargersPassHowItWorksDto chargersPassHowItWorksDto = new ChargersPassHowItWorksDto(0);
        ChargersPassOfferBottomDto chargersPassOfferBottomDto = new ChargersPassOfferBottomDto(0);
        this.a = "offer";
        this.b = "";
        this.c = chargersPassTypeDto;
        this.d = formattedText;
        this.e = null;
        this.f = null;
        this.g = EmptyList.a;
        this.h = chargersPassHowItWorksDto;
        this.i = chargersPassOfferBottomDto;
        this.j = null;
    }
}
