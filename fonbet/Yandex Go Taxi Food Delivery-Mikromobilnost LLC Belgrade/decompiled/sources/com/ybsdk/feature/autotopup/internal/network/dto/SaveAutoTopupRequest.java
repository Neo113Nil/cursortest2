package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;", "", "agreementId", "", "autoTopupId", "params", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;", "autoFundData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getAgreementId", "()Ljava/lang/String;", "getAutoTopupId", "getParams", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;", "getAutoFundData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveAutoTopupRequest {
    private final String agreementId;
    private final AutoFundDto autoFundData;
    private final String autoTopupId;
    private final HmacDto hmac;
    private final AutoTopupParamsDto params;

    public SaveAutoTopupRequest(@Json(name = "agreement_id") String str, @Json(name = "autotopup_id") String str2, @Json(name = "params") AutoTopupParamsDto autoTopupParamsDto, @Json(name = "autofund") AutoFundDto autoFundDto, @Json(name = "hmac") HmacDto hmacDto) {
        this.agreementId = str;
        this.autoTopupId = str2;
        this.params = autoTopupParamsDto;
        this.autoFundData = autoFundDto;
        this.hmac = hmacDto;
    }

    public static /* synthetic */ SaveAutoTopupRequest copy$default(SaveAutoTopupRequest saveAutoTopupRequest, String str, String str2, AutoTopupParamsDto autoTopupParamsDto, AutoFundDto autoFundDto, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveAutoTopupRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = saveAutoTopupRequest.autoTopupId;
        }
        if ((i & 4) != 0) {
            autoTopupParamsDto = saveAutoTopupRequest.params;
        }
        if ((i & 8) != 0) {
            autoFundDto = saveAutoTopupRequest.autoFundData;
        }
        if ((i & 16) != 0) {
            hmacDto = saveAutoTopupRequest.hmac;
        }
        HmacDto hmacDto2 = hmacDto;
        AutoTopupParamsDto autoTopupParamsDto2 = autoTopupParamsDto;
        return saveAutoTopupRequest.copy(str, str2, autoTopupParamsDto2, autoFundDto, hmacDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupParamsDto getParams() {
        return this.params;
    }

    /* renamed from: component4, reason: from getter */
    public final AutoFundDto getAutoFundData() {
        return this.autoFundData;
    }

    /* renamed from: component5, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final SaveAutoTopupRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "autotopup_id") String autoTopupId, @Json(name = "params") AutoTopupParamsDto params, @Json(name = "autofund") AutoFundDto autoFundData, @Json(name = "hmac") HmacDto hmac) {
        return new SaveAutoTopupRequest(agreementId, autoTopupId, params, autoFundData, hmac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveAutoTopupRequest)) {
            return false;
        }
        SaveAutoTopupRequest saveAutoTopupRequest = (SaveAutoTopupRequest) other;
        return jl40.l(this.agreementId, saveAutoTopupRequest.agreementId) && jl40.l(this.autoTopupId, saveAutoTopupRequest.autoTopupId) && jl40.l(this.params, saveAutoTopupRequest.params) && jl40.l(this.autoFundData, saveAutoTopupRequest.autoFundData) && jl40.l(this.hmac, saveAutoTopupRequest.hmac);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final AutoFundDto getAutoFundData() {
        return this.autoFundData;
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final AutoTopupParamsDto getParams() {
        return this.params;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        String str = this.autoTopupId;
        int hashCode2 = (this.params.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        AutoFundDto autoFundDto = this.autoFundData;
        return this.hmac.hashCode() + ((hashCode2 + (autoFundDto != null ? autoFundDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.autoTopupId;
        AutoTopupParamsDto autoTopupParamsDto = this.params;
        AutoFundDto autoFundDto = this.autoFundData;
        HmacDto hmacDto = this.hmac;
        StringBuilder v = b64.v("SaveAutoTopupRequest(agreementId=", str, ", autoTopupId=", str2, ", params=");
        v.append(autoTopupParamsDto);
        v.append(", autoFundData=");
        v.append(autoFundDto);
        v.append(", hmac=");
        v.append(hmacDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
