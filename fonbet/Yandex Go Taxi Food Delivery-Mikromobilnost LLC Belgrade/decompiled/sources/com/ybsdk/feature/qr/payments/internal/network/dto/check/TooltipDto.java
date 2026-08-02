package com.ybsdk.feature.qr.payments.internal.network.dto.check;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/check/TooltipDto;", "", "title", "", "action", "actionText", "actionImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getAction", "getActionText", "getActionImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TooltipDto {
    private final String action;
    private final Themes<String> actionImage;
    private final String actionText;
    private final String title;

    public TooltipDto(@Json(name = "title") String str, @Json(name = "action") String str2, @Json(name = "action_text") String str3, @Json(name = "action_image") Themes<String> themes) {
        this.title = str;
        this.action = str2;
        this.actionText = str3;
        this.actionImage = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TooltipDto copy$default(TooltipDto tooltipDto, String str, String str2, String str3, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tooltipDto.title;
        }
        if ((i & 2) != 0) {
            str2 = tooltipDto.action;
        }
        if ((i & 4) != 0) {
            str3 = tooltipDto.actionText;
        }
        if ((i & 8) != 0) {
            themes = tooltipDto.actionImage;
        }
        return tooltipDto.copy(str, str2, str3, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActionText() {
        return this.actionText;
    }

    public final Themes<String> component4() {
        return this.actionImage;
    }

    public final TooltipDto copy(@Json(name = "title") String title, @Json(name = "action") String action, @Json(name = "action_text") String actionText, @Json(name = "action_image") Themes<String> actionImage) {
        return new TooltipDto(title, action, actionText, actionImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipDto)) {
            return false;
        }
        TooltipDto tooltipDto = (TooltipDto) other;
        return jl40.l(this.title, tooltipDto.title) && jl40.l(this.action, tooltipDto.action) && jl40.l(this.actionText, tooltipDto.actionText) && jl40.l(this.actionImage, tooltipDto.actionImage);
    }

    public final String getAction() {
        return this.action;
    }

    public final Themes<String> getActionImage() {
        return this.actionImage;
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.action;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actionText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Themes<String> themes = this.actionImage;
        return hashCode3 + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.action;
        String str3 = this.actionText;
        Themes<String> themes = this.actionImage;
        StringBuilder v = b64.v("TooltipDto(title=", str, ", action=", str2, ", actionText=");
        v.append(str3);
        v.append(", actionImage=");
        v.append(themes);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
