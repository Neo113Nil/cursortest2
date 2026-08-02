package xsna;

import com.vk.video.growth.api.data.VideoGrowthAppStore;

/* compiled from: VkVideoPromoPopupConfigDo.kt */
/* loaded from: classes2.dex */
public final class k0w0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final VideoGrowthAppStore g;

    public k0w0(String str, String str2, String str3, String str4, boolean z, String str5, VideoGrowthAppStore videoGrowthAppStore) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = videoGrowthAppStore;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0w0)) {
            return false;
        }
        k0w0 k0w0Var = (k0w0) obj;
        return epx.f(this.a, k0w0Var.a) && epx.f(this.b, k0w0Var.b) && epx.f(this.c, k0w0Var.c) && epx.f(this.d, k0w0Var.d) && this.e == k0w0Var.e && epx.f(this.f, k0w0Var.f) && this.g == k0w0Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + urd0.a(qoy.b(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "VkVideoPromoPopupConfigDo(textTitle=" + this.a + ", textFirstButton=" + this.b + ", textFirstButtonWithApp=" + this.c + ", textSecondButton=" + this.d + ", standaloneHasInstall=" + this.e + ", storeLink=" + this.f + ", appStore=" + this.g + ')';
    }
}
