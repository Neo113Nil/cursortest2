package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;

/* compiled from: ClipsOwnerSwipeAction.kt */
/* loaded from: classes17.dex */
public interface foe extends kj50 {

    /* compiled from: ClipsOwnerSwipeAction.kt */
    public static final class a implements foe {
        public final ClipFeedOpenAction b;

        public a(ClipFeedOpenAction clipFeedOpenAction) {
            this.b = clipFeedOpenAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ApplyWrapperAction(action=" + this.b + ')';
        }
    }

    /* compiled from: ClipsOwnerSwipeAction.kt */
    public static final class b implements foe {
        public static final b b = new b();
    }

    /* compiled from: ClipsOwnerSwipeAction.kt */
    public static final class c implements foe {
        public static final c b = new c();
    }

    /* compiled from: ClipsOwnerSwipeAction.kt */
    public static final class d implements foe {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectPage(index="), this.b, ')');
        }
    }

    /* compiled from: ClipsOwnerSwipeAction.kt */
    public static final class e implements foe {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ShowTabWithIndex(index="), this.b, ')');
        }
    }

    /* compiled from: ClipsOwnerSwipeAction.kt */
    public static final class f implements foe {
        public static final f b = new f();
    }
}
