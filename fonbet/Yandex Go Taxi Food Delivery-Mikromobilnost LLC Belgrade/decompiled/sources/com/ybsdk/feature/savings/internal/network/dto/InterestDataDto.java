package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tse0;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/InterestDataDto;", "", "layoutId", "", "title", "subtitle", "total", "Lcom/ybsdk/core/common/data/network/dto/Money;", "totalTextColor", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "action", Constants.KEY_DATA, "", "Lcom/ybsdk/feature/savings/internal/network/dto/InterestMonthDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Ljava/util/List;)V", "getLayoutId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getTotal", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getTotalTextColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getAction", "getData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InterestDataDto {
    private final String action;
    private final List<InterestMonthDataDto> data;
    private final String layoutId;
    private final String subtitle;
    private final String title;
    private final Money total;
    private final Themes<String> totalTextColor;

    public InterestDataDto(@Json(name = "layout_id") String str, @Json(name = "title") String str2, @Json(name = "subtitle") String str3, @Json(name = "total") Money money, @Json(name = "total_text_color") Themes<String> themes, @Json(name = "action") String str4, @Json(name = "data") List<InterestMonthDataDto> list) {
        this.layoutId = str;
        this.title = str2;
        this.subtitle = str3;
        this.total = money;
        this.totalTextColor = themes;
        this.action = str4;
        this.data = list;
    }

    public static /* synthetic */ InterestDataDto copy$default(InterestDataDto interestDataDto, String str, String str2, String str3, Money money, Themes themes, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interestDataDto.layoutId;
        }
        if ((i & 2) != 0) {
            str2 = interestDataDto.title;
        }
        if ((i & 4) != 0) {
            str3 = interestDataDto.subtitle;
        }
        if ((i & 8) != 0) {
            money = interestDataDto.total;
        }
        if ((i & 16) != 0) {
            themes = interestDataDto.totalTextColor;
        }
        if ((i & 32) != 0) {
            str4 = interestDataDto.action;
        }
        if ((i & 64) != 0) {
            list = interestDataDto.data;
        }
        String str5 = str4;
        List list2 = list;
        Themes themes2 = themes;
        String str6 = str3;
        return interestDataDto.copy(str, str2, str6, money, themes2, str5, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLayoutId() {
        return this.layoutId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getTotal() {
        return this.total;
    }

    public final Themes<String> component5() {
        return this.totalTextColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final List<InterestMonthDataDto> component7() {
        return this.data;
    }

    public final InterestDataDto copy(@Json(name = "layout_id") String layoutId, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "total") Money total, @Json(name = "total_text_color") Themes<String> totalTextColor, @Json(name = "action") String action, @Json(name = "data") List<InterestMonthDataDto> data) {
        return new InterestDataDto(layoutId, title, subtitle, total, totalTextColor, action, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterestDataDto)) {
            return false;
        }
        InterestDataDto interestDataDto = (InterestDataDto) other;
        return jl40.l(this.layoutId, interestDataDto.layoutId) && jl40.l(this.title, interestDataDto.title) && jl40.l(this.subtitle, interestDataDto.subtitle) && jl40.l(this.total, interestDataDto.total) && jl40.l(this.totalTextColor, interestDataDto.totalTextColor) && jl40.l(this.action, interestDataDto.action) && jl40.l(this.data, interestDataDto.data);
    }

    public final String getAction() {
        return this.action;
    }

    public final List<InterestMonthDataDto> getData() {
        return this.data;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Money getTotal() {
        return this.total;
    }

    public final Themes<String> getTotalTextColor() {
        return this.totalTextColor;
    }

    public int hashCode() {
        int c = tse0.c(this.total, unr0.b(unr0.b(this.layoutId.hashCode() * 31, 31, this.title), 31, this.subtitle), 31);
        Themes<String> themes = this.totalTextColor;
        int hashCode = (c + (themes == null ? 0 : themes.hashCode())) * 31;
        String str = this.action;
        return this.data.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.layoutId;
        String str2 = this.title;
        String str3 = this.subtitle;
        Money money = this.total;
        Themes<String> themes = this.totalTextColor;
        String str4 = this.action;
        List<InterestMonthDataDto> list = this.data;
        StringBuilder v = b64.v("InterestDataDto(layoutId=", str, ", title=", str2, ", subtitle=");
        v.append(str3);
        v.append(", total=");
        v.append(money);
        v.append(", totalTextColor=");
        v.append(themes);
        v.append(", action=");
        v.append(str4);
        v.append(", data=");
        return ly3.s(v, list, Extension.C_BRAKE);
    }
}
