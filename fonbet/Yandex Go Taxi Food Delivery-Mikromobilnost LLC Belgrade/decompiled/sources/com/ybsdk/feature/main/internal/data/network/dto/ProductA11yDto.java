package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductA11yDto;", "", "subtitle", "", "<init>", "(Ljava/lang/String;)V", "getSubtitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductA11yDto {
    private final String subtitle;

    public ProductA11yDto(@Json(name = "subtitle") String str) {
        this.subtitle = str;
    }

    public static /* synthetic */ ProductA11yDto copy$default(ProductA11yDto productA11yDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productA11yDto.subtitle;
        }
        return productA11yDto.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ProductA11yDto copy(@Json(name = "subtitle") String subtitle) {
        return new ProductA11yDto(subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductA11yDto) && jl40.l(this.subtitle, ((ProductA11yDto) other).subtitle);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        String str = this.subtitle;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return oyr.p("ProductA11yDto(subtitle=", this.subtitle, Extension.C_BRAKE);
    }
}
