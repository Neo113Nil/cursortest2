package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarDayStyle;", "", "highlightColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "textColor", "tooltip", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarTooltip;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarTooltip;)V", "getHighlightColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getTextColor", "getTooltip", "()Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarTooltip;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiffRateCalendarDayStyle {
    private final Themes<String> highlightColor;
    private final Themes<String> textColor;
    private final DiffRateCalendarTooltip tooltip;

    public DiffRateCalendarDayStyle(@Json(name = "highlight_color") Themes<String> themes, @Json(name = "text_color") Themes<String> themes2, @Json(name = "tooltip") DiffRateCalendarTooltip diffRateCalendarTooltip) {
        this.highlightColor = themes;
        this.textColor = themes2;
        this.tooltip = diffRateCalendarTooltip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiffRateCalendarDayStyle copy$default(DiffRateCalendarDayStyle diffRateCalendarDayStyle, Themes themes, Themes themes2, DiffRateCalendarTooltip diffRateCalendarTooltip, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = diffRateCalendarDayStyle.highlightColor;
        }
        if ((i & 2) != 0) {
            themes2 = diffRateCalendarDayStyle.textColor;
        }
        if ((i & 4) != 0) {
            diffRateCalendarTooltip = diffRateCalendarDayStyle.tooltip;
        }
        return diffRateCalendarDayStyle.copy(themes, themes2, diffRateCalendarTooltip);
    }

    public final Themes<String> component1() {
        return this.highlightColor;
    }

    public final Themes<String> component2() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final DiffRateCalendarTooltip getTooltip() {
        return this.tooltip;
    }

    public final DiffRateCalendarDayStyle copy(@Json(name = "highlight_color") Themes<String> highlightColor, @Json(name = "text_color") Themes<String> textColor, @Json(name = "tooltip") DiffRateCalendarTooltip tooltip) {
        return new DiffRateCalendarDayStyle(highlightColor, textColor, tooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiffRateCalendarDayStyle)) {
            return false;
        }
        DiffRateCalendarDayStyle diffRateCalendarDayStyle = (DiffRateCalendarDayStyle) other;
        return jl40.l(this.highlightColor, diffRateCalendarDayStyle.highlightColor) && jl40.l(this.textColor, diffRateCalendarDayStyle.textColor) && jl40.l(this.tooltip, diffRateCalendarDayStyle.tooltip);
    }

    public final Themes<String> getHighlightColor() {
        return this.highlightColor;
    }

    public final Themes<String> getTextColor() {
        return this.textColor;
    }

    public final DiffRateCalendarTooltip getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        Themes<String> themes = this.highlightColor;
        int c = nnm.c(this.textColor, (themes == null ? 0 : themes.hashCode()) * 31, 31);
        DiffRateCalendarTooltip diffRateCalendarTooltip = this.tooltip;
        return c + (diffRateCalendarTooltip != null ? diffRateCalendarTooltip.hashCode() : 0);
    }

    public String toString() {
        return "DiffRateCalendarDayStyle(highlightColor=" + this.highlightColor + ", textColor=" + this.textColor + ", tooltip=" + this.tooltip + Extension.C_BRAKE;
    }
}
