package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/HeaderTopButtonsResponse;", "", "action", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "tag", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTag", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeaderTopButtonsResponse {
    private final String action;
    private final Themes<String> image;
    private final String tag;

    public HeaderTopButtonsResponse(@Json(name = "action") String str, @Json(name = "image") Themes<String> themes, @Json(name = "tag") String str2) {
        this.action = str;
        this.image = themes;
        this.tag = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderTopButtonsResponse copy$default(HeaderTopButtonsResponse headerTopButtonsResponse, String str, Themes themes, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerTopButtonsResponse.action;
        }
        if ((i & 2) != 0) {
            themes = headerTopButtonsResponse.image;
        }
        if ((i & 4) != 0) {
            str2 = headerTopButtonsResponse.tag;
        }
        return headerTopButtonsResponse.copy(str, themes, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component2() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final HeaderTopButtonsResponse copy(@Json(name = "action") String action, @Json(name = "image") Themes<String> image, @Json(name = "tag") String tag) {
        return new HeaderTopButtonsResponse(action, image, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderTopButtonsResponse)) {
            return false;
        }
        HeaderTopButtonsResponse headerTopButtonsResponse = (HeaderTopButtonsResponse) other;
        return jl40.l(this.action, headerTopButtonsResponse.action) && jl40.l(this.image, headerTopButtonsResponse.image) && jl40.l(this.tag, headerTopButtonsResponse.tag);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.tag.hashCode() + nnm.c(this.image, this.action.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.action;
        Themes<String> themes = this.image;
        String str2 = this.tag;
        StringBuilder sb = new StringBuilder("HeaderTopButtonsResponse(action=");
        sb.append(str);
        sb.append(", image=");
        sb.append(themes);
        sb.append(", tag=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
