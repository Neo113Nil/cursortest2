package com.yandex.go.chargers.offer.data.api;

import com.yandex.go.chargers.data.model.ChargersAttentionDto;
import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.data.model.ChargersStationInfoDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeDto;
import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.z1a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto;", "", "Companion", "Banner", "com/yandex/go/chargers/offer/data/api/h", "Address", "Pricing", "Header", "Notification", "DiscountsEntryPoint", "$serializer", "com/yandex/go/chargers/offer/data/api/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersOfferResponseDto {
    public static final i Companion = new i();
    public static final i3y[] v;
    public final String a;
    public final FormattedText b;
    public final ChargersStationInfoDto c;
    public final Address d;
    public final Banner e;
    public final Header f;
    public final ChargersAttentionDto g;
    public final FormattedText h;
    public final Pricing i;
    public final ChargersTariffDto j;
    public final List k;
    public final List l;
    public final ief m;
    public final ChargersPromoPlateDto n;
    public final ChargersSurgeDto o;
    public final List p;
    public final Notification q;
    public final DiscountsEntryPoint r;
    public final ChargersDiscountDto s;
    public final List t;
    public final List u;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        v = new i3y[]{null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z1a(19)), kotlin.a.b(lazyThreadSafetyMode, new z1a(20)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z1a(21)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z1a(22)), kotlin.a.b(lazyThreadSafetyMode, new z1a(23))};
    }

    public /* synthetic */ ChargersOfferResponseDto(int i, String str, FormattedText formattedText, ChargersStationInfoDto chargersStationInfoDto, Address address, Banner banner, Header header, ChargersAttentionDto chargersAttentionDto, FormattedText formattedText2, Pricing pricing, ChargersTariffDto chargersTariffDto, List list, List list2, ief iefVar, ChargersPromoPlateDto chargersPromoPlateDto, ChargersSurgeDto chargersSurgeDto, List list3, Notification notification, DiscountsEntryPoint discountsEntryPoint, ChargersDiscountDto chargersDiscountDto, List list4, List list5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = chargersStationInfoDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = address;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = banner;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = header;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = chargersAttentionDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = formattedText2;
        }
        if ((i & 256) == 0) {
            this.i = new Pricing(0);
        } else {
            this.i = pricing;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = chargersTariffDto;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
        int i2 = i & 2048;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.l = emptyList;
        } else {
            this.l = list2;
        }
        this.m = (i & 4096) == 0 ? ief.e : iefVar;
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = chargersPromoPlateDto;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = chargersSurgeDto;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = list3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = notification;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = discountsEntryPoint;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = chargersDiscountDto;
        }
        if ((524288 & i) == 0) {
            this.t = emptyList;
        } else {
            this.t = list4;
        }
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = list5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersOfferResponseDto)) {
            return false;
        }
        ChargersOfferResponseDto chargersOfferResponseDto = (ChargersOfferResponseDto) obj;
        return jl40.l(this.a, chargersOfferResponseDto.a) && jl40.l(this.b, chargersOfferResponseDto.b) && jl40.l(this.c, chargersOfferResponseDto.c) && jl40.l(this.d, chargersOfferResponseDto.d) && jl40.l(this.e, chargersOfferResponseDto.e) && jl40.l(this.f, chargersOfferResponseDto.f) && jl40.l(this.g, chargersOfferResponseDto.g) && jl40.l(this.h, chargersOfferResponseDto.h) && jl40.l(this.i, chargersOfferResponseDto.i) && jl40.l(this.j, chargersOfferResponseDto.j) && jl40.l(this.k, chargersOfferResponseDto.k) && jl40.l(this.l, chargersOfferResponseDto.l) && jl40.l(this.m, chargersOfferResponseDto.m) && jl40.l(this.n, chargersOfferResponseDto.n) && jl40.l(this.o, chargersOfferResponseDto.o) && jl40.l(this.p, chargersOfferResponseDto.p) && jl40.l(this.q, chargersOfferResponseDto.q) && jl40.l(this.r, chargersOfferResponseDto.r) && jl40.l(this.s, chargersOfferResponseDto.s) && jl40.l(this.t, chargersOfferResponseDto.t) && jl40.l(this.u, chargersOfferResponseDto.u);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        ChargersStationInfoDto chargersStationInfoDto = this.c;
        int hashCode3 = (hashCode2 + (chargersStationInfoDto == null ? 0 : chargersStationInfoDto.hashCode())) * 31;
        Address address = this.d;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        Banner banner = this.e;
        int hashCode5 = (hashCode4 + (banner == null ? 0 : banner.hashCode())) * 31;
        Header header = this.f;
        int hashCode6 = (hashCode5 + (header == null ? 0 : header.hashCode())) * 31;
        ChargersAttentionDto chargersAttentionDto = this.g;
        int hashCode7 = (hashCode6 + (chargersAttentionDto == null ? 0 : chargersAttentionDto.hashCode())) * 31;
        FormattedText formattedText2 = this.h;
        int hashCode8 = (this.i.hashCode() + ((hashCode7 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31)) * 31;
        ChargersTariffDto chargersTariffDto = this.j;
        int hashCode9 = (hashCode8 + (chargersTariffDto == null ? 0 : chargersTariffDto.hashCode())) * 31;
        List list = this.k;
        int hashCode10 = (this.m.hashCode() + unr0.c((hashCode9 + (list == null ? 0 : list.hashCode())) * 31, 31, this.l)) * 31;
        ChargersPromoPlateDto chargersPromoPlateDto = this.n;
        int hashCode11 = (hashCode10 + (chargersPromoPlateDto == null ? 0 : chargersPromoPlateDto.hashCode())) * 31;
        ChargersSurgeDto chargersSurgeDto = this.o;
        int hashCode12 = (hashCode11 + (chargersSurgeDto == null ? 0 : chargersSurgeDto.hashCode())) * 31;
        List list2 = this.p;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Notification notification = this.q;
        int hashCode14 = (hashCode13 + (notification == null ? 0 : notification.hashCode())) * 31;
        DiscountsEntryPoint discountsEntryPoint = this.r;
        int hashCode15 = (hashCode14 + (discountsEntryPoint == null ? 0 : discountsEntryPoint.hashCode())) * 31;
        ChargersDiscountDto chargersDiscountDto = this.s;
        int c = unr0.c((hashCode15 + (chargersDiscountDto == null ? 0 : chargersDiscountDto.hashCode())) * 31, 31, this.t);
        List list3 = this.u;
        return c + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("ChargersOfferResponseDto(offerId=", this.a, ", title=", ", station=", this.b);
        q.append(this.c);
        q.append(", address=");
        q.append(this.d);
        q.append(", banner=");
        q.append(this.e);
        q.append(", header=");
        q.append(this.f);
        q.append(", attentionHeader=");
        q.append(this.g);
        q.append(", legalTerms=");
        q.append(this.h);
        q.append(", pricing=");
        q.append(this.i);
        q.append(", tariff=");
        q.append(this.j);
        q.append(", attributes=");
        nnm.w(q, this.k, ", buttons=", this.l, ", currencyRules=");
        q.append(this.m);
        q.append(", promoPlate=");
        q.append(this.n);
        q.append(", surge=");
        q.append(this.o);
        q.append(", popups=");
        q.append(this.p);
        q.append(", notification=");
        q.append(this.q);
        q.append(", discountsEntryPoint=");
        q.append(this.r);
        q.append(", discount=");
        q.append(this.s);
        q.append(", tabs=");
        q.append(this.t);
        q.append(", offers=");
        return ly3.s(q, this.u, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$Pricing;", "", "Companion", "PlanItem", "$serializer", "com/yandex/go/chargers/offer/data/api/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Pricing {
        public static final m Companion = new m();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(25))};
        public final List a;

        public /* synthetic */ Pricing(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$Pricing$PlanItem;", "", "Companion", "Hint", "$serializer", "com/yandex/go/chargers/offer/data/api/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PlanItem {
            public static final n Companion = new n();
            public final FormattedText a;
            public final FormattedText b;
            public final Hint c;

            public /* synthetic */ PlanItem(int i, FormattedText formattedText, FormattedText formattedText2, Hint hint) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = hint;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$Pricing$PlanItem$Hint;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class Hint {
                public static final o Companion = new o();
                public final FormattedText a;

                public /* synthetic */ Hint(int i, FormattedText formattedText) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = formattedText;
                    }
                }

                public Hint() {
                    this.a = null;
                }
            }

            public PlanItem() {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
                this.c = null;
            }
        }

        public Pricing(int i) {
            this.a = EmptyList.a;
        }

        public Pricing() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$Notification;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Notification {
        public static final l Companion = new l();
        public final String a;
        public final FormattedText b;

        public /* synthetic */ Notification(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
        }

        public Notification() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$Address;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Address {
        public static final d Companion = new d();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ Address(int i, FormattedText formattedText, FormattedText formattedText2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = formattedText;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
        }

        public Address() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$DiscountsEntryPoint;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DiscountsEntryPoint {
        public static final j Companion = new j();
        public final String a;
        public final ChargersAttributeDto b;

        public /* synthetic */ DiscountsEntryPoint(int i, String str, ChargersAttributeDto chargersAttributeDto) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = chargersAttributeDto;
            }
        }

        public DiscountsEntryPoint() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$Header;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Header {
        public static final k Companion = new k();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ Header(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
        }

        public Header() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$Banner;", "", "Companion", "$serializer", "com/yandex/go/chargers/offer/data/api/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Banner {
        public static final e Companion = new e();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final ChargersProgressImageParamsDto d;
        public final String e;
        public final String f;
        public final ChargersAttributeDto g;
        public final h h;

        public /* synthetic */ Banner(int i, String str, FormattedText formattedText, FormattedText formattedText2, ChargersProgressImageParamsDto chargersProgressImageParamsDto, String str2, String str3, ChargersAttributeDto chargersAttributeDto, h hVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = chargersProgressImageParamsDto;
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
                this.g = null;
            } else {
                this.g = chargersAttributeDto;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = hVar;
            }
        }

        public Banner() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }
    }

    public ChargersOfferResponseDto(String str, FormattedText formattedText, ChargersStationInfoDto chargersStationInfoDto, Address address, Banner banner, Header header, ChargersAttentionDto chargersAttentionDto, FormattedText formattedText2, Pricing pricing, ChargersTariffDto chargersTariffDto, List list, List list2, ief iefVar, ChargersPromoPlateDto chargersPromoPlateDto, ChargersSurgeDto chargersSurgeDto, List list3, Notification notification, DiscountsEntryPoint discountsEntryPoint, ChargersDiscountDto chargersDiscountDto, List list4, List list5) {
        this.a = str;
        this.b = formattedText;
        this.c = chargersStationInfoDto;
        this.d = address;
        this.e = banner;
        this.f = header;
        this.g = chargersAttentionDto;
        this.h = formattedText2;
        this.i = pricing;
        this.j = chargersTariffDto;
        this.k = list;
        this.l = list2;
        this.m = iefVar;
        this.n = chargersPromoPlateDto;
        this.o = chargersSurgeDto;
        this.p = list3;
        this.q = notification;
        this.r = discountsEntryPoint;
        this.s = chargersDiscountDto;
        this.t = list4;
        this.u = list5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChargersOfferResponseDto() {
        this(null, null, null, null, null, null, null, null, r9, null, null, r12, r13, null, null, null, null, null, null, r12, null);
        Pricing pricing = new Pricing(0);
        ief iefVar = ief.e;
        EmptyList emptyList = EmptyList.a;
    }
}
