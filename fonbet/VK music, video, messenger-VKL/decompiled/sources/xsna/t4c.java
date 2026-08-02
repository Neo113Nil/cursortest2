package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.vk.pin.views.dots.PinDotsView;
import com.vkontakte.android.R;

/* compiled from: CheckoutDot.kt */
/* loaded from: classes6.dex */
public final class t4c extends r5o {

    /* compiled from: CheckoutDot.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinDotsView.DotState.values().length];
            try {
                iArr[PinDotsView.DotState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinDotsView.DotState.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PinDotsView.DotState.Filled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.r5o
    public final Drawable a(PinDotsView.DotState dotState) {
        return krv0.e(a.$EnumSwitchMapping$0[dotState.ordinal()] == 1 ? R.drawable.vk_pay_checkout_pin_dot_background_idle : R.drawable.vk_pay_checkout_pin_dot_background_filled, getContext());
    }

    @Override // xsna.r5o
    public final int b(PinDotsView.DotState dotState) {
        int i = a.$EnumSwitchMapping$0[dotState.ordinal()];
        return i != 2 ? i != 3 ? R.attr.vk_legacy_button_primary_background_disabled : R.attr.vk_legacy_button_primary_background : R.attr.vk_legacy_destructive;
    }

    @Override // xsna.r5o
    public final void c(PinDotsView.DotState dotState) {
        int m = krv0.m(b(dotState), getContext());
        Drawable background = getBackground();
        background.mutate();
        background.setColorFilter(new PorterDuffColorFilter(m, PorterDuff.Mode.SRC_IN));
    }
}
