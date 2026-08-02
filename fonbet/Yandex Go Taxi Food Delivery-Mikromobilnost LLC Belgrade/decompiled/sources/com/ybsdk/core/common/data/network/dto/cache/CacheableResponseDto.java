package com.ybsdk.core.common.data.network.dto.cache;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0010\b\u0001\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0003\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/cache/CacheableResponseDto;", "T", "", "layoutInfo", "Lcom/ybsdk/core/common/data/network/dto/cache/MvLayoutInfoDto;", "commonData", "", "", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/cache/MvLayoutInfoDto;Ljava/util/Map;)V", "getLayoutInfo", "()Lcom/ybsdk/core/common/data/network/dto/cache/MvLayoutInfoDto;", "getCommonData", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CacheableResponseDto<T> {
    private final Map<String, DataEntryDto> commonData;
    private final MvLayoutInfoDto<T> layoutInfo;

    public CacheableResponseDto(@Json(name = "layout_info") MvLayoutInfoDto<T> mvLayoutInfoDto, @Json(name = "common_data") Map<String, DataEntryDto> map) {
        this.layoutInfo = mvLayoutInfoDto;
        this.commonData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CacheableResponseDto copy$default(CacheableResponseDto cacheableResponseDto, MvLayoutInfoDto mvLayoutInfoDto, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            mvLayoutInfoDto = cacheableResponseDto.layoutInfo;
        }
        if ((i & 2) != 0) {
            map = cacheableResponseDto.commonData;
        }
        return cacheableResponseDto.copy(mvLayoutInfoDto, map);
    }

    public final MvLayoutInfoDto<T> component1() {
        return this.layoutInfo;
    }

    public final Map<String, DataEntryDto> component2() {
        return this.commonData;
    }

    public final CacheableResponseDto<T> copy(@Json(name = "layout_info") MvLayoutInfoDto<T> layoutInfo, @Json(name = "common_data") Map<String, DataEntryDto> commonData) {
        return new CacheableResponseDto<>(layoutInfo, commonData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheableResponseDto)) {
            return false;
        }
        CacheableResponseDto cacheableResponseDto = (CacheableResponseDto) other;
        return jl40.l(this.layoutInfo, cacheableResponseDto.layoutInfo) && jl40.l(this.commonData, cacheableResponseDto.commonData);
    }

    public final Map<String, DataEntryDto> getCommonData() {
        return this.commonData;
    }

    public final MvLayoutInfoDto<T> getLayoutInfo() {
        return this.layoutInfo;
    }

    public int hashCode() {
        MvLayoutInfoDto<T> mvLayoutInfoDto = this.layoutInfo;
        return this.commonData.hashCode() + ((mvLayoutInfoDto == null ? 0 : mvLayoutInfoDto.hashCode()) * 31);
    }

    public String toString() {
        return "CacheableResponseDto(layoutInfo=" + this.layoutInfo + ", commonData=" + this.commonData + Extension.C_BRAKE;
    }
}
