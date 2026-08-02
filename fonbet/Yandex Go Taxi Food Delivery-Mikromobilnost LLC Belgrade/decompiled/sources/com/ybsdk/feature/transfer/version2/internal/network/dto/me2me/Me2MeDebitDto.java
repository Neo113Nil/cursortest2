package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.PartnerDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "receiverInfo", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/ReceiverInfoDto;", "ybInfo", "Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/ReceiverInfoDto;Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getReceiverInfo", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/ReceiverInfoDto;", "getYbInfo", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitDto {
    private final String description;
    private final ReceiverInfoDto receiverInfo;
    private final String title;
    private final PartnerDto ybInfo;

    public Me2MeDebitDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "receiver_info") ReceiverInfoDto receiverInfoDto, @Json(name = "JSON_FIELD_MEMBER_INFO") PartnerDto partnerDto) {
        this.title = str;
        this.description = str2;
        this.receiverInfo = receiverInfoDto;
        this.ybInfo = partnerDto;
    }

    public static /* synthetic */ Me2MeDebitDto copy$default(Me2MeDebitDto me2MeDebitDto, String str, String str2, ReceiverInfoDto receiverInfoDto, PartnerDto partnerDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = me2MeDebitDto.title;
        }
        if ((i & 2) != 0) {
            str2 = me2MeDebitDto.description;
        }
        if ((i & 4) != 0) {
            receiverInfoDto = me2MeDebitDto.receiverInfo;
        }
        if ((i & 8) != 0) {
            partnerDto = me2MeDebitDto.ybInfo;
        }
        return me2MeDebitDto.copy(str, str2, receiverInfoDto, partnerDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final ReceiverInfoDto getReceiverInfo() {
        return this.receiverInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final PartnerDto getYbInfo() {
        return this.ybInfo;
    }

    public final Me2MeDebitDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "receiver_info") ReceiverInfoDto receiverInfo, @Json(name = "JSON_FIELD_MEMBER_INFO") PartnerDto ybInfo) {
        return new Me2MeDebitDto(title, description, receiverInfo, ybInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitDto)) {
            return false;
        }
        Me2MeDebitDto me2MeDebitDto = (Me2MeDebitDto) other;
        return jl40.l(this.title, me2MeDebitDto.title) && jl40.l(this.description, me2MeDebitDto.description) && jl40.l(this.receiverInfo, me2MeDebitDto.receiverInfo) && jl40.l(this.ybInfo, me2MeDebitDto.ybInfo);
    }

    public final String getDescription() {
        return this.description;
    }

    public final ReceiverInfoDto getReceiverInfo() {
        return this.receiverInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PartnerDto getYbInfo() {
        return this.ybInfo;
    }

    public int hashCode() {
        return this.ybInfo.hashCode() + ((this.receiverInfo.hashCode() + unr0.b(this.title.hashCode() * 31, 31, this.description)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        ReceiverInfoDto receiverInfoDto = this.receiverInfo;
        PartnerDto partnerDto = this.ybInfo;
        StringBuilder v = b64.v("Me2MeDebitDto(title=", str, ", description=", str2, ", receiverInfo=");
        v.append(receiverInfoDto);
        v.append(", ybInfo=");
        v.append(partnerDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
