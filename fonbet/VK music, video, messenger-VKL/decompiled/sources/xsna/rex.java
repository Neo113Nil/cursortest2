package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;

/* compiled from: InterestingStoriesBlockPhotoItemHolderView.kt */
/* loaded from: classes4.dex */
public final class rex extends RatioFrameLayout implements cex {
    public final FrescoImageView e;
    public final StoryProgressView f;
    public final AppCompatImageView g;
    public final TextView h;

    public rex(Context context) {
        super(context, null, 0);
        setId(R.id.photo_wrap);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setContentDescription(context.getString(R.string.accessibility_photo));
        setOrientation(0);
        FrescoImageView frescoImageView = new FrescoImageView(context, null, 6, 0);
        frescoImageView.setId(R.id.video_preview);
        frescoImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        frescoImageView.setContentDescription(null);
        this.e = frescoImageView;
        frescoImageView.setScaleType(ScaleType.CENTER_CROP);
        frescoImageView.setPlaceholder(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        addView(frescoImageView);
        addView(super.c(context));
        StoryProgressView a = super.a(context);
        this.f = a;
        addView(a);
        addView(super.e(context));
        ImageView b = super.b(context);
        this.g = (AppCompatImageView) b;
        addView(b);
        TextView d = super.d(context);
        this.h = d;
        addView(d);
    }

    public final TextView getPhotoAuthor() {
        return this.h;
    }

    public final ImageView getPhotoLike() {
        return this.g;
    }

    public final FrescoImageView getPhotoPreview() {
        return this.e;
    }

    public final StoryProgressView getPhotoProgress() {
        return this.f;
    }
}
