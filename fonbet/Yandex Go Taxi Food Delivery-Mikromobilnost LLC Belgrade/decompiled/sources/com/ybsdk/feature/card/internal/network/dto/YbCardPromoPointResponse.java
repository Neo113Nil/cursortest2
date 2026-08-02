package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardPromoPointResponse;", "", "text", "", "iconUrl", "iconUrlThemed", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getIconUrl$annotations", "()V", "getIconUrl", "getIconUrlThemed", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCardPromoPointResponse {
    private final String iconUrl;
    private final Themes<String> iconUrlThemed;
    private final String text;

    public YbCardPromoPointResponse(@Json(name = "text") String str, @Json(name = "icon_url") String str2, @Json(name = "icon_url_themed") Themes<String> themes) {
        this.text = str;
        this.iconUrl = str2;
        this.iconUrlThemed = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YbCardPromoPointResponse copy$default(YbCardPromoPointResponse ybCardPromoPointResponse, String str, String str2, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybCardPromoPointResponse.text;
        }
        if ((i & 2) != 0) {
            str2 = ybCardPromoPointResponse.iconUrl;
        }
        if ((i & 4) != 0) {
            themes = ybCardPromoPointResponse.iconUrlThemed;
        }
        return ybCardPromoPointResponse.copy(str, str2, themes);
    }

    @jxi
    public static /* synthetic */ void getIconUrl$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Themes<String> component3() {
        return this.iconUrlThemed;
    }

    public final YbCardPromoPointResponse copy(@Json(name = "text") String text, @Json(name = "icon_url") String iconUrl, @Json(name = "icon_url_themed") Themes<String> iconUrlThemed) {
        return new YbCardPromoPointResponse(text, iconUrl, iconUrlThemed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCardPromoPointResponse)) {
            return false;
        }
        YbCardPromoPointResponse ybCardPromoPointResponse = (YbCardPromoPointResponse) other;
        return jl40.l(this.text, ybCardPromoPointResponse.text) && jl40.l(this.iconUrl, ybCardPromoPointResponse.iconUrl) && jl40.l(this.iconUrlThemed, ybCardPromoPointResponse.iconUrlThemed);
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Themes<String> getIconUrlThemed() {
        return this.iconUrlThemed;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int b = unr0.b(this.text.hashCode() * 31, 31, this.iconUrl);
        Themes<String> themes = this.iconUrlThemed;
        return b + (themes == null ? 0 : themes.hashCode());
    }

    public String toString() {
        String str = this.text;
        String str2 = this.iconUrl;
        return smw0.l(b64.v("YbCardPromoPointResponse(text=", str, ", iconUrl=", str2, ", iconUrlThemed="), this.iconUrlThemed, Extension.C_BRAKE);
    }
}
