package xsna;

import androidx.fragment.app.Fragment;
import com.vk.core.fragments.impl.support.ParentSupportFragment;

/* compiled from: TransitionAnimation.kt */
/* loaded from: classes17.dex */
public abstract class qj2 {

    /* compiled from: TransitionAnimation.kt */
    public static final class a {
        public static b a(ParentSupportFragment parentSupportFragment) {
            return new b(parentSupportFragment);
        }

        public static c b(ParentSupportFragment parentSupportFragment) {
            return new c(parentSupportFragment);
        }

        public static d c(ParentSupportFragment parentSupportFragment) {
            return new d(parentSupportFragment);
        }

        public static e d(ParentSupportFragment parentSupportFragment) {
            return new e(parentSupportFragment);
        }
    }

    /* compiled from: TransitionAnimation.kt */
    public static final class b extends qj2 {
        public final Fragment a;

        public b(Fragment fragment) {
            this.a = fragment;
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
            return "DestinationEntering(fragment=" + this.a + ')';
        }
    }

    /* compiled from: TransitionAnimation.kt */
    public static final class c extends qj2 {
        public final Fragment a;

        public c(Fragment fragment) {
            this.a = fragment;
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
            return "DestinationExiting(fragment=" + this.a + ')';
        }
    }

    /* compiled from: TransitionAnimation.kt */
    public static final class d extends qj2 {
        public final Fragment a;

        public d(Fragment fragment) {
            this.a = fragment;
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
            return "SourceEntering(fragment=" + this.a + ')';
        }
    }

    /* compiled from: TransitionAnimation.kt */
    public static final class e extends qj2 {
        public final Fragment a;

        public e(Fragment fragment) {
            this.a = fragment;
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
            return "SourceExiting(fragment=" + this.a + ')';
        }
    }
}
