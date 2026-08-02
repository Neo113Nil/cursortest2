package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/InternetPaymentPayloadDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "providerId", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getProviderId", "getAccountNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternetPaymentPayloadDto {
    private final String accountNumber;
    private final String description;
    private final Themes<String> image;
    private final String providerId;
    private final String title;

    public InternetPaymentPayloadDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "image") Themes<String> themes, @Json(name = "provider_id") String str3, @Json(name = "account_number") String str4) {
        this.title = str;
        this.description = str2;
        this.image = themes;
        this.providerId = str3;
        this.accountNumber = str4;
    }

    public static /* synthetic */ InternetPaymentPayloadDto copy$default(InternetPaymentPayloadDto internetPaymentPayloadDto, String str, String str2, Themes themes, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internetPaymentPayloadDto.title;
        }
        if ((i & 2) != 0) {
            str2 = internetPaymentPayloadDto.description;
        }
        if ((i & 4) != 0) {
            themes = internetPaymentPayloadDto.image;
        }
        if ((i & 8) != 0) {
            str3 = internetPaymentPayloadDto.providerId;
        }
        if ((i & 16) != 0) {
            str4 = internetPaymentPayloadDto.accountNumber;
        }
        String str5 = str4;
        Themes themes2 = themes;
        return internetPaymentPayloadDto.copy(str, str2, themes2, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component3() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final InternetPaymentPayloadDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") Themes<String> image, @Json(name = "provider_id") String providerId, @Json(name = "account_number") String accountNumber) {
        return new InternetPaymentPayloadDto(title, description, image, providerId, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetPaymentPayloadDto)) {
            return false;
        }
        InternetPaymentPayloadDto internetPaymentPayloadDto = (InternetPaymentPayloadDto) other;
        return jl40.l(this.title, internetPaymentPayloadDto.title) && jl40.l(this.description, internetPaymentPayloadDto.description) && jl40.l(this.image, internetPaymentPayloadDto.image) && jl40.l(this.providerId, internetPaymentPayloadDto.providerId) && jl40.l(this.accountNumber, internetPaymentPayloadDto.accountNumber);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.accountNumber.hashCode() + unr0.b(nnm.c(this.image, unr0.b(this.title.hashCode() * 31, 31, this.description), 31), 31, this.providerId);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Themes<String> themes = this.image;
        String str3 = this.providerId;
        String str4 = this.accountNumber;
        StringBuilder v = b64.v("InternetPaymentPayloadDto(title=", str, ", description=", str2, ", image=");
        v.append(themes);
        v.append(", providerId=");
        v.append(str3);
        v.append(", accountNumber=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
