package xsna;

import com.vkontakte.android.R;

/* compiled from: CommunityOwnerTopBarContextMenu.kt */
/* loaded from: classes5.dex */
public abstract class ybh {
    public final int a;
    public final Integer b;
    public final boolean c;

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class a extends ybh {
        public a(boolean z) {
            super(z ? R.string.deny_messages : R.string.allow_messages, false, Integer.valueOf(z ? R.drawable.vk_icon_lego_bubble_cross_outline_24 : R.drawable.vk_icon_lego_bubble_check_outline_24));
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class b extends ybh {
        public static final b d = new b(R.string.copy_link, false, Integer.valueOf(R.drawable.vk_icon_lego_copy_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 179183066;
        }

        public final String toString() {
            return "CopyLink";
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class c extends ybh {
        public c(boolean z) {
            super(z ? R.string.community_topbar_menu_remove_from_favorites : R.string.community_topbar_menu_add_to_favorites, false, Integer.valueOf(z ? R.drawable.vk_icon_lego_bookmark_24 : R.drawable.vk_icon_lego_bookmark_outline_24));
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class d extends ybh {
        public static final d d = new d(R.string.invite_friends, false, Integer.valueOf(R.drawable.vk_icon_lego_user_plus_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2082561951;
        }

        public final String toString() {
            return "InviteFriends";
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class e extends ybh {
        public static final e d = new e(R.string.community_lego_owner_menu_unsubscribe, false, Integer.valueOf(R.drawable.vk_icon_lego_minus_square_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1912050228;
        }

        public final String toString() {
            return "Leave";
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class f extends ybh {
        public static final f d = new f(R.string.community_topbar_menu_notifications, false, Integer.valueOf(R.drawable.vk_icon_lego_bell_plus_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1875627773;
        }

        public final String toString() {
            return "Notifications";
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class g extends ybh {
        public static final g d = new g(R.string.qr_action_open, false, Integer.valueOf(R.drawable.vk_icon_lego_qr_code_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 952142230;
        }

        public final String toString() {
            return "OpenQr";
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class h extends ybh {
        public static final h d = new h(R.string.community_report, true, Integer.valueOf(R.drawable.vk_icon_lego_report_octagon_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1028200639;
        }

        public final String toString() {
            return "Report";
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class i extends ybh {
        public static final i d = new i(R.string.share, false, Integer.valueOf(R.drawable.vk_icon_lego_share_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1905496332;
        }

        public final String toString() {
            return "Share";
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class j extends ybh {
        public static final j d = new j(R.string.groups_suggestions_title, false, Integer.valueOf(R.drawable.vk_icon_lego_users_3_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1202194841;
        }

        public final String toString() {
            return "SimilarCommunities";
        }
    }

    /* compiled from: CommunityOwnerTopBarContextMenu.kt */
    public static final class k extends ybh {
        public static final k d = new k(R.string.story_open_community_archive, false, Integer.valueOf(R.drawable.vk_icon_lego_archive_outline_24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 250618200;
        }

        public final String toString() {
            return "StoryArchive";
        }
    }

    public ybh(int i2, boolean z, Integer num) {
        this.a = i2;
        this.b = num;
        this.c = z;
    }
}
