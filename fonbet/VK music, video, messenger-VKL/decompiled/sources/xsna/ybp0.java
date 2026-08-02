package xsna;

/* compiled from: TopshelfEvent.kt */
/* loaded from: classes16.dex */
public abstract class ybp0 {

    /* compiled from: TopshelfEvent.kt */
    public static final class a extends ybp0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -372576944;
        }

        public final String toString() {
            return "LifecyclePaused";
        }
    }

    /* compiled from: TopshelfEvent.kt */
    public static final class b extends ybp0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1072206347;
        }

        public final String toString() {
            return "LifecycleResumed";
        }
    }

    /* compiled from: TopshelfEvent.kt */
    public static final class c extends ybp0 {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MuteChanged(mute="), this.a, ')');
        }
    }

    /* compiled from: TopshelfEvent.kt */
    public static final class d extends ybp0 {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PageSelected(position="), this.a, ')');
        }
    }

    /* compiled from: TopshelfEvent.kt */
    public static final class e extends ybp0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1849323675;
        }

        public final String toString() {
            return "PrimaryButtonClicked";
        }
    }

    /* compiled from: TopshelfEvent.kt */
    public static final class f extends ybp0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1018487328;
        }

        public final String toString() {
            return "VideoStartedPlaying";
        }
    }
}
