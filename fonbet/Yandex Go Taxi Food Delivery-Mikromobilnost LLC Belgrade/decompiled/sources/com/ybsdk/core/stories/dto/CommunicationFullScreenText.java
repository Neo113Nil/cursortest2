package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.design.design.DesignTextStyle;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/core/stories/dto/CommunicationFullScreenText;", "", "text", "", "textColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "alignment", "Lcom/ybsdk/core/stories/dto/HorizontalAlignment;", "textStyle", "Lcom/ybsdk/core/design/design/DesignTextStyle;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/stories/dto/HorizontalAlignment;Lcom/ybsdk/core/design/design/DesignTextStyle;)V", "getText", "()Ljava/lang/String;", "getTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAlignment", "()Lcom/ybsdk/core/stories/dto/HorizontalAlignment;", "getTextStyle", "()Lcom/ybsdk/core/design/design/DesignTextStyle;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommunicationFullScreenText {
    private final HorizontalAlignment alignment;
    private final String text;
    private final Themes<String> textColor;
    private final DesignTextStyle textStyle;

    public CommunicationFullScreenText(@Json(name = "text") String str, @Json(name = "text_color") Themes<String> themes, @Json(name = "alignment") HorizontalAlignment horizontalAlignment, @Json(name = "text_style") DesignTextStyle designTextStyle) {
        this.text = str;
        this.textColor = themes;
        this.alignment = horizontalAlignment;
        this.textStyle = designTextStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunicationFullScreenText copy$default(CommunicationFullScreenText communicationFullScreenText, String str, Themes themes, HorizontalAlignment horizontalAlignment, DesignTextStyle designTextStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communicationFullScreenText.text;
        }
        if ((i & 2) != 0) {
            themes = communicationFullScreenText.textColor;
        }
        if ((i & 4) != 0) {
            horizontalAlignment = communicationFullScreenText.alignment;
        }
        if ((i & 8) != 0) {
            designTextStyle = communicationFullScreenText.textStyle;
        }
        return communicationFullScreenText.copy(str, themes, horizontalAlignment, designTextStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<String> component2() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final HorizontalAlignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component4, reason: from getter */
    public final DesignTextStyle getTextStyle() {
        return this.textStyle;
    }

    public final CommunicationFullScreenText copy(@Json(name = "text") String text, @Json(name = "text_color") Themes<String> textColor, @Json(name = "alignment") HorizontalAlignment alignment, @Json(name = "text_style") DesignTextStyle textStyle) {
        return new CommunicationFullScreenText(text, textColor, alignment, textStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationFullScreenText)) {
            return false;
        }
        CommunicationFullScreenText communicationFullScreenText = (CommunicationFullScreenText) other;
        return jl40.l(this.text, communicationFullScreenText.text) && jl40.l(this.textColor, communicationFullScreenText.textColor) && this.alignment == communicationFullScreenText.alignment && this.textStyle == communicationFullScreenText.textStyle;
    }

    public final HorizontalAlignment getAlignment() {
        return this.alignment;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public final DesignTextStyle getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Themes<String> themes = this.textColor;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        HorizontalAlignment horizontalAlignment = this.alignment;
        int hashCode3 = (hashCode2 + (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode())) * 31;
        DesignTextStyle designTextStyle = this.textStyle;
        return hashCode3 + (designTextStyle != null ? designTextStyle.hashCode() : 0);
    }

    public String toString() {
        return "CommunicationFullScreenText(text=" + this.text + ", textColor=" + this.textColor + ", alignment=" + this.alignment + ", textStyle=" + this.textStyle + Extension.C_BRAKE;
    }
}
