package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: VideoPickerAction.kt */
/* loaded from: classes4.dex */
public interface x1t0 extends kj50 {

    /* compiled from: VideoPickerAction.kt */
    public static final class a implements x1t0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -127083502;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static abstract class b implements x1t0 {

        /* compiled from: VideoPickerAction.kt */
        public static final class a extends b {
            public static final a b = new a();
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static abstract class c implements x1t0 {

        /* compiled from: VideoPickerAction.kt */
        public static final class a extends c {
        }

        /* compiled from: VideoPickerAction.kt */
        public static final class b extends c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1003212803;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static abstract class d implements x1t0 {

        /* compiled from: VideoPickerAction.kt */
        public static final class a extends d {
            public final VideoFile b;

            public a(VideoFile videoFile) {
                this.b = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("OpenVkVideoViewer(video="), this.b, ')');
            }
        }

        /* compiled from: VideoPickerAction.kt */
        public static final class b extends d {
            public final String b;
            public final boolean c;

            public b(String str, boolean z) {
                this.b = str;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SetVideoSelection(videoId=");
                sb.append(this.b);
                sb.append(", isSelected=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: VideoPickerAction.kt */
        public static final class c extends d {
            public final VideoFile b;

            public c(VideoFile videoFile) {
                this.b = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("ToggleVideoSelection(video="), this.b, ')');
            }
        }
    }

    /* compiled from: VideoPickerAction.kt */
    public static final class e implements x1t0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -126779472;
        }

        public final String toString() {
            return "Stub";
        }
    }
}
