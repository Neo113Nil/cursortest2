package xsna;

import com.vk.clips.sdk.models.SdkImages;

/* compiled from: RestrictionCoverState.kt */
/* loaded from: classes17.dex */
public interface xcg0 {

    /* compiled from: RestrictionCoverState.kt */
    public static final class a implements xcg0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 41056033;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: RestrictionCoverState.kt */
    public static final class b implements xcg0 {
        public final boolean a;
        public final SdkImages b;

        public b(SdkImages sdkImages, boolean z) {
            this.a = z;
            this.b = sdkImages;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            SdkImages sdkImages = this.b;
            return hashCode + (sdkImages == null ? 0 : sdkImages.hashCode());
        }

        public final String toString() {
            return "Visible(isBlurred=" + this.a + ", image=" + this.b + ')';
        }
    }
}
