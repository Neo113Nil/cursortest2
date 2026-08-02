package xsna;

import com.vk.dto.stories.model.StoryViewAction;
import com.vkontakte.android.data.b;

/* compiled from: StoryAnalyticsEventBuilderExt.kt */
/* loaded from: classes6.dex */
public final class zwl0 {

    /* compiled from: StoryAnalyticsEventBuilderExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryViewAction.values().length];
            try {
                iArr[StoryViewAction.GROUP_FEED_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryViewAction.GO_TO_NEXT_STORY_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryViewAction.GO_TO_NEXT_STORY_AUTO_BY_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryViewAction.GO_TO_PREVIOUS_STORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryViewAction.GO_TO_NEXT_AUTHOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryViewAction.CLOSE_TAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryViewAction.CLOSE_SWIPE_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoryViewAction.CLOSE_SWIPE_RIGHT_OR_LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(b.d dVar, StoryViewAction storyViewAction) {
        switch (a.$EnumSwitchMapping$0[storyViewAction.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                dVar.b("group_feed", "story_type");
                break;
        }
    }
}
