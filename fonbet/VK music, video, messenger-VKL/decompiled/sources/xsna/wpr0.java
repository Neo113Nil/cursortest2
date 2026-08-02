package xsna;

import java.util.List;

/* compiled from: VerticalizationModeSideEffect.kt */
/* loaded from: classes16.dex */
public abstract class wpr0 {

    /* compiled from: VerticalizationModeSideEffect.kt */
    public static final class a extends wpr0 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Apply(position="), this.a, ')');
        }
    }

    /* compiled from: VerticalizationModeSideEffect.kt */
    public static final class b extends wpr0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1552824885;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: VerticalizationModeSideEffect.kt */
    public static abstract class c extends wpr0 {

        /* compiled from: VerticalizationModeSideEffect.kt */
        public static final class a extends c {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: VerticalizationModeSideEffect.kt */
        public static final class b extends c {
            public final Throwable a;

            public b(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: VerticalizationModeSideEffect.kt */
        /* renamed from: xsna.wpr0$c$c, reason: collision with other inner class name */
        public static final class C3949c extends c {
            public final Throwable a;

            public C3949c(Throwable th) {
                this.a = th;
            }
        }
    }

    /* compiled from: VerticalizationModeSideEffect.kt */
    public static final class d extends wpr0 {
        public final List<String> a;

        public d(List<String> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("ImagesLoaded(urls="), this.a);
        }
    }
}
