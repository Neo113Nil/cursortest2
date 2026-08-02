package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "", "items", "", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoItemDto;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommunicationsShownInfoDto {
    private final List<CommunicationsShownInfoItemDto> items;

    public CommunicationsShownInfoDto(@Json(name = "items") List<CommunicationsShownInfoItemDto> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunicationsShownInfoDto copy$default(CommunicationsShownInfoDto communicationsShownInfoDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = communicationsShownInfoDto.items;
        }
        return communicationsShownInfoDto.copy(list);
    }

    public final List<CommunicationsShownInfoItemDto> component1() {
        return this.items;
    }

    public final CommunicationsShownInfoDto copy(@Json(name = "items") List<CommunicationsShownInfoItemDto> items) {
        return new CommunicationsShownInfoDto(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommunicationsShownInfoDto) && jl40.l(this.items, ((CommunicationsShownInfoDto) other).items);
    }

    public final List<CommunicationsShownInfoItemDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return tse0.k("CommunicationsShownInfoDto(items=", Extension.C_BRAKE, this.items);
    }
}
