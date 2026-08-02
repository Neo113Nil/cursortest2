package com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSenderHistoryDto;", "", "countries", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSenderCountryDto;", "<init>", "(Ljava/util/List;)V", "getCountries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderSenderHistoryDto {
    private final List<CrossBorderSenderCountryDto> countries;

    public CrossBorderSenderHistoryDto(@Json(name = "countries") List<CrossBorderSenderCountryDto> list) {
        this.countries = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CrossBorderSenderHistoryDto copy$default(CrossBorderSenderHistoryDto crossBorderSenderHistoryDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = crossBorderSenderHistoryDto.countries;
        }
        return crossBorderSenderHistoryDto.copy(list);
    }

    public final List<CrossBorderSenderCountryDto> component1() {
        return this.countries;
    }

    public final CrossBorderSenderHistoryDto copy(@Json(name = "countries") List<CrossBorderSenderCountryDto> countries) {
        return new CrossBorderSenderHistoryDto(countries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CrossBorderSenderHistoryDto) && jl40.l(this.countries, ((CrossBorderSenderHistoryDto) other).countries);
    }

    public final List<CrossBorderSenderCountryDto> getCountries() {
        return this.countries;
    }

    public int hashCode() {
        return this.countries.hashCode();
    }

    public String toString() {
        return tse0.k("CrossBorderSenderHistoryDto(countries=", Extension.C_BRAKE, this.countries);
    }
}
