package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.kju0;
import defpackage.unr0;
import defpackage.vfc;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselResponseV2;", "", "cardsPartial", "", kju0.b, "", "Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardDetailsV2;", "promos", "Lcom/ybsdk/feature/card/internal/network/dto/CarouselCardPromoV2;", "carousel", "Lcom/ybsdk/feature/card/internal/network/dto/CarouselReferenceDto;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCardsPartial", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCards", "()Ljava/util/List;", "getPromos", "getCarousel", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/ybsdk/feature/card/internal/network/dto/GetCardCarouselResponseV2;", "equals", "other", "hashCode", "", "toString", "", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetCardCarouselResponseV2 {
    private final List<CarouselCardDetailsV2> cards;
    private final Boolean cardsPartial;
    private final List<CarouselReferenceDto> carousel;
    private final List<CarouselCardPromoV2> promos;

    public GetCardCarouselResponseV2(@Json(name = "cards_partial") Boolean bool, @Json(name = "cards") List<CarouselCardDetailsV2> list, @Json(name = "promos") List<CarouselCardPromoV2> list2, @Json(name = "carousel") List<CarouselReferenceDto> list3) {
        this.cardsPartial = bool;
        this.cards = list;
        this.promos = list2;
        this.carousel = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCardCarouselResponseV2 copy$default(GetCardCarouselResponseV2 getCardCarouselResponseV2, Boolean bool, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = getCardCarouselResponseV2.cardsPartial;
        }
        if ((i & 2) != 0) {
            list = getCardCarouselResponseV2.cards;
        }
        if ((i & 4) != 0) {
            list2 = getCardCarouselResponseV2.promos;
        }
        if ((i & 8) != 0) {
            list3 = getCardCarouselResponseV2.carousel;
        }
        return getCardCarouselResponseV2.copy(bool, list, list2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getCardsPartial() {
        return this.cardsPartial;
    }

    public final List<CarouselCardDetailsV2> component2() {
        return this.cards;
    }

    public final List<CarouselCardPromoV2> component3() {
        return this.promos;
    }

    public final List<CarouselReferenceDto> component4() {
        return this.carousel;
    }

    public final GetCardCarouselResponseV2 copy(@Json(name = "cards_partial") Boolean cardsPartial, @Json(name = "cards") List<CarouselCardDetailsV2> cards, @Json(name = "promos") List<CarouselCardPromoV2> promos, @Json(name = "carousel") List<CarouselReferenceDto> carousel) {
        return new GetCardCarouselResponseV2(cardsPartial, cards, promos, carousel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCardCarouselResponseV2)) {
            return false;
        }
        GetCardCarouselResponseV2 getCardCarouselResponseV2 = (GetCardCarouselResponseV2) other;
        return jl40.l(this.cardsPartial, getCardCarouselResponseV2.cardsPartial) && jl40.l(this.cards, getCardCarouselResponseV2.cards) && jl40.l(this.promos, getCardCarouselResponseV2.promos) && jl40.l(this.carousel, getCardCarouselResponseV2.carousel);
    }

    public final List<CarouselCardDetailsV2> getCards() {
        return this.cards;
    }

    public final Boolean getCardsPartial() {
        return this.cardsPartial;
    }

    public final List<CarouselReferenceDto> getCarousel() {
        return this.carousel;
    }

    public final List<CarouselCardPromoV2> getPromos() {
        return this.promos;
    }

    public int hashCode() {
        Boolean bool = this.cardsPartial;
        return this.carousel.hashCode() + unr0.c(unr0.c((bool == null ? 0 : bool.hashCode()) * 31, 31, this.cards), 31, this.promos);
    }

    public String toString() {
        Boolean bool = this.cardsPartial;
        List<CarouselCardDetailsV2> list = this.cards;
        List<CarouselCardPromoV2> list2 = this.promos;
        List<CarouselReferenceDto> list3 = this.carousel;
        StringBuilder sb = new StringBuilder("GetCardCarouselResponseV2(cardsPartial=");
        sb.append(bool);
        sb.append(", cards=");
        sb.append(list);
        sb.append(", promos=");
        return vfc.p(sb, list2, ", carousel=", list3, Extension.C_BRAKE);
    }
}
