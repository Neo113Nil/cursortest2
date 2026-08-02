package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: StorySearchPreview.kt */
/* loaded from: classes4.dex */
public final class hcm0 extends FrameLayout implements y8m0 {
    public StoriesContainer b;
    public final VKImageView c;
    public final TextView d;
    public final TextView e;

    public hcm0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.story_search_preview, this);
        this.c = (VKImageView) findViewById(R.id.iv_story_image);
        this.d = (TextView) findViewById(R.id.story_elongated_line_1);
        this.e = (TextView) findViewById(R.id.story_elongated_line_2);
    }

    @Override // xsna.y8m0
    public final void b(StoriesContainer storiesContainer, boolean z) {
        if (epx.f(this.b, storiesContainer) || !storiesContainer.Eb()) {
            return;
        }
        this.b = storiesContainer;
        StoryEntry Lb = storiesContainer.Lb();
        this.c.load(Lb != null ? Lb.Cb(true) : null);
        String zb = storiesContainer.zb();
        StoryOwner storyOwner = storiesContainer.b;
        String Gb = storyOwner != null ? storyOwner.Gb() : null;
        TextView textView = this.e;
        TextView textView2 = this.d;
        if (Gb == null || Gb.length() == 0) {
            textView2.setText((CharSequence) null);
            textView.setText(zb);
        } else {
            textView2.setText(zb);
            textView.setText(Gb);
        }
    }

    @Override // xsna.y8m0
    public StoriesContainer getStory() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.story_elongated_width), 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.story_elongated_height), 1073741824));
    }

    @Override // xsna.y8m0
    public VKImageView getStoryImageView() {
        return this.c;
    }

    @Override // xsna.y8m0
    public final void a() {
    }
}
