package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.smw0;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsInterestHintResponse;", "", "text", "", "textColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "amountBackground", "amountTextColor", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAmountBackground", "getAmountTextColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsInterestHintResponse {
    private final Money amount;
    private final Themes<String> amountBackground;
    private final Themes<String> amountTextColor;
    private final String text;
    private final Themes<String> textColor;

    public SavingsInterestHintResponse(@Json(name = "text") String str, @Json(name = "text_color") Themes<String> themes, @Json(name = "amount") Money money, @Json(name = "amount_background") Themes<String> themes2, @Json(name = "amount_text_color") Themes<String> themes3) {
        this.text = str;
        this.textColor = themes;
        this.amount = money;
        this.amountBackground = themes2;
        this.amountTextColor = themes3;
    }

    public static /* synthetic */ SavingsInterestHintResponse copy$default(SavingsInterestHintResponse savingsInterestHintResponse, String str, Themes themes, Money money, Themes themes2, Themes themes3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsInterestHintResponse.text;
        }
        if ((i & 2) != 0) {
            themes = savingsInterestHintResponse.textColor;
        }
        if ((i & 4) != 0) {
            money = savingsInterestHintResponse.amount;
        }
        if ((i & 8) != 0) {
            themes2 = savingsInterestHintResponse.amountBackground;
        }
        if ((i & 16) != 0) {
            themes3 = savingsInterestHintResponse.amountTextColor;
        }
        Themes themes4 = themes3;
        Money money2 = money;
        return savingsInterestHintResponse.copy(str, themes, money2, themes2, themes4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<String> component2() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    public final Themes<String> component4() {
        return this.amountBackground;
    }

    public final Themes<String> component5() {
        return this.amountTextColor;
    }

    public final SavingsInterestHintResponse copy(@Json(name = "text") String text, @Json(name = "text_color") Themes<String> textColor, @Json(name = "amount") Money amount, @Json(name = "amount_background") Themes<String> amountBackground, @Json(name = "amount_text_color") Themes<String> amountTextColor) {
        return new SavingsInterestHintResponse(text, textColor, amount, amountBackground, amountTextColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsInterestHintResponse)) {
            return false;
        }
        SavingsInterestHintResponse savingsInterestHintResponse = (SavingsInterestHintResponse) other;
        return jl40.l(this.text, savingsInterestHintResponse.text) && jl40.l(this.textColor, savingsInterestHintResponse.textColor) && jl40.l(this.amount, savingsInterestHintResponse.amount) && jl40.l(this.amountBackground, savingsInterestHintResponse.amountBackground) && jl40.l(this.amountTextColor, savingsInterestHintResponse.amountTextColor);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Themes<String> getAmountBackground() {
        return this.amountBackground;
    }

    public final Themes<String> getAmountTextColor() {
        return this.amountTextColor;
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.amountTextColor.hashCode() + nnm.c(this.amountBackground, tse0.c(this.amount, nnm.c(this.textColor, this.text.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.text;
        Themes<String> themes = this.textColor;
        Money money = this.amount;
        Themes<String> themes2 = this.amountBackground;
        Themes<String> themes3 = this.amountTextColor;
        StringBuilder sb = new StringBuilder("SavingsInterestHintResponse(text=");
        sb.append(str);
        sb.append(", textColor=");
        sb.append(themes);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", amountBackground=");
        sb.append(themes2);
        sb.append(", amountTextColor=");
        return smw0.l(sb, themes3, Extension.C_BRAKE);
    }
}
