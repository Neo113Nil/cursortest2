package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import defpackage.jl40;
import defpackage.nnm;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/BalanceV4Dto;", "", "text", "Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "color", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "icon", "radialGradient", "Lcom/ybsdk/feature/dashboard/internal/data/dto/RadialGradientDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/feature/dashboard/internal/data/dto/RadialGradientDto;)V", "getText", "()Lcom/ybsdk/core/common/data/network/dto/cache/DataEntryDescriptorDto;", "getColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getIcon", "getRadialGradient", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/RadialGradientDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BalanceV4Dto {
    private final Themes<String> color;
    private final Themes<String> icon;
    private final RadialGradientDto radialGradient;
    private final DataEntryDescriptorDto text;

    public BalanceV4Dto(@Json(name = "text") DataEntryDescriptorDto dataEntryDescriptorDto, @Json(name = "color") Themes<String> themes, @Json(name = "icon") Themes<String> themes2, @Json(name = "radial_gradient") RadialGradientDto radialGradientDto) {
        this.text = dataEntryDescriptorDto;
        this.color = themes;
        this.icon = themes2;
        this.radialGradient = radialGradientDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BalanceV4Dto copy$default(BalanceV4Dto balanceV4Dto, DataEntryDescriptorDto dataEntryDescriptorDto, Themes themes, Themes themes2, RadialGradientDto radialGradientDto, int i, Object obj) {
        if ((i & 1) != 0) {
            dataEntryDescriptorDto = balanceV4Dto.text;
        }
        if ((i & 2) != 0) {
            themes = balanceV4Dto.color;
        }
        if ((i & 4) != 0) {
            themes2 = balanceV4Dto.icon;
        }
        if ((i & 8) != 0) {
            radialGradientDto = balanceV4Dto.radialGradient;
        }
        return balanceV4Dto.copy(dataEntryDescriptorDto, themes, themes2, radialGradientDto);
    }

    /* renamed from: component1, reason: from getter */
    public final DataEntryDescriptorDto getText() {
        return this.text;
    }

    public final Themes<String> component2() {
        return this.color;
    }

    public final Themes<String> component3() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final RadialGradientDto getRadialGradient() {
        return this.radialGradient;
    }

    public final BalanceV4Dto copy(@Json(name = "text") DataEntryDescriptorDto text, @Json(name = "color") Themes<String> color, @Json(name = "icon") Themes<String> icon, @Json(name = "radial_gradient") RadialGradientDto radialGradient) {
        return new BalanceV4Dto(text, color, icon, radialGradient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceV4Dto)) {
            return false;
        }
        BalanceV4Dto balanceV4Dto = (BalanceV4Dto) other;
        return jl40.l(this.text, balanceV4Dto.text) && jl40.l(this.color, balanceV4Dto.color) && jl40.l(this.icon, balanceV4Dto.icon) && jl40.l(this.radialGradient, balanceV4Dto.radialGradient);
    }

    public final Themes<String> getColor() {
        return this.color;
    }

    public final Themes<String> getIcon() {
        return this.icon;
    }

    public final RadialGradientDto getRadialGradient() {
        return this.radialGradient;
    }

    public final DataEntryDescriptorDto getText() {
        return this.text;
    }

    public int hashCode() {
        int c = nnm.c(this.color, this.text.hashCode() * 31, 31);
        Themes<String> themes = this.icon;
        int hashCode = (c + (themes == null ? 0 : themes.hashCode())) * 31;
        RadialGradientDto radialGradientDto = this.radialGradient;
        return hashCode + (radialGradientDto != null ? radialGradientDto.hashCode() : 0);
    }

    public String toString() {
        return "BalanceV4Dto(text=" + this.text + ", color=" + this.color + ", icon=" + this.icon + ", radialGradient=" + this.radialGradient + Extension.C_BRAKE;
    }
}
