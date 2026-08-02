package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceItem;", "", "coloredText", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getColoredText", "()Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BalanceItem {
    private final ColoredTextDto coloredText;
    private final Themes<String> themedImage;

    public BalanceItem(@Json(name = "colored_text") ColoredTextDto coloredTextDto, @Json(name = "image") Themes<String> themes) {
        this.coloredText = coloredTextDto;
        this.themedImage = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BalanceItem copy$default(BalanceItem balanceItem, ColoredTextDto coloredTextDto, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            coloredTextDto = balanceItem.coloredText;
        }
        if ((i & 2) != 0) {
            themes = balanceItem.themedImage;
        }
        return balanceItem.copy(coloredTextDto, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final ColoredTextDto getColoredText() {
        return this.coloredText;
    }

    public final Themes<String> component2() {
        return this.themedImage;
    }

    public final BalanceItem copy(@Json(name = "colored_text") ColoredTextDto coloredText, @Json(name = "image") Themes<String> themedImage) {
        return new BalanceItem(coloredText, themedImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceItem)) {
            return false;
        }
        BalanceItem balanceItem = (BalanceItem) other;
        return jl40.l(this.coloredText, balanceItem.coloredText) && jl40.l(this.themedImage, balanceItem.themedImage);
    }

    public final ColoredTextDto getColoredText() {
        return this.coloredText;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public int hashCode() {
        int hashCode = this.coloredText.hashCode() * 31;
        Themes<String> themes = this.themedImage;
        return hashCode + (themes == null ? 0 : themes.hashCode());
    }

    public String toString() {
        return "BalanceItem(coloredText=" + this.coloredText + ", themedImage=" + this.themedImage + Extension.C_BRAKE;
    }
}
