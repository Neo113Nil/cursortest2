package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoButtonDto;", "", Constants.DEEPLINK, "", "toolbarImage", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getDeeplink", "()Ljava/lang/String;", "getToolbarImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PageInfoButtonDto {
    private final String deeplink;
    private final ThemedParameter<String> toolbarImage;

    public PageInfoButtonDto(@Json(name = "deeplink") String str, @Json(name = "toolbar_image") ThemedParameter<String> themedParameter) {
        this.deeplink = str;
        this.toolbarImage = themedParameter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageInfoButtonDto copy$default(PageInfoButtonDto pageInfoButtonDto, String str, ThemedParameter themedParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageInfoButtonDto.deeplink;
        }
        if ((i & 2) != 0) {
            themedParameter = pageInfoButtonDto.toolbarImage;
        }
        return pageInfoButtonDto.copy(str, themedParameter);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final ThemedParameter<String> component2() {
        return this.toolbarImage;
    }

    public final PageInfoButtonDto copy(@Json(name = "deeplink") String deeplink, @Json(name = "toolbar_image") ThemedParameter<String> toolbarImage) {
        return new PageInfoButtonDto(deeplink, toolbarImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageInfoButtonDto)) {
            return false;
        }
        PageInfoButtonDto pageInfoButtonDto = (PageInfoButtonDto) other;
        return jl40.l(this.deeplink, pageInfoButtonDto.deeplink) && jl40.l(this.toolbarImage, pageInfoButtonDto.toolbarImage);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final ThemedParameter<String> getToolbarImage() {
        return this.toolbarImage;
    }

    public int hashCode() {
        return this.toolbarImage.hashCode() + (this.deeplink.hashCode() * 31);
    }

    public String toString() {
        return "PageInfoButtonDto(deeplink=" + this.deeplink + ", toolbarImage=" + this.toolbarImage + Extension.C_BRAKE;
    }
}
