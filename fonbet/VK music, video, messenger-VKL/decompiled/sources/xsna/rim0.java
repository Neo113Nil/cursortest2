package xsna;

import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryMemoryType;
import com.vk.stories.design.view.viewer.AnimatedSubtitleView;
import java.util.EnumSet;

/* compiled from: StorySubtitleDelegate.kt */
/* loaded from: classes6.dex */
public final class rim0 {
    public static final EnumSet<StoryMemoryType> g = EnumSet.of(StoryMemoryType.PHOTO, StoryMemoryType.POST, StoryMemoryType.STORY, StoryMemoryType.YEAR_SUMMARY, StoryMemoryType.ALBUM, StoryMemoryType.FIRST_STORY, StoryMemoryType.FIRST_AVATAR, StoryMemoryType.FIRST_POST, StoryMemoryType.FIRST_AUDIO, StoryMemoryType.MY_TOP_TRACK);
    public final AnimatedSubtitleView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final StoriesContainer e;
    public izs<? super nqo, s3q0> f;

    public rim0(AnimatedSubtitleView animatedSubtitleView, TextView textView, TextView textView2, ImageView imageView, StoriesContainer storiesContainer) {
        this.a = animatedSubtitleView;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
        this.e = storiesContainer;
    }
}
