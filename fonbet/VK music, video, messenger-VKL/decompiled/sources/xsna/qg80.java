package xsna;

import com.vk.dto.common.VideoFileOld;

/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public interface qg80 {

    /* compiled from: OnboardingPromoVs.kt */
    public static final class a implements qg80 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -454130418;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: OnboardingPromoVs.kt */
    public static final class b implements qg80 {
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
            return ho8.a(new StringBuilder("Image(image="), this.a, ')');
        }
    }

    /* compiled from: OnboardingPromoVs.kt */
    public static final class c implements qg80 {
        public final VideoFileOld a;

        public c(VideoFileOld videoFileOld) {
            this.a = videoFileOld;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Video(videoFile=" + this.a + ')';
        }
    }
}
