package xsna;

import java.util.List;

/* compiled from: CallMainMenuEvent.kt */
/* loaded from: classes7.dex */
public interface v59 {

    /* compiled from: CallMainMenuEvent.kt */
    public static final class a implements v59 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 282110622;
        }

        public final String toString() {
            return "Collapsed";
        }
    }

    /* compiled from: CallMainMenuEvent.kt */
    public static final class b implements v59 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Expanded(firstTime="), this.a, ')');
        }
    }

    /* compiled from: CallMainMenuEvent.kt */
    public static final class c implements v59 {
        public final List<String> a;

        public c(List<String> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("OnboardingCompleted(requestedKeys="), this.a);
        }
    }
}
