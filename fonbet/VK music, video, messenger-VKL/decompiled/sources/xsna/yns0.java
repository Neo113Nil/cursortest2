package xsna;

import com.vk.video.growth.api.data.VideoGrowthAppStore;

/* compiled from: VideoGrowthBomb.kt */
/* loaded from: classes6.dex */
public final class yns0 {
    public static final yns0 g = new yns0("", "", "", 0, 0, VideoGrowthAppStore.GOOGLE);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final VideoGrowthAppStore f;

    public yns0(String str, String str2, String str3, int i, int i2, VideoGrowthAppStore videoGrowthAppStore) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = videoGrowthAppStore;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yns0)) {
            return false;
        }
        yns0 yns0Var = (yns0) obj;
        return epx.f(this.a, yns0Var.a) && epx.f(this.b, yns0Var.b) && epx.f(this.c, yns0Var.c) && this.d == yns0Var.d && this.e == yns0Var.e && this.f == yns0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + shy.a(this.e, shy.a(this.d, urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
    }

    public final String toString() {
        return "VideoGrowthBomb(id=" + this.a + ", imageUrl=" + this.b + ", mtLink=" + this.c + ", titleResId=" + this.d + ", descriptionResId=" + this.e + ", appStore=" + this.f + ')';
    }
}
