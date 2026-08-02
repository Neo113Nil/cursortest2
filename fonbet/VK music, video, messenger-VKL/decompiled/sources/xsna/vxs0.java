package xsna;

import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;

/* compiled from: VideoNavigationEvent.kt */
/* loaded from: classes2.dex */
public abstract class vxs0 {

    /* compiled from: VideoNavigationEvent.kt */
    public static final class a extends vxs0 {
        public static final a a = new a();
    }

    /* compiled from: VideoNavigationEvent.kt */
    public static final class b extends vxs0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "OnBottomMenuHeightChanged(height=0)";
        }
    }

    /* compiled from: VideoNavigationEvent.kt */
    public static final class c extends vxs0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1302585384;
        }

        public final String toString() {
            return "OnCloseScreenForced";
        }
    }

    /* compiled from: VideoNavigationEvent.kt */
    public static final class d extends vxs0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "OnFragmentChanged(canShowMiniPlayer=false)";
        }
    }

    /* compiled from: VideoNavigationEvent.kt */
    public static final class e extends vxs0 {
        public final VideoMinimizableScreenArgs a;

        public e(VideoMinimizableScreenArgs videoMinimizableScreenArgs) {
            this.a = videoMinimizableScreenArgs;
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
            return "OnNewPlayerArgs(args=" + this.a + ')';
        }
    }
}
