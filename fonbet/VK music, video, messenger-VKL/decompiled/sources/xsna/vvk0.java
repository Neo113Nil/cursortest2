package xsna;

import android.content.Intent;
import com.vk.clips.sdk.models.SdkOwner;

/* compiled from: StaticAdsItemNavigationEvent.kt */
/* loaded from: classes17.dex */
public interface vvk0 {

    /* compiled from: StaticAdsItemNavigationEvent.kt */
    public static final class a implements vvk0 {
        public final Intent a;

        public a(Intent intent) {
            this.a = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenDeeplink(intent=" + this.a + ')';
        }
    }

    /* compiled from: StaticAdsItemNavigationEvent.kt */
    public static final class b implements vvk0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenHashtagGrid(hashtag="), this.a, ')');
        }
    }

    /* compiled from: StaticAdsItemNavigationEvent.kt */
    public static final class c implements vvk0 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(url="), this.a, ')');
        }
    }

    /* compiled from: StaticAdsItemNavigationEvent.kt */
    public static final class d implements vvk0 {
        public final SdkOwner a;

        public d(SdkOwner sdkOwner) {
            this.a = sdkOwner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenProfile(owner=" + this.a + ')';
        }
    }

    /* compiled from: StaticAdsItemNavigationEvent.kt */
    public static final class e implements vvk0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1226033286;
        }

        public final String toString() {
            return "ShowUnsubscribeBottomSheet";
        }
    }
}
