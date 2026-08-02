package xsna;

import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: AdditionalActionItem.kt */
/* loaded from: classes5.dex */
public abstract class zp0 {
    public final int a;
    public int b = 0;

    /* compiled from: AdditionalActionItem.kt */
    public static abstract class a extends zp0 {
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        /* compiled from: AdditionalActionItem.kt */
        /* renamed from: xsna.zp0$a$a, reason: collision with other inner class name */
        public static final class C4191a extends a {
            public static final C4191a g = new C4191a(R.drawable.vk_icon_user_star_badge_outline_28, R.string.user_profile_action_add_to_close_friends, R.attr.vk_ui_background_positive, 4);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class b extends a {
            public static final b g = new b(R.drawable.vk_icon_message_add_badge_outline_28, R.string.user_profile_action_add_to_conversation, 0, 8);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class c extends a {
            public static final c g = new c(R.drawable.vk_icon_bookmark_outline_28, R.string.user_profile_action_add_to_fave, 0, 12);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class d extends a {
            public static final d g = new d(R.drawable.vk_icon_block_outline_28, R.string.user_profile_action_block, R.attr.vk_ui_background_negative, 4);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class e extends a {
            public static final e g = new e(R.drawable.vk_icon_copy_outline_28, R.string.user_profile_action_copy_link, 0, 12);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class f extends a {
            public final String g;

            public f(String str) {
                super(R.drawable.vk_icon_hide_outline_28, R.string.user_profile_hide_user_news, 0, 12);
                this.g = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.g, ((f) obj).g);
            }

            public final int hashCode() {
                return this.g.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("HideNews(userName="), this.g, ')');
            }
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class g extends a {
            public static final g g = new g(R.drawable.vk_icon_user_star_badge_slash_outline_28, R.string.user_profile_action_remove_from_close_friends, 0, 12);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class h extends a {
            public static final h g = new h(R.drawable.vk_icon_bookmark_slash_outline_28, R.string.user_profile_action_remove_from_fave, 0, 12);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class i extends a {
            public static final i g = new i(R.drawable.vk_icon_user_slash_outline_28, R.string.user_profile_remove_from_friends, 0, 12);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class j extends a {
            public static final j g = new j(R.drawable.vk_icon_report_outline_28, R.string.user_profile_action_report, R.attr.vk_ui_background_negative, 4);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class k extends a {
            public static final k g = new k(R.drawable.vk_icon_share_outline_28, R.string.user_profile_action_share, 0, 12);
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class l extends a {
            public final String g;

            public l(String str) {
                super(R.drawable.vk_icon_view_outline_28, R.string.user_profile_show_user_news, 0, 12);
                this.g = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && epx.f(this.g, ((l) obj).g);
            }

            public final int hashCode() {
                return this.g.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ShowNews(userName="), this.g, ')');
            }
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class m extends a {
            public static final m g = new m(R.drawable.vk_icon_remove_circle_outline_28, R.string.user_profile_action_unblock, 0, 12);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i2, int i3, int i4, int i5) {
            super(0);
            int i6 = (i5 & 4) != 0 ? i3 : R.string.user_profile_action_add_to_conversation_short;
            i4 = (i5 & 8) != 0 ? R.attr.vk_ui_icon_accent : i4;
            this.c = i2;
            this.d = i3;
            this.e = i6;
            this.f = i4;
        }
    }

    /* compiled from: AdditionalActionItem.kt */
    public static abstract class b extends zp0 {
        public final int c;

        /* compiled from: AdditionalActionItem.kt */
        public static final class a extends b {
            public final ArrayList d;

            /* compiled from: AdditionalActionItem.kt */
            /* renamed from: xsna.zp0$b$a$a, reason: collision with other inner class name */
            public static final class C4192a {
                public final ProfileAction a;
                public final Integer b;
                public final Integer c;

                public C4192a(ProfileAction profileAction, Integer num, Integer num2) {
                    this.a = profileAction;
                    this.b = num;
                    this.c = num2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4192a)) {
                        return false;
                    }
                    C4192a c4192a = (C4192a) obj;
                    return epx.f(this.a, c4192a.a) && epx.f(this.b, c4192a.b) && epx.f(this.c, c4192a.c);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    Integer num = this.b;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.c;
                    return hashCode2 + (num2 != null ? num2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(action=");
                    sb.append(this.a);
                    sb.append(", longTextResId=");
                    sb.append(this.b);
                    sb.append(", shortTextResId=");
                    return uqi.b(sb, this.c, ')');
                }
            }

            public a(ArrayList arrayList) {
                super(1);
                this.d = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.d.equals(((a) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Primary(buttons="), this.d);
            }
        }

        /* compiled from: AdditionalActionItem.kt */
        /* renamed from: xsna.zp0$b$b, reason: collision with other inner class name */
        public static final class C4193b extends b {
            public final ProfileAction d;
            public final Integer e;

            public C4193b(ProfileAction profileAction, Integer num) {
                super(2);
                this.d = profileAction;
                this.e = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4193b)) {
                    return false;
                }
                C4193b c4193b = (C4193b) obj;
                return epx.f(this.d, c4193b.d) && epx.f(this.e, c4193b.e);
            }

            public final int hashCode() {
                int hashCode = this.d.hashCode() * 31;
                Integer num = this.e;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Secondary(action=");
                sb.append(this.d);
                sb.append(", longTextResId=");
                return uqi.b(sb, this.e, ')');
            }
        }

        /* compiled from: AdditionalActionItem.kt */
        public static final class c extends b {
            public final String d;
            public final ProfileAction e;

            public c(String str, ProfileAction profileAction) {
                super(3);
                this.d = str;
                this.e = profileAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "ThirdParty(appName=" + this.d + ", action=" + this.e + ')';
            }
        }

        public b(int i) {
            super(i);
            this.c = i;
        }

        @Override // xsna.zp0
        public final int a() {
            return this.c;
        }
    }

    public zp0(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
