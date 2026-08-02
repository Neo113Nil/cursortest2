package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardClaimingTheme;", "", "cardSkin", "", "inputHeaderColor", "inputPlaceholderColor", "inputBackgroundColor", "inputTextColorFocus", "inputTextColorUnfocus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardSkin", "()Ljava/lang/String;", "getInputHeaderColor", "getInputPlaceholderColor", "getInputBackgroundColor", "getInputTextColorFocus", "getInputTextColorUnfocus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardClaimingTheme {
    private final String cardSkin;
    private final String inputBackgroundColor;
    private final String inputHeaderColor;
    private final String inputPlaceholderColor;
    private final String inputTextColorFocus;
    private final String inputTextColorUnfocus;

    public CardClaimingTheme(@Json(name = "card_skin_image_url") String str, @Json(name = "input_header_color") String str2, @Json(name = "input_placeholder_color") String str3, @Json(name = "input_background_color") String str4, @Json(name = "input_text_color_focus") String str5, @Json(name = "input_text_color_unfocus") String str6) {
        this.cardSkin = str;
        this.inputHeaderColor = str2;
        this.inputPlaceholderColor = str3;
        this.inputBackgroundColor = str4;
        this.inputTextColorFocus = str5;
        this.inputTextColorUnfocus = str6;
    }

    public static /* synthetic */ CardClaimingTheme copy$default(CardClaimingTheme cardClaimingTheme, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardClaimingTheme.cardSkin;
        }
        if ((i & 2) != 0) {
            str2 = cardClaimingTheme.inputHeaderColor;
        }
        if ((i & 4) != 0) {
            str3 = cardClaimingTheme.inputPlaceholderColor;
        }
        if ((i & 8) != 0) {
            str4 = cardClaimingTheme.inputBackgroundColor;
        }
        if ((i & 16) != 0) {
            str5 = cardClaimingTheme.inputTextColorFocus;
        }
        if ((i & 32) != 0) {
            str6 = cardClaimingTheme.inputTextColorUnfocus;
        }
        String str7 = str5;
        String str8 = str6;
        return cardClaimingTheme.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCardSkin() {
        return this.cardSkin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInputHeaderColor() {
        return this.inputHeaderColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInputPlaceholderColor() {
        return this.inputPlaceholderColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInputBackgroundColor() {
        return this.inputBackgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInputTextColorFocus() {
        return this.inputTextColorFocus;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInputTextColorUnfocus() {
        return this.inputTextColorUnfocus;
    }

    public final CardClaimingTheme copy(@Json(name = "card_skin_image_url") String cardSkin, @Json(name = "input_header_color") String inputHeaderColor, @Json(name = "input_placeholder_color") String inputPlaceholderColor, @Json(name = "input_background_color") String inputBackgroundColor, @Json(name = "input_text_color_focus") String inputTextColorFocus, @Json(name = "input_text_color_unfocus") String inputTextColorUnfocus) {
        return new CardClaimingTheme(cardSkin, inputHeaderColor, inputPlaceholderColor, inputBackgroundColor, inputTextColorFocus, inputTextColorUnfocus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardClaimingTheme)) {
            return false;
        }
        CardClaimingTheme cardClaimingTheme = (CardClaimingTheme) other;
        return jl40.l(this.cardSkin, cardClaimingTheme.cardSkin) && jl40.l(this.inputHeaderColor, cardClaimingTheme.inputHeaderColor) && jl40.l(this.inputPlaceholderColor, cardClaimingTheme.inputPlaceholderColor) && jl40.l(this.inputBackgroundColor, cardClaimingTheme.inputBackgroundColor) && jl40.l(this.inputTextColorFocus, cardClaimingTheme.inputTextColorFocus) && jl40.l(this.inputTextColorUnfocus, cardClaimingTheme.inputTextColorUnfocus);
    }

    public final String getCardSkin() {
        return this.cardSkin;
    }

    public final String getInputBackgroundColor() {
        return this.inputBackgroundColor;
    }

    public final String getInputHeaderColor() {
        return this.inputHeaderColor;
    }

    public final String getInputPlaceholderColor() {
        return this.inputPlaceholderColor;
    }

    public final String getInputTextColorFocus() {
        return this.inputTextColorFocus;
    }

    public final String getInputTextColorUnfocus() {
        return this.inputTextColorUnfocus;
    }

    public int hashCode() {
        return this.inputTextColorUnfocus.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.cardSkin.hashCode() * 31, 31, this.inputHeaderColor), 31, this.inputPlaceholderColor), 31, this.inputBackgroundColor), 31, this.inputTextColorFocus);
    }

    public String toString() {
        String str = this.cardSkin;
        String str2 = this.inputHeaderColor;
        String str3 = this.inputPlaceholderColor;
        String str4 = this.inputBackgroundColor;
        String str5 = this.inputTextColorFocus;
        String str6 = this.inputTextColorUnfocus;
        StringBuilder v = b64.v("CardClaimingTheme(cardSkin=", str, ", inputHeaderColor=", str2, ", inputPlaceholderColor=");
        g8e.D(v, str3, ", inputBackgroundColor=", str4, ", inputTextColorFocus=");
        return g8e.r(v, str5, ", inputTextColorUnfocus=", str6, Extension.C_BRAKE);
    }
}
