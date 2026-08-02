package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/HeaderTopButtonsDto;", "", "action", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "tag", "alignment", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ToolbarHorizontalAlignment;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/feature/dashboard/internal/data/dto/ToolbarHorizontalAlignment;)V", "getAction", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTag", "getAlignment", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/ToolbarHorizontalAlignment;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeaderTopButtonsDto {
    private final String action;
    private final ToolbarHorizontalAlignment alignment;
    private final Themes<String> image;
    private final String tag;

    public HeaderTopButtonsDto(@Json(name = "action") String str, @Json(name = "image") Themes<String> themes, @Json(name = "tag") String str2, @Json(name = "horizontal_alignment") ToolbarHorizontalAlignment toolbarHorizontalAlignment) {
        this.action = str;
        this.image = themes;
        this.tag = str2;
        this.alignment = toolbarHorizontalAlignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderTopButtonsDto copy$default(HeaderTopButtonsDto headerTopButtonsDto, String str, Themes themes, String str2, ToolbarHorizontalAlignment toolbarHorizontalAlignment, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerTopButtonsDto.action;
        }
        if ((i & 2) != 0) {
            themes = headerTopButtonsDto.image;
        }
        if ((i & 4) != 0) {
            str2 = headerTopButtonsDto.tag;
        }
        if ((i & 8) != 0) {
            toolbarHorizontalAlignment = headerTopButtonsDto.alignment;
        }
        return headerTopButtonsDto.copy(str, themes, str2, toolbarHorizontalAlignment);
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

    /* renamed from: component4, reason: from getter */
    public final ToolbarHorizontalAlignment getAlignment() {
        return this.alignment;
    }

    public final HeaderTopButtonsDto copy(@Json(name = "action") String action, @Json(name = "image") Themes<String> image, @Json(name = "tag") String tag, @Json(name = "horizontal_alignment") ToolbarHorizontalAlignment alignment) {
        return new HeaderTopButtonsDto(action, image, tag, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderTopButtonsDto)) {
            return false;
        }
        HeaderTopButtonsDto headerTopButtonsDto = (HeaderTopButtonsDto) other;
        return jl40.l(this.action, headerTopButtonsDto.action) && jl40.l(this.image, headerTopButtonsDto.image) && jl40.l(this.tag, headerTopButtonsDto.tag) && this.alignment == headerTopButtonsDto.alignment;
    }

    public final String getAction() {
        return this.action;
    }

    public final ToolbarHorizontalAlignment getAlignment() {
        return this.alignment;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int b = unr0.b(nnm.c(this.image, this.action.hashCode() * 31, 31), 31, this.tag);
        ToolbarHorizontalAlignment toolbarHorizontalAlignment = this.alignment;
        return b + (toolbarHorizontalAlignment == null ? 0 : toolbarHorizontalAlignment.hashCode());
    }

    public String toString() {
        return "HeaderTopButtonsDto(action=" + this.action + ", image=" + this.image + ", tag=" + this.tag + ", alignment=" + this.alignment + Extension.C_BRAKE;
    }
}
