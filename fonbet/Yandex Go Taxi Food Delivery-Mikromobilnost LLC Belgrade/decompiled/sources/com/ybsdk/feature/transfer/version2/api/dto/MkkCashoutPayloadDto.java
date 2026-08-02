package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/MkkCashoutPayloadDto;", "", "title", "", "subtitle", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MkkCashoutPayloadDto {
    private final Themes<String> image;
    private final String subtitle;
    private final String title;

    public MkkCashoutPayloadDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "image") Themes<String> themes) {
        this.title = str;
        this.subtitle = str2;
        this.image = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MkkCashoutPayloadDto copy$default(MkkCashoutPayloadDto mkkCashoutPayloadDto, String str, String str2, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mkkCashoutPayloadDto.title;
        }
        if ((i & 2) != 0) {
            str2 = mkkCashoutPayloadDto.subtitle;
        }
        if ((i & 4) != 0) {
            themes = mkkCashoutPayloadDto.image;
        }
        return mkkCashoutPayloadDto.copy(str, str2, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Themes<String> component3() {
        return this.image;
    }

    public final MkkCashoutPayloadDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "image") Themes<String> image) {
        return new MkkCashoutPayloadDto(title, subtitle, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MkkCashoutPayloadDto)) {
            return false;
        }
        MkkCashoutPayloadDto mkkCashoutPayloadDto = (MkkCashoutPayloadDto) other;
        return jl40.l(this.title, mkkCashoutPayloadDto.title) && jl40.l(this.subtitle, mkkCashoutPayloadDto.subtitle) && jl40.l(this.image, mkkCashoutPayloadDto.image);
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
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.image;
        return hashCode2 + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return smw0.l(b64.v("MkkCashoutPayloadDto(title=", str, ", subtitle=", str2, ", image="), this.image, Extension.C_BRAKE);
    }
}
