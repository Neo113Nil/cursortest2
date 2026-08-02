package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stickers.popup.PopupStickerView;
import com.vkontakte.android.R;

/* compiled from: StickerSimpleLongtapView.kt */
/* loaded from: classes6.dex */
public final class w6l0 extends FrameLayout implements e8l0 {
    public final ViewPager b;
    public final bbl0 c;
    public PopupStickerView d;

    public w6l0(Context context, boolean z) {
        super(context, null, 0);
        Drawable colorDrawable;
        setFocusable(false);
        setFocusableInTouchMode(false);
        if (z) {
            int Y = dhr0.Y(R.attr.vk_ui_background_content, context);
            colorDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{l8g.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Y), l8g.f(0.6f, Y), l8g.f(0.95f, Y)});
        } else {
            colorDrawable = new ColorDrawable(l8g.f(0.48f, dhr0.Y(R.attr.vk_ui_background_content, context)));
        }
        setBackground(colorDrawable);
        ViewPager viewPager = new ViewPager(context);
        this.b = viewPager;
        viewPager.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager.setOverScrollMode(2);
        t6g0 t6g0Var = t6g0.b;
        bbl0 bbl0Var = new bbl0(t6g0.d(), null, 2);
        this.c = bbl0Var;
        viewPager.setAdapter(bbl0Var);
        addView(viewPager);
    }

    @Override // xsna.e8l0
    public View getView() {
        return this;
    }
}
