package xsna;

import com.vk.video.ui.upload.api.router.AttachedClipsResult;

/* compiled from: AttachedClipsEvent.kt */
/* loaded from: classes7.dex */
public interface x44 extends pk50 {

    /* compiled from: AttachedClipsEvent.kt */
    public static final class a implements x44 {
        public final AttachedClipsResult a;

        public a(AttachedClipsResult attachedClipsResult) {
            this.a = attachedClipsResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            AttachedClipsResult attachedClipsResult = this.a;
            if (attachedClipsResult == null) {
                return 0;
            }
            return attachedClipsResult.b.hashCode();
        }

        public final String toString() {
            return "Close(result=" + this.a + ')';
        }
    }

    /* compiled from: AttachedClipsEvent.kt */
    public static final class b implements x44 {
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
            return ho8.a(new StringBuilder("OpenClipPreview(videoId="), this.a, ')');
        }
    }

    /* compiled from: AttachedClipsEvent.kt */
    public interface c extends x44 {

        /* compiled from: AttachedClipsEvent.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 756890635;
            }

            public final String toString() {
                return "DetachClipsSuccess";
            }
        }

        /* compiled from: AttachedClipsEvent.kt */
        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2019816522;
            }

            public final String toString() {
                return "LoadError";
            }
        }

        /* compiled from: AttachedClipsEvent.kt */
        /* renamed from: xsna.x44$c$c, reason: collision with other inner class name */
        public static final class C3973c implements c {
            public static final C3973c a = new C3973c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3973c);
            }

            public final int hashCode() {
                return -1205612363;
            }

            public final String toString() {
                return "NoNetwork";
            }
        }

        /* compiled from: AttachedClipsEvent.kt */
        public static final class d implements c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1626886693;
            }

            public final String toString() {
                return "SaveMultipleClipsSuccess";
            }
        }

        /* compiled from: AttachedClipsEvent.kt */
        public static final class e implements c {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -721308490;
            }

            public final String toString() {
                return "SaveSingleClipSuccess";
            }
        }
    }
}
