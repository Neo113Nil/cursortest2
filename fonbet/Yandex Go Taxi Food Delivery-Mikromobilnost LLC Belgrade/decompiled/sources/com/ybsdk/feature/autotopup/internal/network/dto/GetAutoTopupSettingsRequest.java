package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupSettingsRequest;", "", "autoTopupType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "agreementId", "", "autoTopupId", "amount", "Ljava/math/BigDecimal;", "threshold", "sessionsCountWithoutFullscreen", "", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)V", "getAutoTopupType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "getAgreementId", "()Ljava/lang/String;", "getAutoTopupId", "getAmount", "()Ljava/math/BigDecimal;", "getThreshold", "getSessionsCountWithoutFullscreen", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAutoTopupSettingsRequest {
    private final String agreementId;
    private final BigDecimal amount;
    private final String autoTopupId;
    private final AutoTopupTypeRequestDto autoTopupType;
    private final int sessionsCountWithoutFullscreen;
    private final BigDecimal threshold;

    public GetAutoTopupSettingsRequest(@Json(name = "autotopup_type") AutoTopupTypeRequestDto autoTopupTypeRequestDto, @Json(name = "agreement_id") String str, @Json(name = "autotopup_id") String str2, @Json(name = "amount") BigDecimal bigDecimal, @Json(name = "threshold") BigDecimal bigDecimal2, @Json(name = "sessions_count_without_fullscreen") int i) {
        this.autoTopupType = autoTopupTypeRequestDto;
        this.agreementId = str;
        this.autoTopupId = str2;
        this.amount = bigDecimal;
        this.threshold = bigDecimal2;
        this.sessionsCountWithoutFullscreen = i;
    }

    public static /* synthetic */ GetAutoTopupSettingsRequest copy$default(GetAutoTopupSettingsRequest getAutoTopupSettingsRequest, AutoTopupTypeRequestDto autoTopupTypeRequestDto, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            autoTopupTypeRequestDto = getAutoTopupSettingsRequest.autoTopupType;
        }
        if ((i2 & 2) != 0) {
            str = getAutoTopupSettingsRequest.agreementId;
        }
        if ((i2 & 4) != 0) {
            str2 = getAutoTopupSettingsRequest.autoTopupId;
        }
        if ((i2 & 8) != 0) {
            bigDecimal = getAutoTopupSettingsRequest.amount;
        }
        if ((i2 & 16) != 0) {
            bigDecimal2 = getAutoTopupSettingsRequest.threshold;
        }
        if ((i2 & 32) != 0) {
            i = getAutoTopupSettingsRequest.sessionsCountWithoutFullscreen;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        int i3 = i;
        return getAutoTopupSettingsRequest.copy(autoTopupTypeRequestDto, str, str2, bigDecimal, bigDecimal3, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupTypeRequestDto getAutoTopupType() {
        return this.autoTopupType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    public final GetAutoTopupSettingsRequest copy(@Json(name = "autotopup_type") AutoTopupTypeRequestDto autoTopupType, @Json(name = "agreement_id") String agreementId, @Json(name = "autotopup_id") String autoTopupId, @Json(name = "amount") BigDecimal amount, @Json(name = "threshold") BigDecimal threshold, @Json(name = "sessions_count_without_fullscreen") int sessionsCountWithoutFullscreen) {
        return new GetAutoTopupSettingsRequest(autoTopupType, agreementId, autoTopupId, amount, threshold, sessionsCountWithoutFullscreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAutoTopupSettingsRequest)) {
            return false;
        }
        GetAutoTopupSettingsRequest getAutoTopupSettingsRequest = (GetAutoTopupSettingsRequest) other;
        return this.autoTopupType == getAutoTopupSettingsRequest.autoTopupType && jl40.l(this.agreementId, getAutoTopupSettingsRequest.agreementId) && jl40.l(this.autoTopupId, getAutoTopupSettingsRequest.autoTopupId) && jl40.l(this.amount, getAutoTopupSettingsRequest.amount) && jl40.l(this.threshold, getAutoTopupSettingsRequest.threshold) && this.sessionsCountWithoutFullscreen == getAutoTopupSettingsRequest.sessionsCountWithoutFullscreen;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    public final AutoTopupTypeRequestDto getAutoTopupType() {
        return this.autoTopupType;
    }

    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        AutoTopupTypeRequestDto autoTopupTypeRequestDto = this.autoTopupType;
        int hashCode = (autoTopupTypeRequestDto == null ? 0 : autoTopupTypeRequestDto.hashCode()) * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.autoTopupId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.threshold;
        return Integer.hashCode(this.sessionsCountWithoutFullscreen) + ((hashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "GetAutoTopupSettingsRequest(autoTopupType=" + this.autoTopupType + ", agreementId=" + this.agreementId + ", autoTopupId=" + this.autoTopupId + ", amount=" + this.amount + ", threshold=" + this.threshold + ", sessionsCountWithoutFullscreen=" + this.sessionsCountWithoutFullscreen + Extension.C_BRAKE;
    }
}
