package xsna;

import com.vkontakte.android.R;

/* compiled from: UserProfileLegoViewerMenuItem.kt */
/* loaded from: classes5.dex */
public abstract class f3u0 {

    /* compiled from: UserProfileLegoViewerMenuItem.kt */
    public static abstract class a extends f3u0 {
        public final int a;
        public final int b;
        public final boolean c;

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        /* renamed from: xsna.f3u0$a$a, reason: collision with other inner class name */
        public static final class C2849a extends a {
            public static final C2849a d = new C2849a(R.drawable.vk_icon_lego_favorite_outline_28, R.string.user_profile_action_add_to_close_friends, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2849a);
            }

            public final int hashCode() {
                return -1523769838;
            }

            public final String toString() {
                return "AddToCloseFriends";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class b extends a {
            public static final b d = new b(R.drawable.vk_icon_lego_bookmark_outline_28, R.string.user_profile_action_add_to_fave, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 746553151;
            }

            public final String toString() {
                return "AddToFave";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class c extends a {
            public static final c d = new c(R.drawable.vk_icon_lego_block_outline_28, R.string.user_profile_action_block, true);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1678927226;
            }

            public final String toString() {
                return "Block";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class d extends a {
            public static final d d = new d(R.drawable.vk_icon_lego_copy_outline_28, R.string.user_profile_action_copy_link, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1868346250;
            }

            public final String toString() {
                return "CopyLink";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class e extends a {
            public static final e d = new e(R.drawable.vk_icon_lego_unfavorite_outline_28, R.string.user_profile_action_remove_from_close_friends, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1330935534;
            }

            public final String toString() {
                return "RemoveFromCloseFriends";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class f extends a {
            public static final f d = new f(R.drawable.vk_icon_lego_bookmark_28, R.string.user_profile_action_remove_from_fave, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -963057089;
            }

            public final String toString() {
                return "RemoveFromFave";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class g extends a {
            public static final g d = new g(R.drawable.vk_icon_lego_minus_square_outline_28, R.string.user_profile_lego_action_unsubscribe, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 422597600;
            }

            public final String toString() {
                return "RemoveFromFriends";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class h extends a {
            public static final h d = new h(R.drawable.vk_icon_lego_report_outline_28, R.string.user_profile_action_report, true);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -55493029;
            }

            public final String toString() {
                return "Report";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class i extends a {
            public static final i d = new i(R.drawable.vk_icon_lego_share_outline_28, R.string.user_profile_action_share, false);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return -1663359528;
            }

            public final String toString() {
                return "Share";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class j extends a {
            public static final j d = new j(R.drawable.vk_icon_lego_unblock_outline_24, R.string.user_profile_action_unblock, true);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return 1186867533;
            }

            public final String toString() {
                return "Unblock";
            }
        }

        public a(int i2, int i3, boolean z) {
            this.a = i2;
            this.b = i3;
            this.c = z;
        }
    }

    /* compiled from: UserProfileLegoViewerMenuItem.kt */
    public static final class b extends f3u0 {
        public final t2u0 a;

        public b(t2u0 t2u0Var) {
            this.a = t2u0Var;
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
            return "OverflowApp(appButton=" + this.a + ')';
        }
    }

    /* compiled from: UserProfileLegoViewerMenuItem.kt */
    public static abstract class c extends f3u0 {
        public final int a;
        public final int b;

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class a extends c {
            public static final a c = new a(R.drawable.vk_icon_lego_user_plus_36, R.string.user_profile_lego_action_add_to_conversation);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1506787895;
            }

            public final String toString() {
                return "AddToConversation";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class b extends c {
            public final t2u0 c;

            public b(t2u0 t2u0Var) {
                super(0, 0);
                this.c = t2u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.c, ((b) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "App(button=" + this.c + ')';
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        /* renamed from: xsna.f3u0$c$c, reason: collision with other inner class name */
        public static final class C2850c extends c {
            public static final C2850c c = new C2850c(R.drawable.vk_icon_lego_gift_36, R.string.gift);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2850c);
            }

            public final int hashCode() {
                return -1852537448;
            }

            public final String toString() {
                return "Gift";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class d extends c {
            public static final d c = new d(R.drawable.vk_icon_lego_question_circle_36, R.string.vk_header_action_question);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1976441778;
            }

            public final String toString() {
                return "Question";
            }
        }

        /* compiled from: UserProfileLegoViewerMenuItem.kt */
        public static final class e extends c {
            public static final e c = new e(R.drawable.vk_icon_lego_share_28, R.string.user_profile_action_share);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1583038345;
            }

            public final String toString() {
                return "Share";
            }
        }

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }
}
