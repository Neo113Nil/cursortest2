package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/GetPartnersByBicDto;", "", "errorHint", "", "ybs", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferBankByBicDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getErrorHint", "()Ljava/lang/String;", "getYbs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPartnersByBicDto {
    private final String errorHint;
    private final List<TransferBankByBicDto> ybs;

    public GetPartnersByBicDto(@Json(name = "error_hint") String str, @Json(name = "JSON_FIELD_MEMBERS") List<TransferBankByBicDto> list) {
        this.errorHint = str;
        this.ybs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPartnersByBicDto copy$default(GetPartnersByBicDto getPartnersByBicDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPartnersByBicDto.errorHint;
        }
        if ((i & 2) != 0) {
            list = getPartnersByBicDto.ybs;
        }
        return getPartnersByBicDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorHint() {
        return this.errorHint;
    }

    public final List<TransferBankByBicDto> component2() {
        return this.ybs;
    }

    public final GetPartnersByBicDto copy(@Json(name = "error_hint") String errorHint, @Json(name = "JSON_FIELD_MEMBERS") List<TransferBankByBicDto> ybs) {
        return new GetPartnersByBicDto(errorHint, ybs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPartnersByBicDto)) {
            return false;
        }
        GetPartnersByBicDto getPartnersByBicDto = (GetPartnersByBicDto) other;
        return jl40.l(this.errorHint, getPartnersByBicDto.errorHint) && jl40.l(this.ybs, getPartnersByBicDto.ybs);
    }

    public final String getErrorHint() {
        return this.errorHint;
    }

    public final List<TransferBankByBicDto> getYbs() {
        return this.ybs;
    }

    public int hashCode() {
        String str = this.errorHint;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TransferBankByBicDto> list = this.ybs;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nnm.h("GetPartnersByBicDto(errorHint=", this.errorHint, ", ybs=", Extension.C_BRAKE, this.ybs);
    }
}
