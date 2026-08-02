package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;

/* compiled from: ActionButtonsPatch.kt */
/* loaded from: classes4.dex */
public interface iy extends xl50 {

    /* compiled from: ActionButtonsPatch.kt */
    public static final class a implements iy {
        public final ActionButton b;

        public a(ActionButton actionButton) {
            this.b = actionButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            ActionButton actionButton = this.b;
            if (actionButton == null) {
                return 0;
            }
            return actionButton.hashCode();
        }

        public final String toString() {
            return "SelectedAction(selected=" + this.b + ')';
        }
    }

    /* compiled from: ActionButtonsPatch.kt */
    public static final class b implements iy {
        public final hy b;

        public b(hy hyVar) {
            this.b = hyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b.a);
        }

        public final String toString() {
            return "UpdateHintsAction(hints=" + this.b + ')';
        }
    }
}
