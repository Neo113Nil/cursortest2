package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: VoipHistoryFriendsFeatureNavigationEvent.kt */
/* loaded from: classes7.dex */
public abstract class lpw0 {

    /* compiled from: VoipHistoryFriendsFeatureNavigationEvent.kt */
    public static final class a extends lpw0 {
        public final CallsUserId a;
        public final boolean b;

        public a(CallsUserId callsUserId, boolean z) {
            this.a = callsUserId;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCall(uid=");
            sb.append(this.a);
            sb.append(", isVideo=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipHistoryFriendsFeatureNavigationEvent.kt */
    public static final class b extends lpw0 {
        public static final b a = new b();
    }

    /* compiled from: VoipHistoryFriendsFeatureNavigationEvent.kt */
    public static final class c extends lpw0 {
        public final CallsUserId a;

        public c(CallsUserId callsUserId) {
            this.a = callsUserId;
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
            return "OpenProfile(uid=" + this.a + ')';
        }
    }
}
