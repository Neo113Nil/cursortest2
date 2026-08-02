package com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PaymentProviderDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/GetInternetProviderFormResponse;", "", "provider", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "inputField", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderInputFieldDto;", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderInputFieldDto;Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;)V", "getProvider", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "getInputField", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderInputFieldDto;", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetInternetProviderFormResponse {
    private final PageHeaderDto header;
    private final InternetProviderInputFieldDto inputField;
    private final PaymentProviderDto provider;

    public GetInternetProviderFormResponse(@Json(name = "provider") PaymentProviderDto paymentProviderDto, @Json(name = "input_field") InternetProviderInputFieldDto internetProviderInputFieldDto, @Json(name = "header") PageHeaderDto pageHeaderDto) {
        this.provider = paymentProviderDto;
        this.inputField = internetProviderInputFieldDto;
        this.header = pageHeaderDto;
    }

    public static /* synthetic */ GetInternetProviderFormResponse copy$default(GetInternetProviderFormResponse getInternetProviderFormResponse, PaymentProviderDto paymentProviderDto, InternetProviderInputFieldDto internetProviderInputFieldDto, PageHeaderDto pageHeaderDto, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProviderDto = getInternetProviderFormResponse.provider;
        }
        if ((i & 2) != 0) {
            internetProviderInputFieldDto = getInternetProviderFormResponse.inputField;
        }
        if ((i & 4) != 0) {
            pageHeaderDto = getInternetProviderFormResponse.header;
        }
        return getInternetProviderFormResponse.copy(paymentProviderDto, internetProviderInputFieldDto, pageHeaderDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentProviderDto getProvider() {
        return this.provider;
    }

    /* renamed from: component2, reason: from getter */
    public final InternetProviderInputFieldDto getInputField() {
        return this.inputField;
    }

    /* renamed from: component3, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final GetInternetProviderFormResponse copy(@Json(name = "provider") PaymentProviderDto provider, @Json(name = "input_field") InternetProviderInputFieldDto inputField, @Json(name = "header") PageHeaderDto header) {
        return new GetInternetProviderFormResponse(provider, inputField, header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetInternetProviderFormResponse)) {
            return false;
        }
        GetInternetProviderFormResponse getInternetProviderFormResponse = (GetInternetProviderFormResponse) other;
        return jl40.l(this.provider, getInternetProviderFormResponse.provider) && jl40.l(this.inputField, getInternetProviderFormResponse.inputField) && jl40.l(this.header, getInternetProviderFormResponse.header);
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final InternetProviderInputFieldDto getInputField() {
        return this.inputField;
    }

    public final PaymentProviderDto getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return this.header.hashCode() + ((this.inputField.hashCode() + (this.provider.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "GetInternetProviderFormResponse(provider=" + this.provider + ", inputField=" + this.inputField + ", header=" + this.header + Extension.C_BRAKE;
    }
}
