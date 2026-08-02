package xsna;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: Styles.kt */
/* loaded from: classes16.dex */
public final class ktm0 {
    public static final void a(FrameLayout frameLayout) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = iah0.a(4);
        frameLayout.setLayoutParams(marginLayoutParams);
        frameLayout.setBackground(m33.a(R.drawable.highlight_radius_8_black, frameLayout.getContext()));
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
    }

    public static final void b(TextView textView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, textView.getContext().getResources().getDimensionPixelSize(R.dimen.clips_controls_btn_container_height));
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setTextAppearance(R.style.VkUiTypography_FootnoteCapsMedium);
        TypedValue typedValue = new TypedValue();
        textView.getContext().getTheme().resolveAttribute(R.attr.vk_ui_text_contrast, typedValue, true);
        textView.setTextColor(typedValue.data);
        textView.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, textView.getContext().getColor(R.color.vk_black_alpha12));
        textView.setGravity(80);
    }

    public static final void c(ImageView imageView) {
        int a = e3m.a(R.dimen.clips_controls_icon_size, imageView.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 1;
        layoutParams.topMargin = iah0.a(4);
        imageView.setLayoutParams(layoutParams);
        imageView.setBackground(m33.a(R.drawable.highlight_radius_8_black, imageView.getContext()));
        imageView.setClickable(true);
        imageView.setFocusable(true);
    }
}
