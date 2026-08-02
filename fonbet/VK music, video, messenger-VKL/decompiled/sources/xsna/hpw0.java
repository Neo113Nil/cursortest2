package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: VoipHistoryFriendsAction.kt */
/* loaded from: classes7.dex */
public abstract class hpw0 implements kj50 {

    /* compiled from: VoipHistoryFriendsAction.kt */
    public static final class a extends hpw0 {
        public static final a b = new a();
    }

    /* compiled from: VoipHistoryFriendsAction.kt */
    public static abstract class b extends hpw0 {

        /* compiled from: VoipHistoryFriendsAction.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: VoipHistoryFriendsAction.kt */
        /* renamed from: xsna.hpw0$b$b, reason: collision with other inner class name */
        public static final class C3015b extends b {
            public static final C3015b b = new C3015b();
        }
    }

    /* compiled from: VoipHistoryFriendsAction.kt */
    public static abstract class c extends hpw0 {

        /* compiled from: VoipHistoryFriendsAction.kt */
        public static final class a extends c {
            public final CallsUserId b;
            public final boolean c;

            public a(CallsUserId.VkUserId vkUserId, boolean z) {
                this.b = vkUserId;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ToCall(uid=");
                sb.append(this.b);
                sb.append(", isVideo=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: VoipHistoryFriendsAction.kt */
        public static final class b extends c {
            public static final b b = new b();
        }

        /* compiled from: VoipHistoryFriendsAction.kt */
        /* renamed from: xsna.hpw0$c$c, reason: collision with other inner class name */
        public static final class C3016c extends c {
            public final CallsUserId b;

            public C3016c(CallsUserId.VkUserId vkUserId) {
                this.b = vkUserId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3016c) && epx.f(this.b, ((C3016c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToProfile(uid=" + this.b + ')';
            }
        }
    }

    /* compiled from: VoipHistoryFriendsAction.kt */
    public static final class d extends hpw0 {
        public static final d b = new d();
    }
}
