package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jw\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "", "paymentMethodId", "", "clientSelectionId", "paymentMethodType", "title", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "headerDescription", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "aftInfo", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/AftInfo;", "walletInfo", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/WalletInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/AftInfo;Lcom/ybsdk/feature/credit/deposit/internal/network/dto/WalletInfo;)V", "getPaymentMethodId", "()Ljava/lang/String;", "getClientSelectionId", "getPaymentMethodType", "getTitle", "()Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "getDescription", "getHeaderDescription", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAftInfo", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/AftInfo;", "getWalletInfo", "()Lcom/ybsdk/feature/credit/deposit/internal/network/dto/WalletInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodSheetItemDto {
    private final AftInfo aftInfo;
    private final String clientSelectionId;
    private final ColoredTextDto description;
    private final ColoredTextDto headerDescription;
    private final Themes<String> image;
    private final String paymentMethodId;
    private final String paymentMethodType;
    private final ColoredTextDto title;
    private final WalletInfo walletInfo;

    public /* synthetic */ PaymentMethodSheetItemDto(String str, String str2, String str3, ColoredTextDto coloredTextDto, ColoredTextDto coloredTextDto2, ColoredTextDto coloredTextDto3, Themes themes, AftInfo aftInfo, WalletInfo walletInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, coloredTextDto, (i & 16) != 0 ? null : coloredTextDto2, (i & 32) != 0 ? null : coloredTextDto3, (i & 64) != 0 ? null : themes, aftInfo, walletInfo);
    }

    public static /* synthetic */ PaymentMethodSheetItemDto copy$default(PaymentMethodSheetItemDto paymentMethodSheetItemDto, String str, String str2, String str3, ColoredTextDto coloredTextDto, ColoredTextDto coloredTextDto2, ColoredTextDto coloredTextDto3, Themes themes, AftInfo aftInfo, WalletInfo walletInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodSheetItemDto.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodSheetItemDto.clientSelectionId;
        }
        if ((i & 4) != 0) {
            str3 = paymentMethodSheetItemDto.paymentMethodType;
        }
        if ((i & 8) != 0) {
            coloredTextDto = paymentMethodSheetItemDto.title;
        }
        if ((i & 16) != 0) {
            coloredTextDto2 = paymentMethodSheetItemDto.description;
        }
        if ((i & 32) != 0) {
            coloredTextDto3 = paymentMethodSheetItemDto.headerDescription;
        }
        if ((i & 64) != 0) {
            themes = paymentMethodSheetItemDto.image;
        }
        if ((i & 128) != 0) {
            aftInfo = paymentMethodSheetItemDto.aftInfo;
        }
        if ((i & 256) != 0) {
            walletInfo = paymentMethodSheetItemDto.walletInfo;
        }
        AftInfo aftInfo2 = aftInfo;
        WalletInfo walletInfo2 = walletInfo;
        ColoredTextDto coloredTextDto4 = coloredTextDto3;
        Themes themes2 = themes;
        ColoredTextDto coloredTextDto5 = coloredTextDto2;
        String str4 = str3;
        return paymentMethodSheetItemDto.copy(str, str2, str4, coloredTextDto, coloredTextDto5, coloredTextDto4, themes2, aftInfo2, walletInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClientSelectionId() {
        return this.clientSelectionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component4, reason: from getter */
    public final ColoredTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final ColoredTextDto getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final ColoredTextDto getHeaderDescription() {
        return this.headerDescription;
    }

    public final Themes<String> component7() {
        return this.image;
    }

    /* renamed from: component8, reason: from getter */
    public final AftInfo getAftInfo() {
        return this.aftInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final WalletInfo getWalletInfo() {
        return this.walletInfo;
    }

    public final PaymentMethodSheetItemDto copy(@Json(name = "payment_method_id") String paymentMethodId, @Json(name = "client_selection_id") String clientSelectionId, @Json(name = "payment_method_type") String paymentMethodType, @Json(name = "title") ColoredTextDto title, @Json(name = "description") ColoredTextDto description, @Json(name = "header_description") ColoredTextDto headerDescription, @Json(name = "image") Themes<String> image, @Json(name = "aft_info") AftInfo aftInfo, @Json(name = "wallet_info") WalletInfo walletInfo) {
        return new PaymentMethodSheetItemDto(paymentMethodId, clientSelectionId, paymentMethodType, title, description, headerDescription, image, aftInfo, walletInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodSheetItemDto)) {
            return false;
        }
        PaymentMethodSheetItemDto paymentMethodSheetItemDto = (PaymentMethodSheetItemDto) other;
        return jl40.l(this.paymentMethodId, paymentMethodSheetItemDto.paymentMethodId) && jl40.l(this.clientSelectionId, paymentMethodSheetItemDto.clientSelectionId) && jl40.l(this.paymentMethodType, paymentMethodSheetItemDto.paymentMethodType) && jl40.l(this.title, paymentMethodSheetItemDto.title) && jl40.l(this.description, paymentMethodSheetItemDto.description) && jl40.l(this.headerDescription, paymentMethodSheetItemDto.headerDescription) && jl40.l(this.image, paymentMethodSheetItemDto.image) && jl40.l(this.aftInfo, paymentMethodSheetItemDto.aftInfo) && jl40.l(this.walletInfo, paymentMethodSheetItemDto.walletInfo);
    }

    public final AftInfo getAftInfo() {
        return this.aftInfo;
    }

    public final String getClientSelectionId() {
        return this.clientSelectionId;
    }

    public final ColoredTextDto getDescription() {
        return this.description;
    }

    public final ColoredTextDto getHeaderDescription() {
        return this.headerDescription;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final ColoredTextDto getTitle() {
        return this.title;
    }

    public final WalletInfo getWalletInfo() {
        return this.walletInfo;
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientSelectionId;
        int hashCode2 = (this.title.hashCode() + unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.paymentMethodType)) * 31;
        ColoredTextDto coloredTextDto = this.description;
        int hashCode3 = (hashCode2 + (coloredTextDto == null ? 0 : coloredTextDto.hashCode())) * 31;
        ColoredTextDto coloredTextDto2 = this.headerDescription;
        int hashCode4 = (hashCode3 + (coloredTextDto2 == null ? 0 : coloredTextDto2.hashCode())) * 31;
        Themes<String> themes = this.image;
        int hashCode5 = (hashCode4 + (themes == null ? 0 : themes.hashCode())) * 31;
        AftInfo aftInfo = this.aftInfo;
        int hashCode6 = (hashCode5 + (aftInfo == null ? 0 : aftInfo.hashCode())) * 31;
        WalletInfo walletInfo = this.walletInfo;
        return hashCode6 + (walletInfo != null ? walletInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.paymentMethodId;
        String str2 = this.clientSelectionId;
        String str3 = this.paymentMethodType;
        ColoredTextDto coloredTextDto = this.title;
        ColoredTextDto coloredTextDto2 = this.description;
        ColoredTextDto coloredTextDto3 = this.headerDescription;
        Themes<String> themes = this.image;
        AftInfo aftInfo = this.aftInfo;
        WalletInfo walletInfo = this.walletInfo;
        StringBuilder v = b64.v("PaymentMethodSheetItemDto(paymentMethodId=", str, ", clientSelectionId=", str2, ", paymentMethodType=");
        v.append(str3);
        v.append(", title=");
        v.append(coloredTextDto);
        v.append(", description=");
        v.append(coloredTextDto2);
        v.append(", headerDescription=");
        v.append(coloredTextDto3);
        v.append(", image=");
        v.append(themes);
        v.append(", aftInfo=");
        v.append(aftInfo);
        v.append(", walletInfo=");
        v.append(walletInfo);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PaymentMethodSheetItemDto(@Json(name = "payment_method_id") String str, @Json(name = "client_selection_id") String str2, @Json(name = "payment_method_type") String str3, @Json(name = "title") ColoredTextDto coloredTextDto, @Json(name = "description") ColoredTextDto coloredTextDto2, @Json(name = "header_description") ColoredTextDto coloredTextDto3, @Json(name = "image") Themes<String> themes, @Json(name = "aft_info") AftInfo aftInfo, @Json(name = "wallet_info") WalletInfo walletInfo) {
        this.paymentMethodId = str;
        this.clientSelectionId = str2;
        this.paymentMethodType = str3;
        this.title = coloredTextDto;
        this.description = coloredTextDto2;
        this.headerDescription = coloredTextDto3;
        this.image = themes;
        this.aftInfo = aftInfo;
        this.walletInfo = walletInfo;
    }
}
