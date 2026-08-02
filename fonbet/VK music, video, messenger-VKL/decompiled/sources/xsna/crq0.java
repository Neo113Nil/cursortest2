package xsna;

import com.vkontakte.android.R;

/* compiled from: UserProfileLegoNotificationsContextMenu.kt */
/* loaded from: classes5.dex */
public final class crq0 {
    public static final int a = cn70.b(10);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserProfileLegoNotificationsContextMenu.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HidePosts;
        public static final a HideStories;
        public static final a HideTranslations;
        public static final a ShowPosts;
        public static final a ShowStories;
        public static final a ShowTranslations;
        private final int iconRes;
        private final int titleRes;

        static {
            a aVar = new a("ShowPosts", 0, R.string.user_profile_notification_post_on, R.drawable.vk_icon_lego_article_box_outline_24);
            ShowPosts = aVar;
            a aVar2 = new a("HidePosts", 1, R.string.user_profile_notification_post_off, R.drawable.vk_icon_lego_article_box_outline_24);
            HidePosts = aVar2;
            a aVar3 = new a("ShowStories", 2, R.string.user_profile_notification_story_on, R.drawable.vk_icon_lego_story_outline_28);
            ShowStories = aVar3;
            a aVar4 = new a("HideStories", 3, R.string.user_profile_notification_story_off, R.drawable.vk_icon_lego_story_outline_28);
            HideStories = aVar4;
            a aVar5 = new a("ShowTranslations", 4, R.string.user_profile_notification_live_on, R.drawable.vk_icon_lego_live_outline_24);
            ShowTranslations = aVar5;
            a aVar6 = new a("HideTranslations", 5, R.string.user_profile_notification_live_off, R.drawable.vk_icon_lego_live_outline_24);
            HideTranslations = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2, int i3) {
            this.titleRes = i2;
            this.iconRes = i3;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconRes;
        }

        public final int i() {
            return this.titleRes;
        }
    }

    /* compiled from: UserProfileLegoNotificationsContextMenu.kt */
    public static final class b {
        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: UserProfileLegoNotificationsContextMenu.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ShowPosts.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.HidePosts.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowStories.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideStories.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.ShowTranslations.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.HideTranslations.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
