package xsna;

import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserProfileLegoStoriesContextMenu.kt */
/* loaded from: classes5.dex */
public final class irq0 {
    public static final int a = cn70.b(10);

    /* compiled from: UserProfileLegoStoriesContextMenu.kt */
    public static final class a {
    }

    /* compiled from: UserProfileLegoStoriesContextMenu.kt */
    public static final class b {
        public final int hashCode() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserProfileLegoStoriesContextMenu.kt */
    public static final class c {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c NewStory;
        public static final c SeeStories;
        public static final c SeeStory;
        public static final c SeeTranslations;
        private final int iconRes;
        private final int titleRes;

        static {
            c cVar = new c("NewStory", 0, R.string.user_profile_avatar_action_add_story, R.drawable.vk_icon_lego_add_outline_24);
            NewStory = cVar;
            c cVar2 = new c("SeeStory", 1, R.string.user_profile_avatar_action_show_stories_single, R.drawable.vk_icon_lego_story_outline_28);
            SeeStory = cVar2;
            c cVar3 = new c("SeeStories", 2, R.string.user_profile_avatar_action_show_stories, R.drawable.vk_icon_lego_story_outline_28);
            SeeStories = cVar3;
            c cVar4 = new c("SeeTranslations", 3, R.string.user_profile_avatar_action_show_translation, R.drawable.vk_icon_lego_live_outline_24);
            SeeTranslations = cVar4;
            c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
            $VALUES = cVarArr;
            $ENTRIES = new asp(cVarArr);
        }

        public c(String str, int i, int i2, int i3) {
            this.titleRes = i2;
            this.iconRes = i3;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconRes;
        }

        public final int i() {
            return this.titleRes;
        }
    }

    /* compiled from: UserProfileLegoStoriesContextMenu.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.NewStory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SeeStory.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.SeeStories.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.SeeTranslations.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(c cVar, a aVar) {
        int i = d.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i == 1) {
            aVar.getClass();
            throw null;
        }
        if (i == 2) {
            aVar.getClass();
            throw null;
        }
        if (i == 3) {
            aVar.getClass();
            throw null;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.getClass();
        throw null;
    }
}
