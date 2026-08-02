package com.ybsdk.core.stories.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/core/stories/dto/CommunicationFullScreenButton;", "", "text", "", "action", "textColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getAction", "getTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommunicationFullScreenButton {
    private final String action;
    private final Themes<String> backgroundColor;
    private final String text;
    private final Themes<String> textColor;

    public CommunicationFullScreenButton(@Json(name = "text") String str, @Json(name = "action") String str2, @Json(name = "text_color") Themes<String> themes, @Json(name = "background_color") Themes<String> themes2) {
        this.text = str;
        this.action = str2;
        this.textColor = themes;
        this.backgroundColor = themes2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunicationFullScreenButton copy$default(CommunicationFullScreenButton communicationFullScreenButton, String str, String str2, Themes themes, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communicationFullScreenButton.text;
        }
        if ((i & 2) != 0) {
            str2 = communicationFullScreenButton.action;
        }
        if ((i & 4) != 0) {
            themes = communicationFullScreenButton.textColor;
        }
        if ((i & 8) != 0) {
            themes2 = communicationFullScreenButton.backgroundColor;
        }
        return communicationFullScreenButton.copy(str, str2, themes, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Themes<String> component3() {
        return this.textColor;
    }

    public final Themes<String> component4() {
        return this.backgroundColor;
    }

    public final CommunicationFullScreenButton copy(@Json(name = "text") String text, @Json(name = "action") String action, @Json(name = "text_color") Themes<String> textColor, @Json(name = "background_color") Themes<String> backgroundColor) {
        return new CommunicationFullScreenButton(text, action, textColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationFullScreenButton)) {
            return false;
        }
        CommunicationFullScreenButton communicationFullScreenButton = (CommunicationFullScreenButton) other;
        return jl40.l(this.text, communicationFullScreenButton.text) && jl40.l(this.action, communicationFullScreenButton.action) && jl40.l(this.textColor, communicationFullScreenButton.textColor) && jl40.l(this.backgroundColor, communicationFullScreenButton.backgroundColor);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int b = unr0.b(this.text.hashCode() * 31, 31, this.action);
        Themes<String> themes = this.textColor;
        int hashCode = (b + (themes == null ? 0 : themes.hashCode())) * 31;
        Themes<String> themes2 = this.backgroundColor;
        return hashCode + (themes2 != null ? themes2.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.action;
        Themes<String> themes = this.textColor;
        Themes<String> themes2 = this.backgroundColor;
        StringBuilder v = b64.v("CommunicationFullScreenButton(text=", str, ", action=", str2, ", textColor=");
        v.append(themes);
        v.append(", backgroundColor=");
        v.append(themes2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
