package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupV2PaymentInput;", "", "info", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentInfo;", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentInfo;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getInfo", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentInfo;", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupV2PaymentInput {
    private final HmacDto hmac;
    private final AutoTopupPaymentInfo info;

    public AutoTopupV2PaymentInput(@Json(name = "info") AutoTopupPaymentInfo autoTopupPaymentInfo, @Json(name = "hmac") HmacDto hmacDto) {
        this.info = autoTopupPaymentInfo;
        this.hmac = hmacDto;
    }

    public static /* synthetic */ AutoTopupV2PaymentInput copy$default(AutoTopupV2PaymentInput autoTopupV2PaymentInput, AutoTopupPaymentInfo autoTopupPaymentInfo, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupPaymentInfo = autoTopupV2PaymentInput.info;
        }
        if ((i & 2) != 0) {
            hmacDto = autoTopupV2PaymentInput.hmac;
        }
        return autoTopupV2PaymentInput.copy(autoTopupPaymentInfo, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupPaymentInfo getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final AutoTopupV2PaymentInput copy(@Json(name = "info") AutoTopupPaymentInfo info, @Json(name = "hmac") HmacDto hmac) {
        return new AutoTopupV2PaymentInput(info, hmac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupV2PaymentInput)) {
            return false;
        }
        AutoTopupV2PaymentInput autoTopupV2PaymentInput = (AutoTopupV2PaymentInput) other;
        return jl40.l(this.info, autoTopupV2PaymentInput.info) && jl40.l(this.hmac, autoTopupV2PaymentInput.hmac);
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final AutoTopupPaymentInfo getInfo() {
        return this.info;
    }

    public int hashCode() {
        return this.hmac.hashCode() + (this.info.hashCode() * 31);
    }

    public String toString() {
        return "AutoTopupV2PaymentInput(info=" + this.info + ", hmac=" + this.hmac + Extension.C_BRAKE;
    }
}
