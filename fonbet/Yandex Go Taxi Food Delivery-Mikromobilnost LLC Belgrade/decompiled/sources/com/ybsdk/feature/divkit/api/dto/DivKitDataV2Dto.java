package com.ybsdk.feature.divkit.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;", "", Constants.KEY_DATA, "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "variables", "", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;)V", "getData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getVariables", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivKitDataV2Dto {
    private final DivDataDto data;
    private final List<DataEntryDescriptorDto> variables;

    public DivKitDataV2Dto(@Json(name = "data") DivDataDto divDataDto, @Json(name = "variables") List<DataEntryDescriptorDto> list) {
        this.data = divDataDto;
        this.variables = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivKitDataV2Dto copy$default(DivKitDataV2Dto divKitDataV2Dto, DivDataDto divDataDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = divKitDataV2Dto.data;
        }
        if ((i & 2) != 0) {
            list = divKitDataV2Dto.variables;
        }
        return divKitDataV2Dto.copy(divDataDto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getData() {
        return this.data;
    }

    public final List<DataEntryDescriptorDto> component2() {
        return this.variables;
    }

    public final DivKitDataV2Dto copy(@Json(name = "data") DivDataDto data, @Json(name = "variables") List<DataEntryDescriptorDto> variables) {
        return new DivKitDataV2Dto(data, variables);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivKitDataV2Dto)) {
            return false;
        }
        DivKitDataV2Dto divKitDataV2Dto = (DivKitDataV2Dto) other;
        return jl40.l(this.data, divKitDataV2Dto.data) && jl40.l(this.variables, divKitDataV2Dto.variables);
    }

    public final DivDataDto getData() {
        return this.data;
    }

    public final List<DataEntryDescriptorDto> getVariables() {
        return this.variables;
    }

    public int hashCode() {
        int hashCode = this.data.hashCode() * 31;
        List<DataEntryDescriptorDto> list = this.variables;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "DivKitDataV2Dto(data=" + this.data + ", variables=" + this.variables + Extension.C_BRAKE;
    }
}
