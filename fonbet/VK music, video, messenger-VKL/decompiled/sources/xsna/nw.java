package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;

/* compiled from: ActionButtonsAction.kt */
/* loaded from: classes4.dex */
public interface nw extends kj50 {

    /* compiled from: ActionButtonsAction.kt */
    public static final class a implements nw {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1860609364;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ActionButtonsAction.kt */
    public static final class b implements nw {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1187086812;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ActionButtonsAction.kt */
    public static final class c implements nw {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1550848392;
        }

        public final String toString() {
            return "LifecyclePause";
        }
    }

    /* compiled from: ActionButtonsAction.kt */
    public static final class d implements nw {
        public final ActionButton b;

        public d(ActionButton actionButton) {
            this.b = actionButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Save(action=" + this.b + ')';
        }
    }

    /* compiled from: ActionButtonsAction.kt */
    public static final class e implements nw {
        public final ActionButton b;

        public e(ActionButton actionButton) {
            this.b = actionButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            ActionButton actionButton = this.b;
            if (actionButton == null) {
                return 0;
            }
            return actionButton.hashCode();
        }

        public final String toString() {
            return "Select(action=" + this.b + ')';
        }
    }
}
