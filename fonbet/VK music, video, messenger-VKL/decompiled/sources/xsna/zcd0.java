package xsna;

import com.vk.dto.donut.DonutLevel;

/* compiled from: PrivacyEditDonutLevelsBottomSheetAction.kt */
/* loaded from: classes18.dex */
public interface zcd0 extends kj50 {

    /* compiled from: PrivacyEditDonutLevelsBottomSheetAction.kt */
    public static final class a implements zcd0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1676296835;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: PrivacyEditDonutLevelsBottomSheetAction.kt */
    public static final class b implements zcd0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -377618750;
        }

        public final String toString() {
            return "SaveSelection";
        }
    }

    /* compiled from: PrivacyEditDonutLevelsBottomSheetAction.kt */
    public static final class c implements zcd0 {
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
            return "SelectDonutLevel(selectedLevel=" + this.b + ')';
        }
    }
}
