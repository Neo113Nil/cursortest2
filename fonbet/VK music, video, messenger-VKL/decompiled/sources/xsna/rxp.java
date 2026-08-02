package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;

/* compiled from: Event.kt */
/* loaded from: classes17.dex */
public interface rxp {

    /* compiled from: Event.kt */
    public static final class a implements rxp {
        public final SdkClipVideoFile a;
        public final boolean b;

        public a(SdkClipVideoFile sdkClipVideoFile, boolean z) {
            this.a = sdkClipVideoFile;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipLikedEvent(clip=");
            sb.append(this.a);
            sb.append(", isLikeApplied=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: Event.kt */
    public static final class b implements rxp {
        public final SdkClipVideoFile a;
        public final boolean b;

        public b(SdkClipVideoFile sdkClipVideoFile, boolean z) {
            this.a = sdkClipVideoFile;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipPinEvent(clip=");
            sb.append(this.a);
            sb.append(", isPinApplied=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: Event.kt */
    public static final class c implements rxp {
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
            return cq.d(new StringBuilder("ClipPlaybackOnBind(clip="), this.a, ')');
        }
    }

    /* compiled from: Event.kt */
    public static final class d implements rxp {
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
            return cq.d(new StringBuilder("ClipPlaybackOnReady(clip="), this.a, ')');
        }
    }

    /* compiled from: Event.kt */
    public static final class e implements rxp {
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
            return cq.d(new StringBuilder("ClipPlaybackOnRepeat(clip="), this.a, ')');
        }
    }

    /* compiled from: Event.kt */
    public static final class f implements rxp {
        public final SdkClipVideoFile a;
        public final long b;
        public final long c;

        public f(SdkClipVideoFile sdkClipVideoFile, long j, long j2) {
            this.a = sdkClipVideoFile;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipPlaybackProgressEvent(clip=");
            sb.append(this.a);
            sb.append(", playbackPositionMs=");
            sb.append(this.b);
            sb.append(", clipDurationMs=");
            return vu5.a(')', this.c, sb);
        }
    }
}
