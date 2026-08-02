package xsna;

import com.vkontakte.android.R;

/* compiled from: MoreOptionsItem.kt */
/* loaded from: classes16.dex */
public abstract class n930 {
    public final int a;
    public final int b;

    /* compiled from: MoreOptionsItem.kt */
    public static final class a extends n930 {
        public static final a c = new a(R.drawable.vk_icon_advertising_check_outline_24, R.string.story_more_menu_change_ad);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class b extends n930 {
        public static final b c = new b(R.drawable.vk_icon_brush_outline_24, R.string.story_more_menu_drawing);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class c extends n930 {
        public static final c c = new c(R.drawable.vk_icon_advertising_outline_24, R.string.story_more_menu_mark_ad);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class d extends n930 {
        public static final d c = new d(R.drawable.vk_icon_add_24, R.string.story_more_menu_new_frame);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static abstract class e extends n930 {
        public e(int i) {
            super(R.drawable.vk_icon_calendar_outline_24, i);
        }
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class f extends e {
        public static final f c = new f(R.string.story_more_menu_booking_disabled);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class g extends e {
        public static final g c = new g(R.string.story_more_menu_booking_enabled);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class h extends n930 {
        public static final h c = new h(R.drawable.vk_icon_download_outline_24, R.string.story_more_menu_save_to_device);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static abstract class i extends n930 {
        public final int c;

        public i(int i, int i2) {
            super(R.drawable.vk_icon_clock_circle_dashed_outline_24, i);
            this.c = i2;
        }
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class j extends i {
        public static final j d = new j(R.string.story_more_menu_12_hour, 12);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class k extends i {
        public static final k d = new k(R.string.story_more_menu_1_hour, 1);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class l extends i {
        public static final l d = new l(R.string.story_more_menu_24_hour, 24);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class m extends i {
        public static final m d = new m(R.string.story_more_menu_48_hour, 48);
    }

    /* compiled from: MoreOptionsItem.kt */
    public static final class n extends n930 {
        public static final n c = new n(R.drawable.vk_icon_arrow_up_down_corners_outline_24, R.string.story_more_menu_verticalization);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1082398076;
        }

        public final String toString() {
            return "Verticalization";
        }
    }

    public n930(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }
}
