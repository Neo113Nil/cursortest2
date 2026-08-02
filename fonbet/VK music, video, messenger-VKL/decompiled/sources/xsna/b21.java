package xsna;

import com.vk.clips.sdk.models.SdkFriendsInfo;
import com.vk.clips.sdk.models.SdkImages;

/* compiled from: AdsSubscribeBannerData.kt */
/* loaded from: classes17.dex */
public final class b21 {
    public final String a;
    public final Integer b;
    public final boolean c;
    public final SdkImages d;
    public final SdkFriendsInfo e;
    public final boolean f;

    public b21(String str, Integer num, boolean z, SdkImages sdkImages, SdkFriendsInfo sdkFriendsInfo, boolean z2) {
        this.a = str;
        this.b = num;
        this.c = z;
        this.d = sdkImages;
        this.e = sdkFriendsInfo;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b21)) {
            return false;
        }
        b21 b21Var = (b21) obj;
        return epx.f(this.a, b21Var.a) && epx.f(this.b, b21Var.b) && this.c == b21Var.c && epx.f(this.d, b21Var.d) && epx.f(this.e, b21Var.e) && this.f == b21Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int b = qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        SdkImages sdkImages = this.d;
        int hashCode2 = (b + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
        SdkFriendsInfo sdkFriendsInfo = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (sdkFriendsInfo != null ? sdkFriendsInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsSubscribeBannerData(title=");
        sb.append(this.a);
        sb.append(", membersCount=");
        sb.append(this.b);
        sb.append(", isSubscribed=");
        sb.append(this.c);
        sb.append(", ownerAvatarUri=");
        sb.append(this.d);
        sb.append(", friends=");
        sb.append(this.e);
        sb.append(", subscribeBannerIsVisible=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
