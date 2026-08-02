package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoPointV2Response;", "", "text", "", "iconUrl", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getIconUrl", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCardPromoPointV2Response {
    private final Themes<String> iconUrl;
    private final String text;

    public YbCardPromoPointV2Response(@Json(name = "text") String str, @Json(name = "icon_url") Themes<String> themes) {
        this.text = str;
        this.iconUrl = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YbCardPromoPointV2Response copy$default(YbCardPromoPointV2Response ybCardPromoPointV2Response, String str, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCardPromoPointV2Response.text;
        }
        if ((i & 2) != 0) {
            themes = ybCardPromoPointV2Response.iconUrl;
        }
        return ybCardPromoPointV2Response.copy(str, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<String> component2() {
        return this.iconUrl;
    }

    public final YbCardPromoPointV2Response copy(@Json(name = "text") String text, @Json(name = "icon_url") Themes<String> iconUrl) {
        return new YbCardPromoPointV2Response(text, iconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCardPromoPointV2Response)) {
            return false;
        }
        YbCardPromoPointV2Response ybCardPromoPointV2Response = (YbCardPromoPointV2Response) other;
        return jl40.l(this.text, ybCardPromoPointV2Response.text) && jl40.l(this.iconUrl, ybCardPromoPointV2Response.iconUrl);
    }

    public final Themes<String> getIconUrl() {
        return this.iconUrl;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.iconUrl.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "YbCardPromoPointV2Response(text=" + this.text + ", iconUrl=" + this.iconUrl + Extension.C_BRAKE;
    }
}
