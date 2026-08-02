package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.vk.pin.views.dots.PinDotsView;
import com.vkontakte.android.R;

/* compiled from: Dot.kt */
/* loaded from: classes3.dex */
public class r5o extends View implements too0 {
    public PinDotsView.DotState b;

    /* compiled from: Dot.kt */
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
                iArr[PinDotsView.DotState.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public r5o(Context context) {
        super(context, null, 0);
        this.b = PinDotsView.DotState.Idle;
    }

    @Override // xsna.too0
    public final void Ng() {
        c(this.b);
    }

    public Drawable a(PinDotsView.DotState dotState) {
        return krv0.e(a.$EnumSwitchMapping$0[dotState.ordinal()] == 1 ? R.drawable.pin_dot_background : R.drawable.pin_dot_background_filled, getContext());
    }

    public int b(PinDotsView.DotState dotState) {
        int i = a.$EnumSwitchMapping$0[dotState.ordinal()];
        return i != 2 ? i != 3 ? R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary : R.attr.vk_ui_icon_accent : R.attr.colorError;
    }

    public void c(PinDotsView.DotState dotState) {
        int m = krv0.m(b(dotState), getContext());
        if (a.$EnumSwitchMapping$0[dotState.ordinal()] != 1) {
            Drawable background = getBackground();
            background.mutate();
            background.setColorFilter(new PorterDuffColorFilter(m, PorterDuff.Mode.SRC_IN));
        } else {
            Drawable background2 = getBackground();
            GradientDrawable gradientDrawable = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(iah0.a(2), m);
            }
        }
    }
}
