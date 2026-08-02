package com.ybsdk.feature.transfer.version2.internal.network.dto.mobilepayments;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PaymentProviderDto;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/mobilepayments/GetAllMobileProvidersResponse;", "", "suggestedProvider", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "providers", "", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;Ljava/util/List;Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;)V", "getSuggestedProvider", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PaymentProviderDto;", "getProviders", "()Ljava/util/List;", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAllMobileProvidersResponse {
    private final PageHeaderDto header;
    private final List<PaymentProviderDto> providers;
    private final PaymentProviderDto suggestedProvider;

    public GetAllMobileProvidersResponse(@Json(name = "suggested_provider") PaymentProviderDto paymentProviderDto, @Json(name = "providers") List<PaymentProviderDto> list, @Json(name = "header") PageHeaderDto pageHeaderDto) {
        this.suggestedProvider = paymentProviderDto;
        this.providers = list;
        this.header = pageHeaderDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAllMobileProvidersResponse copy$default(GetAllMobileProvidersResponse getAllMobileProvidersResponse, PaymentProviderDto paymentProviderDto, List list, PageHeaderDto pageHeaderDto, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProviderDto = getAllMobileProvidersResponse.suggestedProvider;
        }
        if ((i & 2) != 0) {
            list = getAllMobileProvidersResponse.providers;
        }
        if ((i & 4) != 0) {
            pageHeaderDto = getAllMobileProvidersResponse.header;
        }
        return getAllMobileProvidersResponse.copy(paymentProviderDto, list, pageHeaderDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentProviderDto getSuggestedProvider() {
        return this.suggestedProvider;
    }

    public final List<PaymentProviderDto> component2() {
        return this.providers;
    }

    /* renamed from: component3, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final GetAllMobileProvidersResponse copy(@Json(name = "suggested_provider") PaymentProviderDto suggestedProvider, @Json(name = "providers") List<PaymentProviderDto> providers, @Json(name = "header") PageHeaderDto header) {
        return new GetAllMobileProvidersResponse(suggestedProvider, providers, header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAllMobileProvidersResponse)) {
            return false;
        }
        GetAllMobileProvidersResponse getAllMobileProvidersResponse = (GetAllMobileProvidersResponse) other;
        return jl40.l(this.suggestedProvider, getAllMobileProvidersResponse.suggestedProvider) && jl40.l(this.providers, getAllMobileProvidersResponse.providers) && jl40.l(this.header, getAllMobileProvidersResponse.header);
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final List<PaymentProviderDto> getProviders() {
        return this.providers;
    }

    public final PaymentProviderDto getSuggestedProvider() {
        return this.suggestedProvider;
    }

    public int hashCode() {
        PaymentProviderDto paymentProviderDto = this.suggestedProvider;
        return this.header.hashCode() + unr0.c((paymentProviderDto == null ? 0 : paymentProviderDto.hashCode()) * 31, 31, this.providers);
    }

    public String toString() {
        return "GetAllMobileProvidersResponse(suggestedProvider=" + this.suggestedProvider + ", providers=" + this.providers + ", header=" + this.header + Extension.C_BRAKE;
    }
}
