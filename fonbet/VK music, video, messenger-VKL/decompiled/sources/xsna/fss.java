package xsna;

import com.vk.dto.user.RequestUserProfile;

/* compiled from: FriendsRequestsAction.kt */
/* loaded from: classes16.dex */
public interface fss {

    /* compiled from: FriendsRequestsAction.kt */
    public static final class a implements fss {
        public final RequestUserProfile a;

        public a(RequestUserProfile requestUserProfile) {
            this.a = requestUserProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CancelPositiveAction(profile=" + this.a + ')';
        }
    }

    /* compiled from: FriendsRequestsAction.kt */
    public interface b extends fss {

        /* compiled from: FriendsRequestsAction.kt */
        public static final class a implements b {
            public final RequestUserProfile a;

            public a(RequestUserProfile requestUserProfile) {
                this.a = requestUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "InviteContact(profile=" + this.a + ')';
            }
        }

        /* compiled from: FriendsRequestsAction.kt */
        /* renamed from: xsna.fss$b$b, reason: collision with other inner class name */
        public static final class C2893b implements b {
            public final RequestUserProfile a;

            public C2893b(RequestUserProfile requestUserProfile) {
                this.a = requestUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2893b) && epx.f(this.a, ((C2893b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "MakeCall(profile=" + this.a + ')';
            }
        }

        /* compiled from: FriendsRequestsAction.kt */
        public static final class c implements b {
            public final RequestUserProfile a;

            public c(RequestUserProfile requestUserProfile) {
                this.a = requestUserProfile;
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
                return "OpenChat(profile=" + this.a + ')';
            }
        }

        /* compiled from: FriendsRequestsAction.kt */
        public static final class d implements b {
            public final RequestUserProfile a;

            public d(RequestUserProfile requestUserProfile) {
                this.a = requestUserProfile;
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
                return "ShowProfile(profile=" + this.a + ')';
            }
        }

        /* compiled from: FriendsRequestsAction.kt */
        public static final class e implements b {
            public final RequestUserProfile a;

            public e(RequestUserProfile requestUserProfile) {
                this.a = requestUserProfile;
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
                return "ShowStories(profile=" + this.a + ')';
            }
        }
    }

    /* compiled from: FriendsRequestsAction.kt */
    public static final class c implements fss {
        public final RequestUserProfile a;
        public final hss b;

        public c(RequestUserProfile requestUserProfile, hss hssVar) {
            this.a = requestUserProfile;
            this.b = hssVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "NegativeAction(profile=" + this.a + ", cellViewType=" + this.b + ')';
        }
    }

    /* compiled from: FriendsRequestsAction.kt */
    public static final class d implements fss {
        public final RequestUserProfile a;
        public final hss b;

        public d(RequestUserProfile requestUserProfile, hss hssVar) {
            this.a = requestUserProfile;
            this.b = hssVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PositiveAction(profile=" + this.a + ", cellViewType=" + this.b + ')';
        }
    }

    /* compiled from: FriendsRequestsAction.kt */
    public static final class e implements fss {
        public final RequestUserProfile a;

        public e(RequestUserProfile requestUserProfile) {
            this.a = requestUserProfile;
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
            return "SendReport(profile=" + this.a + ')';
        }
    }
}
