package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselProductV2Dto;", "", "productType", "", "card", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardV2Dto;", "headerTopButtons", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/HeaderTopButtonsDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/dashboard/internal/data/dto/CardV2Dto;Ljava/util/List;)V", "getProductType", "()Ljava/lang/String;", "getCard", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/CardV2Dto;", "getHeaderTopButtons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CarouselProductV2Dto {
    private final CardV2Dto card;
    private final List<HeaderTopButtonsDto> headerTopButtons;
    private final String productType;

    public CarouselProductV2Dto(@Json(name = "product_type") String str, @Json(name = "card") CardV2Dto cardV2Dto, @Json(name = "header_top_buttons") List<HeaderTopButtonsDto> list) {
        this.productType = str;
        this.card = cardV2Dto;
        this.headerTopButtons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarouselProductV2Dto copy$default(CarouselProductV2Dto carouselProductV2Dto, String str, CardV2Dto cardV2Dto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = carouselProductV2Dto.productType;
        }
        if ((i & 2) != 0) {
            cardV2Dto = carouselProductV2Dto.card;
        }
        if ((i & 4) != 0) {
            list = carouselProductV2Dto.headerTopButtons;
        }
        return carouselProductV2Dto.copy(str, cardV2Dto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component2, reason: from getter */
    public final CardV2Dto getCard() {
        return this.card;
    }

    public final List<HeaderTopButtonsDto> component3() {
        return this.headerTopButtons;
    }

    public final CarouselProductV2Dto copy(@Json(name = "product_type") String productType, @Json(name = "card") CardV2Dto card, @Json(name = "header_top_buttons") List<HeaderTopButtonsDto> headerTopButtons) {
        return new CarouselProductV2Dto(productType, card, headerTopButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselProductV2Dto)) {
            return false;
        }
        CarouselProductV2Dto carouselProductV2Dto = (CarouselProductV2Dto) other;
        return jl40.l(this.productType, carouselProductV2Dto.productType) && jl40.l(this.card, carouselProductV2Dto.card) && jl40.l(this.headerTopButtons, carouselProductV2Dto.headerTopButtons);
    }

    public final CardV2Dto getCard() {
        return this.card;
    }

    public final List<HeaderTopButtonsDto> getHeaderTopButtons() {
        return this.headerTopButtons;
    }

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        return this.headerTopButtons.hashCode() + ((this.card.hashCode() + (this.productType.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.productType;
        CardV2Dto cardV2Dto = this.card;
        List<HeaderTopButtonsDto> list = this.headerTopButtons;
        StringBuilder sb = new StringBuilder("CarouselProductV2Dto(productType=");
        sb.append(str);
        sb.append(", card=");
        sb.append(cardV2Dto);
        sb.append(", headerTopButtons=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
