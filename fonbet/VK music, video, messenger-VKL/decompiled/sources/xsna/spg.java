package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import java.util.List;

/* compiled from: CommunityAdBannerData.kt */
/* loaded from: classes5.dex */
public final class spg {
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

    public spg(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, List<BaseImageDto> list, GroupsBannerDto.ThemeDto themeDto, GroupsBannerDto.IconPositionDto iconPositionDto) {
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
        if (!(obj instanceof spg)) {
            return false;
        }
        spg spgVar = (spg) obj;
        return epx.f(this.a, spgVar.a) && epx.f(this.b, spgVar.b) && epx.f(this.c, spgVar.c) && epx.f(this.d, spgVar.d) && epx.f(this.e, spgVar.e) && epx.f(this.f, spgVar.f) && epx.f(this.g, spgVar.g) && epx.f(this.h, spgVar.h) && epx.f(this.i, spgVar.i) && this.j == spgVar.j && this.k == spgVar.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<BaseImageDto> list = this.i;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        GroupsBannerDto.ThemeDto themeDto = this.j;
        int hashCode10 = (hashCode9 + (themeDto == null ? 0 : themeDto.hashCode())) * 31;
        GroupsBannerDto.IconPositionDto iconPositionDto = this.k;
        return hashCode10 + (iconPositionDto != null ? iconPositionDto.hashCode() : 0);
    }

    public final String toString() {
        return "CommunityAdBannerData(title=" + this.a + ", subtitle=" + this.b + ", id=" + this.c + ", allowHide=" + this.d + ", buttonText=" + this.e + ", buttonUrl=" + this.f + ", tooltipText=" + this.g + ", imageUrl=" + this.h + ", backgroundImages=" + this.i + ", theme=" + this.j + ", iconPosition=" + this.k + ')';
    }
}
