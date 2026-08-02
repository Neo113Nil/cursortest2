package xsna;

import com.vk.video.growth.api.data.VideoGrowthAppStore;

/* compiled from: VideoGrowthViewConfig.kt */
/* loaded from: classes6.dex */
public final class zos0 {
    public static final zos0 j = new zos0(VideoGrowthAppStore.GOOGLE, "", null, null, null, null, null, null, null);
    public final VideoGrowthAppStore a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Integer i;

    public /* synthetic */ zos0(VideoGrowthAppStore videoGrowthAppStore, String str, String str2, Integer num, String str3, String str4, int i) {
        this(videoGrowthAppStore, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zos0)) {
            return false;
        }
        zos0 zos0Var = (zos0) obj;
        return this.a == zos0Var.a && epx.f(this.b, zos0Var.b) && epx.f(this.c, zos0Var.c) && epx.f(this.d, zos0Var.d) && epx.f(this.e, zos0Var.e) && epx.f(this.f, zos0Var.f) && epx.f(this.g, zos0Var.g) && epx.f(this.h, zos0Var.h) && epx.f(this.i, zos0Var.i);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.i;
        return hashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGrowthViewConfig(appStore=");
        sb.append(this.a);
        sb.append(", storeLink=");
        sb.append(this.b);
        sb.append(", buttonTitle=");
        sb.append(this.c);
        sb.append(", buttonIconResId=");
        sb.append(this.d);
        sb.append(", textTitle=");
        sb.append(this.e);
        sb.append(", textSubtitle=");
        sb.append(this.f);
        sb.append(", textTitleId=");
        sb.append(this.g);
        sb.append(", textSubtitleId=");
        sb.append(this.h);
        sb.append(", buttonTitleId=");
        return uqi.b(sb, this.i, ')');
    }

    public zos0(VideoGrowthAppStore videoGrowthAppStore, String str, String str2, Integer num, String str3, String str4, Integer num2, Integer num3, Integer num4) {
        this.a = videoGrowthAppStore;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = str3;
        this.f = str4;
        this.g = num2;
        this.h = num3;
        this.i = num4;
    }
}
