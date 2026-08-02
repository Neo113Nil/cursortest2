package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;

/* compiled from: ActionButtonsSideEffect.kt */
/* loaded from: classes4.dex */
public interface ly {

    /* compiled from: ActionButtonsSideEffect.kt */
    public static final class a implements ly {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1697110338;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ActionButtonsSideEffect.kt */
    public static final class b implements ly {
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
            return ho8.a(new StringBuilder("OpenMiniApp(miniAppLink="), this.a, ')');
        }
    }

    /* compiled from: ActionButtonsSideEffect.kt */
    public static final class c implements ly {
        public final ActionButton a;

        public c(ActionButton actionButton) {
            this.a = actionButton;
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
            return "Save(action=" + this.a + ')';
        }
    }
}
