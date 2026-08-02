package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.scooters.utils.ScootersCompassRotatableFloatButton;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;
import ru.yandex.taxi.utils.AbsoluteSizeSpanFix;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public abstract class k1b1 {
    public static final SpannableStringBuilder a(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence instanceof String) {
            spannableStringBuilder.append(charSequence, new TextAppearanceSpan(context, u0i0.ScooterButtonTitleTextAppearance), 33);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (charSequence2 != null && !evu0.J(charSequence2)) {
            spannableStringBuilder.append((CharSequence) "\n");
            if (charSequence2 instanceof String) {
                spannableStringBuilder.append(charSequence2, new TextAppearanceSpan(context, u0i0.ScooterButtonSubtitleTextAppearance), 33);
                return spannableStringBuilder;
            }
            if (z) {
                spannableStringBuilder.append(charSequence2, new AbsoluteSizeSpanFix(tje.r(mrg0.component_text_size_caption, context), false), 33);
                return spannableStringBuilder;
            }
            spannableStringBuilder.append(charSequence2);
        }
        return spannableStringBuilder;
    }

    public static son0 b(SlideableBindingModalView slideableBindingModalView, ScootersCompassRotatableFloatButton scootersCompassRotatableFloatButton, Runnable runnable) {
        GoFrameLayout goFrameLayout = new GoFrameLayout(slideableBindingModalView.getContext(), null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        ScootersGeoButtonIconComponent scootersGeoButtonIconComponent = new ScootersGeoButtonIconComponent(slideableBindingModalView.getContext(), null, 0, 0, 14, null);
        scootersGeoButtonIconComponent.setDebounceClickListener(runnable);
        scootersGeoButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, scootersGeoButtonIconComponent.getContext())));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        goFrameLayout.addView(scootersGeoButtonIconComponent);
        goFrameLayout.addView(scootersCompassRotatableFloatButton, layoutParams);
        SlideableModalView.addViewAboveCard$default(slideableBindingModalView, goFrameLayout, 8388613, 0, 4, null);
        return new son0(scootersGeoButtonIconComponent, scootersCompassRotatableFloatButton);
    }

    public static final void f(ButtonComponent buttonComponent) {
        buttonComponent.setButtonTitleColor(new bdc(buttonComponent.isEnabled() ? xng0.textOnControl : xng0.textMain));
    }

    public abstract int c(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int d();

    public abstract ViewPropertyAnimator e(int i, View view);
}
