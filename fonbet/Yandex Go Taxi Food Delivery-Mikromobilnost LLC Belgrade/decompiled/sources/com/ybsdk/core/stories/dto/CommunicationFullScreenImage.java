package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/core/stories/dto/CommunicationFullScreenImage;", "", "mode", "Lcom/ybsdk/core/stories/dto/ImageMode;", "assetName", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Lcom/ybsdk/core/stories/dto/ImageMode;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getMode", "()Lcom/ybsdk/core/stories/dto/ImageMode;", "getAssetName", "()Ljava/lang/String;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommunicationFullScreenImage {
    private final String assetName;
    private final Themes<String> image;
    private final ImageMode mode;

    public CommunicationFullScreenImage(@Json(name = "mode") ImageMode imageMode, @Json(name = "asset_name") String str, @Json(name = "image") Themes<String> themes) {
        this.mode = imageMode;
        this.assetName = str;
        this.image = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunicationFullScreenImage copy$default(CommunicationFullScreenImage communicationFullScreenImage, ImageMode imageMode, String str, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            imageMode = communicationFullScreenImage.mode;
        }
        if ((i & 2) != 0) {
            str = communicationFullScreenImage.assetName;
        }
        if ((i & 4) != 0) {
            themes = communicationFullScreenImage.image;
        }
        return communicationFullScreenImage.copy(imageMode, str, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageMode getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAssetName() {
        return this.assetName;
    }

    public final Themes<String> component3() {
        return this.image;
    }

    public final CommunicationFullScreenImage copy(@Json(name = "mode") ImageMode mode, @Json(name = "asset_name") String assetName, @Json(name = "image") Themes<String> image) {
        return new CommunicationFullScreenImage(mode, assetName, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationFullScreenImage)) {
            return false;
        }
        CommunicationFullScreenImage communicationFullScreenImage = (CommunicationFullScreenImage) other;
        return this.mode == communicationFullScreenImage.mode && jl40.l(this.assetName, communicationFullScreenImage.assetName) && jl40.l(this.image, communicationFullScreenImage.image);
    }

    public final String getAssetName() {
        return this.assetName;
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final ImageMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        String str = this.assetName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.image;
        return hashCode2 + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        ImageMode imageMode = this.mode;
        String str = this.assetName;
        Themes<String> themes = this.image;
        StringBuilder sb = new StringBuilder("CommunicationFullScreenImage(mode=");
        sb.append(imageMode);
        sb.append(", assetName=");
        sb.append(str);
        sb.append(", image=");
        return smw0.l(sb, themes, Extension.C_BRAKE);
    }
}
