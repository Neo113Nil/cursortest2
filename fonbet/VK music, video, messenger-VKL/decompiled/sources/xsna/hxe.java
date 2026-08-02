package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: ClipsProfilePopupAdapterItem.kt */
/* loaded from: classes17.dex */
public abstract class hxe {

    /* compiled from: ClipsProfilePopupAdapterItem.kt */
    public static abstract class a extends hxe {
        public final int a;
        public final int b;

        /* compiled from: ClipsProfilePopupAdapterItem.kt */
        /* renamed from: xsna.hxe$a$a, reason: collision with other inner class name */
        public static final class C3026a extends a {
            public static final C3026a c = new C3026a(R.drawable.vk_icon_write_outline_20, R.string.clips_popup_action_change_description);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3026a);
            }

            public final int hashCode() {
                return -542929204;
            }

            public final String toString() {
                return "ChangeDescription";
            }
        }

        /* compiled from: ClipsProfilePopupAdapterItem.kt */
        public static final class b extends a {
            public final UserId c;

            public b(UserId userId) {
                super(R.drawable.vk_icon_users_outline_20, R.string.clips_popup_action_show_coauthors_invites);
                this.c = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.c, ((b) obj).c);
            }

            public final int hashCode() {
                return Long.hashCode(this.c.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("CoauthorsInvitations(forUserId="), this.c, ')');
            }
        }

        /* compiled from: ClipsProfilePopupAdapterItem.kt */
        public static final class c extends a {
            public static final c c = new c(R.drawable.vk_icon_heart_settings_outline_20, R.string.clip_feed_configure_interests);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -323286486;
            }

            public final String toString() {
                return "InterestsChoice";
            }
        }

        /* compiled from: ClipsProfilePopupAdapterItem.kt */
        public static final class d extends a {
            public final UserId c;

            public d(UserId userId) {
                super(R.drawable.vk_icon_arrow_2_squarepath_outline_20, R.string.clips_popup_action_reorder_playlists);
                this.c = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.c, ((d) obj).c);
            }

            public final int hashCode() {
                return Long.hashCode(this.c.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ReorderPlaylists(forUserId="), this.c, ')');
            }
        }

        /* compiled from: ClipsProfilePopupAdapterItem.kt */
        public static final class e extends a {
            public static final e c = new e(R.drawable.vk_icon_share_outline_20, R.string.clips_popup_action_share_profile);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -986520449;
            }

            public final String toString() {
                return "Share";
            }
        }

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }
}
