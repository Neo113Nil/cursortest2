package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.n;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/configs/AppUpdateUiDataDto;", "", "title", "Lcom/ybsdk/core/utils/text/Text;", "subtitle", "buttonTitle", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;)V", "getTitle", "()Lcom/ybsdk/core/utils/text/Text;", "getSubtitle", "getButtonTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AppUpdateUiDataDto {

    @Json(name = "button_title")
    private final Text buttonTitle;

    @Json(name = "subtitle")
    private final Text subtitle;

    @Json(name = "title")
    private final Text title;

    public AppUpdateUiDataDto(Text text, Text text2, Text text3) {
        this.title = text;
        this.subtitle = text2;
        this.buttonTitle = text3;
    }

    public static /* synthetic */ AppUpdateUiDataDto copy$default(AppUpdateUiDataDto appUpdateUiDataDto, Text text, Text text2, Text text3, int i, Object obj) {
        if ((i & 1) != 0) {
            text = appUpdateUiDataDto.title;
        }
        if ((i & 2) != 0) {
            text2 = appUpdateUiDataDto.subtitle;
        }
        if ((i & 4) != 0) {
            text3 = appUpdateUiDataDto.buttonTitle;
        }
        return appUpdateUiDataDto.copy(text, text2, text3);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getButtonTitle() {
        return this.buttonTitle;
    }

    public final AppUpdateUiDataDto copy(Text title, Text subtitle, Text buttonTitle) {
        return new AppUpdateUiDataDto(title, subtitle, buttonTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUpdateUiDataDto)) {
            return false;
        }
        AppUpdateUiDataDto appUpdateUiDataDto = (AppUpdateUiDataDto) other;
        return jl40.l(this.title, appUpdateUiDataDto.title) && jl40.l(this.subtitle, appUpdateUiDataDto.subtitle) && jl40.l(this.buttonTitle, appUpdateUiDataDto.buttonTitle);
    }

    public final Text getButtonTitle() {
        return this.buttonTitle;
    }

    public final Text getSubtitle() {
        return this.subtitle;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonTitle.hashCode() + n.c(this.subtitle, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        Text text = this.title;
        Text text2 = this.subtitle;
        Text text3 = this.buttonTitle;
        StringBuilder p = n.p("AppUpdateUiDataDto(title=", text, ", subtitle=", text2, ", buttonTitle=");
        p.append(text3);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
