package com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PaymentProviderDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetSuggestedMobileProviderResponse;", "", "provider", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;)V", "getProvider", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetSuggestedMobileProviderResponse {
    private final PaymentProviderDto provider;

    public GetSuggestedMobileProviderResponse(@Json(name = "provider") PaymentProviderDto paymentProviderDto) {
        this.provider = paymentProviderDto;
    }

    public static /* synthetic */ GetSuggestedMobileProviderResponse copy$default(GetSuggestedMobileProviderResponse getSuggestedMobileProviderResponse, PaymentProviderDto paymentProviderDto, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProviderDto = getSuggestedMobileProviderResponse.provider;
        }
        return getSuggestedMobileProviderResponse.copy(paymentProviderDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentProviderDto getProvider() {
        return this.provider;
    }

    public final GetSuggestedMobileProviderResponse copy(@Json(name = "provider") PaymentProviderDto provider) {
        return new GetSuggestedMobileProviderResponse(provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetSuggestedMobileProviderResponse) && jl40.l(this.provider, ((GetSuggestedMobileProviderResponse) other).provider);
    }

    public final PaymentProviderDto getProvider() {
        return this.provider;
    }

    public int hashCode() {
        PaymentProviderDto paymentProviderDto = this.provider;
        if (paymentProviderDto == null) {
            return 0;
        }
        return paymentProviderDto.hashCode();
    }

    public String toString() {
        return "GetSuggestedMobileProviderResponse(provider=" + this.provider + Extension.C_BRAKE;
    }
}
