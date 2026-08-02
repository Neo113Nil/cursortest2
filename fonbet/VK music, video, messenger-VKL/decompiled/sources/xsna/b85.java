package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: AuthorEvent.kt */
/* loaded from: classes7.dex */
public interface b85 extends pk50 {

    /* compiled from: AuthorEvent.kt */
    public static final class a implements b85 {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("AuthorPicked(id="), this.a, ')');
        }
    }

    /* compiled from: AuthorEvent.kt */
    public static final class b implements b85 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 793079841;
        }

        public final String toString() {
            return "OpenCreateChannelScreen";
        }
    }

    /* compiled from: AuthorEvent.kt */
    public static final class c implements b85 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -407761251;
        }

        public final String toString() {
            return "ShowAuthorChangeConfirmationDialog";
        }
    }

    /* compiled from: AuthorEvent.kt */
    public static final class d implements b85 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -174846389;
        }

        public final String toString() {
            return "ShowCreateChannelModal";
        }
    }
}
