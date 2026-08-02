package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.core.transfer.utils.domain.dto.PartnerDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultPageDto;", "", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "ybInfo", "Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "<init>", "(Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;Ljava/lang/String;Ljava/lang/String;)V", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "getYbInfo", "()Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitResultPageDto {
    private final String description;
    private final PageHeaderDto header;
    private final String title;
    private final PartnerDto ybInfo;

    public Me2MeDebitResultPageDto(@Json(name = "header") PageHeaderDto pageHeaderDto, @Json(name = "JSON_FIELD_MEMBER_INFO") PartnerDto partnerDto, @Json(name = "title") String str, @Json(name = "description") String str2) {
        this.header = pageHeaderDto;
        this.ybInfo = partnerDto;
        this.title = str;
        this.description = str2;
    }

    public static /* synthetic */ Me2MeDebitResultPageDto copy$default(Me2MeDebitResultPageDto me2MeDebitResultPageDto, PageHeaderDto pageHeaderDto, PartnerDto partnerDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            pageHeaderDto = me2MeDebitResultPageDto.header;
        }
        if ((i & 2) != 0) {
            partnerDto = me2MeDebitResultPageDto.ybInfo;
        }
        if ((i & 4) != 0) {
            str = me2MeDebitResultPageDto.title;
        }
        if ((i & 8) != 0) {
            str2 = me2MeDebitResultPageDto.description;
        }
        return me2MeDebitResultPageDto.copy(pageHeaderDto, partnerDto, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final PageHeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final PartnerDto getYbInfo() {
        return this.ybInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Me2MeDebitResultPageDto copy(@Json(name = "header") PageHeaderDto header, @Json(name = "JSON_FIELD_MEMBER_INFO") PartnerDto ybInfo, @Json(name = "title") String title, @Json(name = "description") String description) {
        return new Me2MeDebitResultPageDto(header, ybInfo, title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitResultPageDto)) {
            return false;
        }
        Me2MeDebitResultPageDto me2MeDebitResultPageDto = (Me2MeDebitResultPageDto) other;
        return jl40.l(this.header, me2MeDebitResultPageDto.header) && jl40.l(this.ybInfo, me2MeDebitResultPageDto.ybInfo) && jl40.l(this.title, me2MeDebitResultPageDto.title) && jl40.l(this.description, me2MeDebitResultPageDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final PageHeaderDto getHeader() {
        return this.header;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PartnerDto getYbInfo() {
        return this.ybInfo;
    }

    public int hashCode() {
        return this.description.hashCode() + unr0.b((this.ybInfo.hashCode() + (this.header.hashCode() * 31)) * 31, 31, this.title);
    }

    public String toString() {
        PageHeaderDto pageHeaderDto = this.header;
        PartnerDto partnerDto = this.ybInfo;
        String str = this.title;
        String str2 = this.description;
        StringBuilder sb = new StringBuilder("Me2MeDebitResultPageDto(header=");
        sb.append(pageHeaderDto);
        sb.append(", ybInfo=");
        sb.append(partnerDto);
        sb.append(", title=");
        return g8e.r(sb, str, ", description=", str2, Extension.C_BRAKE);
    }
}
