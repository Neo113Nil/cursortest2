package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.common.PageImageHeaderDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RefreshPageInfoDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "header", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;", "button", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getHeader", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;", "getButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RefreshPageInfoDto {
    private final ActionButtonDto button;
    private final String description;
    private final PageImageHeaderDto header;
    private final Themes<String> image;
    private final String title;

    public RefreshPageInfoDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "image") Themes<String> themes, @Json(name = "header") PageImageHeaderDto pageImageHeaderDto, @Json(name = "button") ActionButtonDto actionButtonDto) {
        this.title = str;
        this.description = str2;
        this.image = themes;
        this.header = pageImageHeaderDto;
        this.button = actionButtonDto;
    }

    public static /* synthetic */ RefreshPageInfoDto copy$default(RefreshPageInfoDto refreshPageInfoDto, String str, String str2, Themes themes, PageImageHeaderDto pageImageHeaderDto, ActionButtonDto actionButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshPageInfoDto.title;
        }
        if ((i & 2) != 0) {
            str2 = refreshPageInfoDto.description;
        }
        if ((i & 4) != 0) {
            themes = refreshPageInfoDto.image;
        }
        if ((i & 8) != 0) {
            pageImageHeaderDto = refreshPageInfoDto.header;
        }
        if ((i & 16) != 0) {
            actionButtonDto = refreshPageInfoDto.button;
        }
        ActionButtonDto actionButtonDto2 = actionButtonDto;
        Themes themes2 = themes;
        return refreshPageInfoDto.copy(str, str2, themes2, pageImageHeaderDto, actionButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Themes<String> component3() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final PageImageHeaderDto getHeader() {
        return this.header;
    }

    /* renamed from: component5, reason: from getter */
    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final RefreshPageInfoDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") Themes<String> image, @Json(name = "header") PageImageHeaderDto header, @Json(name = "button") ActionButtonDto button) {
        return new RefreshPageInfoDto(title, description, image, header, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefreshPageInfoDto)) {
            return false;
        }
        RefreshPageInfoDto refreshPageInfoDto = (RefreshPageInfoDto) other;
        return jl40.l(this.title, refreshPageInfoDto.title) && jl40.l(this.description, refreshPageInfoDto.description) && jl40.l(this.image, refreshPageInfoDto.image) && jl40.l(this.header, refreshPageInfoDto.header) && jl40.l(this.button, refreshPageInfoDto.button);
    }

    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final PageImageHeaderDto getHeader() {
        return this.header;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.button.hashCode() + ((this.header.hashCode() + nnm.c(this.image, unr0.b(this.title.hashCode() * 31, 31, this.description), 31)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Themes<String> themes = this.image;
        PageImageHeaderDto pageImageHeaderDto = this.header;
        ActionButtonDto actionButtonDto = this.button;
        StringBuilder v = b64.v("RefreshPageInfoDto(title=", str, ", description=", str2, ", image=");
        v.append(themes);
        v.append(", header=");
        v.append(pageImageHeaderDto);
        v.append(", button=");
        v.append(actionButtonDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
