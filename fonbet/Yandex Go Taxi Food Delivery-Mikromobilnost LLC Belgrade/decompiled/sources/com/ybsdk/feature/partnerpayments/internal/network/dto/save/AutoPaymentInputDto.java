package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInputDto;", "", "info", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto;", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getInfo", "()Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto;", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoPaymentInputDto {
    private final HmacDto hmac;
    private final AutoPaymentInfoDto info;

    public AutoPaymentInputDto(@Json(name = "info") AutoPaymentInfoDto autoPaymentInfoDto, @Json(name = "hmac") HmacDto hmacDto) {
        this.info = autoPaymentInfoDto;
        this.hmac = hmacDto;
    }

    public static /* synthetic */ AutoPaymentInputDto copy$default(AutoPaymentInputDto autoPaymentInputDto, AutoPaymentInfoDto autoPaymentInfoDto, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            autoPaymentInfoDto = autoPaymentInputDto.info;
        }
        if ((i & 2) != 0) {
            hmacDto = autoPaymentInputDto.hmac;
        }
        return autoPaymentInputDto.copy(autoPaymentInfoDto, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoPaymentInfoDto getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final AutoPaymentInputDto copy(@Json(name = "info") AutoPaymentInfoDto info, @Json(name = "hmac") HmacDto hmac) {
        return new AutoPaymentInputDto(info, hmac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoPaymentInputDto)) {
            return false;
        }
        AutoPaymentInputDto autoPaymentInputDto = (AutoPaymentInputDto) other;
        return jl40.l(this.info, autoPaymentInputDto.info) && jl40.l(this.hmac, autoPaymentInputDto.hmac);
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final AutoPaymentInfoDto getInfo() {
        return this.info;
    }

    public int hashCode() {
        return this.hmac.hashCode() + (this.info.hashCode() * 31);
    }

    public String toString() {
        return "AutoPaymentInputDto(info=" + this.info + ", hmac=" + this.hmac + Extension.C_BRAKE;
    }
}
