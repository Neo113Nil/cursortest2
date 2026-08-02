package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetAutoPullResultDto;", "", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "permissions", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/AutoPullPermissionDto;", "emptyListInfo", "Lcom/ybsdk/core/transfer/utils/domain/dto/EmptyListInfoDto;", "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;Ljava/util/List;Lcom/ybsdk/core/transfer/utils/domain/dto/EmptyListInfoDto;)V", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "getPermissions", "()Ljava/util/List;", "getEmptyListInfo", "()Lcom/ybsdk/core/transfer/utils/domain/dto/EmptyListInfoDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitGetAutoPullResultDto {
    private final EmptyListInfoDto emptyListInfo;
    private final PageHeaderDto header;
    private final List<AutoPullPermissionDto> permissions;

    public Me2MeDebitGetAutoPullResultDto(@Json(name = "header") PageHeaderDto pageHeaderDto, @Json(name = "permissions") List<AutoPullPermissionDto> list, @Json(name = "empty_list_info") EmptyListInfoDto emptyListInfoDto) {
        this.header = pageHeaderDto;
        this.permissions = list;
        this.emptyListInfo = emptyListInfoDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Me2MeDebitGetAutoPullResultDto copy$default(Me2MeDebitGetAutoPullResultDto me2MeDebitGetAutoPullResultDto, PageHeaderDto pageHeaderDto, List list, EmptyListInfoDto emptyListInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            pageHeaderDto = me2MeDebitGetAutoPullResultDto.header;
        }
        if ((i & 2) != 0) {
            list = me2MeDebitGetAutoPullResultDto.permissions;
        }
        if ((i & 4) != 0) {
            emptyListInfoDto = me2MeDebitGetAutoPullResultDto.emptyListInfo;
        }
        return me2MeDebitGetAutoPullResultDto.copy(pageHeaderDto, list, emptyListInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final List<AutoPullPermissionDto> component2() {
        return this.permissions;
    }

    /* renamed from: component3, reason: from getter */
    public final EmptyListInfoDto getEmptyListInfo() {
        return this.emptyListInfo;
    }

    public final Me2MeDebitGetAutoPullResultDto copy(@Json(name = "header") PageHeaderDto header, @Json(name = "permissions") List<AutoPullPermissionDto> permissions, @Json(name = "empty_list_info") EmptyListInfoDto emptyListInfo) {
        return new Me2MeDebitGetAutoPullResultDto(header, permissions, emptyListInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitGetAutoPullResultDto)) {
            return false;
        }
        Me2MeDebitGetAutoPullResultDto me2MeDebitGetAutoPullResultDto = (Me2MeDebitGetAutoPullResultDto) other;
        return jl40.l(this.header, me2MeDebitGetAutoPullResultDto.header) && jl40.l(this.permissions, me2MeDebitGetAutoPullResultDto.permissions) && jl40.l(this.emptyListInfo, me2MeDebitGetAutoPullResultDto.emptyListInfo);
    }

    public final EmptyListInfoDto getEmptyListInfo() {
        return this.emptyListInfo;
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final List<AutoPullPermissionDto> getPermissions() {
        return this.permissions;
    }

    public int hashCode() {
        return this.emptyListInfo.hashCode() + unr0.c(this.header.hashCode() * 31, 31, this.permissions);
    }

    public String toString() {
        return "Me2MeDebitGetAutoPullResultDto(header=" + this.header + ", permissions=" + this.permissions + ", emptyListInfo=" + this.emptyListInfo + Extension.C_BRAKE;
    }
}
