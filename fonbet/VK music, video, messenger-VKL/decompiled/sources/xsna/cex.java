package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkMiniUserStack;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: InterestingStoriesBlockItemHolderView.kt */
/* loaded from: classes4.dex */
public interface cex {
    public static final a u7 = a.a;

    /* compiled from: InterestingStoriesBlockItemHolderView.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Object b;
        public static final Object c;
        public static final Object d;

        static {
            mg mgVar = new mg(15);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            b = msy.a(lazyThreadSafetyMode, mgVar);
            c = msy.a(lazyThreadSafetyMode, new ob0(15));
            d = msy.a(lazyThreadSafetyMode, new vg0(19));
        }

        public static PaintDrawable a(int[] iArr) {
            bex bexVar = new bex(iArr, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.15f, 0.3f, 0.7f, 0.85f, 1.0f});
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            paintDrawable.setShaderFactory(bexVar);
            return paintDrawable;
        }
    }

    default StoryProgressView a(Context context) {
        StoryProgressView storyProgressView = new StoryProgressView(context);
        storyProgressView.setId(R.id.video_single_clip_song_progress);
        storyProgressView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        bwt0.p0(storyProgressView, false);
        storyProgressView.c = iah0.a(2);
        storyProgressView.setSectionCount(1);
        storyProgressView.setCurrentSection(0);
        int a2 = iah0.a(3);
        bwt0.e0(storyProgressView, a2, a2, a2, a2);
        f4m.m(8388663, storyProgressView);
        return storyProgressView;
    }

    default ImageView b(Context context) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.video_single_clip_like);
        int a2 = iah0.a(36);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(a2, a2));
        bwt0.p0(appCompatImageView, true);
        bwt0.o0(appCompatImageView, -1);
        f4m.m(8388693, appCompatImageView);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        int a3 = iah0.a(6);
        int a4 = iah0.a(4);
        bwt0.e0(appCompatImageView, a3, a4, a3, a4);
        return appCompatImageView;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    default View c(Context context) {
        View view = new View(context);
        u7.getClass();
        view.setBackground((Drawable) a.b.getValue());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(100)));
        f4m.m(8388663, view);
        return view;
    }

    default TextView d(Context context) {
        TextView textView = new TextView(context);
        textView.setId(R.id.video_single_clip_owner);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bwt0.p0(textView, true);
        textView.setTextSize(2, 16.0f);
        textView.setLetterSpacing(0.01f);
        textView.setLineSpacing(iah0.y(1.0f), 1.0f);
        textView.setTextColor(-1);
        f4m.m(8388691, textView);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        float f = 12;
        int a2 = iah0.a(f);
        int a3 = iah0.a(40);
        int a4 = iah0.a(f);
        textView.setPadding(a2, a4, a3, a4);
        return textView;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    default View e(Context context) {
        View view = new View(context);
        u7.getClass();
        view.setBackground((Drawable) a.c.getValue());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(100)));
        f4m.m(8388695, view);
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    default rud0 f(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.discover_card_badge_container);
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        float f = 4;
        bwt0.f0(constraintLayout, iah0.a(f), 0, 0, 0, 14);
        constraintLayout.setBackground(dhr0.t.b(R.drawable.recommendations_carousel_badge_bg, R.attr.vk_ui_overlay_primary));
        VkMiniUserStack vkMiniUserStack = new VkMiniUserStack(context, null, 6);
        vkMiniUserStack.setId(R.id.discover_card_badge_avatar);
        vkMiniUserStack.setLayoutParams(new ConstraintLayout.b(-2, -2));
        bwt0.e0(vkMiniUserStack, iah0.a(f), iah0.a(f), iah0.a(6), iah0.a(f));
        VkText vkText = new VkText(context, null, 6, 0);
        vkText.setId(R.id.discover_card_badge_title);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        float f2 = 8;
        bVar.setMarginEnd(iah0.a(f2));
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = iah0.a(f);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = iah0.a(f);
        vkText.setLayoutParams(bVar);
        vkText.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vkText.setEllipsize(truncateAt);
        vkText.setTextAppearance(context, R.style.VkUiTypography_FootnoteMedium);
        vkText.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, context));
        constraintLayout.addView(vkMiniUserStack);
        constraintLayout.addView(vkText);
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        bVar2.i(constraintLayout);
        bVar2.k(vkMiniUserStack.getId(), 6, 0, 6);
        bVar2.k(vkMiniUserStack.getId(), 3, 0, 3);
        bVar2.k(vkMiniUserStack.getId(), 4, 0, 4);
        bVar2.k(vkMiniUserStack.getId(), 7, vkText.getId(), 6);
        bVar2.k(vkText.getId(), 6, vkMiniUserStack.getId(), 7);
        bVar2.k(vkText.getId(), 3, 0, 3);
        bVar2.k(vkText.getId(), 4, 0, 4);
        bVar2.k(vkText.getId(), 7, 0, 7);
        bVar2.b(constraintLayout);
        xzq0 xzq0Var = new xzq0(constraintLayout, vkMiniUserStack, vkText);
        VkText vkText2 = new VkText(context, null, 6, 0);
        vkText2.setId(R.id.discover_user_name);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.setMarginEnd(iah0.a(f2));
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = iah0.a(f);
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = iah0.a(f);
        vkText2.setLayoutParams(bVar3);
        vkText2.setMaxLines(1);
        vkText2.setEllipsize(truncateAt);
        vkText2.setTextAppearance(context, R.style.VkUiTypography_Headline1);
        vkText2.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, context));
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setId(R.id.video_single_clip_button);
        vkButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        vkButton.setSize(VkButton.Size.Small);
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.setText(R.string.discover_newsfeed_open_profile);
        int a2 = iah0.a(f);
        bwt0.f0(vkButton, 0, a2, 0, a2, 5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.discover_profile_container);
        linearLayout.setOrientation(1);
        u7.getClass();
        linearLayout.setBackground((Drawable) a.d.getValue());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        float f3 = 12;
        linearLayout.setPadding(iah0.a(f3), iah0.a(f2), iah0.a(f3), iah0.a(f2));
        linearLayout.addView(constraintLayout);
        linearLayout.addView(vkText2);
        linearLayout.addView(vkButton);
        return new rud0(linearLayout, xzq0Var, vkText2, vkButton);
    }
}
