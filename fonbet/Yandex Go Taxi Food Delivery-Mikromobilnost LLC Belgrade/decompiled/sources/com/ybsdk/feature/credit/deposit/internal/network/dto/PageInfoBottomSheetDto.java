package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PageInfoBottomSheetDto;", "", "bottomSheetImage", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "buttonText", "toolbarImage", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getBottomSheetImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getTitle", "()Ljava/lang/String;", "getDescription", "getButtonText", "getToolbarImage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PageInfoBottomSheetDto {
    private final ThemedParameter<String> bottomSheetImage;
    private final String buttonText;
    private final String description;
    private final String title;
    private final ThemedParameter<String> toolbarImage;

    public PageInfoBottomSheetDto(@Json(name = "bottom_sheet_image") ThemedParameter<String> themedParameter, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "button_text") String str3, @Json(name = "toolbar_image") ThemedParameter<String> themedParameter2) {
        this.bottomSheetImage = themedParameter;
        this.title = str;
        this.description = str2;
        this.buttonText = str3;
        this.toolbarImage = themedParameter2;
    }

    public static /* synthetic */ PageInfoBottomSheetDto copy$default(PageInfoBottomSheetDto pageInfoBottomSheetDto, ThemedParameter themedParameter, String str, String str2, String str3, ThemedParameter themedParameter2, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = pageInfoBottomSheetDto.bottomSheetImage;
        }
        if ((i & 2) != 0) {
            str = pageInfoBottomSheetDto.title;
        }
        if ((i & 4) != 0) {
            str2 = pageInfoBottomSheetDto.description;
        }
        if ((i & 8) != 0) {
            str3 = pageInfoBottomSheetDto.buttonText;
        }
        if ((i & 16) != 0) {
            themedParameter2 = pageInfoBottomSheetDto.toolbarImage;
        }
        ThemedParameter themedParameter3 = themedParameter2;
        String str4 = str2;
        return pageInfoBottomSheetDto.copy(themedParameter, str, str4, str3, themedParameter3);
    }

    public final ThemedParameter<String> component1() {
        return this.bottomSheetImage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    public final ThemedParameter<String> component5() {
        return this.toolbarImage;
    }

    public final PageInfoBottomSheetDto copy(@Json(name = "bottom_sheet_image") ThemedParameter<String> bottomSheetImage, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "button_text") String buttonText, @Json(name = "toolbar_image") ThemedParameter<String> toolbarImage) {
        return new PageInfoBottomSheetDto(bottomSheetImage, title, description, buttonText, toolbarImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageInfoBottomSheetDto)) {
            return false;
        }
        PageInfoBottomSheetDto pageInfoBottomSheetDto = (PageInfoBottomSheetDto) other;
        return jl40.l(this.bottomSheetImage, pageInfoBottomSheetDto.bottomSheetImage) && jl40.l(this.title, pageInfoBottomSheetDto.title) && jl40.l(this.description, pageInfoBottomSheetDto.description) && jl40.l(this.buttonText, pageInfoBottomSheetDto.buttonText) && jl40.l(this.toolbarImage, pageInfoBottomSheetDto.toolbarImage);
    }

    public final ThemedParameter<String> getBottomSheetImage() {
        return this.bottomSheetImage;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ThemedParameter<String> getToolbarImage() {
        return this.toolbarImage;
    }

    public int hashCode() {
        return this.toolbarImage.hashCode() + unr0.b(unr0.b(unr0.b(this.bottomSheetImage.hashCode() * 31, 31, this.title), 31, this.description), 31, this.buttonText);
    }

    public String toString() {
        ThemedParameter<String> themedParameter = this.bottomSheetImage;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.buttonText;
        ThemedParameter<String> themedParameter2 = this.toolbarImage;
        StringBuilder sb = new StringBuilder("PageInfoBottomSheetDto(bottomSheetImage=");
        sb.append(themedParameter);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        g8e.D(sb, str2, ", buttonText=", str3, ", toolbarImage=");
        sb.append(themedParameter2);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
