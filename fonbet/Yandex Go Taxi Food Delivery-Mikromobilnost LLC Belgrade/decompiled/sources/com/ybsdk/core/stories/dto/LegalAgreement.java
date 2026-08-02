package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/core/stories/dto/LegalAgreement;", "", "html", "", "textColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "linkColor", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getHtml", "()Ljava/lang/String;", "getTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getLinkColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LegalAgreement {
    private final String html;
    private final Themes<String> linkColor;
    private final Themes<String> textColor;

    public LegalAgreement(@Json(name = "html") String str, @Json(name = "text_color") Themes<String> themes, @Json(name = "link_color") Themes<String> themes2) {
        this.html = str;
        this.textColor = themes;
        this.linkColor = themes2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegalAgreement copy$default(LegalAgreement legalAgreement, String str, Themes themes, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legalAgreement.html;
        }
        if ((i & 2) != 0) {
            themes = legalAgreement.textColor;
        }
        if ((i & 4) != 0) {
            themes2 = legalAgreement.linkColor;
        }
        return legalAgreement.copy(str, themes, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    public final Themes<String> component2() {
        return this.textColor;
    }

    public final Themes<String> component3() {
        return this.linkColor;
    }

    public final LegalAgreement copy(@Json(name = "html") String html, @Json(name = "text_color") Themes<String> textColor, @Json(name = "link_color") Themes<String> linkColor) {
        return new LegalAgreement(html, textColor, linkColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalAgreement)) {
            return false;
        }
        LegalAgreement legalAgreement = (LegalAgreement) other;
        return jl40.l(this.html, legalAgreement.html) && jl40.l(this.textColor, legalAgreement.textColor) && jl40.l(this.linkColor, legalAgreement.linkColor);
    }

    public final String getHtml() {
        return this.html;
    }

    public final Themes<String> getLinkColor() {
        return this.linkColor;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = this.html.hashCode() * 31;
        Themes<String> themes = this.textColor;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        Themes<String> themes2 = this.linkColor;
        return hashCode2 + (themes2 != null ? themes2.hashCode() : 0);
    }

    public String toString() {
        String str = this.html;
        Themes<String> themes = this.textColor;
        Themes<String> themes2 = this.linkColor;
        StringBuilder sb = new StringBuilder("LegalAgreement(html=");
        sb.append(str);
        sb.append(", textColor=");
        sb.append(themes);
        sb.append(", linkColor=");
        return smw0.l(sb, themes2, Extension.C_BRAKE);
    }
}
