package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008f\u0001\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00062"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupWidgetSummaryDataDto;", "", "title", "", "subtitle", "futureIncomeTitle", "leftImage", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "actionImage", "futureIncomeBackgroundColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "blocks", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/AutotopupSummaryBlockDto;", "spoilerParams", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SpoilerParamDto;", "tooltipText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/util/List;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SpoilerParamDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getFutureIncomeTitle", "getLeftImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getActionImage", "getFutureIncomeBackgroundColor", "getBackgroundColor", "getBlocks", "()Ljava/util/List;", "getSpoilerParams", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/SpoilerParamDto;", "getTooltipText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutotopupWidgetSummaryDataDto {
    private final ThemedParameter<String> actionImage;
    private final ThemedParameter<String> backgroundColor;
    private final List<AutotopupSummaryBlockDto> blocks;
    private final ThemedParameter<String> futureIncomeBackgroundColor;
    private final String futureIncomeTitle;
    private final ThemedParameter<String> leftImage;
    private final SpoilerParamDto spoilerParams;
    private final String subtitle;
    private final String title;
    private final String tooltipText;

    public AutotopupWidgetSummaryDataDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "future_income_title") String str3, @Json(name = "left_image") ThemedParameter<String> themedParameter, @Json(name = "action_image") ThemedParameter<String> themedParameter2, @Json(name = "future_income_background_color") ThemedParameter<String> themedParameter3, @Json(name = "background_color") ThemedParameter<String> themedParameter4, @Json(name = "blocks") List<AutotopupSummaryBlockDto> list, @Json(name = "spoiler_params") SpoilerParamDto spoilerParamDto, @Json(name = "tooltip_text") String str4) {
        this.title = str;
        this.subtitle = str2;
        this.futureIncomeTitle = str3;
        this.leftImage = themedParameter;
        this.actionImage = themedParameter2;
        this.futureIncomeBackgroundColor = themedParameter3;
        this.backgroundColor = themedParameter4;
        this.blocks = list;
        this.spoilerParams = spoilerParamDto;
        this.tooltipText = str4;
    }

    public static /* synthetic */ AutotopupWidgetSummaryDataDto copy$default(AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto, String str, String str2, String str3, ThemedParameter themedParameter, ThemedParameter themedParameter2, ThemedParameter themedParameter3, ThemedParameter themedParameter4, List list, SpoilerParamDto spoilerParamDto, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autotopupWidgetSummaryDataDto.title;
        }
        if ((i & 2) != 0) {
            str2 = autotopupWidgetSummaryDataDto.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = autotopupWidgetSummaryDataDto.futureIncomeTitle;
        }
        if ((i & 8) != 0) {
            themedParameter = autotopupWidgetSummaryDataDto.leftImage;
        }
        if ((i & 16) != 0) {
            themedParameter2 = autotopupWidgetSummaryDataDto.actionImage;
        }
        if ((i & 32) != 0) {
            themedParameter3 = autotopupWidgetSummaryDataDto.futureIncomeBackgroundColor;
        }
        if ((i & 64) != 0) {
            themedParameter4 = autotopupWidgetSummaryDataDto.backgroundColor;
        }
        if ((i & 128) != 0) {
            list = autotopupWidgetSummaryDataDto.blocks;
        }
        if ((i & 256) != 0) {
            spoilerParamDto = autotopupWidgetSummaryDataDto.spoilerParams;
        }
        if ((i & 512) != 0) {
            str4 = autotopupWidgetSummaryDataDto.tooltipText;
        }
        SpoilerParamDto spoilerParamDto2 = spoilerParamDto;
        String str5 = str4;
        ThemedParameter themedParameter5 = themedParameter4;
        List list2 = list;
        ThemedParameter themedParameter6 = themedParameter2;
        ThemedParameter themedParameter7 = themedParameter3;
        return autotopupWidgetSummaryDataDto.copy(str, str2, str3, themedParameter, themedParameter6, themedParameter7, themedParameter5, list2, spoilerParamDto2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTooltipText() {
        return this.tooltipText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFutureIncomeTitle() {
        return this.futureIncomeTitle;
    }

    public final ThemedParameter<String> component4() {
        return this.leftImage;
    }

    public final ThemedParameter<String> component5() {
        return this.actionImage;
    }

    public final ThemedParameter<String> component6() {
        return this.futureIncomeBackgroundColor;
    }

    public final ThemedParameter<String> component7() {
        return this.backgroundColor;
    }

    public final List<AutotopupSummaryBlockDto> component8() {
        return this.blocks;
    }

    /* renamed from: component9, reason: from getter */
    public final SpoilerParamDto getSpoilerParams() {
        return this.spoilerParams;
    }

    public final AutotopupWidgetSummaryDataDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "future_income_title") String futureIncomeTitle, @Json(name = "left_image") ThemedParameter<String> leftImage, @Json(name = "action_image") ThemedParameter<String> actionImage, @Json(name = "future_income_background_color") ThemedParameter<String> futureIncomeBackgroundColor, @Json(name = "background_color") ThemedParameter<String> backgroundColor, @Json(name = "blocks") List<AutotopupSummaryBlockDto> blocks, @Json(name = "spoiler_params") SpoilerParamDto spoilerParams, @Json(name = "tooltip_text") String tooltipText) {
        return new AutotopupWidgetSummaryDataDto(title, subtitle, futureIncomeTitle, leftImage, actionImage, futureIncomeBackgroundColor, backgroundColor, blocks, spoilerParams, tooltipText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotopupWidgetSummaryDataDto)) {
            return false;
        }
        AutotopupWidgetSummaryDataDto autotopupWidgetSummaryDataDto = (AutotopupWidgetSummaryDataDto) other;
        return jl40.l(this.title, autotopupWidgetSummaryDataDto.title) && jl40.l(this.subtitle, autotopupWidgetSummaryDataDto.subtitle) && jl40.l(this.futureIncomeTitle, autotopupWidgetSummaryDataDto.futureIncomeTitle) && jl40.l(this.leftImage, autotopupWidgetSummaryDataDto.leftImage) && jl40.l(this.actionImage, autotopupWidgetSummaryDataDto.actionImage) && jl40.l(this.futureIncomeBackgroundColor, autotopupWidgetSummaryDataDto.futureIncomeBackgroundColor) && jl40.l(this.backgroundColor, autotopupWidgetSummaryDataDto.backgroundColor) && jl40.l(this.blocks, autotopupWidgetSummaryDataDto.blocks) && jl40.l(this.spoilerParams, autotopupWidgetSummaryDataDto.spoilerParams) && jl40.l(this.tooltipText, autotopupWidgetSummaryDataDto.tooltipText);
    }

    public final ThemedParameter<String> getActionImage() {
        return this.actionImage;
    }

    public final ThemedParameter<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<AutotopupSummaryBlockDto> getBlocks() {
        return this.blocks;
    }

    public final ThemedParameter<String> getFutureIncomeBackgroundColor() {
        return this.futureIncomeBackgroundColor;
    }

    public final String getFutureIncomeTitle() {
        return this.futureIncomeTitle;
    }

    public final ThemedParameter<String> getLeftImage() {
        return this.leftImage;
    }

    public final SpoilerParamDto getSpoilerParams() {
        return this.spoilerParams;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTooltipText() {
        return this.tooltipText;
    }

    public int hashCode() {
        int b = unr0.b(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.futureIncomeTitle;
        int hashCode = (this.spoilerParams.hashCode() + unr0.c(tse0.d(this.backgroundColor, tse0.d(this.futureIncomeBackgroundColor, tse0.d(this.actionImage, tse0.d(this.leftImage, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31, this.blocks)) * 31;
        String str2 = this.tooltipText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.futureIncomeTitle;
        ThemedParameter<String> themedParameter = this.leftImage;
        ThemedParameter<String> themedParameter2 = this.actionImage;
        ThemedParameter<String> themedParameter3 = this.futureIncomeBackgroundColor;
        ThemedParameter<String> themedParameter4 = this.backgroundColor;
        List<AutotopupSummaryBlockDto> list = this.blocks;
        SpoilerParamDto spoilerParamDto = this.spoilerParams;
        String str4 = this.tooltipText;
        StringBuilder v = b64.v("AutotopupWidgetSummaryDataDto(title=", str, ", subtitle=", str2, ", futureIncomeTitle=");
        v.append(str3);
        v.append(", leftImage=");
        v.append(themedParameter);
        v.append(", actionImage=");
        v.append(themedParameter2);
        v.append(", futureIncomeBackgroundColor=");
        v.append(themedParameter3);
        v.append(", backgroundColor=");
        v.append(themedParameter4);
        v.append(", blocks=");
        v.append(list);
        v.append(", spoilerParams=");
        v.append(spoilerParamDto);
        v.append(", tooltipText=");
        v.append(str4);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
