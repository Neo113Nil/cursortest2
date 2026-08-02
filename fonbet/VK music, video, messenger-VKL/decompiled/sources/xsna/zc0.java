package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import java.util.List;

/* compiled from: AdBannerState.kt */
/* loaded from: classes5.dex */
public final class zc0 implements km50 {
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List<BaseImageDto> j;
    public final GroupsBannerDto.ThemeDto k;
    public final GroupsBannerDto.IconPositionDto l;

    public zc0(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, List<BaseImageDto> list, GroupsBannerDto.ThemeDto themeDto, GroupsBannerDto.IconPositionDto iconPositionDto) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bool;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = list;
        this.k = themeDto;
        this.l = iconPositionDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc0)) {
            return false;
        }
        zc0 zc0Var = (zc0) obj;
        return epx.f(this.b, zc0Var.b) && epx.f(this.c, zc0Var.c) && epx.f(this.d, zc0Var.d) && epx.f(this.e, zc0Var.e) && epx.f(this.f, zc0Var.f) && epx.f(this.g, zc0Var.g) && epx.f(this.h, zc0Var.h) && epx.f(this.i, zc0Var.i) && epx.f(this.j, zc0Var.j) && this.k == zc0Var.k && this.l == zc0Var.l;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<BaseImageDto> list = this.j;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsBannerDto.ThemeDto themeDto = this.k;
        int hashCode10 = (hashCode9 + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
        GroupsBannerDto.IconPositionDto iconPositionDto = this.l;
        return hashCode10 + (iconPositionDto != null ? iconPositionDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdBannerState(title=" + this.b + ", subtitle=" + this.c + ", id=" + this.d + ", allowHide=" + this.e + ", buttonText=" + this.f + ", buttonUrl=" + this.g + ", tooltipText=" + this.h + ", imageUrl=" + this.i + ", backgroundImages=" + this.j + ", theme=" + this.k + ", iconPosition=" + this.l + ')';
    }
}
