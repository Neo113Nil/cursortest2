package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;

/* compiled from: ClipItemVideoInteractionEvent.kt */
/* loaded from: classes17.dex */
public interface e3d {

    /* compiled from: ClipItemVideoInteractionEvent.kt */
    public static final class a implements e3d {
        public final SdkClipVideoFile a;
        public final kih0 b;

        public a(SdkClipVideoFile sdkClipVideoFile, kih0 kih0Var) {
            this.a = sdkClipVideoFile;
            this.b = kih0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ConfirmRestriction(clip=" + this.a + ", autoPlay=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemVideoInteractionEvent.kt */
    public static final class b implements e3d {
    }

    /* compiled from: ClipItemVideoInteractionEvent.kt */
    public static final class c implements e3d {
        public final SdkClipVideoFile a;

        public c(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
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
            return cq.d(new StringBuilder("LikeClip(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemVideoInteractionEvent.kt */
    public static final class d implements e3d {
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
            return cq.d(new StringBuilder("PinClip(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemVideoInteractionEvent.kt */
    public static final class e implements e3d {
        public final SdkClipVideoFile a;

        public e(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("UnpinClip(clip="), this.a, ')');
        }
    }
}
