package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;

/* compiled from: FriendsDialogOption.kt */
/* loaded from: classes5.dex */
public abstract class ios {

    /* compiled from: FriendsDialogOption.kt */
    public static final class a extends ios {
        public static final a a = new a();
    }

    /* compiled from: FriendsDialogOption.kt */
    public static final class b extends ios {
        public final Throwable a;

        public b(VKApiExecutionException vKApiExecutionException) {
            this.a = vKApiExecutionException;
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
            return oq.c(new StringBuilder("HighBotScore(throwable="), this.a, ')');
        }
    }

    /* compiled from: FriendsDialogOption.kt */
    public static final class c extends ios {
        public static final c a = new c();
    }

    /* compiled from: FriendsDialogOption.kt */
    public static abstract class d extends ios {

        /* compiled from: FriendsDialogOption.kt */
        public static abstract class a extends d {
            public final int a = R.string.user_profile_add_friend_closed_explain_m;
            public final int b = R.string.user_profile_add_friend_closed_explain_f;

            /* compiled from: FriendsDialogOption.kt */
            /* renamed from: xsna.ios$d$a$a, reason: collision with other inner class name */
            public static final class C3068a extends a {
                public static final C3068a c = new C3068a();
            }
        }

        /* compiled from: FriendsDialogOption.kt */
        public static abstract class b extends d {
            public final int a;
            public final int b;

            /* compiled from: FriendsDialogOption.kt */
            public static final class a extends b {
                public static final a c = new a(R.string.user_profile_add_friend_blacklisted_m, R.string.user_profile_add_friend_blacklisted_f);
            }

            /* compiled from: FriendsDialogOption.kt */
            /* renamed from: xsna.ios$d$b$b, reason: collision with other inner class name */
            public static final class C3069b extends b {
                public static final C3069b c = new C3069b(R.string.user_profile_add_friend_blacklisted_me_m, R.string.user_profile_add_friend_blacklisted_me_f);
            }

            public b(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final int a() {
                return this.b;
            }

            public final int b() {
                return this.a;
            }
        }
    }
}
