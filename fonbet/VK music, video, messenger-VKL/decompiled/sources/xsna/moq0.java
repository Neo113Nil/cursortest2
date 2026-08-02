package xsna;

import com.vkontakte.android.R;

/* compiled from: UserProfileDialogAdapterItem.kt */
/* loaded from: classes5.dex */
public abstract class moq0 {
    public final int a;
    public final int b;
    public boolean c = false;

    /* compiled from: UserProfileDialogAdapterItem.kt */
    public static abstract class a extends moq0 {
        public final int d;
        public final int e;

        /* compiled from: UserProfileDialogAdapterItem.kt */
        /* renamed from: xsna.moq0$a$a, reason: collision with other inner class name */
        public static final class C3354a extends a {
            public static final C3354a f = new C3354a(R.drawable.vk_icon_story_reply_outline_24, R.string.user_profile_avatar_action_add_story);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3354a);
            }

            public final int hashCode() {
                return 1516306038;
            }

            public final String toString() {
                return "AddStory";
            }
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class b extends a {
            public static final b f = new b(R.drawable.vk_icon_delete_outline_24, R.string.user_profile_avatar_action_delete_photo);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class c extends a {
            public final String f;

            public c() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.f, ((c) obj).f);
            }

            public final int hashCode() {
                String str = this.f;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("EditPhoto(sourceScreen="), this.f, ')');
            }

            public c(String str) {
                super(R.drawable.vk_icon_pen_outline_24, R.string.user_profile_avatar_action_edit_photo);
                this.f = str;
            }
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class d extends a {
            public final i0u0 f;

            public d(i0u0 i0u0Var) {
                super(R.drawable.vk_icon_live_outline_24, R.string.user_profile_avatar_action_show_translation);
                this.f = i0u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.f, ((d) obj).f);
            }

            public final int hashCode() {
                return this.f.hashCode();
            }

            public final String toString() {
                return zq.b(new StringBuilder("ShowLive(viewProvider="), this.f, ')');
            }
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class e extends a {
            public static final e f = new e(R.drawable.vk_icon_user_circle_outline_24, R.string.user_profile_avatar_action_open_photo);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class f extends a {
            public final i0u0 f;

            public f(i0u0 i0u0Var) {
                super(R.drawable.vk_icon_story_outline_24, R.string.user_profile_avatar_action_show_stories);
                this.f = i0u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.f, ((f) obj).f);
            }

            public final int hashCode() {
                return this.f.hashCode();
            }

            public final String toString() {
                return zq.b(new StringBuilder("ShowStories(viewProvider="), this.f, ')');
            }
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class g extends a {
            public final i0u0 f;

            public g(i0u0 i0u0Var) {
                super(R.drawable.vk_icon_story_outline_24, R.string.user_profile_avatar_action_show_stories_single);
                this.f = i0u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.f, ((g) obj).f);
            }

            public final int hashCode() {
                return this.f.hashCode();
            }

            public final String toString() {
                return zq.b(new StringBuilder("ShowStory(viewProvider="), this.f, ')');
            }
        }

        public a(int i, int i2) {
            super(i, i2);
            this.d = i;
            this.e = i2;
        }

        @Override // xsna.moq0
        public final int a() {
            return this.d;
        }

        @Override // xsna.moq0
        public final int c() {
            return this.e;
        }
    }

    /* compiled from: UserProfileDialogAdapterItem.kt */
    public static abstract class b extends moq0 {
        public final int d;
        public final int e;

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class a extends b {
            public static final a f = new a(R.drawable.vk_icon_copy_outline_28, R.string.user_profile_domain_action_copy);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        /* renamed from: xsna.moq0$b$b, reason: collision with other inner class name */
        public static final class C3355b extends b {
            public static final C3355b f = new C3355b(R.drawable.vk_icon_share_outline_28, R.string.user_profile_domain_action_share);
        }

        public b(int i, int i2) {
            super(i, i2);
            this.d = i;
            this.e = i2;
        }

        @Override // xsna.moq0
        public final int a() {
            return this.d;
        }

        @Override // xsna.moq0
        public final int c() {
            return this.e;
        }
    }

    /* compiled from: UserProfileDialogAdapterItem.kt */
    public static abstract class c extends moq0 {
        public final int d;
        public final int e;
        public final int f;

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class a extends c {
            public static final a g = new a(R.drawable.vk_icon_add_outline_28, R.string.user_profile_menu_add_account, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class b extends c {
            public static final b g = new b(R.drawable.vk_icon_bookmark_outline_28, R.string.user_profile_action_add_to_fave, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        /* renamed from: xsna.moq0$c$c, reason: collision with other inner class name */
        public static final class C3356c extends c {
            public static final C3356c g = new C3356c(R.drawable.vk_icon_block_outline_28, R.string.user_profile_action_block, R.attr.vk_ui_background_negative, 0);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class d extends c {
            public static final d g = new d(R.drawable.vk_icon_write_outline_28, R.string.user_profile_menu_edit_cover, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class e extends c {
            public static final e g = new e(R.drawable.vk_icon_copy_outline_28, R.string.user_profile_menu_profile_link, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class f extends c {
            public static final f g = new f(R.drawable.vk_icon_donut_outline_24, R.string.user_profile_menu_donut_settings, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class g extends c {
            public static final g g = new g(R.drawable.vk_icon_advertising_outline_28, R.string.user_profile_action_promote, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class h extends c {
            public static final h g = new h(R.drawable.vk_icon_user_circle_outline_28, R.string.user_profile_menu_edit_profile, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class i extends c {
            public static final i g = new i(R.drawable.vk_icon_help_outline_28, R.string.user_profile_menu_help, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class j extends c {
            public static final j g = new j(R.drawable.vk_icon_search_24, R.string.user_profile_action_post_search, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class k extends c {
            public static final k g = new k(R.drawable.vk_icon_bookmark_slash_outline_28, R.string.user_profile_action_remove_from_fave, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class l extends c {
            public static final l g = new l(R.drawable.vk_icon_cancel_circle_outline_28, R.string.user_profile_delete_friend, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class m extends c {
            public static final m g = new m(R.drawable.vk_icon_report_outline_28, R.string.user_profile_action_report, 8);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class n extends c {
            public static final n g = new n(R.drawable.vk_icon_settings_outline_28, R.string.user_profile_menu_settings, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class o extends c {
            public static final o g = new o(R.drawable.vk_icon_share_outline_28, R.string.user_profile_action_share, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class p extends c {
            public static final p g = new p(R.drawable.vk_icon_share_outline_28, R.string.user_profile_menu_share_profile, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class q extends c {
            public static final q g = new q(R.drawable.vk_icon_statistics_outline_28, R.string.user_profile_menu_statistics, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class r extends c {
            public static final r g = new r(R.drawable.vk_icon_archive_outline_28, R.string.user_profile_menu_story_archive, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class s extends c {
            public static final s g = new s(R.drawable.vk_icon_switch_24, R.string.user_profile_menu_switch_account, 12);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class t extends c {
            public static final t g = new t(R.drawable.vk_icon_remove_circle_outline_28, R.string.user_profile_action_unblock, 12);
        }

        public /* synthetic */ c(int i2, int i3, int i4) {
            this(i2, i3, (i4 & 4) != 0 ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_background_negative, 0);
        }

        @Override // xsna.moq0
        public final int a() {
            return this.d;
        }

        @Override // xsna.moq0
        public final int b() {
            return this.f;
        }

        @Override // xsna.moq0
        public final int c() {
            return this.e;
        }

        public c(int i2, int i3, int i4, int i5) {
            super(i2, i3);
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }

    /* compiled from: UserProfileDialogAdapterItem.kt */
    public static abstract class d extends moq0 {
        public final int d;
        public final int e;

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class a extends d {
            public static final a f = new a(R.drawable.vk_icon_live_outline_28, R.string.user_profile_notification_live_on);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class b extends d {
            public static final b f = new b(R.drawable.vk_icon_write_square_outline_28, R.string.user_profile_notification_post_on);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class c extends d {
            public static final c f = new c(R.drawable.vk_icon_story_outline_28, R.string.user_profile_notification_story_on);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        /* renamed from: xsna.moq0$d$d, reason: collision with other inner class name */
        public static final class C3357d extends d {
            public static final C3357d f = new C3357d(R.drawable.vk_icon_live_outline_28, R.string.user_profile_notification_live_off);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class e extends d {
            public static final e f = new e(R.drawable.vk_icon_write_square_outline_28, R.string.user_profile_notification_post_off);
        }

        /* compiled from: UserProfileDialogAdapterItem.kt */
        public static final class f extends d {
            public static final f f = new f(R.drawable.vk_icon_story_outline_28, R.string.user_profile_notification_story_off);
        }

        public d(int i, int i2) {
            super(i, i2);
            this.d = i;
            this.e = i2;
        }

        @Override // xsna.moq0
        public final int a() {
            return this.d;
        }

        @Override // xsna.moq0
        public final int c() {
            return this.e;
        }
    }

    public moq0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return R.attr.vk_ui_icon_accent;
    }

    public int c() {
        return this.b;
    }
}
