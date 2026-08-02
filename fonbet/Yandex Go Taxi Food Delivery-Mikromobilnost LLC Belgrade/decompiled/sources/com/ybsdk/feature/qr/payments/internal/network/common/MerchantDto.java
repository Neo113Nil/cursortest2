package com.ybsdk.feature.qr.payments.internal.network.common;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/common/MerchantDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", "themedLogo", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLogo$annotations", "()V", "getLogo", "getThemedLogo", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantDto {
    private final String description;
    private final String logo;
    private final Themes<String> themedLogo;
    private final String title;

    public MerchantDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "logo") String str3, @Json(name = "themed_logo") Themes<String> themes) {
        this.title = str;
        this.description = str2;
        this.logo = str3;
        this.themedLogo = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantDto copy$default(MerchantDto merchantDto, String str, String str2, String str3, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merchantDto.title;
        }
        if ((i & 2) != 0) {
            str2 = merchantDto.description;
        }
        if ((i & 4) != 0) {
            str3 = merchantDto.logo;
        }
        if ((i & 8) != 0) {
            themes = merchantDto.themedLogo;
        }
        return merchantDto.copy(str, str2, str3, themes);
    }

    @jxi
    public static /* synthetic */ void getLogo$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> component4() {
        return this.themedLogo;
    }

    public final MerchantDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "logo") String logo, @Json(name = "themed_logo") Themes<String> themedLogo) {
        return new MerchantDto(title, description, logo, themedLogo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantDto)) {
            return false;
        }
        MerchantDto merchantDto = (MerchantDto) other;
        return jl40.l(this.title, merchantDto.title) && jl40.l(this.description, merchantDto.description) && jl40.l(this.logo, merchantDto.logo) && jl40.l(this.themedLogo, merchantDto.themedLogo);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Themes<String> getThemedLogo() {
        return this.themedLogo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.logo);
        Themes<String> themes = this.themedLogo;
        return b + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.logo;
        Themes<String> themes = this.themedLogo;
        StringBuilder v = b64.v("MerchantDto(title=", str, ", description=", str2, ", logo=");
        v.append(str3);
        v.append(", themedLogo=");
        v.append(themes);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
