package com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/GetAllInternetProvidersResponse;", "", "providers", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderWithPersonalAccountDto;", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "<init>", "(Ljava/util/List;Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;)V", "getProviders", "()Ljava/util/List;", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAllInternetProvidersResponse {
    private final PageHeaderDto header;
    private final List<InternetProviderWithPersonalAccountDto> providers;

    public GetAllInternetProvidersResponse(@Json(name = "providers") List<InternetProviderWithPersonalAccountDto> list, @Json(name = "header") PageHeaderDto pageHeaderDto) {
        this.providers = list;
        this.header = pageHeaderDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAllInternetProvidersResponse copy$default(GetAllInternetProvidersResponse getAllInternetProvidersResponse, List list, PageHeaderDto pageHeaderDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getAllInternetProvidersResponse.providers;
        }
        if ((i & 2) != 0) {
            pageHeaderDto = getAllInternetProvidersResponse.header;
        }
        return getAllInternetProvidersResponse.copy(list, pageHeaderDto);
    }

    public final List<InternetProviderWithPersonalAccountDto> component1() {
        return this.providers;
    }

    /* renamed from: component2, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final GetAllInternetProvidersResponse copy(@Json(name = "providers") List<InternetProviderWithPersonalAccountDto> providers, @Json(name = "header") PageHeaderDto header) {
        return new GetAllInternetProvidersResponse(providers, header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAllInternetProvidersResponse)) {
            return false;
        }
        GetAllInternetProvidersResponse getAllInternetProvidersResponse = (GetAllInternetProvidersResponse) other;
        return jl40.l(this.providers, getAllInternetProvidersResponse.providers) && jl40.l(this.header, getAllInternetProvidersResponse.header);
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final List<InternetProviderWithPersonalAccountDto> getProviders() {
        return this.providers;
    }

    public int hashCode() {
        return this.header.hashCode() + (this.providers.hashCode() * 31);
    }

    public String toString() {
        return "GetAllInternetProvidersResponse(providers=" + this.providers + ", header=" + this.header + Extension.C_BRAKE;
    }
}
