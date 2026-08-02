package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetOverridesDto;", "", "title", "", "subtitle", "primaryButton", "Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetButtonDto;", "legalText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetButtonDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryButton", "()Lcom/ybsdk/feature/main/internal/data/network/dto/BindAccountSheetButtonDto;", "getLegalText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BindAccountSheetOverridesDto {
    private final String legalText;
    private final BindAccountSheetButtonDto primaryButton;
    private final String subtitle;
    private final String title;

    public BindAccountSheetOverridesDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "primary_button") BindAccountSheetButtonDto bindAccountSheetButtonDto, @Json(name = "legal_text") String str3) {
        this.title = str;
        this.subtitle = str2;
        this.primaryButton = bindAccountSheetButtonDto;
        this.legalText = str3;
    }

    public static /* synthetic */ BindAccountSheetOverridesDto copy$default(BindAccountSheetOverridesDto bindAccountSheetOverridesDto, String str, String str2, BindAccountSheetButtonDto bindAccountSheetButtonDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindAccountSheetOverridesDto.title;
        }
        if ((i & 2) != 0) {
            str2 = bindAccountSheetOverridesDto.subtitle;
        }
        if ((i & 4) != 0) {
            bindAccountSheetButtonDto = bindAccountSheetOverridesDto.primaryButton;
        }
        if ((i & 8) != 0) {
            str3 = bindAccountSheetOverridesDto.legalText;
        }
        return bindAccountSheetOverridesDto.copy(str, str2, bindAccountSheetButtonDto, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final BindAccountSheetButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLegalText() {
        return this.legalText;
    }

    public final BindAccountSheetOverridesDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "primary_button") BindAccountSheetButtonDto primaryButton, @Json(name = "legal_text") String legalText) {
        return new BindAccountSheetOverridesDto(title, subtitle, primaryButton, legalText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindAccountSheetOverridesDto)) {
            return false;
        }
        BindAccountSheetOverridesDto bindAccountSheetOverridesDto = (BindAccountSheetOverridesDto) other;
        return jl40.l(this.title, bindAccountSheetOverridesDto.title) && jl40.l(this.subtitle, bindAccountSheetOverridesDto.subtitle) && jl40.l(this.primaryButton, bindAccountSheetOverridesDto.primaryButton) && jl40.l(this.legalText, bindAccountSheetOverridesDto.legalText);
    }

    public final String getLegalText() {
        return this.legalText;
    }

    public final BindAccountSheetButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BindAccountSheetButtonDto bindAccountSheetButtonDto = this.primaryButton;
        int hashCode3 = (hashCode2 + (bindAccountSheetButtonDto == null ? 0 : bindAccountSheetButtonDto.hashCode())) * 31;
        String str3 = this.legalText;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        BindAccountSheetButtonDto bindAccountSheetButtonDto = this.primaryButton;
        String str3 = this.legalText;
        StringBuilder v = b64.v("BindAccountSheetOverridesDto(title=", str, ", subtitle=", str2, ", primaryButton=");
        v.append(bindAccountSheetButtonDto);
        v.append(", legalText=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
