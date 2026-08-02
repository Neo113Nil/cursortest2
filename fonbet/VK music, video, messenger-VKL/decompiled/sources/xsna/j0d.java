package xsna;

import android.view.MotionEvent;

/* compiled from: ClipItemAnimationEvent.kt */
/* loaded from: classes17.dex */
public interface j0d {

    /* compiled from: ClipItemAnimationEvent.kt */
    public static final class a implements j0d {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -423899646;
        }

        public final String toString() {
            return "CancelFlyDoubleTapLikeAnim";
        }
    }

    /* compiled from: ClipItemAnimationEvent.kt */
    public static final class b implements j0d {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -409965315;
        }

        public final String toString() {
            return "CancelPlayPauseAnimation";
        }
    }

    /* compiled from: ClipItemAnimationEvent.kt */
    public static final class c implements j0d {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 640880831;
        }

        public final String toString() {
            return "ClipPaused";
        }
    }

    /* compiled from: ClipItemAnimationEvent.kt */
    public static final class d implements j0d {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 280213606;
        }

        public final String toString() {
            return "ClipResumed";
        }
    }

    /* compiled from: ClipItemAnimationEvent.kt */
    public static final class e implements j0d {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("PlayExplosionLikeAnim(reverse="), this.a, ')');
        }
    }

    /* compiled from: ClipItemAnimationEvent.kt */
    public static final class f implements j0d {
        public final MotionEvent a;

        public f(MotionEvent motionEvent) {
            this.a = motionEvent;
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
            return "ShowBigLikeAnimation(motionEvent=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemAnimationEvent.kt */
    public static final class g implements j0d {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 702648420;
        }

        public final String toString() {
            return "ShowSmallLikeAnimation";
        }
    }
}
