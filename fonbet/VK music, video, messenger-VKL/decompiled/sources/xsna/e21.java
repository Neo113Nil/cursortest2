package xsna;

import com.vk.clips.sdk.models.SdkFriendsInfo;
import com.vk.clips.sdk.models.SdkImages;

/* compiled from: AdsSubscribeBannerViewState.kt */
/* loaded from: classes17.dex */
public interface e21 {

    /* compiled from: AdsSubscribeBannerViewState.kt */
    public static final class a implements e21 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2002836852;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: AdsSubscribeBannerViewState.kt */
    public static final class b implements e21 {
        public final String a;
        public final Integer b;
        public final boolean c;
        public final SdkImages d;
        public final SdkFriendsInfo e;

        public b(String str, Integer num, boolean z, SdkImages sdkImages, SdkFriendsInfo sdkFriendsInfo) {
            this.a = str;
            this.b = num;
            this.c = z;
            this.d = sdkImages;
            this.e = sdkFriendsInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int b = qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
            SdkImages sdkImages = this.d;
            int hashCode2 = (b + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
            SdkFriendsInfo sdkFriendsInfo = this.e;
            return hashCode2 + (sdkFriendsInfo != null ? sdkFriendsInfo.hashCode() : 0);
        }

        public final String toString() {
            return "Visible(title=" + this.a + ", membersCount=" + this.b + ", isSubscribed=" + this.c + ", ownerAvatarUri=" + this.d + ", friends=" + this.e + ')';
        }
    }
}
