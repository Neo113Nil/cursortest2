package xsna;

import com.vk.dto.donut.DonutLevel;

/* compiled from: PrivacyEditDonutLevelsAction.kt */
/* loaded from: classes18.dex */
public interface xcd0 extends kj50 {

    /* compiled from: PrivacyEditDonutLevelsAction.kt */
    public interface a extends xcd0 {

        /* compiled from: PrivacyEditDonutLevelsAction.kt */
        /* renamed from: xsna.xcd0$a$a, reason: collision with other inner class name */
        public static final class C3994a implements a {
            public static final C3994a b = new C3994a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3994a);
            }

            public final int hashCode() {
                return -202330801;
            }

            public final String toString() {
                return "Back";
            }
        }
    }

    /* compiled from: PrivacyEditDonutLevelsAction.kt */
    public static final class b implements xcd0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1964256718;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: PrivacyEditDonutLevelsAction.kt */
    public static final class c implements xcd0 {
        public final DonutLevel b;

        public c(DonutLevel donutLevel) {
            this.b = donutLevel;
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
            return "SelectDonutLevel(level=" + this.b + ')';
        }
    }
}
