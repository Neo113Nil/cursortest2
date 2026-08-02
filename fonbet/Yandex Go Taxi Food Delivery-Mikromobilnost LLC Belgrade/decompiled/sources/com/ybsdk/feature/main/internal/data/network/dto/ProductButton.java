package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductButton;", "", "action", "", "text", "textColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", C0553n3.g, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getAction", "()Ljava/lang/String;", "getText", "getTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getBackground", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductButton {
    private final String action;
    private final Themes<String> background;
    private final String text;
    private final Themes<String> textColor;

    public /* synthetic */ ProductButton(String str, String str2, Themes themes, Themes themes2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : themes, (i & 8) != 0 ? null : themes2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductButton copy$default(ProductButton productButton, String str, String str2, Themes themes, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productButton.action;
        }
        if ((i & 2) != 0) {
            str2 = productButton.text;
        }
        if ((i & 4) != 0) {
            themes = productButton.textColor;
        }
        if ((i & 8) != 0) {
            themes2 = productButton.background;
        }
        return productButton.copy(str, str2, themes, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<String> component3() {
        return this.textColor;
    }

    public final Themes<String> component4() {
        return this.background;
    }

    public final ProductButton copy(@Json(name = "action") String action, @Json(name = "text") String text, @Json(name = "text_color") Themes<String> textColor, @Json(name = "background") Themes<String> background) {
        return new ProductButton(action, text, textColor, background);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductButton)) {
            return false;
        }
        ProductButton productButton = (ProductButton) other;
        return jl40.l(this.action, productButton.action) && jl40.l(this.text, productButton.text) && jl40.l(this.textColor, productButton.textColor) && jl40.l(this.background, productButton.background);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getBackground() {
        return this.background;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.textColor;
        int hashCode3 = (hashCode2 + (themes == null ? 0 : themes.hashCode())) * 31;
        Themes<String> themes2 = this.background;
        return hashCode3 + (themes2 != null ? themes2.hashCode() : 0);
    }

    public String toString() {
        String str = this.action;
        String str2 = this.text;
        Themes<String> themes = this.textColor;
        Themes<String> themes2 = this.background;
        StringBuilder v = b64.v("ProductButton(action=", str, ", text=", str2, ", textColor=");
        v.append(themes);
        v.append(", background=");
        v.append(themes2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ProductButton(@Json(name = "action") String str, @Json(name = "text") String str2, @Json(name = "text_color") Themes<String> themes, @Json(name = "background") Themes<String> themes2) {
        this.action = str;
        this.text = str2;
        this.textColor = themes;
        this.background = themes2;
    }
}
