package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.gcb0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$Icon", "Lgcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "contentType", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "icon", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "component2", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$Icon;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;Lcom/ybsdk/core/common/data/network/dto/Themes;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$Icon;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "getContentType", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "getIcon", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$FilterContent$Icon implements gcb0 {
    private final PfmResponse.FilterContentType contentType;
    private final Themes<String> icon;

    public PfmResponse$FilterContent$Icon(@Json(name = "content_type") PfmResponse.FilterContentType filterContentType, @Json(name = "icon") Themes<String> themes) {
        this.contentType = filterContentType;
        this.icon = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PfmResponse$FilterContent$Icon copy$default(PfmResponse$FilterContent$Icon pfmResponse$FilterContent$Icon, PfmResponse.FilterContentType filterContentType, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            filterContentType = pfmResponse$FilterContent$Icon.contentType;
        }
        if ((i & 2) != 0) {
            themes = pfmResponse$FilterContent$Icon.icon;
        }
        return pfmResponse$FilterContent$Icon.copy(filterContentType, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.FilterContentType getContentType() {
        return this.contentType;
    }

    public final Themes<String> component2() {
        return this.icon;
    }

    public final PfmResponse$FilterContent$Icon copy(@Json(name = "content_type") PfmResponse.FilterContentType contentType, @Json(name = "icon") Themes<String> icon) {
        return new PfmResponse$FilterContent$Icon(contentType, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$FilterContent$Icon)) {
            return false;
        }
        PfmResponse$FilterContent$Icon pfmResponse$FilterContent$Icon = (PfmResponse$FilterContent$Icon) other;
        return this.contentType == pfmResponse$FilterContent$Icon.contentType && jl40.l(this.icon, pfmResponse$FilterContent$Icon.icon);
    }

    public final PfmResponse.FilterContentType getContentType() {
        return this.contentType;
    }

    public final Themes<String> getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.icon.hashCode() + (this.contentType.hashCode() * 31);
    }

    public String toString() {
        return "Icon(contentType=" + this.contentType + ", icon=" + this.icon + Extension.C_BRAKE;
    }
}
