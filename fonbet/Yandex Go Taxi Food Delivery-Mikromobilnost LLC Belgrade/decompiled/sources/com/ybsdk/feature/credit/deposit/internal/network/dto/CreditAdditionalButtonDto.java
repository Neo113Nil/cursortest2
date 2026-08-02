package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditAdditionalButtonDto;", "", "title", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "action", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;)V", "getTitle", "()Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "getDescription", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getAction", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditAdditionalButtonDto {
    private final String action;
    private final ColoredTextDto description;
    private final ThemedParameter<String> image;
    private final ColoredTextDto title;

    public CreditAdditionalButtonDto(@Json(name = "title") ColoredTextDto coloredTextDto, @Json(name = "description") ColoredTextDto coloredTextDto2, @Json(name = "image") ThemedParameter<String> themedParameter, @Json(name = "action") String str) {
        this.title = coloredTextDto;
        this.description = coloredTextDto2;
        this.image = themedParameter;
        this.action = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditAdditionalButtonDto copy$default(CreditAdditionalButtonDto creditAdditionalButtonDto, ColoredTextDto coloredTextDto, ColoredTextDto coloredTextDto2, ThemedParameter themedParameter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            coloredTextDto = creditAdditionalButtonDto.title;
        }
        if ((i & 2) != 0) {
            coloredTextDto2 = creditAdditionalButtonDto.description;
        }
        if ((i & 4) != 0) {
            themedParameter = creditAdditionalButtonDto.image;
        }
        if ((i & 8) != 0) {
            str = creditAdditionalButtonDto.action;
        }
        return creditAdditionalButtonDto.copy(coloredTextDto, coloredTextDto2, themedParameter, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ColoredTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ColoredTextDto getDescription() {
        return this.description;
    }

    public final ThemedParameter<String> component3() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final CreditAdditionalButtonDto copy(@Json(name = "title") ColoredTextDto title, @Json(name = "description") ColoredTextDto description, @Json(name = "image") ThemedParameter<String> image, @Json(name = "action") String action) {
        return new CreditAdditionalButtonDto(title, description, image, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditAdditionalButtonDto)) {
            return false;
        }
        CreditAdditionalButtonDto creditAdditionalButtonDto = (CreditAdditionalButtonDto) other;
        return jl40.l(this.title, creditAdditionalButtonDto.title) && jl40.l(this.description, creditAdditionalButtonDto.description) && jl40.l(this.image, creditAdditionalButtonDto.image) && jl40.l(this.action, creditAdditionalButtonDto.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final ColoredTextDto getDescription() {
        return this.description;
    }

    public final ThemedParameter<String> getImage() {
        return this.image;
    }

    public final ColoredTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ColoredTextDto coloredTextDto = this.description;
        return this.action.hashCode() + tse0.d(this.image, (hashCode + (coloredTextDto == null ? 0 : coloredTextDto.hashCode())) * 31, 31);
    }

    public String toString() {
        return "CreditAdditionalButtonDto(title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", action=" + this.action + Extension.C_BRAKE;
    }

    public /* synthetic */ CreditAdditionalButtonDto(ColoredTextDto coloredTextDto, ColoredTextDto coloredTextDto2, ThemedParameter themedParameter, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coloredTextDto, (i & 2) != 0 ? null : coloredTextDto2, themedParameter, str);
    }
}
