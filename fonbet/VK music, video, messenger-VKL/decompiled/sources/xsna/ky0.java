package xsna;

import android.content.Intent;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.id.UserId;

/* compiled from: AdsItemNavigationEvent.kt */
/* loaded from: classes17.dex */
public interface ky0 {

    /* compiled from: AdsItemNavigationEvent.kt */
    public static final class a implements ky0 {
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

    /* compiled from: AdsItemNavigationEvent.kt */
    public static final class b implements ky0 {
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

    /* compiled from: AdsItemNavigationEvent.kt */
    public static final class c implements ky0 {
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

    /* compiled from: AdsItemNavigationEvent.kt */
    public static final class d implements ky0 {
        public final SdkClipVideoFile a;

        public d(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
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
            return cq.d(new StringBuilder("OpenOwnerGrid(clip="), this.a, ')');
        }
    }

    /* compiled from: AdsItemNavigationEvent.kt */
    public static final class e implements ky0 {
        public final UserId a;

        public e(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenProfile(ownerId="), this.a, ')');
        }
    }

    /* compiled from: AdsItemNavigationEvent.kt */
    public static final class f implements ky0 {
        public final SdkVideoRestriction a;

        public f(SdkVideoRestriction sdkVideoRestriction) {
            this.a = sdkVideoRestriction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowRestrictionDialog(restriction=" + this.a + ')';
        }
    }

    /* compiled from: AdsItemNavigationEvent.kt */
    public static final class g implements ky0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 473949195;
        }

        public final String toString() {
            return "ShowUnsubscribeBottomSheet";
        }
    }
}
