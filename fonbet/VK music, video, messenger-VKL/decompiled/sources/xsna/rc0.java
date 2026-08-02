package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import java.util.List;

/* compiled from: AdBanner.kt */
/* loaded from: classes5.dex */
public final class rc0 {
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List<BaseImageDto> i;
    public final GroupsBannerDto.ThemeDto j;
    public final GroupsBannerDto.IconPositionDto k;

    public rc0(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, List<BaseImageDto> list, GroupsBannerDto.ThemeDto themeDto, GroupsBannerDto.IconPositionDto iconPositionDto) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = list;
        this.j = themeDto;
        this.k = iconPositionDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc0)) {
            return false;
        }
        rc0 rc0Var = (rc0) obj;
        return epx.f(this.a, rc0Var.a) && epx.f(this.b, rc0Var.b) && epx.f(this.c, rc0Var.c) && epx.f(this.d, rc0Var.d) && epx.f(this.e, rc0Var.e) && epx.f(this.f, rc0Var.f) && epx.f(this.g, rc0Var.g) && epx.f(this.h, rc0Var.h) && epx.f(this.i, rc0Var.i) && this.j == rc0Var.j && this.k == rc0Var.k;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<BaseImageDto> list = this.i;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsBannerDto.ThemeDto themeDto = this.j;
        int hashCode10 = (hashCode9 + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
        GroupsBannerDto.IconPositionDto iconPositionDto = this.k;
        return hashCode10 + (iconPositionDto != null ? iconPositionDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdBanner(title=" + this.a + ", subtitle=" + this.b + ", id=" + this.c + ", allowHide=" + this.d + ", buttonText=" + this.e + ", buttonUrl=" + this.f + ", tooltipText=" + this.g + ", imageUrl=" + this.h + ", backgroundImages=" + this.i + ", theme=" + this.j + ", iconPosition=" + this.k + ')';
    }
}
