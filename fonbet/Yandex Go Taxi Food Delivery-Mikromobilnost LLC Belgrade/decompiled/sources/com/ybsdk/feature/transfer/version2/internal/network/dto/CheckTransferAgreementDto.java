package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferAgreementDto;", "", "agreementId", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "infoText", "sourceAgreementPayload", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SourceAgreementPayloadDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SourceAgreementPayloadDto;)V", "getAgreementId", "()Ljava/lang/String;", "getDescription", "getInfoText", "getSourceAgreementPayload", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SourceAgreementPayloadDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckTransferAgreementDto {
    private final String agreementId;
    private final String description;
    private final String infoText;
    private final SourceAgreementPayloadDto sourceAgreementPayload;

    public CheckTransferAgreementDto(@Json(name = "agreement_id") String str, @Json(name = "description") String str2, @Json(name = "info_text") String str3, @Json(name = "source_agreement_payload") SourceAgreementPayloadDto sourceAgreementPayloadDto) {
        this.agreementId = str;
        this.description = str2;
        this.infoText = str3;
        this.sourceAgreementPayload = sourceAgreementPayloadDto;
    }

    public static /* synthetic */ CheckTransferAgreementDto copy$default(CheckTransferAgreementDto checkTransferAgreementDto, String str, String str2, String str3, SourceAgreementPayloadDto sourceAgreementPayloadDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkTransferAgreementDto.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = checkTransferAgreementDto.description;
        }
        if ((i & 4) != 0) {
            str3 = checkTransferAgreementDto.infoText;
        }
        if ((i & 8) != 0) {
            sourceAgreementPayloadDto = checkTransferAgreementDto.sourceAgreementPayload;
        }
        return checkTransferAgreementDto.copy(str, str2, str3, sourceAgreementPayloadDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInfoText() {
        return this.infoText;
    }

    /* renamed from: component4, reason: from getter */
    public final SourceAgreementPayloadDto getSourceAgreementPayload() {
        return this.sourceAgreementPayload;
    }

    public final CheckTransferAgreementDto copy(@Json(name = "agreement_id") String agreementId, @Json(name = "description") String description, @Json(name = "info_text") String infoText, @Json(name = "source_agreement_payload") SourceAgreementPayloadDto sourceAgreementPayload) {
        return new CheckTransferAgreementDto(agreementId, description, infoText, sourceAgreementPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckTransferAgreementDto)) {
            return false;
        }
        CheckTransferAgreementDto checkTransferAgreementDto = (CheckTransferAgreementDto) other;
        return jl40.l(this.agreementId, checkTransferAgreementDto.agreementId) && jl40.l(this.description, checkTransferAgreementDto.description) && jl40.l(this.infoText, checkTransferAgreementDto.infoText) && jl40.l(this.sourceAgreementPayload, checkTransferAgreementDto.sourceAgreementPayload);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getInfoText() {
        return this.infoText;
    }

    public final SourceAgreementPayloadDto getSourceAgreementPayload() {
        return this.sourceAgreementPayload;
    }

    public int hashCode() {
        int b = unr0.b(this.agreementId.hashCode() * 31, 31, this.description);
        String str = this.infoText;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        SourceAgreementPayloadDto sourceAgreementPayloadDto = this.sourceAgreementPayload;
        return hashCode + (sourceAgreementPayloadDto != null ? sourceAgreementPayloadDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.description;
        String str3 = this.infoText;
        SourceAgreementPayloadDto sourceAgreementPayloadDto = this.sourceAgreementPayload;
        StringBuilder v = b64.v("CheckTransferAgreementDto(agreementId=", str, ", description=", str2, ", infoText=");
        v.append(str3);
        v.append(", sourceAgreementPayload=");
        v.append(sourceAgreementPayloadDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
