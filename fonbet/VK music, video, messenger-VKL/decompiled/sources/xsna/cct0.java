package xsna;

import com.vkontakte.android.R;

/* compiled from: VideoRelatedVideosMoreActionItem.kt */
/* loaded from: classes7.dex */
public abstract class cct0 {
    public final e520 a;

    /* compiled from: VideoRelatedVideosMoreActionItem.kt */
    public static final class a extends cct0 {
        public static final a b = new a(new e520(R.id.video_copy_link, R.drawable.vk_icon_copy_outline_28, R.string.copy_link, 1, false, R.color.vk_white, 0, false, null, 0, null, false, 8144));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2031725820;
        }

        public final String toString() {
            return "Copy";
        }
    }

    /* compiled from: VideoRelatedVideosMoreActionItem.kt */
    public static final class b extends cct0 {
        public static final b b = new b(new e520(R.id.video_go_to_owner, R.drawable.vk_icon_users_outline_28, R.string.video_playlist_go_to_owner, 3, false, R.color.vk_white, 0, false, null, 0, null, false, 8144));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -45302591;
        }

        public final String toString() {
            return "GoToOwner";
        }
    }

    /* compiled from: VideoRelatedVideosMoreActionItem.kt */
    public static abstract class c extends cct0 {

        /* compiled from: VideoRelatedVideosMoreActionItem.kt */
        public static final class a extends c {
            public static final a b = new a(new e520(R.id.video_playlist_add_by_link, R.drawable.vk_icon_film_strip_add_outline_28, R.string.video_playlist_bottom_menu_add_by_link, 6, false, R.color.vk_white, 0, false, null, 0, null, false, 8144));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -460040776;
            }

            public final String toString() {
                return "AddVideoByLink";
            }
        }

        /* compiled from: VideoRelatedVideosMoreActionItem.kt */
        public static final class b extends c {
            public static final b b = new b(new e520(R.id.video_delete_playlist, R.drawable.vk_icon_delete_outline_28, R.string.video_playlist_bottom_menu_delete_playlist, 5, false, R.color.vk_red, 0, false, null, 0, null, false, 8144));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1608048008;
            }

            public final String toString() {
                return "Delete";
            }
        }

        /* compiled from: VideoRelatedVideosMoreActionItem.kt */
        /* renamed from: xsna.cct0$c$c, reason: collision with other inner class name */
        public static final class C2657c extends c {
            public static final C2657c b = new C2657c(new e520(R.id.video_edit_playlist, R.drawable.vk_icon_edit_outline_28, R.string.video_edit, 4, false, R.color.vk_white, 0, false, null, 0, null, false, 8144));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2657c);
            }

            public final int hashCode() {
                return 2098911767;
            }

            public final String toString() {
                return "Edit";
            }
        }

        /* compiled from: VideoRelatedVideosMoreActionItem.kt */
        public static final class d extends c {
            public static final d b = new d(new e520(R.id.share, R.drawable.vk_icon_share_outline_28, R.string.video_share, 2, false, R.color.vk_white, 0, false, null, 0, null, false, 8144));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 654796146;
            }

            public final String toString() {
                return "Share";
            }
        }

        /* compiled from: VideoRelatedVideosMoreActionItem.kt */
        public static final class e extends c {
            public static final e b = new e(new e520(R.id.video_subscribe_playlist, R.drawable.vk_icon_add_square_outline_28, R.string.video_album_subscribe, 2, false, R.color.vk_white, 0, false, null, 0, null, false, 8144));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1580659037;
            }

            public final String toString() {
                return "Subscribe";
            }
        }

        /* compiled from: VideoRelatedVideosMoreActionItem.kt */
        public static final class f extends c {
            public static final f b = new f(new e520(R.id.video_unsubscribe_playlist, R.drawable.vk_icon_minus_square_outline_28, R.string.video_album_unsubscribe, 2, false, R.color.vk_white, 0, false, null, 0, null, false, 8144));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1663662556;
            }

            public final String toString() {
                return "Unsubscribe";
            }
        }

        /* compiled from: VideoRelatedVideosMoreActionItem.kt */
        public static final class g extends c {
            public static final g b = new g(new e520(R.id.video_upload_video, R.drawable.vk_icon_upload_outline_28, R.string.video_playlist_bottom_menu_upload_video, 4, false, R.color.vk_white, 0, false, null, 0, null, false, 8144));

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1111184690;
            }

            public final String toString() {
                return "Upload";
            }
        }
    }

    public cct0(e520 e520Var) {
        this.a = e520Var;
    }
}
