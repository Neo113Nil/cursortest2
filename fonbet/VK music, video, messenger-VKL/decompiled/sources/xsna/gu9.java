package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: CardsDrawable.kt */
/* loaded from: classes17.dex */
public final class gu9 {
    public static d1x a(Context context) {
        d1x d1xVar = new d1x(context, hbh0.a(context, 12.0f), 0, (int) hbh0.a(context, 0.7f), 0);
        d1xVar.b(R.drawable.vk_bg_card_elevation16);
        d1xVar.a(e3m.f(R.attr.vk_ui_background_contrast_themed, context));
        d1xVar.setLayerInset(1, 0, 0, 0, 0);
        return d1xVar;
    }

    public static final Drawable b(int i, Context context) {
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_bg_card_elevation16_top, context);
        if (a == null) {
            return null;
        }
        a.mutate();
        a.setColorFilter(e3m.f(i, context), PorterDuff.Mode.MULTIPLY);
        return a;
    }

    public static final d1x c(int i, Context context) {
        d1x d1xVar = new d1x(context, hbh0.a(context, 12.0f), 0, (int) hbh0.a(context, 0.7f), 0);
        d1xVar.b(R.drawable.vk_bg_card_elevation8_cropped);
        d1xVar.a(e3m.f(i, context));
        d1xVar.setLayerInset(1, hbh0.b(8, context), hbh0.b(8, context), hbh0.b(8, context), hbh0.b(8, context));
        return d1xVar;
    }

    public static final Drawable d(Context context, Integer num) {
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(R.drawable.vk_bg_modal_bottom_sheet, context);
        if (a == null) {
            return null;
        }
        if (num != null) {
            a.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
        return a;
    }
}
