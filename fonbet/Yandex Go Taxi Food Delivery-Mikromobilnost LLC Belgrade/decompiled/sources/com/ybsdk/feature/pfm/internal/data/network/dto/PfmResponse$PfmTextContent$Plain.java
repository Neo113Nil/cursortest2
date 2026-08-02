package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.jl40;
import defpackage.kcb0;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain", "Lkcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;", "contentType", "", "text", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "textColor", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$TextType;", "getContentType", "Ljava/lang/String;", "getText", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTextColor", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$PfmTextContent$Plain implements kcb0 {
    private final PfmResponse.TextType contentType;
    private final String text;
    private final Themes<String> textColor;

    public PfmResponse$PfmTextContent$Plain(@Json(name = "content_type") PfmResponse.TextType textType, @Json(name = "text") String str, @Json(name = "text_color") Themes<String> themes) {
        this.contentType = textType;
        this.text = str;
        this.textColor = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PfmResponse$PfmTextContent$Plain copy$default(PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, PfmResponse.TextType textType, String str, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            textType = pfmResponse$PfmTextContent$Plain.contentType;
        }
        if ((i & 2) != 0) {
            str = pfmResponse$PfmTextContent$Plain.text;
        }
        if ((i & 4) != 0) {
            themes = pfmResponse$PfmTextContent$Plain.textColor;
        }
        return pfmResponse$PfmTextContent$Plain.copy(textType, str, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.TextType getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<String> component3() {
        return this.textColor;
    }

    public final PfmResponse$PfmTextContent$Plain copy(@Json(name = "content_type") PfmResponse.TextType contentType, @Json(name = "text") String text, @Json(name = "text_color") Themes<String> textColor) {
        return new PfmResponse$PfmTextContent$Plain(contentType, text, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$PfmTextContent$Plain)) {
            return false;
        }
        PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain = (PfmResponse$PfmTextContent$Plain) other;
        return this.contentType == pfmResponse$PfmTextContent$Plain.contentType && jl40.l(this.text, pfmResponse$PfmTextContent$Plain.text) && jl40.l(this.textColor, pfmResponse$PfmTextContent$Plain.textColor);
    }

    public final PfmResponse.TextType getContentType() {
        return this.contentType;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int b = unr0.b(this.contentType.hashCode() * 31, 31, this.text);
        Themes<String> themes = this.textColor;
        return b + (themes == null ? 0 : themes.hashCode());
    }

    public String toString() {
        PfmResponse.TextType textType = this.contentType;
        String str = this.text;
        Themes<String> themes = this.textColor;
        StringBuilder sb = new StringBuilder("Plain(contentType=");
        sb.append(textType);
        sb.append(", text=");
        sb.append(str);
        sb.append(", textColor=");
        return smw0.l(sb, themes, Extension.C_BRAKE);
    }
}
