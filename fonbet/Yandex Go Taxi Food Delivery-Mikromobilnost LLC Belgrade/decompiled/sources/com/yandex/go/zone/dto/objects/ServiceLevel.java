package com.yandex.go.zone.dto.objects;

import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.Selector;
import defpackage.auu0;
import defpackage.b64;
import defpackage.c7v;
import defpackage.dwq0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.lv90;
import defpackage.n7v;
import defpackage.nnm;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.wrp0;
import defpackage.xiq0;
import defpackage.xvz;
import defpackage.yjd;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0013\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel;", "", "Companion", "DescriptionParts", "TariffDetail", "RideTimeAppearance", "RideTime", "Requirements", "QueueOnSearchDisplayInfo", "ForceSuggest", "Branding", "LongSearchV2", "Popup", "TariffPopup", "SearchingPulsarDTO", "RequirementAlternatives", "RequirementAlternativesSection", "TariffCard", "HighlightedTariffs", "ScheduledOrderViewDto", "com/yandex/go/zone/dto/objects/b4", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ServiceLevel {
    public static final b4 Companion = new b4();
    public static final i3y[] a0;
    public final boolean A;
    public final BrandingType B;
    public final PaidOptions C;
    public final ComboOrder D;
    public final boolean E;
    public final String F;
    public final Selector G;
    public final boolean H;
    public final String I;
    public final List J;
    public final boolean K;
    public final DriveExtra L;
    public final ScootersExtra M;
    public final DeliveryExtra N;
    public final ComboExtra O;
    public final SummaryStyle P;
    public final f5 Q;
    public final TariffCard R;
    public final String S;
    public final SearchingPulsarDTO T;
    public final boolean U;
    public final RequirementAlternatives V;
    public final HighlightedTariffs W;
    public final AuctionInfo X;
    public final ScheduledOrderViewDto Y;
    public final SuggestsPreferences Z;
    public final DescriptionParts a;
    public final DescriptionParts b;
    public final List c;
    public final com.yandex.go.zone.dto.response.c d;
    public final String e;
    public final String f;
    public final String g;
    public final PriceMeta h;
    public final String i;
    public final String j;
    public final RideTime k;
    public final int l;
    public final TariffUnavailable m;
    public final List n;
    public final boolean o;
    public final String p;
    public final Boolean q;
    public final jsq0 r;
    public final Requirements s;
    public final SearchScreen t;
    public final QueueOnSearchDisplayInfo u;
    public final String v;
    public final String w;
    public final List x;
    public final String y;
    public final CouponCheckResult z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        a0 = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new wrp0(22)), null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new wrp0(23)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new wrp0(24)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new wrp0(25)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new wrp0(26)), null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new wrp0(27)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public ServiceLevel(int i, int i2, DescriptionParts descriptionParts, DescriptionParts descriptionParts2, List list, com.yandex.go.zone.dto.response.c cVar, String str, String str2, String str3, PriceMeta priceMeta, String str4, String str5, RideTime rideTime, int i3, TariffUnavailable tariffUnavailable, List list2, boolean z, String str6, Boolean bool, jsq0 jsq0Var, Requirements requirements, SearchScreen searchScreen, QueueOnSearchDisplayInfo queueOnSearchDisplayInfo, String str7, String str8, List list3, String str9, CouponCheckResult couponCheckResult, boolean z2, BrandingType brandingType, PaidOptions paidOptions, ComboOrder comboOrder, boolean z3, String str10, Selector selector, boolean z4, String str11, List list4, boolean z5, DriveExtra driveExtra, ScootersExtra scootersExtra, DeliveryExtra deliveryExtra, ComboExtra comboExtra, SummaryStyle summaryStyle, f5 f5Var, TariffCard tariffCard, String str12, SearchingPulsarDTO searchingPulsarDTO, boolean z6, RequirementAlternatives requirementAlternatives, HighlightedTariffs highlightedTariffs, AuctionInfo auctionInfo, ScheduledOrderViewDto scheduledOrderViewDto, SuggestsPreferences suggestsPreferences) {
        HighlightedTariffs highlightedTariffs2;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = descriptionParts;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = descriptionParts2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = priceMeta;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = rideTime;
        }
        if ((i & 2048) == 0) {
            this.l = 0;
        } else {
            this.l = i3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = tariffUnavailable;
        }
        this.n = (i & 8192) == 0 ? EmptyList.a : list2;
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = str6;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = bool;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = jsq0Var;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = requirements;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = searchScreen;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = queueOnSearchDisplayInfo;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str7;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str8;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = list3;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = str9;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = couponCheckResult;
        }
        if ((67108864 & i) == 0) {
            this.A = false;
        } else {
            this.A = z2;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = brandingType;
        }
        this.C = (268435456 & i) == 0 ? PaidOptions.g : paidOptions;
        this.D = (536870912 & i) == 0 ? ComboOrder.b : comboOrder;
        if ((1073741824 & i) == 0) {
            this.E = false;
        } else {
            this.E = z3;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = "";
        } else {
            this.F = str10;
        }
        this.G = (i2 & 1) == 0 ? Selector.i : selector;
        if ((i2 & 2) == 0) {
            this.H = false;
        } else {
            this.H = z4;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = str11;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = list4;
        }
        if ((i2 & 16) == 0) {
            this.K = false;
        } else {
            this.K = z5;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = driveExtra;
        }
        if ((i2 & 64) == 0) {
            this.M = null;
        } else {
            this.M = scootersExtra;
        }
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = deliveryExtra;
        }
        if ((i2 & 256) == 0) {
            this.O = null;
        } else {
            this.O = comboExtra;
        }
        if ((i2 & 512) == 0) {
            this.P = null;
        } else {
            this.P = summaryStyle;
        }
        this.Q = (i2 & 1024) == 0 ? e5.INSTANCE : f5Var;
        this.R = (i2 & 2048) == 0 ? TariffCard.d : tariffCard;
        if ((i2 & 4096) == 0) {
            this.S = null;
        } else {
            this.S = str12;
        }
        if ((i2 & 8192) == 0) {
            this.T = null;
        } else {
            this.T = searchingPulsarDTO;
        }
        if ((i2 & 16384) == 0) {
            this.U = false;
        } else {
            this.U = z6;
        }
        if ((i2 & 32768) == 0) {
            this.V = null;
        } else {
            this.V = requirementAlternatives;
        }
        if ((i2 & 65536) == 0) {
            HighlightedTariffs.Companion.getClass();
            highlightedTariffs2 = HighlightedTariffs.d;
        } else {
            highlightedTariffs2 = highlightedTariffs;
        }
        this.W = highlightedTariffs2;
        if ((i2 & 131072) == 0) {
            this.X = null;
        } else {
            this.X = auctionInfo;
        }
        if ((i2 & 262144) == 0) {
            this.Y = null;
        } else {
            this.Y = scheduledOrderViewDto;
        }
        if ((i2 & 524288) == 0) {
            this.Z = null;
        } else {
            this.Z = suggestsPreferences;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceLevel)) {
            return false;
        }
        ServiceLevel serviceLevel = (ServiceLevel) obj;
        return jl40.l(this.a, serviceLevel.a) && jl40.l(this.b, serviceLevel.b) && jl40.l(this.c, serviceLevel.c) && jl40.l(this.d, serviceLevel.d) && jl40.l(this.e, serviceLevel.e) && jl40.l(this.f, serviceLevel.f) && jl40.l(this.g, serviceLevel.g) && jl40.l(this.h, serviceLevel.h) && jl40.l(this.i, serviceLevel.i) && jl40.l(this.j, serviceLevel.j) && jl40.l(this.k, serviceLevel.k) && this.l == serviceLevel.l && jl40.l(this.m, serviceLevel.m) && jl40.l(this.n, serviceLevel.n) && this.o == serviceLevel.o && jl40.l(this.p, serviceLevel.p) && jl40.l(this.q, serviceLevel.q) && jl40.l(this.r, serviceLevel.r) && jl40.l(this.s, serviceLevel.s) && jl40.l(this.t, serviceLevel.t) && jl40.l(this.u, serviceLevel.u) && jl40.l(this.v, serviceLevel.v) && jl40.l(this.w, serviceLevel.w) && jl40.l(this.x, serviceLevel.x) && jl40.l(this.y, serviceLevel.y) && jl40.l(this.z, serviceLevel.z) && this.A == serviceLevel.A && this.B == serviceLevel.B && jl40.l(this.C, serviceLevel.C) && jl40.l(this.D, serviceLevel.D) && this.E == serviceLevel.E && jl40.l(this.F, serviceLevel.F) && jl40.l(this.G, serviceLevel.G) && this.H == serviceLevel.H && jl40.l(this.I, serviceLevel.I) && jl40.l(this.J, serviceLevel.J) && this.K == serviceLevel.K && jl40.l(this.L, serviceLevel.L) && jl40.l(this.M, serviceLevel.M) && jl40.l(this.N, serviceLevel.N) && jl40.l(this.O, serviceLevel.O) && jl40.l(this.P, serviceLevel.P) && jl40.l(this.Q, serviceLevel.Q) && jl40.l(this.R, serviceLevel.R) && jl40.l(this.S, serviceLevel.S) && jl40.l(this.T, serviceLevel.T) && this.U == serviceLevel.U && jl40.l(this.V, serviceLevel.V) && jl40.l(this.W, serviceLevel.W) && jl40.l(this.X, serviceLevel.X) && jl40.l(this.Y, serviceLevel.Y) && jl40.l(this.Z, serviceLevel.Z);
    }

    public final int hashCode() {
        DescriptionParts descriptionParts = this.a;
        int hashCode = (descriptionParts == null ? 0 : descriptionParts.hashCode()) * 31;
        DescriptionParts descriptionParts2 = this.b;
        int hashCode2 = (hashCode + (descriptionParts2 == null ? 0 : descriptionParts2.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        com.yandex.go.zone.dto.response.c cVar = this.d;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.e;
        int b = unr0.b((hashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode5 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        PriceMeta priceMeta = this.h;
        int hashCode6 = (hashCode5 + (priceMeta == null ? 0 : priceMeta.hashCode())) * 31;
        String str3 = this.i;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RideTime rideTime = this.k;
        int b2 = oyr.b(this.l, (hashCode8 + (rideTime == null ? 0 : rideTime.hashCode())) * 31, 31);
        TariffUnavailable tariffUnavailable = this.m;
        int e = unr0.e(unr0.c((b2 + (tariffUnavailable == null ? 0 : tariffUnavailable.hashCode())) * 31, 31, this.n), 31, this.o);
        String str5 = this.p;
        int hashCode9 = (e + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.q;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        jsq0 jsq0Var = this.r;
        int hashCode11 = (hashCode10 + (jsq0Var == null ? 0 : jsq0Var.a.hashCode())) * 31;
        Requirements requirements = this.s;
        int hashCode12 = (hashCode11 + (requirements == null ? 0 : Boolean.hashCode(requirements.a))) * 31;
        SearchScreen searchScreen = this.t;
        int hashCode13 = (hashCode12 + (searchScreen == null ? 0 : searchScreen.hashCode())) * 31;
        QueueOnSearchDisplayInfo queueOnSearchDisplayInfo = this.u;
        int hashCode14 = (hashCode13 + (queueOnSearchDisplayInfo == null ? 0 : queueOnSearchDisplayInfo.a.hashCode())) * 31;
        String str6 = this.v;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.w;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list2 = this.x;
        int hashCode17 = (hashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str8 = this.y;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        CouponCheckResult couponCheckResult = this.z;
        int e2 = unr0.e((hashCode18 + (couponCheckResult == null ? 0 : couponCheckResult.hashCode())) * 31, 31, this.A);
        BrandingType brandingType = this.B;
        int e3 = unr0.e((this.G.hashCode() + unr0.b(unr0.e((this.D.a.hashCode() + ((this.C.hashCode() + ((e2 + (brandingType == null ? 0 : brandingType.hashCode())) * 31)) * 31)) * 31, 31, this.E), 31, this.F)) * 31, 31, this.H);
        String str9 = this.I;
        int hashCode19 = (e3 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list3 = this.J;
        int e4 = unr0.e((hashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.K);
        DriveExtra driveExtra = this.L;
        int hashCode20 = (e4 + (driveExtra == null ? 0 : driveExtra.hashCode())) * 31;
        ScootersExtra scootersExtra = this.M;
        int hashCode21 = (hashCode20 + (scootersExtra == null ? 0 : scootersExtra.hashCode())) * 31;
        DeliveryExtra deliveryExtra = this.N;
        int hashCode22 = (hashCode21 + (deliveryExtra == null ? 0 : deliveryExtra.hashCode())) * 31;
        ComboExtra comboExtra = this.O;
        int hashCode23 = (hashCode22 + (comboExtra == null ? 0 : comboExtra.hashCode())) * 31;
        SummaryStyle summaryStyle = this.P;
        int hashCode24 = (this.R.hashCode() + ((this.Q.hashCode() + ((hashCode23 + (summaryStyle == null ? 0 : summaryStyle.hashCode())) * 31)) * 31)) * 31;
        String str10 = this.S;
        int hashCode25 = (hashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31;
        SearchingPulsarDTO searchingPulsarDTO = this.T;
        int e5 = unr0.e((hashCode25 + (searchingPulsarDTO == null ? 0 : searchingPulsarDTO.hashCode())) * 31, 31, this.U);
        RequirementAlternatives requirementAlternatives = this.V;
        int hashCode26 = (this.W.hashCode() + ((e5 + (requirementAlternatives == null ? 0 : requirementAlternatives.hashCode())) * 31)) * 31;
        AuctionInfo auctionInfo = this.X;
        int hashCode27 = (hashCode26 + (auctionInfo == null ? 0 : auctionInfo.hashCode())) * 31;
        ScheduledOrderViewDto scheduledOrderViewDto = this.Y;
        int hashCode28 = (hashCode27 + (scheduledOrderViewDto == null ? 0 : scheduledOrderViewDto.hashCode())) * 31;
        SuggestsPreferences suggestsPreferences = this.Z;
        return hashCode28 + (suggestsPreferences != null ? suggestsPreferences.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceLevel(descriptionParts=");
        sb.append(this.a);
        sb.append(", descriptionPartsOnSelect=");
        sb.append(this.b);
        sb.append(", detailsTariff=");
        sb.append(this.c);
        sb.append(", estimatedWaitingDto=");
        sb.append(this.d);
        sb.append(", name=");
        g8e.D(sb, this.e, ", className=", this.f, ", price=");
        sb.append(this.g);
        sb.append(", priceMeta=");
        sb.append(this.h);
        sb.append(", maxPriceAsDecimal=");
        g8e.D(sb, this.i, ", originalPrice=", this.j, ", rideTime=");
        sb.append(this.k);
        sb.append(", serviceLevelValue=");
        sb.append(this.l);
        sb.append(", tariffUnavailable=");
        sb.append(this.m);
        sb.append(", unsupportedRequirements=");
        sb.append(this.n);
        sb.append(", isOnlyForSoonOrders=");
        unr0.A(", onlyForSoonOrdersMessage=", this.p, ", orderForOtherProhibited=", sb, this.o);
        sb.append(this.q);
        sb.append(", paymentTypes=");
        sb.append(this.r);
        sb.append(", requirements=");
        sb.append(this.s);
        sb.append(", searchScreen=");
        sb.append(this.t);
        sb.append(", queueOnSearchDisplayInfo=");
        sb.append(this.u);
        sb.append(", orderTaxiTitle=");
        sb.append(this.v);
        sb.append(", orderTaxiSubtitle=");
        tse0.x(this.w, ", forceSuggests=", ", pinDescription=", sb, this.x);
        sb.append(this.y);
        sb.append(", coupon=");
        sb.append(this.z);
        sb.append(", isHidden=");
        sb.append(this.A);
        sb.append(", brandingType=");
        sb.append(this.B);
        sb.append(", paidOptions=");
        sb.append(this.C);
        sb.append(", comboOrder=");
        sb.append(this.D);
        sb.append(", isHiddenTariffInfo=");
        unr0.A(", fullscreenId=", this.F, ", selector=", sb, this.E);
        sb.append(this.G);
        sb.append(", isCheaper=");
        sb.append(this.H);
        sb.append(", isCheaperMessage=");
        tse0.x(this.I, ", brandings=", ", isFixedPrice=", sb, this.J);
        sb.append(this.K);
        sb.append(", driveExtra=");
        sb.append(this.L);
        sb.append(", scootersExtra=");
        sb.append(this.M);
        sb.append(", deliveryExtra=");
        sb.append(this.N);
        sb.append(", comboExtra=");
        sb.append(this.O);
        sb.append(", summaryStyle=");
        sb.append(this.P);
        sb.append(", widget=");
        sb.append(this.Q);
        sb.append(", tariffCard=");
        sb.append(this.R);
        sb.append(", offer=");
        sb.append(this.S);
        sb.append(", searchingPulsar=");
        sb.append(this.T);
        sb.append(", showCitiesOnSummary=");
        sb.append(this.U);
        sb.append(", requirementAlternatives=");
        sb.append(this.V);
        sb.append(", highlightedTariffs=");
        sb.append(this.W);
        sb.append(", auction=");
        sb.append(this.X);
        sb.append(", scheduledOrderView=");
        sb.append(this.Y);
        sb.append(", suggestsPreferences=");
        sb.append(this.Z);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding;", "", "Companion", "RideTimeAppearance", "IconAppearance", "Extra", "Tooltip", "Action", "Type", "$serializer", "com/yandex/go/zone/dto/objects/u3", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class Branding {
        public static final u3 Companion = new u3();
        public static final i3y[] w;
        public final Tooltip a;
        public final Action b;
        public final Type c;
        public final String d;
        public final String e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final String i;
        public final Extra j;
        public final String k;
        public final String l;
        public final TariffModifierInfo m;
        public final LongSearchV2 n;
        public final TariffPopup o;
        public final SummaryCardPromo p;
        public final String q;
        public final IconAppearance r;
        public final RideTimeAppearance s;
        public final BrandingCashbackStyle t;
        public final BrandingCashbackStyle u;
        public final BrandingValues v;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding$Action;", "", "Companion", "com/yandex/go/zone/dto/objects/t3", "REDIRECT", "SHOW_BANNER", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final class Action {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final t3 Companion;
            public static final Action REDIRECT;
            public static final Action SHOW_BANNER;

            static {
                Action action = new Action("REDIRECT", 0);
                REDIRECT = action;
                Action action2 = new Action("SHOW_BANNER", 1);
                SHOW_BANNER = action2;
                Action[] actionArr = {action, action2};
                $VALUES = actionArr;
                $ENTRIES = kotlin.enums.a.a(actionArr);
                Companion = new t3();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(18));
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding$Type;", "", "Companion", "com/yandex/go/zone/dto/objects/a4", "CASH_BACK", "BADGE", "PLUS_PROMOTION", "WALLET_PAYMENT", "COMPLEMENT_PAYMENT", "TARIFF_PROMOTION", "CREATE_BUSINESS_ACCOUNT", "COMPLEMENT_PAYMENT_FULL_COST_COVERAGE", "TARIFF_MODIFIER", "MASTERCARD_CASHBACK", "DEEPLINK", "COMPOSITE_PAYMENT_AMOUNT", "HAS_POSSIBLE_DISCOUNT", "TARIFF_UNAVAILABLE", "LONG_SEARCH_V2", "SEARCHING_PULSAR", "TARIFF_TOOLTIP", "PREVIEW_CARD", "START_PIN_TEXT", "DETAILED_START_PIN", "DETAILED_FINISH_PIN", "RIDE_TIME", "START_PIN_APPERANCE_OVERRIDE", "COMBO_INNER_PIN", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final Type BADGE;
            public static final Type CASH_BACK;
            public static final Type COMBO_INNER_PIN;
            public static final Type COMPLEMENT_PAYMENT;
            public static final Type COMPLEMENT_PAYMENT_FULL_COST_COVERAGE;
            public static final Type COMPOSITE_PAYMENT_AMOUNT;
            public static final Type CREATE_BUSINESS_ACCOUNT;
            public static final a4 Companion;
            public static final Type DEEPLINK;
            public static final Type DETAILED_FINISH_PIN;
            public static final Type DETAILED_START_PIN;
            public static final Type HAS_POSSIBLE_DISCOUNT;
            public static final Type LONG_SEARCH_V2;
            public static final Type MASTERCARD_CASHBACK;
            public static final Type PLUS_PROMOTION;
            public static final Type PREVIEW_CARD;
            public static final Type RIDE_TIME;
            public static final Type SEARCHING_PULSAR;
            public static final Type START_PIN_APPERANCE_OVERRIDE;
            public static final Type START_PIN_TEXT;
            public static final Type TARIFF_MODIFIER;
            public static final Type TARIFF_PROMOTION;
            public static final Type TARIFF_TOOLTIP;
            public static final Type TARIFF_UNAVAILABLE;
            public static final Type WALLET_PAYMENT;

            static {
                Type type = new Type("CASH_BACK", 0);
                CASH_BACK = type;
                Type type2 = new Type("BADGE", 1);
                BADGE = type2;
                Type type3 = new Type("PLUS_PROMOTION", 2);
                PLUS_PROMOTION = type3;
                Type type4 = new Type("WALLET_PAYMENT", 3);
                WALLET_PAYMENT = type4;
                Type type5 = new Type("COMPLEMENT_PAYMENT", 4);
                COMPLEMENT_PAYMENT = type5;
                Type type6 = new Type("TARIFF_PROMOTION", 5);
                TARIFF_PROMOTION = type6;
                Type type7 = new Type("CREATE_BUSINESS_ACCOUNT", 6);
                CREATE_BUSINESS_ACCOUNT = type7;
                Type type8 = new Type("COMPLEMENT_PAYMENT_FULL_COST_COVERAGE", 7);
                COMPLEMENT_PAYMENT_FULL_COST_COVERAGE = type8;
                Type type9 = new Type("TARIFF_MODIFIER", 8);
                TARIFF_MODIFIER = type9;
                Type type10 = new Type("MASTERCARD_CASHBACK", 9);
                MASTERCARD_CASHBACK = type10;
                Type type11 = new Type("DEEPLINK", 10);
                DEEPLINK = type11;
                Type type12 = new Type("COMPOSITE_PAYMENT_AMOUNT", 11);
                COMPOSITE_PAYMENT_AMOUNT = type12;
                Type type13 = new Type("HAS_POSSIBLE_DISCOUNT", 12);
                HAS_POSSIBLE_DISCOUNT = type13;
                Type type14 = new Type("TARIFF_UNAVAILABLE", 13);
                TARIFF_UNAVAILABLE = type14;
                Type type15 = new Type("LONG_SEARCH_V2", 14);
                LONG_SEARCH_V2 = type15;
                Type type16 = new Type("SEARCHING_PULSAR", 15);
                SEARCHING_PULSAR = type16;
                Type type17 = new Type("TARIFF_TOOLTIP", 16);
                TARIFF_TOOLTIP = type17;
                Type type18 = new Type("PREVIEW_CARD", 17);
                PREVIEW_CARD = type18;
                Type type19 = new Type("START_PIN_TEXT", 18);
                START_PIN_TEXT = type19;
                Type type20 = new Type("DETAILED_START_PIN", 19);
                DETAILED_START_PIN = type20;
                Type type21 = new Type("DETAILED_FINISH_PIN", 20);
                DETAILED_FINISH_PIN = type21;
                Type type22 = new Type("RIDE_TIME", 21);
                RIDE_TIME = type22;
                Type type23 = new Type("START_PIN_APPERANCE_OVERRIDE", 22);
                START_PIN_APPERANCE_OVERRIDE = type23;
                Type type24 = new Type("COMBO_INNER_PIN", 23);
                COMBO_INNER_PIN = type24;
                Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new a4();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(21));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            w = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new xiq0(16)), kotlin.a.b(lazyThreadSafetyMode, new xiq0(17)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        }

        public Branding(int i, Tooltip tooltip, Action action, Type type, String str, String str2, String str3, boolean z, boolean z2, String str4, Extra extra, String str5, String str6, TariffModifierInfo tariffModifierInfo, LongSearchV2 longSearchV2, TariffPopup tariffPopup, SummaryCardPromo summaryCardPromo, String str7, IconAppearance iconAppearance, RideTimeAppearance rideTimeAppearance, BrandingCashbackStyle brandingCashbackStyle, BrandingCashbackStyle brandingCashbackStyle2, BrandingValues brandingValues) {
            BrandingCashbackStyle brandingCashbackStyle3;
            BrandingCashbackStyle brandingCashbackStyle4;
            BrandingValues brandingValues2;
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = tooltip;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = action;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = type;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str3;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z;
            }
            if ((i & 128) == 0) {
                this.h = false;
            } else {
                this.h = z2;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str4;
            }
            if ((i & 512) == 0) {
                Extra.Companion.getClass();
                this.j = Extra.e;
            } else {
                this.j = extra;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = str5;
            }
            if ((i & 2048) == 0) {
                this.l = null;
            } else {
                this.l = str6;
            }
            this.m = (i & 4096) == 0 ? TariffModifierInfo.d : tariffModifierInfo;
            if ((i & 8192) == 0) {
                this.n = null;
            } else {
                this.n = longSearchV2;
            }
            if ((i & 16384) == 0) {
                this.o = null;
            } else {
                this.o = tariffPopup;
            }
            if ((32768 & i) == 0) {
                this.p = null;
            } else {
                this.p = summaryCardPromo;
            }
            if ((65536 & i) == 0) {
                this.q = null;
            } else {
                this.q = str7;
            }
            if ((131072 & i) == 0) {
                this.r = null;
            } else {
                this.r = iconAppearance;
            }
            if ((262144 & i) == 0) {
                this.s = null;
            } else {
                this.s = rideTimeAppearance;
            }
            if ((524288 & i) == 0) {
                BrandingCashbackStyle.Companion.getClass();
                brandingCashbackStyle3 = BrandingCashbackStyle.c;
            } else {
                brandingCashbackStyle3 = brandingCashbackStyle;
            }
            this.t = brandingCashbackStyle3;
            if ((1048576 & i) == 0) {
                BrandingCashbackStyle.Companion.getClass();
                brandingCashbackStyle4 = BrandingCashbackStyle.c;
            } else {
                brandingCashbackStyle4 = brandingCashbackStyle2;
            }
            this.u = brandingCashbackStyle4;
            if ((i & 2097152) == 0) {
                BrandingValues.Companion.getClass();
                brandingValues2 = BrandingValues.c;
            } else {
                brandingValues2 = brandingValues;
            }
            this.v = brandingValues2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
        
            if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.ServiceLevel.Branding.Extra.e) == false) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
        
            if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.BrandingCashbackStyle.c) == false) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01c2, code lost:
        
            if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.BrandingCashbackStyle.c) == false) goto L127;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void e(Branding branding, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || branding.a != null) {
                yjdVar.g(serialDescriptor, 0, ServiceLevel$Branding$Tooltip$$serializer.INSTANCE, branding.a);
            }
            boolean F = yjdVar.F();
            i3y[] i3yVarArr = w;
            if (F || branding.b != null) {
                yjdVar.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), branding.b);
            }
            if (yjdVar.F() || branding.c != null) {
                yjdVar.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), branding.c);
            }
            if (yjdVar.F() || branding.d != null) {
                yjdVar.g(serialDescriptor, 3, auu0.a, branding.d);
            }
            if (yjdVar.F() || branding.e != null) {
                yjdVar.g(serialDescriptor, 4, auu0.a, branding.e);
            }
            if (yjdVar.F() || branding.f != null) {
                yjdVar.g(serialDescriptor, 5, auu0.a, branding.f);
            }
            if (yjdVar.F() || branding.g) {
                yjdVar.n(serialDescriptor, 6, branding.g);
            }
            if (yjdVar.F() || branding.h) {
                yjdVar.n(serialDescriptor, 7, branding.h);
            }
            if (yjdVar.F() || branding.i != null) {
                yjdVar.g(serialDescriptor, 8, auu0.a, branding.i);
            }
            if (!yjdVar.F()) {
                Extra extra = branding.j;
                Extra.Companion.getClass();
            }
            yjdVar.e(serialDescriptor, 9, ServiceLevel$Branding$Extra$$serializer.INSTANCE, branding.j);
            if (yjdVar.F() || branding.k != null) {
                yjdVar.g(serialDescriptor, 10, auu0.a, branding.k);
            }
            if (yjdVar.F() || branding.l != null) {
                yjdVar.g(serialDescriptor, 11, auu0.a, branding.l);
            }
            if (yjdVar.F() || !jl40.l(branding.m, TariffModifierInfo.d)) {
                yjdVar.e(serialDescriptor, 12, TariffModifierInfo$$serializer.INSTANCE, branding.m);
            }
            if (yjdVar.F() || branding.n != null) {
                yjdVar.g(serialDescriptor, 13, ServiceLevel$LongSearchV2$$serializer.INSTANCE, branding.n);
            }
            if (yjdVar.F() || branding.o != null) {
                yjdVar.g(serialDescriptor, 14, ServiceLevel$TariffPopup$$serializer.INSTANCE, branding.o);
            }
            if (yjdVar.F() || branding.p != null) {
                yjdVar.g(serialDescriptor, 15, SummaryCardPromo$$serializer.INSTANCE, branding.p);
            }
            if (yjdVar.F() || branding.q != null) {
                yjdVar.g(serialDescriptor, 16, auu0.a, branding.q);
            }
            if (yjdVar.F() || branding.r != null) {
                yjdVar.g(serialDescriptor, 17, ServiceLevel$Branding$IconAppearance$$serializer.INSTANCE, branding.r);
            }
            if (yjdVar.F() || branding.s != null) {
                yjdVar.g(serialDescriptor, 18, ServiceLevel$Branding$RideTimeAppearance$$serializer.INSTANCE, branding.s);
            }
            if (!yjdVar.F()) {
                BrandingCashbackStyle brandingCashbackStyle = branding.t;
                BrandingCashbackStyle.Companion.getClass();
            }
            yjdVar.e(serialDescriptor, 19, BrandingCashbackStyle$$serializer.INSTANCE, branding.t);
            if (!yjdVar.F()) {
                BrandingCashbackStyle brandingCashbackStyle2 = branding.u;
                BrandingCashbackStyle.Companion.getClass();
            }
            yjdVar.e(serialDescriptor, 20, BrandingCashbackStyle$$serializer.INSTANCE, branding.u);
            if (!yjdVar.F()) {
                BrandingValues brandingValues = branding.v;
                BrandingValues.Companion.getClass();
                if (jl40.l(brandingValues, BrandingValues.c)) {
                    return;
                }
            }
            yjdVar.e(serialDescriptor, 21, BrandingValues$$serializer.INSTANCE, branding.v);
        }

        /* renamed from: b, reason: from getter */
        public final RideTimeAppearance getS() {
            return this.s;
        }

        /* renamed from: c, reason: from getter */
        public final Type getC() {
            return this.c;
        }

        /* renamed from: d, reason: from getter */
        public final String getI() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Branding)) {
                return false;
            }
            Branding branding = (Branding) obj;
            return jl40.l(this.a, branding.a) && this.b == branding.b && this.c == branding.c && jl40.l(this.d, branding.d) && jl40.l(this.e, branding.e) && jl40.l(this.f, branding.f) && this.g == branding.g && this.h == branding.h && jl40.l(this.i, branding.i) && jl40.l(this.j, branding.j) && jl40.l(this.k, branding.k) && jl40.l(this.l, branding.l) && jl40.l(this.m, branding.m) && jl40.l(this.n, branding.n) && jl40.l(this.o, branding.o) && jl40.l(this.p, branding.p) && jl40.l(this.q, branding.q) && jl40.l(this.r, branding.r) && jl40.l(this.s, branding.s) && jl40.l(this.t, branding.t) && jl40.l(this.u, branding.u) && jl40.l(this.v, branding.v);
        }

        public final int hashCode() {
            Tooltip tooltip = this.a;
            int hashCode = (tooltip == null ? 0 : tooltip.hashCode()) * 31;
            Action action = this.b;
            int hashCode2 = (hashCode + (action == null ? 0 : action.hashCode())) * 31;
            Type type = this.c;
            int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
            String str = this.d;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int e = unr0.e(unr0.e((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g), 31, this.h);
            String str4 = this.i;
            int hashCode6 = (this.j.hashCode() + ((e + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
            String str5 = this.k;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.l;
            int hashCode8 = (this.m.hashCode() + ((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31;
            LongSearchV2 longSearchV2 = this.n;
            int hashCode9 = (hashCode8 + (longSearchV2 == null ? 0 : longSearchV2.hashCode())) * 31;
            TariffPopup tariffPopup = this.o;
            int hashCode10 = (hashCode9 + (tariffPopup == null ? 0 : tariffPopup.hashCode())) * 31;
            SummaryCardPromo summaryCardPromo = this.p;
            int hashCode11 = (hashCode10 + (summaryCardPromo == null ? 0 : summaryCardPromo.hashCode())) * 31;
            String str7 = this.q;
            int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            IconAppearance iconAppearance = this.r;
            int hashCode13 = (hashCode12 + (iconAppearance == null ? 0 : iconAppearance.hashCode())) * 31;
            RideTimeAppearance rideTimeAppearance = this.s;
            return this.v.a.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((hashCode13 + (rideTimeAppearance != null ? rideTimeAppearance.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Branding(tooltip=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", type=");
            sb.append(this.c);
            sb.append(", redirectClass=");
            sb.append(this.d);
            sb.append(", title=");
            g8e.D(sb, this.e, ", subtitle=", this.f, ", hasChevron=");
            nnm.v(", shouldSwapTexts=", ", value=", sb, this.g, this.h);
            sb.append(this.i);
            sb.append(", extra=");
            sb.append(this.j);
            sb.append(", iconTag=");
            g8e.D(sb, this.k, ", deeplink=", this.l, ", modifierInfo=");
            sb.append(this.m);
            sb.append(", longSearchV2=");
            sb.append(this.n);
            sb.append(", popup=");
            sb.append(this.o);
            sb.append(", summaryCardPromo=");
            sb.append(this.p);
            sb.append(", textColor=");
            sb.append(this.q);
            sb.append(", iconAppearance=");
            sb.append(this.r);
            sb.append(", rideTimeAppearance=");
            sb.append(this.s);
            sb.append(", cashbackActiveState=");
            sb.append(this.t);
            sb.append(", cashbackInactiveState=");
            sb.append(this.u);
            sb.append(", values=");
            sb.append(this.v);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding$Tooltip;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/z3", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Tooltip {
            public static final z3 Companion = new z3();
            public final String a;

            public /* synthetic */ Tooltip(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Tooltip) && jl40.l(this.a, ((Tooltip) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return oyr.p("Tooltip(text=", this.a, Extension.C_BRAKE);
            }

            public Tooltip() {
                this.a = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding$IconAppearance;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/x3", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class IconAppearance {
            public static final x3 Companion = new x3();
            public final String a;
            public final String b;

            public /* synthetic */ IconAppearance(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconAppearance)) {
                    return false;
                }
                IconAppearance iconAppearance = (IconAppearance) obj;
                return jl40.l(this.a, iconAppearance.a) && jl40.l(this.b, iconAppearance.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return unr0.p("IconAppearance(foregroundColor=", this.a, ", backgroundColor=", this.b, Extension.C_BRAKE);
            }

            public IconAppearance() {
                this.a = null;
                this.b = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding$RideTimeAppearance;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/y3", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class RideTimeAppearance {
            public static final y3 Companion = new y3();
            public final String a;
            public final String b;

            public /* synthetic */ RideTimeAppearance(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
            }

            /* renamed from: a, reason: from getter */
            public final String getB() {
                return this.b;
            }

            /* renamed from: b, reason: from getter */
            public final String getA() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RideTimeAppearance)) {
                    return false;
                }
                RideTimeAppearance rideTimeAppearance = (RideTimeAppearance) obj;
                return jl40.l(this.a, rideTimeAppearance.a) && jl40.l(this.b, rideTimeAppearance.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return unr0.p("RideTimeAppearance(textColor=", this.a, ", backgroundColor=", this.b, Extension.C_BRAKE);
            }

            public RideTimeAppearance() {
                this.a = null;
                this.b = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding$Extra;", "", "Companion", "CostCoverage", "com/yandex/go/zone/dto/objects/v3", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Extra {
            public static final v3 Companion = new v3();
            public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(19)), null};
            public static final Extra e = new Extra(0);
            public final lv90 a;
            public final CostCoverage b;
            public final String c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Branding$Extra$CostCoverage;", "", "Companion", "com/yandex/go/zone/dto/objects/w3", "FULL", "PARTIAL", "UNKNOWN", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            /* loaded from: classes14.dex */
            public static final class CostCoverage {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ CostCoverage[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final w3 Companion;
                public static final CostCoverage FULL;
                public static final CostCoverage PARTIAL;
                public static final CostCoverage UNKNOWN;

                static {
                    CostCoverage costCoverage = new CostCoverage("FULL", 0);
                    FULL = costCoverage;
                    CostCoverage costCoverage2 = new CostCoverage("PARTIAL", 1);
                    PARTIAL = costCoverage2;
                    CostCoverage costCoverage3 = new CostCoverage("UNKNOWN", 2);
                    UNKNOWN = costCoverage3;
                    CostCoverage[] costCoverageArr = {costCoverage, costCoverage2, costCoverage3};
                    $VALUES = costCoverageArr;
                    $ENTRIES = kotlin.enums.a.a(costCoverageArr);
                    Companion = new w3();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(20));
                }

                public static CostCoverage valueOf(String str) {
                    return (CostCoverage) Enum.valueOf(CostCoverage.class, str);
                }

                public static CostCoverage[] values() {
                    return (CostCoverage[]) $VALUES.clone();
                }
            }

            public /* synthetic */ Extra(int i, lv90 lv90Var, CostCoverage costCoverage, String str) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = lv90Var;
                }
                if ((i & 2) == 0) {
                    this.b = CostCoverage.UNKNOWN;
                } else {
                    this.b = costCoverage;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extra)) {
                    return false;
                }
                Extra extra = (Extra) obj;
                return jl40.l(this.a, extra.a) && this.b == extra.b && jl40.l(this.c, extra.c);
            }

            public final int hashCode() {
                lv90 lv90Var = this.a;
                int hashCode = (this.b.hashCode() + ((lv90Var == null ? 0 : lv90Var.hashCode()) * 31)) * 31;
                String str = this.c;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Extra(payment=");
                sb.append(this.a);
                sb.append(", costCoverage=");
                sb.append(this.b);
                sb.append(", bannerId=");
                return oyr.t(sb, this.c, Extension.C_BRAKE);
            }

            public Extra() {
                this(0);
            }

            public Extra(int i) {
                CostCoverage costCoverage = CostCoverage.UNKNOWN;
                this.a = null;
                this.b = costCoverage;
                this.c = null;
            }
        }

        public Branding() {
            Extra.Companion.getClass();
            Extra extra = Extra.e;
            TariffModifierInfo tariffModifierInfo = TariffModifierInfo.d;
            j jVar = BrandingCashbackStyle.Companion;
            jVar.getClass();
            BrandingCashbackStyle brandingCashbackStyle = BrandingCashbackStyle.c;
            jVar.getClass();
            BrandingValues.Companion.getClass();
            BrandingValues brandingValues = BrandingValues.c;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = false;
            this.h = false;
            this.i = null;
            this.j = extra;
            this.k = null;
            this.l = null;
            this.m = tariffModifierInfo;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = brandingCashbackStyle;
            this.u = brandingCashbackStyle;
            this.v = brandingValues;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Requirements;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/l4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Requirements {
        public static final l4 Companion = new l4();
        public final boolean a;

        public /* synthetic */ Requirements(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Requirements) && this.a == ((Requirements) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return nzs.b("Requirements(destination=", Extension.C_BRAKE, this.a);
        }

        public Requirements() {
            this.a = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$QueueOnSearchDisplayInfo;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/i4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class QueueOnSearchDisplayInfo {
        public static final i4 Companion = new i4();
        public final QueueScreen a;

        public /* synthetic */ QueueOnSearchDisplayInfo(int i, QueueScreen queueScreen) {
            if ((i & 1) == 0) {
                this.a = QueueScreen.g;
            } else {
                this.a = queueScreen;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QueueOnSearchDisplayInfo) && jl40.l(this.a, ((QueueOnSearchDisplayInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "QueueOnSearchDisplayInfo(initialScreen=" + this.a + Extension.C_BRAKE;
        }

        public QueueOnSearchDisplayInfo() {
            this.a = QueueScreen.g;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$RideTimeAppearance;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/n4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class RideTimeAppearance {
        public static final n4 Companion = new n4();
        public final String a;

        public /* synthetic */ RideTimeAppearance(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RideTimeAppearance) && jl40.l(this.a, ((RideTimeAppearance) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("RideTimeAppearance(startIconImageTag=", this.a, Extension.C_BRAKE);
        }

        public RideTimeAppearance() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$SearchingPulsarDTO;", "", "Companion", "SearchingPulsar", "$serializer", "com/yandex/go/zone/dto/objects/q4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class SearchingPulsarDTO {
        public static final q4 Companion = new q4();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(27)), null};
        public final SearchingPulsar a;
        public final int b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$SearchingPulsarDTO$SearchingPulsar;", "", "Companion", "com/yandex/go/zone/dto/objects/r4", JCP.RAW_PREFIX, "TWO_CIRCLES", "WIDE_CIRCLE", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class SearchingPulsar {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ SearchingPulsar[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final r4 Companion;
            public static final SearchingPulsar NONE;
            public static final SearchingPulsar TWO_CIRCLES;
            public static final SearchingPulsar WIDE_CIRCLE;

            static {
                SearchingPulsar searchingPulsar = new SearchingPulsar(JCP.RAW_PREFIX, 0);
                NONE = searchingPulsar;
                SearchingPulsar searchingPulsar2 = new SearchingPulsar("TWO_CIRCLES", 1);
                TWO_CIRCLES = searchingPulsar2;
                SearchingPulsar searchingPulsar3 = new SearchingPulsar("WIDE_CIRCLE", 2);
                WIDE_CIRCLE = searchingPulsar3;
                SearchingPulsar[] searchingPulsarArr = {searchingPulsar, searchingPulsar2, searchingPulsar3};
                $VALUES = searchingPulsarArr;
                $ENTRIES = kotlin.enums.a.a(searchingPulsarArr);
                Companion = new r4();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(28));
            }

            public static SearchingPulsar valueOf(String str) {
                return (SearchingPulsar) Enum.valueOf(SearchingPulsar.class, str);
            }

            public static SearchingPulsar[] values() {
                return (SearchingPulsar[]) $VALUES.clone();
            }
        }

        public /* synthetic */ SearchingPulsarDTO(int i, SearchingPulsar searchingPulsar, int i2) {
            this.a = (i & 1) == 0 ? null : searchingPulsar;
            if ((i & 2) == 0) {
                this.b = -1;
            } else {
                this.b = i2;
            }
        }

        public static final /* synthetic */ void b(SearchingPulsarDTO searchingPulsarDTO, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || searchingPulsarDTO.a != null) {
                yjdVar.g(serialDescriptor, 0, (KSerializer) c[0].getValue(), searchingPulsarDTO.a);
            }
            if (!yjdVar.F() && searchingPulsarDTO.b == -1) {
                return;
            }
            yjdVar.A(1, searchingPulsarDTO.b, serialDescriptor);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchingPulsarDTO)) {
                return false;
            }
            SearchingPulsarDTO searchingPulsarDTO = (SearchingPulsarDTO) obj;
            return this.a == searchingPulsarDTO.a && this.b == searchingPulsarDTO.b;
        }

        public final int hashCode() {
            SearchingPulsar searchingPulsar = this.a;
            return Integer.hashCode(this.b) + ((searchingPulsar == null ? 0 : searchingPulsar.hashCode()) * 31);
        }

        public final String toString() {
            return "SearchingPulsarDTO(type=" + this.a + ", index=" + this.b + Extension.C_BRAKE;
        }

        public SearchingPulsarDTO() {
            this.a = null;
            this.b = -1;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$ScheduledOrderViewDto;", "", "Companion", "Type", "com/yandex/go/zone/dto/objects/o4", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class ScheduledOrderViewDto {
        public static final o4 Companion = new o4();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(25)), null};
        public final Type a;
        public final String b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$ScheduledOrderViewDto$Type;", "", "Companion", "com/yandex/go/zone/dto/objects/p4", "DEFAULT", "TIMETABLE", "TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION", "DEEPLINK", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final p4 Companion;
            public static final Type DEEPLINK;
            public static final Type DEFAULT;
            public static final Type TIMETABLE;
            public static final Type TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION;

            static {
                Type type = new Type("DEFAULT", 0);
                DEFAULT = type;
                Type type2 = new Type("TIMETABLE", 1);
                TIMETABLE = type2;
                Type type3 = new Type("TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION", 2);
                TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION = type3;
                Type type4 = new Type("DEEPLINK", 3);
                DEEPLINK = type4;
                Type[] typeArr = {type, type2, type3, type4};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new p4();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(26));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        static {
            new ScheduledOrderViewDto(0);
        }

        public /* synthetic */ ScheduledOrderViewDto(int i, Type type, String str) {
            this.a = (i & 1) == 0 ? Type.DEFAULT : type;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public static final /* synthetic */ void d(ScheduledOrderViewDto scheduledOrderViewDto, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || scheduledOrderViewDto.a != Type.DEFAULT) {
                yjdVar.e(serialDescriptor, 0, (KSerializer) c[0].getValue(), scheduledOrderViewDto.a);
            }
            if (!yjdVar.F() && scheduledOrderViewDto.b == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 1, auu0.a, scheduledOrderViewDto.b);
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final Type getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScheduledOrderViewDto)) {
                return false;
            }
            ScheduledOrderViewDto scheduledOrderViewDto = (ScheduledOrderViewDto) obj;
            return this.a == scheduledOrderViewDto.a && jl40.l(this.b, scheduledOrderViewDto.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "ScheduledOrderViewDto(type=" + this.a + ", deeplink=" + this.b + Extension.C_BRAKE;
        }

        public ScheduledOrderViewDto() {
            this(0);
        }

        public ScheduledOrderViewDto(int i) {
            this.a = Type.DEFAULT;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$RequirementAlternatives;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/j4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class RequirementAlternatives {
        public static final j4 Companion = new j4();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(23))};
        public final String a;
        public final List b;

        public /* synthetic */ RequirementAlternatives(int i, String str, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public static final /* synthetic */ void d(RequirementAlternatives requirementAlternatives, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(requirementAlternatives.a, "")) {
                yjdVar.o(serialDescriptor, 0, requirementAlternatives.a);
            }
            if (!yjdVar.F() && jl40.l(requirementAlternatives.b, EmptyList.a)) {
                return;
            }
            yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), requirementAlternatives.b);
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final List getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequirementAlternatives)) {
                return false;
            }
            RequirementAlternatives requirementAlternatives = (RequirementAlternatives) obj;
            return jl40.l(this.a, requirementAlternatives.a) && jl40.l(this.b, requirementAlternatives.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return nnm.h("RequirementAlternatives(caption=", this.a, ", sections=", Extension.C_BRAKE, this.b);
        }

        public RequirementAlternatives() {
            this.a = "";
            this.b = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$TariffCard;", "", "Companion", "Bullet", "com/yandex/go/zone/dto/objects/w4", "com/yandex/go/zone/dto/objects/x4", "com/yandex/go/zone/dto/objects/y4", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TariffCard {
        public static final y4 Companion = new y4();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dwq0(0)), null};
        public static final TariffCard d = new TariffCard(0);
        public final List a;
        public final String b;

        public /* synthetic */ TariffCard(int i, List list, String str) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffCard)) {
                return false;
            }
            TariffCard tariffCard = (TariffCard) obj;
            return jl40.l(this.a, tariffCard.a) && jl40.l(this.b, tariffCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.i("TariffCard(bullets=", ", title=", this.b, Extension.C_BRAKE, this.a);
        }

        public TariffCard(int i) {
            this.a = EmptyList.a;
            this.b = "";
        }

        public TariffCard() {
            this(0);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$TariffCard$Bullet;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/s4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes15.dex */
        public static final /* data */ class Bullet {
            public static final s4 Companion = new s4();
            public final FormattedText a;
            public final FormattedText b;
            public final String c;
            public final w4 d;

            public /* synthetic */ Bullet(int i, FormattedText formattedText, FormattedText formattedText2, String str, w4 w4Var) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = "";
                } else {
                    this.c = str;
                }
                if ((i & 8) == 0) {
                    this.d = v4.INSTANCE;
                } else {
                    this.d = w4Var;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Bullet)) {
                    return false;
                }
                Bullet bullet = (Bullet) obj;
                return jl40.l(this.a, bullet.a) && jl40.l(this.b, bullet.b) && jl40.l(this.c, bullet.c) && jl40.l(this.d, bullet.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + unr0.b(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c);
            }

            public final String toString() {
                StringBuilder r = defpackage.n.r("Bullet(title=", this.a, ", subtitle=", this.b, ", iconTag=");
                r.append(this.c);
                r.append(", action=");
                r.append(this.d);
                r.append(Extension.C_BRAKE);
                return r.toString();
            }

            public Bullet() {
                FormattedText formattedText = FormattedText.c;
                v4 v4Var = v4.INSTANCE;
                this.a = formattedText;
                this.b = formattedText;
                this.c = "";
                this.d = v4Var;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$HighlightedTariffs;", "", "Companion", "HighlightedPrice", "com/yandex/go/zone/dto/objects/e4", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class HighlightedTariffs {
        public static final e4 Companion = new e4();
        public static final i3y[] c;
        public static final HighlightedTariffs d;
        public final List a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new wrp0(28)), kotlin.a.b(lazyThreadSafetyMode, new wrp0(29))};
            d = new HighlightedTariffs(0);
        }

        public /* synthetic */ HighlightedTariffs(List list, List list2, int i) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HighlightedTariffs)) {
                return false;
            }
            HighlightedTariffs highlightedTariffs = (HighlightedTariffs) obj;
            return jl40.l(this.a, highlightedTariffs.a) && jl40.l(this.b, highlightedTariffs.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.l("HighlightedTariffs(eta=", this.a, ", price=", this.b, Extension.C_BRAKE);
        }

        public HighlightedTariffs(int i) {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
        }

        public HighlightedTariffs() {
            this(0);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$HighlightedTariffs$HighlightedPrice;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/f4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes15.dex */
        public static final /* data */ class HighlightedPrice {
            public static final f4 Companion = new f4();
            public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(22))};
            public final String a;
            public final FormattedText b;
            public final boolean c;
            public final String d;
            public final String e;
            public final Map f;

            public /* synthetic */ HighlightedPrice(int i, String str, FormattedText formattedText, boolean z, String str2, String str3, Map map) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText;
                }
                if ((i & 4) == 0) {
                    this.c = false;
                } else {
                    this.c = z;
                }
                if ((i & 8) == 0) {
                    this.d = "";
                } else {
                    this.d = str2;
                }
                if ((i & 16) == 0) {
                    this.e = "";
                } else {
                    this.e = str3;
                }
                if ((i & 32) == 0) {
                    this.f = kotlin.collections.b.f();
                } else {
                    this.f = map;
                }
            }

            /* renamed from: a, reason: from getter */
            public final String getD() {
                return this.d;
            }

            /* renamed from: b, reason: from getter */
            public final FormattedText getB() {
                return this.b;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getC() {
                return this.c;
            }

            /* renamed from: d, reason: from getter */
            public final String getA() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HighlightedPrice)) {
                    return false;
                }
                HighlightedPrice highlightedPrice = (HighlightedPrice) obj;
                return jl40.l(this.a, highlightedPrice.a) && jl40.l(this.b, highlightedPrice.b) && this.c == highlightedPrice.c && jl40.l(this.d, highlightedPrice.d) && jl40.l(this.e, highlightedPrice.e) && jl40.l(this.f, highlightedPrice.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + unr0.b(unr0.b(unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d), 31, this.e);
            }

            public final String toString() {
                StringBuilder q = xvz.q("HighlightedPrice(tariffClass=", this.a, ", price=", ", showTariffPrice=", this.b);
                unr0.A(", contentDescription=", this.d, ", priceFormat=", q, this.c);
                q.append(this.e);
                q.append(", additionalArgs=");
                q.append(this.f);
                q.append(Extension.C_BRAKE);
                return q.toString();
            }

            public HighlightedPrice() {
                FormattedText formattedText = FormattedText.c;
                Map f = kotlin.collections.b.f();
                this.a = "";
                this.b = formattedText;
                this.c = false;
                this.d = "";
                this.e = "";
                this.f = f;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$RideTime;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/m4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class RideTime {
        public static final m4 Companion = new m4();
        public final String a;
        public final Integer b;
        public final RideTimeAppearance c;

        public /* synthetic */ RideTime(int i, String str, Integer num, RideTimeAppearance rideTimeAppearance) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = rideTimeAppearance;
            }
        }

        public static final /* synthetic */ void d(RideTime rideTime, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || rideTime.a != null) {
                yjdVar.g(serialDescriptor, 0, auu0.a, rideTime.a);
            }
            if (yjdVar.F() || rideTime.b != null) {
                yjdVar.g(serialDescriptor, 1, h6w.a, rideTime.b);
            }
            if (!yjdVar.F() && rideTime.c == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 2, ServiceLevel$RideTimeAppearance$$serializer.INSTANCE, rideTime.c);
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final RideTimeAppearance getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final Integer getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RideTime)) {
                return false;
            }
            RideTime rideTime = (RideTime) obj;
            return jl40.l(this.a, rideTime.a) && jl40.l(this.b, rideTime.b) && jl40.l(this.c, rideTime.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            RideTimeAppearance rideTimeAppearance = this.c;
            return hashCode2 + (rideTimeAppearance != null ? rideTimeAppearance.a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder q = defpackage.n.q("RideTime(time=", this.b, this.a, ", timeInSeconds=", ", timeAppearance=");
            q.append(this.c);
            q.append(Extension.C_BRAKE);
            return q.toString();
        }

        public RideTime() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$TariffDetail;", "", "Companion", "com/yandex/go/zone/dto/objects/z4", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class TariffDetail {
        public static final z4 Companion = new z4();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ TariffDetail(int i, String str, String str2, String str3) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public static final /* synthetic */ void e(TariffDetail tariffDetail, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(tariffDetail.a, "")) {
                yjdVar.o(serialDescriptor, 0, tariffDetail.a);
            }
            if (yjdVar.F() || !jl40.l(tariffDetail.b, "")) {
                yjdVar.o(serialDescriptor, 1, tariffDetail.b);
            }
            if (!yjdVar.F() && jl40.l(tariffDetail.c, "")) {
                return;
            }
            yjdVar.o(serialDescriptor, 2, tariffDetail.c);
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final boolean c() {
            return "icon".equals(this.a);
        }

        public final boolean d() {
            return "requirement".equals(this.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffDetail)) {
                return false;
            }
            TariffDetail tariffDetail = (TariffDetail) obj;
            return jl40.l(this.a, tariffDetail.a) && jl40.l(this.b, tariffDetail.b) && jl40.l(this.c, tariffDetail.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("TariffDetail(type=", this.a, ", typeDetails=", this.b, ", value="), this.c, Extension.C_BRAKE);
        }

        public TariffDetail() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$TariffPopup;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/a5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class TariffPopup {
        public static final a5 Companion = new a5();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ TariffPopup(int i, String str, String str2, String str3) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TariffPopup)) {
                return false;
            }
            TariffPopup tariffPopup = (TariffPopup) obj;
            return jl40.l(this.a, tariffPopup.a) && jl40.l(this.b, tariffPopup.b) && jl40.l(this.c, tariffPopup.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("TariffPopup(title=", this.a, ", text=", this.b, ", buttonTitle="), this.c, Extension.C_BRAKE);
        }

        public TariffPopup() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$RequirementAlternativesSection;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/k4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class RequirementAlternativesSection {
        public static final k4 Companion = new k4();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(24)), null};
        public final String a;
        public final List b;
        public final Integer c;

        public /* synthetic */ RequirementAlternativesSection(int i, Integer num, String str, List list) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequirementAlternativesSection)) {
                return false;
            }
            RequirementAlternativesSection requirementAlternativesSection = (RequirementAlternativesSection) obj;
            return jl40.l(this.a, requirementAlternativesSection.a) && jl40.l(this.b, requirementAlternativesSection.b) && jl40.l(this.c, requirementAlternativesSection.c);
        }

        public final int hashCode() {
            String str = this.a;
            int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            Integer num = this.c;
            return c + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return oo31.j(xvz.r("RequirementAlternativesSection(caption=", this.a, ", requirementKeys=", this.b, ", deliveryIntervalsIndex="), this.c, Extension.C_BRAKE);
        }

        public RequirementAlternativesSection() {
            this.a = null;
            this.b = EmptyList.a;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$DescriptionParts;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/c4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class DescriptionParts {
        public static final c4 Companion = new c4();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ DescriptionParts(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public static final /* synthetic */ void b(DescriptionParts descriptionParts, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || descriptionParts.a != null) {
                yjdVar.g(serialDescriptor, 0, auu0.a, descriptionParts.a);
            }
            if (yjdVar.F() || descriptionParts.b != null) {
                yjdVar.g(serialDescriptor, 1, auu0.a, descriptionParts.b);
            }
            if (yjdVar.F() || descriptionParts.c != null) {
                yjdVar.g(serialDescriptor, 2, auu0.a, descriptionParts.c);
            }
            if (!yjdVar.F() && descriptionParts.d == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 3, auu0.a, descriptionParts.d);
        }

        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DescriptionParts)) {
                return false;
            }
            DescriptionParts descriptionParts = (DescriptionParts) obj;
            return jl40.l(this.a, descriptionParts.a) && jl40.l(this.b, descriptionParts.b) && jl40.l(this.c, descriptionParts.c) && jl40.l(this.d, descriptionParts.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return g8e.r(b64.v("DescriptionParts(prefix=", this.a, ", suffix=", this.b, ", value="), this.c, ", valueUndiscounted=", this.d, Extension.C_BRAKE);
        }

        public DescriptionParts() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$LongSearchV2;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/g4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class LongSearchV2 {
        public static final g4 Companion = new g4();
        public final Integer a;
        public final String b;
        public final String c;
        public final Integer d;
        public final Popup e;

        public /* synthetic */ LongSearchV2(int i, Integer num, String str, String str2, Integer num2, Popup popup) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = popup;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongSearchV2)) {
                return false;
            }
            LongSearchV2 longSearchV2 = (LongSearchV2) obj;
            return jl40.l(this.a, longSearchV2.a) && jl40.l(this.b, longSearchV2.b) && jl40.l(this.c, longSearchV2.c) && jl40.l(this.d, longSearchV2.d) && jl40.l(this.e, longSearchV2.e);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.d;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Popup popup = this.e;
            return hashCode4 + (popup != null ? popup.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LongSearchV2(collapseSearchCardTimeoutMillis=");
            sb.append(this.a);
            sb.append(", pinHintRadiusChange=");
            sb.append(this.b);
            sb.append(", pinHintStartSearch=");
            vfc.w(this.d, this.c, ", pollingIntervalMillis=", ", popup=", sb);
            sb.append(this.e);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        public LongSearchV2() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$Popup;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/h4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class Popup {
        public static final h4 Companion = new h4();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public /* synthetic */ Popup(String str, String str2, String str3, String str4, int i, String str5) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str5;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Popup)) {
                return false;
            }
            Popup popup = (Popup) obj;
            return jl40.l(this.a, popup.a) && jl40.l(this.b, popup.b) && jl40.l(this.c, popup.c) && jl40.l(this.d, popup.d) && jl40.l(this.e, popup.e);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("Popup(buttonTitle=", this.a, ", description=", this.b, ", searchCardSubtitle=");
            g8e.D(v, this.c, ", searchCardTitle=", this.d, ", title=");
            return oyr.t(v, this.e, Extension.C_BRAKE);
        }

        public Popup() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ServiceLevel$ForceSuggest;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/d4", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class ForceSuggest {
        public static final d4 Companion = new d4();
        public final String a;
        public final String b;
        public final String c;
        public final n7v d;
        public final String e;
        public final String f;
        public final String g;

        public /* synthetic */ ForceSuggest(int i, String str, String str2, String str3, n7v n7vVar, String str4, String str5, String str6) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = n7vVar;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str5;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str6;
            }
        }

        public static final /* synthetic */ void b(ForceSuggest forceSuggest, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || forceSuggest.a != null) {
                yjdVar.g(serialDescriptor, 0, auu0.a, forceSuggest.a);
            }
            if (yjdVar.F() || forceSuggest.b != null) {
                yjdVar.g(serialDescriptor, 1, auu0.a, forceSuggest.b);
            }
            if (yjdVar.F() || forceSuggest.c != null) {
                yjdVar.g(serialDescriptor, 2, auu0.a, forceSuggest.c);
            }
            if (yjdVar.F() || forceSuggest.d != null) {
                yjdVar.g(serialDescriptor, 3, c7v.a, forceSuggest.d);
            }
            if (yjdVar.F() || forceSuggest.e != null) {
                yjdVar.g(serialDescriptor, 4, auu0.a, forceSuggest.e);
            }
            if (yjdVar.F() || forceSuggest.f != null) {
                yjdVar.g(serialDescriptor, 5, auu0.a, forceSuggest.f);
            }
            if (!yjdVar.F() && forceSuggest.g == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 6, auu0.a, forceSuggest.g);
        }

        public final boolean a() {
            String str;
            String str2;
            String str3;
            String str4 = this.a;
            if (str4 == null || str4.length() == 0 || (str = this.b) == null || str.length() == 0 || (str2 = this.c) == null || str2.length() == 0 || (str3 = this.e) == null || str3.length() == 0) {
                return false;
            }
            String str5 = this.f;
            if (str5 != null && str5.length() != 0) {
                return true;
            }
            String str6 = this.g;
            return (str6 == null || str6.length() == 0) ? false : true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForceSuggest)) {
                return false;
            }
            ForceSuggest forceSuggest = (ForceSuggest) obj;
            return jl40.l(this.a, forceSuggest.a) && jl40.l(this.b, forceSuggest.b) && jl40.l(this.c, forceSuggest.c) && jl40.l(this.d, forceSuggest.d) && jl40.l(this.e, forceSuggest.e) && jl40.l(this.f, forceSuggest.f) && jl40.l(this.g, forceSuggest.g);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            n7v n7vVar = this.d;
            int hashCode4 = (hashCode3 + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
            String str4 = this.e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.g;
            return hashCode6 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("ForceSuggest(fromClass=", this.a, ", title=", this.b, ", description=");
            v.append(this.c);
            v.append(", image=");
            v.append(this.d);
            v.append(", footer=");
            g8e.D(v, this.e, ", firstButtonTitle=", this.f, ", secondButtonTitle=");
            return oyr.t(v, this.g, Extension.C_BRAKE);
        }

        public ForceSuggest() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
        }
    }

    public ServiceLevel() {
        this(0);
    }

    public ServiceLevel(DescriptionParts descriptionParts, DescriptionParts descriptionParts2, List list, com.yandex.go.zone.dto.response.c cVar, String str, String str2, String str3, PriceMeta priceMeta, String str4, String str5, RideTime rideTime, int i, TariffUnavailable tariffUnavailable, List list2, boolean z, String str6, Boolean bool, jsq0 jsq0Var, Requirements requirements, SearchScreen searchScreen, QueueOnSearchDisplayInfo queueOnSearchDisplayInfo, String str7, String str8, List list3, String str9, CouponCheckResult couponCheckResult, boolean z2, BrandingType brandingType, PaidOptions paidOptions, ComboOrder comboOrder, boolean z3, String str10, Selector selector, boolean z4, String str11, List list4, boolean z5, DriveExtra driveExtra, ScootersExtra scootersExtra, DeliveryExtra deliveryExtra, ComboExtra comboExtra, SummaryStyle summaryStyle, f5 f5Var, TariffCard tariffCard, String str12, SearchingPulsarDTO searchingPulsarDTO, boolean z6, RequirementAlternatives requirementAlternatives, HighlightedTariffs highlightedTariffs, AuctionInfo auctionInfo, ScheduledOrderViewDto scheduledOrderViewDto, SuggestsPreferences suggestsPreferences) {
        this.a = descriptionParts;
        this.b = descriptionParts2;
        this.c = list;
        this.d = cVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = priceMeta;
        this.i = str4;
        this.j = str5;
        this.k = rideTime;
        this.l = i;
        this.m = tariffUnavailable;
        this.n = list2;
        this.o = z;
        this.p = str6;
        this.q = bool;
        this.r = jsq0Var;
        this.s = requirements;
        this.t = searchScreen;
        this.u = queueOnSearchDisplayInfo;
        this.v = str7;
        this.w = str8;
        this.x = list3;
        this.y = str9;
        this.z = couponCheckResult;
        this.A = z2;
        this.B = brandingType;
        this.C = paidOptions;
        this.D = comboOrder;
        this.E = z3;
        this.F = str10;
        this.G = selector;
        this.H = z4;
        this.I = str11;
        this.J = list4;
        this.K = z5;
        this.L = driveExtra;
        this.M = scootersExtra;
        this.N = deliveryExtra;
        this.O = comboExtra;
        this.P = summaryStyle;
        this.Q = f5Var;
        this.R = tariffCard;
        this.S = str12;
        this.T = searchingPulsarDTO;
        this.U = z6;
        this.V = requirementAlternatives;
        this.W = highlightedTariffs;
        this.X = auctionInfo;
        this.Y = scheduledOrderViewDto;
        this.Z = suggestsPreferences;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ServiceLevel(int i) {
        this(null, null, null, null, null, "", null, null, null, null, null, 0, null, EmptyList.a, false, null, null, null, null, null, null, null, null, null, null, null, false, null, r29, r30, false, "", Selector.i, false, null, null, false, null, null, null, null, null, r43, r44, null, null, false, null, HighlightedTariffs.d, null, null, null);
        PaidOptions paidOptions = PaidOptions.g;
        ComboOrder comboOrder = ComboOrder.b;
        e5 e5Var = e5.INSTANCE;
        TariffCard tariffCard = TariffCard.d;
        HighlightedTariffs.Companion.getClass();
    }
}
