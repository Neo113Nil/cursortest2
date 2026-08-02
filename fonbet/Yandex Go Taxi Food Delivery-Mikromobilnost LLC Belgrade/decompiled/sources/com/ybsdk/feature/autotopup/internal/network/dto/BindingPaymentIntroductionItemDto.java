package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentIntroductionItemDto;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "text", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BindingPaymentIntroductionItemDto {
    private final Themes<String> image;
    private final String text;

    public BindingPaymentIntroductionItemDto(@Json(name = "image") Themes<String> themes, @Json(name = "text") String str) {
        this.image = themes;
        this.text = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindingPaymentIntroductionItemDto copy$default(BindingPaymentIntroductionItemDto bindingPaymentIntroductionItemDto, Themes themes, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = bindingPaymentIntroductionItemDto.image;
        }
        if ((i & 2) != 0) {
            str = bindingPaymentIntroductionItemDto.text;
        }
        return bindingPaymentIntroductionItemDto.copy(themes, str);
    }

    public final Themes<String> component1() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final BindingPaymentIntroductionItemDto copy(@Json(name = "image") Themes<String> image, @Json(name = "text") String text) {
        return new BindingPaymentIntroductionItemDto(image, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindingPaymentIntroductionItemDto)) {
            return false;
        }
        BindingPaymentIntroductionItemDto bindingPaymentIntroductionItemDto = (BindingPaymentIntroductionItemDto) other;
        return jl40.l(this.image, bindingPaymentIntroductionItemDto.image) && jl40.l(this.text, bindingPaymentIntroductionItemDto.text);
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.image.hashCode() * 31);
    }

    public String toString() {
        return "BindingPaymentIntroductionItemDto(image=" + this.image + ", text=" + this.text + Extension.C_BRAKE;
    }
}
