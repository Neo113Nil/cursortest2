package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: FinishView.kt */
/* loaded from: classes13.dex */
public final class khr extends LinearLayout implements pmv {
    public final LottieAnimationView b;

    public khr(Context context) {
        super(context, null, 0);
        setClickable(true);
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int a = gbg0.a(getResources(), 32.0f);
        setPadding(a, 0, a, 0);
        setGravity(17);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        int a2 = gbg0.a(lottieAnimationView.getResources(), 56.0f);
        lottieAnimationView.setLayoutParams(new ViewGroup.LayoutParams(a2, a2));
        lottieAnimationView.V(new udy("**"), t800.I, new a900(new upj0(context.getColor(R.color.vk_green))));
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setAnimation("check_circle_outline_56.json");
        this.b = lottieAnimationView;
        addView(lottieAnimationView);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(0, gbg0.a(appCompatTextView.getResources(), 12.0f), 0, 0);
        appCompatTextView.setLayoutParams(marginLayoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.users_discover_finish_title);
        appCompatTextView.setIncludeFontPadding(false);
        jno0.c(appCompatTextView, R.attr.vk_ui_text_primary);
        com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, Float.valueOf(20.0f), 4);
        addView(appCompatTextView);
    }

    @Override // xsna.pmv
    public final void a() {
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView.f.m()) {
            return;
        }
        lottieAnimationView.m0();
    }
}
