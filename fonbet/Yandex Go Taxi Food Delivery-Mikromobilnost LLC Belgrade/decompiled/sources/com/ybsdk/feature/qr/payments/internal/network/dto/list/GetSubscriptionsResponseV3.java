package com.ybsdk.feature.qr.payments.internal.network.dto.list;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.EmptyListInfoDto;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/GetSubscriptionsResponseV3;", "", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "agreements", "", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/AgreementDto;", "emptyListInfo", "Lcom/ybsdk/core/transfer/utils/domain/dto/EmptyListInfoDto;", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;Ljava/util/List;Lcom/ybsdk/core/transfer/utils/domain/dto/EmptyListInfoDto;)V", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "getAgreements", "()Ljava/util/List;", "getEmptyListInfo", "()Lcom/ybsdk/core/transfer/utils/domain/dto/EmptyListInfoDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetSubscriptionsResponseV3 {
    private final List<AgreementDto> agreements;
    private final EmptyListInfoDto emptyListInfo;
    private final PageHeaderDto header;

    public GetSubscriptionsResponseV3(@Json(name = "header") PageHeaderDto pageHeaderDto, @Json(name = "agreements") List<AgreementDto> list, @Json(name = "empty_list_info") EmptyListInfoDto emptyListInfoDto) {
        this.header = pageHeaderDto;
        this.agreements = list;
        this.emptyListInfo = emptyListInfoDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSubscriptionsResponseV3 copy$default(GetSubscriptionsResponseV3 getSubscriptionsResponseV3, PageHeaderDto pageHeaderDto, List list, EmptyListInfoDto emptyListInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            pageHeaderDto = getSubscriptionsResponseV3.header;
        }
        if ((i & 2) != 0) {
            list = getSubscriptionsResponseV3.agreements;
        }
        if ((i & 4) != 0) {
            emptyListInfoDto = getSubscriptionsResponseV3.emptyListInfo;
        }
        return getSubscriptionsResponseV3.copy(pageHeaderDto, list, emptyListInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final List<AgreementDto> component2() {
        return this.agreements;
    }

    /* renamed from: component3, reason: from getter */
    public final EmptyListInfoDto getEmptyListInfo() {
        return this.emptyListInfo;
    }

    public final GetSubscriptionsResponseV3 copy(@Json(name = "header") PageHeaderDto header, @Json(name = "agreements") List<AgreementDto> agreements, @Json(name = "empty_list_info") EmptyListInfoDto emptyListInfo) {
        return new GetSubscriptionsResponseV3(header, agreements, emptyListInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSubscriptionsResponseV3)) {
            return false;
        }
        GetSubscriptionsResponseV3 getSubscriptionsResponseV3 = (GetSubscriptionsResponseV3) other;
        return jl40.l(this.header, getSubscriptionsResponseV3.header) && jl40.l(this.agreements, getSubscriptionsResponseV3.agreements) && jl40.l(this.emptyListInfo, getSubscriptionsResponseV3.emptyListInfo);
    }

    public final List<AgreementDto> getAgreements() {
        return this.agreements;
    }

    public final EmptyListInfoDto getEmptyListInfo() {
        return this.emptyListInfo;
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public int hashCode() {
        return this.emptyListInfo.hashCode() + unr0.c(this.header.hashCode() * 31, 31, this.agreements);
    }

    public String toString() {
        return "GetSubscriptionsResponseV3(header=" + this.header + ", agreements=" + this.agreements + ", emptyListInfo=" + this.emptyListInfo + Extension.C_BRAKE;
    }
}
