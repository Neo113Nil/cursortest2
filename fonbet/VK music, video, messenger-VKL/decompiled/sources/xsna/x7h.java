package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.w7h;

/* compiled from: CommunityLegoRestrictedStateMapper.kt */
/* loaded from: classes5.dex */
public final class x7h {

    /* compiled from: CommunityLegoRestrictedStateMapper.kt */
    public interface a {

        /* compiled from: CommunityLegoRestrictedStateMapper.kt */
        /* renamed from: xsna.x7h$a$a, reason: collision with other inner class name */
        public static final class C3982a implements a {
            public static final C3982a a = new C3982a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3982a);
            }

            public final int hashCode() {
                return 1973158860;
            }

            public final String toString() {
                return "FullScreenBlocked";
            }
        }

        /* compiled from: CommunityLegoRestrictedStateMapper.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2118565149;
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: CommunityLegoRestrictedStateMapper.kt */
        public static final class c implements a {
            public final w7h a;

            public c(w7h w7hVar) {
                this.a = w7hVar;
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
                return "Placeholder(restrictedState=" + this.a + ')';
            }
        }

        /* compiled from: CommunityLegoRestrictedStateMapper.kt */
        public static final class d implements a {
            public final ExtendedUserProfile.e a;

            public d(ExtendedUserProfile.e eVar) {
                this.a = eVar;
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
                return "TemporaryBlacklist(ban=" + this.a + ')';
            }
        }
    }

    public static a a(ExtendedCommunityProfile extendedCommunityProfile) {
        if (w2h.c(extendedCommunityProfile)) {
            return a.C3982a.a;
        }
        if (extendedCommunityProfile.g()) {
            return new a.c(new w7h.b(extendedCommunityProfile.q));
        }
        if (bwd0.b(extendedCommunityProfile)) {
            ExtendedUserProfile.e eVar = extendedCommunityProfile.k1;
            return eVar != null ? new a.c(new w7h.c(eVar)) : a.b.a;
        }
        if (!w2h.a(extendedCommunityProfile) && bwd0.f(extendedCommunityProfile)) {
            return new a.c(w7h.d.a);
        }
        if (!w2h.a(extendedCommunityProfile) && bwd0.c(extendedCommunityProfile)) {
            return new a.c(w7h.a.a);
        }
        ExtendedUserProfile.e eVar2 = extendedCommunityProfile.k1;
        return (eVar2 == null || eVar2.b <= 0) ? a.b.a : eVar2 != null ? new a.d(eVar2) : a.b.a;
    }
}
