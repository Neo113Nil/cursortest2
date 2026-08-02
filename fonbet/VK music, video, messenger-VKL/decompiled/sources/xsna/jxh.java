package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;

/* compiled from: CommunityReviewAttacheImageModel.kt */
/* loaded from: classes18.dex */
public final class jxh {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final BaseImageDto.ThemeDto e;

    public jxh(String str, int i, int i2, String str2, BaseImageDto.ThemeDto themeDto) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = themeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxh)) {
            return false;
        }
        jxh jxhVar = (jxh) obj;
        return epx.f(this.a, jxhVar.a) && this.b == jxhVar.b && this.c == jxhVar.c && epx.f(this.d, jxhVar.d) && this.e == jxhVar.e;
    }

    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        BaseImageDto.ThemeDto themeDto = this.e;
        return hashCode + (themeDto != null ? themeDto.hashCode() : 0);
    }

    public final String toString() {
        return "CommunityReviewAttacheImageModel(url=" + this.a + ", width=" + this.b + ", height=" + this.c + ", id=" + this.d + ", theme=" + this.e + ')';
    }
}
