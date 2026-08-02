package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vkontakte.android.R;

/* compiled from: LoadingStoryView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class ptz extends FrameLayout {
    public final StoriesContainer b;
    public final elm0 c;

    public ptz(Context context, StoriesContainer storiesContainer, elm0 elm0Var) {
        super(context);
        this.b = storiesContainer;
        this.c = elm0Var;
        LayoutInflater.from(context).inflate(R.layout.activity_view_story, this);
        findViewById(R.id.fl_loading_view).setVisibility(0);
        StoryViewHeader storyViewHeader = (StoryViewHeader) findViewById(R.id.story_view_header);
        storyViewHeader.setContainer(storiesContainer);
        storyViewHeader.a(null);
        storyViewHeader.setOnAuthorClickListener(new bi0(22, this, context));
        storyViewHeader.setOnCloseClickListener(new rop(this, 12));
    }
}
