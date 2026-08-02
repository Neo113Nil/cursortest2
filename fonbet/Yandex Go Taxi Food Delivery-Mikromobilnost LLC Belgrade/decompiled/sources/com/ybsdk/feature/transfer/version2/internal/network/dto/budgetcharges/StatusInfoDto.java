package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "title", "subtitle", "button", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatusInfoDto {
    private final ActionButtonDto button;
    private final Themes<String> image;
    private final String subtitle;
    private final String title;

    public StatusInfoDto(@Json(name = "image") Themes<String> themes, @Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "button") ActionButtonDto actionButtonDto) {
        this.image = themes;
        this.title = str;
        this.subtitle = str2;
        this.button = actionButtonDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatusInfoDto copy$default(StatusInfoDto statusInfoDto, Themes themes, String str, String str2, ActionButtonDto actionButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = statusInfoDto.image;
        }
        if ((i & 2) != 0) {
            str = statusInfoDto.title;
        }
        if ((i & 4) != 0) {
            str2 = statusInfoDto.subtitle;
        }
        if ((i & 8) != 0) {
            actionButtonDto = statusInfoDto.button;
        }
        return statusInfoDto.copy(themes, str, str2, actionButtonDto);
    }

    public final Themes<String> component1() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final StatusInfoDto copy(@Json(name = "image") Themes<String> image, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "button") ActionButtonDto button) {
        return new StatusInfoDto(image, title, subtitle, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusInfoDto)) {
            return false;
        }
        StatusInfoDto statusInfoDto = (StatusInfoDto) other;
        return jl40.l(this.image, statusInfoDto.image) && jl40.l(this.title, statusInfoDto.title) && jl40.l(this.subtitle, statusInfoDto.subtitle) && jl40.l(this.button, statusInfoDto.button);
    }

    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Themes<String> themes = this.image;
        int b = unr0.b(unr0.b((themes == null ? 0 : themes.hashCode()) * 31, 31, this.title), 31, this.subtitle);
        ActionButtonDto actionButtonDto = this.button;
        return b + (actionButtonDto != null ? actionButtonDto.hashCode() : 0);
    }

    public String toString() {
        return "StatusInfoDto(image=" + this.image + ", title=" + this.title + ", subtitle=" + this.subtitle + ", button=" + this.button + Extension.C_BRAKE;
    }
}
