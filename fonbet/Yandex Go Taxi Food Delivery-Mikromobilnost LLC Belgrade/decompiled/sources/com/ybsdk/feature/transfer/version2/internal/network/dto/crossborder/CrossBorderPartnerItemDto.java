package com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderPartnerItemDto;", "", "title", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "action", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderPartnerItemDto {
    private final String action;
    private final Themes<String> image;
    private final String title;

    public CrossBorderPartnerItemDto(@Json(name = "title") String str, @Json(name = "image") Themes<String> themes, @Json(name = "action") String str2) {
        this.title = str;
        this.image = themes;
        this.action = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CrossBorderPartnerItemDto copy$default(CrossBorderPartnerItemDto crossBorderPartnerItemDto, String str, Themes themes, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crossBorderPartnerItemDto.title;
        }
        if ((i & 2) != 0) {
            themes = crossBorderPartnerItemDto.image;
        }
        if ((i & 4) != 0) {
            str2 = crossBorderPartnerItemDto.action;
        }
        return crossBorderPartnerItemDto.copy(str, themes, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Themes<String> component2() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final CrossBorderPartnerItemDto copy(@Json(name = "title") String title, @Json(name = "image") Themes<String> image, @Json(name = "action") String action) {
        return new CrossBorderPartnerItemDto(title, image, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderPartnerItemDto)) {
            return false;
        }
        CrossBorderPartnerItemDto crossBorderPartnerItemDto = (CrossBorderPartnerItemDto) other;
        return jl40.l(this.title, crossBorderPartnerItemDto.title) && jl40.l(this.image, crossBorderPartnerItemDto.image) && jl40.l(this.action, crossBorderPartnerItemDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Themes<String> themes = this.image;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        String str = this.action;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        Themes<String> themes = this.image;
        String str2 = this.action;
        StringBuilder sb = new StringBuilder("CrossBorderPartnerItemDto(title=");
        sb.append(str);
        sb.append(", image=");
        sb.append(themes);
        sb.append(", action=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
