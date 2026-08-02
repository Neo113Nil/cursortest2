package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: GiftsPromoButtonHolder.kt */
/* loaded from: classes5.dex */
public final class zzt extends RecyclerView.e0 {
    public static final /* synthetic */ int r = 0;
    public final mj0 l;
    public VKImageView m;
    public FrameLayout n;
    public TextView o;
    public final RippleDrawable p;
    public final com.vk.movika.sdk.base.ui.p q;

    public zzt(View view, AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow) {
        super(view);
        this.l = autoSuggestStickersPopupWindow;
        GradientDrawable gradientDrawable = new GradientDrawable();
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(0), gradientDrawable, new ColorDrawable(-1));
        this.p = rippleDrawable;
        Context context = e43.a;
        gradientDrawable.setCornerRadius(((context == null ? null : context).getResources().getDisplayMetrics().xdpi / 160) * 8.0f);
        gradientDrawable.setColor(krv0.l(R.attr.vk_ui_background_accent_themed));
        Context context2 = e43.a;
        rippleDrawable.setColor(ColorStateList.valueOf(e3m.f(android.R.attr.colorControlHighlight, context2 != null ? context2 : null)));
        TextView textView = this.o;
        if (textView != null) {
            textView.setTextAppearance(R.style.VkUiTypography_SubheadMedium);
        }
        this.q = new com.vk.movika.sdk.base.ui.p(8, new Ref$LongRef(), new gbh(this, 18));
    }
}
