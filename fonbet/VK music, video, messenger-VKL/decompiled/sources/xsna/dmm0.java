package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vkontakte.android.R;

/* compiled from: StoryViewHeaderDelegate.kt */
/* loaded from: classes6.dex */
public final class dmm0 {
    public final StoriesContainer a;
    public final StoryAvatarView b;
    public final View c;
    public final View d;
    public final Context e;
    public final int f = y8g0.a(R.dimen.story_view_avatar_size);

    public dmm0(StoriesContainer storiesContainer, StoryAvatarView storyAvatarView, View view, View view2) {
        this.a = storiesContainer;
        this.b = storyAvatarView;
        this.c = view;
        this.d = view2;
        this.e = storyAvatarView.getContext();
    }
}
