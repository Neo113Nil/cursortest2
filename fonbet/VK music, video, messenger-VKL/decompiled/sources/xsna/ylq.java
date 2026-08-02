package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.stories.tool.view.NoOverlappingRenderingFrameLayout;
import com.vkontakte.android.R;

/* compiled from: FastShareItemView.kt */
/* loaded from: classes6.dex */
public final class ylq extends FrameLayout {
    public final VkAvatar b;
    public final TextView c;
    public final NoOverlappingRenderingFrameLayout d;

    public ylq(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        NoOverlappingRenderingFrameLayout noOverlappingRenderingFrameLayout = new NoOverlappingRenderingFrameLayout(getContext());
        noOverlappingRenderingFrameLayout.setClipChildren(false);
        float f = 40;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f), 81);
        float f2 = 8;
        layoutParams.bottomMargin = iah0.a(f2);
        noOverlappingRenderingFrameLayout.setLayoutParams(layoutParams);
        this.d = noOverlappingRenderingFrameLayout;
        VkAvatar vkAvatar = new VkAvatar(getContext(), null, 6, 0);
        vkAvatar.setId(R.id.fast_share_popup_avatar);
        vkAvatar.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f)));
        this.b = vkAvatar;
        noOverlappingRenderingFrameLayout.addView(vkAvatar);
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) ((iah0.a(f2) + iah0.a(f)) * 1.5f), -2, 81);
        layoutParams2.bottomMargin = iah0.a(12) + iah0.a(f) + iah0.a(f2);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAppearance(e3m.g(R.attr.vk_ui_typography_caption1_medium, textView.getContext()));
        textView.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, textView.getContext()));
        textView.setShadowLayer(iah0.b(3.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.b(1.0f), textView.getContext().getColor(R.color.vk_black_alpha12));
        textView.setId(R.id.fast_share_popup_title);
        textView.setGravity(17);
        textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSingleLine();
        textView.setMarqueeRepeatLimit(-1);
        textView.setSelected(true);
        textView.setHorizontalFadingEdgeEnabled(true);
        textView.setFadingEdgeLength(iah0.a(6));
        this.c = textView;
        addView(textView);
        addView(noOverlappingRenderingFrameLayout);
    }

    public final VkAvatar getAvatar() {
        return this.b;
    }

    public final TextView getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(iah0.a(40), getMeasuredHeight());
    }
}
