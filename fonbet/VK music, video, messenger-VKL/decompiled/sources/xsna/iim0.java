package xsna;

import com.vkontakte.android.R;

/* compiled from: StoryStatisticsViewersPopupMenuItem.kt */
/* loaded from: classes6.dex */
public abstract class iim0 {
    public final int a;
    public final int b;

    /* compiled from: StoryStatisticsViewersPopupMenuItem.kt */
    public static final class a extends iim0 {
        public static final a c = new a(R.drawable.vk_icon_hide_outline_24, R.string.story_statistics_viewers_action_hide_stories);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 627805815;
        }

        public final String toString() {
            return "HideStories";
        }
    }

    /* compiled from: StoryStatisticsViewersPopupMenuItem.kt */
    public static final class b extends iim0 {
        public static final b c = new b(R.drawable.vk_icon_view_outline_24, R.string.story_statistics_viewers_action_show_stories);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1136375900;
        }

        public final String toString() {
            return "ShowStories";
        }
    }

    /* compiled from: StoryStatisticsViewersPopupMenuItem.kt */
    public static final class c extends iim0 {
        public static final c c = new c(R.drawable.vk_icon_message_outline_24, R.string.story_statistics_viewers_action_write_message);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -626053598;
        }

        public final String toString() {
            return "WriteMessage";
        }
    }

    public iim0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
