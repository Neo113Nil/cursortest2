package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.gcb0;
import defpackage.jl40;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$IconAndTitle", "Lgcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "contentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "title", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "icon", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "component3", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$IconAndTitle;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;Lcom/ybsdk/core/common/data/network/dto/Themes;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$IconAndTitle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "getContentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "getTitle", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "getIcon", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$FilterContent$IconAndTitle implements gcb0 {
    private final PfmResponse.FilterContentType contentType;
    private final Themes<String> icon;
    private final PfmResponse$PfmTextContent$Plain title;

    public PfmResponse$FilterContent$IconAndTitle(@Json(name = "content_type") PfmResponse.FilterContentType filterContentType, @Json(name = "title") PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, @Json(name = "icon") Themes<String> themes) {
        this.contentType = filterContentType;
        this.title = pfmResponse$PfmTextContent$Plain;
        this.icon = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PfmResponse$FilterContent$IconAndTitle copy$default(PfmResponse$FilterContent$IconAndTitle pfmResponse$FilterContent$IconAndTitle, PfmResponse.FilterContentType filterContentType, PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            filterContentType = pfmResponse$FilterContent$IconAndTitle.contentType;
        }
        if ((i & 2) != 0) {
            pfmResponse$PfmTextContent$Plain = pfmResponse$FilterContent$IconAndTitle.title;
        }
        if ((i & 4) != 0) {
            themes = pfmResponse$FilterContent$IconAndTitle.icon;
        }
        return pfmResponse$FilterContent$IconAndTitle.copy(filterContentType, pfmResponse$PfmTextContent$Plain, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.FilterContentType getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final PfmResponse$PfmTextContent$Plain getTitle() {
        return this.title;
    }

    public final Themes<String> component3() {
        return this.icon;
    }

    public final PfmResponse$FilterContent$IconAndTitle copy(@Json(name = "content_type") PfmResponse.FilterContentType contentType, @Json(name = "title") PfmResponse$PfmTextContent$Plain title, @Json(name = "icon") Themes<String> icon) {
        return new PfmResponse$FilterContent$IconAndTitle(contentType, title, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$FilterContent$IconAndTitle)) {
            return false;
        }
        PfmResponse$FilterContent$IconAndTitle pfmResponse$FilterContent$IconAndTitle = (PfmResponse$FilterContent$IconAndTitle) other;
        return this.contentType == pfmResponse$FilterContent$IconAndTitle.contentType && jl40.l(this.title, pfmResponse$FilterContent$IconAndTitle.title) && jl40.l(this.icon, pfmResponse$FilterContent$IconAndTitle.icon);
    }

    public final PfmResponse.FilterContentType getContentType() {
        return this.contentType;
    }

    public final Themes<String> getIcon() {
        return this.icon;
    }

    public final PfmResponse$PfmTextContent$Plain getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.icon.hashCode() + ((this.title.hashCode() + (this.contentType.hashCode() * 31)) * 31);
    }

    public String toString() {
        PfmResponse.FilterContentType filterContentType = this.contentType;
        PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain = this.title;
        Themes<String> themes = this.icon;
        StringBuilder sb = new StringBuilder("IconAndTitle(contentType=");
        sb.append(filterContentType);
        sb.append(", title=");
        sb.append(pfmResponse$PfmTextContent$Plain);
        sb.append(", icon=");
        return smw0.l(sb, themes, Extension.C_BRAKE);
    }
}
