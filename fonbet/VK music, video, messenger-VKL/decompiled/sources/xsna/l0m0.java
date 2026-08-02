package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.stories.design.view.live.LiveShine;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.xxl0;
import xsna.yp5;

/* compiled from: StoryCirclePreview.kt */
/* loaded from: classes6.dex */
public final class l0m0 extends FrameLayout implements y8m0, too0 {
    public static final /* synthetic */ int n = 0;
    public final xxl0 b;
    public StoriesContainer c;
    public final Object d;
    public final StoryAvatarView e;
    public final TextView f;
    public final View g;
    public final LiveShine h;
    public final ImageView i;
    public final View j;
    public final GradientDrawable k;
    public final GradientDrawable l;
    public final Object m;

    public l0m0(Context context, xxl0 xxl0Var) {
        super(context, null, 0);
        this.b = xxl0Var;
        pm60 pm60Var = new pm60(9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, pm60Var);
        this.m = msy.a(lazyThreadSafetyMode, new k0m0(0));
        LayoutInflater.from(context).inflate(xxl0Var.f(), this);
        StoryAvatarView storyAvatarView = (StoryAvatarView) findViewById(R.id.iv_story_image);
        storyAvatarView.setPlaceholderImage(com.vk.toggle.d.P() ? R.drawable.user_placeholder_square : R.drawable.user_placeholder);
        this.e = storyAvatarView;
        this.f = (TextView) findViewById(R.id.tv_first_name);
        this.g = findViewById(R.id.click_handler);
        LiveShine liveShine = (LiveShine) findViewById(R.id.fl_story_live_shine);
        if (com.vk.toggle.d.P()) {
            f4m.r(cn70.b(4), liveShine);
            f4m.q(cn70.b(4), liveShine);
        }
        this.h = liveShine;
        this.j = findViewById(R.id.fl_story_preview_wrapper);
        ImageView imageView = (ImageView) findViewById(R.id.iv_story_bottom_badge);
        int b = cn70.b(com.vk.toggle.d.P() ? 3 : 8);
        f4m.r(b, imageView);
        f4m.q(b, imageView);
        this.i = imageView;
        Drawable background = imageView.getBackground();
        Drawable mutate = background != null ? background.mutate() : null;
        this.k = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
        Drawable foreground = liveShine.getForeground();
        Object mutate2 = foreground != null ? foreground.mutate() : null;
        this.l = mutate2 instanceof GradientDrawable ? (GradientDrawable) mutate2 : null;
        storyAvatarView.setOnUploadErrorCallback(new ud5(0, this, l0m0.class, "onUploadErrorAnimation", "onUploadErrorAnimation()V", 0, 2));
    }

    private final int getDefaultBorderColor() {
        Context context = getContext();
        if (!getStoryFeedNewDesign()) {
            this.e.getAvatarBorderColors().getClass();
        }
        return krv0.m(R.attr.vk_ui_stroke_accent, context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getSafeUpdate() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getStoryFeedNewDesign() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.i.setImageResource(getStoryFeedNewDesign() ? R.drawable.vk_icon_add_circle_fill_20 : dhr0.M() ? R.drawable.vk_icon_add_circle_fill_dark_20 : R.drawable.vk_icon_add_circle_fill_light_20);
    }

    @Override // xsna.y8m0
    public final void a() {
        if (getSafeUpdate()) {
            this.i.animate().cancel();
            this.e.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    @Override // xsna.y8m0
    public final void b(StoriesContainer storiesContainer, boolean z) {
        ?? r11;
        int defaultBorderColor;
        zp5 zp5Var;
        List<ClickableSticker> list;
        this.c = storiesContainer;
        boolean z2 = storiesContainer.Qb() && !storiesContainer.Eb();
        xxl0 xxl0Var = this.b;
        xxl0.a h = xxl0Var.h();
        StoryAvatarView storyAvatarView = this.e;
        if (h != null) {
            storyAvatarView.setAvatarBorderConfigParamsOverride(o9r0.a(storyAvatarView.getAvatarBorderConfigParamsOverride(), false, null, null, null, Float.valueOf(h.c), Float.valueOf(h.b), Float.valueOf(h.a), storyAvatarView.getAvatarBorderColors(), false, 1087));
        }
        yp5 yp5Var = null;
        storyAvatarView.t1(storiesContainer, z, xxl0Var, null);
        ImageView imageView = this.i;
        imageView.setVisibility(8);
        LiveShine liveShine = this.h;
        liveShine.setVisibility(8);
        storyAvatarView.setVisibility(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.story_name_padding);
        TextView textView = this.f;
        f4m.s(dimensionPixelSize, textView);
        f4m.r(getResources().getDimensionPixelSize(R.dimen.story_name_padding), textView);
        int c = dhr0.t.c(R.attr.vk_ui_background_content);
        GradientDrawable gradientDrawable = this.k;
        if (z2) {
            imageView.setVisibility(0);
            imageView.setImageResource(getStoryFeedNewDesign() ? R.drawable.vk_icon_add_circle_fill_20 : dhr0.M() ? R.drawable.vk_icon_add_circle_fill_dark_20 : R.drawable.vk_icon_add_circle_fill_light_20);
            imageView.setPadding(0, 0, 0, 0);
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(iah0.a(2.0f), c);
            }
            if (gradientDrawable != null) {
                gradientDrawable.setColor(c);
            }
        }
        if (z) {
            c();
        }
        textView.setText((storiesContainer.Qb() && z2) ? getContext().getString(R.string.story) : storiesContainer.Ib());
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ClickableStickers clickableStickers = it.next().X;
                if (clickableStickers == null || (list = clickableStickers.d) == null) {
                    r11 = 0;
                } else {
                    r11 = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof ClickableSituationalTemplate) {
                            r11.add(obj);
                        }
                    }
                }
                if (r11 == 0) {
                    r11 = EmptyList.b;
                }
                if (!((Collection) r11).isEmpty()) {
                    if (storiesContainer.Gb().isEmpty()) {
                        imageView.setVisibility(0);
                        if (gradientDrawable != null) {
                            gradientDrawable.setStroke(iah0.a(2.0f), c);
                        }
                        if (gradientDrawable != null) {
                            j9r0 border = storyAvatarView.getBorder();
                            r9r0 r9r0Var = border != null ? (r9r0) j5g.a0(border.d) : null;
                            if (storiesContainer.Cb()) {
                                defaultBorderColor = getContext().getColor(R.color.story_template_badge_color);
                            } else {
                                if (r9r0Var != null && (zp5Var = r9r0Var.c) != null) {
                                    yp5Var = zp5Var.b;
                                }
                                defaultBorderColor = yp5Var instanceof yp5.b ? ((yp5.b) yp5Var).a : getDefaultBorderColor();
                            }
                            gradientDrawable.setColor(defaultBorderColor);
                        }
                        imageView.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_stories_ideas_16, R.attr.vk_ui_icon_contrast));
                        return;
                    }
                }
            }
        }
        if (storiesContainer instanceof LiveFinishedStoriesContainer) {
            imageView.setVisibility(0);
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(iah0.a(2.0f), c);
            }
            if (gradientDrawable != null) {
                gradientDrawable.setColor(c);
            }
            imageView.setImageDrawable(m33.a(storiesContainer.Cb() ? R.drawable.vk_icon_play_circle_fill_steel_red_20 : R.drawable.vk_icon_play_circle_fill_steel_gray_20, getContext()));
            return;
        }
        if (fsk.A(storiesContainer)) {
            liveShine.setVisibility(0);
            GradientDrawable gradientDrawable2 = this.l;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setStroke(iah0.a(2.0f), c);
            }
        }
    }

    public final void c() {
        int c = dhr0.t.c(R.attr.vk_ui_background_content);
        Drawable drawable = getContext().getDrawable(getStoryFeedNewDesign() ? R.drawable.vk_icon_error_circle_fill_red_20 : R.drawable.vk_icon_error_circle_fill_red_24);
        if (drawable != null) {
            Bitmap createBitmap = Bitmap.createBitmap(cn70.b(20), cn70.b(20), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            ImageView imageView = this.i;
            imageView.setVisibility(0);
            imageView.setImageBitmap(createBitmap);
            imageView.setPadding(0, 0, 0, 0);
            GradientDrawable gradientDrawable = this.k;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(iah0.a(2.0f), c);
            }
            if (gradientDrawable != null) {
                gradientDrawable.setColor(c);
            }
        }
    }

    @Override // xsna.y8m0
    public StoriesContainer getStory() {
        return this.c;
    }

    @Override // xsna.y8m0
    public View getStoryImageView() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (getSafeUpdate()) {
            this.i.animate().cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        xxl0 xxl0Var = this.b;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(xxl0Var.d(), 1073741824), View.MeasureSpec.makeMeasureSpec(xxl0Var.c(), 1073741824));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.g.setOnLongClickListener(onLongClickListener);
    }
}
