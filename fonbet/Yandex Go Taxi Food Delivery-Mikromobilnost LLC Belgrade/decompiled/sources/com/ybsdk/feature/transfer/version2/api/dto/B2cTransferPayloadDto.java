package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003JS\u0010\u001a\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/B2cTransferPayloadDto;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "bankId", "receiverPhone", "repaymentPlanToken", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "()Ljava/lang/String;", "getDescription", "getBankId", "getReceiverPhone", "getRepaymentPlanToken", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class B2cTransferPayloadDto {
    private final String bankId;
    private final String description;
    private final Themes<String> image;
    private final String receiverPhone;
    private final String repaymentPlanToken;
    private final String title;

    public /* synthetic */ B2cTransferPayloadDto(Themes themes, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(themes, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public static /* synthetic */ B2cTransferPayloadDto copy$default(B2cTransferPayloadDto b2cTransferPayloadDto, Themes themes, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = b2cTransferPayloadDto.image;
        }
        if ((i & 2) != 0) {
            str = b2cTransferPayloadDto.title;
        }
        if ((i & 4) != 0) {
            str2 = b2cTransferPayloadDto.description;
        }
        if ((i & 8) != 0) {
            str3 = b2cTransferPayloadDto.bankId;
        }
        if ((i & 16) != 0) {
            str4 = b2cTransferPayloadDto.receiverPhone;
        }
        if ((i & 32) != 0) {
            str5 = b2cTransferPayloadDto.repaymentPlanToken;
        }
        String str6 = str4;
        String str7 = str5;
        return b2cTransferPayloadDto.copy(themes, str, str2, str3, str6, str7);
    }

    public final Themes<String> component1() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBankId() {
        return this.bankId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRepaymentPlanToken() {
        return this.repaymentPlanToken;
    }

    public final B2cTransferPayloadDto copy(@Json(name = "image") Themes<String> image, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "bank_id") String bankId, @Json(name = "receiver_phone") String receiverPhone, @Json(name = "repayment_plan_token") String repaymentPlanToken) {
        return new B2cTransferPayloadDto(image, title, description, bankId, receiverPhone, repaymentPlanToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2cTransferPayloadDto)) {
            return false;
        }
        B2cTransferPayloadDto b2cTransferPayloadDto = (B2cTransferPayloadDto) other;
        return jl40.l(this.image, b2cTransferPayloadDto.image) && jl40.l(this.title, b2cTransferPayloadDto.title) && jl40.l(this.description, b2cTransferPayloadDto.description) && jl40.l(this.bankId, b2cTransferPayloadDto.bankId) && jl40.l(this.receiverPhone, b2cTransferPayloadDto.receiverPhone) && jl40.l(this.repaymentPlanToken, b2cTransferPayloadDto.repaymentPlanToken);
    }

    public final String getBankId() {
        return this.bankId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    public final String getRepaymentPlanToken() {
        return this.repaymentPlanToken;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.image.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.receiverPhone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.repaymentPlanToken;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        Themes<String> themes = this.image;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.bankId;
        String str4 = this.receiverPhone;
        String str5 = this.repaymentPlanToken;
        StringBuilder sb = new StringBuilder("B2cTransferPayloadDto(image=");
        sb.append(themes);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        g8e.D(sb, str2, ", bankId=", str3, ", receiverPhone=");
        return g8e.r(sb, str4, ", repaymentPlanToken=", str5, Extension.C_BRAKE);
    }

    public B2cTransferPayloadDto(@Json(name = "image") Themes<String> themes, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "bank_id") String str3, @Json(name = "receiver_phone") String str4, @Json(name = "repayment_plan_token") String str5) {
        this.image = themes;
        this.title = str;
        this.description = str2;
        this.bankId = str3;
        this.receiverPhone = str4;
        this.repaymentPlanToken = str5;
    }
}
