package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import java.util.Set;

/* compiled from: StoryPrivacyTypeExt.kt */
/* loaded from: classes16.dex */
public final class ham0 {
    public static final Set<StoryPrivacyType> a = rl3.y0(new StoryPrivacyType[]{StoryPrivacyType.ONLY_ME, StoryPrivacyType.FRIENDS_OF_FRIENDS, StoryPrivacyType.SOME});

    public static final StoryPrivacyType a(gpj0 gpj0Var, String str) {
        StoryPrivacyType storyPrivacyType;
        StoryPrivacyType[] values = StoryPrivacyType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                storyPrivacyType = null;
                break;
            }
            storyPrivacyType = values[i];
            if (epx.f(storyPrivacyType.j(), str)) {
                break;
            }
            i++;
        }
        return storyPrivacyType == null ? gpj0Var.d() ? StoryPrivacyType.FRIENDS : StoryPrivacyType.ALL : storyPrivacyType;
    }
}
